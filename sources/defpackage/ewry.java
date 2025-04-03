package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewry extends eyfy implements eyht {
    public static final ewry a;
    private static volatile eyhz d;
    public int b = 0;
    public Object c;

    static {
        ewry ewryVar = new ewry();
        a = ewryVar;
        eyfy.registerDefaultInstance(ewry.class, ewryVar);
    }

    private ewry() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"c", "b", ezwv.class, ezxb.class, ezwx.class, ezwz.class, ezwt.class, ezwr.class});
        }
        if (ordinal == 3) {
            return new ewry();
        }
        if (ordinal == 4) {
            return new ewrx();
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
        synchronized (ewry.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
