package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgoh extends eyfy implements eyht {
    public static final fgoh a;
    private static volatile eyhz g;
    public int b;
    public Object d;
    public int e;
    public int c = 0;
    public eygr f = emptyProtobufList();

    static {
        fgoh fgohVar = new fgoh();
        a = fgohVar;
        eyfy.registerDefaultInstance(fgoh.class, fgohVar);
    }

    private fgoh() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001᠌\u0000\u00028\u0000\u0003<\u0000\u0004\u001b", new Object[]{"d", "c", "b", "e", fgog.a, fgob.class, "f", fgof.class});
        }
        if (ordinal == 3) {
            return new fgoh();
        }
        if (ordinal == 4) {
            return new fgod();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = g;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (fgoh.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
