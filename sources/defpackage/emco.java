package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emco extends eyfy implements eyht {
    public static final emco a;
    private static volatile eyhz b;
    private eyhm c = eyhm.a;

    static {
        emco emcoVar = new emco();
        a = emcoVar;
        eyfy.registerDefaultInstance(emco.class, emcoVar);
    }

    private emco() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u000b\u000b\u0001\u0001\u0000\u0000\u000b2", new Object[]{"c", emcn.a});
        }
        if (ordinal == 3) {
            return new emco();
        }
        if (ordinal == 4) {
            return new emcm();
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
        synchronized (emco.class) {
            eyhzVar = b;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                b = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
