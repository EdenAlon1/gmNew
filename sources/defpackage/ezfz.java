package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ezfz extends eyfy implements eyht {
    public static final ezfz a;
    private static volatile eyhz h;
    public String b = "";
    public eygr c = emptyProtobufList();
    public long d;
    public int e;
    public int f;
    public int g;

    static {
        ezfz ezfzVar = new ezfz();
        a = ezfzVar;
        eyfy.registerDefaultInstance(ezfz.class, ezfzVar);
    }

    private ezfz() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0001\u0000\u0001Ȉ\u0002\u001b\u0003\u0003\u0004\f\u0005\f\u0006\f", new Object[]{"b", "c", ezfq.class, "d", "e", "f", "g"});
        }
        if (ordinal == 3) {
            return new ezfz();
        }
        if (ordinal == 4) {
            return new ezfx();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = h;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (ezfz.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
