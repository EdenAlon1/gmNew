package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class cfp implements lkr {
    public final lkv a;
    public final cex b;
    private final lkv c;
    private final lkq d;

    public cfp() {
        cfo cfoVar = new cfo(this);
        this.d = cfoVar;
        lkv lkvVar = new lkv(this);
        this.c = lkvVar;
        this.a = new lkv(this);
        lkvVar.c(cfoVar);
        this.b = new cex(lkvVar, new cfb());
    }

    @Override // defpackage.lkr
    public final lkk P() {
        return this.a;
    }

    public final cex a() {
        cex cexVar = this.b;
        cexVar.getClass();
        return cexVar;
    }

    public final void b(lki lkiVar) {
        this.c.e(lkiVar);
    }

    public abstract cfl c();
}
