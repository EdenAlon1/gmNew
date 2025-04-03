package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eswh extends eyfy implements eyht {
    public static final eswh a;
    private static volatile eyhz c;
    private String d = "";
    public String b = "";

    static {
        eswh eswhVar = new eswh();
        a = eswhVar;
        eyfy.registerDefaultInstance(eswh.class, eswhVar);
    }

    private eswh() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0004\u0002\u0000\u0000\u0000\u0001Ȉ\u0004Ȉ", new Object[]{"d", "b"});
        }
        if (ordinal == 3) {
            return new eswh();
        }
        if (ordinal == 4) {
            return new eswg();
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
        synchronized (eswh.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
