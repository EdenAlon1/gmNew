package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbiu extends eyfy implements eyht {
    public static final fbiu a;
    private static volatile eyhz e;
    public fbhu c;
    private int f;
    public String b = "";
    public eyee d = eyee.b;

    static {
        fbiu fbiuVar = new fbiu();
        a = fbiuVar;
        eyfy.registerDefaultInstance(fbiu.class, fbiuVar);
    }

    private fbiu() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003\n", new Object[]{"f", "b", "c", "d"});
        }
        if (ordinal == 3) {
            return new fbiu();
        }
        if (ordinal == 4) {
            return new fbit();
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
        synchronized (fbiu.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
