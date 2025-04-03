package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbdn extends eyfy implements eyht {
    public static final fbdn a;
    private static volatile eyhz f;
    public int b;
    public int c;
    public String d = "";
    public eylw e;

    static {
        fbdn fbdnVar = new fbdn();
        a = fbdnVar;
        eyfy.registerDefaultInstance(fbdn.class, fbdnVar);
    }

    private fbdn() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001\f\u0003Ȉ\u0004ဉ\u0000", new Object[]{"b", "c", "d", "e"});
        }
        if (ordinal == 3) {
            return new fbdn();
        }
        if (ordinal == 4) {
            return new fbdm();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = f;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (fbdn.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
