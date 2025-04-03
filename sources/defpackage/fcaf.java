package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fcaf extends eyfy implements eyht {
    public static final fcaf a;
    private static volatile eyhz d;
    public fcfq b;
    public eygr c;
    private int e;

    static {
        fcaf fcafVar = new fcaf();
        a = fcafVar;
        eyfy.registerDefaultInstance(fcaf.class, fcafVar);
    }

    private fcaf() {
        emptyProtobufList();
        emptyProtobufList();
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
            return newMessageInfo(a, "\u0000\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0004\u001b", new Object[]{"e", "b", "c", fcgc.class});
        }
        if (ordinal == 3) {
            return new fcaf();
        }
        if (ordinal == 4) {
            return new fcae();
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
        synchronized (fcaf.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
