package defpackage;

import android.graphics.Bitmap;
import android.graphics.Matrix;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cstz {
    public static final entd a = entd.c("BugleImage");

    public static Bitmap a(Bitmap bitmap, int i) {
        Bitmap bitmap2;
        Matrix matrix = new Matrix();
        switch (i) {
            case 2:
                matrix.setScale(-1.0f, 1.0f);
                break;
            case 3:
                matrix.setRotate(180.0f);
                break;
            case 4:
                matrix.setRotate(180.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 5:
                matrix.setRotate(90.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 6:
                matrix.setRotate(90.0f);
                break;
            case 7:
                matrix.setRotate(-90.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 8:
                matrix.setRotate(-90.0f);
                break;
            default:
                return bitmap;
        }
        try {
            bitmap2 = bitmap;
            try {
                Bitmap createBitmap = Bitmap.createBitmap(bitmap2, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                if (createBitmap != bitmap2) {
                    bitmap2.recycle();
                }
                return createBitmap;
            } catch (OutOfMemoryError e) {
                e = e;
                ((ensz) ((ensz) ((ensz) a.i()).g(e)).h("com/google/android/apps/messaging/shared/util/exif/JpegUtil", "rotateBitmap", '`', "JpegUtil.java")).q("Failed to rotate bitmap.");
                return bitmap2;
            }
        } catch (OutOfMemoryError e2) {
            e = e2;
            bitmap2 = bitmap;
        }
    }
}
