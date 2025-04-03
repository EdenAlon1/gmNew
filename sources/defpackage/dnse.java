package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnse {
    public static final dnse a;
    public static final dnse b;
    private static final /* synthetic */ dnse[] c;

    static {
        dnse dnseVar = new dnse("DOUBLE_TAP_ORIGIN_TOUCH_GESTURE", 0);
        a = dnseVar;
        dnse dnseVar2 = new dnse("DOUBLE_TAP_ORIGIN_ACCESSIBILITY_ACTION", 1);
        b = dnseVar2;
        dnse[] dnseVarArr = {dnseVar, dnseVar2};
        c = dnseVarArr;
        ffhw.a(dnseVarArr);
    }

    private dnse(String str, int i) {
    }

    public static dnse[] values() {
        return (dnse[]) c.clone();
    }
}
