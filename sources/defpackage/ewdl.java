package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewdl extends eyfy implements eyht {
    public static final ewdl a;
    private static volatile eyhz b;
    private eyhm c = eyhm.a;

    static {
        ewdl ewdlVar = new ewdl();
        a = ewdlVar;
        eyfy.registerDefaultInstance(ewdl.class, ewdlVar);
    }

    private ewdl() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0003\u0003\u0001\u0001\u0000\u0000\u00032", new Object[]{"c", ewdk.a});
        }
        if (ordinal == 3) {
            return new ewdl();
        }
        if (ordinal == 4) {
            return new ewdj();
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
        synchronized (ewdl.class) {
            eyhzVar = b;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                b = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
