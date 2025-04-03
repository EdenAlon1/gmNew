package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esmb extends eyfy implements eyht {
    public static final esmb a;
    private static volatile eyhz f;
    public int d;
    public eygr b = eyfy.emptyProtobufList();
    public String c = "";
    public eygr e = emptyProtobufList();

    static {
        esmb esmbVar = new esmb();
        a = esmbVar;
        eyfy.registerDefaultInstance(esmb.class, esmbVar);
    }

    private esmb() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0002\u0000\u0001Ț\u0002Ȉ\u0003\f\u0004\u001b", new Object[]{"b", "c", "d", "e", eslu.class});
        }
        if (ordinal == 3) {
            return new esmb();
        }
        if (ordinal == 4) {
            return new eslz();
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
        synchronized (esmb.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
