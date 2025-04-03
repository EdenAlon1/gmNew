package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbim extends eyfy implements eyht {
    public static final fbim a;
    private static volatile eyhz e;
    public Object c;
    public int b = 0;
    public String d = "";

    static {
        fbim fbimVar = new fbim();
        a = fbimVar;
        eyfy.registerDefaultInstance(fbim.class, fbimVar);
    }

    private fbim() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001=\u0000\u0002Ȼ\u0000\u0003Ȉ", new Object[]{"c", "b", "d"});
        }
        if (ordinal == 3) {
            return new fbim();
        }
        if (ordinal == 4) {
            return new fbil();
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
        synchronized (fbim.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
