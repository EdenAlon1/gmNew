package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axbn {
    public static final axbn a;
    public static final axbn b;
    public static final axbn c;
    public static final axbn d;
    private static final /* synthetic */ axbn[] e;

    static {
        axbn axbnVar = new axbn("RECOVERY_SUCCESSFUL", 0);
        a = axbnVar;
        axbn axbnVar2 = new axbn("RECOVERY_SUCCESSFUL_NO_RETRY", 1);
        b = axbnVar2;
        axbn axbnVar3 = new axbn("RECOVERY_FAILED_TRANSIENTLY", 2);
        c = axbnVar3;
        axbn axbnVar4 = new axbn("RECOVERY_FAILED_PERMANENTLY", 3);
        d = axbnVar4;
        axbn[] axbnVarArr = {axbnVar, axbnVar2, axbnVar3, axbnVar4};
        e = axbnVarArr;
        ffhw.a(axbnVarArr);
    }

    private axbn(String str, int i) {
    }

    public static axbn[] values() {
        return (axbn[]) e.clone();
    }
}
