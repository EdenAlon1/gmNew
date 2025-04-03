package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eylk extends eyfy implements eyht {
    public static final eylk a;
    private static volatile eyhz h;
    public int b;
    public int d;
    public int e;
    public int f;
    public String c = "";
    public String g = "";

    static {
        eylk eylkVar = new eylk();
        a = eylkVar;
        eyfy.registerDefaultInstance(eylk.class, eylkVar);
    }

    private eylk() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\f\u0004\u0004\u0005ለ\u0000", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (ordinal == 3) {
            return new eylk();
        }
        if (ordinal == 4) {
            return new eylj();
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
        synchronized (eylk.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
