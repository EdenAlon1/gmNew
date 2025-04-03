package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emqv extends eyfy implements eyht {
    public static final emqv a;
    private static volatile eyhz p;
    public int b;
    public int c;
    public int h;
    public long k;
    public float n;
    public int o;
    public String d = "";
    public String e = "";
    public eygr f = eyfy.emptyProtobufList();
    public eygr g = emptyProtobufList();
    public String i = "";
    public String j = "";
    public String l = "";
    public String m = "";

    static {
        emqv emqvVar = new emqv();
        a = emqvVar;
        eyfy.registerDefaultInstance(emqv.class, emqvVar);
    }

    private emqv() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\r\u0000\u0001\u0001\r\r\u0000\u0002\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003\u001a\u0004\u001b\u0005᠌\u0003\u0006ဈ\u0004\u0007ဈ\u0005\bဂ\u0006\tဈ\u0002\nဈ\u0007\u000bဈ\b\fခ\t\r᠌\n", new Object[]{"b", "c", fbrh.a, "d", "f", "g", emqt.class, "h", fbrk.a, "i", "j", "k", "e", "l", "m", "n", "o", fbrf.a});
        }
        if (ordinal == 3) {
            return new emqv();
        }
        if (ordinal == 4) {
            return new emqu();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = p;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (emqv.class) {
            eyhzVar = p;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                p = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
