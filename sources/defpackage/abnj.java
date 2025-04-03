package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final /* synthetic */ class abnj extends ffju implements ffjm {
    public abnj(Object obj) {
        super(2, obj, abnl.class, "loadContent", "loadContent(Z)Lcom/google/android/apps/messaging/banner/api/FullBannerContent;", 4);
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        final abnl abnlVar = (abnl) this.b;
        if (!booleanValue) {
            return null;
        }
        String string = abnlVar.a.getString(R.string.send_feedback_banner_body);
        ssi ssiVar = new ssi(dmzz.bK);
        String string2 = abnlVar.a.getString(R.string.send_feedback_banner_button);
        string2.getClass();
        return new ssg("early_feedback", null, string, ssiVar, new ssc(string2, new ffix() { // from class: abnh
            @Override // defpackage.ffix
            public final Object invoke() {
                abnl abnlVar2 = abnl.this;
                abnlVar2.c();
                abnlVar2.c.h(aink.a);
                return ffcu.a;
            }
        }), null, new ffix() { // from class: abni
            @Override // defpackage.ffix
            public final Object invoke() {
                abnl.this.c();
                return ffcu.a;
            }
        }, null, 1504);
    }
}
