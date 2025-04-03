package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbtd extends eyfy implements eyht {
    public static final cbtd a;
    private static volatile eyhz g;
    public int b;
    public eygr c = eyfy.emptyProtobufList();
    public long d;
    public long e;
    public long f;

    static {
        cbtd cbtdVar = new cbtd();
        a = cbtdVar;
        eyfy.registerDefaultInstance(cbtd.class, cbtdVar);
    }

    private cbtd() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u0004\u0002Ț\u0003\u0002\u0004\u0002\u0005\u0002", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (ordinal == 3) {
            return new cbtd();
        }
        if (ordinal == 4) {
            return new cbtc();
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
        synchronized (cbtd.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
