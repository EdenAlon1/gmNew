package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckbj extends eyfy implements eyht {
    public static final ckbj a;
    private static volatile eyhz c;
    public eyhm b = eyhm.a;

    static {
        ckbj ckbjVar = new ckbj();
        a = ckbjVar;
        eyfy.registerDefaultInstance(ckbj.class, ckbjVar);
    }

    private ckbj() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", ckbh.a});
        }
        if (ordinal == 3) {
            return new ckbj();
        }
        if (ordinal == 4) {
            return new ckbi();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = c;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (ckbj.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
