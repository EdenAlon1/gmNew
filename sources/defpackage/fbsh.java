package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbsh extends eyfy implements fbsi {
    public static final fbsh a;
    private static volatile eyhz f;
    public int b;
    public fcfy d;
    public String c = "";
    public String e = "";

    static {
        fbsh fbshVar = new fbsh();
        a = fbshVar;
        eyfy.registerDefaultInstance(fbsh.class, fbshVar);
    }

    private fbsh() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003Ȉ", new Object[]{"b", "c", "d", "e"});
        }
        if (ordinal == 3) {
            return new fbsh();
        }
        if (ordinal == 4) {
            return new fbsg();
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
        synchronized (fbsh.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
