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
public class bbtw extends dtro implements dtrq {
    public MessageIdType a;
    public MessageIdType b;
    public ajrb c;
    public bdhg d;

    protected bbtw() {
        MessageIdType messageIdType = bdhb.a;
        this.a = messageIdType;
        this.b = messageIdType;
        this.c = ajrb.b(0);
        this.d = bdhg.a;
    }

    @Override // defpackage.dtro
    public final String a() {
        return String.format(Locale.US, "BackupMessageRepliesTable [message_id: %s,\n  replied_to_message_id: %s,\n  replied_to_message_id_null_reason: %s,\n  replied_to_rcs_message_id: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d));
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
            contentValues.putNull("replied_to_message_id");
        } else {
            contentValues.put("replied_to_message_id", Long.valueOf(bdhb.a(this.b)));
        }
        ajrb ajrbVar = this.c;
        if (ajrbVar == null) {
            contentValues.putNull("replied_to_message_id_null_reason");
        } else {
            contentValues.put("replied_to_message_id_null_reason", Integer.valueOf(ajrbVar.a()));
        }
        bdhg bdhgVar = this.d;
        if (bdhgVar == null) {
            contentValues.putNull("replied_to_rcs_message_id");
        } else {
            contentValues.put("replied_to_rcs_message_id", bdhg.d(bdhgVar));
        }
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        bbur bburVar = (bbur) ((bbum) dtsuVar);
        aB();
        this.cL = bburVar.cU();
        if (bburVar.di(0)) {
            this.a = bburVar.e();
            fY(0);
        }
        if (bburVar.di(1)) {
            this.b = bburVar.f();
            fY(1);
        }
        if (bburVar.di(2)) {
            this.c = bburVar.c();
            fY(2);
        }
        if (bburVar.di(3)) {
            this.d = bburVar.g();
            fY(3);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bbtw)) {
            return false;
        }
        bbtw bbtwVar = (bbtw) obj;
        return super.aD(bbtwVar.cL) && Objects.equals(this.a, bbtwVar.a) && Objects.equals(this.b, bbtwVar.b) && this.c == bbtwVar.c && Objects.equals(this.d, bbtwVar.d);
    }

    @Override // defpackage.dtrq
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "message_replies_backup", dtub.m(new String[]{"message_id", "replied_to_message_id", "replied_to_message_id_null_reason", "replied_to_rcs_message_id"}));
    }

    @Override // defpackage.dtrq
    public final String g() {
        return null;
    }

    @Override // defpackage.dtrq
    public final String h() {
        return "message_replies_backup";
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        return Objects.hash((dtsqVar == null || dtsqVar.b()) ? null : this.cL, this.a, this.b, this.c, this.d, null);
    }

    @Override // defpackage.dtrq
    public final void i(StringBuilder sb, List list) {
        Object obj = new bbtu(this).get();
        Object obj2 = new bbtv(this).get();
        ajrb ajrbVar = this.c;
        Object[] objArr = {obj, obj2, ajrbVar == null ? 0 : String.valueOf(ajrbVar.a()), bdhg.d(this.d)};
        sb.append('(');
        for (int i = 0; i < 4; i++) {
            Object obj3 = objArr[i];
            if (obj3 instanceof Number) {
                sb.append(String.valueOf(obj3));
            } else {
                if (obj3 instanceof String) {
                    String str = (String) obj3;
                    if (str.length() < 12) {
                        sb.append(DatabaseUtils.sqlEscapeString(str));
                    }
                }
                list.add(obj3);
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
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "BackupMessageRepliesTable -- REDACTED") : a();
    }
}
