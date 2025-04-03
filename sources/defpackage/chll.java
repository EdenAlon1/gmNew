package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class chll extends eyfy implements eyht {
    public static final chll a;
    private static volatile eyhz i;
    public int b;
    public String c = "";
    public eyee d = eyee.b;
    public long e;
    public chmd f;
    public chmd g;
    public long h;

    static {
        chll chllVar = new chll();
        a = chllVar;
        eyfy.registerDefaultInstance(chll.class, chllVar);
    }

    private chll() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\u0002\u0005ဉ\u0000\u0006ဉ\u0001\u0007\u0002", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
        }
        if (ordinal == 3) {
            return new chll();
        }
        if (ordinal == 4) {
            return new chlk();
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
        synchronized (chll.class) {
            eyhzVar = i;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                i = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
