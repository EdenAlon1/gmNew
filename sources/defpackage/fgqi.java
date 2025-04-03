package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgqi extends eyfy implements eyht {
    public static final fgqi a;
    private static volatile eyhz i;
    public int b;
    public int c;
    public eyja d;
    public String e = "";
    public String f = "";
    public int g;
    public long h;

    static {
        fgqi fgqiVar = new fgqi();
        a = fgqiVar;
        eyfy.registerDefaultInstance(fgqi.class, fgqiVar);
    }

    private fgqi() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005င\u0004\u0006ဂ\u0005", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
        }
        if (ordinal == 3) {
            return new fgqi();
        }
        if (ordinal == 4) {
            return new fgqh();
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
        synchronized (fgqi.class) {
            eyhzVar = i;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                i = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
