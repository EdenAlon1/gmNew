package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euln extends eyft implements eyfu {
    public static final euln a;
    private static volatile eyhz b;
    private byte c = 2;

    static {
        euln eulnVar = new euln();
        a = eulnVar;
        eyfy.registerDefaultInstance(euln.class, eulnVar);
    }

    private euln() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        switch (eyfxVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.c);
            case 1:
                this.c = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0000", null);
            case 3:
                return new euln();
            case 4:
                return new eulm();
            case 5:
                return a;
            case 6:
                eyhz eyhzVar2 = b;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (euln.class) {
                    eyhzVar = b;
                    if (eyhzVar == null) {
                        eyhzVar = new eyfr(a);
                        b = eyhzVar;
                    }
                }
                return eyhzVar;
            default:
                throw null;
        }
    }
}
