package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import defpackage.dtro;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bqld extends dtro implements dtrq {
    public long a;
    public long b;
    public long c;
    public bqmn d = bqmn.a;
    public long e;

    protected bqld() {
    }

    @Override // defpackage.dtro
    public final String a() {
        return String.format(Locale.US, "CmsDeletedMessagesBufferTable [_id: %s,\n  message_id: %s,\n  conversation_id: %s,\n  message_deletion_reason: %s,\n  deletion_timestamp: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        contentValues.put("message_id", Long.valueOf(this.b));
        contentValues.put("conversation_id", Long.valueOf(this.c));
        bqmn bqmnVar = this.d;
        if (bqmnVar == null) {
            contentValues.putNull("message_deletion_reason");
        } else {
            contentValues.put("message_deletion_reason", Integer.valueOf(bqmnVar.ordinal()));
        }
        contentValues.put("deletion_timestamp", Long.valueOf(this.e));
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        bqmb bqmbVar = (bqmb) ((bqlv) dtsuVar);
        aB();
        this.cL = bqmbVar.cU();
        if (bqmbVar.di(0)) {
            this.a = bqmbVar.g();
            fY(0);
        }
        if (bqmbVar.di(1)) {
            this.b = bqmbVar.h();
            fY(1);
        }
        if (bqmbVar.di(2)) {
            this.c = bqmbVar.e();
            fY(2);
        }
        if (bqmbVar.di(3)) {
            this.d = bqmbVar.i();
            fY(3);
        }
        if (bqmbVar.di(4)) {
            this.e = bqmbVar.f();
            fY(4);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bqld)) {
            return false;
        }
        bqld bqldVar = (bqld) obj;
        return super.aD(bqldVar.cL) && this.a == bqldVar.a && this.b == bqldVar.b && this.c == bqldVar.c && this.d == bqldVar.d && this.e == bqldVar.e;
    }

    @Override // defpackage.dtrq
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "cms_deleted_messages_buffer", dtub.m(new String[]{"message_id", "conversation_id", "message_deletion_reason", "deletion_timestamp"}));
    }

    @Override // defpackage.dtrq
    public final String g() {
        return "_id";
    }

    @Override // defpackage.dtrq
    public final String h() {
        return "cms_deleted_messages_buffer";
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        dtsq dtsqVar2 = (dtsqVar == null || dtsqVar.b()) ? null : this.cL;
        Long valueOf = Long.valueOf(this.a);
        Long valueOf2 = Long.valueOf(this.b);
        Long valueOf3 = Long.valueOf(this.c);
        bqmn bqmnVar = this.d;
        return Objects.hash(dtsqVar2, valueOf, valueOf2, valueOf3, Integer.valueOf(bqmnVar == null ? 0 : bqmnVar.ordinal()), Long.valueOf(this.e), null);
    }

    @Override // defpackage.dtrq
    public final void i(StringBuilder sb, List list) {
        Long valueOf = Long.valueOf(this.b);
        Long valueOf2 = Long.valueOf(this.c);
        bqmn bqmnVar = this.d;
        Object[] objArr = {valueOf, valueOf2, bqmnVar == null ? 0 : String.valueOf(bqmnVar.ordinal()), Long.valueOf(this.e)};
        sb.append('(');
        for (int i = 0; i < 4; i++) {
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
        az(4, "deletion_timestamp");
        return this.e;
    }

    public final bqmn l() {
        az(3, "message_deletion_reason");
        return this.d;
    }

    public final String toString() {
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "CmsDeletedMessagesBufferTable -- REDACTED") : a();
    }
}
