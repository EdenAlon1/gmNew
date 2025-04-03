package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;

/* compiled from: PG */
/* loaded from: classes.dex */
final class piq extends ffkk implements ffix {
    final /* synthetic */ pir a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public piq(pir pirVar) {
        super(0);
        this.a = pirVar;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        PackageManager.Property property;
        boolean isBoolean;
        boolean z;
        if (this.a.e == null) {
            return plh.b;
        }
        if (Build.VERSION.SDK_INT < 31) {
            return plh.a;
        }
        Context context = this.a.c;
        try {
            property = context.getPackageManager().getProperty("android.window.PROPERTY_ACTIVITY_EMBEDDING_SPLITS_ENABLED", context.getPackageName());
            property.getClass();
            isBoolean = property.isBoolean();
            if (!isBoolean) {
                return plh.c;
            }
            z = property.getBoolean();
            return z ? plh.a : plh.b;
        } catch (PackageManager.NameNotFoundException | Exception unused) {
            return plh.c;
        }
    }
}
