package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbja extends eyfy implements eyht {
    public static final fbja a;
    private static volatile eyhz l;
    public int b;
    public fbhu c;
    public eyee d = eyee.b;
    public String e = "";
    public int f;
    public fbii g;
    public int h;
    public boolean i;
    public boolean j;
    public boolean k;

    static {
        fbja fbjaVar = new fbja();
        a = fbjaVar;
        eyfy.registerDefaultInstance(fbja.class, fbjaVar);
    }

    private fbja() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဉ\u0000\u0002\n\u0003Ȉ\u0004\u0004\u0005ဉ\u0001\u0006\f\u0007\u0007\b\u0007\t\u0007", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k"});
        }
        if (ordinal == 3) {
            return new fbja();
        }
        if (ordinal == 4) {
            return new fbiz();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = l;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (fbja.class) {
            eyhzVar = l;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                l = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
