package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adcy extends eyfy implements eyht {
    public static final adcy a;
    private static volatile eyhz j;
    public String b = "";
    public eygr c = eyfy.emptyProtobufList();
    public int d;
    public int e;
    public int f;
    public int g;
    public long h;
    public long i;

    static {
        adcy adcyVar = new adcy();
        a = adcyVar;
        eyfy.registerDefaultInstance(adcy.class, adcyVar);
    }

    private adcy() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\b\u0000\u0000\u0001\t\b\u0000\u0001\u0000\u0001Ȉ\u0003Ț\u0004\f\u0005\f\u0006\f\u0007\u0004\b\u0002\t\u0002", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i"});
        }
        if (ordinal == 3) {
            return new adcy();
        }
        if (ordinal == 4) {
            return new adcu();
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
        synchronized (adcy.class) {
            eyhzVar = j;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                j = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
