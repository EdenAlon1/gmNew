package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eisv extends eyfy implements eyht {
    public static final eisv a;
    private static volatile eyhz c;
    public eyja b;
    private int d;

    static {
        eisv eisvVar = new eisv();
        a = eisvVar;
        eyfy.registerDefaultInstance(eisv.class, eisvVar);
    }

    private eisv() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0007\u0007\u0001\u0000\u0000\u0000\u0007ဉ\u0005", new Object[]{"d", "b"});
        }
        if (ordinal == 3) {
            return new eisv();
        }
        if (ordinal == 4) {
            return new eisu();
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
        synchronized (eisv.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
