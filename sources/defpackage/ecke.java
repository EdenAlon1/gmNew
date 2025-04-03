package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ecke extends eyfy<ecke, eckd> implements eyht {
    public static final ecke a;
    private static volatile eyhz j;
    public boolean b;
    public String c = "";
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    private int k;

    static {
        ecke eckeVar = new ecke();
        a = eckeVar;
        eyfy.registerDefaultInstance(ecke.class, eckeVar);
    }

    private ecke() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\bင\u0007", new Object[]{"k", "b", "c", "d", "e", "f", "g", "h", "i"});
        }
        if (ordinal == 3) {
            return new ecke();
        }
        if (ordinal == 4) {
            return new eckd();
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
        synchronized (ecke.class) {
            eyhzVar = j;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                j = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
