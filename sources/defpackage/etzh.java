package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etzh extends eyfy implements eyht {
    public static final etzh a;
    private static volatile eyhz f;
    public int b;
    public int c;
    public etzj d;
    public eyee e = eyee.b;

    static {
        etzh etzhVar = new etzh();
        a = etzhVar;
        eyfy.registerDefaultInstance(etzh.class, etzhVar);
    }

    private etzh() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"b", "c", "d", "e"});
        }
        if (ordinal == 3) {
            return new etzh();
        }
        if (ordinal == 4) {
            return new etzg();
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
        synchronized (etzh.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
