package defpackage;

import android.app.PendingIntent;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.home.SpamFolderActivity;
import com.google.android.apps.messaging.ui.appsettings.PerSubscriptionSettingsActivity;
import com.google.android.apps.messaging.ui.ditto.DittoActivity;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aips implements ciph {
    private final ffbr a;

    public aips(ffbr ffbrVar) {
        this.a = ffbrVar;
    }

    @Override // defpackage.ciph
    public final Optional a(Context context, int i, String str) {
        knx knxVar = new knx(context);
        knxVar.d(new Intent(context, (Class<?>) PerSubscriptionSettingsActivity.class).putExtra("sub_id", i).putExtra("per_sub_setting_title", str));
        knxVar.d(((akvg) this.a.b()).m(context, i));
        ClipData clipData = eepf.a;
        PendingIntent a = knxVar.a(0, 201326592);
        a.getClass();
        return Optional.of(a);
    }

    @Override // defpackage.ciph
    public final Intent b(Optional optional) {
        Intent intent = new Intent("android.intent.action.DIAL");
        if (optional.isPresent()) {
            aoku aokuVar = (aoku) optional.get();
            cfva cfvaVar = aoqm.a;
            intent.setData(Uri.parse(String.format("tel:%s", aokuVar.p(((Boolean) new aopd().get()).booleanValue()))));
        }
        return intent;
    }

    @Override // defpackage.ciph
    public final Optional c(Context context) {
        Intent a = akuv.c(context, DittoActivity.class, "android.intent.action.VIEW").a();
        a.putExtra("started_from_notification", true);
        return Optional.ofNullable(eepf.a(context, -1, a, ctie.a(VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS)));
    }

    @Override // defpackage.ciph
    public final Optional d(Context context) {
        Intent intent = new Intent(context, (Class<?>) SpamFolderActivity.class);
        intent.putExtra("spam_folder_opened_source", 2);
        knx knxVar = new knx(context);
        knxVar.e(intent);
        ClipData clipData = eepf.a;
        PendingIntent a = knxVar.a(0, 201326592);
        a.getClass();
        return Optional.of(a);
    }
}
