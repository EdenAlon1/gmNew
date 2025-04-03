package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ezgl extends eyfy implements eyht {
    public static final ezgl a;
    private static volatile eyhz b;

    static {
        ezgl ezglVar = new ezgl();
        a = ezglVar;
        eyfy.registerDefaultInstance(ezgl.class, ezglVar);
    }

    private ezgl() {
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
            return new ezgl();
        }
        if (ordinal == 4) {
            return new ezgk();
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
        synchronized (ezgl.class) {
            eyhzVar = b;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                b = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
