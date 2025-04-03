package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eoqh extends eyfy implements eyht {
    public static final eoqh a;
    private static volatile eyhz h;
    public int b;
    public int c;
    public int d;
    public int e;
    public eojh f;
    public int g;

    static {
        eoqh eoqhVar = new eoqh();
        a = eoqhVar;
        eyfy.registerDefaultInstance(eoqh.class, eoqhVar);
    }

    private eoqh() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\b\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0006င\u0005\u0007ဉ\u0006\bင\u0007", new Object[]{"b", "c", eoqe.a, "d", "e", "f", "g"});
        }
        if (ordinal == 3) {
            return new eoqh();
        }
        if (ordinal == 4) {
            return new eoqg();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = h;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (eoqh.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
