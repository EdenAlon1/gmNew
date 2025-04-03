package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbzn extends eyfy implements eyht {
    public static final fbzn a;
    private static volatile eyhz e;
    public int b = 0;
    public Object c;
    public int d;

    static {
        fbzn fbznVar = new fbzn();
        a = fbznVar;
        eyfy.registerDefaultInstance(fbzn.class, fbznVar);
    }

    private fbzn() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0007\u0001\u0000\u0001n\u0007\u0000\u0000\u0000\u0001\fi<\u0000j<\u0000k<\u0000l<\u0000m<\u0000n<\u0000", new Object[]{"c", "b", "d", fcgw.class, fcgg.class, fcht.class, fcgq.class, fcgo.class, fcgm.class});
        }
        if (ordinal == 3) {
            return new fbzn();
        }
        if (ordinal == 4) {
            return new fbzl();
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
        synchronized (fbzn.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
