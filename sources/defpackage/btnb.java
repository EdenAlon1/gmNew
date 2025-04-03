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
/* loaded from: classes7.dex */
public class btnb extends dtro implements dtrq {
    public String a;
    public long b;
    public long c = 0;

    protected btnb() {
    }

    @Override // defpackage.dtro
    public final String a() {
        return String.format(Locale.US, "LinkPreviewParticipantsTable [_id: %s,\n  participant_id: %s,\n  manual_link_preview_count: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        dtub.t(contentValues, "participant_id", this.b);
        contentValues.put("manual_link_preview_count", Long.valueOf(this.c));
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        btns btnsVar = (btns) ((btno) dtsuVar);
        aB();
        this.cL = btnsVar.cU();
        if (btnsVar.di(0)) {
            this.a = btnsVar.g();
            fY(0);
        }
        if (btnsVar.di(1)) {
            this.b = btnsVar.f();
            fY(1);
        }
        if (btnsVar.di(2)) {
            this.c = btnsVar.e();
            fY(2);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof btnb)) {
            return false;
        }
        btnb btnbVar = (btnb) obj;
        return super.aD(btnbVar.cL) && Objects.equals(this.a, btnbVar.a) && this.b == btnbVar.b && this.c == btnbVar.c;
    }

    @Override // defpackage.dtrq
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "link_preview_participants_table", dtub.m(new String[]{"participant_id", "manual_link_preview_count"}));
    }

    @Override // defpackage.dtrq
    public final String g() {
        return "_id";
    }

    @Override // defpackage.dtrq
    public final String h() {
        return "link_preview_participants_table";
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        return Objects.hash((dtsqVar == null || dtsqVar.b()) ? null : this.cL, this.a, Long.valueOf(this.b), Long.valueOf(this.c), null);
    }

    @Override // defpackage.dtrq
    public final void i(StringBuilder sb, List list) {
        Object[] objArr = {Long.valueOf(this.b), Long.valueOf(this.c)};
        sb.append('(');
        for (int i = 0; i < 2; i++) {
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
        az(2, "manual_link_preview_count");
        return this.c;
    }

    @Deprecated
    public final Long l() {
        final dtve a = btob.a();
        return Long.valueOf(dtub.b(btob.a(), "link_preview_participants_table", this, new Function() { // from class: btmy
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Long.valueOf(dtve.this.R("link_preview_participants_table", (ContentValues) obj));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Consumer() { // from class: btmz
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                final Long l = (Long) obj;
                if (l.longValue() >= 0) {
                    btnb btnbVar = btnb.this;
                    btnbVar.a = (String) new dtuj() { // from class: btna
                        @Override // defpackage.dtuj
                        public final Object a() {
                            return String.valueOf(l);
                        }
                    }.a();
                    btnbVar.fY(0);
                }
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }));
    }

    public final String toString() {
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "LinkPreviewParticipantsTable -- REDACTED") : a();
    }
}
