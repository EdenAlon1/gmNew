package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ejb {
    public final Object a;
    public final Object b;
    public int c;
    public ffjm d;
    final /* synthetic */ ejc e;

    public ejb(ejc ejcVar, int i, Object obj, Object obj2) {
        this.e = ejcVar;
        this.a = obj;
        this.b = obj2;
        this.c = i;
    }

    public final ffjm a() {
        ffjm ffjmVar = this.d;
        if (ffjmVar != null) {
            return ffjmVar;
        }
        hpw hpwVar = new hpw(1403994769, true, new eja(this.e, this));
        this.d = hpwVar;
        return hpwVar;
    }
}
