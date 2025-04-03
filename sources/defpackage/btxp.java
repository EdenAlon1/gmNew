package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import defpackage.dtro;
import j$.time.Instant;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class btxp extends dtro implements dtrq {
    public MessageIdType a;
    public MessageIdType b;
    public bdhg c;
    public Instant d;
    public Instant e;

    protected btxp() {
        MessageIdType messageIdType = bdhb.a;
        this.a = messageIdType;
        this.b = messageIdType;
        this.c = bdhg.a;
        this.d = Instant.EPOCH;
        this.e = Instant.EPOCH;
    }

    @Override // defpackage.dtro
    public final String a() {
        return String.format(Locale.US, "MessageEditsTable [message_id: %s,\n  latest_message_id: %s,\n  original_rcs_message_id: %s,\n  edited_at_timestamp_ms: %s,\n  received_at_timestamp_ms: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        MessageIdType messageIdType = this.a;
        if (messageIdType == null || messageIdType.equals(bdhb.a)) {
            contentValues.putNull("message_id");
        } else {
            contentValues.put("message_id", Long.valueOf(bdhb.a(this.a)));
        }
        MessageIdType messageIdType2 = this.b;
        if (messageIdType2 == null || messageIdType2.equals(bdhb.a)) {
            contentValues.putNull("latest_message_id");
        } else {
            contentValues.put("latest_message_id", Long.valueOf(bdhb.a(this.b)));
        }
        bdhg bdhgVar = this.c;
        if (bdhgVar == null) {
            contentValues.putNull("original_rcs_message_id");
        } else {
            contentValues.put("original_rcs_message_id", bdhg.d(bdhgVar));
        }
        Instant instant = this.d;
        if (instant == null) {
            contentValues.putNull("edited_at_timestamp_ms");
        } else {
            contentValues.put("edited_at_timestamp_ms", Long.valueOf(bdgw.a(instant)));
        }
        Instant instant2 = this.e;
        if (instant2 == null) {
            contentValues.putNull("received_at_timestamp_ms");
        } else {
            contentValues.put("received_at_timestamp_ms", Long.valueOf(bdgw.a(instant2)));
        }
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        btyp btypVar = (btyp) ((btyj) dtsuVar);
        aB();
        this.cL = btypVar.cU();
        if (btypVar.di(0)) {
            this.a = btypVar.h();
            fY(0);
        }
        if (btypVar.di(1)) {
            this.b = btypVar.c();
            fY(1);
        }
        if (btypVar.di(2)) {
            this.c = btypVar.i();
            fY(2);
        }
        if (btypVar.di(3)) {
            this.d = btypVar.f();
            fY(3);
        }
        if (btypVar.di(4)) {
            this.e = btypVar.g();
            fY(4);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof btxp)) {
            return false;
        }
        btxp btxpVar = (btxp) obj;
        return super.aD(btxpVar.cL) && Objects.equals(this.a, btxpVar.a) && Objects.equals(this.b, btxpVar.b) && Objects.equals(this.c, btxpVar.c) && Objects.equals(this.d, btxpVar.d) && Objects.equals(this.e, btxpVar.e);
    }

    @Override // defpackage.dtrq
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "message_edits", dtub.m(new String[]{"message_id", "latest_message_id", "original_rcs_message_id", "edited_at_timestamp_ms", "received_at_timestamp_ms"}));
    }

    @Override // defpackage.dtrq
    public final String g() {
        return null;
    }

    @Override // defpackage.dtrq
    public final String h() {
        return "message_edits";
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        return Objects.hash((dtsqVar == null || dtsqVar.b()) ? null : this.cL, this.a, this.b, this.c, this.d, this.e, null);
    }

    @Override // defpackage.dtrq
    public final void i(StringBuilder sb, List list) {
        Object[] objArr = {new btxn(this).get(), new btxo(this).get(), bdhg.d(this.c), Long.valueOf(bdgw.a(this.d)), Long.valueOf(bdgw.a(this.e))};
        sb.append('(');
        for (int i = 0; i < 5; i++) {
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

    public final bdhg k() {
        az(2, "original_rcs_message_id");
        return this.c;
    }

    public final Instant l() {
        az(3, "edited_at_timestamp_ms");
        return this.d;
    }

    public final Instant m() {
        az(4, "received_at_timestamp_ms");
        return this.e;
    }

    public final String toString() {
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "MessageEditsTable -- REDACTED") : a();
    }
}
