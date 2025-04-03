package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwte extends eyfy implements eyht {
    public static final dwte a;
    private static volatile eyhz i;
    public int b;
    public dwtm c;
    public long d;
    public String e = "";
    public int f;
    public long g;
    public long h;

    static {
        dwte dwteVar = new dwte();
        a = dwteVar;
        eyfy.registerDefaultInstance(dwte.class, dwteVar);
    }

    private dwte() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001\u0003င\u0003\u0004ဂ\u0004\u0005ဂ\u0005\u0006ဈ\u0002", new Object[]{"b", "c", "d", "f", "g", "h", "e"});
        }
        if (ordinal == 3) {
            return new dwte();
        }
        if (ordinal == 4) {
            return new dwtd();
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
        synchronized (dwte.class) {
            eyhzVar = i;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                i = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
