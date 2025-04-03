package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class edfd extends eyfy implements eyht {
    public static final edfd a;
    private static volatile eyhz e;
    public int b;
    public String c = "";
    public eygr d = emptyProtobufList();

    static {
        edfd edfdVar = new edfd();
        a = edfdVar;
        eyfy.registerDefaultInstance(edfd.class, edfdVar);
    }

    private edfd() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ለ\u0000\u0002\u001b", new Object[]{"b", "c", "d", edew.class});
        }
        if (ordinal == 3) {
            return new edfd();
        }
        if (ordinal == 4) {
            return new edfc();
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
        synchronized (edfd.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
