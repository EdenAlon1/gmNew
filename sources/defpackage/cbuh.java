package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbuh extends eyfy implements eyht {
    public static final cbuh a;
    private static volatile eyhz d;
    public int b;
    public eygr c = eyfy.emptyProtobufList();

    static {
        cbuh cbuhVar = new cbuh();
        a = cbuhVar;
        eyfy.registerDefaultInstance(cbuh.class, cbuhVar);
    }

    private cbuh() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0001\u0000\u0001\u0004\u0003Ț", new Object[]{"b", "c"});
        }
        if (ordinal == 3) {
            return new cbuh();
        }
        if (ordinal == 4) {
            return new cbug();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = d;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (cbuh.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
