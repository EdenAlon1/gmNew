package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import android.net.Uri;
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
public class awea extends dtro implements dtrq {
    public awap a = null;
    public awfr b;
    public Uri c;
    public awup d;
    public fayi e;
    public String f;
    public awvb g;
    public espg h;

    protected awea() {
    }

    @Override // defpackage.dtro
    public final String a() {
        return String.format(Locale.US, "FileProcessingTable [processing_id: %s,\n  file_type: %s,\n  file_uri: %s,\n  content_type: %s,\n  encryption_metadata: %s,\n  transfer_handle: %s,\n  upload_result: %s,\n  mls_file_metadata: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g), String.valueOf(this.h));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        int intValue = awfq.c().intValue();
        awap awapVar = this.a;
        if (awapVar == null || awapVar.equals(null)) {
            contentValues.putNull("processing_id");
        } else {
            contentValues.put("processing_id", awao.b(this.a));
        }
        awfr awfrVar = this.b;
        if (awfrVar == null) {
            contentValues.putNull("file_type");
        } else {
            contentValues.put("file_type", Integer.valueOf(awfrVar.ordinal()));
        }
        Uri uri = this.c;
        if (uri == null) {
            contentValues.putNull("file_uri");
        } else {
            contentValues.put("file_uri", uri.toString());
        }
        awup awupVar = this.d;
        if (awupVar == null) {
            contentValues.putNull("content_type");
        } else {
            contentValues.put("content_type", awupVar.toByteArray());
        }
        fayi fayiVar = this.e;
        if (fayiVar == null) {
            contentValues.putNull("encryption_metadata");
        } else {
            contentValues.put("encryption_metadata", fayiVar.toByteArray());
        }
        dtub.u(contentValues, "transfer_handle", this.f);
        awvb awvbVar = this.g;
        if (awvbVar == null) {
            contentValues.putNull("upload_result");
        } else {
            contentValues.put("upload_result", awvbVar.toByteArray());
        }
        if (intValue >= 60700) {
            espg espgVar = this.h;
            if (espgVar == null) {
                contentValues.putNull("mls_file_metadata");
            } else {
                contentValues.put("mls_file_metadata", espgVar.toByteArray());
            }
        }
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        awff awffVar = (awff) ((awew) dtsuVar);
        aB();
        this.cL = awffVar.cU();
        if (awffVar.di(0)) {
            this.a = awffVar.e();
            fY(0);
        }
        if (awffVar.di(1)) {
            this.b = awffVar.f();
            fY(1);
        }
        if (awffVar.di(2)) {
            this.c = awffVar.c();
            fY(2);
        }
        if (awffVar.di(3)) {
            this.d = awffVar.g();
            fY(3);
        }
        if (awffVar.di(4)) {
            this.e = awffVar.j();
            fY(4);
        }
        if (awffVar.di(5)) {
            this.f = awffVar.k();
            fY(5);
        }
        if (awffVar.di(6)) {
            this.g = awffVar.h();
            fY(6);
        }
        if (awffVar.di(7)) {
            this.h = awffVar.i();
            fY(7);
        }
    }

    public final Uri d() {
        az(2, "file_uri");
        return this.c;
    }

    public final awfr e() {
        az(1, "file_type");
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof awea)) {
            return false;
        }
        awea aweaVar = (awea) obj;
        return super.aD(aweaVar.cL) && Objects.equals(this.a, aweaVar.a) && Objects.equals(this.b, aweaVar.b) && Objects.equals(this.c, aweaVar.c) && Objects.equals(this.d, aweaVar.d) && Objects.equals(this.e, aweaVar.e) && Objects.equals(this.f, aweaVar.f) && Objects.equals(this.g, aweaVar.g) && Objects.equals(this.h, aweaVar.h);
    }

    @Override // defpackage.dtrq
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "file_processing", dtub.m(new String[]{"processing_id", "file_type", "file_uri", "content_type", "encryption_metadata", "transfer_handle", "upload_result", "mls_file_metadata"}));
    }

    @Override // defpackage.dtrq
    public final String g() {
        return null;
    }

    @Override // defpackage.dtrq
    public final String h() {
        return "file_processing";
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        return Objects.hash((dtsqVar == null || dtsqVar.b()) ? null : this.cL, this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, null);
    }

    @Override // defpackage.dtrq
    public final void i(StringBuilder sb, List list) {
        Object obj = new awdz(this).get();
        awfr awfrVar = this.b;
        Object valueOf = awfrVar == null ? 0 : String.valueOf(awfrVar.ordinal());
        Uri uri = this.c;
        String uri2 = uri == null ? null : uri.toString();
        awup awupVar = this.d;
        byte[] byteArray = awupVar == null ? null : awupVar.toByteArray();
        fayi fayiVar = this.e;
        byte[] byteArray2 = fayiVar == null ? null : fayiVar.toByteArray();
        String str = this.f;
        awvb awvbVar = this.g;
        byte[] byteArray3 = awvbVar == null ? null : awvbVar.toByteArray();
        espg espgVar = this.h;
        Object[] objArr = {obj, valueOf, uri2, byteArray, byteArray2, str, byteArray3, espgVar != null ? espgVar.toByteArray() : null};
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

    public final awup k() {
        az(3, "content_type");
        return this.d;
    }

    public final awvb l() {
        az(6, "upload_result");
        return this.g;
    }

    public final fayi m() {
        az(4, "encryption_metadata");
        return this.e;
    }

    public final String n() {
        az(5, "transfer_handle");
        return this.f;
    }

    public final boolean o(Function function) {
        Object apply;
        String[] strArr = awfq.a;
        apply = function.apply(new awfp());
        final awfo awfoVar = new awfo((awfp) apply);
        final dtve b = awfq.b();
        return ((Boolean) b.q(new emyl() { // from class: awdy
            @Override // defpackage.emyl
            public final Object get() {
                String[] strArr2 = awfq.a;
                awfn awfnVar = new awfn();
                awea aweaVar = awea.this;
                aweaVar.az(0, "processing_id");
                awap awapVar = aweaVar.a;
                if (awapVar == null || awapVar.equals(null)) {
                    awfnVar.a.putNull("processing_id");
                } else {
                    awfnVar.a.put("processing_id", awao.b(awapVar));
                }
                awfr e = aweaVar.e();
                if (e == null) {
                    awfnVar.a.putNull("file_type");
                } else {
                    awfnVar.a.put("file_type", Integer.valueOf(e.ordinal()));
                }
                awfnVar.e(aweaVar.d());
                awfnVar.c(aweaVar.k());
                awfnVar.d(aweaVar.m());
                awfnVar.f(aweaVar.n());
                awfnVar.g(aweaVar.l());
                aweaVar.az(7, "mls_file_metadata");
                espg espgVar = aweaVar.h;
                int intValue = awfq.c().intValue();
                int intValue2 = awfq.c().intValue();
                if (intValue2 < 60700) {
                    dtub.w("mls_file_metadata", intValue2);
                }
                if (intValue >= 60700) {
                    if (espgVar == null) {
                        awfnVar.a.putNull("mls_file_metadata");
                    } else {
                        awfnVar.a.put("mls_file_metadata", espgVar.toByteArray());
                    }
                }
                awfo awfoVar2 = awfoVar;
                awfnVar.al();
                awfnVar.af(awfoVar2);
                awfnVar.an(new dtui("file_processing", "-updateOrInsert-update"));
                if (awfnVar.a().e() != 0) {
                    return true;
                }
                final dtve dtveVar = b;
                return Boolean.valueOf(dtub.b(awfq.b(), "file_processing", aweaVar, new Function() { // from class: awdw
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function2) {
                        return Function$CC.$default$andThen(this, function2);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return Long.valueOf(dtve.this.R("file_processing", (ContentValues) obj));
                    }

                    public final /* synthetic */ Function compose(Function function2) {
                        return Function$CC.$default$compose(this, function2);
                    }
                }, new Consumer() { // from class: awdx
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
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "FileProcessingTable -- REDACTED") : a();
    }
}
