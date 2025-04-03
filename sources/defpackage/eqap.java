package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqap extends eyfy implements eyht {
    public static final eqap a;
    private static volatile eyhz h;
    public int b;
    public int c;
    public boolean d;
    public eygr e = emptyProtobufList();
    public int f;
    public int g;

    static {
        eqap eqapVar = new eqap();
        a = eqapVar;
        eyfy.registerDefaultInstance(eqap.class, eqapVar);
    }

    private eqap() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003\u001b\u0004᠌\u0002\u0005င\u0003", new Object[]{"b", "c", eqao.a, "d", "e", eppr.class, "f", eqau.a, "g"});
        }
        if (ordinal == 3) {
            return new eqap();
        }
        if (ordinal == 4) {
            return new eqan();
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
        synchronized (eqap.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
