package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erty extends eyfy implements eyht {
    public static final erty a;
    private static volatile eyhz e;
    public int b;
    public long c;
    public eruh d;

    static {
        erty ertyVar = new erty();
        a = ertyVar;
        eyfy.registerDefaultInstance(erty.class, ertyVar);
    }

    private erty() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002ဉ\u0000", new Object[]{"b", "c", "d"});
        }
        if (ordinal == 3) {
            return new erty();
        }
        if (ordinal == 4) {
            return new ertx();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = e;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (erty.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
