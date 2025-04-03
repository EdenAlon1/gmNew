package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import defpackage.dtro;
import j$.util.Objects;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class aztp extends dtro implements dtrq {
    public int a;
    public String b;
    public String c;
    public azsu d = null;
    public azsu e = null;

    protected aztp() {
    }

    @Override // defpackage.dtro
    public final String a() {
        return String.format(Locale.US, "SubscriptionsTable [sub_id: %s,\n  sim_serial_number: %s,\n  telephony_phone_number: %s,\n  my_identity_token: %s,\n  my_identity_token_with_foreign_key: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        int intValue = azuy.c().intValue();
        contentValues.put("sub_id", Integer.valueOf(this.a));
        dtub.u(contentValues, "sim_serial_number", this.b);
        dtub.u(contentValues, "telephony_phone_number", this.c);
        if (intValue >= 59450) {
            azsu azsuVar = this.d;
            if (azsuVar == null) {
                contentValues.putNull("my_identity_token");
            } else {
                contentValues.put("my_identity_token", azsv.b(azsuVar));
            }
        }
        if (intValue >= 60160) {
            azsu azsuVar2 = this.e;
            if (azsuVar2 == null || azsuVar2.equals(null)) {
                contentValues.putNull("my_identity_token_with_foreign_key");
            } else {
                contentValues.put("my_identity_token_with_foreign_key", azsv.b(this.e));
            }
        }
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        azuo azuoVar = (azuo) ((azui) dtsuVar);
        aB();
        this.cL = azuoVar.cU();
        if (azuoVar.di(0)) {
            this.a = azuoVar.c();
            fY(0);
        }
        if (azuoVar.di(1)) {
            this.b = azuoVar.g();
            fY(1);
        }
        if (azuoVar.di(2)) {
            this.c = azuoVar.h();
            fY(2);
        }
        if (azuoVar.di(3)) {
            this.d = azuoVar.e();
            fY(3);
        }
        if (azuoVar.di(4)) {
            this.e = azuoVar.f();
            fY(4);
        }
    }

    public final int d() {
        az(0, "sub_id");
        return this.a;
    }

    public final azsu e() {
        az(3, "my_identity_token");
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof aztp)) {
            return false;
        }
        aztp aztpVar = (aztp) obj;
        return super.aD(aztpVar.cL) && this.a == aztpVar.a && Objects.equals(this.b, aztpVar.b) && Objects.equals(this.c, aztpVar.c) && Objects.equals(this.d, aztpVar.d) && Objects.equals(this.e, aztpVar.e);
    }

    @Override // defpackage.dtrq
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "subscriptions", dtub.m(new String[]{"sub_id", "sim_serial_number", "telephony_phone_number", "my_identity_token", "my_identity_token_with_foreign_key"}));
    }

    @Override // defpackage.dtrq
    public final String g() {
        return null;
    }

    @Override // defpackage.dtrq
    public final String h() {
        return "subscriptions";
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        return Objects.hash((dtsqVar == null || dtsqVar.b()) ? null : this.cL, Integer.valueOf(this.a), this.b, this.c, this.d, this.e, null);
    }

    @Override // defpackage.dtrq
    public final void i(StringBuilder sb, List list) {
        Object[] objArr = {Integer.valueOf(this.a), this.b, this.c, azsv.b(this.d), new azto(this).get()};
        sb.append('(');
        for (int i = 0; i < 5; i++) {
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

    public final String k() {
        az(2, "telephony_phone_number");
        return this.c;
    }

    public final boolean l(Function function) {
        Object apply;
        String[] strArr = azuy.a;
        apply = function.apply(new azux());
        final azuw azuwVar = new azuw((azux) apply);
        final dtve b = azuy.b();
        return ((Boolean) b.q(new emyl() { // from class: aztl
            @Override // defpackage.emyl
            public final Object get() {
                String[] strArr2 = azuy.a;
                azuv azuvVar = new azuv();
                aztp aztpVar = aztp.this;
                azuvVar.f(aztpVar.k());
                azuvVar.d(aztpVar.e());
                aztpVar.az(4, "my_identity_token_with_foreign_key");
                azuvVar.e(aztpVar.e);
                azuvVar.al();
                azuvVar.af(azuwVar);
                azuvVar.an(new dtui("subscriptions", "-updateOrInsert-update"));
                if (azuvVar.c().e() != 0) {
                    return true;
                }
                final dtve dtveVar = b;
                return Boolean.valueOf(dtub.b(azuy.b(), "subscriptions", aztpVar, new Function() { // from class: aztm
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function2) {
                        return Function$CC.$default$andThen(this, function2);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return Long.valueOf(dtve.this.R("subscriptions", (ContentValues) obj));
                    }

                    public final /* synthetic */ Function compose(Function function2) {
                        return Function$CC.$default$compose(this, function2);
                    }
                }, new Consumer() { // from class: aztn
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
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "SubscriptionsTable -- REDACTED") : a();
    }
}
