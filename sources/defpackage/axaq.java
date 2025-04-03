package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axaq extends eyfy implements eyht {
    public static final axaq a;
    private static volatile eyhz i;
    public int b;
    public awwf c;
    public awui f;
    public axad g;
    public String d = "";
    public eyee e = eyee.b;
    public String h = "";

    static {
        axaq axaqVar = new axaq();
        a = axaqVar;
        eyfy.registerDefaultInstance(axaq.class, axaqVar);
    }

    private axaq() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ည\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဈ\u0005", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
        }
        if (ordinal == 3) {
            return new axaq();
        }
        if (ordinal == 4) {
            return new axap();
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
        synchronized (axaq.class) {
            eyhzVar = i;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                i = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
