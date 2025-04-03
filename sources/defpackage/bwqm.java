package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import com.google.android.ims.rcsservice.businessinfo.AgentUseCase;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import defpackage.dtro;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bwqm extends dtro implements dtrq {
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public long k;
    public AgentUseCase l = AgentUseCase.AGENT_USE_CASE_UNSPECIFIED;

    protected bwqm() {
    }

    @Override // defpackage.dtro
    public final String a() {
        return String.format(Locale.US, "RbmBusinessInfoTable [rbm_bot_id: %s,\n  display_name: %s,\n  logo_image_remote_url: %s,\n  logo_image_local_uri: %s,\n  description: %s,\n  color: %s,\n  hero_image_remote_url: %s,\n  hero_image_local_uri: %s,\n  verifier_id: %s,\n  version: %s,\n  expiry_milliseconds: %s,\n  agent_use_case_category: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g), String.valueOf(this.h), String.valueOf(this.i), String.valueOf(this.j), String.valueOf(this.k), String.valueOf(this.l));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        int intValue = bwso.d().intValue();
        dtub.u(contentValues, "rbm_bot_id", this.a);
        dtub.u(contentValues, "display_name", this.b);
        dtub.u(contentValues, "logo_image_remote_url", this.c);
        dtub.u(contentValues, "logo_image_local_uri", this.d);
        dtub.u(contentValues, "description", this.e);
        dtub.u(contentValues, BusinessInfoDatabaseConstants.BusinessInfoTableConstants.Columns.COLOR, this.f);
        dtub.u(contentValues, BusinessInfoDatabaseConstants.BusinessInfoTableConstants.Columns.HERO_IMAGE_REMOTE_URL, this.g);
        dtub.u(contentValues, BusinessInfoDatabaseConstants.BusinessInfoTableConstants.Columns.HERO_IMAGE_LOCAL_URI, this.h);
        dtub.u(contentValues, "verifier_id", this.i);
        dtub.u(contentValues, BusinessInfoDatabaseConstants.BusinessInfoMetadataTableConstants.Columns.VERSION, this.j);
        contentValues.put(BusinessInfoDatabaseConstants.BusinessInfoMetadataTableConstants.Columns.EXPIRY_MILLISECONDS, Long.valueOf(this.k));
        if (intValue >= 59140) {
            AgentUseCase agentUseCase = this.l;
            if (agentUseCase == null) {
                contentValues.putNull("agent_use_case_category");
            } else {
                contentValues.put("agent_use_case_category", Integer.valueOf(agentUseCase.ordinal()));
            }
        }
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        bwsd bwsdVar = (bwsd) ((bwrq) dtsuVar);
        aB();
        this.cL = bwsdVar.cU();
        if (bwsdVar.di(0)) {
            this.a = bwsdVar.m();
            fY(0);
        }
        if (bwsdVar.di(1)) {
            this.b = bwsdVar.h();
            fY(1);
        }
        if (bwsdVar.di(2)) {
            this.c = bwsdVar.l();
            fY(2);
        }
        if (bwsdVar.di(3)) {
            this.d = bwsdVar.k();
            fY(3);
        }
        if (bwsdVar.di(4)) {
            this.e = bwsdVar.g();
            fY(4);
        }
        if (bwsdVar.di(5)) {
            this.f = bwsdVar.f();
            fY(5);
        }
        if (bwsdVar.di(6)) {
            this.g = bwsdVar.j();
            fY(6);
        }
        if (bwsdVar.di(7)) {
            this.h = bwsdVar.i();
            fY(7);
        }
        if (bwsdVar.di(8)) {
            this.i = bwsdVar.n();
            fY(8);
        }
        if (bwsdVar.di(9)) {
            this.j = bwsdVar.o();
            fY(9);
        }
        if (bwsdVar.di(10)) {
            this.k = bwsdVar.c();
            fY(10);
        }
        if (bwsdVar.di(11)) {
            this.l = bwsdVar.e();
            fY(11);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bwqm)) {
            return false;
        }
        bwqm bwqmVar = (bwqm) obj;
        return super.aD(bwqmVar.cL) && Objects.equals(this.a, bwqmVar.a) && Objects.equals(this.b, bwqmVar.b) && Objects.equals(this.c, bwqmVar.c) && Objects.equals(this.d, bwqmVar.d) && Objects.equals(this.e, bwqmVar.e) && Objects.equals(this.f, bwqmVar.f) && Objects.equals(this.g, bwqmVar.g) && Objects.equals(this.h, bwqmVar.h) && Objects.equals(this.i, bwqmVar.i) && Objects.equals(this.j, bwqmVar.j) && this.k == bwqmVar.k && this.l == bwqmVar.l;
    }

    @Override // defpackage.dtrq
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "rbm_business_info", dtub.m(new String[]{"rbm_bot_id", "display_name", "logo_image_remote_url", "logo_image_local_uri", "description", BusinessInfoDatabaseConstants.BusinessInfoTableConstants.Columns.COLOR, BusinessInfoDatabaseConstants.BusinessInfoTableConstants.Columns.HERO_IMAGE_REMOTE_URL, BusinessInfoDatabaseConstants.BusinessInfoTableConstants.Columns.HERO_IMAGE_LOCAL_URI, "verifier_id", BusinessInfoDatabaseConstants.BusinessInfoMetadataTableConstants.Columns.VERSION, BusinessInfoDatabaseConstants.BusinessInfoMetadataTableConstants.Columns.EXPIRY_MILLISECONDS, "agent_use_case_category"}));
    }

    @Override // defpackage.dtrq
    public final String g() {
        return null;
    }

    @Override // defpackage.dtrq
    public final String h() {
        return "rbm_business_info";
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        dtsq dtsqVar2 = (dtsqVar == null || dtsqVar.b()) ? null : this.cL;
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        String str4 = this.d;
        String str5 = this.e;
        String str6 = this.f;
        String str7 = this.g;
        String str8 = this.h;
        String str9 = this.i;
        String str10 = this.j;
        Long valueOf = Long.valueOf(this.k);
        AgentUseCase agentUseCase = this.l;
        return Objects.hash(dtsqVar2, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, valueOf, Integer.valueOf(agentUseCase == null ? 0 : agentUseCase.ordinal()), null);
    }

    @Override // defpackage.dtrq
    public final void i(StringBuilder sb, List list) {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        String str4 = this.d;
        String str5 = this.e;
        String str6 = this.f;
        String str7 = this.g;
        String str8 = this.h;
        String str9 = this.i;
        String str10 = this.j;
        Long valueOf = Long.valueOf(this.k);
        AgentUseCase agentUseCase = this.l;
        Object[] objArr = {str, str2, str3, str4, str5, str6, str7, str8, str9, str10, valueOf, agentUseCase == null ? 0 : String.valueOf(agentUseCase.ordinal())};
        sb.append('(');
        for (int i = 0; i < 12; i++) {
            Object obj = objArr[i];
            if (obj instanceof Number) {
                sb.append(String.valueOf(obj));
            } else {
                if (obj instanceof String) {
                    String str11 = (String) obj;
                    if (str11.length() < 12) {
                        sb.append(DatabaseUtils.sqlEscapeString(str11));
                    }
                }
                list.add(obj);
                sb.append('?');
                sb.append(',');
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
        az(10, BusinessInfoDatabaseConstants.BusinessInfoMetadataTableConstants.Columns.EXPIRY_MILLISECONDS);
        return this.k;
    }

    public final String l() {
        az(5, BusinessInfoDatabaseConstants.BusinessInfoTableConstants.Columns.COLOR);
        return this.f;
    }

    public final String m() {
        az(1, "display_name");
        return this.b;
    }

    public final String n() {
        az(0, "rbm_bot_id");
        return this.a;
    }

    public final String o() {
        az(8, "verifier_id");
        return this.i;
    }

    public final String q() {
        az(9, BusinessInfoDatabaseConstants.BusinessInfoMetadataTableConstants.Columns.VERSION);
        return this.j;
    }

    public final String toString() {
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "RbmBusinessInfoTable -- REDACTED") : a();
    }
}
