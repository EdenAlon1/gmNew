package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epwg extends eyfy implements eyht {
    public static final epwg a;
    private static volatile eyhz f;
    public int b;
    public int c;
    public epvj d;
    public eygr e = emptyProtobufList();

    static {
        epwg epwgVar = new epwg();
        a = epwgVar;
        eyfy.registerDefaultInstance(epwg.class, epwgVar);
    }

    private epwg() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001င\u0000\u0002ဉ\u0001\u0003\u001b", new Object[]{"b", "c", "d", "e", epvj.class});
        }
        if (ordinal == 3) {
            return new epwg();
        }
        if (ordinal == 4) {
            return new epwf();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = f;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (epwg.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
