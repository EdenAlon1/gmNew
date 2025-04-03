package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acbk extends eyfy implements eyht {
    public static final acbk a;
    private static volatile eyhz f;
    public int b;
    public int c;
    public long d;
    public int e;

    static {
        acbk acbkVar = new acbk();
        a = acbkVar;
        eyfy.registerDefaultInstance(acbk.class, acbkVar);
    }

    private acbk() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0002\u0004\u0004", new Object[]{"b", "c", "d", "e"});
        }
        if (ordinal == 3) {
            return new acbk();
        }
        if (ordinal == 4) {
            return new acbj();
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
        synchronized (acbk.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
