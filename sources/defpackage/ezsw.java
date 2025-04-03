package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ezsw extends eyfy implements eyht {
    public static final ezsw a;
    private static volatile eyhz b;

    static {
        ezsw ezswVar = new ezsw();
        a = ezswVar;
        eyfy.registerDefaultInstance(ezsw.class, ezswVar);
    }

    private ezsw() {
        emptyIntList();
        emptyLongList();
        emptyDoubleList();
        emptyIntList();
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
            return new ezsw();
        }
        if (ordinal == 4) {
            return new ezsv();
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
        synchronized (ezsw.class) {
            eyhzVar = b;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                b = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
