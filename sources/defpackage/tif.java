package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tif extends eyfy<tif, tie> implements eyht {
    public static final tif a;
    private static volatile eyhz e;
    public int b;
    public boolean c;
    public boolean d;

    static {
        tif tifVar = new tif();
        a = tifVar;
        eyfy.registerDefaultInstance(tif.class, tifVar);
    }

    private tif() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"b", "c", "d"});
        }
        if (ordinal == 3) {
            return new tif();
        }
        if (ordinal == 4) {
            return new tie();
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
        synchronized (tif.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
