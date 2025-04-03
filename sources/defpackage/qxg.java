package defpackage;

import android.graphics.Bitmap;

/* compiled from: PG */
/* loaded from: classes.dex */
public class qxg implements qxf {
    @Override // defpackage.qxf
    public final Bitmap a(int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // defpackage.qxf
    public final Bitmap b(int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // defpackage.qxf
    public void d(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // defpackage.qxf
    public final void c() {
    }

    @Override // defpackage.qxf
    public final void e(float f) {
    }

    @Override // defpackage.qxf
    public final void f(int i) {
    }
}
