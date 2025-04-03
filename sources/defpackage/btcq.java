package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequest;
import defpackage.dtro;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class btcq extends dtro implements dtrq {
    public long a;
    public long b = 0;
    public aliq c = aliq.b(0);
    public String d;

    protected btcq() {
    }

    @Override // defpackage.dtro
    public final String a() {
        return String.format(Locale.US, "EventsTable [_id: %s,\n  timestamp: %s,\n  event: %s,\n  data: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        contentValues.put("timestamp", Long.valueOf(this.b));
        aliq aliqVar = this.c;
        if (aliqVar == null) {
            contentValues.putNull("event");
        } else {
            contentValues.put("event", Integer.valueOf(aliqVar.p));
        }
        dtub.u(contentValues, GroupManagementRequest.DATA_TAG, this.d);
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        btdl btdlVar = (btdl) ((btdg) dtsuVar);
        aB();
        this.cL = btdlVar.cU();
        if (btdlVar.di(0)) {
            this.a = btdlVar.g();
            fY(0);
        }
        if (btdlVar.di(1)) {
            this.b = btdlVar.c();
            fY(1);
        }
        if (btdlVar.di(2)) {
            this.c = btdlVar.e();
            fY(2);
        }
        if (btdlVar.di(3)) {
            this.d = btdlVar.f();
            fY(3);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof btcq)) {
            return false;
        }
        btcq btcqVar = (btcq) obj;
        return super.aD(btcqVar.cL) && this.a == btcqVar.a && this.b == btcqVar.b && this.c == btcqVar.c && Objects.equals(this.d, btcqVar.d);
    }

    @Override // defpackage.dtrq
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "events", dtub.m(new String[]{"timestamp", "event", GroupManagementRequest.DATA_TAG}));
    }

    @Override // defpackage.dtrq
    public final String g() {
        return "_id";
    }

    @Override // defpackage.dtrq
    public final String h() {
        return "events";
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        return Objects.hash((dtsqVar == null || dtsqVar.b()) ? null : this.cL, Long.valueOf(this.a), Long.valueOf(this.b), this.c, this.d, null);
    }

    @Override // defpackage.dtrq
    public final void i(StringBuilder sb, List list) {
        Long valueOf = Long.valueOf(this.b);
        aliq aliqVar = this.c;
        Object[] objArr = {valueOf, aliqVar == null ? 0 : String.valueOf(aliqVar.p), this.d};
        sb.append('(');
        for (int i = 0; i < 3; i++) {
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
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "EventsTable -- REDACTED") : a();
    }
}
