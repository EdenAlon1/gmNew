package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbwd extends eyfy implements eyht {
    public static final fbwd a;
    private static volatile eyhz c;
    public long b;

    static {
        fbwd fbwdVar = new fbwd();
        a = fbwdVar;
        eyfy.registerDefaultInstance(fbwd.class, fbwdVar);
    }

    private fbwd() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0002", new Object[]{"b"});
        }
        if (ordinal == 3) {
            return new fbwd();
        }
        if (ordinal == 4) {
            return new fbwc();
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
        synchronized (fbwd.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
