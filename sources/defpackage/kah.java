package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class kah {
    public static final kah a;
    public static final kah b;
    private static final /* synthetic */ kah[] c;

    static {
        kah kahVar = new kah("Ltr", 0);
        a = kahVar;
        kah kahVar2 = new kah("Rtl", 1);
        b = kahVar2;
        kah[] kahVarArr = {kahVar, kahVar2};
        c = kahVarArr;
        ffhw.a(kahVarArr);
    }

    private kah(String str, int i) {
    }

    public static kah[] values() {
        return (kah[]) c.clone();
    }
}
