package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etyi extends eyfy implements eyht {
    public static final etyi a;
    private static volatile eyhz e;
    public int b;
    public int c;
    public eyee d = eyee.b;

    static {
        etyi etyiVar = new etyi();
        a = etyiVar;
        eyfy.registerDefaultInstance(etyi.class, etyiVar);
    }

    private etyi() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0000\u0001\u000b\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u000b\n", new Object[]{"b", "c", "d"});
        }
        if (ordinal == 3) {
            return new etyi();
        }
        if (ordinal == 4) {
            return new etyh();
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
        synchronized (etyi.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
