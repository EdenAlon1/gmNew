package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eiso extends eyfy implements eyht {
    public static final eiso a;
    private static volatile eyhz c;
    public eise b;
    private int d;

    static {
        eiso eisoVar = new eiso();
        a = eisoVar;
        eyfy.registerDefaultInstance(eiso.class, eisoVar);
    }

    private eiso() {
        emptyLongList();
        emptyProtobufList();
        eyfy.emptyProtobufList();
        emptyProtobufList();
        eyfy.emptyProtobufList();
        eyfy.emptyProtobufList();
        eyfy.emptyProtobufList();
        emptyLongList();
        emptyLongList();
        emptyIntList();
        emptyIntList();
        emptyIntList();
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0016\u0016\u0001\u0000\u0000\u0000\u0016ဉ\u0005", new Object[]{"d", "b"});
        }
        if (ordinal == 3) {
            return new eiso();
        }
        if (ordinal == 4) {
            return new eisl();
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
        synchronized (eiso.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
