package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cydv extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ ResolvedRecipient c;
    final /* synthetic */ cydx d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cydv(ResolvedRecipient resolvedRecipient, cydx cydxVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = resolvedRecipient;
        this.d = cydxVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cydv) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ResolvedRecipient resolvedRecipient;
        ffhh ffhhVar = ffhh.a;
        if (this.b == 0) {
            ffci.b(obj);
            ResolvedRecipient resolvedRecipient2 = this.c;
            if (resolvedRecipient2 != null) {
                elfl D = this.d.f.b.D(resolvedRecipient2.F(), aorb.MODIFIED_AND_INFORMED);
                this.a = resolvedRecipient2;
                this.b = 1;
                Object c = fgfz.c(D, this);
                if (c == ffhhVar) {
                    return ffhhVar;
                }
                resolvedRecipient = resolvedRecipient2;
                obj = c;
            }
            return ffcu.a;
        }
        Object obj2 = this.a;
        ffci.b(obj);
        resolvedRecipient = obj2;
        if (((Boolean) obj).booleanValue()) {
            ensk h = cydx.a.h();
            h.Y(ente.a, "Bugle");
            ((enrr) h.h("com/google/android/apps/messaging/ui/conversation/banners2o/normalization/areacode/AddAreaCodeBanner2$onBannerHidden$1", "invokeSuspend", 107, "AddAreaCodeBanner2.kt")).t("The area code banner was shown and the user was informed.", resolvedRecipient.F());
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cydv(this.c, this.d, ffguVar);
    }
}
