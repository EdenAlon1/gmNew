package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpio {
    public static final cpio a;
    public static final cpio b;
    public static final cpio c;
    private static final /* synthetic */ cpio[] d;

    static {
        cpio cpioVar = new cpio("SUCCESS", 0);
        a = cpioVar;
        cpio cpioVar2 = new cpio("TEMPORARY_FAILURE", 1);
        b = cpioVar2;
        cpio cpioVar3 = new cpio("PERMANENT_FAILURE", 2);
        c = cpioVar3;
        cpio[] cpioVarArr = {cpioVar, cpioVar2, cpioVar3};
        d = cpioVarArr;
        ffhw.a(cpioVarArr);
    }

    private cpio(String str, int i) {
    }

    public static cpio[] values() {
        return (cpio[]) d.clone();
    }
}
