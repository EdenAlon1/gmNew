package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vhr extends eyfy implements eyht {
    public static final vhr a;
    private static volatile eyhz e;
    public int b;
    public cmrl c;
    public String d = "";

    static {
        vhr vhrVar = new vhr();
        a = vhrVar;
        eyfy.registerDefaultInstance(vhr.class, vhrVar);
    }

    private vhr() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001", new Object[]{"b", "c", "d"});
        }
        if (ordinal == 3) {
            return new vhr();
        }
        if (ordinal == 4) {
            return new vhq();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = e;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (vhr.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
