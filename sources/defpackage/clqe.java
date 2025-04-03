package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clqe extends eyfy implements eyht {
    public static final clqe a;
    private static volatile eyhz i;
    public int b;
    public int c = 0;
    public Object d;
    public clns e;
    public eyja f;
    public eyja g;
    public int h;

    static {
        clqe clqeVar = new clqe();
        a = clqeVar;
        eyfy.registerDefaultInstance(clqe.class, clqeVar);
    }

    private clqe() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002<\u0000\u0003<\u0000\u0004ဉ\u0001\u0005ဉ\u0002\u0006င\u0003", new Object[]{"d", "c", "b", "e", clqm.class, clqi.class, "f", "g", "h"});
        }
        if (ordinal == 3) {
            return new clqe();
        }
        if (ordinal == 4) {
            return new clqd();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = i;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (clqe.class) {
            eyhzVar = i;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                i = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
