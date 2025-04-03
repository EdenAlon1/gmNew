package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xrc {
    public static final xrc a;
    public static final xrc b;
    private static final /* synthetic */ xrc[] d;
    public final int c;

    static {
        xrc xrcVar = new xrc("OPTIMIZED", 0, 0);
        a = xrcVar;
        xrc xrcVar2 = new xrc("ORIGINAL", 1, 1);
        b = xrcVar2;
        xrc[] xrcVarArr = {xrcVar, xrcVar2};
        d = xrcVarArr;
        ffhw.a(xrcVarArr);
    }

    private xrc(String str, int i, int i2) {
        this.c = i2;
    }

    public static xrc[] values() {
        return (xrc[]) d.clone();
    }
}
