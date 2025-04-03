package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eypf extends eyfy implements eyht {
    public static final eypf a;
    private static volatile eyhz g;
    public int b;
    public String c = "";
    public eygr d = emptyProtobufList();
    public String e = "";
    public String f = "";

    static {
        eypf eypfVar = new eypf();
        a = eypfVar;
        eyfy.registerDefaultInstance(eypf.class, eypfVar);
    }

    private eypf() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002", new Object[]{"b", "c", "d", eyps.class, "e", "f"});
        }
        if (ordinal == 3) {
            return new eypf();
        }
        if (ordinal == 4) {
            return new eype();
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
        synchronized (eypf.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
