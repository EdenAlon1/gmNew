package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xhw {
    public static final xhw a;
    public static final xhw b;
    public static final xhw c;
    public static final xhw d;
    private static final /* synthetic */ xhw[] e;

    static {
        xhw xhwVar = new xhw("EMOJI", 0);
        a = xhwVar;
        xhw xhwVar2 = new xhw("GIFS", 1);
        b = xhwVar2;
        xhw xhwVar3 = new xhw("STICKERS", 2);
        c = xhwVar3;
        xhw xhwVar4 = new xhw("EMOTIFY", 3);
        d = xhwVar4;
        xhw[] xhwVarArr = {xhwVar, xhwVar2, xhwVar3, xhwVar4};
        e = xhwVarArr;
        ffhw.a(xhwVarArr);
    }

    private xhw(String str, int i) {
    }

    public static xhw[] values() {
        return (xhw[]) e.clone();
    }
}
