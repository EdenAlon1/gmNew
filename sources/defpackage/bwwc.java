package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import defpackage.dtro;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bwwc extends dtro implements dtrq {
    public bdhg a = bdhg.a;
    public String b;

    protected bwwc() {
    }

    @Override // defpackage.dtro
    public final String a() {
        return String.format(Locale.US, "ReceivedMessagePhoneNumbersTable [rcs_message_id: %s,\n  self_msisdn: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        bdhg bdhgVar = this.a;
        if (bdhgVar == null || bdhgVar.equals(bdhg.a)) {
            contentValues.putNull("rcs_message_id");
        } else {
            contentValues.put("rcs_message_id", bdhg.d(this.a));
        }
        dtub.u(contentValues, "self_msisdn", this.b);
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        bwwp bwwpVar = (bwwp) ((bwwm) dtsuVar);
        aB();
        this.cL = bwwpVar.cU();
        if (bwwpVar.di(0)) {
            this.a = bwwpVar.c();
            fY(0);
        }
        if (bwwpVar.di(1)) {
            this.b = bwwpVar.e();
            fY(1);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bwwc)) {
            return false;
        }
        bwwc bwwcVar = (bwwc) obj;
        return super.aD(bwwcVar.cL) && Objects.equals(this.a, bwwcVar.a) && Objects.equals(this.b, bwwcVar.b);
    }

    @Override // defpackage.dtrq
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "received_message_phone_numbers", dtub.m(new String[]{"rcs_message_id", "self_msisdn"}));
    }

    @Override // defpackage.dtrq
    public final String g() {
        return null;
    }

    @Override // defpackage.dtrq
    public final String h() {
        return "received_message_phone_numbers";
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        return Objects.hash((dtsqVar == null || dtsqVar.b()) ? null : this.cL, this.a, this.b, null);
    }

    @Override // defpackage.dtrq
    public final void i(StringBuilder sb, List list) {
        Object[] objArr = {new bwwb(this).get(), this.b};
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

    public final String toString() {
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "ReceivedMessagePhoneNumbersTable -- REDACTED") : a();
    }
}
