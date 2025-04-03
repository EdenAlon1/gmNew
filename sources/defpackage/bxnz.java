package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxnz {
    public static final bxnz a;
    public static final bxnz b;
    public static final bxnz c;
    private static final /* synthetic */ bxnz[] d;

    static {
        bxnz bxnzVar = new bxnz("TIMESTAMP_SECONDS_DUPLICATE_KEY", 0);
        a = bxnzVar;
        bxnz bxnzVar2 = new bxnz("TEXT_AND_TIMESTAMP_SECONDS_DUPLICATE_KEY", 1);
        b = bxnzVar2;
        bxnz bxnzVar3 = new bxnz("SENDER_AND_TIMESTAMP_SECONDS_DUPLICATE_KEY", 2);
        c = bxnzVar3;
        bxnz[] bxnzVarArr = {bxnzVar, bxnzVar2, bxnzVar3};
        d = bxnzVarArr;
        ffhw.a(bxnzVarArr);
    }

    private bxnz(String str, int i) {
    }

    public static bxnz[] values() {
        return (bxnz[]) d.clone();
    }
}
