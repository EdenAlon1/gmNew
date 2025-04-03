package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class ofz {
    public static final ofz a;
    public static final ofz b;
    public static final ofz c;
    private static final /* synthetic */ ofz[] d;

    static {
        ofz ofzVar = new ofz("REFRESH", 0);
        a = ofzVar;
        ofz ofzVar2 = new ofz("PREPEND", 1);
        b = ofzVar2;
        ofz ofzVar3 = new ofz("APPEND", 2);
        c = ofzVar3;
        ofz[] ofzVarArr = {ofzVar, ofzVar2, ofzVar3};
        d = ofzVarArr;
        ffhw.a(ofzVarArr);
    }

    private ofz(String str, int i) {
    }

    public static ofz[] values() {
        return (ofz[]) d.clone();
    }
}
