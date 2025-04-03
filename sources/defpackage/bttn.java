package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import defpackage.dtro;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bttn extends dtro implements dtrq {
    public MessageIdType a = bdhb.a;
    public String b;

    protected bttn() {
    }

    @Override // defpackage.dtro
    public final String a() {
        return String.format(Locale.US, "MessageCaptionsTable [message_id: %s,\n  caption: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        MessageIdType messageIdType = this.a;
        if (messageIdType == null || messageIdType.equals(bdhb.a)) {
            contentValues.putNull("message_id");
        } else {
            contentValues.put("message_id", Long.valueOf(bdhb.a(this.a)));
        }
        dtub.u(contentValues, "caption", this.b);
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        btub btubVar = (btub) ((btty) dtsuVar);
        aB();
        this.cL = btubVar.cU();
        if (btubVar.di(0)) {
            this.a = btubVar.c();
            fY(0);
        }
        if (btubVar.di(1)) {
            this.b = btubVar.e();
            fY(1);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bttn)) {
            return false;
        }
        bttn bttnVar = (bttn) obj;
        return super.aD(bttnVar.cL) && Objects.equals(this.a, bttnVar.a) && Objects.equals(this.b, bttnVar.b);
    }

    @Override // defpackage.dtrq
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "message_captions", dtub.m(new String[]{"message_id", "caption"}));
    }

    @Override // defpackage.dtrq
    public final String g() {
        return null;
    }

    @Override // defpackage.dtrq
    public final String h() {
        return "message_captions";
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        return Objects.hash((dtsqVar == null || dtsqVar.b()) ? null : this.cL, this.a, this.b, null);
    }

    @Override // defpackage.dtrq
    public final void i(StringBuilder sb, List list) {
        Object[] objArr = {new bttm(this).get(), this.b};
        sb.append('(');
        for (int i = 0; i < 2; i++) {
            Object obj = objArr[i];
            if (obj instanceof Number) {
                sb.append(String.valueOf(obj));
            } else {
                if (obj instanceof String) {
                    String str = (String) obj;
                    if (str.length() < 12) {
                        sb.append(DatabaseUtils.sqlEscapeString(str));
                    }
                }
                list.add(obj);
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

    public final String k() {
        az(1, "caption");
        return this.b;
    }

    public final String toString() {
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "MessageCaptionsTable -- REDACTED") : a();
    }
}
