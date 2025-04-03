package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import defpackage.dtro;
import j$.time.Instant;
import j$.util.Objects;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bxgq extends dtro implements dtrq {
    public String a;
    public Instant b = bdgw.b(0);
    public Instant c = bdgw.b(0);

    protected bxgq() {
    }

    @Override // defpackage.dtro
    public final String a() {
        return String.format(Locale.US, "RemoteUserIdInfoTable [remote_user_id: %s,\n  last_modified_timestamp: %s,\n  guaranteed_fresh_as_of_timestamp: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        dtub.u(contentValues, "remote_user_id", this.a);
        Instant instant = this.b;
        if (instant == null) {
            contentValues.putNull("last_modified_timestamp");
        } else {
            contentValues.put("last_modified_timestamp", Long.valueOf(bdgw.a(instant)));
        }
        Instant instant2 = this.c;
        if (instant2 == null) {
            contentValues.putNull("guaranteed_fresh_as_of_timestamp");
        } else {
            contentValues.put("guaranteed_fresh_as_of_timestamp", Long.valueOf(bdgw.a(instant2)));
        }
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        bxhg bxhgVar = (bxhg) ((bxhc) dtsuVar);
        aB();
        this.cL = bxhgVar.cU();
        if (bxhgVar.di(0)) {
            this.a = bxhgVar.f();
            fY(0);
        }
        if (bxhgVar.di(1)) {
            this.b = bxhgVar.e();
            fY(1);
        }
        if (bxhgVar.di(2)) {
            this.c = bxhgVar.c();
            fY(2);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bxgq)) {
            return false;
        }
        bxgq bxgqVar = (bxgq) obj;
        return super.aD(bxgqVar.cL) && Objects.equals(this.a, bxgqVar.a) && Objects.equals(this.b, bxgqVar.b) && Objects.equals(this.c, bxgqVar.c);
    }

    @Override // defpackage.dtrq
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "remote_user_id_info_table", dtub.m(new String[]{"remote_user_id", "last_modified_timestamp", "guaranteed_fresh_as_of_timestamp"}));
    }

    @Override // defpackage.dtrq
    public final String g() {
        return null;
    }

    @Override // defpackage.dtrq
    public final String h() {
        return "remote_user_id_info_table";
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        return Objects.hash((dtsqVar == null || dtsqVar.b()) ? null : this.cL, this.a, this.b, this.c, null);
    }

    @Override // defpackage.dtrq
    public final void i(StringBuilder sb, List list) {
        Object[] objArr = {this.a, Long.valueOf(bdgw.a(this.b)), Long.valueOf(bdgw.a(this.c))};
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

    public final Instant k() {
        az(2, "guaranteed_fresh_as_of_timestamp");
        return this.c;
    }

    public final String l() {
        az(0, "remote_user_id");
        return this.a;
    }

    @Deprecated
    public final void m() {
        final dtve b = bxhr.b();
        dtub.b(bxhr.b(), "remote_user_id_info_table", this, new Function() { // from class: bxgo
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Long.valueOf(dtve.this.T("remote_user_id_info_table", (ContentValues) obj, 5));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Consumer() { // from class: bxgp
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    public final String toString() {
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "RemoteUserIdInfoTable -- REDACTED") : a();
    }
}
