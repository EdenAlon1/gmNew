package defpackage;

/* compiled from: PG */
@Deprecated
/* loaded from: classes6.dex */
public final class fbeg extends eyfy implements eyht {
    public static final fbeg a;
    private static volatile eyhz j;
    public int b;
    public fbea f;
    public fbea g;
    public int h;
    public String c = "";
    public String d = "";
    public String e = "";
    public String i = "";

    static {
        fbeg fbegVar = new fbeg();
        a = fbegVar;
        eyfy.registerDefaultInstance(fbeg.class, fbegVar);
    }

    private fbeg() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0007\u0000\u0001\u0001\u000b\u0007\u0000\u0000\u0000\u0001Ȉ\u0005Ȉ\u0006Ȉ\u0007ဉ\u0000\bဉ\u0001\t\f\u000bȈ", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i"});
        }
        if (ordinal == 3) {
            return new fbeg();
        }
        if (ordinal == 4) {
            return new fbef();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = j;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (fbeg.class) {
            eyhzVar = j;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                j = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
