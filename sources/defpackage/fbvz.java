package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbvz extends eyfy implements eyht {
    public static final fbvz a;
    private static volatile eyhz e;
    public int b;
    public int c;
    public fbwb d;

    static {
        fbvz fbvzVar = new fbvz();
        a = fbvzVar;
        eyfy.registerDefaultInstance(fbvz.class, fbvzVar);
    }

    private fbvz() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002ဉ\u0000", new Object[]{"b", "c", "d"});
        }
        if (ordinal == 3) {
            return new fbvz();
        }
        if (ordinal == 4) {
            return new fbvy();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = e;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (fbvz.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
