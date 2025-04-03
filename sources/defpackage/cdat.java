package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdat {
    public static final cdat a;
    public static final cdat b;
    public static final cdat c;
    public static final cdat d;
    private static final /* synthetic */ cdat[] e;
    private final String f;

    static {
        cdat cdatVar = new cdat("UPDATE", 0, "Update");
        a = cdatVar;
        cdat cdatVar2 = new cdat("DELETE", 1, "Delete");
        b = cdatVar2;
        cdat cdatVar3 = new cdat("INSERT", 2, "Insert");
        c = cdatVar3;
        cdat cdatVar4 = new cdat("BATCH_INSERT", 3, "BatchInsert");
        d = cdatVar4;
        cdat[] cdatVarArr = {cdatVar, cdatVar2, cdatVar3, cdatVar4};
        e = cdatVarArr;
        ffhw.a(cdatVarArr);
    }

    private cdat(String str, int i, String str2) {
        this.f = str2;
    }

    public static cdat[] values() {
        return (cdat[]) e.clone();
    }

    public final String a(String str) {
        return "Bugle.Cms." + str + "." + this.f;
    }

    public final String b(String str) {
        return a(str).concat(".Duration");
    }

    public final String c(String str) {
        return ordinal() != 3 ? a(str).concat(".Outcome") : a(str).concat(".Outcomes");
    }
}
