package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epgu extends eyfy implements eyht {
    public static final epgu a;
    private static volatile eyhz k;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public epgo g;
    public int h;
    public epbq i;
    public eqpc j;

    static {
        epgu epguVar = new epgu();
        a = epguVar;
        eyfy.registerDefaultInstance(epgu.class, epguVar);
    }

    private epgu() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0000\u0000\u0001᠌\u0000\u0003᠌\u0002\u0004င\u0003\u0005င\u0004\u0006ဉ\u0005\u0007᠌\u0006\bဉ\u0007\tဉ\b", new Object[]{"b", "c", epgq.a, "d", epgs.a, "e", "f", "g", "h", clzc.a, "i", "j"});
        }
        if (ordinal == 3) {
            return new epgu();
        }
        if (ordinal == 4) {
            return new epgp();
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
        synchronized (epgu.class) {
            eyhzVar = k;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                k = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
