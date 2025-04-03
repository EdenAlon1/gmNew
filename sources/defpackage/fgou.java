package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgou extends eyfy implements eyht {
    public static final fgou a;
    private static volatile eyhz d;
    public int b;
    public eyev c;

    static {
        fgou fgouVar = new fgou();
        a = fgouVar;
        eyfy.registerDefaultInstance(fgou.class, fgouVar);
    }

    private fgou() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဉ\u0000", new Object[]{"b", "c"});
        }
        if (ordinal == 3) {
            return new fgou();
        }
        if (ordinal == 4) {
            return new fgot();
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
        synchronized (fgou.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
