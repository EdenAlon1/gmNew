package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbhu extends eyfy implements eyht {
    public static final fbhu a;
    private static volatile eyhz l;
    public int b;
    public Object d;
    public Object f;
    public fbik h;
    public long i;
    public int j;
    public int k;
    public int c = 0;
    public int e = 0;
    public String g = "";

    static {
        fbhu fbhuVar = new fbhu();
        a = fbhuVar;
        eyfy.registerDefaultInstance(fbhu.class, fbhuVar);
    }

    private fbhu() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u000e\u0002\u0001\u0002É\u000e\u0000\u0000\u0000\u0002\f\u0003Ȉ\u0004ဉ\u0000\u0005\u0002\u0006\fe<\u0000f<\u0000g<\u0000h<\u0000i<\u0000j<\u0000k<\u0000l<\u0000É<\u0001", new Object[]{"d", "c", "f", "e", "b", "j", "g", "h", "i", "k", fbjc.class, fbhk.class, fbjo.class, fbiy.class, fbhg.class, fbjg.class, fbjk.class, fbhq.class, fbjg.class});
        }
        if (ordinal == 3) {
            return new fbhu();
        }
        if (ordinal == 4) {
            return new fbht();
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
        synchronized (fbhu.class) {
            eyhzVar = l;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                l = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
