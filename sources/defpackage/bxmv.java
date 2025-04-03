package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxmv {
    public static final bxmv a;
    public static final bxmv b;
    public static final bxmv c;
    private static final /* synthetic */ bxmv[] d;

    static {
        bxmv bxmvVar = new bxmv("COPIED", 0);
        a = bxmvVar;
        bxmv bxmvVar2 = new bxmv("RESTORED", 1);
        b = bxmvVar2;
        bxmv bxmvVar3 = new bxmv("FAILED", 2);
        c = bxmvVar3;
        bxmv[] bxmvVarArr = {bxmvVar, bxmvVar2, bxmvVar3};
        d = bxmvVarArr;
        ffhw.a(bxmvVarArr);
    }

    private bxmv(String str, int i) {
    }

    public static bxmv[] values() {
        return (bxmv[]) d.clone();
    }
}
