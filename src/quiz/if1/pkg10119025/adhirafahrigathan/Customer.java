/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.if1.pkg10119025.adhirafahrigathan;

/**
 *
 * @author User
 */
public class Customer extends ServicePrice{
    
    private String name;
    private String email;
    private boolean member;
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getEmail(){
        return email;
    }
    
    public boolean isiMember(){
        return member;
    }
    
    public void setMember(boolean member){
        this.member = member;
    }
    
    public String currentTime(){
        return (java.util.Date date = new java.util.Date());
    }
}
