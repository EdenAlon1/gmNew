package defpackage;

import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class cfu {
    public static cfv a(cex cexVar, cfb cfbVar) {
        int i = cexVar.c;
        if (i == 0) {
            throw new IllegalStateException("Car App API level hasn't been established yet");
        }
        if (i < 3) {
            throw new cfc("Create CarHardwareManager failed", new IllegalArgumentException("Attempted to retrieve CarHardwareManager service, but the host is less than 3"));
        }
        try {
            ServiceInfo a = ceh.a(cexVar);
            String string = a.metaData != null ? a.metaData.getString("androidx.car.app.CarAppMetadataHolderService.CAR_HARDWARE_MANAGER") : null;
            if (string != null) {
                return (cfv) Class.forName(string).getConstructor(cex.class, cfb.class).newInstance(cexVar, cfbVar);
            }
            throw new ClassNotFoundException("CarHardwareManager metadata could not be found");
        } catch (PackageManager.NameNotFoundException | ReflectiveOperationException unused) {
            throw new IllegalStateException("CarHardwareManager not configured. Did you forget to add a dependency on app-automotive or app-projected artifacts?");
        }
    }
}
