package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erzz extends eyfy implements eyht {
    public static final erzz a;
    private static volatile eyhz i;
    public int b;
    public int c;
    public int d;
    public String e = "";
    public String f = "";
    public boolean g;
    public erzy h;

    static {
        erzz erzzVar = new erzz();
        a = erzzVar;
        eyfy.registerDefaultInstance(erzz.class, erzzVar);
    }

    private erzz() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0002\u0007\u0006\u0000\u0000\u0000\u0002\f\u0003\f\u0004Ȉ\u0005Ȉ\u0006\u0007\u0007ဉ\u0000", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
        }
        if (ordinal == 3) {
            return new erzz();
        }
        if (ordinal == 4) {
            return new erzw();
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
        synchronized (erzz.class) {
            eyhzVar = i;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                i = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
