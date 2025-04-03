package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ayee {
    public static final ayee a;
    public static final ayee b;
    public static final /* synthetic */ ffhx c;
    private static final /* synthetic */ ayee[] d;

    static {
        ayee ayeeVar = new ayee("FULL", 0);
        a = ayeeVar;
        ayee ayeeVar2 = new ayee("INCREMENTAL", 1);
        b = ayeeVar2;
        ayee[] ayeeVarArr = {ayeeVar, ayeeVar2};
        d = ayeeVarArr;
        c = ffhw.a(ayeeVarArr);
    }

    private ayee(String str, int i) {
    }

    public static ayee[] values() {
        return (ayee[]) d.clone();
    }
}
