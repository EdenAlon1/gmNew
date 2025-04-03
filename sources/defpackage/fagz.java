package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fagz extends eyfy implements eyht {
    public static final fagz a;
    private static volatile eyhz c;
    public eygr b = emptyProtobufList();

    static {
        fagz fagzVar = new fagz();
        a = fagzVar;
        eyfy.registerDefaultInstance(fagz.class, fagzVar);
    }

    private fagz() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", fagx.class});
        }
        if (ordinal == 3) {
            return new fagz();
        }
        if (ordinal == 4) {
            return new fagy();
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
        synchronized (fagz.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
