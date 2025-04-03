package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajrr extends eyfy implements eyht {
    public static final ajrr a;
    private static volatile eyhz e;
    public eyee b = eyee.b;
    public long c;
    public long d;

    static {
        ajrr ajrrVar = new ajrr();
        a = ajrrVar;
        eyfy.registerDefaultInstance(ajrr.class, ajrrVar);
    }

    private ajrr() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\n\u0002\u0002\u0003\u0002", new Object[]{"b", "c", "d"});
        }
        if (ordinal == 3) {
            return new ajrr();
        }
        if (ordinal == 4) {
            return new ajrq();
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
        synchronized (ajrr.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
