package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dloe extends eyfy implements eyht {
    public static final dloe a;
    private static volatile eyhz e;
    public int b;
    public int c;
    public boolean d = true;
    private int f;

    static {
        dloe dloeVar = new dloe();
        a = dloeVar;
        eyfy.registerDefaultInstance(dloe.class, dloeVar);
    }

    private dloe() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0007\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0006᠌\u0005\u0007ဇ\u0006", new Object[]{"f", "b", dloc.a, "c", dloa.a, "d"});
        }
        if (ordinal == 3) {
            return new dloe();
        }
        if (ordinal == 4) {
            return new dlnz();
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
        synchronized (dloe.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
