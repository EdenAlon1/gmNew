package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbzx extends eyfy<fbzx, fbzw> implements eyht {
    public static final fbzx a;
    private static volatile eyhz d;
    public fcfq b;
    public long c;
    private int e;

    static {
        fbzx fbzxVar = new fbzx();
        a = fbzxVar;
        eyfy.registerDefaultInstance(fbzx.class, fbzxVar);
    }

    private fbzx() {
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
            return newMessageInfo(a, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0002", new Object[]{"e", "b", "c"});
        }
        if (ordinal == 3) {
            return new fbzx();
        }
        if (ordinal == 4) {
            return new fbzw();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = d;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (fbzx.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
