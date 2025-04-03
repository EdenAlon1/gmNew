package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rqk extends eyfy implements eyht {
    public static final rqk a;
    private static volatile eyhz g;
    public int b;
    public rsf c;
    public rsi d;
    public rsl e;
    public rsc f;

    static {
        rqk rqkVar = new rqk();
        a = rqkVar;
        eyfy.registerDefaultInstance(rqk.class, rqkVar);
    }

    private rqk() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u00017Ĩ\u0004\u0000\u0000\u00007ဉ\u0000ģဉ\u0001ħဉ\u0002Ĩဉ\u0003", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (ordinal == 3) {
            return new rqk();
        }
        if (ordinal == 4) {
            return new rqj();
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
        synchronized (rqk.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
