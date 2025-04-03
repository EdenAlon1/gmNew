package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class famh extends eyfy implements eyht {
    public static final famh a;
    private static volatile eyhz d;
    public int b = 0;
    public Object c;

    static {
        famh famhVar = new famh();
        a = famhVar;
        eyfy.registerDefaultInstance(famh.class, famhVar);
    }

    private famh() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0001\u0000\u0001\u0007\u0004\u0000\u0000\u0000\u0001;\u0000\u0002<\u0000\u0003<\u0000\u0007<\u0000", new Object[]{"c", "b", famu.class, eydq.class, famb.class});
        }
        if (ordinal == 3) {
            return new famh();
        }
        if (ordinal == 4) {
            return new famg();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = d;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (famh.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
