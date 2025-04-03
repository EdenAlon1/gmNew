package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
final class djyi {
    public static final djyi a;
    public static final djyi b;
    public static final djyi c;
    private static final /* synthetic */ djyi[] d;

    static {
        djyi djyiVar = new djyi("NOT_INITIALIZED", 0);
        a = djyiVar;
        djyi djyiVar2 = new djyi("INITIALIZING", 1);
        b = djyiVar2;
        djyi djyiVar3 = new djyi("INITIALIZED", 2);
        c = djyiVar3;
        djyi[] djyiVarArr = {djyiVar, djyiVar2, djyiVar3};
        d = djyiVarArr;
        ffhw.a(djyiVarArr);
    }

    private djyi(String str, int i) {
    }

    public static djyi[] values() {
        return (djyi[]) d.clone();
    }
}
