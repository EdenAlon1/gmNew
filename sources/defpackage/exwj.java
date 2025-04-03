package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class exwj extends eyfy implements eyht {
    public static final exwj a;
    private static volatile eyhz e;
    public Object c;
    private int f;
    public int b = 0;
    public eyee d = eyee.b;

    static {
        exwj exwjVar = new exwj();
        a = exwjVar;
        eyfy.registerDefaultInstance(exwj.class, exwjVar);
    }

    private exwj() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002ည\u0000\u0003=\u0000", new Object[]{"c", "b", "f", exwl.class, "d"});
        }
        if (ordinal == 3) {
            return new exwj();
        }
        if (ordinal == 4) {
            return new exwi();
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
        synchronized (exwj.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
