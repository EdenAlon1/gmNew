package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qjc implements qil {
    public final qhw a;
    public final qhw b;
    public final qhw c;
    public final boolean d;
    public final int e;

    public qjc(int i, qhw qhwVar, qhw qhwVar2, qhw qhwVar3, boolean z) {
        this.e = i;
        this.a = qhwVar;
        this.b = qhwVar2;
        this.c = qhwVar3;
        this.d = z;
    }

    @Override // defpackage.qil
    public final qdu a(qdb qdbVar, qci qciVar, qje qjeVar) {
        return new qel(qjeVar, this);
    }

    public final String toString() {
        qhw qhwVar = this.c;
        qhw qhwVar2 = this.b;
        return "Trim Path: {start: " + String.valueOf(this.a) + ", end: " + String.valueOf(qhwVar2) + ", offset: " + String.valueOf(qhwVar) + "}";
    }
}
