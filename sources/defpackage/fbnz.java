package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbnz extends eyfy implements eyht {
    public static final fbnz a;
    private static volatile eyhz d;
    public boolean b;
    public int c;

    static {
        fbnz fbnzVar = new fbnz();
        a = fbnzVar;
        eyfy.registerDefaultInstance(fbnz.class, fbnzVar);
    }

    private fbnz() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u0007\u0003\f", new Object[]{"b", "c"});
        }
        if (ordinal == 3) {
            return new fbnz();
        }
        if (ordinal == 4) {
            return new fbny();
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
        synchronized (fbnz.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
