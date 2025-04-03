package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drer extends eyfy implements eyht {
    public static final drer a;
    private static volatile eyhz i;
    public int b;
    public Object d;
    public drqs h;
    public int c = 0;
    public String e = "";
    public String f = "";
    public String g = "";

    static {
        drer drerVar = new drer();
        a = drerVar;
        eyfy.registerDefaultInstance(drer.class, drerVar);
    }

    private drer() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0001\u0001\u0001È\u0005\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002dဉ\u0003È<\u0000", new Object[]{"d", "c", "b", "e", "f", "g", "h", dreq.class});
        }
        if (ordinal == 3) {
            return new drer();
        }
        if (ordinal == 4) {
            return new dreo();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = i;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (drer.class) {
            eyhzVar = i;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                i = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
