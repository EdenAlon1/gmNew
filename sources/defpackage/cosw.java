package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cosw extends eyfy implements eyht {
    public static final cosw a;
    private static volatile eyhz e;
    public int b;
    public eygr c = emptyProtobufList();
    public cost d;

    static {
        cosw coswVar = new cosw();
        a = coswVar;
        eyfy.registerDefaultInstance(cosw.class, coswVar);
    }

    private cosw() {
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
            return newMessageInfo(a, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"b", "c", cosz.class, "d"});
        }
        if (ordinal == 3) {
            return new cosw();
        }
        if (ordinal == 4) {
            return new cosv();
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
        synchronized (cosw.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
