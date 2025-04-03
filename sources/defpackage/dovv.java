package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dovv {
    public static final dovv a;
    public static final dovv b;
    public static final dovv c;
    private static final /* synthetic */ dovv[] d;

    static {
        dovv dovvVar = new dovv("POSITION_1", 0);
        a = dovvVar;
        dovv dovvVar2 = new dovv("POSITION_2", 1);
        b = dovvVar2;
        dovv dovvVar3 = new dovv("POSITION_3", 2);
        c = dovvVar3;
        dovv[] dovvVarArr = {dovvVar, dovvVar2, dovvVar3};
        d = dovvVarArr;
        ffhw.a(dovvVarArr);
    }

    private dovv(String str, int i) {
    }

    public static dovv[] values() {
        return (dovv[]) d.clone();
    }
}
