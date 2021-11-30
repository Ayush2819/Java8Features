package streamdemo;
import java.util.*;
import java.util.stream.*;

public class StreamExample6 {


private static List<MusicalInstrument> musicalInstruments=new ArrayList<>();
static {
musicalInstruments.add(new MusicalInstrument("Trumpet","brass",299.99));
musicalInstruments.add(new MusicalInstrument("Tuba","brass",1149.0));
musicalInstruments.add(new MusicalInstrument("Timpani","percussion",2339.0));
musicalInstruments.add(new MusicalInstrument("Snare drum","percussion",325.00));
musicalInstruments.add(new MusicalInstrument("Piano","keyboard",5179.99));
musicalInstruments.add(new MusicalInstrument("Trombone","brass",775.79));
}




public static void main(String[] args) {

System.out.println("****Musical Instruments in Collection****");

musicalInstruments.stream().forEach(i->System.out.println(i.getName()+" "+
i.getType()+" "+i.getPrice()));

System.out.println("Group Instruments by Type: ");

//map-data structure that saves value in key value pair
Map<String, List<MusicalInstrument>> typeMap=musicalInstruments.stream()
.collect(Collectors.groupingBy(MusicalInstrument::getType));

typeMap.forEach((key,value) -> {
System.out.println(key);
//value.forEach(System.out::println);
value.forEach(i->System.out.println(i.getName()+" "+i.getType()+" "+i.getPrice()));
});

System.out.println("****Partition Instruments by Price:****");
Map<Boolean, List<MusicalInstrument>> priceMap=musicalInstruments.stream()
.collect(Collectors.partitioningBy(mi->mi.getPrice()>500.0));



priceMap.forEach((key,value) -> {
System.out.println((key ? "Expensive":"Affordable"));
value.forEach(i->System.out.println(i.getName()+" "+i.getType()+" "+i.getPrice())); });



}



}