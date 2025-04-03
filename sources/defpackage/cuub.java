package defpackage;

import android.content.Context;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.ComplianceOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.spatula.settings.SpatulaAvailability;
import com.google.android.gms.spatula.settings.internal.ISpatulaAvailabilityCallbacks;
import com.google.android.gms.spatula.settings.internal.ISpatulaSettingsService;
import defpackage.dfup;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cuub extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cuuc b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cuub(ffgu ffguVar, cuuc cuucVar) {
        super(2, ffguVar);
        this.b = cuucVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cuub) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        boolean z = true;
        try {
            if (this.a != 0) {
                ffci.b(obj);
            } else {
                ffci.b(obj);
                Object obj2 = this.b.b;
                ((ensz) dhpv.a.h()).q("GetSpatulaAvailability");
                dfun dfunVar = new dfun();
                dfunVar.b = new Feature[]{dhpx.a};
                final dhpt dhptVar = (dhpt) obj2;
                dfunVar.a = new dfuf() { // from class: dhps
                    @Override // defpackage.dfuf
                    public final void a(Object obj3, Object obj4) {
                        dhpw dhpwVar = (dhpw) obj3;
                        final dhpt dhptVar2 = dhpt.this;
                        final dhri dhriVar = (dhri) obj4;
                        ISpatulaAvailabilityCallbacks.Stub stub = new ISpatulaAvailabilityCallbacks.Stub() { // from class: com.google.android.gms.spatula.settings.internal.InternalSpatulaSettingsClient$createSpatulaAvailabilityCallback$1
                            @Override // com.google.android.gms.spatula.settings.internal.ISpatulaAvailabilityCallbacks
                            public void onGetSpatulaAvailability(Status status, SpatulaAvailability spatulaAvailability) {
                                if (spatulaAvailability != null) {
                                    dfup.b(status, spatulaAvailability, dhriVar);
                                    return;
                                }
                                SpatulaAvailability spatulaAvailability2 = new SpatulaAvailability();
                                spatulaAvailability2.a = 0;
                                dfup.b(status, spatulaAvailability2, dhriVar);
                            }
                        };
                        ISpatulaSettingsService iSpatulaSettingsService = (ISpatulaSettingsService) dhpwVar.w();
                        Context context = dhpwVar.c;
                        iSpatulaSettingsService.getSpatulaAvailability(stub, new ApiMetadata(new ComplianceOptions(-1, -1, 0, true)));
                    }
                };
                dfunVar.c = 34503;
                dhre i = ((dfra) obj2).i(dfunVar.a());
                this.a = 1;
                obj = fgju.a(i, this);
                if (obj == ffhhVar) {
                    return ffhhVar;
                }
            }
            if (((SpatulaAvailability) obj).a != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        } catch (Exception e) {
            ensk h = cuuc.a.h();
            h.Y(ente.a, "BugleSpam");
            ((enrr) ((enrr) h).g(e).h("com/google/android/apps/messaging/shared/util/spam/spatula/SpatulaSettingsProxyImpl$isAvailable$$inlined$withLegacyPropagatingContext$1", "invokeSuspend", 107, "SpatulaSettingsProxyImpl.kt")).q("fail to get Spatula availability.");
            return false;
        }
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cuub cuubVar = new cuub(ffguVar, this.b);
        cuubVar.c = obj;
        return cuubVar;
    }
}
