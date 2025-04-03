package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfkf extends eyfy implements eyht {
    public static final dfkf a;
    private static volatile eyhz g;
    public int b;
    public long c;
    public long d;
    public dfkh e;
    public eyee f = eyee.b;

    static {
        dfkf dfkfVar = new dfkf();
        a = dfkfVar;
        eyfy.registerDefaultInstance(dfkf.class, dfkfVar);
    }

    private dfkf() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဉ\u0002\u0004ည\u0003", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (ordinal == 3) {
            return new dfkf();
        }
        if (ordinal == 4) {
            return new dfke();
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
        synchronized (dfkf.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
