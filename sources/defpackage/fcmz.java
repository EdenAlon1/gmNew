package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fcmz extends eyfy implements eyht {
    public static final fcmz a;
    private static volatile eyhz b;

    static {
        fcmz fcmzVar = new fcmz();
        a = fcmzVar;
        eyfy.registerDefaultInstance(fcmz.class, fcmzVar);
    }

    private fcmz() {
        emptyIntList();
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
            return newMessageInfo(a, "\u0000\u0000", null);
        }
        if (ordinal == 3) {
            return new fcmz();
        }
        if (ordinal == 4) {
            return new fcmy();
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
        synchronized (fcmz.class) {
            eyhzVar = b;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                b = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
