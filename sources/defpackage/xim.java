package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xim {
    public static final xim a;
    public static final xim b;
    public static final xim c;
    private static final /* synthetic */ xim[] d;

    static {
        xim ximVar = new xim("CONVERSATION", 0);
        a = ximVar;
        xim ximVar2 = new xim("MULTI_SHARE", 1);
        b = ximVar2;
        xim ximVar3 = new xim("EMERGENCY", 2);
        c = ximVar3;
        xim[] ximVarArr = {ximVar, ximVar2, ximVar3};
        d = ximVarArr;
        ffhw.a(ximVarArr);
    }

    private xim(String str, int i) {
    }

    public static xim[] values() {
        return (xim[]) d.clone();
    }
}
