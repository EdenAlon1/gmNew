package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eyac extends eyfy implements eyht {
    public static final eyac a;
    private static volatile eyhz f;
    public int b;
    public exzs c;
    public exzy d;
    public int e;

    static {
        eyac eyacVar = new eyac();
        a = eyacVar;
        eyfy.registerDefaultInstance(eyac.class, eyacVar);
    }

    private eyac() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0007\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0007᠌\u0002", new Object[]{"b", "c", "d", "e", exzz.a});
        }
        if (ordinal == 3) {
            return new eyac();
        }
        if (ordinal == 4) {
            return new eyab();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = f;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (eyac.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
