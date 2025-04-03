package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import defpackage.dtro;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class btzh extends dtro implements dtrq {
    public String a;
    public int c;
    public buax d;
    public buay e;
    public MessageIdType b = bdhb.a;
    public String f = "";
    public String g = "";

    protected btzh() {
    }

    @Override // defpackage.dtro
    public final String a() {
        return String.format(Locale.US, "MessageLabelsTable [_id: %s,\n  message_id: %s,\n  label: %s,\n  confidence: %s,\n  source: %s,\n  intent: %s,\n  model_id: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        int intValue = buaw.c().intValue();
        MessageIdType messageIdType = this.b;
        if (messageIdType == null || messageIdType.equals(bdhb.a)) {
            contentValues.putNull("message_id");
        } else {
            contentValues.put("message_id", Long.valueOf(bdhb.a(this.b)));
        }
        contentValues.put(ConversationSuggestion.SUGGESTION_PROPERTY_MAP_LABEL, Integer.valueOf(this.c));
        if (intValue >= 53060) {
            buax buaxVar = this.d;
            if (buaxVar == null) {
                contentValues.putNull("confidence");
            } else {
                contentValues.put("confidence", Integer.valueOf(buaxVar.ordinal()));
            }
        }
        buay buayVar = this.e;
        if (buayVar == null) {
            contentValues.putNull("source");
        } else {
            contentValues.put("source", Integer.valueOf(buayVar.ordinal()));
        }
        if (intValue >= 58590) {
            dtub.u(contentValues, "intent", this.f);
        }
        dtub.u(contentValues, "model_id", this.g);
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        bual bualVar = (bual) ((buad) dtsuVar);
        aB();
        this.cL = bualVar.cU();
        if (bualVar.di(0)) {
            this.a = bualVar.k();
            fY(0);
        }
        if (bualVar.di(1)) {
            this.b = bualVar.e();
            fY(1);
        }
        if (bualVar.di(2)) {
            this.c = bualVar.c();
            fY(2);
        }
        if (bualVar.di(3)) {
            this.d = bualVar.f();
            fY(3);
        }
        if (bualVar.di(4)) {
            this.e = bualVar.g();
            fY(4);
        }
        if (bualVar.di(5)) {
            this.f = bualVar.i();
            fY(5);
        }
        if (bualVar.di(6)) {
            this.g = bualVar.j();
            fY(6);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof btzh)) {
            return false;
        }
        btzh btzhVar = (btzh) obj;
        return super.aD(btzhVar.cL) && Objects.equals(this.a, btzhVar.a) && Objects.equals(this.b, btzhVar.b) && this.c == btzhVar.c && this.d == btzhVar.d && this.e == btzhVar.e && Objects.equals(this.f, btzhVar.f) && Objects.equals(this.g, btzhVar.g);
    }

    @Override // defpackage.dtrq
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "message_labels", dtub.m(new String[]{"message_id", ConversationSuggestion.SUGGESTION_PROPERTY_MAP_LABEL, "confidence", "source", "intent", "model_id"}));
    }

    @Override // defpackage.dtrq
    public final String g() {
        return "_id";
    }

    @Override // defpackage.dtrq
    public final String h() {
        return "message_labels";
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        dtsq dtsqVar2 = (dtsqVar == null || dtsqVar.b()) ? null : this.cL;
        String str = this.a;
        MessageIdType messageIdType = this.b;
        Integer valueOf = Integer.valueOf(this.c);
        buax buaxVar = this.d;
        Integer valueOf2 = Integer.valueOf(buaxVar == null ? 0 : buaxVar.ordinal());
        buay buayVar = this.e;
        return Objects.hash(dtsqVar2, str, messageIdType, valueOf, valueOf2, Integer.valueOf(buayVar == null ? 0 : buayVar.ordinal()), this.f, this.g, null);
    }

    @Override // defpackage.dtrq
    public final void i(StringBuilder sb, List list) {
        Object obj = new btzg(this).get();
        Integer valueOf = Integer.valueOf(this.c);
        buax buaxVar = this.d;
        Object valueOf2 = buaxVar == null ? r4 : String.valueOf(buaxVar.ordinal());
        buay buayVar = this.e;
        Object[] objArr = {obj, valueOf, valueOf2, buayVar != null ? String.valueOf(buayVar.ordinal()) : 0, this.f, this.g};
        sb.append('(');
        for (int i = 0; i < 6; i++) {
            Object obj2 = objArr[i];
            if (obj2 instanceof Number) {
                sb.append(String.valueOf(obj2));
            } else {
                if (obj2 instanceof String) {
                    String str = (String) obj2;
                    if (str.length() < 12) {
                        sb.append(DatabaseUtils.sqlEscapeString(str));
                    }
                }
                list.add(obj2);
                sb.append('?');
            }
            sb.append(',');
        }
        sb.setLength(sb.length() - 1);
        sb.append(')');
    }

    @Override // defpackage.dtrq
    @Deprecated
    public final /* bridge */ /* synthetic */ Object j() {
        throw null;
    }

    public final String toString() {
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "MessageLabelsTable -- REDACTED") : a();
    }
}
