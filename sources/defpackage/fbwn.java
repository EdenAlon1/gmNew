package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbwn extends eyfy implements eyht {
    public static final fbwn a;
    private static volatile eyhz h;
    public String b = "";
    public String c = "";
    public int d;
    public int e;
    public long f;
    public int g;

    static {
        fbwn fbwnVar = new fbwn();
        a = fbwnVar;
        eyfy.registerDefaultInstance(fbwn.class, fbwnVar);
    }

    private fbwn() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0004\u0004\u0004\u0005\u0002\u0006\u0004", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (ordinal == 3) {
            return new fbwn();
        }
        if (ordinal == 4) {
            return new fbwm();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = h;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (fbwn.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
