package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekjm {
    public final ekjr a;
    public final ekki b;

    /* compiled from: PG */
    public interface a {
        akfw ha();
    }

    /* compiled from: PG */
    public interface b {
        fazv c();
    }

    public ekjm(ekjr ekjrVar, emxc emxcVar, ekki ekkiVar) {
        this.a = ekjrVar;
        if (emxcVar.g()) {
            emxf.l(emxcVar.c() instanceof abe);
        }
        this.b = ekkiVar;
    }

    public final ekjo a(eisx eisxVar) {
        return (ekjo) new lmw(this.b, new ekjn(this, eisxVar)).b.a(ffiu.c(ekjo.class), "tt_activity_account_retained:".concat((eisxVar == null ? "null" : Integer.valueOf(eisxVar.a())).toString()));
    }

    public final Object b(eisx eisxVar) {
        Object obj;
        ekjo a2 = a(eisxVar);
        synchronized (a2.d) {
            if (a2.e == null) {
                akfw ha = ((a) fazh.a(a2.b.a(a2.c), a.class)).ha();
                ha.c = a2.a;
                fbbe.a(ha.c, llv.class);
                a2.e = new akfy(ha.a, ha.b);
            }
            obj = a2.e;
        }
        return obj;
    }
}
