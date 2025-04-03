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
public class bvfs extends dtro implements dtrq {
    public String a;
    public fbxa d;
    public MessageIdType b = bdhb.a;
    public long c = 0;
    public fbri e = fbri.UNKNOWN_SUGGESTION_TYPE;
    public fbrd f = fbrd.UNKNOWN_STATUS;
    public fbre g = fbre.UNCONSUMED;

    protected bvfs() {
    }

    @Override // defpackage.dtro
    public final String a() {
        return String.format(Locale.US, "P2pSuggestionsTable [_id: %s,\n  target_message_id: %s,\n  generated_timestamp: %s,\n  suggestion: %s,\n  smart_suggestion_type: %s,\n  suggestion_status: %s,\n  consumption_state: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        int intValue = bvhn.c().intValue();
        MessageIdType messageIdType = this.b;
        if (messageIdType == null || messageIdType.equals(bdhb.a)) {
            contentValues.putNull("target_message_id");
        } else {
            contentValues.put("target_message_id", Long.valueOf(bdhb.a(this.b)));
        }
        contentValues.put("generated_timestamp", Long.valueOf(this.c));
        fbxa fbxaVar = this.d;
        contentValues.put("suggestion", fbxaVar == null ? null : fbxaVar.toByteArray());
        fbri fbriVar = this.e;
        if (fbriVar == null) {
            contentValues.putNull("smart_suggestion_type");
        } else {
            contentValues.put("smart_suggestion_type", Integer.valueOf(fbriVar.a()));
        }
        fbrd fbrdVar = this.f;
        if (fbrdVar == null) {
            contentValues.putNull("suggestion_status");
        } else {
            contentValues.put("suggestion_status", Integer.valueOf(fbrdVar.a()));
        }
        if (intValue >= 53080) {
            fbre fbreVar = this.g;
            if (fbreVar == null) {
                contentValues.putNull("consumption_state");
            } else {
                contentValues.put("consumption_state", Integer.valueOf(fbreVar.a()));
            }
        }
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        bvgx bvgxVar = (bvgx) ((bvgp) dtsuVar);
        aB();
        this.cL = bvgxVar.cU();
        if (bvgxVar.di(0)) {
            this.a = bvgxVar.j();
            fY(0);
        }
        if (bvgxVar.di(1)) {
            this.b = bvgxVar.e();
            fY(1);
        }
        if (bvgxVar.di(2)) {
            this.c = bvgxVar.c();
            fY(2);
        }
        if (bvgxVar.di(3)) {
            this.d = bvgxVar.i();
            fY(3);
        }
        if (bvgxVar.di(4)) {
            this.e = bvgxVar.h();
            fY(4);
        }
        if (bvgxVar.di(5)) {
            this.f = bvgxVar.f();
            fY(5);
        }
        if (bvgxVar.di(6)) {
            this.g = bvgxVar.g();
            fY(6);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bvfs)) {
            return false;
        }
        bvfs bvfsVar = (bvfs) obj;
        return super.aD(bvfsVar.cL) && Objects.equals(this.a, bvfsVar.a) && Objects.equals(this.b, bvfsVar.b) && this.c == bvfsVar.c && Objects.equals(this.d, bvfsVar.d) && this.e == bvfsVar.e && this.f == bvfsVar.f && this.g == bvfsVar.g;
    }

    @Override // defpackage.dtrq
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "p2p_suggestions", dtub.m(new String[]{"target_message_id", "generated_timestamp", "suggestion", "smart_suggestion_type", "suggestion_status", "consumption_state"}));
    }

    @Override // defpackage.dtrq
    public final String g() {
        return "_id";
    }

    @Override // defpackage.dtrq
    public final String h() {
        return "p2p_suggestions";
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        return Objects.hash((dtsqVar == null || dtsqVar.b()) ? null : this.cL, this.a, this.b, Long.valueOf(this.c), this.d, this.e, this.f, this.g, null);
    }

    @Override // defpackage.dtrq
    public final void i(StringBuilder sb, List list) {
        Object obj = new bvfr(this).get();
        Long valueOf = Long.valueOf(this.c);
        fbxa fbxaVar = this.d;
        byte[] byteArray = fbxaVar == null ? null : fbxaVar.toByteArray();
        fbri fbriVar = this.e;
        Object valueOf2 = fbriVar == null ? 0 : String.valueOf(fbriVar.a());
        fbrd fbrdVar = this.f;
        Object valueOf3 = fbrdVar == null ? 0 : String.valueOf(fbrdVar.a());
        fbre fbreVar = this.g;
        Object[] objArr = {obj, valueOf, byteArray, valueOf2, valueOf3, fbreVar == null ? 0 : String.valueOf(fbreVar.a())};
        sb.append('(');
        for (int i = 0; i < 6; i++) {
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

    public final MessageIdType k() {
        az(1, "target_message_id");
        return this.b;
    }

    public final fbrd l() {
        az(5, "suggestion_status");
        return this.f;
    }

    public final fbre m() {
        az(6, "consumption_state");
        return this.g;
    }

    public final fbri n() {
        az(4, "smart_suggestion_type");
        return this.e;
    }

    public final fbxa o() {
        az(3, "suggestion");
        return this.d;
    }

    public final String q() {
        az(0, "_id");
        return this.a;
    }

    public final String toString() {
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "P2pSuggestionsTable -- REDACTED") : a();
    }
}
