package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqqi extends eyfy implements eyht {
    public static final eqqi a;
    private static volatile eyhz h;
    public int b;
    public boolean c;
    public boolean d;
    public int e;
    public eyee f = eyee.b;
    public int g;

    static {
        eqqi eqqiVar = new eqqi();
        a = eqqiVar;
        eyfy.registerDefaultInstance(eqqi.class, eqqiVar);
    }

    private eqqi() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003᠌\u0002\u0004ည\u0003\u0005᠌\u0004", new Object[]{"b", "c", "d", "e", eqqg.a, "f", "g", eqqf.a});
        }
        if (ordinal == 3) {
            return new eqqi();
        }
        if (ordinal == 4) {
            return new eqqe();
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
        synchronized (eqqi.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
