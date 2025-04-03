package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class faje extends eyfy implements eyht {
    public static final faje a;
    private static volatile eyhz j;
    public int b;
    public faiw c;
    public fahq d;
    public fahw e;
    public fajg f;
    public eygr g = emptyProtobufList();
    public eygi h = emptyIntList();
    public faiy i;

    static {
        faje fajeVar = new faje();
        a = fajeVar;
        eyfy.registerDefaultInstance(faje.class, fajeVar);
    }

    private faje() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0007\u0000\u0001\u0001\t\u0007\u0000\u0002\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005\u001b\u0007,\tဉ\u0004", new Object[]{"b", "c", "d", "e", "f", "g", fajr.class, "h", "i"});
        }
        if (ordinal == 3) {
            return new faje();
        }
        if (ordinal == 4) {
            return new fajd();
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
        synchronized (faje.class) {
            eyhzVar = j;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                j = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
