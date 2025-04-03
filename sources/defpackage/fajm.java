package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fajm extends eyfy implements eyht {
    public static final fajm a;
    private static volatile eyhz e;
    public int b;
    public fajl c;
    public String d = "";

    static {
        fajm fajmVar = new fajm();
        a = fajmVar;
        eyfy.registerDefaultInstance(fajm.class, fajmVar);
    }

    private fajm() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002Ȉ", new Object[]{"b", "c", "d"});
        }
        if (ordinal == 3) {
            return new fajm();
        }
        if (ordinal == 4) {
            return new fajh();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = e;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (fajm.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
