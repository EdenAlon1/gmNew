package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eldq extends eyfy implements eyht {
    public static final eldq a;
    private static volatile eyhz k;
    public int b;
    public long c;
    public long d;
    public eygr e = emptyProtobufList();
    public long f;
    public long g;
    public int h;
    public ekxg i;
    public int j;

    static {
        eldq eldqVar = new eldq();
        a = eldqVar;
        eyfy.registerDefaultInstance(eldq.class, eldqVar);
    }

    private eldq() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\b\u0000\u0001\u0001\u000b\b\u0000\u0001\u0000\u0001စ\u0000\u0002စ\u0001\u0003\u001b\u0004ဂ\u0002\u0005ဂ\u0003\u0006င\u0004\nဉ\u0005\u000b᠌\u0006", new Object[]{"b", "c", "d", "e", ekzx.class, "f", "g", "h", "i", "j", eldo.a});
        }
        if (ordinal == 3) {
            return new eldq();
        }
        if (ordinal == 4) {
            return new eldn();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = k;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (eldq.class) {
            eyhzVar = k;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                k = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
