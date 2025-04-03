package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rsy extends eyfy implements eyht {
    public static final rsy a;
    private static volatile eyhz g;
    public int b;
    public eygr c = emptyProtobufList();
    public rtu d;
    public long e;
    public int f;

    static {
        rsy rsyVar = new rsy();
        a = rsyVar;
        eyfy.registerDefaultInstance(rsy.class, rsyVar);
    }

    private rsy() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000\u0003ဃ\u0001\u0004᠌\u0002", new Object[]{"b", "c", rta.class, "d", "e", "f", rul.a});
        }
        if (ordinal == 3) {
            return new rsy();
        }
        if (ordinal == 4) {
            return new rsx();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = g;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (rsy.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
