import java.io.*;
import java.util.*;
import java.util.jar.*;

// BETA 1
//import javax.pack.Pack200;

// BETA 2
import java.util.jar.Pack200;
import java.util.jar.Pack200.*;

public class TestPack200 {

  public static void main( String[] args) throws IOException {
    // BETA 1
    //Pack200 p200 = new Pack200();
    //Map p = p200.getProperties();
    //p.put(Pack200.PACK_EFFORT, "7");
    //p.put(Pack200.PACK_SEGMENT_LIMIT, "-1");
    //p.put(Pack200.PACK_KEEP_FILE_ORDER, Pack200.FALSE);
    //p.put(Pack200.PACK_MODIFICATION_TIME, Pack200.LATEST);
    //p.put(Pack200.PACK_DEFLATE_HINT, Pack200.FALSE);
    //p.put(Pack200.PACK_STRIP_DEBUG, Pack200.FALSE);
    //p.put(Pack200.PACK_UNKNOWN_ATTRIBUTE, Pack200.ERROR);

    // BETA 2
    Packer  p200 = Pack200.newPacker();
    Map p = p200.properties();
    p.put(Packer.EFFORT, "7");
    p.put(Packer.SEGMENT_LIMIT, "-1");
    p.put(Packer.KEEP_FILE_ORDER, Packer.FALSE);
    p.put(Packer.MODIFICATION_TIME, Packer.LATEST);
    p.put(Packer.DEFLATE_HINT, Packer.FALSE);
    //p.put(Packer.STRIP_DEBUG, Packer.FALSE);
    //p.put(Packer.UNKNOWN_ATTRIBUTE, Packer.ERROR);

    if( args.length<2 ){
       System.out.println("Pack200 syntax");
       System.out.println("Pack200 input_jar output_pack200");
       System.out.println("Pack200 -d input_pack200 output_jar");
       return;
    }

    if( !args[0].equalsIgnoreCase("-d") ){
       // pack
       JarFile jarFile = new JarFile( args[0] );
       FileOutputStream fos = new FileOutputStream( args[1] );
       p200.pack(jarFile, fos);
    } else {
       // unpack
       File f = new File( args[1] );
       FileOutputStream fostream = new FileOutputStream( args[2] );
       JarOutputStream jostream = new JarOutputStream(fostream);

       // BETA 1
       //p200.unpack(f, jostream);

       // BETA 2
       Unpacker unpacker = Pack200.newUnpacker();
       unpacker.unpack(f, jostream);

       jostream.close();
    }
  }
}
