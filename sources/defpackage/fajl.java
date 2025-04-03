package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fajl extends eyfy implements eyht {
    public static final fajl a;
    private static volatile eyhz d;
    public eygr b = emptyProtobufList();
    public eygr c = eyfy.emptyProtobufList();

    static {
        fajl fajlVar = new fajl();
        a = fajlVar;
        eyfy.registerDefaultInstance(fajl.class, fajlVar);
    }

    private fajl() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002Ț", new Object[]{"b", fajk.class, "c"});
        }
        if (ordinal == 3) {
            return new fajl();
        }
        if (ordinal == 4) {
            return new faji();
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
        synchronized (fajl.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
