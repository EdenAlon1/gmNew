package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fivm extends eyfy implements eyht {
    public static final fivm a;
    private static volatile eyhz d;
    public int b = 0;
    public Object c;

    static {
        fivm fivmVar = new fivm();
        a = fivmVar;
        eyfy.registerDefaultInstance(fivm.class, fivmVar);
    }

    private fivm() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"c", "b", fivh.class, fivr.class, fivt.class});
        }
        if (ordinal == 3) {
            return new fivm();
        }
        if (ordinal == 4) {
            return new fivk();
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
        synchronized (fivm.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
