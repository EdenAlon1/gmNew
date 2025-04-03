package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class exix extends eyfy implements eyht {
    public static final exix a;
    private static volatile eyhz i;
    public int b;
    public String c = "";
    public fauw d;
    public fauw e;
    public double f;
    public exgv g;
    public eyja h;

    static {
        exix exixVar = new exix();
        a = exixVar;
        eyfy.registerDefaultInstance(exix.class, exixVar);
    }

    private exix() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0006\u0000\u0001\u0002\u000e\u0006\u0000\u0000\u0000\u0002Ȉ\u0007\u0000\tဉ\u0000\fဉ\u0001\rဉ\u0002\u000eဉ\u0003", new Object[]{"b", "c", "f", "d", "e", "g", "h"});
        }
        if (ordinal == 3) {
            return new exix();
        }
        if (ordinal == 4) {
            return new exiw();
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
        synchronized (exix.class) {
            eyhzVar = i;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                i = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
