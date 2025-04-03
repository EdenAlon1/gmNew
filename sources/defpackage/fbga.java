package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbga extends eyfy implements eyht {
    public static final fbga a;
    private static volatile eyhz g;
    public int b;
    public String c = "";
    public fbii d;
    public String e;
    public fbhu f;
    private int h;

    static {
        fbga fbgaVar = new fbga();
        a = fbgaVar;
        eyfy.registerDefaultInstance(fbga.class, fbgaVar);
    }

    private fbga() {
        eyee eyeeVar = eyee.b;
        this.e = "";
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001\u0004\u0002Ȉ\u0004ဉ\u0001\u0005Ȉ\u0006ဉ\u0000", new Object[]{"h", "b", "c", "f", "e", "d"});
        }
        if (ordinal == 3) {
            return new fbga();
        }
        if (ordinal == 4) {
            return new fbfz();
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
        synchronized (fbga.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
