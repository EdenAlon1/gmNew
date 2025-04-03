package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class culw {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/util/spam/common/SpamProtectionSettingDataService");
    public static final emyl b = cfvl.y("spam_use_setting_data_service");
    public final ffbr c;
    public final ffbr d;
    private final Context e;
    private final ffbr f;
    private final ffhd g;

    public culw(Context context, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffhd ffhdVar) {
        context.getClass();
        ffbrVar.getClass();
        ffbrVar3.getClass();
        ffhdVar.getClass();
        this.e = context;
        this.c = ffbrVar;
        this.f = ffbrVar2;
        this.d = ffbrVar3;
        this.g = ffhdVar;
    }

    public static final Boolean b() {
        return (Boolean) ((cfup) b.get()).e();
    }

    private final ctzf f() {
        return ((ctzg) this.c.b()).a("spam_protection_feature_consent");
    }

    public final ctzf a() {
        ctzf f = f();
        if (!f.c() || !((ctyx) this.f.b()).q(this.e.getString(R.string.spam_detection_pref_key), false)) {
            return f;
        }
        d();
        return f();
    }

    public final Object c(ffgu ffguVar) {
        return ekxl.a(this.g, new culv(this, null), ffguVar);
    }

    public final void d() {
        ((ctzg) this.c.b()).b(f());
    }

    public final boolean e() {
        if (((cufk) this.d.b()).a()) {
            return true;
        }
        return a().a();
    }
}
