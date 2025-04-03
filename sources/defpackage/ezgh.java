package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ezgh extends eyfy implements eyht {
    public static final ezgh a;
    private static volatile eyhz d;
    public String b = "";
    public long c;

    static {
        ezgh ezghVar = new ezgh();
        a = ezghVar;
        eyfy.registerDefaultInstance(ezgh.class, ezghVar);
    }

    private ezgh() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0002", new Object[]{"b", "c"});
        }
        if (ordinal == 3) {
            return new ezgh();
        }
        if (ordinal == 4) {
            return new ezgg();
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
        synchronized (ezgh.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
