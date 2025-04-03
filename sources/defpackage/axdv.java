package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axdv {
    public static final axdv a;
    public static final axdv b;
    private static final /* synthetic */ axdv[] c;

    static {
        axdv axdvVar = new axdv("INITIAL_SYNC_SUCCESS", 0);
        a = axdvVar;
        axdv axdvVar2 = new axdv("INITIAL_SYNC_FAILURE", 1);
        b = axdvVar2;
        axdv[] axdvVarArr = {axdvVar, axdvVar2};
        c = axdvVarArr;
        ffhw.a(axdvVarArr);
    }

    private axdv(String str, int i) {
    }

    public static axdv[] values() {
        return (axdv[]) c.clone();
    }
}
