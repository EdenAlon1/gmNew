package defpackage;

import android.app.PendingIntent;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.shared.notification2o.NotificationsReceiver;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequest;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class civj {
    public static final entd a = entd.c("BugleNotifications");
    public final Context b;
    public final cixb c;
    public final cixm d;
    public final fazb e;
    public final civp f;
    public final ciwb g;
    public final cqoh h;
    public final Optional i;
    public final errm j;
    public final errl k;
    public final ffbr l;
    public final ffbr m;
    private final Optional n;

    public civj(Context context, cixb cixbVar, cixm cixmVar, fazb fazbVar, civp civpVar, ciwb ciwbVar, Optional optional, cqoh cqohVar, Optional optional2, errm errmVar, errl errlVar, ffbr ffbrVar, ffbr ffbrVar2) {
        this.b = context;
        this.c = cixbVar;
        this.d = cixmVar;
        this.e = fazbVar;
        this.f = civpVar;
        this.g = ciwbVar;
        this.n = optional;
        this.h = cqohVar;
        this.i = optional2;
        this.j = errmVar;
        this.k = errlVar;
        this.l = ffbrVar;
        this.m = ffbrVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v20, types: [android.os.Parcelable, java.lang.Object] */
    public final kma a(civa civaVar, civl civlVar, ciuw ciuwVar, Bundle bundle) {
        PendingIntent e;
        Bundle deepCopy;
        boolean z = ciuwVar.g().isPresent() && ((kns[]) ciuwVar.g().get()).length > 0;
        IconCompat iconCompat = (IconCompat) ciuwVar.e().orElse(null);
        CharSequence i = ciuwVar.i();
        civp civpVar = this.f;
        cixf d = civaVar.d();
        Optional g = civlVar.g();
        final Bundle bundle2 = new Bundle();
        bundle2.putBundle("extra_notification_bundle", bundle);
        bundle2.putInt("extra_notification_type", d.j);
        bundle2.putInt("extra_notification_action_type", ciuwVar.b().p);
        bundle2.putBoolean("extra_is_summary_notification", false);
        g.ifPresent(new Consumer() { // from class: civm
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                bundle2.putString("extra_notification_tag", (String) obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        bundle2.putAll(ciuwVar.a());
        if (ciuwVar.f().isPresent()) {
            bundle2.putParcelable("extra_pending_intent_to_run", ciuwVar.f().get());
        }
        String str = d.name() + "_" + ciuwVar.b().name();
        if (g.isPresent()) {
            str = str + "_" + ((String) g.get());
        }
        if (ciuwVar.c().isPresent()) {
            Intent intent = (Intent) ciuwVar.c().get();
            if (TextUtils.isEmpty(intent.getAction())) {
                intent.setAction(str);
            }
            bundle2.putBoolean("extra_is_from_notification_for_ui_handling", true);
            intent.putExtras(bundle2);
            if (ciuwVar.l()) {
                knx knxVar = new knx(civpVar.a);
                knxVar.e(intent);
                Context context = civpVar.a;
                Intent[] c = knxVar.c();
                int a2 = ctie.a(VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS);
                Bundle bundle3 = new Bundle();
                ClipData clipData = eepf.a;
                emxf.l(true);
                e = PendingIntent.getActivities(context, 4320, c, a2 | VCardConfig.FLAG_APPEND_TYPE_PARAM, bundle3);
            } else {
                e = eepf.b(civpVar.a, 4320, intent, ctie.a(VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS));
            }
        } else {
            Intent intent2 = new Intent(civpVar.a, (Class<?>) NotificationsReceiver.class);
            intent2.setAction(str);
            intent2.putExtras(bundle2);
            e = z ? eepf.e(civpVar.a, 4320, intent2, (true != ctid.e ? 0 : VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING) | VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS, 23) : eepf.d(civpVar.a, 4320, intent2, ctie.a(VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS));
        }
        klz klzVar = new klz(iconCompat, i, e);
        Bundle bundle4 = new Bundle();
        bundle4.putInt("extra_notification_action_type", ciuwVar.b().p);
        Optional c2 = ciuwVar.c();
        if (ciuwVar.k() && c2.isPresent()) {
            String action = ((Intent) c2.get()).getAction();
            Bundle extras = ((Intent) c2.get()).getExtras();
            boolean j = ciuwVar.j();
            if (!this.n.isPresent()) {
                Bundle bundle5 = new Bundle();
                bundle5.putInt(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, 2);
                bundle5.putString(GroupManagementRequest.ACTION_TAG, action);
                bundle5.putString("packageName", this.b.getPackageName());
                bundle5.putInt("flags", 268468224);
                if (extras != null) {
                    deepCopy = extras.deepCopy();
                    bundle5.putBundle("extras", deepCopy);
                }
                klzVar.b.putBundle("com.google.android.wearable.preview.extra.REMOTE_INTENT", bundle5);
                if (j) {
                    klzVar.b.putBoolean("com.google.android.wearable.preview.extra.REMOTE_CONTENT_INTENT", true);
                }
            }
        }
        klzVar.b(bundle4);
        klzVar.d = ciuwVar.c().isPresent();
        if (ciuwVar.h().isPresent()) {
            klzVar.c = ((Integer) ciuwVar.h().get()).intValue();
        }
        if (ciuwVar.d().isPresent()) {
            klzVar.a = ((Boolean) ciuwVar.d().get()).booleanValue();
        }
        if (z) {
            for (kns knsVar : (kns[]) ciuwVar.g().get()) {
                klzVar.c(knsVar);
            }
        }
        return klzVar.a();
    }

    public final void b(kml kmlVar, cixf cixfVar, Bundle bundle, Optional optional, boolean z, ciwm ciwmVar, Optional optional2) {
        kmlVar.g = this.f.a(civq.NOTIFICATION_CLICKED, cixfVar, optional, ciwmVar, z, false, bundle);
        ciwn c = ciwn.c(Optional.empty(), Optional.empty());
        optional2.isPresent();
        kmlVar.k(this.f.b(civq.NOTIFICATION_SWIPED, cixfVar, optional, c, z, bundle));
    }
}
