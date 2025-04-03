package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
final /* synthetic */ class cyfa extends ffju implements ffjm {
    public cyfa(Object obj) {
        super(2, obj, cyfb.class, "loadContent", "loadContent(Lcom/google/android/apps/messaging/ui/conversation/banners2o/normalization/roamingshortcode/dataservice/RoamingShortCodeLoadedData;)Lcom/google/android/apps/messaging/banner/api/FullBannerContent;", 4);
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        boolean z = ((cyfl) obj).a;
        cyfb cyfbVar = (cyfb) this.b;
        if (!z) {
            return null;
        }
        Context context = cyfbVar.a;
        ffbr ffbrVar = cyfbVar.b;
        ffbr ffbrVar2 = cyfbVar.c;
        cfup cfupVar = cyfd.a;
        return new ssg("roaming_short_code", null, ddyi.c(context, ffbrVar, ffbrVar2, R.string.conversation_roaming_short_code_paragraph, cyfd.a, cyfd.b).toString(), new ssi(dmzz.bK), null, null, null, null, 2034);
    }
}
