package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import defpackage.dtro;
import j$.util.Objects;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bqvj extends dtro implements dtrq {
    public byte[] b;
    public String d;
    public String e;
    public int a = 0;
    public int c = 0;

    protected bqvj() {
    }

    @Override // defpackage.dtro
    public final String a() {
        Locale locale = Locale.US;
        String valueOf = String.valueOf(this.a);
        byte[] bArr = this.b;
        return String.format(locale, "CmsTable [key_index: %s,\n  encryption_key: %s,\n  key_type: %s,\n  cms_correlation_id: %s,\n  cms_id: %s\n]\n", valueOf, "BLOB".concat(String.valueOf(bArr != null ? String.valueOf(bArr.length) : "NULL")), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        int intValue = bqws.c().intValue();
        contentValues.put("key_index", Integer.valueOf(this.a));
        contentValues.put("encryption_key", this.b);
        contentValues.put("key_type", Integer.valueOf(this.c));
        if (intValue >= 42060) {
            dtub.u(contentValues, "cms_correlation_id", this.d);
        }
        if (intValue >= 35020) {
            dtub.u(contentValues, "cms_id", this.e);
        }
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        bqwf bqwfVar = (bqwf) ((bqvz) dtsuVar);
        aB();
        this.cL = bqwfVar.cU();
        if (bqwfVar.di(0)) {
            this.a = bqwfVar.f();
            fY(0);
        }
        if (bqwfVar.di(1)) {
            this.b = bqwfVar.e();
            fY(1);
        }
        if (bqwfVar.di(2)) {
            this.c = bqwfVar.g();
            fY(2);
        }
        if (bqwfVar.di(3)) {
            this.d = bqwfVar.c();
            fY(3);
        }
        if (bqwfVar.di(4)) {
            this.e = bqwfVar.h();
            fY(4);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bqvj)) {
            return false;
        }
        bqvj bqvjVar = (bqvj) obj;
        return super.aD(bqvjVar.cL) && this.a == bqvjVar.a && Arrays.equals(this.b, bqvjVar.b) && this.c == bqvjVar.c && Objects.equals(this.d, bqvjVar.d) && Objects.equals(this.e, bqvjVar.e);
    }

    @Override // defpackage.dtrq
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "cms", dtub.m(new String[]{"key_index", "encryption_key", "key_type", "cms_correlation_id", "cms_id"}));
    }

    @Override // defpackage.dtrq
    public final String g() {
        return null;
    }

    @Override // defpackage.dtrq
    public final String h() {
        return "cms";
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        return Objects.hash((dtsqVar == null || dtsqVar.b()) ? null : this.cL, Integer.valueOf(this.a), Integer.valueOf(Arrays.hashCode(this.b)), Integer.valueOf(this.c), this.d, this.e, null);
    }

    @Override // defpackage.dtrq
    public final void i(StringBuilder sb, List list) {
        Object[] objArr = {Integer.valueOf(this.a), this.b, Integer.valueOf(this.c), this.d, this.e};
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

    public final int k() {
        az(0, "key_index");
        return this.a;
    }

    public final int l() {
        az(2, "key_type");
        return this.c;
    }

    public final Long m() {
        final dtve b = bqws.b();
        return Long.valueOf(dtub.b(bqws.b(), "cms", this, new Function() { // from class: bqvf
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Long.valueOf(dtve.this.S("cms", (ContentValues) obj));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Consumer() { // from class: bqvg
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }));
    }

    public final String n() {
        az(3, "cms_correlation_id");
        return this.d;
    }

    public final String o() {
        az(4, "cms_id");
        return this.e;
    }

    public final byte[] q() {
        az(1, "encryption_key");
        return this.b;
    }

    public final String toString() {
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "CmsTable -- REDACTED") : a();
    }
}
