package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class docr {
    public static final docr a;
    public static final docr b;
    public static final docr c;
    public static final docr d;
    private static final /* synthetic */ docr[] f;
    public final dmzz e;

    static {
        docr docrVar = new docr("Image", 0, dmzz.bI);
        a = docrVar;
        docr docrVar2 = new docr("Video", 1, dmzz.cW);
        b = docrVar2;
        docr docrVar3 = new docr("PDF", 2, dmzz.aN);
        c = docrVar3;
        docr docrVar4 = new docr("GenericFile", 3, dmzz.aM);
        d = docrVar4;
        docr[] docrVarArr = {docrVar, docrVar2, docrVar3, docrVar4};
        f = docrVarArr;
        ffhw.a(docrVarArr);
    }

    private docr(String str, int i, dmzz dmzzVar) {
        this.e = dmzzVar;
    }

    public static docr[] values() {
        return (docr[]) f.clone();
    }
}
