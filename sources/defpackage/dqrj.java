package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqrj extends eyfy implements eyht {
    public static final dqrj a;
    private static volatile eyhz d;
    public eyhm b = eyhm.a;
    public eyhm c = eyhm.a;

    static {
        dqrj dqrjVar = new dqrj();
        a = dqrjVar;
        eyfy.registerDefaultInstance(dqrj.class, dqrjVar);
    }

    private dqrj() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0002\u0000\u0000\u00012\u00022", new Object[]{"b", dqri.a, "c", dqrh.a});
        }
        if (ordinal == 3) {
            return new dqrj();
        }
        if (ordinal == 4) {
            return new dqre();
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
        synchronized (dqrj.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
