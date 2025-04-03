package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epvj extends eyfy implements eyht {
    public static final epvj a;
    private static volatile eyhz j;
    public int b;
    public long c;
    public long d;
    public int e;
    public boolean f;
    public eygr g = emptyProtobufList();
    public eygr h = emptyProtobufList();
    public boolean i;

    static {
        epvj epvjVar = new epvj();
        a = epvjVar;
        eyfy.registerDefaultInstance(epvj.class, epvjVar);
    }

    private epvj() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0002\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003᠌\u0002\u0004ဇ\u0003\u0005\u001b\u0006\u001b\u0007ဇ\u0004", new Object[]{"b", "c", "d", "e", epvs.a, "f", "g", epvw.class, "h", epvd.class, "i"});
        }
        if (ordinal == 3) {
            return new epvj();
        }
        if (ordinal == 4) {
            return new epvi();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = j;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (epvj.class) {
            eyhzVar = j;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                j = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
