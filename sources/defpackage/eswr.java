package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eswr extends eyfy implements eyht {
    public static final eswr a;
    private static volatile eyhz m;
    public int b;
    public int f;
    public eydq h;
    public eydq i;
    public eyja j;
    public eyja k;
    public eyja l;
    public eyhm g = eyhm.a;
    public String c = "";
    public String d = "";
    public String e = "";

    static {
        eswr eswrVar = new eswr();
        a = eswrVar;
        eyfy.registerDefaultInstance(eswr.class, eswrVar);
    }

    private eswr() {
        eyee eyeeVar = eyee.b;
        eyfy.emptyProtobufList();
        emptyIntList();
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\n\u0000\u0001\u0001\u0012\n\u0001\u0000\u0000\u0001Ȉ\u0002Ȉ\u0006\f\tဉ\u0001\nဉ\u0002\u000bဉ\u0003\fဉ\u0004\u00102\u0011ဉ\u0005\u0012Ȉ", new Object[]{"b", "c", "e", "f", "h", "i", "j", "k", "g", eswq.a, "l", "d"});
        }
        if (ordinal == 3) {
            return new eswr();
        }
        if (ordinal == 4) {
            return new eswp();
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
        synchronized (eswr.class) {
            eyhzVar = m;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                m = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
