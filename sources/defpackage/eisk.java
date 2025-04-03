package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eisk extends eyfy implements eyht {
    public static final eisk a;
    private static volatile eyhz c;
    public boolean b;
    private int d;

    static {
        eisk eiskVar = new eisk();
        a = eiskVar;
        eyfy.registerDefaultInstance(eisk.class, eiskVar);
    }

    private eisk() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyIntList();
        emptyProtobufList();
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဇ\u0005", new Object[]{"d", "b"});
        }
        if (ordinal == 3) {
            return new eisk();
        }
        if (ordinal == 4) {
            return new eisj();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = c;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (eisk.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
