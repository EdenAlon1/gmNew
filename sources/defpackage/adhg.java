package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.apps.messaging.shared.fcm.impl.BugleFirebaseMessagingService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adhg extends adhi {
    private final fazb e;
    private final ffbr f;
    private final ffbr g;

    public adhg(Context context, fazb fazbVar, ffbr ffbrVar, ffbr ffbrVar2, errl errlVar, ffbr ffbrVar3) {
        super(context, ffbrVar, errlVar);
        this.e = fazbVar;
        this.f = ffbrVar2;
        this.g = ffbrVar3;
    }

    private final boolean e() {
        return ((acpf) this.f.b()).a();
    }

    @Override // defpackage.adhi, defpackage.cqor
    public final ekzz a() {
        return eleg.f("DittoRegistrationManagerStartupTask");
    }

    @Override // defpackage.adhi, defpackage.cpeh
    public final boolean c() {
        return false;
    }

    @Override // defpackage.adhi
    protected final void d() {
        int i;
        Context context = this.c;
        PackageManager packageManager = context.getPackageManager();
        ComponentName componentName = new ComponentName(context, (Class<?>) BugleFirebaseMessagingService.class);
        if (!((Boolean) cful.i.e()).booleanValue()) {
            if (!chru.a() && !e()) {
                i = 2;
                packageManager.setComponentEnabledSetting(componentName, i, 1);
                if (e() && ((Boolean) cful.i.e()).booleanValue()) {
                    ((bzef) this.e.b()).s();
                }
                return;
            }
        }
        i = 1;
        packageManager.setComponentEnabledSetting(componentName, i, 1);
        if (e()) {
            return;
        }
        ((bzef) this.e.b()).s();
    }
}
