package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfkh extends eyfy implements eyht {
    public static final dfkh a;
    private static volatile eyhz h;
    public int b;
    public eyja c;
    public long d;
    public long e;
    public long f;
    public boolean g;

    static {
        dfkh dfkhVar = new dfkh();
        a = dfkhVar;
        eyfy.registerDefaultInstance(dfkh.class, dfkhVar);
    }

    private dfkh() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဇ\u0004", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (ordinal == 3) {
            return new dfkh();
        }
        if (ordinal == 4) {
            return new dfkg();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = h;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (dfkh.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
