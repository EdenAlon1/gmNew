package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adjz {
    public static final adjz a;
    public static final adjz b;
    public static final adjz c;
    public static final adjz d;
    public static final adjz e;
    private static final /* synthetic */ adjz[] f;

    static {
        adjz adjzVar = new adjz("NOT_SIGNED_IN", 0);
        a = adjzVar;
        adjz adjzVar2 = new adjz("SHOULD_SHOW_TOOLTIP", 1);
        b = adjzVar2;
        adjz adjzVar3 = new adjz("SHOULD_SHOW_TOOLTIP_WHEN_UI_READY", 2);
        c = adjzVar3;
        adjz adjzVar4 = new adjz("TOOLTIP_SEEN", 3);
        d = adjzVar4;
        adjz adjzVar5 = new adjz("WELCOME_FLOW_NOT_SHOWN", 4);
        e = adjzVar5;
        adjz[] adjzVarArr = {adjzVar, adjzVar2, adjzVar3, adjzVar4, adjzVar5};
        f = adjzVarArr;
        ffhw.a(adjzVarArr);
    }

    private adjz(String str, int i) {
    }

    public static adjz[] values() {
        return (adjz[]) f.clone();
    }
}
