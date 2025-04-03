package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewsb extends eyfy implements eyht {
    public static final eygj a = new ewrz();
    public static final ewsb b;
    private static volatile eyhz f;
    public int c;
    public eyfh d;
    public eygi e = emptyIntList();

    static {
        ewsb ewsbVar = new ewsb();
        b = ewsbVar;
        eyfy.registerDefaultInstance(ewsb.class, ewsbVar);
    }

    private ewsb() {
        emptyIntList();
        emptyIntList();
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(b, "\u0004\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0003,", new Object[]{"c", "d", "e"});
        }
        if (ordinal == 3) {
            return new ewsb();
        }
        if (ordinal == 4) {
            return new ewsa();
        }
        if (ordinal == 5) {
            return b;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = f;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (ewsb.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(b);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
