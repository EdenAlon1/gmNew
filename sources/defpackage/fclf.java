package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fclf extends eyfy implements eyht {
    public static final fclf a;
    private static volatile eyhz d;
    public fcek b;
    public eygr c = emptyProtobufList();
    private int e;

    static {
        fclf fclfVar = new fclf();
        a = fclfVar;
        eyfy.registerDefaultInstance(fclf.class, fclfVar);
    }

    private fclf() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"e", "b", "c", fcle.class});
        }
        if (ordinal == 3) {
            return new fclf();
        }
        if (ordinal == 4) {
            return new fclc();
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
        synchronized (fclf.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
