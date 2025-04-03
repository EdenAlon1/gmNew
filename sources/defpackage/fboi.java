package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fboi extends eyfy implements eyht {
    public static final fboi a;
    private static volatile eyhz g;
    public int b;
    public fcfo c;
    public fbik d;
    public fbnz e;
    public eygi f = emptyIntList();

    static {
        fboi fboiVar = new fboi();
        a = fboiVar;
        eyfy.registerDefaultInstance(fboi.class, fboiVar);
    }

    private fboi() {
        emptyIntList();
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0002\u0004ဉ\u0001\u0005,", new Object[]{"b", "c", "e", "d", "f"});
        }
        if (ordinal == 3) {
            return new fboi();
        }
        if (ordinal == 4) {
            return new fboh();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = g;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (fboi.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
