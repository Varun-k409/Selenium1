describe('Login to cooey', function(){

    it('Testing login',function(){
    
         .get('https://test.portal.cooey.co.in/login');
         element(by.id('name')).sendKeys('test@cooey.co.in');
         element(by.id('password')).sendKeys('test1234!');
         element(by.className('login-button ant-btn ant-btn-primary ant-btn-round')).click();
    }); 
    browser.sleep('5000');
    var el= element(by.xpath('//*[text()=" Add Careplan "]'));
    var name=element(by.xpath('//*[@placeholder="Name"]'));
    var desc=element(by.xpath('//*[@placeholder="Description"]'));
    var days=element(by.xpath('//*[@placeholder="No of days"]'));
    var type=element(by.xpath('//*[text()="Choose Careplan Type"]'));
   // var ele10= element.all(by.className('ant-select-dropdown-menu-item ng-star-inserted'));
    //var tags=element(by.xpath('//*[text()="Form Tags"]'));
    var ele11=element.all(by.className('ant-select-dropdown-menu-item ng-star-inserted'));
    var save=element(by.xpath('//*[text()="Save"]'));
  
  
   it('care',function(){
    var ele1=element(by.className('anticon anticon-safety-certificate'));
    browser.actions().mouseMove(ele1).perform();
    browser.sleep(3000);
    var temp = element(by.xpath('//*[@href="/careplan-templates"]'));
    temp.click();
    browser.sleep(4000);
    browser.actions().click(el).perform();
    name.sendKeys('varun');
       desc.sendKeys('abc');
       days.sendKeys('10');
       type.click();
      // ele10.get(0).click();
      // tags.click();
      // ele11.get(0).click();
      // browser.sleep(2000);
        // browser.actions().sendKeys(protractor.Key.ESCAPE).perform();
    browser.sleep(2000);
       save.click();
       browser.sleep(5000);
      });
  browser.sleep(2000);
  
    it('Group',function()
    {
        browser.actions().click(el).perform();
        name.sendKeys('nilesh');
       desc.sendKeys('abc');
       days.sendKeys('9');
       type.click();
       ele10.get(1).click();
       tags.click();
       ele11.get(2).click();
       browser.sleep(2000);
       browser.actions().click(save).perform();
       browser.sleep(2000);
       element(by.xpath('//*[text()="Add Group"]')).click();
       browser.sleep(2000);
       element(by.xpath('//*[@placeholder="New Group Name"]')).sendKeys('Diabetics');
       element(by.xpath('//*[text()=" Cancel "]')).click();
browser.sleep(3000);
    });
it('caretakers',function(){
    element(by.className('anticon icon anticon-scissor ng-star-inserted')).click();
    browser.sleep(2000);
    element(by.buttonText('Add')).click();
    browser.sleep(3000);
    element(by.name('caretaker-first-name')).sendKeys('Varun');
    element(by.name('caretaker-last-name')).sendKeys('K');
    element(by.name('caretaker-username')).sendKeys('VarunK');
    element(by.name('caretaker-password')).sendKeys('12345');
    element(by.name('caretaker-email')).sendKeys('varunrajk057@gmail.com');
    element(by.xpath('//*[text()="Male"]')).click();
    element(by.xpath('//*[@href="/dashboard"]')).click();
        browser.sleep(3000);
});
it('Search',function(){
    element(by.className('anticon icon anticon-scissor ng-star-inserted')).click();
    browser.sleep(2000);
   element(by.xpath('//*[@placeholder="Search"]')).sendKeys('Raj');
   var search=element(by.className('anticon anticon-search ng-star-inserted'));
   browser.actions().click(search).perform();
   browser.sleep(3000);
});  
});   
