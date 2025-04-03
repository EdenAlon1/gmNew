package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eyyd extends eyfy implements eyht {
    public static final eyyd a;
    private static volatile eyhz f;
    public int b;
    public int c;
    public boolean d;
    public eygr e = emptyProtobufList();

    static {
        eyyd eyydVar = new eyyd();
        a = eyydVar;
        eyfy.registerDefaultInstance(eyyd.class, eyydVar);
    }

    private eyyd() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0002\u0005\u0003\u0000\u0001\u0000\u0002င\u0000\u0004ဇ\u0001\u0005\u001b", new Object[]{"b", "c", "d", "e", eyyc.class});
        }
        if (ordinal == 3) {
            return new eyyd();
        }
        if (ordinal == 4) {
            return new eyya();
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
        synchronized (eyyd.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
