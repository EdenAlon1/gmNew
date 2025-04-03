package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class exre extends eyfy implements eyht {
    public static final exre a;
    private static volatile eyhz e;
    public int b;
    public exrb c;
    public int d;

    static {
        exre exreVar = new exre();
        a = exreVar;
        eyfy.registerDefaultInstance(exre.class, exreVar);
    }

    private exre() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဉ\u0001\u0003᠌\u0002", new Object[]{"b", "c", "d", exrd.a});
        }
        if (ordinal == 3) {
            return new exre();
        }
        if (ordinal == 4) {
            return new exrc();
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
        synchronized (exre.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
