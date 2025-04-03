package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elmj extends eyfy implements eyht {
    public static final elmj a;
    private static volatile eyhz b;
    private eyhm c = eyhm.a;

    static {
        elmj elmjVar = new elmj();
        a = elmjVar;
        eyfy.registerDefaultInstance(elmj.class, elmjVar);
    }

    private elmj() {
        emptyIntList();
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0001\u0000\u0000\u00022", new Object[]{"c", elmi.a});
        }
        if (ordinal == 3) {
            return new elmj();
        }
        if (ordinal == 4) {
            return new elmh();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = b;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (elmj.class) {
            eyhzVar = b;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                b = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
