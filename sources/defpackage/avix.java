package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avix extends eyfy implements eyht {
    public static final avix a;
    private static volatile eyhz c;
    public String b = "";
    private boolean d;

    static {
        avix avixVar = new avix();
        a = avixVar;
        eyfy.registerDefaultInstance(avix.class, avixVar);
    }

    private avix() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u0007\u0003Ȉ", new Object[]{"d", "b"});
        }
        if (ordinal == 3) {
            return new avix();
        }
        if (ordinal == 4) {
            return new aviw();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = c;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (avix.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
