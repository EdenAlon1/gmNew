package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eswm extends eyfy implements eyht {
    public static final eswm a;
    private static volatile eyhz f;
    public String b = "";
    public String c = "";
    public int d;
    public int e;

    static {
        eswm eswmVar = new eswm();
        a = eswmVar;
        eyfy.registerDefaultInstance(eswm.class, eswmVar);
    }

    private eswm() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0004\u0004\u0004", new Object[]{"b", "c", "d", "e"});
        }
        if (ordinal == 3) {
            return new eswm();
        }
        if (ordinal == 4) {
            return new eswl();
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
        synchronized (eswm.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
