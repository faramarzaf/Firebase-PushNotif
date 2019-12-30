# Firebase-PushNotif   

Before digging into the details of how to send Firebase push notification in Android using Firebase cloud messaging, it is useful to clarify what is push notification. For example, through push notification, our app can notify a user of new events. This happens even if the Android app is not working in the foreground. Using this service, we can send data from our server to our app whenever a new event occurs.   

**Setup**  

In top level gradle file

```gradle
        classpath 'com.google.gms:google-services:4.0.1'
```

In module gradle file  

```gradle
//Add Firebase Core//
implementation 'com.google.firebase:firebase-core:16.0.1'
//Add FCM//
implementation 'com.google.firebase:firebase-messaging:17.3.4'
    
```

End of module gradle file    
```gradle
apply plugin: 'com.google.gms.google-services'
```
