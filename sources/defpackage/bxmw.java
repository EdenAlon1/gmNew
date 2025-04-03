package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxmw {
    public static final bxmw a;
    public static final bxmw b;
    private static final /* synthetic */ bxmw[] c;

    static {
        bxmw bxmwVar = new bxmw("DATABASE", 0);
        a = bxmwVar;
        bxmw bxmwVar2 = new bxmw("ATTACHMENT", 1);
        b = bxmwVar2;
        bxmw[] bxmwVarArr = {bxmwVar, bxmwVar2};
        c = bxmwVarArr;
        ffhw.a(bxmwVarArr);
    }

    private bxmw(String str, int i) {
    }

    public static bxmw[] values() {
        return (bxmw[]) c.clone();
    }
}
