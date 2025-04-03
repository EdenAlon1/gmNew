package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ezzr extends eyfy implements eyht {
    public static final ezzr a;
    private static volatile eyhz d;
    public String b = "";
    public String c = "";

    static {
        ezzr ezzrVar = new ezzr();
        a = ezzrVar;
        eyfy.registerDefaultInstance(ezzr.class, ezzrVar);
    }

    private ezzr() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002Ȉ\u0003Ȉ", new Object[]{"b", "c"});
        }
        if (ordinal == 3) {
            return new ezzr();
        }
        if (ordinal == 4) {
            return new ezzq();
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
        synchronized (ezzr.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
