package defpackage;

import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* compiled from: PG */
/* loaded from: classes3.dex */
final /* synthetic */ class cyij extends ffju implements ffjm {
    public cyij(Object obj) {
        super(2, obj, cyil.class, "loadContent", "loadContent(Lcom/google/android/apps/messaging/ui/conversation/banners2o/spam/dataservice/SpamBanner2LoadedData;)Lcom/google/android/apps/messaging/banner/api/FullBannerContent;", 4);
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        final cyiu cyiuVar = (cyiu) obj;
        boolean z = cyiuVar.c;
        final cyil cyilVar = (cyil) this.b;
        if (!z) {
            return null;
        }
        final ResolvedRecipient resolvedRecipient = cyiuVar.a;
        resolvedRecipient.getClass();
        String string = cyilVar.a.getString(R.string.spam_banner_title_v2);
        string.getClass();
        String string2 = cyilVar.a.getString(R.string.spam_banner_body_v2);
        string2.getClass();
        ssi ssiVar = new ssi(dmzz.bq);
        String string3 = cyilVar.a.getString(R.string.spam_banner_spam_button_v2);
        string3.getClass();
        String string4 = cyilVar.a.getString(R.string.spam_banner_not_spam_button_v2);
        string4.getClass();
        return new ssg("spam_banner", string, string2, ssiVar, new ssc(string3, new ffix() { // from class: cyig
            @Override // defpackage.ffix
            public final Object invoke() {
                int i = true != cyiuVar.b ? 2 : 3;
                cyil cyilVar2 = cyil.this;
                cyilVar2.c.a(new tad(resolvedRecipient, cyilVar2.b, i, 11));
                return ffcu.a;
            }
        }), new ssc(string4, new ffix() { // from class: cyih
            @Override // defpackage.ffix
            public final Object invoke() {
                cyil.this.c(resolvedRecipient, 3);
                return ffcu.a;
            }
        }), null, new ffix() { // from class: cyii
            @Override // defpackage.ffix
            public final Object invoke() {
                cyil.this.c(resolvedRecipient, 4);
                return ffcu.a;
            }
        }, 576);
    }
}
