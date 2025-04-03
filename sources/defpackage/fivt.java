package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fivt extends eyfy implements eyht {
    public static final fivt a;
    private static volatile eyhz c;
    public eygl b = emptyLongList();

    static {
        fivt fivtVar = new fivt();
        a = fivtVar;
        eyfy.registerDefaultInstance(fivt.class, fivtVar);
    }

    private fivt() {
    }

    public final void a() {
        eygl eyglVar = this.b;
        if (eyglVar.c()) {
            return;
        }
        this.b = eyfy.mutableCopy(eyglVar);
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001%", new Object[]{"b"});
        }
        if (ordinal == 3) {
            return new fivt();
        }
        if (ordinal == 4) {
            return new fivs();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = c;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (fivt.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
