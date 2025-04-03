package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewfp extends eyfy implements eyht {
    public static final ewfp a;
    private static volatile eyhz e;
    public eyee b = eyee.b;
    public int c;
    public int d;

    static {
        ewfp ewfpVar = new ewfp();
        a = ewfpVar;
        eyfy.registerDefaultInstance(ewfp.class, ewfpVar);
    }

    private ewfp() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0000\u0001\u0005\u0003\u0000\u0000\u0000\u0001\n\u0002\f\u0005\u0004", new Object[]{"b", "c", "d"});
        }
        if (ordinal == 3) {
            return new ewfp();
        }
        if (ordinal == 4) {
            return new ewfo();
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
        synchronized (ewfp.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
