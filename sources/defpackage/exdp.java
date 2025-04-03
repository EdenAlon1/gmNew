package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class exdp extends eyfy implements eyht {
    public static final exdp a;
    private static volatile eyhz b;
    private eyhm c = eyhm.a;

    static {
        exdp exdpVar = new exdp();
        a = exdpVar;
        eyfy.registerDefaultInstance(exdp.class, exdpVar);
    }

    private exdp() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"c", exdo.a});
        }
        if (ordinal == 3) {
            return new exdp();
        }
        if (ordinal == 4) {
            return new exdn();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = b;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (exdp.class) {
            eyhzVar = b;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                b = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
