package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbhi extends eyfy implements eyht {
    public static final fbhi a;
    private static volatile eyhz d;
    public int b;
    public int c;

    static {
        fbhi fbhiVar = new fbhi();
        a = fbhiVar;
        eyfy.registerDefaultInstance(fbhi.class, fbhiVar);
    }

    private fbhi() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\f\u0003\f", new Object[]{"b", "c"});
        }
        if (ordinal == 3) {
            return new fbhi();
        }
        if (ordinal == 4) {
            return new fbhh();
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
        synchronized (fbhi.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
