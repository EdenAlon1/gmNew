package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epuk extends eyfy implements eyht {
    public static final epuk a;
    private static volatile eyhz e;
    public int b;
    public int c;
    public eygr d = emptyProtobufList();

    static {
        epuk epukVar = new epuk();
        a = epukVar;
        eyfy.registerDefaultInstance(epuk.class, epukVar);
    }

    private epuk() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b", new Object[]{"b", "c", epuh.a, "d", epum.class});
        }
        if (ordinal == 3) {
            return new epuk();
        }
        if (ordinal == 4) {
            return new epuj();
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
        synchronized (epuk.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
