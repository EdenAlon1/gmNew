package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class exhb extends eyfy implements eyht {
    public static final exhb a;
    private static volatile eyhz d;
    public int b;
    public eygr c = emptyProtobufList();

    static {
        exhb exhbVar = new exhb();
        a = exhbVar;
        eyfy.registerDefaultInstance(exhb.class, exhbVar);
    }

    private exhb() {
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
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0004\u0002\u001b", new Object[]{"b", "c", exha.class});
        }
        if (ordinal == 3) {
            return new exhb();
        }
        if (ordinal == 4) {
            return new exgy();
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
        synchronized (exhb.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
