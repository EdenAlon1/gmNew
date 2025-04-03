package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cksv extends eyfy implements eyht {
    public static final cksv a;
    private static volatile eyhz j;
    public int b;
    public long e;
    public eyja f;
    public int i;
    public String c = "";
    public String d = "";
    public String g = "";
    public String h = "";

    static {
        cksv cksvVar = new cksv();
        a = cksvVar;
        eyfy.registerDefaultInstance(cksv.class, cksvVar);
    }

    private cksv() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0002\u0004ဉ\u0000\u0005Ȉ\u0006Ȉ\u0007\u0004", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i"});
        }
        if (ordinal == 3) {
            return new cksv();
        }
        if (ordinal == 4) {
            return new cksu();
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
        synchronized (cksv.class) {
            eyhzVar = j;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                j = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
