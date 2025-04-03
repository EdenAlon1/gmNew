package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqkd extends eyfy implements eyht {
    public static final eqkd a;
    private static volatile eyhz f;
    public int b;
    public int d;
    public String c = "";
    public eygr e = emptyProtobufList();

    static {
        eqkd eqkdVar = new eqkd();
        a = eqkdVar;
        eyfy.registerDefaultInstance(eqkd.class, eqkdVar);
    }

    private eqkd() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003\u001b", new Object[]{"b", "c", "d", eqke.a, "e", eqkb.class});
        }
        if (ordinal == 3) {
            return new eqkd();
        }
        if (ordinal == 4) {
            return new eqkc();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = f;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (eqkd.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
