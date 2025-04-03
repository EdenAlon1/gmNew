package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewfu extends eyfy implements eyht {
    public static final ewfu a;
    private static volatile eyhz d;
    public boolean b;
    public boolean c;

    static {
        ewfu ewfuVar = new ewfu();
        a = ewfuVar;
        eyfy.registerDefaultInstance(ewfu.class, ewfuVar);
    }

    private ewfu() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002\u0007", new Object[]{"b", "c"});
        }
        if (ordinal == 3) {
            return new ewfu();
        }
        if (ordinal == 4) {
            return new ewft();
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
        synchronized (ewfu.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
