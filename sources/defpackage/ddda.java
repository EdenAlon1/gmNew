package defpackage;

import android.content.ContentValues;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import defpackage.dtro;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ddda extends dtro {
    private MessageIdType a;
    private ConversationIdType b;
    private String c;
    private MessageIdType d;
    private long e;
    private byzf f;

    protected ddda() {
        MessageIdType messageIdType = bdhb.a;
        this.a = messageIdType;
        this.b = bdgq.a;
        this.d = messageIdType;
        this.e = 0L;
        this.f = byzf.SET;
    }

    @Override // defpackage.dtro
    public final String a() {
        return String.format(Locale.US, "ReminderConversationSearchQuery [messages.messages__id: %s,\n  messages.messages_conversation_id: %s,\n  reminders.reminders__id: %s,\n  reminders.reminders_message_id: %s,\n  reminders.reminders_trigger_time: %s,\n  reminders.reminders_status: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f));
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        ddjg ddjgVar = (ddjg) dtsuVar;
        aB();
        this.cL = ddjgVar.cU();
        if (ddjgVar.di(0)) {
            this.a = new MessageIdType(ddjgVar.getLong(ddjgVar.cM(0, ddjn.a)));
            fY(0);
        }
        if (ddjgVar.di(1)) {
            this.b = new ConversationIdType(ddjgVar.getLong(ddjgVar.cM(1, ddjn.a)));
            fY(1);
        }
        if (ddjgVar.di(2)) {
            this.c = ddjgVar.c();
            fY(2);
        }
        if (ddjgVar.di(3)) {
            this.d = new MessageIdType(ddjgVar.getLong(ddjgVar.cM(3, ddjn.a)));
            fY(3);
        }
        if (ddjgVar.di(4)) {
            this.e = ddjgVar.getLong(ddjgVar.cM(4, ddjn.a));
            fY(4);
        }
        if (ddjgVar.di(5)) {
            byzf[] values = byzf.values();
            int i = ddjgVar.getInt(ddjgVar.cM(5, ddjn.a));
            if (i >= values.length) {
                throw new IllegalArgumentException();
            }
            this.f = values[i];
            fY(5);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ddda)) {
            return false;
        }
        ddda dddaVar = (ddda) obj;
        return super.aD(dddaVar.cL) && Objects.equals(this.a, dddaVar.a) && Objects.equals(this.b, dddaVar.b) && Objects.equals(this.c, dddaVar.c) && Objects.equals(this.d, dddaVar.d) && this.e == dddaVar.e && this.f == dddaVar.f;
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        dtsq dtsqVar2 = (dtsqVar == null || dtsqVar.b()) ? null : this.cL;
        MessageIdType messageIdType = this.a;
        ConversationIdType conversationIdType = this.b;
        String str = this.c;
        MessageIdType messageIdType2 = this.d;
        Long valueOf = Long.valueOf(this.e);
        byzf byzfVar = this.f;
        return Objects.hash(dtsqVar2, messageIdType, conversationIdType, str, messageIdType2, valueOf, Integer.valueOf(byzfVar == null ? 0 : byzfVar.ordinal()), null);
    }

    public final String toString() {
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "ReminderConversationSearchQuery -- REDACTED") : a();
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
    }
}
