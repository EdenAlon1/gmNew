package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epwc extends eyfy implements eyht {
    public static final epwc a;
    private static volatile eyhz g;
    public int b;
    public epvy d;
    public epvy e;
    public String c = "";
    public eygr f = emptyProtobufList();

    static {
        epwc epwcVar = new epwc();
        a = epwcVar;
        eyfy.registerDefaultInstance(epwc.class, epwcVar);
    }

    private epwc() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004\u001b", new Object[]{"b", "c", "d", "e", "f", epwe.class});
        }
        if (ordinal == 3) {
            return new epwc();
        }
        if (ordinal == 4) {
            return new epwb();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = g;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (epwc.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
