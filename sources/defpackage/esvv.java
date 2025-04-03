package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esvv extends eyfy implements eyht {
    public static final eygj a = new esvt();
    public static final esvv b;
    private static volatile eyhz l;
    public int c;
    public eydq g;
    public eyja h;
    public eswo j;
    public String d = "";
    public eygr e = emptyProtobufList();
    public eygr f = emptyProtobufList();
    public eygi i = emptyIntList();
    public String k = "";

    static {
        esvv esvvVar = new esvv();
        b = esvvVar;
        eyfy.registerDefaultInstance(esvv.class, esvvVar);
    }

    private esvv() {
    }

    public final void a() {
        eygr eygrVar = this.f;
        if (eygrVar.c()) {
            return;
        }
        this.f = eyfy.mutableCopy(eygrVar);
    }

    public final void b() {
        eygr eygrVar = this.e;
        if (eygrVar.c()) {
            return;
        }
        this.e = eyfy.mutableCopy(eygrVar);
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(b, "\u0000\b\u0000\u0001\u0001\r\b\u0000\u0003\u0000\u0001Ȉ\u0003\u001b\u0004\u001b\u0007ဉ\u0000\bဉ\u0001\u000b,\fဉ\u0004\rȈ", new Object[]{"c", "d", "e", eszs.class, "f", esvx.class, "g", "h", "i", "j", "k"});
        }
        if (ordinal == 3) {
            return new esvv();
        }
        if (ordinal == 4) {
            return new esvu();
        }
        if (ordinal == 5) {
            return b;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = l;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (esvv.class) {
            eyhzVar = l;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(b);
                l = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
