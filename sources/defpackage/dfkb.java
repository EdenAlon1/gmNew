package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfkb extends eyfy implements eyht {
    public static final dfkb a;
    private static volatile eyhz i;
    public int b;
    public long c;
    public String d = "";
    public eyja e;
    public int f;
    public long g;
    public long h;

    static {
        dfkb dfkbVar = new dfkb();
        a = dfkbVar;
        eyfy.registerDefaultInstance(dfkb.class, dfkbVar);
    }

    private dfkb() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ለ\u0001\u0003ဉ\u0002\u0004ဌ\u0003\u0005ဂ\u0004\u0006ဂ\u0005", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
        }
        if (ordinal == 3) {
            return new dfkb();
        }
        if (ordinal == 4) {
            return new dfka();
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
        synchronized (dfkb.class) {
            eyhzVar = i;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                i = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
