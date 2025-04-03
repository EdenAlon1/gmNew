package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddlv {
    public static final cskc a = cskc.g("Bugle", "ReminderSnackbarEventFactoryImpl");
    public final Context b;
    public final ddlw c;
    public final cnla d;
    public final errl e;

    public ddlv(Context context, ddlw ddlwVar, cnla cnlaVar, errl errlVar) {
        this.b = context;
        this.c = ddlwVar;
        this.d = cnlaVar;
        this.e = errlVar;
    }

    public final cvmt a(final ddlo ddloVar) {
        return new cvms(this.c.b(ddloVar.c, ddloVar.f), this.b.getResources().getString(R.string.reminder_snackbar_action_text), new Runnable() { // from class: ddlr
            @Override // java.lang.Runnable
            public final void run() {
                ddlo ddloVar2 = ddloVar;
                MessageIdType b = bdhb.b(ddloVar2.d);
                ConversationIdType b2 = bdgq.b(ddloVar2.e);
                ddlv ddlvVar = ddlv.this;
                ddlvVar.d.h(b, b2).k(axou.a(new ddlt()), ddlvVar.e);
            }
        });
    }
}
