package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfkl extends eyfy implements eyht {
    public static final dfkl a;
    private static volatile eyhz d;
    public int b;
    public boolean c;

    static {
        dfkl dfklVar = new dfkl();
        a = dfklVar;
        eyfy.registerDefaultInstance(dfkl.class, dfklVar);
    }

    private dfkl() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"b", "c"});
        }
        if (ordinal == 3) {
            return new dfkl();
        }
        if (ordinal == 4) {
            return new dfkk();
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
        synchronized (dfkl.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
