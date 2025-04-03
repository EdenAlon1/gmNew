package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cupq {
    public static final cupq a;
    public static final cupq b;
    private static final /* synthetic */ cupq[] d;
    public final String c;

    static {
        cupq cupqVar = new cupq("TEXT_CLASSIFICATION_ROLE", 0, "7955696939296490477");
        a = cupqVar;
        cupq cupqVar2 = new cupq("DESTINATION_CLASSIFICATION_ROLE", 1, "4595216684581506832");
        b = cupqVar2;
        cupq[] cupqVarArr = {cupqVar, cupqVar2};
        d = cupqVarArr;
        ffhw.a(cupqVarArr);
    }

    private cupq(String str, int i, String str2) {
        this.c = str2;
    }

    public static cupq[] values() {
        return (cupq[]) d.clone();
    }
}
