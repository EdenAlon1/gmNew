package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import defpackage.dtro;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bbpb extends dtro implements dtrq {
    public long a;
    public String c;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public MessageIdType b = bdhb.a;
    public long d = 0;

    protected bbpb() {
    }

    @Override // defpackage.dtro
    public final String a() {
        return String.format(Locale.US, "BackupLinkPreviewTable [_id: %s,\n  message_id: %s,\n  trigger_url: %s,\n  expiration_time_millis: %s,\n  link_title: %s,\n  link_description: %s,\n  link_image_url: %s,\n  link_domain: %s,\n  link_canonical_url: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g), String.valueOf(this.h), String.valueOf(this.i));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        MessageIdType messageIdType = this.b;
        if (messageIdType == null || messageIdType.equals(bdhb.a)) {
            contentValues.putNull("message_id");
        } else {
            contentValues.put("message_id", Long.valueOf(bdhb.a(this.b)));
        }
        dtub.u(contentValues, "trigger_url", this.c);
        contentValues.put("expiration_time_millis", Long.valueOf(this.d));
        dtub.u(contentValues, "link_title", this.e);
        dtub.u(contentValues, "link_description", this.f);
        dtub.u(contentValues, "link_image_url", this.g);
        dtub.u(contentValues, "link_domain", this.h);
        dtub.u(contentValues, "link_canonical_url", this.i);
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        bbqk bbqkVar = (bbqk) ((bbqa) dtsuVar);
        aB();
        this.cL = bbqkVar.cU();
        if (bbqkVar.di(0)) {
            this.a = bbqkVar.e();
            fY(0);
        }
        if (bbqkVar.di(1)) {
            this.b = bbqkVar.f();
            fY(1);
        }
        if (bbqkVar.di(2)) {
            this.c = bbqkVar.l();
            fY(2);
        }
        if (bbqkVar.di(3)) {
            this.d = bbqkVar.c();
            fY(3);
        }
        if (bbqkVar.di(4)) {
            this.e = bbqkVar.k();
            fY(4);
        }
        if (bbqkVar.di(5)) {
            this.f = bbqkVar.h();
            fY(5);
        }
        if (bbqkVar.di(6)) {
            this.g = bbqkVar.j();
            fY(6);
        }
        if (bbqkVar.di(7)) {
            this.h = bbqkVar.i();
            fY(7);
        }
        if (bbqkVar.di(8)) {
            this.i = bbqkVar.g();
            fY(8);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bbpb)) {
            return false;
        }
        bbpb bbpbVar = (bbpb) obj;
        return super.aD(bbpbVar.cL) && this.a == bbpbVar.a && Objects.equals(this.b, bbpbVar.b) && Objects.equals(this.c, bbpbVar.c) && this.d == bbpbVar.d && Objects.equals(this.e, bbpbVar.e) && Objects.equals(this.f, bbpbVar.f) && Objects.equals(this.g, bbpbVar.g) && Objects.equals(this.h, bbpbVar.h) && Objects.equals(this.i, bbpbVar.i);
    }

    @Override // defpackage.dtrq
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "link_preview_backup", dtub.m(new String[]{"message_id", "trigger_url", "expiration_time_millis", "link_title", "link_description", "link_image_url", "link_domain", "link_canonical_url"}));
    }

    @Override // defpackage.dtrq
    public final String g() {
        return "_id";
    }

    @Override // defpackage.dtrq
    public final String h() {
        return "link_preview_backup";
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        return Objects.hash((dtsqVar == null || dtsqVar.b()) ? null : this.cL, Long.valueOf(this.a), this.b, this.c, Long.valueOf(this.d), this.e, this.f, this.g, this.h, this.i, null);
    }

    @Override // defpackage.dtrq
    public final void i(StringBuilder sb, List list) {
        Object[] objArr = {new bbpa(this).get(), this.c, Long.valueOf(this.d), this.e, this.f, this.g, this.h, this.i};
        sb.append('(');
        for (int i = 0; i < 8; i++) {
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
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "BackupLinkPreviewTable -- REDACTED") : a();
    }
}
