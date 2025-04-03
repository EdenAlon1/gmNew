package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aqpw extends eyfy implements eyht {
    public static final aqpw a;
    private static volatile eyhz f;
    public int b;
    public long d;
    public String c = "";
    public String e = "";

    static {
        aqpw aqpwVar = new aqpw();
        a = aqpwVar;
        eyfy.registerDefaultInstance(aqpw.class, aqpwVar);
    }

    private aqpw() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ለ\u0000\u0002ဂ\u0001\u0003ለ\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (ordinal == 3) {
            return new aqpw();
        }
        if (ordinal == 4) {
            return new aqpv();
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
        synchronized (aqpw.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
