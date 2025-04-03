package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esgl extends eyfy implements eyht {
    public static final esgl a;
    private static volatile eyhz d;
    public eygr b = emptyProtobufList();
    public int c;

    static {
        esgl esglVar = new esgl();
        a = esglVar;
        eyfy.registerDefaultInstance(esgl.class, esglVar);
    }

    private esgl() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\f", new Object[]{"b", fbxa.class, "c"});
        }
        if (ordinal == 3) {
            return new esgl();
        }
        if (ordinal == 4) {
            return new esgk();
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
        synchronized (esgl.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
