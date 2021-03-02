package inf112.patterns.factory.writer;

import inf112.patterns.factory.reader.ImageReader;

public class PngImageWriter implements ImageWriter {

    @Override
    public void write(ImageReader in) {
        System.out.println("Writing the image as PNG");
        // Do the actual writing to file
    }
}
