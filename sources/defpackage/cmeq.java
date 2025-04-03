package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmeq extends eyfy implements eyht {
    public static final cmeq a;
    private static volatile eyhz i;
    public int b;
    public int c;
    public String d = "";
    public String e = "";
    public eyja f;
    public eyja g;
    public int h;

    static {
        cmeq cmeqVar = new cmeq();
        a = cmeqVar;
        eyfy.registerDefaultInstance(cmeq.class, cmeqVar);
    }

    private cmeq() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003Ȉ\u0005ဉ\u0000\u0006ဉ\u0001\u0007\f", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
        }
        if (ordinal == 3) {
            return new cmeq();
        }
        if (ordinal == 4) {
            return new cmep();
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
        synchronized (cmeq.class) {
            eyhzVar = i;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                i = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
