package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emkl extends eyfy implements eyht {
    public static final emkl a;
    private static volatile eyhz j;
    public int d;
    public float e;
    public int f;
    public boolean g;
    private int k;
    public String b = "";
    public String c = "";
    public eygr h = eyfy.emptyProtobufList();
    public eygr i = eyfy.emptyProtobufList();

    static {
        emkl emklVar = new emkl();
        a = emklVar;
        eyfy.registerDefaultInstance(emkl.class, emklVar);
    }

    private emkl() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\b\u0000\u0001\u0002\n\b\u0000\u0002\u0000\u0002ဈ\u0000\u0003ဈ\u0001\u0004᠌\u0002\u0005ခ\u0003\u0007᠌\u0004\bဇ\u0005\t\u001a\n\u001a", new Object[]{"k", "b", "c", "d", emkj.a, "e", "f", fbrh.a, "g", "h", "i"});
        }
        if (ordinal == 3) {
            return new emkl();
        }
        if (ordinal == 4) {
            return new emki();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = j;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (emkl.class) {
            eyhzVar = j;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                j = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
