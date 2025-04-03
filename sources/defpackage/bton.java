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
public class bton extends dtro implements dtrq {
    public long a;
    public String c;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public MessageIdType b = bdhb.a;
    public long d = 0;
    public boolean j = false;
    public boolean k = false;

    protected bton() {
    }

    @Override // defpackage.dtro
    public final String a() {
        return String.format(Locale.US, "LinkPreviewTable [_id: %s,\n  message_id: %s,\n  trigger_url: %s,\n  expiration_time_millis: %s,\n  link_title: %s,\n  link_description: %s,\n  link_image_url: %s,\n  link_domain: %s,\n  link_canonical_url: %s,\n  link_preview_prevented: %s,\n  link_preview_failed: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g), String.valueOf(this.h), String.valueOf(this.i), String.valueOf(this.j), String.valueOf(this.k));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        int intValue = btqq.d().intValue();
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
        if (intValue >= 21010) {
            contentValues.put("link_preview_prevented", Boolean.valueOf(this.j));
        }
        if (intValue >= 22020) {
            contentValues.put("link_preview_failed", Boolean.valueOf(this.k));
        }
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        btqe btqeVar = (btqe) ((btps) dtsuVar);
        aB();
        this.cL = btqeVar.cU();
        if (btqeVar.di(0)) {
            this.a = btqeVar.e();
            super.fY(0);
        }
        if (btqeVar.di(1)) {
            this.b = btqeVar.f();
            super.fY(1);
        }
        if (btqeVar.di(2)) {
            this.c = btqeVar.l();
            super.fY(2);
        }
        if (btqeVar.di(3)) {
            this.d = btqeVar.c();
            super.fY(3);
        }
        if (btqeVar.di(4)) {
            this.e = btqeVar.k();
            super.fY(4);
        }
        if (btqeVar.di(5)) {
            this.f = btqeVar.h();
            super.fY(5);
        }
        if (btqeVar.di(6)) {
            this.g = btqeVar.j();
            super.fY(6);
        }
        if (btqeVar.di(7)) {
            this.h = btqeVar.i();
            super.fY(7);
        }
        if (btqeVar.di(8)) {
            this.i = btqeVar.g();
            super.fY(8);
        }
        if (btqeVar.di(9)) {
            this.j = btqeVar.n();
            super.fY(9);
        }
        if (btqeVar.di(10)) {
            this.k = btqeVar.m();
            super.fY(10);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bton)) {
            return false;
        }
        bton btonVar = (bton) obj;
        return super.aD(btonVar.cL) && this.a == btonVar.a && Objects.equals(this.b, btonVar.b) && Objects.equals(this.c, btonVar.c) && this.d == btonVar.d && Objects.equals(this.e, btonVar.e) && Objects.equals(this.f, btonVar.f) && Objects.equals(this.g, btonVar.g) && Objects.equals(this.h, btonVar.h) && Objects.equals(this.i, btonVar.i) && this.j == btonVar.j && this.k == btonVar.k;
    }

    @Override // defpackage.dtrq
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "link_preview", dtub.m(new String[]{"message_id", "trigger_url", "expiration_time_millis", "link_title", "link_description", "link_image_url", "link_domain", "link_canonical_url", "link_preview_prevented", "link_preview_failed"}));
    }

    @Override // defpackage.dtro
    public final void fY(int i) {
        super.fY(0);
    }

    @Override // defpackage.dtrq
    public final String g() {
        return "_id";
    }

    @Override // defpackage.dtrq
    public final String h() {
        return "link_preview";
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        return Objects.hash((dtsqVar == null || dtsqVar.b()) ? null : this.cL, Long.valueOf(this.a), this.b, this.c, Long.valueOf(this.d), this.e, this.f, this.g, this.h, this.i, Boolean.valueOf(this.j), Boolean.valueOf(this.k), null);
    }

    @Override // defpackage.dtrq
    public final void i(StringBuilder sb, List list) {
        Object[] objArr = {new btom(this).get(), this.c, Long.valueOf(this.d), this.e, this.f, this.g, this.h, this.i, Integer.valueOf(this.j ? 1 : 0), Integer.valueOf(this.k ? 1 : 0)};
        sb.append('(');
        for (int i = 0; i < 10; i++) {
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

    public final long k() {
        az(3, "expiration_time_millis");
        return this.d;
    }

    public final MessageIdType l() {
        az(1, "message_id");
        return this.b;
    }

    public final String m() {
        az(8, "link_canonical_url");
        return this.i;
    }

    public final String n() {
        az(5, "link_description");
        return this.f;
    }

    public final String o() {
        az(7, "link_domain");
        return this.h;
    }

    public final String q() {
        az(6, "link_image_url");
        return this.g;
    }

    public final String r() {
        az(4, "link_title");
        return this.e;
    }

    public final String s() {
        az(2, "trigger_url");
        return this.c;
    }

    public final /* synthetic */ void t(Long l) {
        if (l.longValue() >= 0) {
            this.a = new btoj(l).a.longValue();
            super.fY(0);
        }
    }

    public final String toString() {
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "LinkPreviewTable -- REDACTED") : a();
    }

    public final /* synthetic */ void u(Long l) {
        if (l.longValue() >= 0) {
            this.a = new btok(l).a.longValue();
            super.fY(0);
        }
    }

    public final boolean v() {
        az(10, "link_preview_failed");
        return this.k;
    }

    public final boolean w() {
        az(9, "link_preview_prevented");
        return this.j;
    }
}
