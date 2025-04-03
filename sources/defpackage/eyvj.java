package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eyvj extends eyfy implements eyht {
    public static final eyvj a;
    private static volatile eyhz e;
    public int b;
    public int c;
    public boolean d;

    static {
        eyvj eyvjVar = new eyvj();
        a = eyvjVar;
        eyfy.registerDefaultInstance(eyvj.class, eyvjVar);
    }

    private eyvj() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001", new Object[]{"b", "c", eyvi.a, "d"});
        }
        if (ordinal == 3) {
            return new eyvj();
        }
        if (ordinal == 4) {
            return new eyvh();
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
        synchronized (eyvj.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
