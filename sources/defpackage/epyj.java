package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epyj extends eyfy implements eyht {
    public static final epyj a;
    private static volatile eyhz i;
    public int b;
    public boolean c;
    public int d;
    public int e;
    public String f = "";
    public boolean g;
    public boolean h;

    static {
        epyj epyjVar = new epyj();
        a = epyjVar;
        eyfy.registerDefaultInstance(epyj.class, epyjVar);
    }

    private epyj() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဇ\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004ဈ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"b", "c", "d", eool.a, "e", eokr.a, "f", "g", "h"});
        }
        if (ordinal == 3) {
            return new epyj();
        }
        if (ordinal == 4) {
            return new epyi();
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
        synchronized (epyj.class) {
            eyhzVar = i;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                i = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
