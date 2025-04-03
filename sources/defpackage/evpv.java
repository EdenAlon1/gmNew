package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evpv extends eyfy implements eyht {
    public static final evpv a;
    private static volatile eyhz f;
    public int b;
    public evpr d;
    public int c = 1;
    public eygr e = emptyProtobufList();

    static {
        evpv evpvVar = new evpv();
        a = evpvVar;
        eyfy.registerDefaultInstance(evpv.class, evpvVar);
    }

    private evpv() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003\u001b", new Object[]{"b", "c", evpp.a, "d", "e", evpt.class});
        }
        if (ordinal == 3) {
            return new evpv();
        }
        if (ordinal == 4) {
            return new evpu();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = f;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (evpv.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
