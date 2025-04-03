package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import defpackage.dtro;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class brpy extends dtro implements dtrq {
    public long a;
    public int c;
    public String e;
    public Uri f;
    public String g;
    public ConversationIdType b = bdgq.a;
    public MessageIdType d = bdhb.a;
    public int h = 0;
    public boolean i = false;
    public long j = 0;
    public int k = 0;
    public int l = 0;

    protected brpy() {
    }

    @Override // defpackage.dtro
    public final String a() {
        return String.format(Locale.US, "ConversationLabelsTable [_id: %s,\n  conversation_id: %s,\n  label: %s,\n  message_id: %s,\n  snippet_text: %s,\n  preview_uri: %s,\n  preview_content_type: %s,\n  message_status: %s,\n  read: %s,\n  received_timestamp: %s,\n  message_protocol: %s,\n  raw_telephony_status: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g), String.valueOf(this.h), String.valueOf(this.i), String.valueOf(this.j), String.valueOf(this.k), String.valueOf(this.l));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        int intValue = brsd.c().intValue();
        ConversationIdType conversationIdType = this.b;
        if (conversationIdType == null || conversationIdType.equals(bdgq.a)) {
            contentValues.putNull("conversation_id");
        } else {
            contentValues.put("conversation_id", Long.valueOf(bdgq.a(this.b)));
        }
        if (intValue >= 53020) {
            contentValues.put(ConversationSuggestion.SUGGESTION_PROPERTY_MAP_LABEL, Integer.valueOf(this.c));
        }
        MessageIdType messageIdType = this.d;
        if (messageIdType == null || messageIdType.equals(bdhb.a)) {
            contentValues.putNull("message_id");
        } else {
            contentValues.put("message_id", Long.valueOf(bdhb.a(this.d)));
        }
        if (intValue >= 53010) {
            dtub.u(contentValues, "snippet_text", this.e);
        }
        if (intValue >= 55040) {
            Uri uri = this.f;
            if (uri == null) {
                contentValues.putNull("preview_uri");
            } else {
                contentValues.put("preview_uri", uri.toString());
            }
        }
        if (intValue >= 55040) {
            dtub.u(contentValues, "preview_content_type", this.g);
        }
        if (intValue >= 57050) {
            contentValues.put("message_status", Integer.valueOf(this.h));
        }
        if (intValue >= 57050) {
            contentValues.put("read", Boolean.valueOf(this.i));
        }
        if (intValue >= 57050) {
            contentValues.put("received_timestamp", Long.valueOf(this.j));
        }
        if (intValue >= 57050) {
            contentValues.put("message_protocol", Integer.valueOf(this.k));
        }
        if (intValue >= 57050) {
            contentValues.put("raw_telephony_status", Integer.valueOf(this.l));
        }
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        brrs brrsVar = (brrs) ((brrf) dtsuVar);
        aB();
        this.cL = brrsVar.cU();
        if (brrsVar.di(0)) {
            this.a = brrsVar.e();
            fY(0);
        }
        if (brrsVar.di(1)) {
            this.b = brrsVar.m();
            fY(1);
        }
        if (brrsVar.di(2)) {
            this.c = brrsVar.c();
            fY(2);
        }
        if (brrsVar.di(3)) {
            this.d = brrsVar.f();
            fY(3);
        }
        if (brrsVar.di(4)) {
            this.e = brrsVar.o();
            fY(4);
        }
        if (brrsVar.di(5)) {
            this.f = brrsVar.l();
            fY(5);
        }
        if (brrsVar.di(6)) {
            this.g = brrsVar.n();
            fY(6);
        }
        if (brrsVar.di(7)) {
            this.h = brrsVar.j();
            fY(7);
        }
        if (brrsVar.di(8)) {
            this.i = brrsVar.p();
            fY(8);
        }
        if (brrsVar.di(9)) {
            this.j = brrsVar.k();
            fY(9);
        }
        if (brrsVar.di(10)) {
            this.k = brrsVar.h();
            fY(10);
        }
        if (brrsVar.di(11)) {
            this.l = brrsVar.i();
            fY(11);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof brpy)) {
            return false;
        }
        brpy brpyVar = (brpy) obj;
        return super.aD(brpyVar.cL) && this.a == brpyVar.a && Objects.equals(this.b, brpyVar.b) && this.c == brpyVar.c && Objects.equals(this.d, brpyVar.d) && Objects.equals(this.e, brpyVar.e) && Objects.equals(this.f, brpyVar.f) && Objects.equals(this.g, brpyVar.g) && this.h == brpyVar.h && this.i == brpyVar.i && this.j == brpyVar.j && this.k == brpyVar.k && this.l == brpyVar.l;
    }

    @Override // defpackage.dtrq
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "conversation_labels", dtub.m(new String[]{"conversation_id", ConversationSuggestion.SUGGESTION_PROPERTY_MAP_LABEL, "message_id", "snippet_text", "preview_uri", "preview_content_type", "message_status", "read", "received_timestamp", "message_protocol", "raw_telephony_status"}));
    }

    @Override // defpackage.dtrq
    public final String g() {
        return "_id";
    }

    @Override // defpackage.dtrq
    public final String h() {
        return "conversation_labels";
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        return Objects.hash((dtsqVar == null || dtsqVar.b()) ? null : this.cL, Long.valueOf(this.a), this.b, Integer.valueOf(this.c), this.d, this.e, this.f, this.g, Integer.valueOf(this.h), Boolean.valueOf(this.i), Long.valueOf(this.j), Integer.valueOf(this.k), Integer.valueOf(this.l), null);
    }

    @Override // defpackage.dtrq
    public final void i(StringBuilder sb, List list) {
        Object obj = new brpw(this).get();
        Integer valueOf = Integer.valueOf(this.c);
        Object obj2 = new brpx(this).get();
        String str = this.e;
        Uri uri = this.f;
        Object[] objArr = {obj, valueOf, obj2, str, uri == null ? null : uri.toString(), this.g, Integer.valueOf(this.h), Integer.valueOf(this.i ? 1 : 0), Long.valueOf(this.j), Integer.valueOf(this.k), Integer.valueOf(this.l)};
        sb.append('(');
        for (int i = 0; i < 11; i++) {
            Object obj3 = objArr[i];
            if (obj3 instanceof Number) {
                sb.append(String.valueOf(obj3));
            } else {
                if (obj3 instanceof String) {
                    String str2 = (String) obj3;
                    if (str2.length() < 12) {
                        sb.append(DatabaseUtils.sqlEscapeString(str2));
                    }
                }
                list.add(obj3);
                sb.append('?');
                sb.append(',');
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
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "ConversationLabelsTable -- REDACTED") : a();
    }
}
