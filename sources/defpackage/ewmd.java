package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewmd extends eyfy implements eyht {
    public static final ewmd a;
    private static volatile eyhz g;
    public int b;
    public float c;
    public float d;
    public float e;
    public float f;

    static {
        ewmd ewmdVar = new ewmd();
        a = ewmdVar;
        eyfy.registerDefaultInstance(ewmd.class, ewmdVar);
    }

    private ewmd() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (ordinal == 3) {
            return new ewmd();
        }
        if (ordinal == 4) {
            return new ewmc();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = g;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (ewmd.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
