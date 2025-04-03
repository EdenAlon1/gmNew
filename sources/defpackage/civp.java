package defpackage;

import android.app.PendingIntent;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.shared.notification2o.NotificationsReceiver;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class civp {
    public final Context a;

    public civp(Context context) {
        this.a = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v9, types: [android.os.Parcelable, java.lang.Object] */
    public final PendingIntent a(civq civqVar, cixf cixfVar, Optional optional, ciwm ciwmVar, boolean z, boolean z2, Bundle bundle) {
        final Bundle bundle2 = new Bundle();
        int i = cixfVar.j;
        ciwn c = ciwmVar.c();
        bundle2.putInt("extra_notification_type", i);
        bundle2.putBundle("extra_notification_bundle", bundle);
        bundle2.putString("extra_notification_callback_type", civqVar.name());
        bundle2.putBoolean("extra_is_summary_notification", z);
        optional.ifPresent(new Consumer() { // from class: civn
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                bundle2.putString("extra_notification_tag", (String) obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        cisy cisyVar = (cisy) c;
        bundle2.putAll(cisyVar.b);
        if (cisyVar.a.isPresent()) {
            bundle2.putParcelable("extra_pending_intent_to_run", cisyVar.a.get());
        }
        bundle2.putBoolean("extra_is_from_notification_for_ui_handling", true);
        Intent b = ciwmVar.b();
        b.putExtras(bundle2);
        if (TextUtils.isEmpty(b.getAction())) {
            String str = cixfVar.name() + "_" + civqVar.name();
            if (optional.isPresent()) {
                str = str + "_" + ((String) optional.get());
            }
            b.setAction(str);
        }
        if (!ciwmVar.d()) {
            return z2 ? eepf.c(this.a, ciwmVar.a(), b, 134217728 | ctie.a, 1) : eepf.b(this.a, ciwmVar.a(), b, ctie.a(VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS));
        }
        knx knxVar = new knx(this.a);
        knxVar.e(b);
        if (z2) {
            return knxVar.a(ciwmVar.a(), ctie.a);
        }
        Context context = this.a;
        int a = ciwmVar.a();
        int a2 = ctie.a(VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS);
        Bundle bundle3 = new Bundle();
        ClipData clipData = eepf.a;
        Intent[] c2 = knxVar.c();
        int length = c2.length;
        Intent[] intentArr = new Intent[length];
        int i2 = 0;
        while (true) {
            int i3 = length - 1;
            if (i2 >= i3) {
                intentArr[i3] = eepf.f(c2[i3], a2, 0);
                return PendingIntent.getActivities(context, a, intentArr, a2, bundle3);
            }
            emxf.b(c2[i2].getComponent() != null, "Must set component on Intent.");
            intentArr[i2] = c2[i2];
            i2++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v9, types: [android.os.Parcelable, java.lang.Object] */
    public final PendingIntent b(civq civqVar, cixf cixfVar, Optional optional, ciwn ciwnVar, boolean z, Bundle bundle) {
        final Bundle bundle2 = new Bundle();
        bundle2.putInt("extra_notification_type", cixfVar.j);
        bundle2.putBundle("extra_notification_bundle", bundle);
        bundle2.putString("extra_notification_callback_type", civqVar.name());
        bundle2.putBoolean("extra_is_summary_notification", z);
        optional.ifPresent(new Consumer() { // from class: civo
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                bundle2.putString("extra_notification_tag", (String) obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        cisy cisyVar = (cisy) ciwnVar;
        bundle2.putAll(cisyVar.b);
        Intent intent = new Intent(this.a, (Class<?>) NotificationsReceiver.class);
        String str = cixfVar.name() + "_" + civqVar.name();
        if (optional.isPresent()) {
            str = str + "_" + ((String) optional.get());
        }
        intent.setAction(str);
        if (cisyVar.a.isPresent()) {
            bundle2.putParcelable("extra_pending_intent_to_run", cisyVar.a.get());
        }
        intent.putExtras(bundle2);
        return eepf.d(this.a, 0, intent, ctie.a(VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS));
    }
}
