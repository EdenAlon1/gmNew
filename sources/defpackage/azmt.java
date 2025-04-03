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
public class azmt extends dtro implements dtrq {
    public String c;
    public azon e;
    public String f;
    public String g;
    public azsu a = null;
    public azsu b = null;
    public boolean d = false;

    protected azmt() {
    }

    @Override // defpackage.dtro
    public final String a() {
        return String.format(Locale.US, "MyIdentitiesTable [token: %s,\n  canonical_token: %s,\n  provisioning_id: %s,\n  is_verified: %s,\n  address_type: %s,\n  phone_number: %s,\n  display_name: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        int intValue = azoi.c().intValue();
        azsu azsuVar = this.a;
        if (azsuVar == null) {
            contentValues.putNull("token");
        } else {
            contentValues.put("token", azsv.b(azsuVar));
        }
        if (intValue >= 60530) {
            azsu azsuVar2 = this.b;
            if (azsuVar2 == null || azsuVar2.equals(null)) {
                contentValues.putNull("canonical_token");
            } else {
                contentValues.put("canonical_token", azsv.b(this.b));
            }
        }
        if (intValue >= 59990) {
            dtub.u(contentValues, "provisioning_id", this.c);
        }
        if (intValue >= 60320) {
            contentValues.put("is_verified", Boolean.valueOf(this.d));
        }
        if (intValue >= 59980) {
            azon azonVar = this.e;
            if (azonVar == null) {
                contentValues.putNull("address_type");
            } else {
                contentValues.put("address_type", Integer.valueOf(azonVar.ordinal()));
            }
        }
        dtub.u(contentValues, "phone_number", this.f);
        if (intValue >= 60120) {
            dtub.u(contentValues, "display_name", this.g);
        }
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        azny aznyVar = (azny) ((aznq) dtsuVar);
        aB();
        this.cL = aznyVar.cU();
        if (aznyVar.di(0)) {
            this.a = aznyVar.g();
            fY(0);
        }
        if (aznyVar.di(1)) {
            this.b = aznyVar.f();
            fY(1);
        }
        if (aznyVar.di(2)) {
            this.c = aznyVar.j();
            fY(2);
        }
        if (aznyVar.di(3)) {
            this.d = aznyVar.k();
            fY(3);
        }
        if (aznyVar.di(4)) {
            this.e = aznyVar.e();
            fY(4);
        }
        if (aznyVar.di(5)) {
            this.f = aznyVar.h();
            fY(5);
        }
        if (aznyVar.di(6)) {
            this.g = aznyVar.i();
            fY(6);
        }
    }

    public final azsu d() {
        az(0, "token");
        return this.a;
    }

    public final String e() {
        az(5, "phone_number");
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof azmt)) {
            return false;
        }
        azmt azmtVar = (azmt) obj;
        return super.aD(azmtVar.cL) && Objects.equals(this.a, azmtVar.a) && Objects.equals(this.b, azmtVar.b) && Objects.equals(this.c, azmtVar.c) && this.d == azmtVar.d && this.e == azmtVar.e && Objects.equals(this.f, azmtVar.f) && Objects.equals(this.g, azmtVar.g);
    }

    @Override // defpackage.dtrq
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "my_identities", dtub.m(new String[]{"token", "canonical_token", "provisioning_id", "is_verified", "address_type", "phone_number", "display_name"}));
    }

    @Override // defpackage.dtrq
    public final String g() {
        return null;
    }

    @Override // defpackage.dtrq
    public final String h() {
        return "my_identities";
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        dtsq dtsqVar2 = (dtsqVar == null || dtsqVar.b()) ? null : this.cL;
        azsu azsuVar = this.a;
        azsu azsuVar2 = this.b;
        String str = this.c;
        Boolean valueOf = Boolean.valueOf(this.d);
        azon azonVar = this.e;
        return Objects.hash(dtsqVar2, azsuVar, azsuVar2, str, valueOf, Integer.valueOf(azonVar == null ? 0 : azonVar.ordinal()), this.f, this.g, null);
    }

    @Override // defpackage.dtrq
    public final void i(StringBuilder sb, List list) {
        String b = azsv.b(this.a);
        Object obj = new azms(this).get();
        String str = this.c;
        Integer valueOf = Integer.valueOf(this.d ? 1 : 0);
        azon azonVar = this.e;
        Object[] objArr = {b, obj, str, valueOf, azonVar == null ? 0 : String.valueOf(azonVar.ordinal()), this.f, this.g};
        sb.append('(');
        for (int i = 0; i < 7; i++) {
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

    public final void k() {
        final dtve b = azoi.b();
        dtub.b(azoi.b(), "my_identities", this, new Function() { // from class: azmq
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Long.valueOf(dtve.this.S("my_identities", (ContentValues) obj));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Consumer() { // from class: azmr
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    public final String toString() {
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "MyIdentitiesTable -- REDACTED") : a();
    }
}
