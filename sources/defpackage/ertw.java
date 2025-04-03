package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ertw extends eyfy implements eyht {
    public static final ertw a;
    private static volatile eyhz r;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;

    static {
        ertw ertwVar = new ertw();
        a = ertwVar;
        eyfy.registerDefaultInstance(ertw.class, ertwVar);
    }

    private ertw() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0010\u0000\u0000\u0001\u0012\u0010\u0000\u0000\u0000\u0001\u0007\u0003\u0007\u0004\u0007\u0005\u0007\u0006\u0007\u0007\u0007\b\u0007\t\u0007\n\u0007\f\u0007\r\u0007\u000e\u0007\u000f\u0007\u0010\u0007\u0011\u0007\u0012\u0007", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q"});
        }
        if (ordinal == 3) {
            return new ertw();
        }
        if (ordinal == 4) {
            return new ertv();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = r;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (ertw.class) {
            eyhzVar = r;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                r = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
