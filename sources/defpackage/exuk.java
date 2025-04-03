package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class exuk extends eyfy implements eyht {
    public static final exuk a;
    private static volatile eyhz i;
    public int b;
    public exvr d;
    public int e;
    public extv g;
    public String c = "";
    public eygr f = emptyProtobufList();
    public String h = "";

    static {
        exuk exukVar = new exuk();
        a = exukVar;
        eyfy.registerDefaultInstance(exuk.class, exukVar);
    }

    private exuk() {
    }

    public final void a() {
        eygr eygrVar = this.f;
        if (eygrVar.c()) {
            return;
        }
        this.f = eyfy.mutableCopy(eygrVar);
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003\u001b\u0005᠌\u0002\u0006ဉ\u0003\u0007ဈ\u0004", new Object[]{"b", "c", "d", "f", exuj.class, "e", exyc.a, "g", "h"});
        }
        if (ordinal == 3) {
            return new exuk();
        }
        if (ordinal == 4) {
            return new exuh();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = i;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (exuk.class) {
            eyhzVar = i;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                i = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
