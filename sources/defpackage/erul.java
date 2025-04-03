package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erul extends eyfy implements eyht {
    public static final erul a;
    private static volatile eyhz f;
    public int b;
    public String c = "";
    public String d = "";
    public String e = "";

    static {
        erul erulVar = new erul();
        a = erulVar;
        eyfy.registerDefaultInstance(erul.class, erulVar);
    }

    private erul() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"b", "c", "d", "e"});
        }
        if (ordinal == 3) {
            return new erul();
        }
        if (ordinal == 4) {
            return new eruk();
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
        synchronized (erul.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
