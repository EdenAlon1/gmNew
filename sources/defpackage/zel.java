package defpackage;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.SystemProperties;
import android.util.Size;
import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zel implements dnal, abqq {
    private static final int a = ffmk.f(SystemProperties.getInt("ro.hwui.max_texture_allocation_size", 104857600), 104857600) / 4;
    private final ConcurrentHashMap b = new ConcurrentHashMap();

    @Override // defpackage.dnal
    public final void a(Uri uri, int i, int i2) {
        this.b.put(uri, new Size(i, i2));
    }

    @Override // defpackage.dnal
    public final void b(qwp qwpVar, Object obj) {
        if (obj != null) {
            ConcurrentHashMap concurrentHashMap = this.b;
            fflf.g(concurrentHashMap);
            concurrentHashMap.remove(obj);
        }
    }

    @Override // defpackage.abqq, java.lang.AutoCloseable
    public final void close() {
        this.b.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dnal
    public final void d(Drawable drawable, Object obj) {
        Size size;
        if (obj != null) {
            ConcurrentHashMap concurrentHashMap = this.b;
            fflf.g(concurrentHashMap);
            size = (Size) concurrentHashMap.remove(obj);
        } else {
            size = null;
        }
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap().getWidth() * bitmapDrawable.getBitmap().getHeight() <= a) {
                return;
            }
            throw new IllegalArgumentException("Image loading from " + (obj instanceof Uri ? cskt.f((Uri) obj) : "unknown") + " is too large to be drawn on the canvas. Actual size: " + bitmapDrawable.getBitmap().getWidth() + " x " + bitmapDrawable.getBitmap().getHeight() + " pixels, Requested size: " + (size != null ? Integer.valueOf(size.getWidth()) : null) + " x " + (size != null ? Integer.valueOf(size.getHeight()) : null) + " pixels.");
        }
    }

    @Override // defpackage.dnal
    public final /* synthetic */ void c(Uri uri) {
    }
}
