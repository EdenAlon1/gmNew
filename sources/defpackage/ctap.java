package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctap {
    private final Context j;
    private final fazb k;
    private final crmr l;
    private static final enru g = enru.c("com/google/android/apps/messaging/shared/util/image/ImageUtils");
    private static final byte[] h = "GIF87a".getBytes(Charset.forName("US-ASCII"));
    private static final byte[] i = "GIF89a".getBytes(Charset.forName("US-ASCII"));
    static final cfup a = cfvl.f(cfvl.b, "ditto_image_gif_size_limit", 800000);
    static final cfup b = cfvl.e(cfvl.b, "ditto_image_jpeg_width_limit", 600);
    static final cfup c = cfvl.e(cfvl.b, "ditto_image_jpeg_height_limit", 600);
    static final cfup d = cfvl.f(cfvl.b, "ditto_image_static_size_limit", 150000);
    static final cfup e = cfvl.e(cfvl.b, "ditto_image_png_height_limit", 400);
    static final cfup f = cfvl.e(cfvl.b, "ditto_image_png_width_limit", 400);

    public ctap(Context context, crmr crmrVar, fazb fazbVar) {
        this.j = context;
        this.l = crmrVar;
        this.k = fazbVar;
    }

    public static float a(int i2, int i3, int i4, int i5, int i6) {
        if (i2 < i4 && i3 < i5) {
            if (Math.min(i2, i3) < i6) {
                return i6 / Math.min(i2, i3);
            }
            return 1.0f;
        }
        float f2 = i4;
        float f3 = i5;
        float f4 = i2;
        float f5 = i3;
        return f2 / f3 < f4 / f5 ? f2 / f4 : f3 / f5;
    }

    public static Bitmap d(Bitmap bitmap) {
        return bitmap.copy(bitmap.getConfig() == null ? Bitmap.Config.ARGB_8888 : bitmap.getConfig(), false);
    }

    public static Bitmap f(Bitmap bitmap, int i2, int i3) {
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        float f2 = i3;
        float f3 = i2;
        float max = Math.max(f3 / width, f2 / height);
        float f4 = width * max;
        float f5 = max * height;
        float f6 = (f3 - f4) / 2.0f;
        float f7 = (f2 - f5) / 2.0f;
        RectF rectF = new RectF(f6, f7, f4 + f6, f5 + f7);
        Bitmap createBitmap = Bitmap.createBitmap(i2, i3, bitmap.getConfig());
        new Canvas(createBitmap).drawBitmap(bitmap, (Rect) null, rectF, (Paint) null);
        return createBitmap;
    }

    public static Drawable i(Context context, int i2, int i3) {
        Drawable drawable = context.getDrawable(i2);
        drawable.getClass();
        return j(context, drawable, i3);
    }

    public static Drawable j(Context context, Drawable drawable, int i2) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        Drawable mutate = constantState != null ? constantState.newDrawable(context.getResources()).mutate() : null;
        if (mutate != null || (mutate = drawable.mutate()) != null) {
            drawable = mutate;
        }
        drawable.setColorFilter(i2, PorterDuff.Mode.SRC_ATOP);
        return drawable;
    }

    public static void l(Point point, int i2, int i3, int i4) {
        if (point.x == -1 || point.x == 0) {
            point.x = i2;
        }
        if (point.y == -1 || point.y == 0) {
            point.y = i3;
        }
        float max = Math.max(1.0f, i4 / Math.min(point.x, point.y));
        point.x = (int) (point.x * max);
        point.y = (int) (point.y * max);
        float a2 = a(point.x, point.y, i2, i3, i4);
        if (a2 < 1.0f) {
            point.x = Math.min((int) (point.x * a2), i2);
            point.y = Math.min((int) (point.y * a2), i3);
        }
        if (point.y < i4) {
            point.y = i4;
        }
        if (point.x < i4) {
            point.x = i4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if (java.util.Arrays.equals(r2, defpackage.ctap.i) != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m(java.io.InputStream r4) {
        /*
            r0 = 0
            if (r4 == 0) goto L2b
            r1 = 6
            byte[] r2 = new byte[r1]     // Catch: java.lang.Throwable -> L23 java.io.IOException -> L28
            int r3 = r4.read(r2, r0, r1)     // Catch: java.lang.Throwable -> L23 java.io.IOException -> L28
            if (r3 != r1) goto L1f
            byte[] r1 = defpackage.ctap.h     // Catch: java.lang.Throwable -> L23 java.io.IOException -> L28
            boolean r1 = java.util.Arrays.equals(r2, r1)     // Catch: java.lang.Throwable -> L23 java.io.IOException -> L28
            r3 = 1
            if (r1 != 0) goto L1d
            byte[] r1 = defpackage.ctap.i     // Catch: java.lang.Throwable -> L23 java.io.IOException -> L28
            boolean r1 = java.util.Arrays.equals(r2, r1)     // Catch: java.lang.Throwable -> L23 java.io.IOException -> L28
            if (r1 == 0) goto L28
        L1d:
            r0 = r3
            goto L28
        L1f:
            r4.close()     // Catch: java.io.IOException -> L2b
            goto L2b
        L23:
            r0 = move-exception
            r4.close()     // Catch: java.io.IOException -> L27
        L27:
            throw r0
        L28:
            r4.close()     // Catch: java.io.IOException -> L2b
        L2b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ctap.m(java.io.InputStream):boolean");
    }

    public static void s(Bitmap bitmap, Canvas canvas, RectF rectF, RectF rectF2, boolean z, int i2, boolean z2) {
        BitmapShader bitmapShader = new BitmapShader(bitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
        Matrix matrix = new Matrix();
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        bitmapShader.setLocalMatrix(matrix);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        if (z) {
            paint.setColor(i2);
            if (z2) {
                canvas.drawCircle(rectF2.centerX(), rectF2.centerX(), rectF2.width() / 2.0f, paint);
            } else {
                canvas.drawColor(i2);
            }
        }
        paint.setShader(bitmapShader);
        if (z2) {
            canvas.drawCircle(rectF2.centerX(), rectF2.centerX(), rectF2.width() / 2.0f, paint);
        } else {
            canvas.drawBitmap(bitmap, matrix, paint);
        }
        paint.setShader(null);
    }

    private static boolean t(String str) {
        return le.p(str) || le.k(str);
    }

    public final int b(InputStream inputStream) {
        int i2 = 0;
        if (inputStream == null) {
            return 0;
        }
        try {
            try {
                i2 = new lig(inputStream).c("Orientation", 0);
                try {
                    inputStream.close();
                } catch (IOException e2) {
                    ensk i3 = g.i();
                    i3.Y(ente.a, "BugleImage");
                    ((enrr) ((enrr) ((enrr) i3).g(e2)).h("com/google/android/apps/messaging/shared/util/image/ImageUtils", "getOrientation", (char) 314, "ImageUtils.java")).q("getOrientation error closing input stream");
                }
            } catch (IOException | ArrayIndexOutOfBoundsException | NegativeArraySizeException | NullPointerException unused) {
                ensk e3 = g.e();
                e3.Y(ente.a, "BugleImage");
                ((enrr) ((enrr) e3).h("com/google/android/apps/messaging/shared/util/image/ImageUtils", "getOrientation", 309, "ImageUtils.java")).q("ImageUtils: Failed to get image orientation, returning undefined.");
                try {
                    inputStream.close();
                } catch (IOException e4) {
                    ensk i4 = g.i();
                    i4.Y(ente.a, "BugleImage");
                    ((enrr) ((enrr) ((enrr) i4).g(e4)).h("com/google/android/apps/messaging/shared/util/image/ImageUtils", "getOrientation", (char) 314, "ImageUtils.java")).q("getOrientation error closing input stream");
                }
            }
            return i2;
        } finally {
        }
    }

    public final int c(Uri uri, String str) {
        if (str == null) {
            return 0;
        }
        try {
            if (t(str)) {
                return b(this.j.getContentResolver().openInputStream(uri));
            }
            return 0;
        } catch (FileNotFoundException e2) {
            ensk i2 = g.i();
            i2.Y(ente.a, "BugleImage");
            enrr enrrVar = (enrr) ((enrr) i2).g(e2);
            enrrVar.Y(csux.X, uri);
            ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/util/image/ImageUtils", "getOrientation", 289, "ImageUtils.java")).q("getOrientation couldn't open uri.");
            return 0;
        }
    }

    public final Bitmap e(Uri uri, int i2, int i3) {
        ctee cteeVar = new ctee(this.j);
        try {
            cteeVar.c(uri);
            Bitmap a2 = cteeVar.a(0L);
            if (a2 == null) {
                a2 = null;
            } else {
                int width = a2.getWidth();
                int height = a2.getHeight();
                if (i3 <= 0) {
                    i3 = 250;
                }
                if (i2 <= 0) {
                    i2 = 250;
                }
                if (width > i2 || height > i3) {
                    int min = Math.min(width, i2);
                    int min2 = Math.min(height, i3);
                    float width2 = a2.getWidth();
                    float height2 = a2.getHeight();
                    float max = Math.max(min / width2, min2 / height2);
                    float f2 = width2 * max;
                    float f3 = max * height2;
                    Bitmap createBitmap = Bitmap.createBitmap((int) f2, (int) f3, a2.getConfig());
                    new Canvas(createBitmap).drawBitmap(a2, (Rect) null, new RectF(0.0f, 0.0f, f2, f3), (Paint) null);
                    if (createBitmap != null) {
                        a2.recycle();
                        a2 = createBitmap;
                    }
                }
            }
            return a2;
        } finally {
            cteeVar.b();
        }
    }

    public final Rect g(byte[] bArr) {
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            return new Rect(0, 0, options.outWidth, options.outHeight);
        } catch (OutOfMemoryError e2) {
            ensk j = g.j();
            j.Y(ente.a, "BugleImage");
            ((enrr) ((enrr) ((enrr) j).g(e2)).h("com/google/android/apps/messaging/shared/util/image/ImageUtils", "decodeImageBounds", (char) 649, "ImageUtils.java")).q("Failed to decode image bounds.");
            return new Rect(0, 0, -1, -1);
        }
    }

    public final Rect h(Uri uri, String str) {
        if (uri == null) {
            csix.c("Couldn't open input stream for null uri");
        } else {
            try {
                InputStream openInputStream = this.j.getContentResolver().openInputStream(uri);
                if (openInputStream != null) {
                    try {
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = true;
                        BitmapFactory.decodeStream(openInputStream, null, options);
                        if (str != null && t(str) && c(uri, str) >= 5) {
                            return new Rect(0, 0, options.outHeight, options.outWidth);
                        }
                        Rect rect = new Rect(0, 0, options.outWidth, options.outHeight);
                        try {
                            openInputStream.close();
                        } catch (IOException unused) {
                        }
                        return rect;
                    } finally {
                        try {
                            openInputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                }
            } catch (FileNotFoundException | SecurityException e2) {
                ensk i2 = g.i();
                i2.Y(ente.a, "BugleImage");
                enrr enrrVar = (enrr) ((enrr) i2).g(e2);
                enrrVar.Y(csux.X, uri);
                ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/util/image/ImageUtils", "decodeImageBounds", 686, "ImageUtils.java")).q("Couldn't open input stream.");
            }
        }
        return new Rect(0, 0, -1, -1);
    }

    public final ctan k(String str, Uri uri, Uri uri2) {
        if (!n(str, uri)) {
            return le.p(str) ? new ctan(new ctao(((Integer) b.e()).intValue(), ((Integer) c.e()).intValue(), ((Long) d.e()).longValue()), uri, Bitmap.CompressFormat.JPEG) : new ctan(new ctao(((Integer) f.e()).intValue(), ((Integer) e.e()).intValue(), ((Long) d.e()).longValue()), uri, Bitmap.CompressFormat.PNG);
        }
        ctao ctaoVar = new ctao(-1, -1, ((Long) a.e()).longValue());
        if (uri2 == null || !csuu.v(uri2)) {
            uri2 = null;
        }
        return new ctan(ctaoVar, uri2, null);
    }

    public final boolean n(String str, Uri uri) {
        if (le.j(str)) {
            return true;
        }
        if (!le.n(str) || uri == null) {
            return false;
        }
        try {
            return m(this.j.getContentResolver().openInputStream(uri));
        } catch (Exception e2) {
            ensk j = g.j();
            j.Y(ente.a, "BugleImage");
            ((enrr) ((enrr) ((enrr) j).g(e2)).h("com/google/android/apps/messaging/shared/util/image/ImageUtils", "isGif", (char) 332, "ImageUtils.java")).q("Could not open GIF input stream.");
            return false;
        }
    }

    public final byte[] o(Bitmap bitmap, int i2) {
        return p(bitmap, Bitmap.CompressFormat.JPEG, i2);
    }

    final byte[] p(Bitmap bitmap, Bitmap.CompressFormat compressFormat, int i2) {
        if (bitmap == null) {
            return null;
        }
        int i3 = 0;
        while (true) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmap.compress(compressFormat, i2, byteArrayOutputStream);
                return byteArrayOutputStream.toByteArray();
            } catch (OutOfMemoryError e2) {
                enru enruVar = g;
                ensk j = enruVar.j();
                j.Y(ente.a, "BugleImage");
                ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/util/image/ImageUtils", "bitmapToBytes", 164, "ImageUtils.java")).q("OutOfMemory converting bitmap to bytes.");
                i3++;
                if (i3 > 1) {
                    ensk j2 = enruVar.j();
                    j2.Y(ente.a, "BugleImage");
                    ((enrr) ((enrr) j2).h("com/google/android/apps/messaging/shared/util/image/ImageUtils", "bitmapToBytes", 169, "ImageUtils.java")).q("Failed to convert bitmap to bytes. Out of Memory.");
                    throw e2;
                }
                this.l.a(15, 1);
            }
        }
    }

    public final byte[] q(int i2, int i3, int i4, int i5, long j, Uri uri, String str) {
        ctam ctamVar = (ctam) this.k.b();
        byte[] b2 = n(str, uri) ? ((ctak) ctamVar.d.b()).b(uri, i2, i3, j) : ((ctas) ctamVar.c.b()).b(uri, i4, i5, j);
        if (b2 == null) {
            ensk j2 = ctam.a.j();
            j2.Y(ente.a, "BugleResizing");
            ((enrr) ((enrr) j2).h("com/google/android/apps/messaging/shared/util/image/ImageResizer", "resize", 71, "ImageResizer.java")).N("Cannot resize image. type: %s, originalWidth: %d, originalHeight: %d, widthLimit: %d, heightLimit: %d, byteLimit: %d, uri: %s.", str, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Long.valueOf(j), cskw.a(uri));
            return b2;
        }
        ensk h2 = ctam.a.h();
        h2.Y(ente.a, "BugleResizing");
        ((enrr) ((enrr) h2).h("com/google/android/apps/messaging/shared/util/image/ImageResizer", "resize", 83, "ImageResizer.java")).O("Resized image. type: %s, originalWidth: %d, originalHeight: %d, widthLimit: %d, heightLimit: %d, byteLimit: %d, bytesLength: %d, uri: %s.", str, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Long.valueOf(j), Integer.valueOf(b2.length), cskw.a(uri));
        return b2;
    }

    public final byte[] r(String str, Uri uri, Uri uri2, int i2, int i3) {
        byte[] p;
        ctan k = k(str, uri, uri2);
        ctao ctaoVar = k.a;
        Uri uri3 = k.b;
        if (uri3 == null) {
            return null;
        }
        ctam ctamVar = (ctam) this.k.b();
        int i4 = ctaoVar.a;
        int i5 = ctaoVar.b;
        long j = ctaoVar.c;
        Bitmap.CompressFormat compressFormat = k.c;
        if (n(str, uri3)) {
            p = ((ctak) ctamVar.d.b()).b(uri3, i2, i3, j);
        } else {
            compressFormat.getClass();
            p = p(((ctas) ctamVar.c.b()).a(uri3, i4, i5), compressFormat, ((Integer) ctam.b.e()).intValue());
        }
        if (p == null) {
            ensk j2 = ctam.a.j();
            j2.Y(ente.a, "BugleResizing");
            ((enrr) ((enrr) j2).h("com/google/android/apps/messaging/shared/util/image/ImageResizer", "scale", 131, "ImageResizer.java")).N("Cannot scale image. type: %s, originalWidth: %d, originalHeight: %d, widthLimit: %d, heightLimit: %d, byteLimit: %d, uri: %s.", str, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Long.valueOf(j), cskw.a(uri3));
            return p;
        }
        ensk h2 = ctam.a.h();
        h2.Y(ente.a, "BugleResizing");
        ((enrr) ((enrr) h2).h("com/google/android/apps/messaging/shared/util/image/ImageResizer", "scale", 143, "ImageResizer.java")).O("Scaled image. type: %s, originalWidth: %d, originalHeight: %d, widthLimit: %d, heightLimit: %d, byteLimit: %d, bytesLength: %d, uri: %s.", str, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Long.valueOf(j), Integer.valueOf(p.length), cskw.a(uri3));
        return p;
    }
}
