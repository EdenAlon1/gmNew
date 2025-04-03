package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emto extends eyfy implements eyht {
    public static final emto a;
    private static volatile eyhz k;
    public int b;
    public int c;
    public int i;
    public String d = "";
    public String e = "";
    public String f = "";
    public String g = "";
    public String h = "";
    public eygl j = emptyLongList();

    static {
        emto emtoVar = new emto();
        a = emtoVar;
        eyfy.registerDefaultInstance(emto.class, emtoVar);
    }

    private emto() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\t\u0000\u0000\u0001\u000e\t\u0000\u0001\u0000\u0001\f\u0002\f\u0004Ȉ\u0005Ȉ\bȈ\tȈ\u000b\f\r%\u000eȈ", new Object[]{"b", "c", "d", "e", "f", "h", "i", "j", "g"});
        }
        if (ordinal == 3) {
            return new emto();
        }
        if (ordinal == 4) {
            return new emtm();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = k;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (emto.class) {
            eyhzVar = k;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                k = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
