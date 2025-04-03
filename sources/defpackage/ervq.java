package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ervq extends eyfy implements eyht {
    public static final ervq a;
    private static volatile eyhz c;
    public String b = "";

    static {
        ervq ervqVar = new ervq();
        a = ervqVar;
        eyfy.registerDefaultInstance(ervq.class, ervqVar);
    }

    private ervq() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002Ȉ", new Object[]{"b"});
        }
        if (ordinal == 3) {
            return new ervq();
        }
        if (ordinal == 4) {
            return new ervp();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = c;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (ervq.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
