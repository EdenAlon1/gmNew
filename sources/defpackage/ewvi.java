package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewvi extends eyfy implements eyht {
    public static final ewvi a;
    private static volatile eyhz l;
    public int b;
    public int h;
    public int i;
    public float j;
    public eygr c = eyfy.emptyProtobufList();
    public eygr d = emptyProtobufList();
    public String e = "";
    public String f = "";
    public eygr g = eyfy.emptyProtobufList();
    public eygr k = emptyProtobufList();

    static {
        ewvi ewviVar = new ewvi();
        a = ewviVar;
        eyfy.registerDefaultInstance(ewvi.class, ewviVar);
    }

    private ewvi() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\t\u0000\u0001\u0001\n\t\u0000\u0004\u0000\u0001\u001a\u0003ဈ\u0000\u0004ဈ\u0001\u0005\u001a\u0006င\u0002\u0007င\u0003\b\u001b\tခ\u0004\n\u001b", new Object[]{"b", "c", "e", "f", "g", "h", "i", "d", fabz.class, "j", "k", fabu.class});
        }
        if (ordinal == 3) {
            return new ewvi();
        }
        if (ordinal == 4) {
            return new ewvh();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = l;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (ewvi.class) {
            eyhzVar = l;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                l = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
