package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.widget.Toast;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
@Deprecated
/* loaded from: classes7.dex */
public final class bdvi {
    public final Context a;
    public final ffbr b;
    private final ctvb c;
    private final ctwb d;
    private final cpbs e;
    private final ffbr f;
    private final ffbr g;
    private final crnx h;

    public bdvi(Context context, ctvb ctvbVar, ctwb ctwbVar, cpbs cpbsVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, crnx crnxVar) {
        this.a = context;
        this.c = ctvbVar;
        this.d = ctwbVar;
        this.e = cpbsVar;
        this.b = ffbrVar;
        this.f = ffbrVar2;
        this.g = ffbrVar3;
        this.h = crnxVar;
    }

    private static boolean h(int i) {
        return i == 1 || i == 2;
    }

    public final void a() {
        e(R.string.conversation_deletion_failed);
    }

    public final void b(Context context, Boolean bool, String str) {
        Toast makeText = Toast.makeText(this.a, bool.booleanValue() ? context.getString(R.string.c2o_single_file_attachment_size_limit_exceed, str) : context.getString(R.string.c2o_multiple_file_attachments_size_limit_exceed), 1);
        makeText.setGravity(17, 0, 0);
        makeText.show();
    }

    public final void c(ConversationIdType conversationIdType, ParticipantsTable.BindData bindData, MessageCoreData messageCoreData) {
        if (crnx.j(this.a) && ((carb) this.b.b()).f(conversationIdType)) {
            Resources resources = this.a.getResources();
            String string = bindData == null ? resources.getString(R.string.unknown_sender) : ((bdrt) this.g.b()).a(bindData, false);
            String b = messageCoreData == null ? "" : emxe.b(messageCoreData.au());
            String b2 = messageCoreData != null ? emxe.b(messageCoreData.ar()) : "";
            int k = messageCoreData == null ? 100 : messageCoreData.k();
            if (cbvv.h(k)) {
                f(b2);
                return;
            }
            boolean cm = messageCoreData.cm();
            crnx crnxVar = this.h;
            crnv e = crnw.e();
            e.d(resources);
            e.e(k);
            e.c(false);
            e.g(false);
            crny crnyVar = (crny) e;
            crnyVar.a = string;
            e.b(cm ? 1 : 0);
            crnyVar.c = b;
            crnyVar.d = b2;
            f(crnxVar.c(e.a()));
        }
    }

    public final void d(ConversationIdType conversationIdType, boolean z, int i, int i2, int i3, boolean z2) {
        if (!z) {
            if (i == 3) {
                if (h(i2)) {
                    if (!z2) {
                        z2 = false;
                    } else if (!this.e.a(i3).r()) {
                        e(R.string.mms_failure_outgoing_disabled);
                        return;
                    } else {
                        if (!((cgst) this.f.b()).b()) {
                            e(R.string.toast_mms_failure_outgoing_disabled_by_device_admin);
                            return;
                        }
                        z2 = true;
                    }
                }
            } else if (i == 2) {
                if (this.c.E()) {
                    if (z2) {
                        e(R.string.send_message_failure_airplane_mode);
                        return;
                    } else {
                        e(R.string.download_message_failure_airplane_mode);
                        return;
                    }
                }
                if (!this.d.r()) {
                    if (z2) {
                        e(R.string.send_message_failure_no_sim);
                        return;
                    } else {
                        e(R.string.download_message_failure_no_sim);
                        return;
                    }
                }
                if (h(i2) && !this.d.i().B()) {
                    if (z2) {
                        e(R.string.send_message_failure_no_data);
                        return;
                    } else {
                        e(R.string.download_message_failure_no_data);
                        return;
                    }
                }
            }
        }
        if (crnx.j(this.a)) {
            if (((carb) this.b.b()).f(conversationIdType) && z) {
                e(true != z2 ? R.string.download_message_success : R.string.send_message_success);
            } else {
                if (!((carb) this.b.b()).g(conversationIdType) || z) {
                    return;
                }
                e(true != z2 ? R.string.download_message_failure : R.string.send_message_failure);
            }
        }
    }

    public final void e(final int i) {
        efbd.a().post(new Runnable() { // from class: bdvg
            @Override // java.lang.Runnable
            public final void run() {
                Context context = bdvi.this.a;
                Toast.makeText(context, context.getString(i), 1).show();
            }
        });
    }

    public final void f(final String str) {
        efbd.a().post(new Runnable() { // from class: bdvh
            @Override // java.lang.Runnable
            public final void run() {
                Toast.makeText(bdvi.this.a, str, 1).show();
            }
        });
    }

    public final void g(String str) {
        if (crnx.j(this.a)) {
            f(str);
        }
    }
}
