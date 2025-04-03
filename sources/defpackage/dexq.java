package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dexq extends eyfy implements eyht {
    public static final dexq a;
    private static volatile eyhz h;
    public int b;
    public int d;
    public boolean f;
    public boolean g;
    private int i;
    public String c = "";
    public eygr e = eyfy.emptyProtobufList();

    static {
        dexq dexqVar = new dexq();
        a = dexqVar;
        eyfy.registerDefaultInstance(dexq.class, dexqVar);
    }

    private dexq() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001\f\u0002Ȉ\u0003င\u0000\u0004Ț\u0005\u0007\u0006\u0007", new Object[]{"i", "b", "c", "d", "e", "f", "g"});
        }
        if (ordinal == 3) {
            return new dexq();
        }
        if (ordinal == 4) {
            return new dexp();
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
        synchronized (dexq.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
