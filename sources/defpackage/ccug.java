package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccug {
    public static final ccug a;
    public static final ccug b;
    private static final /* synthetic */ ccug[] d;
    public final int c;

    static {
        ccug ccugVar = new ccug("MARK_SUCCESS", 0, 2);
        a = ccugVar;
        ccug ccugVar2 = new ccug("MARK_FAILED", 1, 3);
        b = ccugVar2;
        ccug[] ccugVarArr = {ccugVar, ccugVar2};
        d = ccugVarArr;
        ffhw.a(ccugVarArr);
    }

    private ccug(String str, int i, int i2) {
        this.c = i2;
    }

    public static ccug[] values() {
        return (ccug[]) d.clone();
    }
}
