package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etba extends eyfy implements eyht {
    public static final etba a;
    private static volatile eyhz g;
    public int b;
    public etau c;
    public esvv d;
    public eyfh e;
    public esze f;

    static {
        etba etbaVar = new etba();
        a = etbaVar;
        eyfy.registerDefaultInstance(etba.class, etbaVar);
    }

    private etba() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0001\u0001ϧ\u0004\u0000\u0000\u0000\u0001ဉ\u0001\u0002ဉ\u0002\u0003ဉ\u0003ϧဉ\u0000", new Object[]{"b", "d", "e", "f", "c"});
        }
        if (ordinal == 3) {
            return new etba();
        }
        if (ordinal == 4) {
            return new etaz();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = g;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (etba.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
