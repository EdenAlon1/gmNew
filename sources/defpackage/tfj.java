package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tfj extends eyfy implements eyht {
    public static final tfj a;
    private static volatile eyhz d;
    public int b;
    public int c;

    static {
        tfj tfjVar = new tfj();
        a = tfjVar;
        eyfy.registerDefaultInstance(tfj.class, tfjVar);
    }

    private tfj() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003᠌\u0000", new Object[]{"b", "c", epec.a});
        }
        if (ordinal == 3) {
            return new tfj();
        }
        if (ordinal == 4) {
            return new tfi();
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
        synchronized (tfj.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
