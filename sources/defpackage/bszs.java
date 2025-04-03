package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import android.net.Uri;
import defpackage.dtro;
import j$.time.Instant;
import j$.util.Objects;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bszs extends dtro implements dtrq {
    public byte[] b;
    public byte[] c;
    public int d;
    public byte[] e;
    public byte[] f;
    public int g;
    public Uri i;
    public String j;
    public byte[] k;
    public byte[] l;
    public String m;
    public String o;
    public String p;
    public String q;
    public espe r;
    public bdhg a = bdhg.a;
    public Instant h = bdgw.b(0);
    public Instant n = Instant.EPOCH;

    protected bszs() {
    }

    @Override // defpackage.dtro
    public final String a() {
        Locale locale = Locale.US;
        String valueOf = String.valueOf(this.a);
        byte[] bArr = this.b;
        String concat = "BLOB".concat(String.valueOf(bArr != null ? String.valueOf(bArr.length) : "NULL"));
        byte[] bArr2 = this.c;
        String concat2 = "BLOB".concat(String.valueOf(bArr2 != null ? String.valueOf(bArr2.length) : "NULL"));
        String valueOf2 = String.valueOf(this.d);
        byte[] bArr3 = this.e;
        String concat3 = "BLOB".concat(String.valueOf(bArr3 != null ? String.valueOf(bArr3.length) : "NULL"));
        byte[] bArr4 = this.f;
        String concat4 = "BLOB".concat(String.valueOf(bArr4 != null ? String.valueOf(bArr4.length) : "NULL"));
        String valueOf3 = String.valueOf(this.g);
        String valueOf4 = String.valueOf(this.h);
        String valueOf5 = String.valueOf(this.i);
        String valueOf6 = String.valueOf(this.j);
        byte[] bArr5 = this.k;
        String concat5 = "BLOB".concat(String.valueOf(bArr5 != null ? String.valueOf(bArr5.length) : "NULL"));
        byte[] bArr6 = this.l;
        return String.format(locale, "EtouffeeRcsMetadataTable [rcs_message_id: %s,\n  preview_etouffee: %s,\n  preview_summary: %s,\n  preview_version: %s,\n  attachment_etouffee: %s,\n  attachment_summary: %s,\n  attachment_version: %s,\n  creation_timestamp: %s,\n  attachment_uri: %s,\n  custom_delivery_receipt_mime_type: %s,\n  custom_delivery_receipt_content: %s,\n  file_uploaded_xml_from_content_server: %s,\n  file_uploaded_fallback_uri: %s,\n  file_uploaded_expiry: %s,\n  plaintext_attachment_name: %s,\n  plaintext_attachment_content_type: %s,\n  plaintext_thumbnail_content_type: %s,\n  mls_file_info: %s\n]\n", valueOf, concat, concat2, valueOf2, concat3, concat4, valueOf3, valueOf4, valueOf5, valueOf6, concat5, "BLOB".concat(String.valueOf(bArr6 != null ? String.valueOf(bArr6.length) : "NULL")), String.valueOf(this.m), String.valueOf(this.n), String.valueOf(this.o), String.valueOf(this.p), String.valueOf(this.q), String.valueOf(this.r));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        int intValue = btck.c().intValue();
        bdhg bdhgVar = this.a;
        if (bdhgVar == null || bdhgVar.equals(bdhg.a)) {
            contentValues.putNull("rcs_message_id");
        } else {
            contentValues.put("rcs_message_id", bdhg.d(this.a));
        }
        contentValues.put("preview_etouffee", this.b);
        contentValues.put("preview_summary", this.c);
        contentValues.put("preview_version", Integer.valueOf(this.d));
        contentValues.put("attachment_etouffee", this.e);
        contentValues.put("attachment_summary", this.f);
        contentValues.put("attachment_version", Integer.valueOf(this.g));
        Instant instant = this.h;
        if (instant == null) {
            contentValues.putNull("creation_timestamp");
        } else {
            contentValues.put("creation_timestamp", Long.valueOf(bdgw.a(instant)));
        }
        if (intValue >= 35060) {
            Uri uri = this.i;
            if (uri == null) {
                contentValues.putNull("attachment_uri");
            } else {
                contentValues.put("attachment_uri", uri.toString());
            }
        }
        if (intValue >= 37020) {
            dtub.u(contentValues, "custom_delivery_receipt_mime_type", this.j);
        }
        if (intValue >= 37020) {
            contentValues.put("custom_delivery_receipt_content", this.k);
        }
        if (intValue >= 48010) {
            contentValues.put("file_uploaded_xml_from_content_server", this.l);
        }
        if (intValue >= 48010) {
            dtub.u(contentValues, "file_uploaded_fallback_uri", this.m);
        }
        if (intValue >= 48010) {
            Instant instant2 = this.n;
            if (instant2 == null) {
                contentValues.putNull("file_uploaded_expiry");
            } else {
                contentValues.put("file_uploaded_expiry", Long.valueOf(bdgw.a(instant2)));
            }
        }
        if (intValue >= 56020) {
            dtub.u(contentValues, "plaintext_attachment_name", this.o);
        }
        if (intValue >= 56020) {
            dtub.u(contentValues, "plaintext_attachment_content_type", this.p);
        }
        if (intValue >= 56020) {
            dtub.u(contentValues, "plaintext_thumbnail_content_type", this.q);
        }
        if (intValue >= 60700) {
            espe espeVar = this.r;
            if (espeVar == null) {
                contentValues.putNull("mls_file_info");
            } else {
                contentValues.put("mls_file_info", espeVar.toByteArray());
            }
        }
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        btcd btcdVar = (btcd) ((btbk) dtsuVar);
        aB();
        this.cL = btcdVar.cU();
        if (btcdVar.di(0)) {
            this.a = btcdVar.f();
            fY(0);
        }
        if (btcdVar.di(1)) {
            this.b = btcdVar.n();
            fY(1);
        }
        if (btcdVar.di(2)) {
            this.c = btcdVar.m();
            fY(2);
        }
        if (btcdVar.di(3)) {
            this.d = btcdVar.e();
            fY(3);
        }
        if (btcdVar.di(4)) {
            this.e = btcdVar.l();
            fY(4);
        }
        if (btcdVar.di(5)) {
            this.f = btcdVar.k();
            fY(5);
        }
        if (btcdVar.di(6)) {
            this.g = btcdVar.c();
            fY(6);
        }
        if (btcdVar.di(7)) {
            this.h = btcdVar.p();
            fY(7);
        }
        if (btcdVar.di(8)) {
            this.i = btcdVar.o();
            fY(8);
        }
        if (btcdVar.di(9)) {
            this.j = btcdVar.r();
            fY(9);
        }
        if (btcdVar.di(10)) {
            this.k = btcdVar.t();
            fY(10);
        }
        if (btcdVar.di(11)) {
            this.l = btcdVar.u();
            fY(11);
        }
        if (btcdVar.di(12)) {
            this.m = btcdVar.s();
            fY(12);
        }
        if (btcdVar.di(13)) {
            this.n = btcdVar.q();
            fY(13);
        }
        if (btcdVar.di(14)) {
            this.o = btcdVar.i();
            fY(14);
        }
        if (btcdVar.di(15)) {
            this.p = btcdVar.h();
            fY(15);
        }
        if (btcdVar.di(16)) {
            this.q = btcdVar.j();
            fY(16);
        }
        if (btcdVar.di(17)) {
            this.r = btcdVar.g();
            fY(17);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bszs)) {
            return false;
        }
        bszs bszsVar = (bszs) obj;
        return super.aD(bszsVar.cL) && Objects.equals(this.a, bszsVar.a) && Arrays.equals(this.b, bszsVar.b) && Arrays.equals(this.c, bszsVar.c) && this.d == bszsVar.d && Arrays.equals(this.e, bszsVar.e) && Arrays.equals(this.f, bszsVar.f) && this.g == bszsVar.g && Objects.equals(this.h, bszsVar.h) && Objects.equals(this.i, bszsVar.i) && Objects.equals(this.j, bszsVar.j) && Arrays.equals(this.k, bszsVar.k) && Arrays.equals(this.l, bszsVar.l) && Objects.equals(this.m, bszsVar.m) && Objects.equals(this.n, bszsVar.n) && Objects.equals(this.o, bszsVar.o) && Objects.equals(this.p, bszsVar.p) && Objects.equals(this.q, bszsVar.q) && Objects.equals(this.r, bszsVar.r);
    }

    @Override // defpackage.dtrq
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "etouffee_rcs_metadata", dtub.m(new String[]{"rcs_message_id", "preview_etouffee", "preview_summary", "preview_version", "attachment_etouffee", "attachment_summary", "attachment_version", "creation_timestamp", "attachment_uri", "custom_delivery_receipt_mime_type", "custom_delivery_receipt_content", "file_uploaded_xml_from_content_server", "file_uploaded_fallback_uri", "file_uploaded_expiry", "plaintext_attachment_name", "plaintext_attachment_content_type", "plaintext_thumbnail_content_type", "mls_file_info"}));
    }

    @Override // defpackage.dtrq
    public final String g() {
        return null;
    }

    @Override // defpackage.dtrq
    public final String h() {
        return "etouffee_rcs_metadata";
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        return Objects.hash((dtsqVar == null || dtsqVar.b()) ? null : this.cL, this.a, Integer.valueOf(Arrays.hashCode(this.b)), Integer.valueOf(Arrays.hashCode(this.c)), Integer.valueOf(this.d), Integer.valueOf(Arrays.hashCode(this.e)), Integer.valueOf(Arrays.hashCode(this.f)), Integer.valueOf(this.g), this.h, this.i, this.j, Integer.valueOf(Arrays.hashCode(this.k)), Integer.valueOf(Arrays.hashCode(this.l)), this.m, this.n, this.o, this.p, this.q, this.r, null);
    }

    @Override // defpackage.dtrq
    public final void i(StringBuilder sb, List list) {
        Object obj = new bszr(this).get();
        byte[] bArr = this.b;
        byte[] bArr2 = this.c;
        Integer valueOf = Integer.valueOf(this.d);
        byte[] bArr3 = this.e;
        byte[] bArr4 = this.f;
        Integer valueOf2 = Integer.valueOf(this.g);
        Long valueOf3 = Long.valueOf(bdgw.a(this.h));
        Uri uri = this.i;
        String uri2 = uri == null ? null : uri.toString();
        String str = this.j;
        byte[] bArr5 = this.k;
        byte[] bArr6 = this.l;
        String str2 = this.m;
        Long valueOf4 = Long.valueOf(bdgw.a(this.n));
        String str3 = this.o;
        String str4 = this.p;
        String str5 = this.q;
        espe espeVar = this.r;
        Object[] objArr = {obj, bArr, bArr2, valueOf, bArr3, bArr4, valueOf2, valueOf3, uri2, str, bArr5, bArr6, str2, valueOf4, str3, str4, str5, espeVar == null ? null : espeVar.toByteArray()};
        sb.append('(');
        for (int i = 0; i < 18; i++) {
            Object obj2 = objArr[i];
            if (obj2 instanceof Number) {
                sb.append(String.valueOf(obj2));
            } else {
                if (obj2 instanceof String) {
                    String str6 = (String) obj2;
                    if (str6.length() < 12) {
                        sb.append(DatabaseUtils.sqlEscapeString(str6));
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
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "EtouffeeRcsMetadataTable -- REDACTED") : a();
    }
}
