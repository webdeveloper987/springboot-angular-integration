# springboot-angular-integration
SpringBoot and Angular integration PoC

In order to have both client and backend deployed on the same server, it is needed to modify **.angular-cli.json** file in **springboot-angular-client** folder:

Replace line:   
**"outDir": "dist"**  
  
with:   
**"outDir": "../springboot-angular-demo/src/main/resources/static"**  

**ng build** required before deplyoment.

(Note that this works for Angular 2+ projects generated in Angular CLI tool, for Angular 2+ projects not created by Angular CLI tool, the outDir is edited in tsconfig.json file )


