package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aimb {
    public static final aimb a;
    public static final aimb b;
    private static final /* synthetic */ aimb[] c;

    static {
        aimb aimbVar = new aimb("DIALOG_CLOSED", 0);
        a = aimbVar;
        aimb aimbVar2 = new aimb("DIALOG_NOT_SHOWN", 1);
        b = aimbVar2;
        aimb[] aimbVarArr = {aimbVar, aimbVar2};
        c = aimbVarArr;
        ffhw.a(aimbVarArr);
    }

    private aimb(String str, int i) {
    }

    public static aimb[] values() {
        return (aimb[]) c.clone();
    }
}
