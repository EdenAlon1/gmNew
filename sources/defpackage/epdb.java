package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epdb extends eyfy implements eyht {
    public static final epdb a;
    private static volatile eyhz l;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;

    static {
        epdb epdbVar = new epdb();
        a = epdbVar;
        eyfy.registerDefaultInstance(epdb.class, epdbVar);
    }

    private epdb() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001င\u0000\u0002᠌\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\bင\u0007\tင\b", new Object[]{"b", "c", "d", eowo.a, "e", "f", "g", "h", "i", "j", "k"});
        }
        if (ordinal == 3) {
            return new epdb();
        }
        if (ordinal == 4) {
            return new epda();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = l;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (epdb.class) {
            eyhzVar = l;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                l = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
