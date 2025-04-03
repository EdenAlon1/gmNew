package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emie extends eyfy implements eyht {
    public static final emie a;
    private static volatile eyhz c;
    public eygr b = emptyProtobufList();

    static {
        emie emieVar = new emie();
        a = emieVar;
        eyfy.registerDefaultInstance(emie.class, emieVar);
    }

    private emie() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", emig.class});
        }
        if (ordinal == 3) {
            return new emie();
        }
        if (ordinal == 4) {
            return new emid();
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
        synchronized (emie.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
