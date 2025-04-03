package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tix extends eyfy implements eyht {
    public static final tix a;
    private static volatile eyhz e;
    public int b;
    public String c = "";
    public boolean d;
    private int f;

    static {
        tix tixVar = new tix();
        a = tixVar;
        eyfy.registerDefaultInstance(tix.class, tixVar);
    }

    private tix() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဇ\u0002", new Object[]{"f", "b", eszv.a, "c", "d"});
        }
        if (ordinal == 3) {
            return new tix();
        }
        if (ordinal == 4) {
            return new tiw();
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
        synchronized (tix.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
