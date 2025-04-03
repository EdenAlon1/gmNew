package defpackage;

import android.graphics.Bitmap;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class exlx implements exmb {
    public final Bitmap a;
    private final exmd b;

    public exlx(Bitmap bitmap) {
        this.a = bitmap;
        exls exlsVar = new exls();
        int i = exlw.a[bitmap.getConfig().ordinal()];
        exlsVar.b(i != 1 ? i != 2 ? 0 : 1 : 8);
        exlsVar.c(1);
        this.b = exlsVar.a();
    }

    @Override // defpackage.exmb
    public final exmd a() {
        return this.b;
    }

    @Override // defpackage.exmb
    public final void b() {
        this.a.recycle();
    }
}
