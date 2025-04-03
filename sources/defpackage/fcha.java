package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fcha extends eyfy implements eyht {
    public static final fcha a;
    private static volatile eyhz d;
    public fces b;
    public fcho c;
    private int e;

    static {
        fcha fchaVar = new fcha();
        a = fchaVar;
        eyfy.registerDefaultInstance(fcha.class, fchaVar);
    }

    private fcha() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0001\u0003\u0006\u0002\u0000\u0000\u0000\u0003ဉ\u0001\u0006ဉ\u0003", new Object[]{"e", "b", "c"});
        }
        if (ordinal == 3) {
            return new fcha();
        }
        if (ordinal == 4) {
            return new fcgz();
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
        synchronized (fcha.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
