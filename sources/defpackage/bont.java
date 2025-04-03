package defpackage;

import android.content.ContentValues;
import com.google.android.ims.rcsservice.businessinfo.AgentUseCase;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import defpackage.dtro;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bont extends dtro {
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public long g;
    public String h;
    public String i;
    private String j;
    private String k;
    private String l;
    private AgentUseCase m = AgentUseCase.AGENT_USE_CASE_UNSPECIFIED;
    private String n;
    private String o;

    protected bont() {
    }

    @Override // defpackage.dtro
    public final String a() {
        return String.format(Locale.US, "RbmBusinessInfoAndVerifierInfoQuery [rbm_business_info.rbm_business_info_rbm_bot_id: %s,\n  rbm_business_info.rbm_business_info_display_name: %s,\n  rbm_business_info.rbm_business_info_logo_image_remote_url: %s,\n  rbm_business_info.rbm_business_info_logo_image_local_uri: %s,\n  rbm_business_info.rbm_business_info_description: %s,\n  rbm_business_info.rbm_business_info_color: %s,\n  rbm_business_info.rbm_business_info_hero_image_remote_url: %s,\n  rbm_business_info.rbm_business_info_hero_image_local_uri: %s,\n  rbm_business_info.rbm_business_info_version: %s,\n  rbm_business_info.rbm_business_info_expiry_milliseconds: %s,\n  rbm_business_info.rbm_business_info_agent_use_case_category: %s,\n  rbm_business_verifier_info.rbm_business_verifier_info_verifier_id: %s,\n  rbm_business_verifier_info.rbm_business_verifier_info_verifier_name: %s,\n  rbm_business_verifier_info.rbm_business_verifier_info_verifier_logo_image_remote_url: %s,\n  rbm_business_verifier_info.rbm_business_verifier_info_verifier_logo_image_local_uri: %s\n]\n", String.valueOf(this.j), String.valueOf(this.k), String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.l), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g), String.valueOf(this.m), String.valueOf(this.h), String.valueOf(this.n), String.valueOf(this.i), String.valueOf(this.o));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        bopg.c().intValue();
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        bopb bopbVar = (bopb) dtsuVar;
        aB();
        this.cL = bopbVar.cU();
        if (bopbVar.di(0)) {
            this.j = bopbVar.getString(bopbVar.cM(0, bopg.a));
            fY(0);
        }
        if (bopbVar.di(1)) {
            this.k = bopbVar.getString(bopbVar.cM(1, bopg.a));
            fY(1);
        }
        if (bopbVar.di(2)) {
            this.a = bopbVar.getString(bopbVar.cM(2, bopg.a));
            fY(2);
        }
        if (bopbVar.di(3)) {
            this.b = bopbVar.getString(bopbVar.cM(3, bopg.a));
            fY(3);
        }
        if (bopbVar.di(4)) {
            this.l = bopbVar.getString(bopbVar.cM(4, bopg.a));
            fY(4);
        }
        if (bopbVar.di(5)) {
            this.c = bopbVar.getString(bopbVar.cM(5, bopg.a));
            fY(5);
        }
        if (bopbVar.di(6)) {
            this.d = bopbVar.getString(bopbVar.cM(6, bopg.a));
            fY(6);
        }
        if (bopbVar.di(7)) {
            this.e = bopbVar.getString(bopbVar.cM(7, bopg.a));
            fY(7);
        }
        if (bopbVar.di(8)) {
            this.f = bopbVar.getString(bopbVar.cM(8, bopg.a));
            fY(8);
        }
        if (bopbVar.di(9)) {
            this.g = bopbVar.getLong(bopbVar.cM(9, bopg.a));
            fY(9);
        }
        if (bopbVar.di(10)) {
            AgentUseCase[] values = AgentUseCase.values();
            int i = bopbVar.getInt(bopbVar.cM(10, bopg.a));
            if (i >= values.length) {
                throw new IllegalArgumentException();
            }
            this.m = values[i];
            fY(10);
        }
        if (bopbVar.di(11)) {
            this.h = bopbVar.getString(bopbVar.cM(11, bopg.a));
            fY(11);
        }
        if (bopbVar.di(12)) {
            this.n = bopbVar.getString(bopbVar.cM(12, bopg.a));
            fY(12);
        }
        if (bopbVar.di(13)) {
            this.i = bopbVar.getString(bopbVar.cM(13, bopg.a));
            fY(13);
        }
        if (bopbVar.di(14)) {
            this.o = bopbVar.getString(bopbVar.cM(14, bopg.a));
            fY(14);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bont)) {
            return false;
        }
        bont bontVar = (bont) obj;
        return super.aD(bontVar.cL) && Objects.equals(this.j, bontVar.j) && Objects.equals(this.k, bontVar.k) && Objects.equals(this.a, bontVar.a) && Objects.equals(this.b, bontVar.b) && Objects.equals(this.l, bontVar.l) && Objects.equals(this.c, bontVar.c) && Objects.equals(this.d, bontVar.d) && Objects.equals(this.e, bontVar.e) && Objects.equals(this.f, bontVar.f) && this.g == bontVar.g && this.m == bontVar.m && Objects.equals(this.h, bontVar.h) && Objects.equals(this.n, bontVar.n) && Objects.equals(this.i, bontVar.i) && Objects.equals(this.o, bontVar.o);
    }

    public final AgentUseCase f() {
        az(10, "agent_use_case_category");
        return this.m;
    }

    public final String g() {
        az(4, "description");
        return this.l;
    }

    public final String h() {
        az(1, "display_name");
        return this.k;
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        dtsq dtsqVar2 = (dtsqVar == null || dtsqVar.b()) ? null : this.cL;
        String str = this.j;
        String str2 = this.k;
        String str3 = this.a;
        String str4 = this.b;
        String str5 = this.l;
        String str6 = this.c;
        String str7 = this.d;
        String str8 = this.e;
        String str9 = this.f;
        Long valueOf = Long.valueOf(this.g);
        AgentUseCase agentUseCase = this.m;
        return Objects.hash(dtsqVar2, str, str2, str3, str4, str5, str6, str7, str8, str9, valueOf, Integer.valueOf(agentUseCase == null ? 0 : agentUseCase.ordinal()), this.h, this.n, this.i, this.o, null);
    }

    public final String i() {
        az(0, "rbm_bot_id");
        return this.j;
    }

    public final String j() {
        az(14, BusinessInfoDatabaseConstants.BusinessInfoAndVerifierInfoViewConstants.Columns.VERIFIER_LOGO_IMAGE_LOCAL_URI);
        return this.o;
    }

    public final String k() {
        az(12, BusinessInfoDatabaseConstants.BusinessInfoAndVerifierInfoViewConstants.Columns.VERIFIER_NAME);
        return this.n;
    }

    public final String toString() {
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "RbmBusinessInfoAndVerifierInfoQuery -- REDACTED") : a();
    }
}
