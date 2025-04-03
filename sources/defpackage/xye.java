package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xye {
    public static final xye a;
    public static final xye b;
    public static final xye c;
    public static final xye d;
    public static final xye e;
    public static final xye f;
    public static final xye g;
    private static final /* synthetic */ xye[] i;
    public final boolean h;

    static {
        xye xyeVar = new xye("DUPLICATE", 0, true);
        a = xyeVar;
        xye xyeVar2 = new xye("REJECTED_ATTACHMENTS_NOT_SUPPORTED", 1, false);
        b = xyeVar2;
        xye xyeVar3 = new xye("REJECTED_EXCEED_MAX_ATTACHMENT_COUNT", 2, false);
        c = xyeVar3;
        xye xyeVar4 = new xye("REJECTED_VIDEO_ATTACHMENT_DURATION_TOO_LONG", 3, false);
        d = xyeVar4;
        xye xyeVar5 = new xye("REJECTED_EXCEED_MAX_MESSAGE_SIZE_SINGLE_ATTACHMENT", 4, false);
        e = xyeVar5;
        xye xyeVar6 = new xye("REJECTED_EXCEED_MAX_MESSAGE_SIZE_MULTIPLE_ATTACHMENTS", 5, false);
        f = xyeVar6;
        xye xyeVar7 = new xye("ACCEPTED", 6, true);
        g = xyeVar7;
        xye[] xyeVarArr = {xyeVar, xyeVar2, xyeVar3, xyeVar4, xyeVar5, xyeVar6, xyeVar7};
        i = xyeVarArr;
        ffhw.a(xyeVarArr);
    }

    private xye(String str, int i2, boolean z) {
        this.h = z;
    }

    public static xye[] values() {
        return (xye[]) i.clone();
    }
}
