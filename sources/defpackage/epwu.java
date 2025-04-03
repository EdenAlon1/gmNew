package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epwu extends eyfy implements eyht {
    public static final epwu a;
    private static volatile eyhz k;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public eygr g = emptyProtobufList();
    public eygr h = emptyProtobufList();
    public eygr i = emptyProtobufList();
    public eygr j = emptyProtobufList();

    static {
        epwu epwuVar = new epwu();
        a = epwuVar;
        eyfy.registerDefaultInstance(epwu.class, epwuVar);
    }

    private epwu() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0004\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005\u001b\u0006\u001b\u0007\u001b\b\u001b", new Object[]{"b", "c", "d", "e", "f", "g", epws.class, "h", epws.class, "i", epws.class, "j", epvw.class});
        }
        if (ordinal == 3) {
            return new epwu();
        }
        if (ordinal == 4) {
            return new epwt();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = k;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (epwu.class) {
            eyhzVar = k;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                k = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
