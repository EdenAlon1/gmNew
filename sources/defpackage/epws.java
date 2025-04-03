package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epws extends eyfy implements eyht {
    public static final epws a;
    private static volatile eyhz e;
    public int b;
    public epvj c;
    public eygr d = emptyProtobufList();

    static {
        epws epwsVar = new epws();
        a = epwsVar;
        eyfy.registerDefaultInstance(epws.class, epwsVar);
    }

    private epws() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"b", "c", "d", epvd.class});
        }
        if (ordinal == 3) {
            return new epws();
        }
        if (ordinal == 4) {
            return new epwr();
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
        synchronized (epws.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
