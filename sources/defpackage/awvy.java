package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awvy extends eyfy implements eyht {
    public static final eygj a = new awvw();
    public static final awvy b;
    private static volatile eyhz o;
    public int c;
    public awui f;
    public awwy i;
    public awwa j;
    public awvn k;
    public awui l;
    public awwj m;
    public axaf n;
    public String d = "";
    public String e = "";
    public eygi g = emptyIntList();
    public eygr h = emptyProtobufList();

    static {
        awvy awvyVar = new awvy();
        b = awvyVar;
        eyfy.registerDefaultInstance(awvy.class, awvyVar);
    }

    private awvy() {
    }

    public final void a() {
        eygi eygiVar = this.g;
        if (eygiVar.c()) {
            return;
        }
        this.g = eyfy.mutableCopy(eygiVar);
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(b, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0002\u0000\u0001ဈ\u0000\u0002ဉ\u0002\u0003ࠞ\u0004\u001b\u0005ဉ\u0003\u0006ဉ\u0005\u0007ဉ\u0006\bဉ\u0007\tဉ\u0004\nဈ\u0001\u000bဉ\b", new Object[]{"c", "d", "f", "g", awvg.a, "h", awwq.class, "i", "k", "l", "m", "j", "e", "n"});
        }
        if (ordinal == 3) {
            return new awvy();
        }
        if (ordinal == 4) {
            return new awvx();
        }
        if (ordinal == 5) {
            return b;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = o;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (awvy.class) {
            eyhzVar = o;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(b);
                o = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
