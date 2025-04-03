package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axlb {
    public static final axlb a;
    public static final axlb b;
    public static final axlb c;
    public static final axlb d;
    private static final /* synthetic */ axlb[] f;
    public final int e;

    static {
        axlb axlbVar = new axlb("UNKNOWN", 0, 0);
        a = axlbVar;
        axlb axlbVar2 = new axlb("MISSING_LSKF_MEMBERS", 1, 1);
        b = axlbVar2;
        axlb axlbVar3 = new axlb("EXISTS_USABLE_LSKF", 2, 2);
        c = axlbVar3;
        axlb axlbVar4 = new axlb("USER_OUT_OF_ATTEMPTS", 3, 3);
        d = axlbVar4;
        axlb[] axlbVarArr = {axlbVar, axlbVar2, axlbVar3, axlbVar4};
        f = axlbVarArr;
        ffhw.a(axlbVarArr);
    }

    private axlb(String str, int i, int i2) {
        this.e = i2;
    }

    public static axlb[] values() {
        return (axlb[]) f.clone();
    }
}
