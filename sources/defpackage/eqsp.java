package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqsp extends eyfy implements eyht {
    public static final eqsp a;
    private static volatile eyhz h;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    private boolean i;

    static {
        eqsp eqspVar = new eqsp();
        a = eqspVar;
        eyfy.registerDefaultInstance(eqsp.class, eqspVar);
    }

    private eqsp() {
    }

    public static /* synthetic */ void a(eqsp eqspVar) {
        eqspVar.b |= 8;
        eqspVar.i = true;
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004ဇ\u0003\u0005င\u0004\u0006င\u0005", new Object[]{"b", "c", eqta.a, "d", eqso.a, "e", eqsm.a, "i", "f", "g"});
        }
        if (ordinal == 3) {
            return new eqsp();
        }
        if (ordinal == 4) {
            return new eqsl();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = h;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (eqsp.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
