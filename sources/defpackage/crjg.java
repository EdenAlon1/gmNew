package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes8.dex */
public final class crjg {
    public static final crjg a;
    public static final crjg b;
    private static final /* synthetic */ crjg[] d;
    public final String c;

    static {
        crjg crjgVar = new crjg("THUMBNAIL", 0, "t");
        a = crjgVar;
        crjg crjgVar2 = new crjg("DISPLAY", 1, "d");
        b = crjgVar2;
        crjg[] crjgVarArr = {crjgVar, crjgVar2};
        d = crjgVarArr;
        ffhw.a(crjgVarArr);
    }

    private crjg(String str, int i, String str2) {
        this.c = str2;
    }

    public static crjg[] values() {
        return (crjg[]) d.clone();
    }
}
