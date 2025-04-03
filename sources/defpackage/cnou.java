package defpackage;

import androidx.car.app.hardware.info.EnergyProfile;
import androidx.work.WorkerParameters;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequest;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cnou extends ffhv implements ffjm {
    int a;
    final /* synthetic */ WorkerParameters b;
    final /* synthetic */ cnov c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cnou(WorkerParameters workerParameters, cnov cnovVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = workerParameters;
        this.c = cnovVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cnou) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        String d;
        char c;
        int i;
        Object pppVar;
        ffhh ffhhVar = ffhh.a;
        int i2 = this.a;
        ffci.b(obj);
        if (i2 != 0) {
            return obj;
        }
        WorkerParameters workerParameters = this.b;
        pot potVar = workerParameters != null ? workerParameters.b : null;
        if (potVar == null || (d = potVar.d(GroupManagementRequest.ACTION_TAG)) == null) {
            return new ppn();
        }
        int hashCode = d.hashCode();
        if (hashCode == -1612493788) {
            if (d.equals("REGISTER_SATELLITE_PENDING_INTENT")) {
                c = 2;
            }
            c = 65535;
        } else if (hashCode != 50967229) {
            if (hashCode == 1301026273 && d.equals("NEW_SATELLITE_CONNECTION")) {
                c = 0;
            }
            c = 65535;
        } else {
            if (d.equals("LOST_SATELLITE_CONNECTION")) {
                c = 1;
            }
            c = 65535;
        }
        if (c == 0) {
            i = 1;
        } else if (c == 1) {
            i = 2;
        } else {
            if (c != 2) {
                throw new IllegalArgumentException();
            }
            i = 3;
        }
        int i3 = i - 1;
        if (i3 == 0) {
            cnov cnovVar = this.c;
            this.a = 2;
            if (((csmz) cnovVar.c.a()).s()) {
                ensk h = cnov.a.h();
                h.Y(ente.a, "BugleSatellite");
                ((enrr) h.h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/NotifySatelliteConnectionChangeWorker", "checkDefaultNetworkIsSatellite", EnergyProfile.EVCONNECTOR_TYPE_OTHER, "NotifySatelliteConnectionChangeWorker.kt")).q("Default network is satellite");
                pppVar = ffra.a(ekxi.a(cnovVar.f), new cnor(null, cnovVar), this);
            } else {
                ensk h2 = cnov.a.h();
                h2.Y(ente.a, "BugleSatellite");
                ((enrr) h2.h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/NotifySatelliteConnectionChangeWorker", "checkDefaultNetworkIsSatellite", 106, "NotifySatelliteConnectionChangeWorker.kt")).q("Satellite connection is not default network");
                axnw.h(cnovVar.d.c(cnoq.a(3, null, cnovVar.e, 2)));
                pppVar = new ppp();
            }
            if (pppVar != ffhhVar) {
                return pppVar;
            }
        } else {
            if (i3 != 1) {
                this.c.b.b();
                return new ppp();
            }
            cnov cnovVar2 = this.c;
            String d2 = potVar.d("MyIdentityToken");
            this.a = 1;
            Object d3 = cnovVar2.d(d2, this);
            if (d3 != ffhhVar) {
                return d3;
            }
        }
        return ffhhVar;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cnou(this.b, this.c, ffguVar);
    }
}
