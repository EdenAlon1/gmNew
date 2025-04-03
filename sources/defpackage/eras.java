package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eras extends eyfy implements eyht {
    public static final eras a;
    private static volatile eyhz l;
    public int b;
    public boolean c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;

    static {
        eras erasVar = new eras();
        a = erasVar;
        eyfy.registerDefaultInstance(eras.class, erasVar);
    }

    private eras() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            eygg eyggVar = eraq.a;
            return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007᠌\u0006\b᠌\u0007\t᠌\b", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", eyggVar, "j", eyggVar, "k", eyggVar});
        }
        if (ordinal == 3) {
            return new eras();
        }
        if (ordinal == 4) {
            return new erap();
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
        synchronized (eras.class) {
            eyhzVar = l;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                l = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
