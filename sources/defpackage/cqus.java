package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cqus extends eyfy implements eyht {
    public static final cqus a;
    private static volatile eyhz j;
    public int b;
    public int c;
    public int h;
    public String d = "";
    public String e = "";
    public String f = "";
    public eyee g = eyee.b;
    public String i = "";

    static {
        cqus cqusVar = new cqus();
        a = cqusVar;
        eyfy.registerDefaultInstance(cqus.class, cqusVar);
    }

    private cqus() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ည\u0004\u0006င\u0005\u0007ဈ\u0006", new Object[]{"b", "c", cquq.a, "d", "e", "f", "g", "h", "i"});
        }
        if (ordinal == 3) {
            return new cqus();
        }
        if (ordinal == 4) {
            return new cqup();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = j;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (cqus.class) {
            eyhzVar = j;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                j = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
