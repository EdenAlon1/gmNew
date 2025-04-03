package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erud extends eyfy implements eyht {
    public static final erud a;
    private static volatile eyhz d;
    public String b = "";
    public String c = "";

    static {
        erud erudVar = new erud();
        a = erudVar;
        eyfy.registerDefaultInstance(erud.class, erudVar);
    }

    private erud() {
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
            return new erud();
        }
        if (ordinal == 4) {
            return new eruc();
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
        synchronized (erud.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
