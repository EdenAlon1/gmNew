package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esut {
    public static final esut a;
    public static final esut b;
    public static final esut c;
    public static final esut d;
    private static final /* synthetic */ esut[] e;

    static {
        esut esutVar = new esut("UNKNOWN", 0);
        a = esutVar;
        esut esutVar2 = new esut("OFFLINE", 1);
        b = esutVar2;
        esut esutVar3 = new esut("ONLINE", 2);
        c = esutVar3;
        esut esutVar4 = new esut("NOT_RCS", 3);
        d = esutVar4;
        esut[] esutVarArr = {esutVar, esutVar2, esutVar3, esutVar4};
        e = esutVarArr;
        ffhw.a(esutVarArr);
    }

    private esut(String str, int i) {
    }

    public static esut[] values() {
        return (esut[]) e.clone();
    }
}
