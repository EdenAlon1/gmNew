package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fcgc extends eyfy implements eyht {
    public static final fcgc a;
    private static volatile eyhz d;
    public fcek b;
    public eygr c;
    private int e;

    static {
        fcgc fcgcVar = new fcgc();
        a = fcgcVar;
        eyfy.registerDefaultInstance(fcgc.class, fcgcVar);
    }

    private fcgc() {
        emptyIntList();
        this.c = emptyProtobufList();
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0001\u0001\u0005\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0005\u001b", new Object[]{"e", "b", "c", fcfm.class});
        }
        if (ordinal == 3) {
            return new fcgc();
        }
        if (ordinal == 4) {
            return new fcgb();
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
        synchronized (fcgc.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
