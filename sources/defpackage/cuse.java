package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cuse {
    public static final entd a = entd.c("BugleSpam");
    public final ffbr b;
    public final ffbr c;
    public final errl d;
    public final errl e;
    public final ffbr f;
    public final ffbr g;
    public final ffbr h;
    public final ffbr i;
    public final ffbr j;
    public final ffbr k;
    public final ffbr l;

    public cuse(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, errl errlVar, errl errlVar2, ffbr ffbrVar8, ffbr ffbrVar9) {
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.e = errlVar2;
        this.d = errlVar;
        this.g = ffbrVar3;
        this.f = ffbrVar5;
        this.h = ffbrVar4;
        this.i = ffbrVar6;
        this.j = ffbrVar7;
        this.k = ffbrVar8;
        this.l = ffbrVar9;
    }

    public final void a(bdhg bdhgVar, ckbx ckbxVar) {
        int c = ckbxVar.c();
        if (c == -1) {
            ((ensz) a.o().h("com/google/android/apps/messaging/shared/util/spam/rbm/RbmSpamReporter", "handleSendRbmSpamReport", 106, "RbmSpamReporter.java")).q("RbmSpamReporter: Transport accepted the RBM Spam report for sending");
        } else if (c != 0) {
            ((ensz) ((ensz) a.j()).h("com/google/android/apps/messaging/shared/util/spam/rbm/RbmSpamReporter", "handleSendRbmSpamReport", 117, "RbmSpamReporter.java")).q("RbmSpamReporter: Failed to send RBM Spam Report.");
            ((curu) this.h.b()).c(bdhgVar, ckbxVar.g());
        } else {
            ((ensz) a.o().h("com/google/android/apps/messaging/shared/util/spam/rbm/RbmSpamReporter", "handleSendRbmSpamReport", 112, "RbmSpamReporter.java")).q("RbmSpamReporter: The RBM Spam report immediately sent successfully");
            ((curu) this.h.b()).d(bdhgVar);
        }
    }
}
