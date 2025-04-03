package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fivr extends eyfy implements eyht {
    public static final fivr a;
    private static volatile eyhz c;
    public eygh b = emptyFloatList();

    static {
        fivr fivrVar = new fivr();
        a = fivrVar;
        eyfy.registerDefaultInstance(fivr.class, fivrVar);
    }

    private fivr() {
    }

    public final void a() {
        eygh eyghVar = this.b;
        if (eyghVar.c()) {
            return;
        }
        this.b = eyfy.mutableCopy(eyghVar);
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001$", new Object[]{"b"});
        }
        if (ordinal == 3) {
            return new fivr();
        }
        if (ordinal == 4) {
            return new fivq();
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
        synchronized (fivr.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
