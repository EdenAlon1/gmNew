package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import defpackage.dtro;
import j$.time.Instant;
import j$.util.Objects;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bwjn extends dtro implements dtrq {
    public String c;
    public cjli f;
    public String g;
    public byte[] h;
    public cjlk a = null;
    public cjkh b = cjkh.a;
    public Instant d = Instant.EPOCH;
    public long e = 0;

    protected bwjn() {
    }

    @Override // defpackage.dtro
    public final String a() {
        Locale locale = Locale.US;
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.e);
        String valueOf6 = String.valueOf(this.f);
        String valueOf7 = String.valueOf(this.g);
        byte[] bArr = this.h;
        return String.format(locale, "PipelineWorkTable [work_id: %s,\n  pipeline_type: %s,\n  sequencing_key: %s,\n  insertion_timestamp: %s,\n  execution_attempt_count: %s,\n  execution_state: %s,\n  client_supplied_id: %s,\n  payload: %s\n]\n", valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, "BLOB".concat(String.valueOf(bArr != null ? String.valueOf(bArr.length) : "NULL")));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        cjlk cjlkVar = this.a;
        if (cjlkVar == null || cjlkVar.equals(null)) {
            contentValues.putNull("work_id");
        } else {
            contentValues.put("work_id", cjlv.b(this.a));
        }
        cjkh cjkhVar = this.b;
        if (cjkhVar == null) {
            contentValues.putNull("pipeline_type");
        } else {
            contentValues.put("pipeline_type", Long.valueOf(cjll.a(cjkhVar)));
        }
        dtub.u(contentValues, "sequencing_key", this.c);
        Instant instant = this.d;
        if (instant == null) {
            contentValues.putNull("insertion_timestamp");
        } else {
            contentValues.put("insertion_timestamp", Long.valueOf(bdgw.a(instant)));
        }
        contentValues.put("execution_attempt_count", Long.valueOf(this.e));
        cjli cjliVar = this.f;
        if (cjliVar == null) {
            contentValues.putNull("execution_state");
        } else {
            contentValues.put("execution_state", Integer.valueOf(cjliVar.ordinal()));
        }
        dtub.u(contentValues, "client_supplied_id", this.g);
        contentValues.put("payload", this.h);
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        bwku bwkuVar = (bwku) ((bwkl) dtsuVar);
        aB();
        this.cL = bwkuVar.cU();
        if (bwkuVar.di(0)) {
            this.a = bwkuVar.g();
            fY(0);
        }
        if (bwkuVar.di(1)) {
            this.b = bwkuVar.e();
            fY(1);
        }
        if (bwkuVar.di(2)) {
            this.c = bwkuVar.j();
            fY(2);
        }
        if (bwkuVar.di(3)) {
            this.d = bwkuVar.h();
            fY(3);
        }
        if (bwkuVar.di(4)) {
            this.e = bwkuVar.c();
            fY(4);
        }
        if (bwkuVar.di(5)) {
            this.f = bwkuVar.f();
            fY(5);
        }
        if (bwkuVar.di(6)) {
            this.g = bwkuVar.i();
            fY(6);
        }
        if (bwkuVar.di(7)) {
            this.h = bwkuVar.k();
            fY(7);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bwjn)) {
            return false;
        }
        bwjn bwjnVar = (bwjn) obj;
        return super.aD(bwjnVar.cL) && Objects.equals(this.a, bwjnVar.a) && Objects.equals(this.b, bwjnVar.b) && Objects.equals(this.c, bwjnVar.c) && Objects.equals(this.d, bwjnVar.d) && this.e == bwjnVar.e && this.f == bwjnVar.f && Objects.equals(this.g, bwjnVar.g) && Arrays.equals(this.h, bwjnVar.h);
    }

    @Override // defpackage.dtrq
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "pipeline_work", dtub.m(new String[]{"work_id", "pipeline_type", "sequencing_key", "insertion_timestamp", "execution_attempt_count", "execution_state", "client_supplied_id", "payload"}));
    }

    @Override // defpackage.dtrq
    public final String g() {
        return null;
    }

    @Override // defpackage.dtrq
    public final String h() {
        return "pipeline_work";
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        dtsq dtsqVar2 = (dtsqVar == null || dtsqVar.b()) ? null : this.cL;
        cjlk cjlkVar = this.a;
        cjkh cjkhVar = this.b;
        String str = this.c;
        Instant instant = this.d;
        Long valueOf = Long.valueOf(this.e);
        cjli cjliVar = this.f;
        return Objects.hash(dtsqVar2, cjlkVar, cjkhVar, str, instant, valueOf, Integer.valueOf(cjliVar == null ? 0 : cjliVar.ordinal()), this.g, Integer.valueOf(Arrays.hashCode(this.h)), null);
    }

    @Override // defpackage.dtrq
    public final void i(StringBuilder sb, List list) {
        Object obj = new bwjm(this).get();
        Long valueOf = Long.valueOf(cjll.a(this.b));
        String str = this.c;
        Long valueOf2 = Long.valueOf(bdgw.a(this.d));
        Long valueOf3 = Long.valueOf(this.e);
        cjli cjliVar = this.f;
        Object[] objArr = {obj, valueOf, str, valueOf2, valueOf3, cjliVar == null ? 0 : String.valueOf(cjliVar.ordinal()), this.g, this.h};
        sb.append('(');
        for (int i = 0; i < 8; i++) {
            Object obj2 = objArr[i];
            if (obj2 instanceof Number) {
                sb.append(String.valueOf(obj2));
            } else {
                if (obj2 instanceof String) {
                    String str2 = (String) obj2;
                    if (str2.length() < 12) {
                        sb.append(DatabaseUtils.sqlEscapeString(str2));
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
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "PipelineWorkTable -- REDACTED") : a();
    }
}
