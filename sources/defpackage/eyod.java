package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eyod extends eyfy implements eyht {
    public static final eygj a = new eynz();
    public static final eygj b = new eyoa();
    public static final eygj c = new eyob();
    public static final eyod d;
    private static volatile eyhz h;
    public eygi e = emptyIntList();
    public eygi f = emptyIntList();
    public eygi g = emptyIntList();

    static {
        eyod eyodVar = new eyod();
        d = eyodVar;
        eyfy.registerDefaultInstance(eyod.class, eyodVar);
    }

    private eyod() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            eygg eyggVar = ezia.a;
            return newMessageInfo(d, "\u0001\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0003\u0000\u0001ࠬ\u0002ࠬ\u0003ࠬ", new Object[]{"e", eyggVar, "g", eyggVar, "f", eyggVar});
        }
        if (ordinal == 3) {
            return new eyod();
        }
        if (ordinal == 4) {
            return new eyoc();
        }
        if (ordinal == 5) {
            return d;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = h;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (eyod.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(d);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
