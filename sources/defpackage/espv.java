package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class espv {
    public static final espv a;
    public static final espv b;
    public static final espv c;
    public static final espv d;
    public static final espv e;
    public static final espv f;
    public static final espv g;
    private static final /* synthetic */ espv[] h;

    static {
        espv espvVar = new espv("ERROR_NO_RETRY", 0);
        a = espvVar;
        espv espvVar2 = new espv("ERROR_RETRY_IMMEDIATE", 1);
        b = espvVar2;
        espv espvVar3 = new espv("ERROR_RETRY_REFRESH_REGISTRATION", 2);
        c = espvVar3;
        espv espvVar4 = new espv("ERROR_RETRY_NEEDS_REPROVISION", 3);
        d = espvVar4;
        espv espvVar5 = new espv("ERROR_RETRY_NEEDS_GROUP_RECREATION", 4);
        e = espvVar5;
        espv espvVar6 = new espv("ERROR_REMOVE_SELF_FROM_GROUP", 5);
        f = espvVar6;
        espv espvVar7 = new espv("ERROR_DESTINATION_NOT_TACHYGRAM", 6);
        g = espvVar7;
        espv[] espvVarArr = {espvVar, espvVar2, espvVar3, espvVar4, espvVar5, espvVar6, espvVar7};
        h = espvVarArr;
        ffhw.a(espvVarArr);
    }

    private espv(String str, int i) {
    }

    public static espv[] values() {
        return (espv[]) h.clone();
    }
}
