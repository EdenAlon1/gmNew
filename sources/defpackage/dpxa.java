package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpxa {
    public static final dpxa a;
    public static final dpxa b;
    public static final dpxa c;
    public static final dpxa d;
    private static final /* synthetic */ dpxa[] f;
    public final int e;
    private final boolean g;

    static {
        dpxa dpxaVar = new dpxa("PORTRAIT", 0, 0, true);
        a = dpxaVar;
        dpxa dpxaVar2 = new dpxa("LANDSCAPE_RIGHT", 1, 90, false);
        b = dpxaVar2;
        dpxa dpxaVar3 = new dpxa("PORTRAIT_UPSIDE_DOWN", 2, 180, true);
        c = dpxaVar3;
        dpxa dpxaVar4 = new dpxa("LANDSCAPE_LEFT", 3, 270, false);
        d = dpxaVar4;
        dpxa[] dpxaVarArr = {dpxaVar, dpxaVar2, dpxaVar3, dpxaVar4};
        f = dpxaVarArr;
        ffhw.a(dpxaVarArr);
    }

    private dpxa(String str, int i, int i2, boolean z) {
        this.e = i2;
        this.g = z;
    }

    public static dpxa[] values() {
        return (dpxa[]) f.clone();
    }

    public final boolean a() {
        return !this.g;
    }
}
