package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cumd extends eyfy implements eyht {
    public static final cumd a;
    private static volatile eyhz b;

    static {
        cumd cumdVar = new cumd();
        a = cumdVar;
        eyfy.registerDefaultInstance(cumd.class, cumdVar);
    }

    private cumd() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0000", null);
        }
        if (ordinal == 3) {
            return new cumd();
        }
        if (ordinal == 4) {
            return new cumc();
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
        synchronized (cumd.class) {
            eyhzVar = b;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                b = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
