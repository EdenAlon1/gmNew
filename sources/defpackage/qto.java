package defpackage;

import com.bumptech.glide.load.ImageHeaderParser;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qto {
    public static int a(List list, InputStream inputStream, qxd qxdVar) {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new ree(inputStream, qxdVar);
        }
        inputStream.mark(5242880);
        return b(list, new qtg(inputStream, qxdVar));
    }

    public static int b(List list, qtm qtmVar) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int a = qtmVar.a((ImageHeaderParser) list.get(i));
            if (a != -1) {
                return a;
            }
        }
        return -1;
    }

    public static ImageHeaderParser.ImageType c(List list, ByteBuffer byteBuffer) {
        return byteBuffer == null ? ImageHeaderParser.ImageType.UNKNOWN : e(list, new qtd(byteBuffer));
    }

    public static ImageHeaderParser.ImageType d(List list, InputStream inputStream, qxd qxdVar) {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new ree(inputStream, qxdVar);
        }
        inputStream.mark(5242880);
        return e(list, new qtc(inputStream));
    }

    public static ImageHeaderParser.ImageType e(List list, qtn qtnVar) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ImageHeaderParser.ImageType a = qtnVar.a((ImageHeaderParser) list.get(i));
            if (a != ImageHeaderParser.ImageType.UNKNOWN) {
                return a;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    public static boolean f(List list, qtl qtlVar) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (qtlVar.a((ImageHeaderParser) list.get(i))) {
                return true;
            }
        }
        return false;
    }
}
