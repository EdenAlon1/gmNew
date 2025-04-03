package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dopt {
    public static final dopt a;
    public static final dopt b;
    public static final dopt c;

    @ffbs
    public static final dopt d;
    private static final /* synthetic */ dopt[] e;

    static {
        dopt doptVar = new dopt("GM3_EXPRESSIVE_ASYNC_STATIC", 0);
        a = doptVar;
        dopt doptVar2 = new dopt("GM3_EXPRESSIVE_ASYNC_VARIABLE", 1);
        b = doptVar2;
        dopt doptVar3 = new dopt("GM3_STANDARD_ASYNC", 2);
        c = doptVar3;
        dopt doptVar4 = new dopt("GM3_STANDARD_SYNC", 3);
        d = doptVar4;
        dopt[] doptVarArr = {doptVar, doptVar2, doptVar3, doptVar4};
        e = doptVarArr;
        ffhw.a(doptVarArr);
    }

    private dopt(String str, int i) {
    }

    public static dopt[] values() {
        return (dopt[]) e.clone();
    }
}
