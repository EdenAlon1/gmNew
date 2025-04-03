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
public class bxqk extends dtro implements dtrq {
    public MessageIdType a = bdhb.a;
    public cnsy b = cnsy.HELP_NOT_LONGER_NEED;

    protected bxqk() {
    }

    @Override // defpackage.dtro
    public final String a() {
        return String.format(Locale.US, "SatelliteEmergencyDetailsTable [message_id: %s,\n  help_state: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        MessageIdType messageIdType = this.a;
        if (messageIdType == null || messageIdType.equals(bdhb.a)) {
            contentValues.putNull("message_id");
        } else {
            contentValues.put("message_id", Long.valueOf(bdhb.a(this.a)));
        }
        cnsy cnsyVar = this.b;
        if (cnsyVar == null) {
            contentValues.putNull("help_state");
        } else {
            contentValues.put("help_state", Integer.valueOf(cnsyVar.a()));
        }
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        bxqy bxqyVar = (bxqy) ((bxqv) dtsuVar);
        aB();
        this.cL = bxqyVar.cU();
        if (bxqyVar.di(0)) {
            this.a = bxqyVar.c();
            fY(0);
        }
        if (bxqyVar.di(1)) {
            this.b = bxqyVar.e();
            fY(1);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bxqk)) {
            return false;
        }
        bxqk bxqkVar = (bxqk) obj;
        return super.aD(bxqkVar.cL) && Objects.equals(this.a, bxqkVar.a) && this.b == bxqkVar.b;
    }

    @Override // defpackage.dtrq
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "satellite_emergency_details", dtub.m(new String[]{"message_id", "help_state"}));
    }

    @Override // defpackage.dtrq
    public final String g() {
        return null;
    }

    @Override // defpackage.dtrq
    public final String h() {
        return "satellite_emergency_details";
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        return Objects.hash((dtsqVar == null || dtsqVar.b()) ? null : this.cL, this.a, this.b, null);
    }

    @Override // defpackage.dtrq
    public final void i(StringBuilder sb, List list) {
        Object obj = new bxqj(this).get();
        cnsy cnsyVar = this.b;
        Object[] objArr = {obj, cnsyVar == null ? 0 : String.valueOf(cnsyVar.a())};
        sb.append('(');
        for (int i = 0; i < 2; i++) {
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
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "SatelliteEmergencyDetailsTable -- REDACTED") : a();
    }
}
