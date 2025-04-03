package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qjb implements qil {
    public final String a;
    public final qhw b;
    public final List c;
    public final qhv d;
    public final qhy e;
    public final qhw f;
    public final float g;
    public final boolean h;
    public final int i;
    public final int j;

    public qjb(String str, qhw qhwVar, List list, qhv qhvVar, qhy qhyVar, qhw qhwVar2, int i, int i2, float f, boolean z) {
        this.a = str;
        this.b = qhwVar;
        this.c = list;
        this.d = qhvVar;
        this.e = qhyVar;
        this.f = qhwVar2;
        this.i = i;
        this.j = i2;
        this.g = f;
        this.h = z;
    }

    @Override // defpackage.qil
    public final qdu a(qdb qdbVar, qci qciVar, qje qjeVar) {
        return new qek(qdbVar, qjeVar, this);
    }
}
