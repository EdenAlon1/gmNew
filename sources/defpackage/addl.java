package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class addl extends eyfy implements eyht {
    public static final addl a;
    private static volatile eyhz g;
    public int b;
    public int c;
    public boolean d;
    public boolean e;
    public boolean f;

    static {
        addl addlVar = new addl();
        a = addlVar;
        eyfy.registerDefaultInstance(addl.class, addlVar);
    }

    private addl() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0007\u0004\u0007\u0005\u0007", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (ordinal == 3) {
            return new addl();
        }
        if (ordinal == 4) {
            return new addk();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = g;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (addl.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
