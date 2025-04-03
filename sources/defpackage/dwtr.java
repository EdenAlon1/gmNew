package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwtr extends eyfy implements eyht {
    public static final dwtr a;
    private static volatile eyhz h;
    public int b;
    public eyja c;
    public boolean e;
    public dwtv f;
    public eyhm g = eyhm.a;
    public eygr d = emptyProtobufList();

    static {
        dwtr dwtrVar = new dwtr();
        a = dwtrVar;
        eyfy.registerDefaultInstance(dwtr.class, dwtrVar);
    }

    private dwtr() {
    }

    public final void a() {
        eygr eygrVar = this.d;
        if (eygrVar.c()) {
            return;
        }
        this.d = eyfy.mutableCopy(eygrVar);
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0001\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003ဇ\u0001\u0004ဉ\u0002\u00052", new Object[]{"b", "c", "d", dwte.class, "e", "f", "g", dwtq.a});
        }
        if (ordinal == 3) {
            return new dwtr();
        }
        if (ordinal == 4) {
            return new dwtp();
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
        synchronized (dwtr.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
