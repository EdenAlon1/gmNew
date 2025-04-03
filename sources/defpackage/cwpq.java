package defpackage;

import android.app.Activity;
import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.block.ui.list.BlockedParticipantsActivity;
import com.google.android.apps.messaging.diagnostics.ui.DiagnosticsActivity;
import com.google.android.apps.messaging.home.ArchivedActivity;
import com.google.android.apps.messaging.home.SpamFolderActivity;
import com.google.android.apps.messaging.penpal.settings.GeminiSettingsActivity;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.suggestions.settings.SmartActionSettingsActivity;
import com.google.android.apps.messaging.ui.ClassZeroActivity;
import com.google.android.apps.messaging.ui.PermissionCheckActivity;
import com.google.android.apps.messaging.ui.appsettings.AboutPrivacyTermsActivity;
import com.google.android.apps.messaging.ui.appsettings.ApplicationSettingsActivity;
import com.google.android.apps.messaging.ui.appsettings.FederatedLearningSettingsActivity;
import com.google.android.apps.messaging.ui.appsettings.NudgeSettingsActivity;
import com.google.android.apps.messaging.ui.appsettings.PerSubscriptionSettingsActivity;
import com.google.android.apps.messaging.ui.appsettings.RcsSettingsActivity;
import com.google.android.apps.messaging.ui.appsettings.RichCardsSettingsActivity;
import com.google.android.apps.messaging.ui.appsettings.SettingsActivity;
import com.google.android.apps.messaging.ui.appsettings.SimMessagesActivity;
import com.google.android.apps.messaging.ui.appsettings.SimSelectionSettingsActivity;
import com.google.android.apps.messaging.ui.appsettings.SmartsSettingsActivity;
import com.google.android.apps.messaging.ui.appsettings.SpamSettingsActivity;
import com.google.android.apps.messaging.ui.appsettings.SwipeActionSettingsActivity;
import com.google.android.apps.messaging.ui.appsettings.protectionandsafety.ProtectionSafetySettingsActivity;
import com.google.android.apps.messaging.ui.appsettings.verifiedsms.VerifiedSmsSettingsActivity;
import com.google.android.apps.messaging.ui.conversationlist.ForwardMessageActivity;
import com.google.android.apps.messaging.ui.debug.DebugGServiceKeysActivity;
import com.google.android.apps.messaging.ui.debug.DebugMmsConfigActivity;
import com.google.android.apps.messaging.ui.debug.DebugMobileConfigurationActivity;
import com.google.android.apps.messaging.ui.debug.DebugPrefsActivity;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gif.GifBrowserActivity;
import com.google.android.apps.messaging.ui.mediaviewer.MediaViewerActivity;
import com.google.android.apps.messaging.ui.rcs.setup.manual.PhoneNumberInputV2Activity;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class cwpq extends akvg {
    private final cqoh a;
    private final crqw b;
    private final ddzb c;
    private final sfy d;
    private final Optional e;
    private final cpdm f;
    private final ctwb g;
    private final clzh h;
    private final ffbr i;

    public cwpq(cqoh cqohVar, crqw crqwVar, ddzb ddzbVar, sfy sfyVar, Optional optional, cpdm cpdmVar, ctwb ctwbVar, clzh clzhVar, ffbr ffbrVar) {
        this.a = cqohVar;
        this.b = crqwVar;
        this.c = ddzbVar;
        this.d = sfyVar;
        this.e = optional;
        this.f = cpdmVar;
        this.g = ctwbVar;
        this.h = clzhVar;
        this.i = ffbrVar;
    }

    private static Intent ag(Activity activity, Uri uri, Uri uri2) {
        Intent intent = new Intent(activity, (Class<?>) MediaViewerActivity.class);
        intent.putExtra("photos", uri2);
        intent.putExtra(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI, uri);
        intent.setFlags(536870912);
        return intent;
    }

    private static Intent ah(Context context, int i, String str) {
        return new Intent(context, (Class<?>) PerSubscriptionSettingsActivity.class).putExtra("sub_id", i).putExtra("per_sub_setting_title", str);
    }

    private final void ai(Intent intent, eptm eptmVar) {
        if (eptmVar != null) {
            intent.putExtra("EXTRA_OPENING_SOURCE", eptmVar.name());
        }
        intent.putExtra("EXTRA_OPENING_TIME", this.a.f().toEpochMilli());
    }

    @Override // defpackage.akvg
    public final void A(Context context) {
        context.startActivity(new Intent(context, (Class<?>) DiagnosticsActivity.class));
    }

    @Override // defpackage.akvg
    public final void B(ea eaVar, eptm eptmVar) {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.putExtra("android.intent.extra.LOCAL_ONLY", false);
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType("*/*");
        ai(intent, eptmVar);
        eaVar.startActivityForResult(intent, 1401);
    }

    @Override // defpackage.akvg
    public final void C(Context context, Uri uri, String str) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.addFlags(1);
        if (this.f.a()) {
            intent.addFlags(268439552);
        }
        intent.setDataAndType(uri, str);
        this.c.q(context, intent);
    }

    @Override // defpackage.akvg
    public final void D(Context context, MessageCoreData messageCoreData, equr equrVar) {
        Intent putExtra = new Intent(context, (Class<?>) ForwardMessageActivity.class).putExtra("draft_data", messageCoreData);
        putExtra.putExtra("intent_source", equrVar.e);
        context.startActivity(putExtra);
    }

    @Override // defpackage.akvg
    public final void E(Context context, Uri uri, String str) {
        Uri e = cbgi.e(context, uri);
        if (str == null && (str = csuu.q(context, e)) == null) {
            str = "video/*";
        }
        this.e.isPresent();
        Intent intent = new Intent(context, (Class<?>) MediaViewerActivity.class);
        intent.putExtra(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI, e);
        intent.putExtra("content_type", str);
        intent.putExtra("opening_source", 1);
        intent.setFlags(536870912);
        context.startActivity(intent);
    }

    @Override // defpackage.akvg
    public final void F(ea eaVar, int i, int i2, int i3, eptm eptmVar) {
        Intent intent = new Intent(eaVar.G(), (Class<?>) GifBrowserActivity.class);
        intent.putExtra("max_attachment_width", i);
        intent.putExtra("max_attachment_height", i2);
        intent.putExtra("max_attachment_size", i3);
        ai(intent, eptmVar);
        eaVar.startActivityForResult(intent, 132);
    }

    @Override // defpackage.akvg
    public final void G(ea eaVar, String str, int i, int i2, int i3, eptm eptmVar) {
        Intent intent = new Intent(eaVar.G(), (Class<?>) GifBrowserActivity.class);
        intent.putExtra("search_text", str);
        intent.putExtra("max_attachment_width", i);
        intent.putExtra("max_attachment_height", i2);
        intent.putExtra("max_attachment_size", i3);
        ai(intent, eptmVar);
        eaVar.startActivityForResult(intent, 132);
    }

    @Override // defpackage.akvg
    public final void H(Context context) {
        context.startActivity(n(context));
    }

    @Override // defpackage.akvg
    public void I(Context context) {
        csix.c("Not used on Go");
    }

    @Override // defpackage.akvg
    public void J(Context context, eisx eisxVar) {
        emxf.b(false, "Not used on Go");
    }

    @Override // defpackage.akvg
    public final void K(Context context) {
        context.startActivity(new Intent(context, (Class<?>) RichCardsSettingsActivity.class));
    }

    @Override // defpackage.akvg
    public final void L(Context context) {
        context.startActivity(new Intent(context, (Class<?>) SettingsActivity.class));
    }

    @Override // defpackage.akvg
    public final void M(Context context, eisx eisxVar) {
        Intent intent = new Intent(context, (Class<?>) SettingsActivity.class);
        eiuy.c(intent, eisxVar);
        context.startActivity(intent);
    }

    @Override // defpackage.akvg
    public final void N(Context context, eisx eisxVar) {
        Intent intent = new Intent(context, (Class<?>) SimSelectionSettingsActivity.class);
        eiuy.c(intent, eisxVar);
        context.startActivity(intent);
    }

    @Override // defpackage.akvg
    public final void O(MessagePartCoreData messagePartCoreData) {
        Uri t = messagePartCoreData.t();
        String V = messagePartCoreData.V();
        Uri v = messagePartCoreData.v();
        String str = null;
        if (!messagePartCoreData.bD() && !messagePartCoreData.bo()) {
            str = messagePartCoreData.Y();
        }
        P(t, V, v, str);
    }

    @Override // defpackage.akvg
    public final void P(Uri uri, String str, Uri uri2, String str2) {
        sfx a = this.d.a("Testing");
        if (uri == null) {
            throw new IllegalArgumentException("Requested to save attachment with null content uri");
        }
        if (str == null) {
            throw new IllegalArgumentException("Requested to save attachment with null content type");
        }
        a.b(uri, str, uri2, str2);
        a.e(new Void[0]);
    }

    @Override // defpackage.akvg
    public final void Q(Context context, aoku aokuVar, Point point, aler alerVar) {
        String k = aokuVar.k(true);
        k.getClass();
        String concat = "tel:".concat(k);
        ctwb ctwbVar = this.g;
        Intent intent = new Intent(ctwbVar.a() == 1 ? "android.intent.action.CALL" : "android.intent.action.DIAL", Uri.parse(concat));
        if (point != null) {
            Bundle bundle = new Bundle();
            bundle.putParcelable("touchPoint", point);
            intent.putExtra("android.telecom.extra.OUTGOING_CALL_EXTRAS", bundle);
        }
        if (alerVar != null) {
            alerVar.c();
        }
        this.c.q(context, intent);
    }

    @Override // defpackage.akvg
    public final Intent R(String str, Uri uri, Uri uri2) {
        return new Intent("android.intent.action.RINGTONE_PICKER").putExtra("android.intent.extra.ringtone.TYPE", 2).putExtra("android.intent.extra.ringtone.TITLE", str).putExtra("android.intent.extra.ringtone.EXISTING_URI", uri).putExtra("android.intent.extra.ringtone.DEFAULT_URI", uri2);
    }

    @Override // defpackage.akvg
    public final void T(Context context, eisx eisxVar) {
        Intent intent = new Intent(context, (Class<?>) ApplicationSettingsActivity.class);
        intent.putExtra("top_level_settings", true);
        eiuy.c(intent, eisxVar);
        context.startActivity(intent);
    }

    @Override // defpackage.akvg
    public final void U(Context context) {
        Intent o = o(context);
        o.putExtra("open_setting_directly", context.getString(R.string.rcs_default_sharing_method_key));
        context.startActivity(o);
    }

    @Override // defpackage.akvg
    public final void V(Activity activity, Uri uri, Uri uri2) {
        Intent ag = ag(activity, uri, uri2);
        ag.putExtra("opening_source", 1);
        activity.startActivity(ag);
        activity.overridePendingTransition(0, 0);
    }

    @Override // defpackage.akvg
    public final void W(ea eaVar, Uri uri, Uri uri2) {
        Intent ag = ag(eaVar.G(), uri, uri2);
        ag.putExtra("opening_source", 1);
        eaVar.startActivityForResult(ag, 152);
        eaVar.G().overridePendingTransition(0, 0);
    }

    @Override // defpackage.akvg
    public final void X(Activity activity, Uri uri, Uri uri2) {
        Intent ag = ag(activity, uri, uri2);
        ag.putExtra("opening_source", 5);
        activity.startActivity(ag);
        activity.overridePendingTransition(0, 0);
    }

    @Override // defpackage.akvg
    public final void Y(ea eaVar, Uri uri, Uri uri2) {
        Intent ag = ag(eaVar.G(), uri, uri2);
        ag.putExtra("opening_source", 5);
        eaVar.startActivityForResult(ag, 152);
        eaVar.G().overridePendingTransition(0, 0);
    }

    @Override // defpackage.akvg
    public final void Z(Activity activity, String str, int i) {
        this.h.c(str, clze.INPUT_FULLSCREEN, i);
        Intent intent = new Intent(activity, (Class<?>) PhoneNumberInputV2Activity.class);
        intent.putExtra("phone_number_input_ui_event_source_extra_key", clzd.a(i));
        intent.putExtra("phone_number_input_ui_event_sim_id_extra_key", str);
        activity.startActivityForResult(intent, 1038);
    }

    @Override // defpackage.akux
    public final void a(Context context) {
        context.startActivity(new Intent(context, (Class<?>) PermissionCheckActivity.class));
    }

    @Override // defpackage.akvg
    public final void aa(Activity activity) {
        clzh clzhVar = this.h;
        clze clzeVar = clze.INPUT_FULLSCREEN;
        clza b = clzhVar.b(3, 4);
        b.copyOnWrite();
        clzf clzfVar = (clzf) b.instance;
        clzf clzfVar2 = clzf.a;
        clzfVar.h = clzeVar.a();
        clzfVar.b |= 64;
        clzhVar.a.c(clzhVar.c.l(), b.build()).k(axnw.b(), clzhVar.b);
        Intent intent = new Intent(activity, (Class<?>) PhoneNumberInputV2Activity.class);
        intent.putExtra("phone_number_input_ui_event_source_extra_key", clzd.a(3));
        activity.startActivityForResult(intent, 1038);
    }

    @Override // defpackage.akvg
    public final void ab(Context context) {
        Intent intent = new Intent(context, (Class<?>) SpamFolderActivity.class);
        intent.putExtra("spam_folder_opened_source", 1);
        context.startActivity(intent);
    }

    @Override // defpackage.cssx
    public final void ac(Context context) {
        context.startActivity(new Intent(context, (Class<?>) DebugMmsConfigActivity.class));
    }

    @Override // defpackage.cssx
    public final void ad(Context context) {
        context.startActivity(new Intent(context, (Class<?>) DebugMobileConfigurationActivity.class));
    }

    @Override // defpackage.cssx
    public final void ae(Context context) {
        context.startActivity(new Intent(context, (Class<?>) DebugPrefsActivity.class));
    }

    @Override // defpackage.cssx
    public final void af(Context context) {
        context.startActivity(new Intent(context, (Class<?>) DebugGServiceKeysActivity.class));
    }

    @Override // defpackage.akvf
    public final Intent b(Context context) {
        return new Intent(context, (Class<?>) FederatedLearningSettingsActivity.class);
    }

    @Override // defpackage.akvf
    public final Intent c(Context context) {
        return new Intent(context, (Class<?>) GeminiSettingsActivity.class);
    }

    @Override // defpackage.akvf
    public final Intent d(Context context) {
        return new Intent(context, (Class<?>) NudgeSettingsActivity.class);
    }

    @Override // defpackage.akvf
    public final Intent e(Context context) {
        return new Intent(context, (Class<?>) SmartActionSettingsActivity.class);
    }

    @Override // defpackage.akvf
    public final Intent f(Context context) {
        return new Intent(context, (Class<?>) SmartsSettingsActivity.class);
    }

    @Override // defpackage.akvf
    public final void g(Context context) {
        context.startActivity(new Intent(context, (Class<?>) FederatedLearningSettingsActivity.class));
    }

    @Override // defpackage.akvf
    public final void h(Context context) {
        context.startActivity(new Intent(context, (Class<?>) SmartsSettingsActivity.class));
    }

    @Override // defpackage.akvg
    public final Intent i(Context context) {
        return new Intent(context, (Class<?>) AboutPrivacyTermsActivity.class);
    }

    @Override // defpackage.akvg
    public final Intent j(Context context) {
        return ah(context, -1, null);
    }

    @Override // defpackage.akvg
    public final Intent k(Context context, int i, String str) {
        return ah(context, i, str);
    }

    @Override // defpackage.akvg
    public final Intent l(Activity activity) {
        Intent createRequestRoleIntent;
        if (ctid.c) {
            createRequestRoleIntent = abk$$ExternalSyntheticApiModelOutline0.m(activity.getSystemService(abk$$ExternalSyntheticApiModelOutline0.m50m())).createRequestRoleIntent("android.app.role.SMS");
            return createRequestRoleIntent;
        }
        Intent intent = new Intent("android.provider.Telephony.ACTION_CHANGE_DEFAULT");
        intent.putExtra("package", activity.getPackageName());
        return intent;
    }

    @Override // defpackage.akvg
    public final Intent m(Context context, int i) {
        Intent intent = new Intent(context, (Class<?>) SimMessagesActivity.class);
        intent.putExtra("sub_id", i);
        return intent;
    }

    @Override // defpackage.akvg
    public final Intent n(final Context context) {
        return (Intent) ((Optional) this.i.b()).map(new Function() { // from class: cwpo
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return new Intent(context, (Class<?>) ProtectionSafetySettingsActivity.class);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElseGet(new Supplier() { // from class: cwpp
            @Override // java.util.function.Supplier
            public final Object get() {
                return new Intent(context, (Class<?>) SpamSettingsActivity.class);
            }
        });
    }

    @Override // defpackage.akvg
    public final Intent o(Context context) {
        return new Intent(context, (Class<?>) RcsSettingsActivity.class).putExtra("sub_id", -1);
    }

    @Override // defpackage.akvg
    public final Intent p(Context context) {
        return new Intent(context, (Class<?>) RichCardsSettingsActivity.class);
    }

    @Override // defpackage.akvg
    public final Intent q(Context context) {
        return new Intent(context, (Class<?>) SpamSettingsActivity.class);
    }

    @Override // defpackage.akvg
    public final Intent r(Context context) {
        return new Intent(context, (Class<?>) SwipeActionSettingsActivity.class);
    }

    @Override // defpackage.akvg
    public final Intent s(Context context) {
        return new Intent(context, (Class<?>) VerifiedSmsSettingsActivity.class);
    }

    @Override // defpackage.akvg
    public final Intent t(Context context) {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.setComponent(new ComponentName(avjz.a(context), "com.android.cellbroadcastreceiver.CellBroadcastListActivity"));
        intent.setFlags(VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
        return intent;
    }

    @Override // defpackage.akvg
    public final void w(Context context, eisx eisxVar) {
        Intent intent = new Intent(context, (Class<?>) ArchivedActivity.class);
        eiuy.c(intent, eisxVar);
        context.startActivity(intent);
    }

    @Override // defpackage.akvg
    public final void x(Context context) {
        this.b.a(context, BlockedParticipantsActivity.class);
    }

    @Override // defpackage.akvg
    public final void y(Context context, String str) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        if (this.f.a()) {
            intent.addFlags(268439552);
        }
        this.c.q(context, intent);
    }

    @Override // defpackage.akvg
    public final void z(Context context, ContentValues contentValues) {
        context.startActivity(new Intent(context, (Class<?>) ClassZeroActivity.class).putExtra("message_values", contentValues).setFlags(402653184));
    }
}
