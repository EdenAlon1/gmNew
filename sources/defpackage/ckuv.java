package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckuv extends eyfy implements eyht {
    public static final ckuv a;
    private static volatile eyhz e;
    public int b;
    public int c;
    public eyja d;

    static {
        ckuv ckuvVar = new ckuv();
        a = ckuvVar;
        eyfy.registerDefaultInstance(ckuv.class, ckuvVar);
    }

    private ckuv() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဉ\u0001", new Object[]{"b", "c", "d"});
        }
        if (ordinal == 3) {
            return new ckuv();
        }
        if (ordinal == 4) {
            return new ckuu();
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
        synchronized (ckuv.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
