package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ppv extends pqu {
    public ppv(Class cls) {
        super(cls);
    }

    @Override // defpackage.pqu
    public final /* bridge */ /* synthetic */ pqv a() {
        if (this.a && this.c.l.d) {
            throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
        }
        return new ppw(this);
    }
}
