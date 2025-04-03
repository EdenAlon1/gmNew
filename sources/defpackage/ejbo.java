package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejbo extends eyfy implements eyht {
    public static final ejbo a;
    private static volatile eyhz f;
    public int b;
    public boolean c;
    public eygr d = eyfy.emptyProtobufList();
    public int e;

    static {
        ejbo ejboVar = new ejbo();
        a = ejboVar;
        eyfy.registerDefaultInstance(ejbo.class, ejboVar);
    }

    private ejbo() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဇ\u0000\u0002\u001a\u0003᠌\u0001", new Object[]{"b", "c", "d", "e", ejbm.a});
        }
        if (ordinal == 3) {
            return new ejbo();
        }
        if (ordinal == 4) {
            return new ejbl();
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
        synchronized (ejbo.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
