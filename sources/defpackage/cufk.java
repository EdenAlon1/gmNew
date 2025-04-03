package defpackage;

import android.content.Context;
import android.os.Build;
import android.security.advancedprotection.AdvancedProtectionManager;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cufk {
    public final Context a;
    public final ffbr b;
    public final errl c;
    public final ffsk d;
    public final Object e;
    public Boolean f;

    public cufk(Context context, ffbr ffbrVar, errl errlVar, ffsk ffskVar) {
        context.getClass();
        ffbrVar.getClass();
        errlVar.getClass();
        ffskVar.getClass();
        this.a = context;
        this.b = ffbrVar;
        this.c = errlVar;
        this.d = ffskVar;
        this.e = new Object();
    }

    public final boolean a() {
        boolean isAdvancedProtectionEnabled;
        ekzz f = eleg.f("AapmManager.isAapmEnabled");
        try {
            synchronized (this.e) {
                Boolean bool = this.f;
                if (bool != null) {
                    boolean booleanValue = bool.booleanValue();
                    ffig.a(f, null);
                    return booleanValue;
                }
                ffig.a(f, null);
                Context context = this.a;
                if (Build.VERSION.SDK_INT < 36) {
                    isAdvancedProtectionEnabled = false;
                } else {
                    Object systemService = context.getSystemService("advanced_protection");
                    systemService.getClass();
                    isAdvancedProtectionEnabled = ((AdvancedProtectionManager) systemService).isAdvancedProtectionEnabled();
                }
                synchronized (this.e) {
                    this.f = Boolean.valueOf(isAdvancedProtectionEnabled);
                }
                return isAdvancedProtectionEnabled;
            }
        } finally {
        }
    }
}
