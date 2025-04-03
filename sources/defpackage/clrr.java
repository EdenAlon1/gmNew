package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clrr extends eyfy implements eyht {
    public static final clrr a;
    private static volatile eyhz f;
    public int b;
    public eydq c;
    public clns d;
    public clqx e;

    static {
        clrr clrrVar = new clrr();
        a = clrrVar;
        eyfy.registerDefaultInstance(clrr.class, clrrVar);
    }

    private clrr() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0003ဉ\u0002\u0005ဉ\u0004", new Object[]{"b", "c", "d", "e"});
        }
        if (ordinal == 3) {
            return new clrr();
        }
        if (ordinal == 4) {
            return new clrq();
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
        synchronized (clrr.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
