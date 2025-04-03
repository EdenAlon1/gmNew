package defpackage;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.main.MainActivity;
import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.InvalidConversationId;
import com.google.android.apps.messaging.shared.api.messaging.message.BugleMessageId;
import com.google.android.apps.messaging.shared.api.messaging.message.internal.CoreBugleMessageId;
import com.google.android.apps.messaging.shared.conversation.draft.ComposeRowState;
import com.google.android.apps.messaging.shared.conversation.draft.IncomingDraft;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.ui.conversation.LaunchConversationActivity;
import com.google.android.apps.messaging.ui.conversation.LaunchConversationShimActivity;
import com.google.protobuf.contrib.android.ProtoParsers;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tuu implements ayfg {
    private final ffbr a;
    private final ffbr b;
    private final ffbr c;
    private final ffbr d;
    private final ffbr e;

    public tuu(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5) {
        this.a = ffbrVar;
        this.b = ffbrVar2;
        this.c = ffbrVar3;
        this.d = ffbrVar4;
        this.e = ffbrVar5;
    }

    private static int H(Intent intent, ConversationId conversationId) {
        if (intent.getData() == null) {
            return conversationId.hashCode();
        }
        return 0;
    }

    private static void I(Intent intent, MessageIdType messageIdType, boolean z) {
        if (messageIdType.c()) {
            return;
        }
        intent.putExtra("message_id", messageIdType.b());
        if (z) {
            return;
        }
        intent.putExtra("mapi_message_id", new CoreBugleMessageId(messageIdType, -1L));
    }

    private final Intent J(Context context, ConversationId conversationId, Uri uri, bcyl bcylVar, String str, boolean z) {
        Intent K = K(context, MainActivity.class, conversationId, 11, new bdja(null), bcylVar, str, false, false, z);
        if (uri != null) {
            K.putExtra("target_uri", uri);
        }
        K.setData(bcqc.d(context, conversationId));
        K.putExtra("via_notification", true);
        return K;
    }

    private final Intent K(Context context, Class cls, ConversationId conversationId, Integer num, bdiz bdizVar, bcyl bcylVar, String str, boolean z, boolean z2, boolean z3) {
        final Intent intent;
        if (N(context)) {
            intent = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            emyw.e(intent);
        } else {
            intent = new Intent(context, (Class<?>) cls);
        }
        if (z) {
            if (conversationId == InvalidConversationId.a || num == null) {
                intent.setFlags(VCardConfig.FLAG_APPEND_TYPE_PARAM);
            } else {
                intent.setFlags(536870912);
            }
        }
        if (conversationId != InvalidConversationId.a) {
            amet.d(conversationId, intent, z2);
        }
        if (num != null) {
            intent.putExtra("conversation_state", num);
        }
        intent.addFlags(1);
        bdizVar.a(new ffji() { // from class: tus
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                ClipData b;
                ComposeRowState composeRowState = (ComposeRowState) obj;
                if (composeRowState != null) {
                    Intent intent2 = intent;
                    aygl.f(intent2, composeRowState);
                    IncomingDraft a = composeRowState.a();
                    if (a != null && (b = aygw.b(a)) != null) {
                        intent2.setClipData(b);
                    }
                }
                return ffcu.a;
            }
        }, new ffji() { // from class: tut
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                Uri t;
                MessageCoreData messageCoreData = (MessageCoreData) obj;
                if (messageCoreData != null) {
                    Intent intent2 = intent;
                    intent2.putExtra("draft_data", messageCoreData);
                    ClipData clipData = null;
                    for (MessagePartCoreData messagePartCoreData : messageCoreData.ab()) {
                        if (messagePartCoreData.aZ() && (t = messagePartCoreData.t()) != null) {
                            if (clipData == null) {
                                clipData = ClipData.newRawUri("Attachments", t);
                            } else {
                                clipData.addItem(new ClipData.Item(t));
                            }
                        }
                    }
                    if (clipData != null) {
                        intent2.setClipData(clipData);
                    }
                }
                return ffcu.a;
            }
        });
        if (bcylVar != null) {
            if (intent.getExtras() == null) {
                intent.putExtra("fake", "fake");
            }
            Bundle bundle = new Bundle();
            bcylVar.a(bundle);
            intent.putExtras(bundle);
        }
        if (str != null) {
            intent.putExtra("search_text", str);
        }
        if (!(context instanceof Activity)) {
            intent.addFlags(VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
        }
        if (z3 && !((askf) this.c.b()).a()) {
            intent.putExtra("force_conversation_1", true);
        }
        intent.putExtra("intent_timestamp", ((cqoh) this.e.b()).f().toEpochMilli());
        return intent;
    }

    private final Intent L(Context context, Class cls, ConversationId conversationId, MessageIdType messageIdType, Integer num, bdiz bdizVar, bcyl bcylVar, boolean z) {
        Intent K = K(context, cls, conversationId, num, bdizVar, bcylVar, null, true, true, z);
        I(K, messageIdType, true);
        return K;
    }

    private final void M(Context context, ConversationId conversationId, MessageIdType messageIdType, MessageId messageId, Uri uri, Integer num, bdiz bdizVar, bcyl bcylVar, Bundle bundle, String str, boolean z, Bundle bundle2, Optional optional, boolean z2, boolean z3, int i) {
        csix.k(true);
        final Intent K = K(context, MainActivity.class, conversationId, num, bdizVar, bcylVar, str, z2, false, z3);
        if (messageId != null) {
            K.putExtra("mapi_message_id", messageId);
            if (messageId instanceof BugleMessageId) {
                K.putExtra("message_id", ((BugleMessageId) messageId).c().b());
            }
        } else {
            I(K, messageIdType, false);
        }
        if (uri != null) {
            K.putExtra("target_uri", uri);
        }
        if (z) {
            K.putExtra("open_keyboard", true);
        }
        if (bundle2 != null) {
            K.putExtras(bundle2);
        }
        if (adhu.a()) {
            optional.ifPresent(new Consumer() { // from class: tuq
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    eiuy.c(K, (eisx) obj);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
        K.putExtra("launch_origin", i - 1);
        if (bundle == null || !bundle.getBoolean("via_share_intent", false)) {
            eldl.q(context, K, bundle);
        } else {
            K.putExtras(bundle);
            eldl.p(context, K);
        }
    }

    private static boolean N(Context context) {
        return !(context instanceof Activity);
    }

    @Override // defpackage.ayfg
    public final void A(Context context, ConversationId conversationId) {
        Intent L = L(context, MainActivity.class, conversationId, bdhb.a, null, ((atdn) this.d.b()).a() ? new bdix(null) : new bdja(null), null, false);
        L.setFlags(335544320);
        eldl.p(context, L);
    }

    @Override // defpackage.ayfg
    public final void B(Context context, ConversationId conversationId, MessageIdType messageIdType) {
        knx knxVar = new knx(context);
        knxVar.e(L(context, MainActivity.class, conversationId, messageIdType, null, ((atdn) this.d.b()).a() ? new bdix(null) : new bdja(null), null, false));
        knxVar.b();
    }

    @Override // defpackage.ayfg
    public final void C(Context context, ConversationId conversationId, bcyl bcylVar) {
        MessageCoreData i;
        bdiz bdjaVar;
        IncomingDraft a;
        ComposeRowState a2;
        if (TextUtils.isEmpty(null)) {
            i = null;
        } else {
            i = ((byzp) this.a.b()).i(conversationId instanceof InvalidConversationId ? bdgq.a : bdgq.b(conversationId.b()), null, null);
        }
        knx knxVar = new knx(context);
        ffbr ffbrVar = this.d;
        MessageIdType messageIdType = bdhb.a;
        if (((atdn) ffbrVar.b()).a()) {
            aygq aygqVar = aygq.n;
            aygqVar.getClass();
            a = aygw.a(aygqVar, null, ffel.a, null);
            a2 = aygi.a(a, 0);
            bdjaVar = new bdix(a2);
        } else {
            bdjaVar = new bdja(i);
        }
        knxVar.e(L(context, MainActivity.class, conversationId, messageIdType, null, bdjaVar, bcylVar, false));
        knxVar.b();
    }

    @Override // defpackage.ayfg
    public final void D(Context context, ConversationId conversationId, bdiz bdizVar, boolean z, Bundle bundle) {
        final Intent intent = new Intent(context, (Class<?>) LaunchConversationShimActivity.class);
        intent.putExtra("conversation_id", conversationId.b());
        intent.putExtra("mapi_conversation_id", conversationId);
        bdizVar.a(new ffji() { // from class: tuo
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                ComposeRowState composeRowState = (ComposeRowState) obj;
                if (composeRowState != null) {
                    aygl.f(intent, composeRowState);
                }
                return ffcu.a;
            }
        }, new ffji() { // from class: tup
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                intent.putExtra("draft_data", (MessageCoreData) obj);
                return ffcu.a;
            }
        });
        intent.putExtra("open_keyboard", z);
        if (bundle != null && bundle.containsKey("FOCUS_ON_FIELD")) {
            intent.putExtra("FOCUS_ON_FIELD", bundle.getString("FOCUS_ON_FIELD"));
        }
        intent.putExtra("force_conversation_1", false);
        intent.addFlags(VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
        eldl.p(context, intent);
    }

    @Override // defpackage.ayfg
    public final void E(Context context, ConversationId conversationId, MessageIdType messageIdType, String str) {
        Intent k = k(context, conversationId, messageIdType, null, str, false);
        k.setData(bcqc.d(context, conversationId));
        k.addFlags(VCardConfig.FLAG_APPEND_TYPE_PARAM);
        eldl.p(context, k);
    }

    @Override // defpackage.ayfg
    public final void F(Context context, ConversationId conversationId, bdiz bdizVar, Bundle bundle, Optional optional, boolean z) {
        M(context, conversationId, bdhb.a, null, null, null, bdizVar, null, null, null, true, bundle, optional, true, z, 4);
    }

    @Override // defpackage.ayfg
    public final /* synthetic */ void G(Context context, ConversationId conversationId, IncomingDraft incomingDraft, Bundle bundle, boolean z) {
        bdiz bdjaVar;
        ComposeRowState a;
        Optional empty = Optional.empty();
        csix.k(true);
        if (((atdn) this.d.b()).a()) {
            a = aygi.a(incomingDraft, 0);
            bdjaVar = new bdix(a);
        } else {
            bdjaVar = new bdja(null);
        }
        final Intent K = K(context, MainActivity.class, conversationId, null, bdjaVar, null, null, true, false, z);
        if (!((atdn) this.d.b()).a()) {
            K.putExtra("incoming_draft", incomingDraft);
        }
        K.putExtra("open_keyboard", true);
        K.putExtras(bundle);
        if (adhu.a()) {
            empty.ifPresent(new Consumer() { // from class: tur
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    eiuy.c(K, (eisx) obj);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
        eldl.q(context, K, null);
    }

    @Override // defpackage.ayfg
    public final int a(Intent intent, ConversationId conversationId) {
        return H(intent, conversationId);
    }

    @Override // defpackage.ayfg
    public final PendingIntent b(Context context) {
        Intent intent = new Intent(context, (Class<?>) MainActivity.class);
        intent.putExtra("via_notification", true);
        return ayff.a(context, intent, 0);
    }

    @Override // defpackage.ayfg
    public final PendingIntent c(Context context, ephx ephxVar) {
        Intent intent = new Intent(context, (Class<?>) MainActivity.class);
        intent.putExtra("via_notification", true);
        intent.putExtra("via_report_issue_notification", true);
        ProtoParsers.j(intent, "report_issue_event_key", ephxVar);
        return ayff.a(context, intent, 0);
    }

    @Override // defpackage.ayfg
    public final Intent d(Context context) {
        return new Intent(context, (Class<?>) MainActivity.class);
    }

    @Override // defpackage.ayfg
    public final Intent e(Context context) {
        Intent intent = new Intent(context, (Class<?>) LaunchConversationActivity.class);
        intent.putExtra("via_share_intent", true);
        intent.setFlags(1140850689);
        return intent;
    }

    @Override // defpackage.ayfg
    public final void f(Context context, ConversationId conversationId, Optional optional, boolean z) {
        M(context, conversationId, bdhb.a, null, null, null, ((atdn) this.d.b()).a() ? new bdix(null) : new bdja(null), null, null, null, true, null, optional, true, z, 4);
    }

    @Override // defpackage.ayfg
    public final /* synthetic */ void g(Context context) {
        context.startActivity(new Intent(context, (Class<?>) MainActivity.class));
    }

    @Override // defpackage.ayfg
    public final /* synthetic */ void h(Context context) {
        Intent intent = new Intent(context, (Class<?>) MainActivity.class);
        intent.addFlags(VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
        context.startActivity(intent);
    }

    @Override // defpackage.ayfg
    public final /* synthetic */ void i(Context context) {
        Intent intent = new Intent(context, (Class<?>) MainActivity.class);
        intent.addFlags(VCardConfig.FLAG_APPEND_TYPE_PARAM);
        intent.addFlags(536870912);
        context.startActivity(intent);
    }

    @Override // defpackage.ayfg
    public final void j(Context context, Bundle bundle) {
        Intent intent = new Intent(context, (Class<?>) MainActivity.class);
        intent.addFlags(268468224);
        if (bundle != null) {
            intent.setAction("android.intent.action.MAIN");
            intent.putExtras(bundle);
        }
        eldl.p(context, intent);
    }

    @Override // defpackage.ayfg
    public final Intent k(Context context, ConversationId conversationId, MessageIdType messageIdType, bcyl bcylVar, String str, boolean z) {
        Intent J = J(context, conversationId, null, bcylVar, str, z);
        I(J, (MessageIdType) Objects.requireNonNullElse(messageIdType, bdhb.a), false);
        return J;
    }

    @Override // defpackage.ayfg
    public final Intent l(Context context, ConversationId conversationId, bcyl bcylVar, boolean z, boolean z2) {
        Intent L = L(context, MainActivity.class, conversationId, bdhb.a, null, new bdja(null), bcylVar, z2);
        if (!N(context)) {
            L.setData(bcqc.d(context, conversationId));
        }
        L.putExtra("via_notification", z);
        return L;
    }

    @Override // defpackage.ayfg
    public final Intent m(Context context, ConversationId conversationId) {
        Intent K = K(context, MainActivity.class, conversationId, null, new bdja(null), null, null, true, true, false);
        I(K, bdhb.a, true);
        if (!N(context)) {
            K.setData(bcqc.d(context, conversationId));
        }
        K.putExtra("via_notification", false);
        K.putExtra("mapi_conversation_id", conversationId);
        return K;
    }

    @Override // defpackage.ayfg
    public final Intent n(Context context, ConversationId conversationId, MessageCoreData messageCoreData, boolean z, Bundle bundle) {
        Intent intent = new Intent(context, (Class<?>) MainActivity.class);
        amet.d(conversationId, intent, false);
        if (messageCoreData != null) {
            intent.putExtra("draft_data", messageCoreData);
        }
        intent.putExtra("scroll_to_bottom", false);
        intent.putExtra("should_launch_home_on_back", true);
        intent.putExtra("open_keyboard", z);
        if (bundle != null && bundle.containsKey("FOCUS_ON_FIELD")) {
            intent.putExtra("FOCUS_ON_FIELD", bundle.getString("FOCUS_ON_FIELD"));
        }
        intent.setFlags(131072);
        return intent;
    }

    @Override // defpackage.ayfg
    public final PendingIntent o(Context context, ConversationId conversationId, ephx ephxVar, boolean z) {
        Intent l = l(context, conversationId, null, true, z);
        l.putExtra("via_report_issue_notification", true);
        ProtoParsers.j(l, "report_issue_event_key", ephxVar);
        return ayff.a(context, l, H(l, conversationId));
    }

    @Override // defpackage.ayfg
    public final PendingIntent p(Context context, ConversationId conversationId, boolean z) {
        Intent l = l(context, conversationId, null, true, z);
        return ayff.a(context, l, H(l, conversationId));
    }

    @Override // defpackage.ayfg
    public final PendingIntent q(Context context, ConversationId conversationId, MessageIdType messageIdType, String str) {
        Intent L = L(context, MainActivity.class, conversationId, messageIdType, null, ((atdn) this.d.b()).a() ? new bdix(null) : new bdja(null), null, false);
        L.putExtra("via_notification", true);
        L.putExtra("via_reminder_view", true);
        L.putExtra("viewed_reminder_id", str);
        return ayff.a(context, L, 0);
    }

    @Override // defpackage.ayfg
    public final void r(Context context, ConversationId conversationId, MessageId messageId, Uri uri) {
        Intent J = J(context, conversationId, uri, null, null, false);
        if (messageId != null) {
            J.putExtra("mapi_message_id", messageId);
            if (messageId instanceof BugleMessageId) {
                J.putExtra("message_id", ((BugleMessageId) messageId).c().b());
            }
        }
        J.setData(bcqc.d(context, conversationId));
        J.addFlags(VCardConfig.FLAG_APPEND_TYPE_PARAM);
        eldl.p(context, J);
    }

    @Override // defpackage.ayfg
    public final void s(Context context, ConversationId conversationId, MessageId messageId, Uri uri) {
        M(context, conversationId, bdhb.a, messageId, uri, null, new bdja(null), null, null, null, false, null, Optional.empty(), true, false, 4);
    }

    @Override // defpackage.ayfg
    public final void t(Context context, ConversationId conversationId, MessageIdType messageIdType, Integer num, bdiz bdizVar, bcyl bcylVar, Bundle bundle, String str, boolean z) {
        v(context, conversationId, messageIdType, num, bdizVar, bcylVar, bundle, str, false, null, Optional.empty(), true, z, 4);
    }

    @Override // defpackage.ayfg
    public final /* synthetic */ void u(Context context, ConversationId conversationId, Integer num, MessageCoreData messageCoreData, boolean z, Bundle bundle) {
        v(context, conversationId, bdhb.a, num, new bdja(messageCoreData), null, null, null, z, bundle, Optional.empty(), true, false, 4);
    }

    public final void v(Context context, ConversationId conversationId, MessageIdType messageIdType, Integer num, bdiz bdizVar, bcyl bcylVar, Bundle bundle, String str, boolean z, Bundle bundle2, Optional optional, boolean z2, boolean z3, int i) {
        M(context, conversationId, messageIdType, null, null, num, bdizVar, bcylVar, bundle, str, z, bundle2, optional, z2, z3, i);
    }

    @Override // defpackage.ayfg
    public final void w(Context context, ConversationId conversationId, MessageIdType messageIdType, bcyl bcylVar, String str, boolean z) {
        v(context, conversationId, messageIdType, null, new bdja(null), bcylVar, null, str, false, null, Optional.empty(), false, z, 4);
    }

    @Override // defpackage.ayfg
    public final void x(Context context, ConversationId conversationId, MessageIdType messageIdType, bcyl bcylVar, Optional optional, boolean z, int i) {
        v(context, conversationId, messageIdType, null, new bdja(null), bcylVar, null, "", false, null, optional, false, z, i);
    }

    @Override // defpackage.ayfg
    public final boolean y(Activity activity, int i, ConversationId conversationId, ComposeRowState composeRowState, IncomingDraft incomingDraft, Integer num, MessageCoreData messageCoreData, bcyl bcylVar, boolean z) {
        emxf.a(true);
        Intent L = L(activity, MainActivity.class, conversationId, bdhb.a, num, ((atdn) this.d.b()).a() ? new bdix(composeRowState) : new bdja(messageCoreData), bcylVar, z);
        L.putExtra("via_share_intent", true);
        if (!((atdn) this.d.b()).a()) {
            if (composeRowState != null) {
                aygl.f(L, composeRowState);
            }
            L.putExtra("incoming_draft", incomingDraft);
        }
        try {
            activity.startActivityForResult(L, i, null);
            return true;
        } catch (SecurityException e) {
            csix.p("failure to start conversation for sharing", e);
            return false;
        }
    }

    @Override // defpackage.ayfg
    public final /* synthetic */ void z(Context context, ConversationId conversationId, Integer num, bdiz bdizVar, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("via_share_intent", true);
        t(context, conversationId, bdhb.a, num, bdizVar, null, bundle, null, z);
    }
}
