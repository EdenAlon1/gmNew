package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eswo extends eyfy implements eyht {
    public static final eswo a;
    private static volatile eyhz g;
    public int b;
    public int c;
    public int d;
    public int e;
    public eszu f;

    static {
        eswo eswoVar = new eswo();
        a = eswoVar;
        eyfy.registerDefaultInstance(eswo.class, eswoVar);
    }

    private eswo() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003\f\u0004ဉ\u0002", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (ordinal == 3) {
            return new eswo();
        }
        if (ordinal == 4) {
            return new eswn();
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
        synchronized (eswo.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
