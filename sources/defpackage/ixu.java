package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class ixu {
    public static final ixu a;
    public static final ixu b;
    public static final ixu c;
    private static final /* synthetic */ ixu[] d;

    static {
        ixu ixuVar = new ixu("ContinueTraversal", 0);
        a = ixuVar;
        ixu ixuVar2 = new ixu("SkipSubtreeAndContinueTraversal", 1);
        b = ixuVar2;
        ixu ixuVar3 = new ixu("CancelTraversal", 2);
        c = ixuVar3;
        ixu[] ixuVarArr = {ixuVar, ixuVar2, ixuVar3};
        d = ixuVarArr;
        ffhw.a(ixuVarArr);
    }

    private ixu(String str, int i) {
    }

    public static ixu[] values() {
        return (ixu[]) d.clone();
    }
}
