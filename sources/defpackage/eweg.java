package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eweg extends eyfy implements eyht {
    public static final eweg a;
    private static volatile eyhz f;
    public String b = "";
    public eygr c = emptyProtobufList();
    public String d = "";
    public String e = "";

    static {
        eweg ewegVar = new eweg();
        a = ewegVar;
        eyfy.registerDefaultInstance(eweg.class, ewegVar);
    }

    private eweg() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002\u001b\u0003Ȉ\u0004Ȉ", new Object[]{"b", "c", ewdx.class, "d", "e"});
        }
        if (ordinal == 3) {
            return new eweg();
        }
        if (ordinal == 4) {
            return new ewef();
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
        synchronized (eweg.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
