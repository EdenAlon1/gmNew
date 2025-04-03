package defpackage;

import android.graphics.Point;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class orm extends opn {
    public final orl a;
    public final Runnable b;
    public Point c;
    public Point d;
    public boolean e;

    public orm(orl orlVar) {
        ksw.a(true);
        this.a = orlVar;
        this.b = new orj(this);
    }

    @Override // defpackage.opn
    public final void a() {
        this.a.b(this.b);
        this.c = null;
        this.d = null;
        this.e = false;
    }
}
