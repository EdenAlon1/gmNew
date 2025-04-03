package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eypp extends eyfy implements eyht {
    public static final eypp a;
    private static volatile eyhz f;
    public int b;
    public eygr c = eyfy.emptyProtobufList();
    public long d;
    public eypo e;

    static {
        eypp eyppVar = new eypp();
        a = eyppVar;
        eyfy.registerDefaultInstance(eypp.class, eyppVar);
    }

    private eypp() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001a\u0002ဂ\u0000\u0003ဉ\u0001", new Object[]{"b", "c", "d", "e"});
        }
        if (ordinal == 3) {
            return new eypp();
        }
        if (ordinal == 4) {
            return new eypm();
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
        synchronized (eypp.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
