package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
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
public class bsyh extends dtro implements dtrq {
    public String a;
    public aplf b;
    public Instant c = Instant.EPOCH;
    public Instant d = Instant.EPOCH;
    public long e;

    protected bsyh() {
    }

    @Override // defpackage.dtro
    public final String a() {
        return String.format(Locale.US, "EmergencySessionsTable [emergency_destination: %s,\n  type: %s,\n  start_timestamp: %s,\n  end_timestamp: %s,\n  refill_duration_ms: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        dtub.u(contentValues, "emergency_destination", this.a);
        aplf aplfVar = this.b;
        if (aplfVar == null) {
            contentValues.putNull(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE);
        } else {
            contentValues.put(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, Integer.valueOf(aplfVar.ordinal()));
        }
        Instant instant = this.c;
        if (instant == null) {
            contentValues.putNull("start_timestamp");
        } else {
            contentValues.put("start_timestamp", Long.valueOf(bdgw.a(instant)));
        }
        Instant instant2 = this.d;
        if (instant2 == null) {
            contentValues.putNull("end_timestamp");
        } else {
            contentValues.put("end_timestamp", Long.valueOf(bdgw.a(instant2)));
        }
        contentValues.put("refill_duration_ms", Long.valueOf(this.e));
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        bszd bszdVar = (bszd) ((bsyx) dtsuVar);
        aB();
        this.cL = bszdVar.cU();
        if (bszdVar.di(0)) {
            this.a = bszdVar.h();
            fY(0);
        }
        if (bszdVar.di(1)) {
            this.b = bszdVar.e();
            fY(1);
        }
        if (bszdVar.di(2)) {
            this.c = bszdVar.g();
            fY(2);
        }
        if (bszdVar.di(3)) {
            this.d = bszdVar.f();
            fY(3);
        }
        if (bszdVar.di(4)) {
            this.e = bszdVar.c();
            fY(4);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bsyh)) {
            return false;
        }
        bsyh bsyhVar = (bsyh) obj;
        return super.aD(bsyhVar.cL) && Objects.equals(this.a, bsyhVar.a) && this.b == bsyhVar.b && Objects.equals(this.c, bsyhVar.c) && Objects.equals(this.d, bsyhVar.d) && this.e == bsyhVar.e;
    }

    @Override // defpackage.dtrq
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "emergency_sessions", dtub.m(new String[]{"emergency_destination", BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, "start_timestamp", "end_timestamp", "refill_duration_ms"}));
    }

    @Override // defpackage.dtrq
    public final String g() {
        return null;
    }

    @Override // defpackage.dtrq
    public final String h() {
        return "emergency_sessions";
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        dtsq dtsqVar2 = (dtsqVar == null || dtsqVar.b()) ? null : this.cL;
        String str = this.a;
        aplf aplfVar = this.b;
        return Objects.hash(dtsqVar2, str, Integer.valueOf(aplfVar == null ? 0 : aplfVar.ordinal()), this.c, this.d, Long.valueOf(this.e), null);
    }

    @Override // defpackage.dtrq
    public final void i(StringBuilder sb, List list) {
        String str = this.a;
        aplf aplfVar = this.b;
        Object[] objArr = {str, aplfVar == null ? 0 : String.valueOf(aplfVar.ordinal()), Long.valueOf(bdgw.a(this.c)), Long.valueOf(bdgw.a(this.d)), Long.valueOf(this.e)};
        sb.append('(');
        for (int i = 0; i < 5; i++) {
            Object obj = objArr[i];
            if (obj instanceof Number) {
                sb.append(String.valueOf(obj));
            } else {
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (str2.length() < 12) {
                        sb.append(DatabaseUtils.sqlEscapeString(str2));
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

    public final long k() {
        az(4, "refill_duration_ms");
        return this.e;
    }

    public final aplf l() {
        az(1, BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE);
        return this.b;
    }

    public final Instant m() {
        az(3, "end_timestamp");
        return this.d;
    }

    public final Instant n() {
        az(2, "start_timestamp");
        return this.c;
    }

    public final String o() {
        az(0, "emergency_destination");
        return this.a;
    }

    public final void q(Function function) {
        Object apply;
        String[] strArr = bszm.a;
        apply = function.apply(new bszl());
        final bszk bszkVar = new bszk((bszl) apply);
        final dtve a = bszm.a();
        ((Boolean) a.q(new emyl() { // from class: bsyg
            @Override // defpackage.emyl
            public final Object get() {
                String[] strArr2 = bszm.a;
                bszj bszjVar = new bszj();
                ContentValues contentValues = bszjVar.a;
                bsyh bsyhVar = bsyh.this;
                dtub.u(contentValues, "emergency_destination", bsyhVar.o());
                aplf l = bsyhVar.l();
                if (l == null) {
                    bszjVar.a.putNull(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE);
                } else {
                    bszjVar.a.put(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, Integer.valueOf(l.ordinal()));
                }
                Instant n = bsyhVar.n();
                if (n == null) {
                    bszjVar.a.putNull("start_timestamp");
                } else {
                    bszjVar.a.put("start_timestamp", Long.valueOf(bdgw.a(n)));
                }
                Instant m = bsyhVar.m();
                if (m == null) {
                    bszjVar.a.putNull("end_timestamp");
                } else {
                    bszjVar.a.put("end_timestamp", Long.valueOf(bdgw.a(m)));
                }
                bszk bszkVar2 = bszkVar;
                bszjVar.a.put("refill_duration_ms", Long.valueOf(bsyhVar.k()));
                bszjVar.al();
                bszjVar.af(bszkVar2);
                bszjVar.an(new dtui("emergency_sessions", "-updateOrInsert-update"));
                if (bszjVar.a().e() != 0) {
                    return true;
                }
                final dtve dtveVar = a;
                return Boolean.valueOf(dtub.b(bszm.a(), "emergency_sessions", bsyhVar, new Function() { // from class: bsye
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function2) {
                        return Function$CC.$default$andThen(this, function2);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return Long.valueOf(dtve.this.R("emergency_sessions", (ContentValues) obj));
                    }

                    public final /* synthetic */ Function compose(Function function2) {
                        return Function$CC.$default$compose(this, function2);
                    }
                }, new Consumer() { // from class: bsyf
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                }) != -1);
            }
        })).booleanValue();
    }

    public final String toString() {
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "EmergencySessionsTable -- REDACTED") : a();
    }
}
