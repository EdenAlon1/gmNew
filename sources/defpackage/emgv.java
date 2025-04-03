package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emgv {
    public static final emgv a;
    public static final emgv b;
    public static final emgv c;
    public static final emgv d;
    public static final emgv e;
    public static final emgv f;
    private static final /* synthetic */ emgv[] g;

    static {
        emgv emgvVar = new emgv("SEGMENTATION_EMPTY", 0);
        a = emgvVar;
        emgv emgvVar2 = new emgv("SEGMENTATION_TIMEOUT", 1);
        b = emgvVar2;
        emgv emgvVar3 = new emgv("SEGMENTATION_OOM", 2);
        c = emgvVar3;
        emgv emgvVar4 = new emgv("SEGMENTATION_ERROR", 3);
        d = emgvVar4;
        emgv emgvVar5 = new emgv("SEGMENTER_SETUP_ERROR", 4);
        e = emgvVar5;
        emgv emgvVar6 = new emgv("UNSATISFIED_LINK_ERROR", 5);
        f = emgvVar6;
        emgv[] emgvVarArr = {emgvVar, emgvVar2, emgvVar3, emgvVar4, emgvVar5, emgvVar6};
        g = emgvVarArr;
        ffhw.a(emgvVarArr);
    }

    private emgv(String str, int i) {
    }

    public static emgv[] values() {
        return (emgv[]) g.clone();
    }
}
