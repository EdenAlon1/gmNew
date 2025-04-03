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
public class bysc extends dtro implements dtrq {
    public String a;
    public MessageIdType b = bdhb.a;
    public long c;
    public long d;

    protected bysc() {
    }

    @Override // defpackage.dtro
    public final String a() {
        return String.format(Locale.US, "UserReferenceTable [_id: %s,\n  message_id: %s,\n  user_ref_id: %s,\n  user_ref_datetime: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        MessageIdType messageIdType = this.b;
        if (messageIdType == null || messageIdType.equals(bdhb.a)) {
            contentValues.putNull("message_id");
        } else {
            contentValues.put("message_id", Long.valueOf(bdhb.a(this.b)));
        }
        dtub.t(contentValues, "user_ref_id", this.c);
        contentValues.put("user_ref_datetime", Long.valueOf(this.d));
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        bysx bysxVar = (bysx) ((byss) dtsuVar);
        aB();
        this.cL = bysxVar.cU();
        if (bysxVar.di(0)) {
            this.a = bysxVar.g();
            super.fY(0);
        }
        if (bysxVar.di(1)) {
            this.b = bysxVar.f();
            super.fY(1);
        }
        if (bysxVar.di(2)) {
            this.c = bysxVar.c();
            super.fY(2);
        }
        if (bysxVar.di(3)) {
            this.d = bysxVar.e();
            super.fY(3);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bysc)) {
            return false;
        }
        bysc byscVar = (bysc) obj;
        return super.aD(byscVar.cL) && Objects.equals(this.a, byscVar.a) && Objects.equals(this.b, byscVar.b) && this.c == byscVar.c && this.d == byscVar.d;
    }

    @Override // defpackage.dtrq
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "user_references", dtub.m(new String[]{"message_id", "user_ref_id", "user_ref_datetime"}));
    }

    @Override // defpackage.dtro
    public final void fY(int i) {
        super.fY(0);
    }

    @Override // defpackage.dtrq
    public final String g() {
        return "_id";
    }

    @Override // defpackage.dtrq
    public final String h() {
        return "user_references";
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        return Objects.hash((dtsqVar == null || dtsqVar.b()) ? null : this.cL, this.a, this.b, Long.valueOf(this.c), Long.valueOf(this.d), null);
    }

    @Override // defpackage.dtrq
    public final void i(StringBuilder sb, List list) {
        Object[] objArr = {new bysb(this).get(), Long.valueOf(this.c), Long.valueOf(this.d)};
        sb.append('(');
        for (int i = 0; i < 3; i++) {
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

    public final long k() {
        az(2, "user_ref_id");
        return this.c;
    }

    public final long l() {
        az(3, "user_ref_datetime");
        return this.d;
    }

    public final MessageIdType m() {
        az(1, "message_id");
        return this.b;
    }

    public final /* synthetic */ void n(final Long l) {
        if (l.longValue() >= 0) {
            this.a = (String) new dtuj() { // from class: byrz
                @Override // defpackage.dtuj
                public final Object a() {
                    return String.valueOf(l);
                }
            }.a();
            super.fY(0);
        }
    }

    public final String toString() {
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "UserReferenceTable -- REDACTED") : a();
    }
}
