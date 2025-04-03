package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckbn extends eyfy implements eyht {
    public static final ckbn a;
    private static volatile eyhz f;
    public int b;
    public eyee c = eyee.b;
    public String d = "";
    public ckbr e;

    static {
        ckbn ckbnVar = new ckbn();
        a = ckbnVar;
        eyfy.registerDefaultInstance(ckbn.class, ckbnVar);
    }

    private ckbn() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\n\u0002Ȉ\u0003ဉ\u0000", new Object[]{"b", "c", "d", "e"});
        }
        if (ordinal == 3) {
            return new ckbn();
        }
        if (ordinal == 4) {
            return new ckbm();
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
        synchronized (ckbn.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
