package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eukc extends eyfy implements eyht {
    public static final eukc a;
    private static volatile eyhz h;
    public int b;
    public float c;
    public int d;
    public String e = "";
    public String f = "";
    public boolean g;

    static {
        eukc eukcVar = new eukc();
        a = eukcVar;
        eyfy.registerDefaultInstance(eukc.class, eukcVar);
    }

    private eukc() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0000\u0000\u0001\b\u0006\u0000\u0000\u0000\u0001\u0004\u0003\u0001\u0004\f\u0005Ȉ\u0006Ȉ\b\u0007", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (ordinal == 3) {
            return new eukc();
        }
        if (ordinal == 4) {
            return new eukb();
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
        synchronized (eukc.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
