package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.Menu;
import android.view.MenuItem;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequest;
import j$.util.Optional;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aknu implements upk {
    public static final cskc a = cskc.g("Bugle", "SamsungReminderMenuExtension");
    static final cfva b = cfvl.q(173194234);
    static final cfva c = cfvl.q(173738314);
    private final Context d;
    private final ejlq e;
    private final wpk f;
    private final errl g;
    private final ctud h;
    private ejlr i;
    private MenuItem j;

    public aknu(Context context, ejlq ejlqVar, wpk wpkVar, errl errlVar, ctud ctudVar) {
        this.d = context;
        this.e = ejlqVar;
        this.f = wpkVar;
        this.g = errlVar;
        this.h = ctudVar;
    }

    @Override // defpackage.upk
    public final int a() {
        return R.id.action_send_to_samsung_reminder;
    }

    @Override // defpackage.upk
    public final void b(Menu menu, vyw vywVar) {
        if (vywVar.a() == 1 && ((Boolean) b.e()).booleanValue()) {
            if (((Boolean) c.e()).booleanValue() && ctid.d && !this.h.p()) {
                return;
            }
            MenuItem add = menu.add(0, R.id.action_send_to_samsung_reminder, 0, R.string.action_send_to_samsung_reminder);
            this.j = add;
            add.setShowAsAction(8);
        }
    }

    @Override // defpackage.upk
    public final void d(ea eaVar) {
        a aVar = new a(this.d);
        this.i = aVar;
        this.e.k(aVar);
    }

    @Override // defpackage.upk
    public final void h(bcse bcseVar) {
        String str;
        Uri uri;
        ejlp ejlpVar = new ejlp(((tzj) this.f.a(tzj.class)).a().b().h(new emwl() { // from class: aknt
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                Optional optional = (Optional) obj;
                cskc cskcVar = aknu.a;
                String str2 = null;
                if (optional != null && optional.isPresent()) {
                    str2 = ((bejf) optional.get()).n();
                }
                return emxe.b(str2);
            }
        }, this.g));
        Intent intent = new Intent("com.samsung.android.app.reminder.action.REGISTER");
        Iterator it = bcseVar.g.iterator();
        while (true) {
            if (!it.hasNext()) {
                str = "";
                break;
            }
            MessagePartCoreData messagePartCoreData = (MessagePartCoreData) it.next();
            str = messagePartCoreData.ae();
            if (messagePartCoreData.bA() && str != null) {
                break;
            }
        }
        long i = bcseVar.i();
        intent.setClassName("com.samsung.android.app.reminder", "com.samsung.android.app.reminder.externalui.ShareViaActivityDummy");
        intent.putExtra(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, "message");
        intent.putExtra("package", this.d.getPackageName());
        intent.putExtra("secondary_text", str);
        intent.putExtra("primary_time", i);
        intent.putExtra("type_detail", true != bcseVar.az() ? "sent" : "received");
        intent.putExtra("message_unique_key_type", bcseVar.c());
        Iterator it2 = bcseVar.g.iterator();
        while (true) {
            if (!it2.hasNext()) {
                uri = null;
                break;
            }
            MessagePartCoreData messagePartCoreData2 = (MessagePartCoreData) it2.next();
            if (!messagePartCoreData2.bA() && messagePartCoreData2.t() != null) {
                uri = messagePartCoreData2.t();
                uri.getClass();
                break;
            }
        }
        if (uri != null) {
            intent.putExtra("msg_image", uri);
            this.d.grantUriPermission("com.samsung.android.app.reminder", uri, 1);
        }
        ejlq ejlqVar = this.e;
        intent.setData(bcseVar.q());
        intent.addFlags(1);
        ConversationIdType t = bcseVar.t();
        String b2 = bcseVar.u().b();
        Intent data = new Intent("android.intent.action.VIEW").setData(Uri.parse("https://messages.google.com/conversation"));
        data.putExtra("conversation_id", t.a());
        data.putExtra("mapi_conversation_id", new BugleConversationId(t));
        data.putExtra("message_id", b2);
        intent.putExtra(GroupManagementRequest.ACTION_TAG, data);
        ejlqVar.i(ejlpVar, new ejlm(intent), this.i);
    }

    @Override // defpackage.upk
    public final void e() {
    }

    /* compiled from: PG */
    final class a implements ejlr<Intent, String> {
        private final Context a;

        public a(Context context) {
            this.a = context;
        }

        @Override // defpackage.ejlr
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final void c(Intent intent, String str) {
            intent.putExtra("primary_text", str);
            String stringExtra = intent.getStringExtra("secondary_text");
            stringExtra.getClass();
            long longExtra = intent.getLongExtra("primary_time", 0L);
            cskc cskcVar = aknu.a;
            intent.putExtra("message_unique_key", longExtra + "_" + str + "_" + stringExtra);
            try {
                this.a.startActivity(intent);
            } catch (ActivityNotFoundException | SecurityException e) {
                aknu.a.o("Failed to send message to Samsung Reminder app.", e);
            }
        }

        @Override // defpackage.ejlr
        public final /* bridge */ /* synthetic */ void m(Object obj, Throwable th) {
        }

        @Override // defpackage.ejlr
        public final /* synthetic */ void b(Object obj) {
        }
    }
}
