package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eyqy extends eyfy implements eyht {
    public static final eyqy a;
    private static volatile eyhz i;
    public int b;
    public int c = 0;
    public Object d;
    public int e;
    public int f;
    public int g;
    public int h;

    static {
        eyqy eyqyVar = new eyqy();
        a = eyqyVar;
        eyfy.registerDefaultInstance(eyqy.class, eyqyVar);
    }

    private eyqy() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003᠌\u0002\u0004<\u0000\u0005᠌\u0003", new Object[]{"d", "c", "b", "e", eyqs.a, "f", "g", eyqw.a, eyqq.class, "h", eyqu.a});
        }
        if (ordinal == 3) {
            return new eyqy();
        }
        if (ordinal == 4) {
            return new eyqr();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = i;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (eyqy.class) {
            eyhzVar = i;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                i = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
