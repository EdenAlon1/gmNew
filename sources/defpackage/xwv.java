package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xwv {
    public static final xwv a;
    public static final xwv b;
    public static final xwv c;
    public static final xwv d;
    public static final xwv e;
    public static final xwv f;
    private static final /* synthetic */ xwv[] i;
    public final xye g;
    public final xyf h;

    static {
        xwv xwvVar = new xwv("REJECTED_ATTACHMENTS_NOT_SUPPORTED", 0, xye.b, xyf.a);
        a = xwvVar;
        xwv xwvVar2 = new xwv("REJECTED_EXCEED_ATTACHMENT_COUNT_LIMIT", 1, xye.c, xyf.b);
        b = xwvVar2;
        xwv xwvVar3 = new xwv("REJECTED_VIDEO_ATTACHMENT_TOO_LONG", 2, xye.d, xyf.c);
        c = xwvVar3;
        xwv xwvVar4 = new xwv("REJECTED_SINGLE_ATTACHMENT_TOO_BIG", 3, xye.e, xyf.d);
        d = xwvVar4;
        xwv xwvVar5 = new xwv("REJECTED_MULTIPLE_ATTACHMENTS_TOO_BIG", 4, xye.f, xyf.e);
        e = xwvVar5;
        xwv xwvVar6 = new xwv("ACCEPTED", 5, xye.g, xyf.g);
        f = xwvVar6;
        xwv[] xwvVarArr = {xwvVar, xwvVar2, xwvVar3, xwvVar4, xwvVar5, xwvVar6};
        i = xwvVarArr;
        ffhw.a(xwvVarArr);
    }

    private xwv(String str, int i2, xye xyeVar, xyf xyfVar) {
        this.g = xyeVar;
        this.h = xyfVar;
    }

    public static xwv[] values() {
        return (xwv[]) i.clone();
    }
}
