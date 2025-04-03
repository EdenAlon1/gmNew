package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xyf {
    public static final xyf a;
    public static final xyf b;
    public static final xyf c;
    public static final xyf d;
    public static final xyf e;
    public static final xyf f;
    public static final xyf g;
    private static final /* synthetic */ xyf[] h;

    static {
        xyf xyfVar = new xyf("REJECTED_ATTACHMENTS_NOT_SUPPORTED", 0);
        a = xyfVar;
        xyf xyfVar2 = new xyf("REJECTED_EXCEED_MAX_ATTACHMENT_COUNT", 1);
        b = xyfVar2;
        xyf xyfVar3 = new xyf("REJECTED_VIDEO_ATTACHMENT_DURATION_TOO_LONG", 2);
        c = xyfVar3;
        xyf xyfVar4 = new xyf("REJECTED_EXCEED_MAX_MESSAGE_SIZE_SINGLE_ATTACHMENT", 3);
        d = xyfVar4;
        xyf xyfVar5 = new xyf("REJECTED_EXCEED_MAX_MESSAGE_SIZE_MULTIPLE_ATTACHMENTS", 4);
        e = xyfVar5;
        xyf xyfVar6 = new xyf("REJECTED_EXCEED_MAX_VIDEO_COUNT", 5);
        f = xyfVar6;
        xyf xyfVar7 = new xyf("ACCEPTED", 6);
        g = xyfVar7;
        xyf[] xyfVarArr = {xyfVar, xyfVar2, xyfVar3, xyfVar4, xyfVar5, xyfVar6, xyfVar7};
        h = xyfVarArr;
        ffhw.a(xyfVarArr);
    }

    private xyf(String str, int i) {
    }

    public static xyf[] values() {
        return (xyf[]) h.clone();
    }
}
