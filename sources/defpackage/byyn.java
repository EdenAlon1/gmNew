package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes7.dex */
public final class byyn {
    public static final byyn a;
    public static final byyn b;
    private static final /* synthetic */ byyn[] c;

    static {
        byyn byynVar = new byyn("BUGLE_DB", 0);
        a = byynVar;
        byyn byynVar2 = new byyn("BACKUP_DB", 1);
        b = byynVar2;
        byyn[] byynVarArr = {byynVar, byynVar2};
        c = byynVarArr;
        ffhw.a(byynVarArr);
    }

    private byyn(String str, int i) {
    }

    public static byyn[] values() {
        return (byyn[]) c.clone();
    }
}
