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
public class btus extends dtro implements dtrq {
    public long a;
    public MessageIdType b = bdhb.a;
    public fbrc c = fbrc.UNKNOWN_CLASSIFICATION_TYPE;
    public fbwv d;

    protected btus() {
    }

    @Override // defpackage.dtro
    public final String a() {
        return String.format(Locale.US, "MessageClassificationsTable [_id: %s,\n  message_id: %s,\n  classification_type: %s,\n  classification_details: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        int intValue = btvy.c().intValue();
        MessageIdType messageIdType = this.b;
        if (messageIdType == null || messageIdType.equals(bdhb.a)) {
            contentValues.putNull("message_id");
        } else {
            contentValues.put("message_id", Long.valueOf(bdhb.a(this.b)));
        }
        fbrc fbrcVar = this.c;
        if (fbrcVar == null) {
            contentValues.putNull("classification_type");
        } else {
            contentValues.put("classification_type", Integer.valueOf(fbrcVar.a()));
        }
        if (intValue >= 58480) {
            fbwv fbwvVar = this.d;
            contentValues.put("classification_details", fbwvVar == null ? null : fbwvVar.toByteArray());
        }
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        btvm btvmVar = (btvm) ((btvh) dtsuVar);
        aB();
        this.cL = btvmVar.cU();
        if (btvmVar.di(0)) {
            this.a = btvmVar.c();
            super.fY(0);
        }
        if (btvmVar.di(1)) {
            this.b = btvmVar.e();
            super.fY(1);
        }
        if (btvmVar.di(2)) {
            this.c = btvmVar.f();
            super.fY(2);
        }
        if (btvmVar.di(3)) {
            this.d = btvmVar.g();
            super.fY(3);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof btus)) {
            return false;
        }
        btus btusVar = (btus) obj;
        return super.aD(btusVar.cL) && this.a == btusVar.a && Objects.equals(this.b, btusVar.b) && this.c == btusVar.c && Objects.equals(this.d, btusVar.d);
    }

    @Override // defpackage.dtrq
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "message_classifications_table", dtub.m(new String[]{"message_id", "classification_type", "classification_details"}));
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
        return "message_classifications_table";
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        return Objects.hash((dtsqVar == null || dtsqVar.b()) ? null : this.cL, Long.valueOf(this.a), this.b, this.c, this.d, null);
    }

    @Override // defpackage.dtrq
    public final void i(StringBuilder sb, List list) {
        Object obj = new btur(this).get();
        fbrc fbrcVar = this.c;
        Object valueOf = fbrcVar == null ? 0 : String.valueOf(fbrcVar.a());
        fbwv fbwvVar = this.d;
        Object[] objArr = {obj, valueOf, fbwvVar == null ? null : fbwvVar.toByteArray()};
        sb.append('(');
        for (int i = 0; i < 3; i++) {
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

    public final fbwv k() {
        az(3, "classification_details");
        return this.d;
    }

    public final String toString() {
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "MessageClassificationsTable -- REDACTED") : a();
    }
}
