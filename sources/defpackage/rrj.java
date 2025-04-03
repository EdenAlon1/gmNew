package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rrj extends eyfy implements eyht {
    public static final rrj a;
    private static volatile eyhz d;
    public eygd b = emptyDoubleList();
    public eygr c = eyfy.emptyProtobufList();

    static {
        rrj rrjVar = new rrj();
        a = rrjVar;
        eyfy.registerDefaultInstance(rrj.class, rrjVar);
    }

    private rrj() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u0012\u0002\u001a", new Object[]{"b", "c"});
        }
        if (ordinal == 3) {
            return new rrj();
        }
        if (ordinal == 4) {
            return new rri();
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
        synchronized (rrj.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
