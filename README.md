Bindaas Trusted App Client API
==============================


## Trusted Application Framework
Bindaas provides a framework for applications that are "trusted" by Bindaas to tap into Bindaas's internal sescurity system
and manage API Keys. 

Following operations are supported through Trusted Application API :
1. Authorize New User
2. Revoke Access of User
3. Issue Short Lived API Key.

Each Trusted Application is issued the following by the Bindaas's system-administrator :
1. application-id
2. application-secret

Using these two parameters and the cryptographic algorithm described below a Trusted Application asserts it's identity
and message integrity to Bindaas Server.

##### Algorithm :
 


## Command Line Options
```
> java -jar trusted-app-client-0.0.1-jar-with-dependencies.jar [options]

 -action <arg>     Action to be performed. Allowed values are :
                   a - authorize new user
                   r - revoke user
                   i - issue short-lived API Key
 -comments <arg>   comments. Optional
 -expires <arg>    Expiration Date. Must be specified with authorize new
                   user action in mm/dd/yyyy format
 -id <arg>         Application ID
 -lifetime <arg>   lifetime of the short-lived API Key in seconds.
                   Optional
 -secret <arg>     Application Secret
 -url <arg>        Base URL of the service
 -username <arg>   Username
```
#### Authorize New User

```
java -jar trusted-app-client-0.0.1-jar-with-dependencies.jar -action a -username test-user-1 -id demo-id -secret demo-secret-key -comments 'Testing new Account' -expires 12/31/2060 -url http://localhost:9099/trustedApplication
```

#### Revoking User Access

```
java -jar trusted-app-client-0.0.1-jar-with-dependencies.jar -action r -username test-user-1 -id demo-id -secret demo-secret-key  -comments 'Removing new Account' -url http://localhost:9099/trustedApplication
```

#### Issue Short Lived API-Key 
```
java -jar trusted-app-client-0.0.1-jar-with-dependencies.jar -action i -username test-user-1 -id demo-id -secret demo-secret-key -lifetime 36000 -url http://localhost:9099/trustedApplication
```
