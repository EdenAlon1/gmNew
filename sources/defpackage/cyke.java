package defpackage;

import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* compiled from: PG */
/* loaded from: classes3.dex */
final /* synthetic */ class cyke extends ffkh implements ffjm {
    public cyke(Object obj) {
        super(2, obj, cykn.class, "loadContent", "loadContent(Lcom/google/android/apps/messaging/ui/conversation/banners2o/unblockunspam/dataservice/UnblockUnspamBanner2LoadedData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        cykv cykvVar = (cykv) obj;
        int i = cykvVar.b;
        final cykn cyknVar = (cykn) this.g;
        if (i == 5) {
            return null;
        }
        final ResolvedRecipient resolvedRecipient = cykvVar.a;
        int i2 = i - 1;
        if (i2 != 0) {
            return (i2 == 1 || i2 == 2) ? cyknVar.c(true, resolvedRecipient) : cyknVar.c(false, resolvedRecipient);
        }
        String string = cyknVar.a.getString(R.string.unblock_banner_title);
        String string2 = cyknVar.a.getString(R.string.unblock_banner_body_v2);
        ssi ssiVar = new ssi(dmzz.E);
        String string3 = cyknVar.a.getString(R.string.unblock_banner_positive_button);
        string3.getClass();
        return new ssg("unblock_unspam_banner", string, string2, ssiVar, new ssc(string3, new ffix() { // from class: cykc
            @Override // defpackage.ffix
            public final Object invoke() {
                cykn cyknVar2 = cykn.this;
                axol.k(cyknVar2.c, cyknVar2.b, new cykg(cyknVar2, resolvedRecipient, null), 2);
                return ffcu.a;
            }
        }), null, null, null, 1568);
    }
}
