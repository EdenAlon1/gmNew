package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clni extends eyfy implements eyht {
    public static final clni a;
    private static volatile eyhz f;
    public int b;
    public eydq c;
    public clns d;
    public eygr e = emptyProtobufList();

    static {
        clni clniVar = new clni();
        a = clniVar;
        eyfy.registerDefaultInstance(clni.class, clniVar);
    }

    private clni() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0003ဉ\u0002\u0004\u001b", new Object[]{"b", "c", "d", "e", clqv.class});
        }
        if (ordinal == 3) {
            return new clni();
        }
        if (ordinal == 4) {
            return new clnh();
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
        synchronized (clni.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
