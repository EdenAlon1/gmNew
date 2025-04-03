package defpackage;

import android.graphics.Bitmap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rcp implements qwv, qwq {
    private final Bitmap a;
    private final qxf b;

    public rcp(Bitmap bitmap, qxf qxfVar) {
        rkf.e(bitmap, "Bitmap must not be null");
        this.a = bitmap;
        rkf.e(qxfVar, "BitmapPool must not be null");
        this.b = qxfVar;
    }

    public static rcp f(Bitmap bitmap, qxf qxfVar) {
        if (bitmap == null) {
            return null;
        }
        return new rcp(bitmap, qxfVar);
    }

    @Override // defpackage.qwv
    public final int a() {
        return rkh.a(this.a);
    }

    @Override // defpackage.qwv
    public final Class b() {
        return Bitmap.class;
    }

    @Override // defpackage.qwv
    public final /* synthetic */ Object c() {
        return this.a;
    }

    @Override // defpackage.qwq
    public final void d() {
        this.a.prepareToDraw();
    }

    @Override // defpackage.qwv
    public final void e() {
        this.b.d(this.a);
    }
}
