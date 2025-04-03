package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euka extends eyfy implements eyht {
    public static final euka a;
    private static volatile eyhz i;
    public int b;
    public int d;
    public euke f;
    public boolean g;
    public String c = "";
    public eygr e = emptyProtobufList();
    public eygi h = emptyIntList();

    static {
        euka eukaVar = new euka();
        a = eukaVar;
        eyfy.registerDefaultInstance(euka.class, eukaVar);
    }

    private euka() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\t\u0006\u0000\u0002\u0000\u0001Ȉ\u0002\f\u0005\u001b\u0007ဉ\u0000\b\u0007\t'", new Object[]{"b", "c", "d", "e", eujx.class, "f", "g", "h"});
        }
        if (ordinal == 3) {
            return new euka();
        }
        if (ordinal == 4) {
            return new eujz();
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
        synchronized (euka.class) {
            eyhzVar = i;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                i = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
