package defpackage;

import android.graphics.Bitmap;
import android.util.Log;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashSet;
import java.util.NavigableMap;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public class qxo implements qxf {
    private static final Bitmap.Config a = Bitmap.Config.ARGB_8888;
    private final qxp b;
    private final Set c;
    private final long d;
    private long e;
    private long f;
    private int g;
    private int h;
    private int i;
    private int j;

    public qxo(long j) {
        Bitmap.Config config;
        qxu qxuVar = new qxu();
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        hashSet.add(null);
        config = Bitmap.Config.HARDWARE;
        hashSet.remove(config);
        Set unmodifiableSet = DesugarCollections.unmodifiableSet(hashSet);
        this.d = j;
        this.e = j;
        this.b = qxuVar;
        this.c = unmodifiableSet;
    }

    private static Bitmap g(int i, int i2, Bitmap.Config config) {
        if (config == null) {
            config = a;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    private final synchronized Bitmap h(int i, int i2, Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap.Config config3;
        Bitmap.Config[] configArr;
        boolean z;
        Bitmap bitmap;
        config2 = Bitmap.Config.HARDWARE;
        if (config == config2) {
            throw new IllegalArgumentException(a.F(config, "Cannot create a mutable Bitmap with config: ", ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions"));
        }
        qxp qxpVar = this.b;
        Bitmap.Config config4 = config != null ? config : a;
        qxt qxtVar = ((qxu) qxpVar).f;
        int b = rkh.b(i, i2, config4);
        qxs d = qxtVar.d(b, config4);
        config3 = Bitmap.Config.RGBA_F16;
        int i3 = 0;
        boolean z2 = true;
        if (config3.equals(config4)) {
            configArr = qxu.b;
        } else {
            int i4 = qxr.a[config4.ordinal()];
            configArr = i4 != 1 ? i4 != 2 ? i4 != 3 ? i4 != 4 ? new Bitmap.Config[]{config4} : qxu.e : qxu.d : qxu.c : qxu.a;
        }
        int length = configArr.length;
        while (true) {
            if (i3 >= length) {
                z = z2;
                break;
            }
            Bitmap.Config config5 = configArr[i3];
            Integer num = (Integer) ((qxu) qxpVar).d(config5).ceilingKey(Integer.valueOf(b));
            if (num != null) {
                z = z2;
                if (num.intValue() <= b * 8) {
                    if (num.intValue() == b) {
                        if (config5 == null) {
                            if (config4 != null) {
                            }
                        } else if (config5.equals(config4)) {
                        }
                    }
                    ((qxu) qxpVar).f.c(d);
                    d = ((qxu) qxpVar).f.d(num.intValue(), config5);
                }
            } else {
                z = z2;
            }
            i3++;
            z2 = z;
        }
        bitmap = (Bitmap) ((qxu) qxpVar).g.a(d);
        if (bitmap != null) {
            ((qxu) qxpVar).e(Integer.valueOf(d.a), bitmap);
            bitmap.reconfigure(i, i2, config4);
        }
        if (bitmap == null) {
            if (Log.isLoggable("LruBitmapPool", 3)) {
                Log.d("LruBitmapPool", "Missing bitmap=".concat(this.b.b(i, i2, config)));
            }
            this.h++;
        } else {
            this.g++;
            this.f -= rkh.a(bitmap);
            boolean z3 = z;
            bitmap.setHasAlpha(z3);
            bitmap.setPremultiplied(z3);
        }
        if (Log.isLoggable("LruBitmapPool", 2)) {
            Log.v("LruBitmapPool", "Get bitmap=".concat(this.b.b(i, i2, config)));
        }
        i();
        return bitmap;
    }

    private final void i() {
        if (Log.isLoggable("LruBitmapPool", 2)) {
            j();
        }
    }

    private final void j() {
        qxp qxpVar = this.b;
        Log.v("LruBitmapPool", "Hits=" + this.g + ", misses=" + this.h + ", puts=" + this.i + ", evictions=" + this.j + ", currentSize=" + this.f + ", maxSize=" + this.e + "\nStrategy=" + qxpVar.toString());
    }

    private final void k() {
        l(this.e);
    }

    private final synchronized void l(long j) {
        while (this.f > j) {
            qxp qxpVar = this.b;
            Bitmap bitmap = (Bitmap) ((qxu) qxpVar).g.b();
            if (bitmap != null) {
                ((qxu) qxpVar).e(Integer.valueOf(rkh.a(bitmap)), bitmap);
            }
            if (bitmap == null) {
                if (Log.isLoggable("LruBitmapPool", 5)) {
                    Log.w("LruBitmapPool", "Size mismatch, resetting");
                    j();
                }
                this.f = 0L;
                return;
            }
            this.f -= rkh.a(bitmap);
            this.j++;
            if (Log.isLoggable("LruBitmapPool", 3)) {
                Log.d("LruBitmapPool", "Evicting bitmap=".concat(this.b.a(bitmap)));
            }
            i();
            bitmap.recycle();
        }
    }

    @Override // defpackage.qxf
    public final Bitmap a(int i, int i2, Bitmap.Config config) {
        Bitmap h = h(i, i2, config);
        if (h == null) {
            return g(i, i2, config);
        }
        h.eraseColor(0);
        return h;
    }

    @Override // defpackage.qxf
    public final Bitmap b(int i, int i2, Bitmap.Config config) {
        Bitmap h = h(i, i2, config);
        return h == null ? g(i, i2, config) : h;
    }

    @Override // defpackage.qxf
    public final void c() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        l(0L);
    }

    @Override // defpackage.qxf
    public synchronized void d(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable() && rkh.a(bitmap) <= this.e && this.c.contains(bitmap.getConfig())) {
                int a2 = rkh.a(bitmap);
                qxp qxpVar = this.b;
                qxs d = ((qxu) qxpVar).f.d(rkh.a(bitmap), bitmap.getConfig());
                ((qxu) qxpVar).g.c(d, bitmap);
                NavigableMap d2 = ((qxu) qxpVar).d(bitmap.getConfig());
                Integer num = (Integer) d2.get(Integer.valueOf(d.a));
                d2.put(Integer.valueOf(d.a), Integer.valueOf(num == null ? 1 : num.intValue() + 1));
                this.i++;
                this.f += a2;
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    Log.v("LruBitmapPool", "Put bitmap in pool=".concat(this.b.a(bitmap)));
                }
                i();
                k();
                return;
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                Log.v("LruBitmapPool", "Reject bitmap from pool, bitmap: " + this.b.a(bitmap) + ", is mutable: " + bitmap.isMutable() + ", is allowed config: " + this.c.contains(bitmap.getConfig()));
            }
            bitmap.recycle();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.qxf
    public final synchronized void e(float f) {
        this.e = Math.round(this.d * f);
        k();
    }

    @Override // defpackage.qxf
    public final void f(int i) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", a.h(i, "trimMemory, level="));
        }
        if (i >= 40 || i >= 20) {
            c();
        } else if (i == 15) {
            l(this.e / 2);
        }
    }
}
