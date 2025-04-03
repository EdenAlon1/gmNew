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
public class bsor extends dtro implements dtrq {
    public ConversationIdType a = bdgq.a;
    public String b;

    protected bsor() {
    }

    @Override // defpackage.dtro
    public final String a() {
        return String.format(Locale.US, "CustodianRcsGroupIdsTable [conversation_id: %s,\n  rcs_group_id: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        ConversationIdType conversationIdType = this.a;
        if (conversationIdType == null || conversationIdType.equals(bdgq.a)) {
            contentValues.putNull("conversation_id");
        } else {
            contentValues.put("conversation_id", Long.valueOf(bdgq.a(this.a)));
        }
        dtub.u(contentValues, "rcs_group_id", this.b);
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        bspf bspfVar = (bspf) ((bspc) dtsuVar);
        aB();
        this.cL = bspfVar.cU();
        if (bspfVar.di(0)) {
            this.a = bspfVar.c();
            fY(0);
        }
        if (bspfVar.di(1)) {
            this.b = bspfVar.e();
            fY(1);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bsor)) {
            return false;
        }
        bsor bsorVar = (bsor) obj;
        return super.aD(bsorVar.cL) && Objects.equals(this.a, bsorVar.a) && Objects.equals(this.b, bsorVar.b);
    }

    @Override // defpackage.dtrq
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "custodian_rcs_group_ids", dtub.m(new String[]{"conversation_id", "rcs_group_id"}));
    }

    @Override // defpackage.dtrq
    public final String g() {
        return null;
    }

    @Override // defpackage.dtrq
    public final String h() {
        return "custodian_rcs_group_ids";
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        return Objects.hash((dtsqVar == null || dtsqVar.b()) ? null : this.cL, this.a, this.b, null);
    }

    @Override // defpackage.dtrq
    public final void i(StringBuilder sb, List list) {
        Object[] objArr = {new bsoq(this).get(), this.b};
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
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "CustodianRcsGroupIdsTable -- REDACTED") : a();
    }
}
