package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eotw extends eyfy implements eyht {
    public static final eotw a;
    private static volatile eyhz k;
    public int b;
    public int c;
    public boolean d;
    public int e;
    public eotv f;
    public int g = -1;
    public eygi h = emptyIntList();
    public String i = "";
    public int j;

    static {
        eotw eotwVar = new eotw();
        a = eotwVar;
        eyfy.registerDefaultInstance(eotw.class, eotwVar);
    }

    private eotw() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဇ\u0001\u0003᠌\u0002\u0004ဉ\u0003\u0005င\u0004\u0006'\u0007ဈ\u0005\b᠌\u0006", new Object[]{"b", "c", "d", "e", eott.a, "f", "g", "h", "i", "j", eqwe.a});
        }
        if (ordinal == 3) {
            return new eotw();
        }
        if (ordinal == 4) {
            return new eots();
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
        synchronized (eotw.class) {
            eyhzVar = k;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                k = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
