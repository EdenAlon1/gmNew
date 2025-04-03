package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class crcb extends eyfy implements eyht {
    public static final crcb a;
    private static volatile eyhz m;
    public int b;
    public String c = "";
    public String d = "";
    public String e = "";
    public eyee f = eyee.b;
    public String g = "";
    public String h = "";
    public awup i;
    public awup j;
    public long k;
    public awui l;

    static {
        crcb crcbVar = new crcb();
        a = crcbVar;
        eyfy.registerDefaultInstance(crcb.class, crcbVar);
    }

    private crcb() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\u000b\n\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဈ\u0001\u0004ဈ\u0002\u0005ည\u0003\u0006ဈ\u0004\u0007ဈ\u0005\bဉ\u0006\tဉ\u0007\nဂ\b\u000bဉ\t", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l"});
        }
        if (ordinal == 3) {
            return new crcb();
        }
        if (ordinal == 4) {
            return new crca();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = m;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (crcb.class) {
            eyhzVar = m;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                m = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
