package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbfw extends eyfy implements eyht {
    public static final fbfw a;
    private static volatile eyhz g;
    public int b;
    public fcfo c;
    public eyee d = eyee.b;
    public eygi e = emptyIntList();
    public String f = "";

    static {
        fbfw fbfwVar = new fbfw();
        a = fbfwVar;
        eyfy.registerDefaultInstance(fbfw.class, fbfwVar);
    }

    private fbfw() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002\n\u0003,\u0004Ȉ", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (ordinal == 3) {
            return new fbfw();
        }
        if (ordinal == 4) {
            return new fbfv();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = g;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (fbfw.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
