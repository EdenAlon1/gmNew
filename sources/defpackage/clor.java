package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clor extends eyfy implements eyht {
    public static final clor a;
    private static volatile eyhz e;
    public int b;
    public boolean c;
    public int d;

    static {
        clor clorVar = new clor();
        a = clorVar;
        eyfy.registerDefaultInstance(clor.class, clorVar);
    }

    private clor() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002᠌\u0001", new Object[]{"b", "c", "d", clop.a});
        }
        if (ordinal == 3) {
            return new clor();
        }
        if (ordinal == 4) {
            return new cloo();
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
        synchronized (clor.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
