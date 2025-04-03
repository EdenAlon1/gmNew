package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eowb extends eyfy implements eyht {
    public static final eowb a;
    private static volatile eyhz h;
    public int b;
    public eoqk d;
    public int e;
    public long f;
    public String c = "";
    public eygi g = emptyIntList();

    static {
        eowb eowbVar = new eowb();
        a = eowbVar;
        eyfy.registerDefaultInstance(eowb.class, eowbVar);
    }

    private eowb() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003᠌\u0002\u0004ဂ\u0003\u0005ࠞ", new Object[]{"b", "c", "d", "e", eovn.a, "f", "g", eovz.a});
        }
        if (ordinal == 3) {
            return new eowb();
        }
        if (ordinal == 4) {
            return new eovy();
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
        synchronized (eowb.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
