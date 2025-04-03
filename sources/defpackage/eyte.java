package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eyte extends eyfy implements eyht {
    public static final eyte a;
    private static volatile eyhz h;
    public int b;
    public String c = "";
    public boolean d;
    public boolean e;
    public boolean f;
    public int g;

    static {
        eyte eyteVar = new eyte();
        a = eyteVar;
        eyfy.registerDefaultInstance(eyte.class, eyteVar);
    }

    private eyte() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003\u0007\u0004\u0007\u0005\u0007\u0006\f", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (ordinal == 3) {
            return new eyte();
        }
        if (ordinal == 4) {
            return new eytb();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = h;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (eyte.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
