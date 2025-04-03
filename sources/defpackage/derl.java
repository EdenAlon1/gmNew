package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class derl extends eyfy implements eyht {
    public static final derl a;
    private static volatile eyhz c;
    public int b;
    private int d;

    static {
        derl derlVar = new derl();
        a = derlVar;
        eyfy.registerDefaultInstance(derl.class, derlVar);
    }

    private derl() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"d", "b"});
        }
        if (ordinal == 3) {
            return new derl();
        }
        if (ordinal == 4) {
            return new derj();
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
        synchronized (derl.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
