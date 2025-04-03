package defpackage;

import android.content.ContentValues;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import defpackage.dtro;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class agma extends dtro {
    private String b;
    private int d;
    private buax e;
    private buay f;
    private MessageIdType c = bdhb.a;
    private String g = "";
    private String h = "";
    public ConversationIdType a = bdgq.a;
    private long i = 0;

    protected agma() {
    }

    @Override // defpackage.dtro
    public final String a() {
        return String.format(Locale.US, "MessageLabelsFullQuery [message_labels.message_labels__id: %s,\n  message_labels.message_labels_message_id: %s,\n  message_labels.message_labels_label: %s,\n  message_labels.message_labels_confidence: %s,\n  message_labels.message_labels_source: %s,\n  message_labels.message_labels_intent: %s,\n  message_labels.message_labels_model_id: %s,\n  messages.messages_conversation_id: %s,\n  messages.messages_received_timestamp: %s\n]\n", String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g), String.valueOf(this.h), String.valueOf(this.a), String.valueOf(this.i));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        agss.c().intValue();
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        agsl agslVar = (agsl) ((agsk) dtsuVar);
        aB();
        this.cL = agslVar.cU();
        if (agslVar.di(0)) {
            this.b = agslVar.getString(agslVar.cM(0, agss.a));
            fY(0);
        }
        if (agslVar.di(1)) {
            this.c = agslVar.d();
            fY(1);
        }
        if (agslVar.di(2)) {
            this.d = agslVar.c();
            fY(2);
        }
        if (agslVar.di(3)) {
            this.e = agslVar.e();
            fY(3);
        }
        if (agslVar.di(4)) {
            this.f = agslVar.f();
            fY(4);
        }
        if (agslVar.di(5)) {
            this.g = agslVar.g();
            fY(5);
        }
        if (agslVar.di(6)) {
            this.h = agslVar.h();
            fY(6);
        }
        if (agslVar.di(7)) {
            this.a = new ConversationIdType(agslVar.getLong(agslVar.cM(7, agss.a)));
            fY(7);
        }
        if (agslVar.di(8)) {
            this.i = agslVar.getLong(agslVar.cM(8, agss.a));
            fY(8);
        }
    }

    public final int d() {
        az(2, ConversationSuggestion.SUGGESTION_PROPERTY_MAP_LABEL);
        return this.d;
    }

    public final MessageIdType e() {
        az(1, "message_id");
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof agma)) {
            return false;
        }
        agma agmaVar = (agma) obj;
        return super.aD(agmaVar.cL) && Objects.equals(this.b, agmaVar.b) && Objects.equals(this.c, agmaVar.c) && this.d == agmaVar.d && this.e == agmaVar.e && this.f == agmaVar.f && Objects.equals(this.g, agmaVar.g) && Objects.equals(this.h, agmaVar.h) && Objects.equals(this.a, agmaVar.a) && this.i == agmaVar.i;
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        dtsq dtsqVar2 = (dtsqVar == null || dtsqVar.b()) ? null : this.cL;
        String str = this.b;
        MessageIdType messageIdType = this.c;
        Integer valueOf = Integer.valueOf(this.d);
        buax buaxVar = this.e;
        Integer valueOf2 = Integer.valueOf(buaxVar == null ? 0 : buaxVar.ordinal());
        buay buayVar = this.f;
        return Objects.hash(dtsqVar2, str, messageIdType, valueOf, valueOf2, Integer.valueOf(buayVar == null ? 0 : buayVar.ordinal()), this.g, this.h, this.a, Long.valueOf(this.i), null);
    }

    public final String toString() {
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "MessageLabelsFullQuery -- REDACTED") : a();
    }
}
