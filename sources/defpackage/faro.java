package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class faro extends eyfy implements eyht {
    public static final faro a;
    private static volatile eyhz b;
    private eyhm c = eyhm.a;
    private eyhm d = eyhm.a;

    static {
        faro faroVar = new faro();
        a = faroVar;
        eyfy.registerDefaultInstance(faro.class, faroVar);
    }

    private faro() {
        eyfy.emptyProtobufList();
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0000\u0006\u0007\u0002\u0002\u0000\u0000\u00062\u00072", new Object[]{"c", farn.a, "d", farm.a});
        }
        if (ordinal == 3) {
            return new faro();
        }
        if (ordinal == 4) {
            return new farl();
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
        synchronized (faro.class) {
            eyhzVar = b;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                b = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
