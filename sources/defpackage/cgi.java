package defpackage;

import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class cgi {
    public static cgj a(cex cexVar) {
        try {
            ServiceInfo a = ceh.a(cexVar);
            String string = a.metaData != null ? a.metaData.getString("androidx.car.app.CarAppMetadataHolderService.RESULT_MANAGER") : null;
            if (string != null) {
                return (cgj) Class.forName(string).getConstructor(new Class[0]).newInstance(new Object[0]);
            }
            throw new ClassNotFoundException("ResultManager metadata could not be found");
        } catch (PackageManager.NameNotFoundException | ReflectiveOperationException unused) {
            throw new IllegalStateException("ResultManager not configured. Did you forget to add a dependency on the app-automotive artifact?");
        }
    }
}
