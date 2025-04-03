package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class exhp extends eyfy implements eyht {
    public static final exhp a;
    private static volatile eyhz f;
    public int c;
    public int d;
    public String b = "";
    public eygr e = emptyProtobufList();

    static {
        exhp exhpVar = new exhp();
        a = exhpVar;
        eyfy.registerDefaultInstance(exhp.class, exhpVar);
    }

    private exhp() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002\u0004\u0003\u0004\u0004\u001b", new Object[]{"b", "c", "d", "e", exgv.class});
        }
        if (ordinal == 3) {
            return new exhp();
        }
        if (ordinal == 4) {
            return new exho();
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
        synchronized (exhp.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
