package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qis implements qil {
    public final String a;
    public final qih b;
    public final qih c;
    public final qhw d;
    public final boolean e;

    public qis(String str, qih qihVar, qih qihVar2, qhw qhwVar, boolean z) {
        this.a = str;
        this.b = qihVar;
        this.c = qihVar2;
        this.d = qhwVar;
        this.e = z;
    }

    @Override // defpackage.qil
    public final qdu a(qdb qdbVar, qci qciVar, qje qjeVar) {
        return new qeg(qdbVar, qjeVar, this);
    }

    public final String toString() {
        qih qihVar = this.c;
        return "RectangleShape{position=" + String.valueOf(this.b) + ", size=" + String.valueOf(qihVar) + "}";
    }
}
