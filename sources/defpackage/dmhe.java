package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmhe {
    public static final dmhe a;
    public static final dmhe b;
    public static final /* synthetic */ ffhx d;
    private static final /* synthetic */ dmhe[] e;
    public final float c;

    static {
        dmhe dmheVar = new dmhe("Start", 0, 0.0f);
        a = dmheVar;
        dmhe dmheVar2 = new dmhe("End", 1, 1.0f);
        b = dmheVar2;
        dmhe[] dmheVarArr = {dmheVar, dmheVar2};
        e = dmheVarArr;
        d = ffhw.a(dmheVarArr);
    }

    private dmhe(String str, int i, float f) {
        this.c = f;
    }

    public static dmhe[] values() {
        return (dmhe[]) e.clone();
    }
}
