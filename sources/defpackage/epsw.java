package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epsw extends eyfy implements eyht {
    public static final epsw a;
    private static volatile eyhz j;
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean f;
    public int g;
    public String h = "";
    public int i;

    static {
        epsw epswVar = new epsw();
        a = epswVar;
        eyfy.registerDefaultInstance(epsw.class, epswVar);
    }

    private epsw() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004ဇ\u0003\u0005င\u0004\u0006ဈ\u0005\u0007᠌\u0006", new Object[]{"b", "c", epsu.a, "d", epsp.a, "e", epss.a, "f", "g", "h", "i", epsr.a});
        }
        if (ordinal == 3) {
            return new epsw();
        }
        if (ordinal == 4) {
            return new epso();
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
        synchronized (epsw.class) {
            eyhzVar = j;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                j = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
