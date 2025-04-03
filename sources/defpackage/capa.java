package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class capa extends eyfy implements eyht {
    public static final capa a;
    private static volatile eyhz e;
    public int b;
    public boolean c = true;
    public boolean d = true;

    static {
        capa capaVar = new capa();
        a = capaVar;
        eyfy.registerDefaultInstance(capa.class, capaVar);
    }

    private capa() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဇ\u0000\u0003ဇ\u0001", new Object[]{"b", "c", "d"});
        }
        if (ordinal == 3) {
            return new capa();
        }
        if (ordinal == 4) {
            return new caoz();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = e;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (capa.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
