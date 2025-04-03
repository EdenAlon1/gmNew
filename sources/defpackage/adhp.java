package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adhp implements fbba {
    public static adhn a(fazb fazbVar, fazb fazbVar2, atxx atxxVar) {
        adhn adhnVar;
        if (((ersq) ((atxr) atxxVar).a.b()).a("bugle.use_account_menu_event_publisher_in_new_code")) {
            Log.i("FeatureExperiment", "AccountMenuEventPublisher based on UseAccountMenuEventPublisherInNewCode is enabled.");
            adhnVar = (adhn) fazbVar.b();
        } else {
            Log.i("FeatureExperiment", "AccountMenuEventPublisher based on UseAccountMenuEventPublisherInNewCode is disabled.");
            adhnVar = (adhn) fazbVar2.b();
        }
        adhnVar.getClass();
        return adhnVar;
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
