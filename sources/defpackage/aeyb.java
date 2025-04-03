package defpackage;

import android.app.Activity;
import android.content.Intent;
import com.google.android.apps.messaging.label.settings.SuperSortSettingsActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aeyb implements adso {
    private final ffbr a;

    public aeyb(ffbr ffbrVar) {
        this.a = ffbrVar;
    }

    @Override // defpackage.adso
    public final void a(Activity activity) {
        Intent intent = new Intent(activity, (Class<?>) SuperSortSettingsActivity.class);
        intent.putExtra("extra_open_settings_from_consent", true);
        activity.startActivity(intent);
    }

    @Override // defpackage.adso
    public final void b(Activity activity) {
        axnw.h(((ahik) this.a.b()).g());
    }
}
