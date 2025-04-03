package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbzc extends eyfy implements eyht {
    public static final fbzc a;
    private static volatile eyhz c;
    public fcfq b;
    private int d;

    static {
        fbzc fbzcVar = new fbzc();
        a = fbzcVar;
        eyfy.registerDefaultInstance(fbzc.class, fbzcVar);
    }

    private fbzc() {
        eyee eyeeVar = eyee.b;
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"d", "b"});
        }
        if (ordinal == 3) {
            return new fbzc();
        }
        if (ordinal == 4) {
            return new fbzb();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = c;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (fbzc.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
