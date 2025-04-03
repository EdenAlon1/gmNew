package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzlk {
    public static final bzlk a;
    public static final bzlk b;
    public static final bzlk c;
    public static final bzlk d;
    private static final /* synthetic */ bzlk[] f;
    public final int e;

    static {
        bzlk bzlkVar = new bzlk("NOT_THROTTLED", 0, 0);
        a = bzlkVar;
        bzlk bzlkVar2 = new bzlk("MINUTE_THROTTLER", 1, 1);
        b = bzlkVar2;
        bzlk bzlkVar3 = new bzlk("FIVE_MINUTE_THROTTLER", 2, 2);
        c = bzlkVar3;
        bzlk bzlkVar4 = new bzlk("TWENTY_MINUTE_THROTTLER", 3, 3);
        d = bzlkVar4;
        bzlk[] bzlkVarArr = {bzlkVar, bzlkVar2, bzlkVar3, bzlkVar4};
        f = bzlkVarArr;
        ffhw.a(bzlkVarArr);
    }

    private bzlk(String str, int i, int i2) {
        this.e = i2;
    }

    public static bzlk[] values() {
        return (bzlk[]) f.clone();
    }
}
