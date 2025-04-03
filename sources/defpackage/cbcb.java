package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Rect;
import android.util.SparseArray;
import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbcb {
    final /* synthetic */ cbca b;
    private final AtomicInteger c = new AtomicInteger(0);
    private final AtomicInteger d = new AtomicInteger(0);
    public final SparseArray a = new SparseArray();

    public cbcb(cbca cbcaVar) {
        this.b = cbcaVar;
    }

    public static final Bitmap d(InputStream inputStream, Rect rect, BitmapFactory.Options options) {
        BitmapRegionDecoder newInstance;
        Bitmap decodeRegion;
        return (rect == null || (newInstance = BitmapRegionDecoder.newInstance(inputStream, false)) == null || (decodeRegion = newInstance.decodeRegion(rect, options)) == null) ? BitmapFactory.decodeStream(inputStream, null, options) : decodeRegion;
    }

    public static final int e(cbbk cbbkVar) {
        if (!cbbkVar.i()) {
            return 0;
        }
        try {
            Bitmap d = cbbkVar.d();
            if (d == null || !d.isMutable()) {
                return 0;
            }
            int width = d.getWidth();
            int height = d.getHeight();
            if (width <= 0 || height <= 0) {
                return 0;
            }
            return g(width, height);
        } catch (cbbj unused) {
            return 0;
        }
    }

    private final Bitmap f(int i, int i2) {
        LinkedList linkedList;
        cbbk cbbkVar;
        synchronized (this.b) {
            int g = g(i, i2);
            if (g == 0 || (linkedList = (LinkedList) this.a.get(g)) == null || linkedList.isEmpty()) {
                return null;
            }
            int i3 = 0;
            while (true) {
                if (i3 >= linkedList.size()) {
                    cbbkVar = null;
                    break;
                }
                cbbk cbbkVar2 = (cbbk) linkedList.get(i3);
                if (cbbkVar2.n() == 1) {
                    cbbkVar2.o();
                    if (cbbkVar2.n() == 1) {
                        cbbkVar = (cbbk) linkedList.remove(i3);
                        break;
                    }
                    ((ensz) ((ensz) cbca.b.j()).h("com/google/android/apps/messaging/shared/datamodel/media/common/PoolableImageCache$ReusableImageResourcePool", "getReusableBitmapFromPool", 324, "PoolableImageCache.java")).q("Image refCount changed from 1 in getReusableBitmapFromPool.");
                    cbbkVar2.r();
                }
                i3++;
            }
            if (cbbkVar == null) {
                return null;
            }
            try {
                csix.k(cbbkVar.h.isHeldByCurrentThread());
                long a = this.b.e.a();
                cbbkVar.o();
                long j = cbbkVar.g;
                cbbkVar.r();
                long j2 = a - j;
                if (j2 < cbca.c) {
                    ensk o = cbca.b.o();
                    o.Y(cbci.c, Long.valueOf(j2));
                    ((ensz) o.h("com/google/android/apps/messaging/shared/datamodel/media/common/PoolableImageCache$ReusableImageResourcePool", "getReusableBitmapFromPool", 346, "PoolableImageCache.java")).q("Not reusing first available bitmap from the pool because it has not been in the pool long enough. ");
                    linkedList.addLast(cbbkVar);
                    return null;
                }
                cbbkVar.p();
                csix.k(((cbbk) this.b.remove(cbbkVar.e)) == cbbkVar);
                Bitmap e = cbbkVar.e();
                cbbkVar.q();
                return e;
            } catch (Throwable th) {
                throw th;
            } finally {
                cbbkVar.r();
            }
        }
    }

    private static final int g(int i, int i2) {
        if (i > 65535 || i2 > 65535) {
            return 0;
        }
        return (i << 16) | i2;
    }

    public final Bitmap a(int i, int i2) {
        return b(i, i2, 0);
    }

    public final Bitmap b(int i, int i2, int i3) {
        OutOfMemoryError outOfMemoryError;
        Bitmap bitmap;
        try {
            Bitmap f = f(i, i2);
            if (f == null) {
                f = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            }
            bitmap = f;
        } catch (OutOfMemoryError e) {
            outOfMemoryError = e;
            bitmap = null;
        }
        try {
            bitmap.eraseColor(i3);
            return bitmap;
        } catch (OutOfMemoryError e2) {
            outOfMemoryError = e2;
            ((ensz) ((ensz) ((ensz) cbca.b.j()).g(outOfMemoryError)).h("com/google/android/apps/messaging/shared/datamodel/media/common/PoolableImageCache$ReusableImageResourcePool", "createOrReuseBitmap", (char) 411, "PoolableImageCache.java")).q("try to createOrReuseBitmap.");
            this.b.f.a(15, 1);
            return bitmap;
        }
    }

    public final Bitmap c(InputStream inputStream, Rect rect, BitmapFactory.Options options, int i, int i2) {
        Bitmap bitmap;
        if (i <= 0 || i2 <= 0) {
            ((ensz) ((ensz) cbca.b.j()).h("com/google/android/apps/messaging/shared/datamodel/media/common/PoolableImageCache$ReusableImageResourcePool", "decodeSampledBitmapFromInputStream", 163, "PoolableImageCache.java")).q("Decoding bitmap with invalid size.");
            throw new IOException("Invalid size / corrupted image");
        }
        csix.l(inputStream);
        if (!options.inJustDecodeBounds) {
            options.inBitmap = f(i, i2);
        }
        Bitmap bitmap2 = null;
        try {
            bitmap = d(inputStream, rect, options);
        } catch (IllegalArgumentException unused) {
            bitmap = null;
        } catch (OutOfMemoryError unused2) {
        }
        try {
            this.d.incrementAndGet();
            return bitmap;
        } catch (IllegalArgumentException unused3) {
            if (options.inBitmap == null) {
                return bitmap;
            }
            options.inBitmap.recycle();
            options.inBitmap = null;
            Bitmap d = d(inputStream, rect, options);
            int incrementAndGet = this.c.incrementAndGet();
            if (incrementAndGet % 100 != 0) {
                return d;
            }
            ensz enszVar = (ensz) cbca.b.j();
            enszVar.Y(cbci.a, Integer.valueOf(this.d.get()));
            enszVar.Y(cbci.b, Integer.valueOf(incrementAndGet));
            ((ensz) enszVar.h("com/google/android/apps/messaging/shared/datamodel/media/common/PoolableImageCache$ReusableImageResourcePool", "onFailedToReuse", 463, "PoolableImageCache.java")).q("Pooled bitmap consistently not being reused.");
            return d;
        } catch (OutOfMemoryError unused4) {
            bitmap2 = bitmap;
            ((ensz) ((ensz) cbca.b.j()).h("com/google/android/apps/messaging/shared/datamodel/media/common/PoolableImageCache$ReusableImageResourcePool", "decodeSampledBitmapFromInputStream", 181, "PoolableImageCache.java")).q("Oom decoding inputStream.");
            this.b.f.a(15, 1);
            return bitmap2;
        }
    }
}
