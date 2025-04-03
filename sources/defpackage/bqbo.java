package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import defpackage.dtro;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bqbo extends dtro implements dtrq {
    public long a;
    public ConversationIdType b = bdgq.a;
    public int c = 0;

    protected bqbo() {
    }

    @Override // defpackage.dtro
    public final String a() {
        return String.format(Locale.US, "AddContactBannerTable [_id: %s,\n  conversation_id: %s,\n  banner_status: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        ConversationIdType conversationIdType = this.b;
        if (conversationIdType == null || conversationIdType.equals(bdgq.a)) {
            contentValues.putNull("conversation_id");
        } else {
            contentValues.put("conversation_id", Long.valueOf(bdgq.a(this.b)));
        }
        contentValues.put("banner_status", Integer.valueOf(this.c));
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        bqcf bqcfVar = (bqcf) ((bqcb) dtsuVar);
        aB();
        this.cL = bqcfVar.cU();
        if (bqcfVar.di(0)) {
            this.a = bqcfVar.e();
            fY(0);
        }
        if (bqcfVar.di(1)) {
            this.b = bqcfVar.f();
            fY(1);
        }
        if (bqcfVar.di(2)) {
            this.c = bqcfVar.c();
            fY(2);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bqbo)) {
            return false;
        }
        bqbo bqboVar = (bqbo) obj;
        return super.aD(bqboVar.cL) && this.a == bqboVar.a && Objects.equals(this.b, bqboVar.b) && this.c == bqboVar.c;
    }

    @Override // defpackage.dtrq
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "add_contact_banner", dtub.m(new String[]{"conversation_id", "banner_status"}));
    }

    @Override // defpackage.dtrq
    public final String g() {
        return "_id";
    }

    @Override // defpackage.dtrq
    public final String h() {
        return "add_contact_banner";
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        return Objects.hash((dtsqVar == null || dtsqVar.b()) ? null : this.cL, Long.valueOf(this.a), this.b, Integer.valueOf(this.c), null);
    }

    @Override // defpackage.dtrq
    public final void i(StringBuilder sb, List list) {
        Object[] objArr = {new bqbn(this).get(), Integer.valueOf(this.c)};
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
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "AddContactBannerTable -- REDACTED") : a();
    }
}
