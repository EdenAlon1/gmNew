package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cudm extends eyfy implements eyht {
    public static final cudm a;
    private static volatile eyhz k;
    public int b;
    public String c = "";
    public boolean d;
    public int e;
    public long f;
    public int g;
    public boolean h;
    public boolean i;
    public int j;

    static {
        cudm cudmVar = new cudm();
        a = cudmVar;
        eyfy.registerDefaultInstance(cudm.class, cudmVar);
    }

    private cudm() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ለ\u0000\u0002ဇ\u0001\u0003င\u0002\u0004ဂ\u0003\u0005င\u0004\u0006ဇ\u0005\u0007ဇ\u0006\bင\u0007", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j"});
        }
        if (ordinal == 3) {
            return new cudm();
        }
        if (ordinal == 4) {
            return new cudl();
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
        synchronized (cudm.class) {
            eyhzVar = k;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                k = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
