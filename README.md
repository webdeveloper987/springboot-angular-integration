# springboot-angular-integration
SpringBoot and Angular integration PoC

In order to have both client and backend deployed on the same server, it is needed to modify **.angular-cli.json** file in **springboot-angular-client** folder:

Replace line:   
**"outDir": "dist"**  
  
with:   
**"outDir": "../springboot-angular-demo/src/main/resources/static"**  

**ng build** required before deplyoment.




