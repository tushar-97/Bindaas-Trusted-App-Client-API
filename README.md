Bindaas Trusted App Client API
==============================

Trusted App Client API for Bindaas.
Using the Trusted App API , third-party applications can tap into Bindaas's internal security
system to manage API Keys for users. Typically, it allows for authorizing new user access,issuing short-lived API Keys
and revoking them.

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
