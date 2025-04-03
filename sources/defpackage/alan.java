package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class alan extends eyfy implements eyht {
    public static final alan a;
    private static volatile eyhz f;
    public int b;
    public alax c;
    public alaz d;
    public eygr e = emptyProtobufList();
    private int g;

    static {
        alan alanVar = new alan();
        a = alanVar;
        eyfy.registerDefaultInstance(alan.class, alanVar);
    }

    private alan() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004\u001b", new Object[]{"g", "b", alak.a, "c", "d", "e", akzq.class});
        }
        if (ordinal == 3) {
            return new alan();
        }
        if (ordinal == 4) {
            return new alam();
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
        synchronized (alan.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
