package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eyuw extends eyfy implements eyht {
    public static final eyuw a;
    private static volatile eyhz f;
    public int b;
    public eyuu c;
    public eyub d;
    public eyxd e;

    static {
        eyuw eyuwVar = new eyuw();
        a = eyuwVar;
        eyfy.registerDefaultInstance(eyuw.class, eyuwVar);
    }

    private eyuw() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"b", "c", "d", "e"});
        }
        if (ordinal == 3) {
            return new eyuw();
        }
        if (ordinal == 4) {
            return new eyuv();
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
        synchronized (eyuw.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
