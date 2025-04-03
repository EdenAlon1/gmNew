package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etau extends eyfy implements eyht {
    public static final etau a;
    private static volatile eyhz h;
    public int b;
    public eswh c;
    public eswm e;
    public int f;
    public String d = "";
    public eygi g = emptyIntList();

    static {
        etau etauVar = new etau();
        a = etauVar;
        eyfy.registerDefaultInstance(etau.class, etauVar);
    }

    private etau() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0000\u0001ဉ\u0000\u0002Ȉ\u0003ဉ\u0001\u0005\f\u0006,", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (ordinal == 3) {
            return new etau();
        }
        if (ordinal == 4) {
            return new etas();
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
        synchronized (etau.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
