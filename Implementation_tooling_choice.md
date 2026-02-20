# Architecture Overview
- Mainly local, particularly for notes, stand-n-shake and unsynced news feed
- Connects to a server to update news feed 
- No login/username at this point (saves needing a secure database)

# Framework/Tooling choice 
## KMP
- KMP based in Kotlin (android focus) (bad)
- Tied to Intellij's enviornment (bad) 
- Unclear how cross-platform the code actually is (seems to imply you use jetpack compose and SwiftUI anyway)
### Verdict: No

## React 
- React native can act as both UI and business logic for our architecture at this point 
- Relatively good support 
- Good for all three platforms
### Verdict: Yes

## No code solution
- Eg Thunkable, bubble.io
- Tied to the host platofrm
- Don't own the code 
- Need a monthly subscription
- Company might go under in the future 
### Verdict: No

## Flutter/Dart
- Similar to react native benefits 
- Less strong for web than React 

### Verdict: Soft no

## PWA
- Simplest choice 
- Issues on iOS particularly
- Would likely need to migrate later for full app
- Struggles with accessing hardware features (like clock etc) 

### Verdict: No