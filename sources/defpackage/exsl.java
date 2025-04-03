package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class exsl extends eyfy implements eyht {
    public static final exsl a;
    private static volatile eyhz q;
    public int b;
    public float c;
    public int d;
    public int j;
    public int n;
    public int p;
    public String e = "";
    public String f = "";
    public String g = "";
    public String h = "";
    public String i = "";
    public String k = "";
    public eygr l = emptyProtobufList();
    public eygr m = emptyProtobufList();
    public String o = "";

    static {
        exsl exslVar = new exsl();
        a = exslVar;
        eyfy.registerDefaultInstance(exsl.class, exslVar);
    }

    private exsl() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u000e\u0000\u0001\u0002\u0011\u000e\u0000\u0002\u0000\u0002ခ\u0000\u0003᠌\u0001\u0004ဈ\u0002\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဈ\u0005\bဈ\u0006\tင\u0007\nဈ\b\f\u001b\r\u001b\u000e᠌\n\u000fဈ\u000b\u0011᠌\u000e", new Object[]{"b", "c", "d", exqi.a, "e", "f", "g", "h", "i", "j", "k", "l", exqs.class, "m", exqo.class, "n", exsh.a, "o", "p", exsk.a});
        }
        if (ordinal == 3) {
            return new exsl();
        }
        if (ordinal == 4) {
            return new exsj();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = q;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (exsl.class) {
            eyhzVar = q;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                q = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
