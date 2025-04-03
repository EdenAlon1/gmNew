package defpackage;

import androidx.car.app.hardware.info.EnergyProfile;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class avpz implements erqj {
    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        StringBuilder sb = new StringBuilder("RCS-capable ChatEndpoints: ");
        StringBuilder sb2 = new StringBuilder("Non-RCS ChatEndpoints: ");
        for (Map.Entry entry : ((Map) obj).entrySet()) {
            String b = cskt.b(((awui) entry.getKey()).d);
            if (((avmz) entry.getValue()).c()) {
                sb.append(b);
                sb.append(",");
            } else {
                sb2.append(b);
                sb2.append(",");
            }
        }
        ensk h = avqb.a.h();
        h.Y(ente.a, "BugleRcsCapabilities");
        ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/chatapi/capabilities/provider/CapabilitiesLoggingInterceptor$BatchLoggingCallback", "onSuccess", EnergyProfile.EVCONNECTOR_TYPE_OTHER, "CapabilitiesLoggingInterceptor.java")).p(sb);
        ensk h2 = avqb.a.h();
        h2.Y(ente.a, "BugleRcsCapabilities");
        ((enrr) ((enrr) h2).h("com/google/android/apps/messaging/shared/chatapi/capabilities/provider/CapabilitiesLoggingInterceptor$BatchLoggingCallback", "onSuccess", 102, "CapabilitiesLoggingInterceptor.java")).p(sb2);
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
    }
}
