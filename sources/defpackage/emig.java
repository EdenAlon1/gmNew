package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emig extends eyfy implements eyht {
    public static final emig a;
    private static volatile eyhz e;
    public Object c;
    public int b = 0;
    public eygr d = eyfy.emptyProtobufList();

    static {
        emig emigVar = new emig();
        a = emigVar;
        eyfy.registerDefaultInstance(emig.class, emigVar);
    }

    private emig() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001a\u0002;\u0000\u0003:\u0000", new Object[]{"c", "b", "d"});
        }
        if (ordinal == 3) {
            return new emig();
        }
        if (ordinal == 4) {
            return new emif();
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
        synchronized (emig.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
