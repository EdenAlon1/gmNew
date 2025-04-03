package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esol extends eyfy implements eyht {
    public static final esol a;
    private static volatile eyhz c;
    public boolean b;

    static {
        esol esolVar = new esol();
        a = esolVar;
        eyfy.registerDefaultInstance(esol.class, esolVar);
    }

    private esol() {
        emptyProtobufList();
        eyfy.emptyProtobufList();
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0005\u0005\u0001\u0000\u0000\u0000\u0005\u0007", new Object[]{"b"});
        }
        if (ordinal == 3) {
            return new esol();
        }
        if (ordinal == 4) {
            return new esok();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = c;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (esol.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
