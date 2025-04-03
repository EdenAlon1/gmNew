package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqru extends eyfy implements eyht {
    public static final eqru a;
    private static volatile eyhz g;
    public int b;
    public eppi c;
    public eppe d;
    public eqrs e;
    public eqrq f;

    static {
        eqru eqruVar = new eqru();
        a = eqruVar;
        eyfy.registerDefaultInstance(eqru.class, eqruVar);
    }

    private eqru() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0000\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (ordinal == 3) {
            return new eqru();
        }
        if (ordinal == 4) {
            return new eqrt();
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
        synchronized (eqru.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
