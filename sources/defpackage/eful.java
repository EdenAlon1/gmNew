package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eful {
    public static final eful a;
    public static final eful b;
    public static final eful c;
    private static final /* synthetic */ eful[] e;
    public final String d;

    static {
        eful efulVar = new eful("PROD", 0, "%s.googleapis.com");
        a = efulVar;
        eful efulVar2 = new eful("AUTOPUSH", 1, "autopush-%s.sandbox.googleapis.com");
        b = efulVar2;
        eful efulVar3 = new eful("SANDBOX", 2, "dev-%s.corp.googleapis.com");
        c = efulVar3;
        eful[] efulVarArr = {efulVar, efulVar2, efulVar3};
        e = efulVarArr;
        ffhw.a(efulVarArr);
    }

    private eful(String str, int i, String str2) {
        this.d = str2;
    }

    public static eful[] values() {
        return (eful[]) e.clone();
    }
}
