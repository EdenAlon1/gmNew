package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import defpackage.dtro;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bcgm extends dtro implements dtrq {
    public long a;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public boolean h;
    public boolean i;
    public int j;
    public boolean k;
    public int l;
    public String m;
    public String q;
    public csgg r;
    public azsu b = null;
    public int n = -1;
    public int o = 0;
    public int p = 0;

    protected bcgm() {
    }

    @Override // defpackage.dtro
    public final String a() {
        return String.format(Locale.US, "BackupParticipantsTable [_id: %s,\n  my_identity_token_foreign_key: %s,\n  normalized_destination: %s,\n  send_destination: %s,\n  display_destination: %s,\n  first_name: %s,\n  full_name: %s,\n  is_self: %s,\n  blocked: %s,\n  participant_type: %s,\n  is_spam: %s,\n  is_spam_source: %s,\n  country_code: %s,\n  color_palette_index: %s,\n  color_type: %s,\n  extended_color: %s,\n  cms_id: %s,\n  cms_life_cycle: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g), String.valueOf(this.h), String.valueOf(this.i), String.valueOf(this.j), String.valueOf(this.k), String.valueOf(this.l), String.valueOf(this.m), String.valueOf(this.n), String.valueOf(this.o), String.valueOf(this.p), String.valueOf(this.q), String.valueOf(this.r));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        int intValue = bcjh.c().intValue();
        contentValues.put("_id", Long.valueOf(this.a));
        if (intValue >= 110) {
            azsu azsuVar = this.b;
            if (azsuVar == null || azsuVar.equals(null)) {
                contentValues.putNull("my_identity_token_foreign_key");
            } else {
                contentValues.put("my_identity_token_foreign_key", azsv.b(this.b));
            }
        }
        dtub.u(contentValues, "normalized_destination", this.c);
        dtub.u(contentValues, "send_destination", this.d);
        dtub.u(contentValues, "display_destination", this.e);
        dtub.u(contentValues, "first_name", this.f);
        dtub.u(contentValues, "full_name", this.g);
        contentValues.put("is_self", Boolean.valueOf(this.h));
        contentValues.put("blocked", Boolean.valueOf(this.i));
        contentValues.put("participant_type", Integer.valueOf(this.j));
        contentValues.put("is_spam", Boolean.valueOf(this.k));
        contentValues.put("is_spam_source", Integer.valueOf(this.l));
        dtub.u(contentValues, "country_code", this.m);
        contentValues.put("color_palette_index", Integer.valueOf(this.n));
        contentValues.put("color_type", Integer.valueOf(this.o));
        contentValues.put("extended_color", Integer.valueOf(this.p));
        dtub.u(contentValues, "cms_id", this.q);
        csgg csggVar = this.r;
        if (csggVar == null) {
            contentValues.putNull("cms_life_cycle");
        } else {
            contentValues.put("cms_life_cycle", Integer.valueOf(csggVar.ordinal()));
        }
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        bciw bciwVar = (bciw) ((bcid) dtsuVar);
        aB();
        this.cL = bciwVar.cU();
        if (bciwVar.di(0)) {
            this.a = bciwVar.i();
            fY(0);
        }
        if (bciwVar.di(1)) {
            this.b = bciwVar.j();
            fY(1);
        }
        if (bciwVar.di(2)) {
            this.c = bciwVar.q();
            fY(2);
        }
        if (bciwVar.di(3)) {
            this.d = bciwVar.r();
            fY(3);
        }
        if (bciwVar.di(4)) {
            this.e = bciwVar.n();
            fY(4);
        }
        if (bciwVar.di(5)) {
            this.f = bciwVar.o();
            fY(5);
        }
        if (bciwVar.di(6)) {
            this.g = bciwVar.p();
            fY(6);
        }
        if (bciwVar.di(7)) {
            this.h = bciwVar.t();
            fY(7);
        }
        if (bciwVar.di(8)) {
            this.i = bciwVar.s();
            fY(8);
        }
        if (bciwVar.di(9)) {
            this.j = bciwVar.h();
            fY(9);
        }
        if (bciwVar.di(10)) {
            this.k = bciwVar.u();
            fY(10);
        }
        if (bciwVar.di(11)) {
            this.l = bciwVar.g();
            fY(11);
        }
        if (bciwVar.di(12)) {
            this.m = bciwVar.m();
            fY(12);
        }
        if (bciwVar.di(13)) {
            this.n = bciwVar.c();
            fY(13);
        }
        if (bciwVar.di(14)) {
            this.o = bciwVar.e();
            fY(14);
        }
        if (bciwVar.di(15)) {
            this.p = bciwVar.f();
            fY(15);
        }
        if (bciwVar.di(16)) {
            this.q = bciwVar.l();
            fY(16);
        }
        if (bciwVar.di(17)) {
            this.r = bciwVar.k();
            fY(17);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bcgm)) {
            return false;
        }
        bcgm bcgmVar = (bcgm) obj;
        return super.aD(bcgmVar.cL) && this.a == bcgmVar.a && Objects.equals(this.b, bcgmVar.b) && Objects.equals(this.c, bcgmVar.c) && Objects.equals(this.d, bcgmVar.d) && Objects.equals(this.e, bcgmVar.e) && Objects.equals(this.f, bcgmVar.f) && Objects.equals(this.g, bcgmVar.g) && this.h == bcgmVar.h && this.i == bcgmVar.i && this.j == bcgmVar.j && this.k == bcgmVar.k && this.l == bcgmVar.l && Objects.equals(this.m, bcgmVar.m) && this.n == bcgmVar.n && this.o == bcgmVar.o && this.p == bcgmVar.p && Objects.equals(this.q, bcgmVar.q) && this.r == bcgmVar.r;
    }

    @Override // defpackage.dtrq
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "participants_backup", dtub.m(new String[]{"_id", "my_identity_token_foreign_key", "normalized_destination", "send_destination", "display_destination", "first_name", "full_name", "is_self", "blocked", "participant_type", "is_spam", "is_spam_source", "country_code", "color_palette_index", "color_type", "extended_color", "cms_id", "cms_life_cycle"}));
    }

    @Override // defpackage.dtrq
    public final String g() {
        return null;
    }

    @Override // defpackage.dtrq
    public final String h() {
        return "participants_backup";
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        dtsq dtsqVar2 = (dtsqVar == null || dtsqVar.b()) ? null : this.cL;
        Long valueOf = Long.valueOf(this.a);
        azsu azsuVar = this.b;
        String str = this.c;
        String str2 = this.d;
        String str3 = this.e;
        String str4 = this.f;
        String str5 = this.g;
        Boolean valueOf2 = Boolean.valueOf(this.h);
        Boolean valueOf3 = Boolean.valueOf(this.i);
        Integer valueOf4 = Integer.valueOf(this.j);
        Boolean valueOf5 = Boolean.valueOf(this.k);
        Integer valueOf6 = Integer.valueOf(this.l);
        String str6 = this.m;
        Integer valueOf7 = Integer.valueOf(this.n);
        dtsq dtsqVar3 = dtsqVar2;
        Integer valueOf8 = Integer.valueOf(this.o);
        Integer valueOf9 = Integer.valueOf(this.p);
        String str7 = this.q;
        csgg csggVar = this.r;
        return Objects.hash(dtsqVar3, valueOf, azsuVar, str, str2, str3, str4, str5, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, str6, valueOf7, valueOf8, valueOf9, str7, Integer.valueOf(csggVar == null ? 0 : csggVar.ordinal()), null);
    }

    @Override // defpackage.dtrq
    public final void i(StringBuilder sb, List list) {
        Long valueOf = Long.valueOf(this.a);
        Object obj = new bcgl(this).get();
        String str = this.c;
        String str2 = this.d;
        String str3 = this.e;
        String str4 = this.f;
        String str5 = this.g;
        Integer valueOf2 = Integer.valueOf(this.h ? 1 : 0);
        Integer valueOf3 = Integer.valueOf(this.i ? 1 : 0);
        Integer valueOf4 = Integer.valueOf(this.j);
        Integer valueOf5 = Integer.valueOf(this.k ? 1 : 0);
        Integer valueOf6 = Integer.valueOf(this.l);
        String str6 = this.m;
        Integer valueOf7 = Integer.valueOf(this.n);
        Integer valueOf8 = Integer.valueOf(this.o);
        Integer valueOf9 = Integer.valueOf(this.p);
        String str7 = this.q;
        csgg csggVar = this.r;
        Object[] objArr = {valueOf, obj, str, str2, str3, str4, str5, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, str6, valueOf7, valueOf8, valueOf9, str7, csggVar == null ? 0 : String.valueOf(csggVar.ordinal())};
        sb.append('(');
        for (int i = 0; i < 18; i++) {
            Object obj2 = objArr[i];
            if (obj2 instanceof Number) {
                sb.append(String.valueOf(obj2));
            } else {
                if (obj2 instanceof String) {
                    String str8 = (String) obj2;
                    if (str8.length() < 12) {
                        sb.append(DatabaseUtils.sqlEscapeString(str8));
                    }
                }
                list.add(obj2);
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

    public final String toString() {
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "BackupParticipantsTable -- REDACTED") : a();
    }
}
