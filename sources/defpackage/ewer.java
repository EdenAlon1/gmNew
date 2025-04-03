package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewer extends eyfy implements eyht {
    public static final ewer a;
    private static volatile eyhz h;
    public int b;
    public ewfj c;
    public ewez d;
    public eyee e = eyee.b;
    public ewfu f;
    public int g;

    static {
        ewer ewerVar = new ewer();
        a = ewerVar;
        eyfy.registerDefaultInstance(ewer.class, ewerVar);
    }

    private ewer() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0005\u0000\u0001\u0001\b\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0003ဉ\u0001\u0004\n\u0007ဉ\u0002\b\f", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (ordinal == 3) {
            return new ewer();
        }
        if (ordinal == 4) {
            return new eweq();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = h;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (ewer.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
