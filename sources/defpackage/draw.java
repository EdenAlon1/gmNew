package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class draw {
    public static final draw a;
    public static final draw b;
    public static final draw c;
    public static final draw d;
    public static final draw e;
    public static final draw f;
    public static final draw g;
    private static final /* synthetic */ draw[] h;

    static {
        draw drawVar = new draw("LOADING_MODEL", 0);
        a = drawVar;
        draw drawVar2 = new draw("LOADING_IMAGE", 1);
        b = drawVar2;
        draw drawVar3 = new draw("SAVING", 2);
        c = drawVar3;
        draw drawVar4 = new draw("SEGMENTATION_TIMEOUT", 3);
        d = drawVar4;
        draw drawVar5 = new draw("SEGMENTATION_OOM", 4);
        e = drawVar5;
        draw drawVar6 = new draw("SEGMENTATION_UNSATISFIED_LINK", 5);
        f = drawVar6;
        draw drawVar7 = new draw("SEGMENTATION_OTHER", 6);
        g = drawVar7;
        draw[] drawVarArr = {drawVar, drawVar2, drawVar3, drawVar4, drawVar5, drawVar6, drawVar7};
        h = drawVarArr;
        ffhw.a(drawVarArr);
    }

    private draw(String str, int i) {
    }

    public static draw[] values() {
        return (draw[]) h.clone();
    }
}
