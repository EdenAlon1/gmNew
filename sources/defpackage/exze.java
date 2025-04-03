package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class exze extends eyfy implements eyht {
    public static final exze a;
    private static volatile eyhz d;
    public int b = 0;
    public Object c;

    static {
        exze exzeVar = new exze();
        a = exzeVar;
        eyfy.registerDefaultInstance(exze.class, exzeVar);
    }

    private exze() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003\u083f\u0000", new Object[]{"c", "b", exwv.class, exzj.class, eybt.a});
        }
        if (ordinal == 3) {
            return new exze();
        }
        if (ordinal == 4) {
            return new exzc();
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
        synchronized (exze.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
