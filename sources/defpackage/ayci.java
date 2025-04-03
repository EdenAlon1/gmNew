package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ayci {
    public static final ayci a;
    public static final ayci b;
    public static final ayci c;
    public static final ayci d;
    private static final /* synthetic */ ayci[] e;

    static {
        ayci ayciVar = new ayci("UNSPECIFIED", 0);
        a = ayciVar;
        ayci ayciVar2 = new ayci("OBSERVER", 1);
        b = ayciVar2;
        ayci ayciVar3 = new ayci("WORKER", 2);
        c = ayciVar3;
        ayci ayciVar4 = new ayci("FORCED", 3);
        d = ayciVar4;
        ayci[] ayciVarArr = {ayciVar, ayciVar2, ayciVar3, ayciVar4};
        e = ayciVarArr;
        ffhw.a(ayciVarArr);
    }

    private ayci(String str, int i) {
    }

    public static ayci[] values() {
        return (ayci[]) e.clone();
    }
}
