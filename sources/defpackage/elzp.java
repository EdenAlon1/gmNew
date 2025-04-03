package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elzp extends eyfy implements eyht {
    public static final elzp a;
    private static volatile eyhz e;
    public String b = "";
    public eygr c = emptyProtobufList();
    public eygr d = emptyProtobufList();

    static {
        elzp elzpVar = new elzp();
        a = elzpVar;
        eyfy.registerDefaultInstance(elzp.class, elzpVar);
    }

    private elzp() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0002\u0000\u0001Ȉ\u0002\u001b\u0003\u001b", new Object[]{"b", "c", emac.class, "d", elzr.class});
        }
        if (ordinal == 3) {
            return new elzp();
        }
        if (ordinal == 4) {
            return new elzo();
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
        synchronized (elzp.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
