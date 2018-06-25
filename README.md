# CucumberFramework
CucumberFramework
I've chosen to use Eclipse as the IDE for my tests as I like how I can easily integrate this with Maven and pull in the cucumber jars I need, easily for testing.

To be honest I could have done a lot more work on this, but for a 1/2 hour project I thought it best not to overdo it! If I was working in the real world some further additional things I would do are:
1) Implement a Base class which would be used toinitialise and teardown my tests. I'd more than likely use a unit testing framework for this so I can annotate my tests(JUnit springs to mind)
2) I'd also introduce a web driver factory class so that I could easily pull out the browsers I want test against
3) I implemented a thread.sleep in my tests but in the real world I would add an Implicit Wait so that the DOM isn't paused

