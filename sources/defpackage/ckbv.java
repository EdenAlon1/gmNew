package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckbv extends eyfy implements eyht {
    public static final ckbv a;
    private static volatile eyhz b;

    static {
        ckbv ckbvVar = new ckbv();
        a = ckbvVar;
        eyfy.registerDefaultInstance(ckbv.class, ckbvVar);
    }

    private ckbv() {
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
            return new ckbv();
        }
        if (ordinal == 4) {
            return new ckbu();
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
        synchronized (ckbv.class) {
            eyhzVar = b;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                b = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
