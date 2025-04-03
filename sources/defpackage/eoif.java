package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eoif extends eyfy implements eyht {
    public static final eoif a;
    private static volatile eyhz l;
    public int b;
    public boolean c;
    public int d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;

    static {
        eoif eoifVar = new eoif();
        a = eoifVar;
        eyfy.registerDefaultInstance(eoif.class, eoifVar);
    }

    private eoif() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဇ\u0000\u0002᠌\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006\bဇ\u0007\tဇ\b", new Object[]{"b", "c", "d", eowo.a, "e", "f", "g", "h", "i", "j", "k"});
        }
        if (ordinal == 3) {
            return new eoif();
        }
        if (ordinal == 4) {
            return new eoie();
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
        synchronized (eoif.class) {
            eyhzVar = l;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                l = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
