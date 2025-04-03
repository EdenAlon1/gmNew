package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import defpackage.dtro;
import j$.time.Instant;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bwif extends dtro implements dtrq {
    public long a;
    public Instant b = bdgw.b(0);
    public String c;
    public String d;

    protected bwif() {
    }

    @Override // defpackage.dtro
    public final String a() {
        return String.format(Locale.US, "PiiHashTable [_id: %s,\n  timestamp: %s,\n  hash_value: %s,\n  hash_key: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        Instant instant = this.b;
        if (instant == null) {
            contentValues.putNull("timestamp");
        } else {
            contentValues.put("timestamp", Long.valueOf(bdgw.a(instant)));
        }
        dtub.u(contentValues, "hash_value", this.c);
        dtub.u(contentValues, "hash_key", this.d);
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        bwiy bwiyVar = (bwiy) ((bwit) dtsuVar);
        aB();
        this.cL = bwiyVar.cU();
        if (bwiyVar.di(0)) {
            this.a = bwiyVar.f();
            fY(0);
        }
        if (bwiyVar.di(1)) {
            this.b = bwiyVar.g();
            fY(1);
        }
        if (bwiyVar.di(2)) {
            this.c = bwiyVar.e();
            fY(2);
        }
        if (bwiyVar.di(3)) {
            this.d = bwiyVar.c();
            fY(3);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bwif)) {
            return false;
        }
        bwif bwifVar = (bwif) obj;
        return super.aD(bwifVar.cL) && this.a == bwifVar.a && Objects.equals(this.b, bwifVar.b) && Objects.equals(this.c, bwifVar.c) && Objects.equals(this.d, bwifVar.d);
    }

    @Override // defpackage.dtrq
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "pii_hash", dtub.m(new String[]{"timestamp", "hash_value", "hash_key"}));
    }

    @Override // defpackage.dtrq
    public final String g() {
        return "_id";
    }

    @Override // defpackage.dtrq
    public final String h() {
        return "pii_hash";
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        return Objects.hash((dtsqVar == null || dtsqVar.b()) ? null : this.cL, Long.valueOf(this.a), this.b, this.c, this.d, null);
    }

    @Override // defpackage.dtrq
    public final void i(StringBuilder sb, List list) {
        Object[] objArr = {Long.valueOf(bdgw.a(this.b)), this.c, this.d};
        sb.append('(');
        for (int i = 0; i < 3; i++) {
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
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "PiiHashTable -- REDACTED") : a();
    }
}
