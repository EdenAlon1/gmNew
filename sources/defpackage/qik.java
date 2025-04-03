package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qik implements qil {
    public final String a;
    public final qih b;
    public final qia c;
    public final boolean d;
    public final boolean e;

    public qik(String str, qih qihVar, qia qiaVar, boolean z, boolean z2) {
        this.a = str;
        this.b = qihVar;
        this.c = qiaVar;
        this.d = z;
        this.e = z2;
    }

    @Override // defpackage.qil
    public final qdu a(qdb qdbVar, qci qciVar, qje qjeVar) {
        return new qdx(qdbVar, qjeVar, this);
    }
}
