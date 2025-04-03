package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etzm extends eyfy implements eyht {
    public static final etzm a;
    private static volatile eyhz e;
    public String b = "";
    public eyee c = eyee.b;
    public int d;

    static {
        etzm etzmVar = new etzm();
        a = etzmVar;
        eyfy.registerDefaultInstance(etzm.class, etzmVar);
    }

    private etzm() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"b", "c", "d"});
        }
        if (ordinal == 3) {
            return new etzm();
        }
        if (ordinal == 4) {
            return new etzk();
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
        synchronized (etzm.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
