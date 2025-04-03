package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fart extends eyfy implements eyht {
    public static final fart a;
    private static volatile eyhz b;
    private eyhm c = eyhm.a;

    static {
        fart fartVar = new fart();
        a = fartVar;
        eyfy.registerDefaultInstance(fart.class, fartVar);
    }

    private fart() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0003\u0003\u0001\u0001\u0000\u0000\u00032", new Object[]{"c", fars.a});
        }
        if (ordinal == 3) {
            return new fart();
        }
        if (ordinal == 4) {
            return new farr();
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
        synchronized (fart.class) {
            eyhzVar = b;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                b = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
