package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awfr {
    public static final awfr a;
    public static final awfr b;
    private static final /* synthetic */ awfr[] c;

    static {
        awfr awfrVar = new awfr("FULL_FILE", 0);
        a = awfrVar;
        awfr awfrVar2 = new awfr("THUMBNAIL", 1);
        b = awfrVar2;
        awfr[] awfrVarArr = {awfrVar, awfrVar2};
        c = awfrVarArr;
        ffhw.a(awfrVarArr);
    }

    private awfr(String str, int i) {
    }

    public static awfr[] values() {
        return (awfr[]) c.clone();
    }
}
