package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewfj extends eyfy implements eyht {
    public static final ewfj a;
    private static volatile eyhz f;
    public int b;
    public ewei c;
    public ewem d;
    public ewep e;

    static {
        ewfj ewfjVar = new ewfj();
        a = ewfjVar;
        eyfy.registerDefaultInstance(ewfj.class, ewfjVar);
    }

    private ewfj() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (ordinal == 3) {
            return new ewfj();
        }
        if (ordinal == 4) {
            return new ewfi();
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
        synchronized (ewfj.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
