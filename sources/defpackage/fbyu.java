package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbyu extends eyfy implements eyht {
    public static final fbyu a;
    private static volatile eyhz c;
    public boolean b;

    static {
        fbyu fbyuVar = new fbyu();
        a = fbyuVar;
        eyfy.registerDefaultInstance(fbyu.class, fbyuVar);
    }

    private fbyu() {
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
            return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u0007", new Object[]{"b"});
        }
        if (ordinal == 3) {
            return new fbyu();
        }
        if (ordinal == 4) {
            return new fbyt();
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
        synchronized (fbyu.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
