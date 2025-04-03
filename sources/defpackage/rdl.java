package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.DisplayMetrics;
import com.bumptech.glide.load.ImageHeaderParser;
import j$.util.DesugarCollections;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rdl {
    public static final qtt a = new qtt("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", qsz.c, qtt.a);
    public static final qtt b = new qtt("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace", null, qtt.a);
    public static final qtt c;
    public static final qtt d;
    public static final rdk e;
    private static final Queue h;
    public final qxd f;
    public final List g;
    private final qxf i;
    private final DisplayMetrics j;
    private final rdv k = rdv.a();

    static {
        rdi rdiVar = rdi.b;
        c = new qtt("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", false, qtt.a);
        d = new qtt("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", false, qtt.a);
        DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        e = new rdj();
        DesugarCollections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));
        char[] cArr = rkh.a;
        h = new ArrayDeque(0);
    }

    public rdl(List list, DisplayMetrics displayMetrics, qxf qxfVar, qxd qxdVar) {
        this.g = list;
        rkf.f(displayMetrics);
        this.j = displayMetrics;
        rkf.f(qxfVar);
        this.i = qxfVar;
        rkf.f(qxdVar);
        this.f = qxdVar;
    }

    private static int b(double d2) {
        if (d2 > 1.0d) {
            d2 = 1.0d / d2;
        }
        return (int) Math.round(d2 * 2.147483647E9d);
    }

    private static int c(double d2) {
        return (int) (d2 + 0.5d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:?, code lost:
    
        throw r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.graphics.Bitmap d(defpackage.rdz r9, android.graphics.BitmapFactory.Options r10, defpackage.rdk r11, defpackage.qxf r12) {
        /*
            java.lang.String r0 = "Downsampler"
            java.lang.String r1 = "Exception decoding bitmap, outWidth: "
            boolean r2 = r10.inJustDecodeBounds
            if (r2 != 0) goto Le
            r11.b()
            r9.d()
        Le:
            int r2 = r10.outWidth
            int r3 = r10.outHeight
            java.lang.String r4 = r10.outMimeType
            java.util.concurrent.locks.Lock r5 = defpackage.rek.c
            r5.lock()
            android.graphics.Bitmap r9 = r9.b(r10)     // Catch: java.lang.IllegalArgumentException -> L1e java.lang.Throwable -> L70
            goto L68
        L1e:
            r5 = move-exception
            java.io.IOException r6 = new java.io.IOException     // Catch: java.lang.Throwable -> L70
            java.lang.String r7 = g(r10)     // Catch: java.lang.Throwable -> L70
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L70
            r8.<init>(r1)     // Catch: java.lang.Throwable -> L70
            r8.append(r2)     // Catch: java.lang.Throwable -> L70
            java.lang.String r1 = ", outHeight: "
            r8.append(r1)     // Catch: java.lang.Throwable -> L70
            r8.append(r3)     // Catch: java.lang.Throwable -> L70
            java.lang.String r1 = ", outMimeType: "
            r8.append(r1)     // Catch: java.lang.Throwable -> L70
            r8.append(r4)     // Catch: java.lang.Throwable -> L70
            java.lang.String r1 = ", inBitmap: "
            r8.append(r1)     // Catch: java.lang.Throwable -> L70
            r8.append(r7)     // Catch: java.lang.Throwable -> L70
            java.lang.String r1 = r8.toString()     // Catch: java.lang.Throwable -> L70
            r6.<init>(r1, r5)     // Catch: java.lang.Throwable -> L70
            r1 = 3
            boolean r1 = android.util.Log.isLoggable(r0, r1)     // Catch: java.lang.Throwable -> L70
            if (r1 == 0) goto L58
            java.lang.String r1 = "Failed to decode with inBitmap, trying again without Bitmap re-use"
            android.util.Log.d(r0, r1, r6)     // Catch: java.lang.Throwable -> L70
        L58:
            android.graphics.Bitmap r0 = r10.inBitmap     // Catch: java.lang.Throwable -> L70
            if (r0 == 0) goto L6f
            android.graphics.Bitmap r0 = r10.inBitmap     // Catch: java.io.IOException -> L6e java.lang.Throwable -> L70
            r12.d(r0)     // Catch: java.io.IOException -> L6e java.lang.Throwable -> L70
            r0 = 0
            r10.inBitmap = r0     // Catch: java.io.IOException -> L6e java.lang.Throwable -> L70
            android.graphics.Bitmap r9 = d(r9, r10, r11, r12)     // Catch: java.io.IOException -> L6e java.lang.Throwable -> L70
        L68:
            java.util.concurrent.locks.Lock r10 = defpackage.rek.c
            r10.unlock()
            return r9
        L6e:
            throw r6     // Catch: java.lang.Throwable -> L70
        L6f:
            throw r6     // Catch: java.lang.Throwable -> L70
        L70:
            r9 = move-exception
            java.util.concurrent.locks.Lock r10 = defpackage.rek.c
            r10.unlock()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rdl.d(rdz, android.graphics.BitmapFactory$Options, rdk, qxf):android.graphics.Bitmap");
    }

    private static synchronized BitmapFactory.Options e() {
        BitmapFactory.Options options;
        synchronized (rdl.class) {
            Queue queue = h;
            synchronized (queue) {
                options = (BitmapFactory.Options) queue.poll();
            }
            if (options != null) {
                return options;
            }
            BitmapFactory.Options options2 = new BitmapFactory.Options();
            i(options2);
            return options2;
        }
    }

    private static String f(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        String str = " (" + bitmap.getAllocationByteCount() + ")";
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + String.valueOf(bitmap.getConfig()) + str;
    }

    private static String g(BitmapFactory.Options options) {
        return f(options.inBitmap);
    }

    private static void h(BitmapFactory.Options options) {
        i(options);
        Queue queue = h;
        synchronized (queue) {
            queue.offer(options);
        }
    }

    private static void i(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        options.inPreferredColorSpace = null;
        options.outColorSpace = null;
        options.outConfig = null;
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    private static boolean j(int i) {
        return i == 90 || i == 270;
    }

    private static boolean k(BitmapFactory.Options options) {
        return options.inTargetDensity > 0 && options.inDensity > 0 && options.inTargetDensity != options.inDensity;
    }

    private static int[] l(rdz rdzVar, BitmapFactory.Options options, rdk rdkVar, qxf qxfVar) {
        options.inJustDecodeBounds = true;
        d(rdzVar, options, rdkVar, qxfVar);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0358 A[Catch: all -> 0x050c, TryCatch #4 {all -> 0x050c, blocks: (B:36:0x02f2, B:38:0x02fe, B:39:0x0346, B:105:0x0352, B:107:0x0358, B:108:0x0360, B:115:0x0308, B:120:0x030e, B:122:0x0318, B:123:0x0336, B:125:0x033e, B:126:0x0334, B:118:0x0342, B:129:0x031c, B:131:0x0323), top: B:35:0x02f2, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x038a A[Catch: all -> 0x050f, TRY_LEAVE, TryCatch #7 {all -> 0x050f, blocks: (B:31:0x02c4, B:33:0x02ca, B:110:0x0372, B:112:0x038a, B:136:0x00f6, B:141:0x010c, B:143:0x0116, B:145:0x013d, B:146:0x0146, B:148:0x0150, B:150:0x0157, B:151:0x0158, B:153:0x015e, B:155:0x0179, B:156:0x01c3, B:158:0x01ee, B:160:0x01fa, B:162:0x0200, B:164:0x01f3, B:165:0x017c, B:167:0x0180, B:170:0x0185, B:172:0x018b, B:173:0x0199, B:175:0x019d, B:178:0x01a2, B:179:0x01a7, B:180:0x01b2, B:181:0x0142, B:182:0x027b, B:183:0x02bd), top: B:27:0x00e8 }] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0308 A[Catch: all -> 0x050c, TRY_LEAVE, TryCatch #4 {all -> 0x050c, blocks: (B:36:0x02f2, B:38:0x02fe, B:39:0x0346, B:105:0x0352, B:107:0x0358, B:108:0x0360, B:115:0x0308, B:120:0x030e, B:122:0x0318, B:123:0x0336, B:125:0x033e, B:126:0x0334, B:118:0x0342, B:129:0x031c, B:131:0x0323), top: B:35:0x02f2, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x033e A[Catch: all -> 0x050c, TryCatch #4 {all -> 0x050c, blocks: (B:36:0x02f2, B:38:0x02fe, B:39:0x0346, B:105:0x0352, B:107:0x0358, B:108:0x0360, B:115:0x0308, B:120:0x030e, B:122:0x0318, B:123:0x0336, B:125:0x033e, B:126:0x0334, B:118:0x0342, B:129:0x031c, B:131:0x0323), top: B:35:0x02f2, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00b6 A[Catch: all -> 0x0513, TryCatch #1 {all -> 0x0513, blocks: (B:7:0x006c, B:12:0x0094, B:13:0x009a, B:15:0x00ac, B:17:0x00b6, B:22:0x00c1, B:25:0x00cc, B:47:0x03d8, B:51:0x03f6, B:53:0x03fc, B:55:0x0402, B:57:0x0408, B:59:0x0412, B:60:0x041b, B:61:0x0417, B:62:0x0423, B:63:0x042e, B:100:0x03e3, B:102:0x03e9, B:103:0x03eb), top: B:6:0x006c }] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c1 A[Catch: all -> 0x0513, TryCatch #1 {all -> 0x0513, blocks: (B:7:0x006c, B:12:0x0094, B:13:0x009a, B:15:0x00ac, B:17:0x00b6, B:22:0x00c1, B:25:0x00cc, B:47:0x03d8, B:51:0x03f6, B:53:0x03fc, B:55:0x0402, B:57:0x0408, B:59:0x0412, B:60:0x041b, B:61:0x0417, B:62:0x0423, B:63:0x042e, B:100:0x03e3, B:102:0x03e9, B:103:0x03eb), top: B:6:0x006c }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x02ca A[Catch: all -> 0x050f, TRY_LEAVE, TryCatch #7 {all -> 0x050f, blocks: (B:31:0x02c4, B:33:0x02ca, B:110:0x0372, B:112:0x038a, B:136:0x00f6, B:141:0x010c, B:143:0x0116, B:145:0x013d, B:146:0x0146, B:148:0x0150, B:150:0x0157, B:151:0x0158, B:153:0x015e, B:155:0x0179, B:156:0x01c3, B:158:0x01ee, B:160:0x01fa, B:162:0x0200, B:164:0x01f3, B:165:0x017c, B:167:0x0180, B:170:0x0185, B:172:0x018b, B:173:0x0199, B:175:0x019d, B:178:0x01a2, B:179:0x01a7, B:180:0x01b2, B:181:0x0142, B:182:0x027b, B:183:0x02bd), top: B:27:0x00e8 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x02fe A[Catch: all -> 0x050c, TryCatch #4 {all -> 0x050c, blocks: (B:36:0x02f2, B:38:0x02fe, B:39:0x0346, B:105:0x0352, B:107:0x0358, B:108:0x0360, B:115:0x0308, B:120:0x030e, B:122:0x0318, B:123:0x0336, B:125:0x033e, B:126:0x0334, B:118:0x0342, B:129:0x031c, B:131:0x0323), top: B:35:0x02f2, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x034a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x03d4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x03f6 A[Catch: all -> 0x0513, TryCatch #1 {all -> 0x0513, blocks: (B:7:0x006c, B:12:0x0094, B:13:0x009a, B:15:0x00ac, B:17:0x00b6, B:22:0x00c1, B:25:0x00cc, B:47:0x03d8, B:51:0x03f6, B:53:0x03fc, B:55:0x0402, B:57:0x0408, B:59:0x0412, B:60:0x041b, B:61:0x0417, B:62:0x0423, B:63:0x042e, B:100:0x03e3, B:102:0x03e9, B:103:0x03eb), top: B:6:0x006c }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x04d7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0444 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.qwv a(defpackage.rdz r40, int r41, int r42, defpackage.qtu r43, defpackage.rdk r44) {
        /*
            Method dump skipped, instructions count: 1330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rdl.a(rdz, int, int, qtu, rdk):qwv");
    }
}
