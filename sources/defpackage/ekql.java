package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekql {
    private final Context a;
    private Context b;

    public ekql(Context context) {
        this.a = context;
    }

    private final synchronized Context d() {
        Context createDeviceProtectedStorageContext;
        if (this.b == null) {
            createDeviceProtectedStorageContext = this.a.createDeviceProtectedStorageContext();
            if (createDeviceProtectedStorageContext == null) {
                createDeviceProtectedStorageContext = this.a;
            }
            this.b = createDeviceProtectedStorageContext;
        }
        return this.b;
    }

    private final File e(int i, int i2) {
        Context d = i2 == 1 ? d() : this.a;
        return i + (-1) != 0 ? d.getCacheDir() : d.getFilesDir();
    }

    public final enip a() {
        return enip.t(e(1, 2), e(1, 1), e(2, 2), e(2, 1));
    }

    public final File b(ekqn ekqnVar) {
        ekqk ekqkVar = (ekqk) ekqnVar;
        return e(ekqkVar.a, ekqkVar.b);
    }

    public final Uri c(ekqn ekqnVar, String str) {
        ekqk ekqkVar = (ekqk) ekqnVar;
        int i = ekqkVar.a;
        String str2 = ekqkVar.b == 1 ? "directboot-" : "";
        String concat = i + (-1) != 0 ? str2.concat("cache") : str2.concat("files");
        if (str.startsWith("/")) {
            str = str.substring(1);
        }
        return new Uri.Builder().scheme("android").authority(this.a.getPackageName()).path(a.m(str, concat, "/", "/")).build();
    }
}
