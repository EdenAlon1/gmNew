package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import defpackage.dtro;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class ayjc extends dtro implements dtrq {
    public long a;
    public long b;
    public String c;
    public ConversationIdType d = bdgq.a;

    protected ayjc() {
    }

    @Override // defpackage.dtro
    public final String a() {
        return String.format(Locale.US, "ConversationMatcherCacheTable [_id: %s,\n  matcher_version: %s,\n  destination_key: %s,\n  conversation_id: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        contentValues.put("matcher_version", Long.valueOf(this.b));
        dtub.u(contentValues, "destination_key", this.c);
        ConversationIdType conversationIdType = this.d;
        if (conversationIdType == null || conversationIdType.equals(bdgq.a)) {
            contentValues.putNull("conversation_id");
        } else {
            contentValues.put("conversation_id", Long.valueOf(bdgq.a(this.d)));
        }
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        ayjw ayjwVar = (ayjw) ((ayjr) dtsuVar);
        aB();
        this.cL = ayjwVar.cU();
        if (ayjwVar.di(0)) {
            this.a = ayjwVar.e();
            fY(0);
        }
        if (ayjwVar.di(1)) {
            this.b = ayjwVar.f();
            fY(1);
        }
        if (ayjwVar.di(2)) {
            this.c = ayjwVar.h();
            fY(2);
        }
        if (ayjwVar.di(3)) {
            this.d = ayjwVar.g();
            fY(3);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ayjc)) {
            return false;
        }
        ayjc ayjcVar = (ayjc) obj;
        return super.aD(ayjcVar.cL) && this.a == ayjcVar.a && this.b == ayjcVar.b && Objects.equals(this.c, ayjcVar.c) && Objects.equals(this.d, ayjcVar.d);
    }

    @Override // defpackage.dtrq
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "conversation_matcher_cache", dtub.m(new String[]{"matcher_version", "destination_key", "conversation_id"}));
    }

    @Override // defpackage.dtrq
    public final String g() {
        return "_id";
    }

    @Override // defpackage.dtrq
    public final String h() {
        return "conversation_matcher_cache";
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        return Objects.hash((dtsqVar == null || dtsqVar.b()) ? null : this.cL, Long.valueOf(this.a), Long.valueOf(this.b), this.c, this.d, null);
    }

    @Override // defpackage.dtrq
    public final void i(StringBuilder sb, List list) {
        Object[] objArr = {Long.valueOf(this.b), this.c, new ayjb(this).get()};
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
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "ConversationMatcherCacheTable -- REDACTED") : a();
    }
}
