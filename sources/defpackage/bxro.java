package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import defpackage.dtro;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bxro extends dtro implements dtrq {
    public String a;
    public String b;
    public String c;
    public int d;
    public int e;
    public String f;
    public int g = 0;
    public String h;
    public String i;

    protected bxro() {
    }

    @Override // defpackage.dtro
    public final String a() {
        return String.format(Locale.US, "SelfParticipantsTable [_id: %s,\n  phone_number: %s,\n  sim_serial_number: %s,\n  sim_slot_index: %s,\n  sub_id: %s,\n  subscription_name: %s,\n  subscription_color: %s,\n  participant_id: %s,\n  smsc: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g), String.valueOf(this.h), String.valueOf(this.i));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        int intValue = bxth.c().intValue();
        dtub.u(contentValues, "phone_number", this.b);
        dtub.u(contentValues, "sim_serial_number", this.c);
        contentValues.put("sim_slot_index", Integer.valueOf(this.d));
        contentValues.put("sub_id", Integer.valueOf(this.e));
        dtub.u(contentValues, "subscription_name", this.f);
        contentValues.put("subscription_color", Integer.valueOf(this.g));
        dtub.u(contentValues, "participant_id", this.h);
        if (intValue >= 29080) {
            dtub.u(contentValues, "smsc", this.i);
        }
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        bxsy bxsyVar = (bxsy) ((bxso) dtsuVar);
        aB();
        this.cL = bxsyVar.cU();
        if (bxsyVar.di(0)) {
            this.a = bxsyVar.i();
            fY(0);
        }
        if (bxsyVar.di(1)) {
            this.b = bxsyVar.k();
            fY(1);
        }
        if (bxsyVar.di(2)) {
            this.c = bxsyVar.l();
            fY(2);
        }
        if (bxsyVar.di(3)) {
            this.d = bxsyVar.f();
            fY(3);
        }
        if (bxsyVar.di(4)) {
            this.e = bxsyVar.g();
            fY(4);
        }
        if (bxsyVar.di(5)) {
            this.f = bxsyVar.m();
            fY(5);
        }
        if (bxsyVar.di(6)) {
            this.g = bxsyVar.h();
            fY(6);
        }
        if (bxsyVar.di(7)) {
            this.h = bxsyVar.j();
            fY(7);
        }
        if (bxsyVar.di(8)) {
            this.i = bxsyVar.e();
            fY(8);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bxro)) {
            return false;
        }
        bxro bxroVar = (bxro) obj;
        return super.aD(bxroVar.cL) && Objects.equals(this.a, bxroVar.a) && Objects.equals(this.b, bxroVar.b) && Objects.equals(this.c, bxroVar.c) && this.d == bxroVar.d && this.e == bxroVar.e && Objects.equals(this.f, bxroVar.f) && this.g == bxroVar.g && Objects.equals(this.h, bxroVar.h) && Objects.equals(this.i, bxroVar.i);
    }

    @Override // defpackage.dtrq
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "self_participants", dtub.m(new String[]{"phone_number", "sim_serial_number", "sim_slot_index", "sub_id", "subscription_name", "subscription_color", "participant_id", "smsc"}));
    }

    @Override // defpackage.dtrq
    public final String g() {
        return "_id";
    }

    @Override // defpackage.dtrq
    public final String h() {
        return "self_participants";
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        return Objects.hash((dtsqVar == null || dtsqVar.b()) ? null : this.cL, this.a, this.b, this.c, Integer.valueOf(this.d), Integer.valueOf(this.e), this.f, Integer.valueOf(this.g), this.h, this.i, null);
    }

    @Override // defpackage.dtrq
    public final void i(StringBuilder sb, List list) {
        Object[] objArr = {this.b, this.c, Integer.valueOf(this.d), Integer.valueOf(this.e), this.f, Integer.valueOf(this.g), this.h, this.i};
        sb.append('(');
        for (int i = 0; i < 8; i++) {
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

    public final int k() {
        az(3, "sim_slot_index");
        return this.d;
    }

    public final int l() {
        az(4, "sub_id");
        return this.e;
    }

    public final String m() {
        az(0, "_id");
        return this.a;
    }

    public final String n() {
        az(2, "sim_serial_number");
        return this.c;
    }

    public final String toString() {
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "SelfParticipantsTable -- REDACTED") : a();
    }
}
