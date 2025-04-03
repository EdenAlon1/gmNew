package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ecxm extends eyfy implements eyht {
    public static final ecxm a;
    private static volatile eyhz g;
    public long e;
    private int h;
    public eyhm f = eyhm.a;
    public String b = "";
    public eyee c = eyee.b;
    public String d = "";

    static {
        ecxm ecxmVar = new ecxm();
        a = ecxmVar;
        eyfy.registerDefaultInstance(ecxm.class, ecxmVar);
    }

    private ecxm() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0001\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u00052", new Object[]{"h", "b", "c", "d", "e", "f", ecxl.a});
        }
        if (ordinal == 3) {
            return new ecxm();
        }
        if (ordinal == 4) {
            return new ecxk();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = g;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (ecxm.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
