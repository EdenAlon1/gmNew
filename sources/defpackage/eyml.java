package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eyml extends eyfy implements eyht {
    public static final eyml a;
    private static volatile eyhz m;
    public int b;
    public int c;
    public int d;
    public int e;
    public eyma f;
    public boolean g;
    public long h;
    public long i;
    public eygr j;
    public int k;
    public eymc l;

    static {
        eyml eymlVar = new eyml();
        a = eymlVar;
        eyfy.registerDefaultInstance(eyml.class, eymlVar);
    }

    private eyml() {
        emptyIntList();
        this.j = emptyProtobufList();
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\n\u0000\u0001\u0002\f\n\u0000\u0001\u0000\u0002င\u0000\u0003င\u0001\u0004င\u0002\u0005ဉ\u0003\u0007ဇ\u0005\bဂ\u0006\tဂ\u0007\n\u001b\u000b᠌\b\fဉ\t", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", eymi.class, "k", eymk.a, "l"});
        }
        if (ordinal == 3) {
            return new eyml();
        }
        if (ordinal == 4) {
            return new eymj();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = m;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (eyml.class) {
            eyhzVar = m;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                m = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
