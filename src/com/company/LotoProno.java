package com.company;
//created by Simona mai 2016
import com.sun.org.apache.xpath.internal.SourceTree;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class LotoProno {
    public static void main(String[] args) {
        int ntries = 0;//numara variantele generate
        int cateamghicit = 0;//numara cate numere se ghicesc

            // the lotto machine and init it
        Random lottoMachine = new Random();
        lottoMachine.setSeed(System.currentTimeMillis());

            // generate the lotto numbers
        System.out.println("numerele Loto:");
        Set setofSix = null;
        setofSix = new HashSet<Integer>();
        int counter = 0;
        do {
            int nr = lottoMachine.nextInt(49) + 1;
            boolean success = setofSix.add(nr);
            if (success) { // nr not already in the set
                counter++;
                System.out.print(nr + ":");
            }
        }
        while (counter < 6);
        System.out.println();

        ntries++;
        System.out.println("numerele jucate - varianta:" + ntries);

        Set myset = mysetofSix();

        do {
                // COMPARA setofSix CU myOwnTicketOfSix
            Set<Integer> comparare = new HashSet<>(myset);
            comparare.retainAll(setofSix);
            System.out.println();
            System.out.println("am ghicit " + comparare.size() + " numere");
            cateamghicit = comparare.size();
                //verifica daca am castigat
            if (cateamghicit==3) System.out.println("ati castigat la categria IV");
            else

                if (cateamghicit==4) System.out.println("ati castigat la categria V");
                    else
                    if (cateamghicit==5) System.out.println("ati castigat la categria VI");
                        else
                        if (cateamghicit==6) System.out.println("ati castigat marele premiu");
                            else
                        {
                           myset= mysetofSix();//generam alt bilet/varianta
                            ntries++;}//marim counterul de variante generate

        }
        while (cateamghicit < 3);
        System.out.println("ai jucat: " + ntries + "variante");
    }
    //generam variante de bilete
        public static Set<Integer> mysetofSix() {
            // ALTE 6 PENTRU BILETUL MEU
            Random lottoMachine = new Random();
            lottoMachine.setSeed(System.currentTimeMillis());

            Set myset = null;
            myset = new HashSet<Integer>();
            int mycounter = 0;

            do {
                int nr = lottoMachine.nextInt(49) + 1;
                boolean success = myset.add(nr);
                if (success) { // nr not already in the set
                    mycounter++;
                    System.out.print(nr + ":");
                }
            }
            while (mycounter < 6);

            return myset;
        }


    }



