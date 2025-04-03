package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eylw extends eyfy implements eyht {
    public static final eylw a;
    private static volatile eyhz b;

    static {
        eylw eylwVar = new eylw();
        a = eylwVar;
        eyfy.registerDefaultInstance(eylw.class, eylwVar);
    }

    private eylw() {
        emptyProtobufList();
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0000", null);
        }
        if (ordinal == 3) {
            return new eylw();
        }
        if (ordinal == 4) {
            return new eylv();
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
        synchronized (eylw.class) {
            eyhzVar = b;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                b = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
