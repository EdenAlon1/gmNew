package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpcp extends eyfy implements eyht {
    public static final cpcp a;
    private static volatile eyhz g;
    public int b;
    public long c;
    public String d = "";
    public eyja e;
    public eyja f;

    static {
        cpcp cpcpVar = new cpcp();
        a = cpcpVar;
        eyfy.registerDefaultInstance(cpcp.class, cpcpVar);
    }

    private cpcp() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (ordinal == 3) {
            return new cpcp();
        }
        if (ordinal == 4) {
            return new cpco();
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
        synchronized (cpcp.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
