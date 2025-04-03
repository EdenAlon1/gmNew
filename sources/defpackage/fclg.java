package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fclg extends eyfy implements eyht {
    public static final fclg a;
    private static volatile eyhz d;
    public fcfq b;
    public eygr c = emptyProtobufList();
    private int e;

    static {
        fclg fclgVar = new fclg();
        a = fclgVar;
        eyfy.registerDefaultInstance(fclg.class, fclgVar);
    }

    private fclg() {
        emptyProtobufList();
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"e", "b", "c", fclf.class});
        }
        if (ordinal == 3) {
            return new fclg();
        }
        if (ordinal == 4) {
            return new fclb();
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
        synchronized (fclg.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
