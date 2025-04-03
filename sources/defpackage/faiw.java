package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class faiw extends eyfy implements eyht {
    public static final faiw a;
    private static volatile eyhz d;
    public boolean b;
    public String c = "";

    static {
        faiw faiwVar = new faiw();
        a = faiwVar;
        eyfy.registerDefaultInstance(faiw.class, faiwVar);
    }

    private faiw() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002Ȉ", new Object[]{"b", "c"});
        }
        if (ordinal == 3) {
            return new faiw();
        }
        if (ordinal == 4) {
            return new faiv();
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
        synchronized (faiw.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
