package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctas {
    private static final enru a = enru.c("com/google/android/apps/messaging/shared/util/image/StaticImageCompressor");
    private int b = ((Integer) ctal.f.e()).intValue();
    private final int c = ((Integer) ctal.h.e()).intValue();
    private int d = ((Integer) ctal.g.e()).intValue();
    private final int e = ((Integer) ctal.a.e()).intValue();
    private final int f = ((Integer) ctal.b.e()).intValue();
    private final double g = ((Double) ctal.c.e()).doubleValue();
    private final double h = ((Double) ctal.d.e()).doubleValue();
    private final int i = ((Integer) ctal.e.e()).intValue();
    private final ctap j;
    private final qqs k;
    private final albq l;
    private final akzt m;
    private final ctcd n;
    private final cqoh o;
    private final csuu p;
    private final ctax q;
    private final ffbr r;

    public ctas(Context context, ctap ctapVar, albq albqVar, akzt akztVar, ctcd ctcdVar, cqoh cqohVar, csuu csuuVar, ctax ctaxVar, ffbr ffbrVar) {
        this.j = ctapVar;
        this.k = qpt.c(context);
        this.l = albqVar;
        this.m = akztVar;
        this.n = ctcdVar;
        this.o = cqohVar;
        this.p = csuuVar;
        this.q = ctaxVar;
        this.r = ffbrVar;
    }

    private final Bitmap c(Uri uri, int i, int i2, long j) {
        long a2 = this.o.a();
        try {
            return (Bitmap) this.k.b().i(uri).q(((rig) new rig().V(rcn.a, Integer.valueOf(this.f))).z()).t(i, i2).get();
        } catch (InterruptedException | ExecutionException e) {
            ensk j2 = a.j();
            j2.Y(ente.a, "BugleResizing");
            enrr enrrVar = (enrr) ((enrr) j2).g(e);
            enrrVar.Y(csux.X, uri);
            ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/util/image/StaticImageCompressor", "scaleBitmap", 405, "StaticImageCompressor.java")).q("Glide was unable to load image.");
            this.m.e("Bugle.Media.Attachment.Resize.Failure.Image.Error.Counts", 9);
            h(13, uri, j, a2);
            return null;
        }
    }

    private static void d(Bitmap bitmap, byte[] bArr, int i) {
        if (bitmap == null || bArr == null) {
            return;
        }
        ensk e = a.e();
        e.Y(ente.a, "BugleResizing");
        ((enrr) ((enrr) e).h("com/google/android/apps/messaging/shared/util/image/StaticImageCompressor", "maybeLogVerboseResult", 422, "StaticImageCompressor.java")).K("Scaled image. width: %d, height: %d, size: %d, quality: %d", Integer.valueOf(bitmap.getWidth()), Integer.valueOf(bitmap.getHeight()), Integer.valueOf(bArr.length), Integer.valueOf(i));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:3|4|5|6|7|(2:9|(3:11|(1:13)(1:83)|14)(3:84|(1:86)(1:88)|87))(1:89)|15|(1:82)(2:18|(1:20)(9:81|22|23|24|25|26|27|(1:(1:30)(5:32|33|34|35|(1:(1:(2:52|53)(2:40|(1:42)(2:50|51)))(2:54|55))(2:56|57)))(1:69)|(1:44)(2:45|(1:47)(2:48|49))))|21|22|23|24|25|26|27|(0)(0)|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0193, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x019f, code lost:
    
        h(6, r23, r26, r7);
        r11 = defpackage.ctas.a.j();
        r11.Y(defpackage.ente.a, "BugleResizing");
        ((defpackage.enrr) ((defpackage.enrr) ((defpackage.enrr) r11).g(r0)).h("com/google/android/apps/messaging/shared/util/image/StaticImageCompressor", "compressInternal", 260, "StaticImageCompressor.java")).q("IO exception with jpegli encoder.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01ee, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0195, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0196, code lost:
    
        r17 = r0;
        r6 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01cb, code lost:
    
        r11 = defpackage.ctas.a.j();
        r11.Y(defpackage.ente.a, "BugleResizing");
        ((defpackage.enrr) ((defpackage.enrr) ((defpackage.enrr) r11).g(r17)).h("com/google/android/apps/messaging/shared/util/image/StaticImageCompressor", "compressInternal", 246, "StaticImageCompressor.java")).q("Got OutOfMemoryError while compress image using default config.");
        h(11, r23, r26, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x019a, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x019b, code lost:
    
        r20 = r3;
        r21 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01c3, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01c4, code lost:
    
        r20 = r3;
        r21 = r4;
        r6 = r7;
        r17 = r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01f1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x018a A[Catch: IOException -> 0x0193, OutOfMemoryError -> 0x0195, TRY_LEAVE, TryCatch #8 {IOException -> 0x0193, OutOfMemoryError -> 0x0195, blocks: (B:27:0x00f3, B:32:0x0104, B:42:0x014a, B:67:0x0189, B:66:0x0186, B:69:0x018a), top: B:26:0x00f3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final byte[] e(android.net.Uri r23, int r24, int r25, long r26) {
        /*
            Method dump skipped, instructions count: 525
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ctas.e(android.net.Uri, int, int, long):byte[]");
    }

    private final byte[] f(Uri uri, int i, int i2, long j) {
        int i3;
        int i4;
        int i5;
        int i6;
        Bitmap bitmap;
        byte[] bArr;
        int i7;
        int max = Math.max(i, i2);
        int i8 = this.i;
        if (max > i8) {
            long j2 = i8;
            long j3 = max;
            i4 = (int) ((i * j2) / j3);
            i3 = (int) ((j2 * i2) / j3);
        } else {
            i3 = i2;
            i4 = i;
        }
        long a2 = this.o.a();
        int i9 = i3;
        Bitmap bitmap2 = null;
        byte[] bArr2 = null;
        while (true) {
            int i10 = i4;
            long a3 = this.o.a();
            try {
                bitmap2 = c(uri, i10, i9, j);
                i5 = i10;
                i6 = i9;
                try {
                    bArr2 = this.j.o(bitmap2, this.e);
                    bitmap = bitmap2;
                } catch (OutOfMemoryError e) {
                    e = e;
                    ensk j4 = a.j();
                    j4.Y(ente.a, "BugleResizing");
                    ((enrr) ((enrr) ((enrr) j4).g(e)).h("com/google/android/apps/messaging/shared/util/image/StaticImageCompressor", "compressToFitLimit", (char) 295, "StaticImageCompressor.java")).q("Got OutOfMemoryError while adjusting image width and height.");
                    this.m.e("Bugle.Media.Attachment.Resize.Failure.Image.Error.Counts", 7);
                    h(11, uri, j, a3);
                    bitmap = bitmap2;
                    bArr = bArr2;
                    d(bitmap, bArr, this.e);
                    if (bArr == null) {
                    }
                    double d = this.g;
                    double d2 = i6;
                    i4 = (int) (i5 * d);
                    if (i4 >= 32) {
                        break;
                    }
                    bitmap2 = bitmap;
                    bArr2 = bArr;
                    i9 = i7;
                    if (bArr == null) {
                    }
                    i(3, 5, uri, j, a2);
                    return null;
                }
            } catch (OutOfMemoryError e2) {
                e = e2;
                i5 = i10;
                i6 = i9;
            }
            bArr = bArr2;
            d(bitmap, bArr, this.e);
            if (bArr == null && bArr.length <= j) {
                break;
            }
            double d3 = this.g;
            double d22 = i6;
            i4 = (int) (i5 * d3);
            if (i4 >= 32 || (i7 = (int) (d22 * d3)) < 32) {
                break;
                break;
            }
            bitmap2 = bitmap;
            bArr2 = bArr;
            i9 = i7;
        }
        if (bArr == null && bArr.length <= j) {
            return g(bitmap, bArr, j, uri);
        }
        i(3, 5, uri, j, a2);
        return null;
    }

    private final byte[] g(Bitmap bitmap, byte[] bArr, long j, Uri uri) {
        int i = this.f + 1;
        int i2 = this.e;
        byte[] bArr2 = bArr;
        while (i - i2 > 1) {
            int i3 = (i2 + i) >> 1;
            long a2 = this.o.a();
            try {
                byte[] o = this.j.o(bitmap, i3);
                d(bitmap, o, i3);
                if (o != null) {
                    int length = o.length;
                    if (length <= j) {
                        if (length >= this.h * j) {
                            ensk e = a.e();
                            e.Y(ente.a, "BugleResizing");
                            ((enrr) ((enrr) e).h("com/google/android/apps/messaging/shared/util/image/StaticImageCompressor", "tuneImageQuality", 358, "StaticImageCompressor.java")).q("Fast exit from the compression step.");
                            d(bitmap, o, i3);
                            this.m.c("Bugle.Media.Attachment.Resize.V2.Image.FastExit.Count");
                            return o;
                        }
                        i2 = i3;
                        bArr2 = o;
                    }
                }
                i = i3;
            } catch (OutOfMemoryError e2) {
                ensk j2 = a.j();
                j2.Y(ente.a, "BugleResizing");
                ((enrr) ((enrr) ((enrr) j2).g(e2)).h("com/google/android/apps/messaging/shared/util/image/StaticImageCompressor", "tuneImageQuality", (char) 340, "StaticImageCompressor.java")).q("Got OutOfMemoryError while compressing the image. Return the current best result.");
                this.m.e("Bugle.Media.Attachment.Resize.Failure.Image.Error.Counts", 8);
                h(11, uri, j, a2);
                return bArr2;
            }
        }
        d(bitmap, bArr2, i2);
        return bArr2;
    }

    private final void h(int i, Uri uri, long j, long j2) {
        i(5, i, uri, j, j2);
    }

    private final void i(int i, int i2, Uri uri, long j, long j2) {
        epll epllVar = (epll) eplp.a.createBuilder();
        epllVar.copyOnWrite();
        eplp eplpVar = (eplp) epllVar.instance;
        eplpVar.c = eplm.a(i);
        eplpVar.b |= 1;
        epllVar.copyOnWrite();
        eplp eplpVar2 = (eplp) epllVar.instance;
        eplpVar2.v = eplk.a(i2);
        eplpVar2.b |= 524288;
        int b = (int) this.p.b(uri);
        epllVar.copyOnWrite();
        eplp eplpVar3 = (eplp) epllVar.instance;
        eplpVar3.b |= 8;
        eplpVar3.f = b;
        epllVar.copyOnWrite();
        eplp eplpVar4 = (eplp) epllVar.instance;
        eplpVar4.b |= 16;
        eplpVar4.g = (int) j;
        epllVar.copyOnWrite();
        eplp eplpVar5 = (eplp) epllVar.instance;
        eplpVar5.t = epln.a(3);
        eplpVar5.b |= 131072;
        long a2 = this.o.a() - j2;
        epllVar.copyOnWrite();
        eplp eplpVar6 = (eplp) epllVar.instance;
        eplpVar6.b |= 2;
        eplpVar6.d = a2 / 1000.0f;
        this.n.o(new ctaq(epllVar));
    }

    final Bitmap a(Uri uri, int i, int i2) {
        long a2 = this.o.a();
        try {
            return c(uri, i, i2, -1L);
        } catch (OutOfMemoryError e) {
            ensk j = a.j();
            j.Y(ente.a, "BugleResizing");
            ((enrr) ((enrr) ((enrr) j).g(e)).h("com/google/android/apps/messaging/shared/util/image/StaticImageCompressor", "getScaledBitmapForWeb", (char) 381, "StaticImageCompressor.java")).q("Got OutOfMemoryError while scaling image for web use.");
            h(11, uri, -1L, a2);
            return null;
        }
    }

    public final byte[] b(Uri uri, int i, int i2, long j) {
        akzw b = this.l.b("Bugle.Media.Attachment.Resize.V2.Image.Duration");
        long a2 = this.o.a();
        byte[] e = e(uri, i, i2, j);
        epll epllVar = (epll) eplp.a.createBuilder();
        int b2 = (int) this.p.b(uri);
        epllVar.copyOnWrite();
        eplp eplpVar = (eplp) epllVar.instance;
        eplpVar.b |= 8;
        eplpVar.f = b2;
        epllVar.copyOnWrite();
        eplp eplpVar2 = (eplp) epllVar.instance;
        eplpVar2.t = epln.a(3);
        eplpVar2.b |= 131072;
        epllVar.copyOnWrite();
        eplp eplpVar3 = (eplp) epllVar.instance;
        eplpVar3.b |= 16;
        eplpVar3.g = (int) j;
        long a3 = this.o.a() - a2;
        epllVar.copyOnWrite();
        eplp eplpVar4 = (eplp) epllVar.instance;
        eplpVar4.b |= 2;
        eplpVar4.d = a3 / 1000.0f;
        if (e != null) {
            epllVar.copyOnWrite();
            eplp eplpVar5 = (eplp) epllVar.instance;
            eplpVar5.c = eplm.a(2);
            eplpVar5.b |= 1;
            epllVar.copyOnWrite();
            eplp eplpVar6 = (eplp) epllVar.instance;
            eplpVar6.b |= 32;
            eplpVar6.h = e.length;
        } else {
            epllVar.copyOnWrite();
            eplp eplpVar7 = (eplp) epllVar.instance;
            eplpVar7.c = eplm.a(3);
            eplpVar7.b |= 1;
        }
        this.n.o(new ctaq(epllVar));
        b.c();
        this.m.c(e != null ? "Bugle.Media.Attachment.Resize.V2.Image.Success.Count" : "Bugle.Media.Attachment.Resize.V2.Image.Fail.Count");
        if (j != 0 && e != null) {
            this.m.e("Bugle.Media.Attachment.Resize.V2.Used.Space.Percentage", (int) ((e.length * 100) / j));
        }
        return e;
    }
}
