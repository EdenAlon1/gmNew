package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class exyv extends eyfy implements eyht {
    public static final exyv a;
    private static volatile eyhz d;
    public eygr b = eyfy.emptyProtobufList();
    public eygr c = eyfy.emptyProtobufList();

    static {
        exyv exyvVar = new exyv();
        a = exyvVar;
        eyfy.registerDefaultInstance(exyv.class, exyvVar);
    }

    private exyv() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001a\u0002\u001a", new Object[]{"b", "c"});
        }
        if (ordinal == 3) {
            return new exyv();
        }
        if (ordinal == 4) {
            return new exyu();
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
        synchronized (exyv.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
