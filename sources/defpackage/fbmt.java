package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbmt extends eyfy implements eyht {
    public static final fbmt a;
    private static volatile eyhz d;
    public String b = "";
    public fbmp c;
    private int e;

    static {
        fbmt fbmtVar = new fbmt();
        a = fbmtVar;
        eyfy.registerDefaultInstance(fbmt.class, fbmtVar);
    }

    private fbmt() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"e", "b", "c"});
        }
        if (ordinal == 3) {
            return new fbmt();
        }
        if (ordinal == 4) {
            return new fbms();
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
        synchronized (fbmt.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
