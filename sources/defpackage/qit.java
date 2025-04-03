package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qit implements qil {
    public final String a;
    public final qhw b;
    public final qhw c;
    public final qig d;
    public final boolean e;

    public qit(String str, qhw qhwVar, qhw qhwVar2, qig qigVar, boolean z) {
        this.a = str;
        this.b = qhwVar;
        this.c = qhwVar2;
        this.d = qigVar;
        this.e = z;
    }

    @Override // defpackage.qil
    public final qdu a(qdb qdbVar, qci qciVar, qje qjeVar) {
        return new qeh(qdbVar, qjeVar, this);
    }
}
