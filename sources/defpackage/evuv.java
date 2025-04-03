package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evuv extends eyfy implements eyht {
    public static final evuv a;
    private static volatile eyhz i;
    public int b;
    public int d;
    public evus f;
    public evux g;
    public evvr h;
    public String c = "";
    public String e = "";

    static {
        evuv evuvVar = new evuv();
        a = evuvVar;
        eyfy.registerDefaultInstance(evuv.class, evuvVar);
    }

    private evuv() {
        eyee eyeeVar = eyee.b;
        emptyProtobufList();
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\u001b\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0005ဉ\t\u0012င\u0002\u0014ဉ\u001a\u0018ဈ\u0003\u001bဉ\u0018", new Object[]{"b", "c", "f", "d", "h", "e", "g"});
        }
        if (ordinal == 3) {
            return new evuv();
        }
        if (ordinal == 4) {
            return new evut();
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
        synchronized (evuv.class) {
            eyhzVar = i;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                i = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
