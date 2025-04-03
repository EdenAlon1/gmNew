package defpackage;

import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* compiled from: PG */
/* loaded from: classes2.dex */
final /* synthetic */ class sud extends ffju implements ffjm {
    public sud(Object obj) {
        super(2, obj, sui.class, "loadContent", "loadContent(Lcom/google/android/apps/messaging/birthday/banner/dataservice/SaveBirthdayBannerData;)Lcom/google/android/apps/messaging/banner/api/FullBannerContent;", 4);
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        final suj sujVar = (suj) obj;
        String str = sujVar.b;
        boolean z = sujVar.a;
        final sui suiVar = (sui) this.b;
        if (!z || str == null) {
            return null;
        }
        String str2 = sujVar.c;
        ssi ssiVar = new ssi(dmzz.N);
        String string = suiVar.a.getResources().getString(R.string.save_banner_positive_button);
        string.getClass();
        return new ssg("save_birthday", str, str2, ssiVar, new ssc(string, new ffix() { // from class: sua
            @Override // defpackage.ffix
            public final Object invoke() {
                ResolvedRecipient resolvedRecipient = sujVar.d;
                sui suiVar2 = sui.this;
                axol.k(suiVar2.c, null, new suh(resolvedRecipient, suiVar2, null), 3);
                return ffcu.a;
            }
        }), null, new ffix() { // from class: sub
            @Override // defpackage.ffix
            public final Object invoke() {
                sui suiVar2 = sui.this;
                axol.k(suiVar2.c, suiVar2.b, new suf(suiVar2, null), 2);
                return ffcu.a;
            }
        }, new ffix() { // from class: suc
            @Override // defpackage.ffix
            public final Object invoke() {
                sui suiVar2 = sui.this;
                axol.k(suiVar2.c, suiVar2.b, new sue(suiVar2, null), 2);
                return ffcu.a;
            }
        }, 480);
    }
}
