package defpackage;

/* compiled from: PG */
@Deprecated
/* loaded from: classes5.dex */
public final class ezfm extends eyfy implements eyht {
    public static final ezfm a;
    private static volatile eyhz b;

    static {
        ezfm ezfmVar = new ezfm();
        a = ezfmVar;
        eyfy.registerDefaultInstance(ezfm.class, ezfmVar);
    }

    private ezfm() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0000", null);
        }
        if (ordinal == 3) {
            return new ezfm();
        }
        if (ordinal == 4) {
            return new ezfl();
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
        synchronized (ezfm.class) {
            eyhzVar = b;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                b = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
