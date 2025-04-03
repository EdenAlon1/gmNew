package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqat extends eyfy implements eyht {
    public static final eqat a;
    private static volatile eyhz j;
    public int b;
    public long c;
    public eygr d = emptyProtobufList();
    public int e;
    public int f;
    public eqfc g;
    public eqfq h;
    public epwy i;

    static {
        eqat eqatVar = new eqat();
        a = eqatVar;
        eyfy.registerDefaultInstance(eqat.class, eqatVar);
    }

    private eqat() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001ဂ\u0000\u0002\u001b\u0003᠌\u0001\u0004င\u0002\u0005ဉ\u0003\u0006ဉ\u0004\u0007ဉ\u0005", new Object[]{"b", "c", "d", eppr.class, "e", eqau.a, "f", "g", "h", "i"});
        }
        if (ordinal == 3) {
            return new eqat();
        }
        if (ordinal == 4) {
            return new eqas();
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
        synchronized (eqat.class) {
            eyhzVar = j;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                j = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
