package defpackage;

import android.content.res.Resources;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rcl implements qtw {
    private final qtw a;
    private final Resources b;

    public rcl(Resources resources, qtw qtwVar) {
        rkf.f(resources);
        this.b = resources;
        rkf.f(qtwVar);
        this.a = qtwVar;
    }

    @Override // defpackage.qtw
    public final qwv a(Object obj, int i, int i2, qtu qtuVar) {
        return reb.f(this.b, this.a.a(obj, i, i2, qtuVar));
    }

    @Override // defpackage.qtw
    public final boolean b(Object obj, qtu qtuVar) {
        return this.a.b(obj, qtuVar);
    }
}
