package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fblr extends eyfy implements eyht {
    public static final fblr a;
    private static volatile eyhz d;
    public eygr b = emptyProtobufList();
    public int c;

    static {
        fblr fblrVar = new fblr();
        a = fblrVar;
        eyfy.registerDefaultInstance(fblr.class, fblrVar);
    }

    private fblr() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\f", new Object[]{"b", fblq.class, "c"});
        }
        if (ordinal == 3) {
            return new fblr();
        }
        if (ordinal == 4) {
            return new fblo();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = d;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (fblr.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
