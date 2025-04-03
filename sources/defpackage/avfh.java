package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avfh extends eyfy implements eyht {
    public static final avfh a;
    private static volatile eyhz g;
    public boolean b;
    public boolean c;
    public String d = "";
    public String e = "";
    public String f = "";

    static {
        avfh avfhVar = new avfh();
        a = avfhVar;
        eyfy.registerDefaultInstance(avfh.class, avfhVar);
    }

    private avfh() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003Ȉ\u0004Ȉ\u0005Ȉ", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (ordinal == 3) {
            return new avfh();
        }
        if (ordinal == 4) {
            return new avfg();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = g;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (avfh.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
