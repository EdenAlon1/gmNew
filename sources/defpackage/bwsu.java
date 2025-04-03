package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import defpackage.dtro;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bwsu extends dtro implements dtrq {
    public String a;
    public String b;
    public String c;
    public String d;

    protected bwsu() {
    }

    @Override // defpackage.dtro
    public final String a() {
        return String.format(Locale.US, "RbmBusinessVerifierInfoTable [verifier_id: %s,\n  verifier_name: %s,\n  verifier_logo_image_remote_url: %s,\n  verifier_logo_image_local_uri: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        dtub.u(contentValues, "verifier_id", this.a);
        dtub.u(contentValues, BusinessInfoDatabaseConstants.BusinessInfoAndVerifierInfoViewConstants.Columns.VERIFIER_NAME, this.b);
        dtub.u(contentValues, BusinessInfoDatabaseConstants.BusinessInfoAndVerifierInfoViewConstants.Columns.VERIFIER_LOGO_IMAGE_REMOTE_URL, this.c);
        dtub.u(contentValues, BusinessInfoDatabaseConstants.BusinessInfoAndVerifierInfoViewConstants.Columns.VERIFIER_LOGO_IMAGE_LOCAL_URI, this.d);
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        bwtn bwtnVar = (bwtn) ((bwti) dtsuVar);
        aB();
        this.cL = bwtnVar.cU();
        if (bwtnVar.di(0)) {
            this.a = bwtnVar.c();
            fY(0);
        }
        if (bwtnVar.di(1)) {
            this.b = bwtnVar.g();
            fY(1);
        }
        if (bwtnVar.di(2)) {
            this.c = bwtnVar.f();
            fY(2);
        }
        if (bwtnVar.di(3)) {
            this.d = bwtnVar.e();
            fY(3);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bwsu)) {
            return false;
        }
        bwsu bwsuVar = (bwsu) obj;
        return super.aD(bwsuVar.cL) && Objects.equals(this.a, bwsuVar.a) && Objects.equals(this.b, bwsuVar.b) && Objects.equals(this.c, bwsuVar.c) && Objects.equals(this.d, bwsuVar.d);
    }

    @Override // defpackage.dtrq
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "rbm_business_verifier_info", dtub.m(new String[]{"verifier_id", BusinessInfoDatabaseConstants.BusinessInfoAndVerifierInfoViewConstants.Columns.VERIFIER_NAME, BusinessInfoDatabaseConstants.BusinessInfoAndVerifierInfoViewConstants.Columns.VERIFIER_LOGO_IMAGE_REMOTE_URL, BusinessInfoDatabaseConstants.BusinessInfoAndVerifierInfoViewConstants.Columns.VERIFIER_LOGO_IMAGE_LOCAL_URI}));
    }

    @Override // defpackage.dtrq
    public final String g() {
        return null;
    }

    @Override // defpackage.dtrq
    public final String h() {
        return "rbm_business_verifier_info";
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        return Objects.hash((dtsqVar == null || dtsqVar.b()) ? null : this.cL, this.a, this.b, this.c, this.d, null);
    }

    @Override // defpackage.dtrq
    public final void i(StringBuilder sb, List list) {
        Object[] objArr = {this.a, this.b, this.c, this.d};
        sb.append('(');
        for (int i = 0; i < 4; i++) {
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
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "RbmBusinessVerifierInfoTable -- REDACTED") : a();
    }
}
