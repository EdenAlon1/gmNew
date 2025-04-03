package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpgl {
    public static final dpgl a;
    public static final dpgl b;
    public static final dpgl c;
    private static final /* synthetic */ dpgl[] d;

    static {
        dpgl dpglVar = new dpgl("MINI_CAMERA", 0);
        a = dpglVar;
        dpgl dpglVar2 = new dpgl("FULLSCREEN_CAMERA", 1);
        b = dpglVar2;
        dpgl dpglVar3 = new dpgl("POPUP_CAMERA", 2);
        c = dpglVar3;
        dpgl[] dpglVarArr = {dpglVar, dpglVar2, dpglVar3};
        d = dpglVarArr;
        ffhw.a(dpglVarArr);
    }

    private dpgl(String str, int i) {
    }

    public static dpgl[] values() {
        return (dpgl[]) d.clone();
    }
}
