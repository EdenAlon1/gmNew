package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qir implements qil {
    public final String a;
    public final qhw b;
    public final qih c;
    public final qhw d;
    public final qhw e;
    public final qhw f;
    public final qhw g;
    public final qhw h;
    public final boolean i;
    public final boolean j;
    public final int k;

    public qir(String str, int i, qhw qhwVar, qih qihVar, qhw qhwVar2, qhw qhwVar3, qhw qhwVar4, qhw qhwVar5, qhw qhwVar6, boolean z, boolean z2) {
        this.a = str;
        this.k = i;
        this.b = qhwVar;
        this.c = qihVar;
        this.d = qhwVar2;
        this.e = qhwVar3;
        this.f = qhwVar4;
        this.g = qhwVar5;
        this.h = qhwVar6;
        this.i = z;
        this.j = z2;
    }

    @Override // defpackage.qil
    public final qdu a(qdb qdbVar, qci qciVar, qje qjeVar) {
        return new qef(qdbVar, qjeVar, this);
    }
}
