package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ciht extends eyfy implements eyht {
    public static final ciht a;
    private static volatile eyhz i;
    public int b;
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";
    public eyja g;
    public eyja h;

    static {
        ciht cihtVar = new ciht();
        a = cihtVar;
        eyfy.registerDefaultInstance(ciht.class, cihtVar);
    }

    private ciht() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004ለ\u0003\u0005ဉ\u0004\u0006ဉ\u0005", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
        }
        if (ordinal == 3) {
            return new ciht();
        }
        if (ordinal == 4) {
            return new cihs();
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
        synchronized (ciht.class) {
            eyhzVar = i;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                i = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
