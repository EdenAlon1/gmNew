package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqfs extends eyfy implements eyht {
    public static final eqfs a;
    private static volatile eyhz f;
    public int b;
    public boolean c;
    public String d = "";
    public boolean e;

    static {
        eqfs eqfsVar = new eqfs();
        a = eqfsVar;
        eyfy.registerDefaultInstance(eqfs.class, eqfsVar);
    }

    private eqfs() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဈ\u0001\u0003ဇ\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (ordinal == 3) {
            return new eqfs();
        }
        if (ordinal == 4) {
            return new eqfr();
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
        synchronized (eqfs.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
