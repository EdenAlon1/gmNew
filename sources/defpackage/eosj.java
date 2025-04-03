package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eosj extends eyfy implements eyht {
    public static final eosj a;
    private static volatile eyhz k;
    public int b;
    public int c;
    public eohv d;
    public int e;
    public eoli f;
    public int g;
    public eowq h;
    public String i = "";
    public epgu j;

    static {
        eosj eosjVar = new eosj();
        a = eosjVar;
        eyfy.registerDefaultInstance(eosj.class, eosjVar);
    }

    private eosj() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003᠌\u0002\u0005ဉ\u0004\u0006᠌\u0005\u0007ဉ\u0006\bဈ\u0007\tဉ\b", new Object[]{"b", "c", eosf.a, "d", "e", eosg.a, "f", "g", eosh.a, "h", "i", "j"});
        }
        if (ordinal == 3) {
            return new eosj();
        }
        if (ordinal == 4) {
            return new eosi();
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
        synchronized (eosj.class) {
            eyhzVar = k;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                k = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
