package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cftg extends eyfy implements eyht {
    public static final cftg a;
    private static volatile eyhz d;
    public int b;
    public boolean c;

    static {
        cftg cftgVar = new cftg();
        a = cftgVar;
        eyfy.registerDefaultInstance(cftg.class, cftgVar);
    }

    private cftg() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဇ\u0001", new Object[]{"b", "c"});
        }
        if (ordinal == 3) {
            return new cftg();
        }
        if (ordinal == 4) {
            return new cftf();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = d;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (cftg.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
