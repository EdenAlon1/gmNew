package defpackage;

import android.content.Context;
import android.location.LocationManager;
import com.google.android.apps.messaging.R;
import java.util.HashMap;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aduc implements adtw {
    private final Context a;
    private final adtz b;
    private final errl c;

    public aduc(Context context, adua aduaVar, errl errlVar) {
        this.a = context;
        int i = dgyx.a;
        dgzr dgzrVar = new dgzr(context);
        LocationManager locationManager = (LocationManager) aduaVar.a.b();
        locationManager.getClass();
        ctud ctudVar = (ctud) aduaVar.b.b();
        ctudVar.getClass();
        errl errlVar2 = (errl) aduaVar.c.b();
        errlVar2.getClass();
        this.b = new adtz(locationManager, ctudVar, errlVar2, dgzrVar);
        this.c = errlVar;
    }

    @Override // defpackage.adtw
    public final elfl a() {
        return this.b.a().h(new emwl() { // from class: adub
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                HashMap hashMap = new HashMap();
                for (cfzl cfzlVar : (List) obj) {
                    hashMap.put(cfzlVar.a(), cfzlVar.b());
                }
                return hashMap;
            }
        }, this.c);
    }

    @Override // defpackage.cfzm
    public final /* synthetic */ elfl b() {
        return cfzj.b();
    }

    @Override // defpackage.cfzm
    public final /* synthetic */ elfl c() {
        return cfzj.c();
    }

    @Override // defpackage.cfzm
    public final elfl d() {
        return this.b.a();
    }

    @Override // defpackage.adtw
    public final eoih e() {
        return eoih.BUGLE_ADVANCED_FEEDBACK_DATA_TYPE_LOCATION;
    }

    @Override // defpackage.adtw
    public final String f() {
        return this.a.getString(R.string.location_feedback_data_description);
    }

    @Override // defpackage.adtw
    public final String g() {
        return this.a.getString(R.string.location_feedback_data_detail_title);
    }

    @Override // defpackage.adtw
    public final String h() {
        return this.a.getString(R.string.location_feedback_data_name);
    }

    @Override // defpackage.adtw
    public final String i() {
        return this.a.getString(R.string.location_feedback_data_rationale);
    }

    @Override // defpackage.adtw
    public final String j() {
        return this.a.getString(R.string.location_feedback_data_rationale_title);
    }
}
