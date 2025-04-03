package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ezog extends eyfy implements eyht {
    public static final ezog a;
    private static volatile eyhz f;
    public int b;
    public long c;
    public String d;
    public eygr e;

    static {
        ezog ezogVar = new ezog();
        a = ezogVar;
        eyfy.registerDefaultInstance(ezog.class, ezogVar);
    }

    private ezog() {
        emptyProtobufList();
        emptyProtobufList();
        this.d = "";
        this.e = emptyProtobufList();
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0007\t\u0003\u0000\u0001\u0000\u0007ဃ\u0004\bဈ\u0005\t\u001b", new Object[]{"b", "c", "d", "e", ezof.class});
        }
        if (ordinal == 3) {
            return new ezog();
        }
        if (ordinal == 4) {
            return new ezod();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = f;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (ezog.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
