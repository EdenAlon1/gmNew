package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbml extends eyfy implements eyht {
    public static final fbml a;
    private static volatile eyhz k;
    public int b;
    public String c = "";
    public String d = "";
    public fbhu e;
    public faul f;
    public faul g;
    public faul h;
    public boolean i;
    public fbii j;

    static {
        fbml fbmlVar = new fbml();
        a = fbmlVar;
        eyfy.registerDefaultInstance(fbml.class, fbmlVar);
    }

    private fbml() {
        eyee eyeeVar = eyee.b;
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\b\u0000\u0001\u0001\u000b\b\u0000\u0000\u0000\u0001Ȉ\u0003ဉ\u0000\u0004ဉ\u0001\u0005ဉ\u0002\u0007ဉ\u0004\t\u0007\nဉ\u0005\u000bȈ", new Object[]{"b", "c", "e", "f", "g", "h", "i", "j", "d"});
        }
        if (ordinal == 3) {
            return new fbml();
        }
        if (ordinal == 4) {
            return new fbmk();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = k;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (fbml.class) {
            eyhzVar = k;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                k = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
