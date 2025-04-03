package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewgm extends eyfy implements eyht {
    public static final ewgm a;
    private static volatile eyhz f;
    public int b;
    public ewgo c;
    public ewgo d;
    public ewgo e;

    static {
        ewgm ewgmVar = new ewgm();
        a = ewgmVar;
        eyfy.registerDefaultInstance(ewgm.class, ewgmVar);
    }

    private ewgm() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (ordinal == 3) {
            return new ewgm();
        }
        if (ordinal == 4) {
            return new ewgl();
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
        synchronized (ewgm.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
