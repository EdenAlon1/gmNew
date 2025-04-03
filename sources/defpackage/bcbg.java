package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import defpackage.dtro;
import j$.util.Objects;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bcbg extends dtro implements dtrq {
    public long a;
    public String c;
    public String e;
    public double h;
    public double i;
    public String j;
    public byte[] k;
    public byte[] l;
    public String m;
    public String n;
    public long o;
    public MessageIdType b = bdhb.a;
    public int d = 13;
    public int f = -1;
    public int g = -1;

    protected bcbg() {
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
        String valueOf8 = String.valueOf(this.h);
        String valueOf9 = String.valueOf(this.i);
        String valueOf10 = String.valueOf(this.j);
        byte[] bArr = this.k;
        String concat = "BLOB".concat(String.valueOf(bArr != null ? String.valueOf(bArr.length) : "NULL"));
        byte[] bArr2 = this.l;
        return String.format(locale, "BackupPartsTable [_id: %s,\n  message_id: %s,\n  content_type: %s,\n  source: %s,\n  text: %s,\n  width: %s,\n  height: %s,\n  longitude: %s,\n  latitude: %s,\n  cms_full_size_blob_id: %s,\n  cms_media_encryption_key: %s,\n  cms_compressed_media_encryption_key: %s,\n  cms_compressed_blob_id: %s,\n  file_name: %s,\n  duration: %s\n]\n", valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, valueOf8, valueOf9, valueOf10, concat, "BLOB".concat(String.valueOf(bArr2 != null ? String.valueOf(bArr2.length) : "NULL")), String.valueOf(this.m), String.valueOf(this.n), String.valueOf(this.o));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        int intValue = bcds.c().intValue();
        contentValues.put("_id", Long.valueOf(this.a));
        MessageIdType messageIdType = this.b;
        if (messageIdType == null || messageIdType.equals(bdhb.a)) {
            contentValues.putNull("message_id");
        } else {
            contentValues.put("message_id", Long.valueOf(bdhb.a(this.b)));
        }
        dtub.u(contentValues, "content_type", this.c);
        if (intValue >= 10) {
            contentValues.put("source", Integer.valueOf(this.d));
        }
        dtub.u(contentValues, ConversationSuggestion.SUGGESTION_PROPERTY_TEXT, this.e);
        contentValues.put("width", Integer.valueOf(this.f));
        contentValues.put("height", Integer.valueOf(this.g));
        contentValues.put("longitude", Double.valueOf(this.h));
        contentValues.put("latitude", Double.valueOf(this.i));
        dtub.u(contentValues, "cms_full_size_blob_id", this.j);
        contentValues.put("cms_media_encryption_key", this.k);
        contentValues.put("cms_compressed_media_encryption_key", this.l);
        dtub.u(contentValues, "cms_compressed_blob_id", this.m);
        if (intValue >= 100) {
            dtub.u(contentValues, "file_name", this.n);
        }
        if (intValue >= 130) {
            contentValues.put("duration", Long.valueOf(this.o));
        }
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        bcdh bcdhVar = (bcdh) ((bccr) dtsuVar);
        aB();
        this.cL = bcdhVar.cU();
        if (bcdhVar.di(0)) {
            this.a = bcdhVar.j();
            fY(0);
        }
        if (bcdhVar.di(1)) {
            this.b = bcdhVar.k();
            fY(1);
        }
        if (bcdhVar.di(2)) {
            this.c = bcdhVar.n();
            fY(2);
        }
        if (bcdhVar.di(3)) {
            this.d = bcdhVar.g();
            fY(3);
        }
        if (bcdhVar.di(4)) {
            this.e = bcdhVar.p();
            fY(4);
        }
        if (bcdhVar.di(5)) {
            this.f = bcdhVar.h();
            fY(5);
        }
        if (bcdhVar.di(6)) {
            this.g = bcdhVar.f();
            fY(6);
        }
        if (bcdhVar.di(7)) {
            this.h = bcdhVar.e();
            fY(7);
        }
        if (bcdhVar.di(8)) {
            this.i = bcdhVar.c();
            fY(8);
        }
        if (bcdhVar.di(9)) {
            this.j = bcdhVar.m();
            fY(9);
        }
        if (bcdhVar.di(10)) {
            this.k = bcdhVar.r();
            fY(10);
        }
        if (bcdhVar.di(11)) {
            this.l = bcdhVar.q();
            fY(11);
        }
        if (bcdhVar.di(12)) {
            this.m = bcdhVar.l();
            fY(12);
        }
        if (bcdhVar.di(13)) {
            this.n = bcdhVar.o();
            fY(13);
        }
        if (bcdhVar.di(14)) {
            this.o = bcdhVar.i();
            fY(14);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bcbg)) {
            return false;
        }
        bcbg bcbgVar = (bcbg) obj;
        return super.aD(bcbgVar.cL) && this.a == bcbgVar.a && Objects.equals(this.b, bcbgVar.b) && Objects.equals(this.c, bcbgVar.c) && this.d == bcbgVar.d && Objects.equals(this.e, bcbgVar.e) && this.f == bcbgVar.f && this.g == bcbgVar.g && this.h == bcbgVar.h && this.i == bcbgVar.i && Objects.equals(this.j, bcbgVar.j) && Arrays.equals(this.k, bcbgVar.k) && Arrays.equals(this.l, bcbgVar.l) && Objects.equals(this.m, bcbgVar.m) && Objects.equals(this.n, bcbgVar.n) && this.o == bcbgVar.o;
    }

    @Override // defpackage.dtrq
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "parts_backup", dtub.m(new String[]{"_id", "message_id", "content_type", "source", ConversationSuggestion.SUGGESTION_PROPERTY_TEXT, "width", "height", "longitude", "latitude", "cms_full_size_blob_id", "cms_media_encryption_key", "cms_compressed_media_encryption_key", "cms_compressed_blob_id", "file_name", "duration"}));
    }

    @Override // defpackage.dtrq
    public final String g() {
        return null;
    }

    @Override // defpackage.dtrq
    public final String h() {
        return "parts_backup";
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        return Objects.hash((dtsqVar == null || dtsqVar.b()) ? null : this.cL, Long.valueOf(this.a), this.b, this.c, Integer.valueOf(this.d), this.e, Integer.valueOf(this.f), Integer.valueOf(this.g), Double.valueOf(this.h), Double.valueOf(this.i), this.j, Integer.valueOf(Arrays.hashCode(this.k)), Integer.valueOf(Arrays.hashCode(this.l)), this.m, this.n, Long.valueOf(this.o), null);
    }

    @Override // defpackage.dtrq
    public final void i(StringBuilder sb, List list) {
        Object[] objArr = {Long.valueOf(this.a), new bcbf(this).get(), this.c, Integer.valueOf(this.d), this.e, Integer.valueOf(this.f), Integer.valueOf(this.g), Double.valueOf(this.h), Double.valueOf(this.i), this.j, this.k, this.l, this.m, this.n, Long.valueOf(this.o)};
        sb.append('(');
        for (int i = 0; i < 15; i++) {
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
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "BackupPartsTable -- REDACTED") : a();
    }
}
