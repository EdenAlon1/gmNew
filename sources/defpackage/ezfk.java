package defpackage;

/* compiled from: PG */
@Deprecated
/* loaded from: classes5.dex */
public final class ezfk extends eyfy implements eyht {
    public static final ezfk a;
    private static volatile eyhz b;

    static {
        ezfk ezfkVar = new ezfk();
        a = ezfkVar;
        eyfy.registerDefaultInstance(ezfk.class, ezfkVar);
    }

    private ezfk() {
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
            return new ezfk();
        }
        if (ordinal == 4) {
            return new ezfj();
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
        synchronized (ezfk.class) {
            eyhzVar = b;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                b = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
