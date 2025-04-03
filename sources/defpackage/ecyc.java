package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ecyc extends eyfy implements eyht {
    public static final ecyc a;
    private static volatile eyhz d;
    public String b = "";
    public long c;
    private int e;

    static {
        ecyc ecycVar = new ecyc();
        a = ecycVar;
        eyfy.registerDefaultInstance(ecyc.class, ecycVar);
    }

    private ecyc() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"e", "b", "c"});
        }
        if (ordinal == 3) {
            return new ecyc();
        }
        if (ordinal == 4) {
            return new ecyb();
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
        synchronized (ecyc.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
