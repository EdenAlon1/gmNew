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
public class bums extends dtro<bunm, buny, bunz, bums, bunl> implements dtrq<Long> {
    public long a;
    public String b;
    public long c = 0;
    public int d = 0;
    public aliu e;
    public String f;

    protected bums() {
    }

    @Override // defpackage.dtro
    public final String a() {
        return String.format(Locale.US, "MessageStatusTable [_id: %s,\n  message_id: %s,\n  timestamp: %s,\n  status: %s,\n  custom_status: %s,\n  data: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        dtub.u(contentValues, "message_id", this.b);
        contentValues.put("timestamp", Long.valueOf(this.c));
        contentValues.put("status", Integer.valueOf(this.d));
        aliu aliuVar = this.e;
        if (aliuVar == null) {
            contentValues.putNull("custom_status");
        } else {
            contentValues.put("custom_status", Integer.valueOf(aliuVar.ordinal()));
        }
        dtub.u(contentValues, GroupManagementRequest.DATA_TAG, this.f);
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        bunt buntVar = (bunt) ((bunm) dtsuVar);
        aB();
        this.cL = buntVar.cU();
        if (buntVar.di(0)) {
            this.a = buntVar.i();
            fY(0);
        }
        if (buntVar.di(1)) {
            this.b = buntVar.h();
            fY(1);
        }
        if (buntVar.di(2)) {
            this.c = buntVar.e();
            fY(2);
        }
        if (buntVar.di(3)) {
            this.d = buntVar.c();
            fY(3);
        }
        if (buntVar.di(4)) {
            this.e = buntVar.f();
            fY(4);
        }
        if (buntVar.di(5)) {
            this.f = buntVar.g();
            fY(5);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bums)) {
            return false;
        }
        bums bumsVar = (bums) obj;
        return super.aD(bumsVar.cL) && this.a == bumsVar.a && Objects.equals(this.b, bumsVar.b) && this.c == bumsVar.c && this.d == bumsVar.d && this.e == bumsVar.e && Objects.equals(this.f, bumsVar.f);
    }

    @Override // defpackage.dtrq
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "message_status", dtub.m(new String[]{"message_id", "timestamp", "status", "custom_status", GroupManagementRequest.DATA_TAG}));
    }

    @Override // defpackage.dtrq
    public final String g() {
        return "_id";
    }

    @Override // defpackage.dtrq
    public final String h() {
        return "message_status";
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        dtsq dtsqVar2 = (dtsqVar == null || dtsqVar.b()) ? null : this.cL;
        Long valueOf = Long.valueOf(this.a);
        String str = this.b;
        Long valueOf2 = Long.valueOf(this.c);
        Integer valueOf3 = Integer.valueOf(this.d);
        aliu aliuVar = this.e;
        return Objects.hash(dtsqVar2, valueOf, str, valueOf2, valueOf3, Integer.valueOf(aliuVar == null ? 0 : aliuVar.ordinal()), this.f, null);
    }

    @Override // defpackage.dtrq
    public final void i(StringBuilder sb, List list) {
        String str = this.b;
        Long valueOf = Long.valueOf(this.c);
        Integer valueOf2 = Integer.valueOf(this.d);
        aliu aliuVar = this.e;
        Object[] objArr = {str, valueOf, valueOf2, aliuVar == null ? 0 : String.valueOf(aliuVar.ordinal()), this.f};
        sb.append('(');
        for (int i = 0; i < 5; i++) {
            Object obj = objArr[i];
            if (obj instanceof Number) {
                sb.append(String.valueOf(obj));
            } else {
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (str2.length() < 12) {
                        sb.append(DatabaseUtils.sqlEscapeString(str2));
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
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "MessageStatusTable -- REDACTED") : a();
    }
}
