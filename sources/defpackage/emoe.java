package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emoe extends eyfy implements eyht {
    public static final emoe a;
    private static volatile eyhz e;
    public String b = "";
    public eygr c = eyfy.emptyProtobufList();
    public eygr d = eyfy.emptyProtobufList();
    private int f;

    static {
        emoe emoeVar = new emoe();
        a = emoeVar;
        eyfy.registerDefaultInstance(emoe.class, emoeVar);
    }

    private emoe() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001a\u0003\u001a", new Object[]{"f", "b", "c", "d"});
        }
        if (ordinal == 3) {
            return new emoe();
        }
        if (ordinal == 4) {
            return new emod();
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
        synchronized (emoe.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
