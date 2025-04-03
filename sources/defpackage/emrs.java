package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emrs extends eyfy implements eyht {
    public static final emrs a;
    private static volatile eyhz e;
    public int b;
    public eyee c;
    public eyee d;

    static {
        emrs emrsVar = new emrs();
        a = emrsVar;
        eyfy.registerDefaultInstance(emrs.class, emrsVar);
    }

    private emrs() {
        eyee eyeeVar = eyee.b;
        eyee eyeeVar2 = eyee.b;
        this.c = eyeeVar2;
        this.d = eyeeVar2;
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0000\u0003\u0005\u0003\u0000\u0000\u0000\u0003\n\u0004\u000b\u0005\n", new Object[]{"d", "b", "c"});
        }
        if (ordinal == 3) {
            return new emrs();
        }
        if (ordinal == 4) {
            return new emrr();
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
        synchronized (emrs.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
