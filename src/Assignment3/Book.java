/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment3;

/**
 *
 * @author JAY YADAV
 */
public class Book {
  String Isbn;
  String Title;
  double price;

        public Book(String IsbnIn, String  TitleIn, double priceIn)
            {
                Isbn  = IsbnIn;
                Title = TitleIn;
                price = priceIn;
            }

        public String getIsbn()
            {
                return (Isbn);
            }

        public String getTitle()
            {
                return (Title);
            }

        public double getPrice()
            {
                return (price);
            }

        public void setBook(String IsbnIn, String  TitleIn, double priceIn)
            {
                Isbn = IsbnIn;
                Title = TitleIn;
                price = priceIn;
           }
}

