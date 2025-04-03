package defpackage;

import android.content.Context;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.ComplianceOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.spatula.settings.SpatulaSettingPreference;
import com.google.android.gms.spatula.settings.internal.ISpatulaSettingsCallbacks;
import com.google.android.gms.spatula.settings.internal.ISpatulaSettingsService;
import defpackage.dfup;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhpt extends dfra<dfqo> implements dhpq {
    public dhpt(Context context) {
        super(context, dhpv.b, dfqp.q, dfqz.a);
    }

    @Override // defpackage.dhpq
    public final dhre a(final String str) {
        ((ensz) dhpv.a.h()).t("GetSpatulaPreference: %s", str);
        dfun dfunVar = new dfun();
        dfunVar.b = new Feature[]{dhpx.a};
        dfunVar.a = new dfuf() { // from class: dhpr
            @Override // defpackage.dfuf
            public final void a(Object obj, Object obj2) {
                dhpw dhpwVar = (dhpw) obj;
                final dhpt dhptVar = dhpt.this;
                final dhri dhriVar = (dhri) obj2;
                ISpatulaSettingsCallbacks.Stub stub = new ISpatulaSettingsCallbacks.Stub() { // from class: com.google.android.gms.spatula.settings.internal.InternalSpatulaSettingsClient$createSpatulaSettingsCallback$1
                    @Override // com.google.android.gms.spatula.settings.internal.ISpatulaSettingsCallbacks
                    public void onGetSpatulaPreference(Status status, SpatulaSettingPreference spatulaSettingPreference) {
                        if (spatulaSettingPreference != null) {
                            dfup.b(status, spatulaSettingPreference, dhriVar);
                            return;
                        }
                        SpatulaSettingPreference spatulaSettingPreference2 = new SpatulaSettingPreference();
                        spatulaSettingPreference2.a = 0;
                        dfup.b(status, spatulaSettingPreference2, dhriVar);
                    }
                };
                ISpatulaSettingsService iSpatulaSettingsService = (ISpatulaSettingsService) dhpwVar.w();
                Context context = dhpwVar.c;
                iSpatulaSettingsService.getSpatulaPreference(stub, str, new ApiMetadata(new ComplianceOptions(-1, -1, 0, true)));
            }
        };
        dfunVar.c = 34501;
        return i(dfunVar.a());
    }
}
