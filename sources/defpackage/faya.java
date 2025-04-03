package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class faya extends eyfy implements eyht {
    public static final faya a;
    private static volatile eyhz e;
    public Object c;
    public int b = 0;
    public eygr d = emptyProtobufList();

    static {
        faya fayaVar = new faya();
        a = fayaVar;
        eyfy.registerDefaultInstance(faya.class, fayaVar);
    }

    private faya() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0001\u0000\u0001\u0004\u0003\u0000\u0001\u0000\u00018\u0000\u0003\u001b\u00045\u0000", new Object[]{"c", "b", "d", faxy.class});
        }
        if (ordinal == 3) {
            return new faya();
        }
        if (ordinal == 4) {
            return new faxz();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = e;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (faya.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
