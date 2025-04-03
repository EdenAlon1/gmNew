package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clpk extends eyfy implements eyht {
    public static final clpk a;
    private static volatile eyhz e;
    public int b;
    public clnm c;
    public eyee d = eyee.b;

    static {
        clpk clpkVar = new clpk();
        a = clpkVar;
        eyfy.registerDefaultInstance(clpk.class, clpkVar);
    }

    private clpk() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001", new Object[]{"b", "c", "d"});
        }
        if (ordinal == 3) {
            return new clpk();
        }
        if (ordinal == 4) {
            return new clpj();
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
        synchronized (clpk.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
