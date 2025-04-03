package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbug extends eyfy implements eyht {
    public static final fbug a;
    private static volatile eyhz h;
    public long e;
    public String b = "";
    public String c = "";
    public String d = "";
    public String f = "";
    public String g = "";

    static {
        fbug fbugVar = new fbug();
        a = fbugVar;
        eyfy.registerDefaultInstance(fbug.class, fbugVar);
    }

    private fbug() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\u0002\u0005Ȉ\u0006Ȉ", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (ordinal == 3) {
            return new fbug();
        }
        if (ordinal == 4) {
            return new fbuf();
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
        synchronized (fbug.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
