package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emiw extends eyfy implements eyht {
    public static final emiw a;
    private static volatile eyhz e;
    public int b;
    public float c;
    public eygr d = eyfy.emptyProtobufList();

    static {
        emiw emiwVar = new emiw();
        a = emiwVar;
        eyfy.registerDefaultInstance(emiw.class, emiwVar);
    }

    private emiw() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ခ\u0000\u0002\u001a", new Object[]{"b", "c", "d"});
        }
        if (ordinal == 3) {
            return new emiw();
        }
        if (ordinal == 4) {
            return new emiv();
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
        synchronized (emiw.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
