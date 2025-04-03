package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final /* synthetic */ class abnw extends ffju implements ffjm {
    public abnw(Object obj) {
        super(2, obj, abnz.class, "loadContent", "loadContent(Lcom/google/android/apps/messaging/shared/api/messaging/message/classification/Classification;)Lcom/google/android/apps/messaging/banner/api/FullBannerContent;", 4);
    }

    @Override // defpackage.ffjm
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        final apep apepVar = (apep) obj;
        final abnz abnzVar = (abnz) this.b;
        if (apepVar == null) {
            return null;
        }
        String string = abnzVar.a.getString(R.string.nudge_dismiss_button_text);
        string.getClass();
        return new ssg("nudge", apepVar.a, null, null, new ssc(string, new ffix() { // from class: abnu
            @Override // defpackage.ffix
            public final Object invoke() {
                abnz abnzVar2 = abnz.this;
                axol.k(abnzVar2.b, null, new abnx(abnzVar2, apepVar, null), 3);
                return ffcu.a;
            }
        }), null, new ffix() { // from class: abnv
            @Override // defpackage.ffix
            public final Object invoke() {
                abnz abnzVar2 = abnz.this;
                axol.k(abnzVar2.b, null, new abny(abnzVar2, apepVar, null), 3);
                return ffcu.a;
            }
        }, null, 1448);
    }
}
