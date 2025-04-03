package defpackage;

import android.content.Intent;
import com.google.android.apps.messaging.shared.satelliteapi.dunestar.SatelliteConnectionChangeReceiver;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnpa extends ffhv implements ffjm {
    final /* synthetic */ Intent a;
    final /* synthetic */ SatelliteConnectionChangeReceiver b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cnpa(ffgu ffguVar, Intent intent, SatelliteConnectionChangeReceiver satelliteConnectionChangeReceiver) {
        super(2, ffguVar);
        this.a = intent;
        this.b = satelliteConnectionChangeReceiver;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cnpa) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002b, code lost:
    
        if (r5.equals("com.google.android.apps.messaging.shared.satelliteapi.dunestar.ACTION_LOST_SATELLITE_NEW_WIFI_CONNECTION") == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0059, code lost:
    
        r5 = r4.a.getStringExtra("MyIdentityToken");
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0061, code lost:
    
        if (r5 != null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0063, code lost:
    
        r5 = com.google.android.apps.messaging.shared.satelliteapi.dunestar.SatelliteConnectionChangeReceiver.a.j();
        r5.Y(defpackage.ente.a, "BugleSatellite");
        ((defpackage.enrr) r5.h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/SatelliteConnectionChangeReceiver$doInBackgroundAsync$$inlined$asyncPropagatingLegacy$default$1", "invokeSuspend", 67, "SatelliteConnectionChangeReceiver.kt")).q("Could not process lost satellite connection due to missing myIdentityToken");
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0085, code lost:
    
        return defpackage.ffcu.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0086, code lost:
    
        defpackage.axnw.h(((defpackage.ejoc) r4.b.m().b()).c(defpackage.cnoq.a(2, r5, null, 4)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
    
        if (r5.equals("com.google.android.apps.messaging.shared.satelliteapi.dunestar.ACTION_LOST_SATELLITE_NEW_CELLULAR_CONNECTION") == false) goto L25;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r5) {
        /*
            r4 = this;
            defpackage.ffci.b(r5)
            java.lang.Object r5 = r4.c
            ffsk r5 = (defpackage.ffsk) r5
            android.content.Intent r5 = r4.a
            java.lang.String r5 = r5.getAction()
            if (r5 == 0) goto L9f
            int r0 = r5.hashCode()
            r1 = -1956656081(0xffffffff8b5fcc2f, float:-4.3101848E-32)
            r2 = 0
            if (r0 == r1) goto L50
            r1 = 1354019195(0x50b4b17b, float:2.42522419E10)
            if (r0 == r1) goto L2e
            r1 = 1447318436(0x564453a4, float:5.3965878E13)
            if (r0 == r1) goto L25
            goto L9f
        L25:
            java.lang.String r0 = "com.google.android.apps.messaging.shared.satelliteapi.dunestar.ACTION_LOST_SATELLITE_NEW_WIFI_CONNECTION"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L9f
            goto L59
        L2e:
            java.lang.String r0 = "com.google.android.apps.messaging.shared.satelliteapi.dunestar.ACTION_NEW_SATELLITE_CONNECTION"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L9f
            com.google.android.apps.messaging.shared.satelliteapi.dunestar.SatelliteConnectionChangeReceiver r5 = r4.b
            ffbr r5 = r5.m()
            java.lang.Object r5 = r5.b()
            ejoc r5 = (defpackage.ejoc) r5
            r0 = 1
            r1 = 6
            ejoi r0 = defpackage.cnoq.a(r0, r2, r2, r1)
            com.google.common.util.concurrent.ListenableFuture r5 = r5.c(r0)
            defpackage.axnw.h(r5)
            goto L9f
        L50:
            java.lang.String r0 = "com.google.android.apps.messaging.shared.satelliteapi.dunestar.ACTION_LOST_SATELLITE_NEW_CELLULAR_CONNECTION"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L59
            goto L9f
        L59:
            android.content.Intent r5 = r4.a
            java.lang.String r0 = "MyIdentityToken"
            java.lang.String r5 = r5.getStringExtra(r0)
            if (r5 != 0) goto L86
            enru r5 = com.google.android.apps.messaging.shared.satelliteapi.dunestar.SatelliteConnectionChangeReceiver.a
            ensk r5 = r5.j()
            ensn r0 = defpackage.ente.a
            java.lang.String r1 = "BugleSatellite"
            r5.Y(r0, r1)
            java.lang.String r0 = "invokeSuspend"
            r1 = 67
            java.lang.String r2 = "com/google/android/apps/messaging/shared/satelliteapi/dunestar/SatelliteConnectionChangeReceiver$doInBackgroundAsync$$inlined$asyncPropagatingLegacy$default$1"
            java.lang.String r3 = "SatelliteConnectionChangeReceiver.kt"
            ensk r5 = r5.h(r2, r0, r1, r3)
            enrr r5 = (defpackage.enrr) r5
            java.lang.String r0 = "Could not process lost satellite connection due to missing myIdentityToken"
            r5.q(r0)
            ffcu r5 = defpackage.ffcu.a
            return r5
        L86:
            com.google.android.apps.messaging.shared.satelliteapi.dunestar.SatelliteConnectionChangeReceiver r0 = r4.b
            ffbr r0 = r0.m()
            java.lang.Object r0 = r0.b()
            ejoc r0 = (defpackage.ejoc) r0
            r1 = 2
            r3 = 4
            ejoi r5 = defpackage.cnoq.a(r1, r5, r2, r3)
            com.google.common.util.concurrent.ListenableFuture r5 = r0.c(r5)
            defpackage.axnw.h(r5)
        L9f:
            ffcu r5 = defpackage.ffcu.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cnpa.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cnpa cnpaVar = new cnpa(ffguVar, this.a, this.b);
        cnpaVar.c = obj;
        return cnpaVar;
    }
}
