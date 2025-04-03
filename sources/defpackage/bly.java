package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Rational;
import androidx.camera.core.ImageProcessingUtil;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bly {
    public static Bitmap a(avr avrVar) {
        int a = avrVar.a();
        if (a == 1) {
            Bitmap createBitmap = Bitmap.createBitmap(avrVar.c(), avrVar.b(), Bitmap.Config.ARGB_8888);
            avrVar.f()[0].c().rewind();
            ImageProcessingUtil.a(createBitmap, avrVar.f()[0].c(), avrVar.f()[0].b());
            return createBitmap;
        }
        if (a == 35) {
            int i = ImageProcessingUtil.a;
            if (avrVar.a() != 35) {
                throw new IllegalArgumentException("Input image format must be YUV_420_888");
            }
            int c = avrVar.c();
            int b = avrVar.b();
            int b2 = avrVar.f()[0].b();
            int b3 = avrVar.f()[1].b();
            int b4 = avrVar.f()[2].b();
            int a2 = avrVar.f()[0].a();
            int a3 = avrVar.f()[1].a();
            Bitmap createBitmap2 = Bitmap.createBitmap(avrVar.c(), avrVar.b(), Bitmap.Config.ARGB_8888);
            if (ImageProcessingUtil.nativeConvertAndroid420ToBitmap(avrVar.f()[0].c(), b2, avrVar.f()[1].c(), b3, avrVar.f()[2].c(), b4, a2, a3, createBitmap2, createBitmap2.getRowBytes(), c, b) == 0) {
                return createBitmap2;
            }
            throw new UnsupportedOperationException("YUV to RGB conversion failed");
        }
        if (a != 256 && a != 4101) {
            throw new IllegalArgumentException("Incorrect image format of the input image proxy: " + avrVar.a() + ", only ImageFormat.YUV_420_888 and PixelFormat.RGBA_8888 are supported");
        }
        if (!d(avrVar.a())) {
            throw new IllegalArgumentException("Incorrect image format of the input image proxy: " + avrVar.a());
        }
        ByteBuffer c2 = avrVar.f()[0].c();
        int capacity = c2.capacity();
        byte[] bArr = new byte[capacity];
        c2.rewind();
        c2.get(bArr);
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, capacity, null);
        if (decodeByteArray != null) {
            return decodeByteArray;
        }
        throw new UnsupportedOperationException("Decode jpeg byte array failed");
    }

    public static Rational b(int i, Rational rational) {
        if (i != 90 && i != 270) {
            return new Rational(rational.getNumerator(), rational.getDenominator());
        }
        if (rational == null) {
            return null;
        }
        return new Rational(rational.getDenominator(), rational.getNumerator());
    }

    public static boolean c(Rational rational) {
        return (rational == null || rational.floatValue() <= 0.0f || rational.isNaN()) ? false : true;
    }

    public static boolean d(int i) {
        return i == 256 || i == 4101;
    }

    public static boolean e(int i) {
        return i == 32;
    }
}
