package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clsn extends eyfy implements eyht {
    public static final clsn a;
    private static volatile eyhz d;
    public int b;
    public String c = "";

    static {
        clsn clsnVar = new clsn();
        a = clsnVar;
        eyfy.registerDefaultInstance(clsn.class, clsnVar);
    }

    private clsn() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"b", "c"});
        }
        if (ordinal == 3) {
            return new clsn();
        }
        if (ordinal == 4) {
            return new clsm();
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
        synchronized (clsn.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
