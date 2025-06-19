This is a spike for qute server components.

Qute server components are a way to bundle qute tags along with any JS / CSS that they may need, and is a useful alternative to defining tags in the Qute way.

There are 2 tags

1. hello : this is in resources/tags/hello.html
2. namaste : this is in resources/web/components/namaste

However, there is a difference between the way the tags are treated by Qute, which isn't obvious on causal reading, and not sure if its a bug or expected behavior.

What works:
As long as the template does not #{include } any othe template, repeating the tag works - as seen in http://localhost:8080/hello1

What doesn't work
If the template includes a layout {#include }, while the qute tags can be repeated, the tags defined in resources/web/components can't be repeated . This is seen in
http://localhost:8080/hello2
