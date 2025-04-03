package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import defpackage.dtro;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class btrw extends dtro<btsn, btsz, btta, btrw, btsm> implements dtrq<Long> {
    public String a;
    public ConversationIdType b = bdgq.a;
    public MessageIdType c = bdhb.a;
    public int d = 0;
    public fbuk e;

    protected btrw() {
    }

    @Override // defpackage.dtro
    public final String a() {
        return String.format(Locale.US, "MessageAnnotationsTable [_id: %s,\n  conversation_id: %s,\n  message_id: %s,\n  annotation_type: %s,\n  annotation_details: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        int intValue = bttf.d().intValue();
        ConversationIdType conversationIdType = this.b;
        if (conversationIdType == null) {
            contentValues.putNull("conversation_id");
        } else {
            contentValues.put("conversation_id", Long.valueOf(bdgq.a(conversationIdType)));
        }
        if (intValue >= 20040) {
            MessageIdType messageIdType = this.c;
            if (messageIdType == null || messageIdType.equals(bdhb.a)) {
                contentValues.putNull("message_id");
            } else {
                contentValues.put("message_id", Long.valueOf(bdhb.a(this.c)));
            }
        }
        contentValues.put("annotation_type", Integer.valueOf(this.d));
        fbuk fbukVar = this.e;
        if (fbukVar == null) {
            contentValues.putNull("annotation_details");
        } else {
            contentValues.put("annotation_details", fbukVar.toByteArray());
        }
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        btst btstVar = (btst) ((btsn) dtsuVar);
        aB();
        this.cL = btstVar.cU();
        if (btstVar.di(0)) {
            this.a = btstVar.e();
            fY(0);
        }
        if (btstVar.di(1)) {
            this.b = btstVar.g();
            fY(1);
        }
        if (btstVar.di(2)) {
            this.c = btstVar.h();
            fY(2);
        }
        if (btstVar.di(3)) {
            this.d = btstVar.f();
            fY(3);
        }
        if (btstVar.di(4)) {
            this.e = btstVar.i();
            fY(4);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof btrw)) {
            return false;
        }
        btrw btrwVar = (btrw) obj;
        return super.aD(btrwVar.cL) && Objects.equals(this.a, btrwVar.a) && Objects.equals(this.b, btrwVar.b) && Objects.equals(this.c, btrwVar.c) && this.d == btrwVar.d && Objects.equals(this.e, btrwVar.e);
    }

    @Override // defpackage.dtrq
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "messages_annotations", dtub.m(new String[]{"conversation_id", "message_id", "annotation_type", "annotation_details"}));
    }

    @Override // defpackage.dtrq
    public final String g() {
        return "_id";
    }

    @Override // defpackage.dtrq
    public final String h() {
        return "messages_annotations";
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        return Objects.hash((dtsqVar == null || dtsqVar.b()) ? null : this.cL, this.a, this.b, this.c, Integer.valueOf(this.d), this.e, null);
    }

    @Override // defpackage.dtrq
    public final void i(StringBuilder sb, List list) {
        Long valueOf = Long.valueOf(bdgq.a(this.b));
        Object obj = new btrv(this).get();
        Integer valueOf2 = Integer.valueOf(this.d);
        fbuk fbukVar = this.e;
        Object[] objArr = {valueOf, obj, valueOf2, fbukVar == null ? null : fbukVar.toByteArray()};
        sb.append('(');
        for (int i = 0; i < 4; i++) {
            Object obj2 = objArr[i];
            if (obj2 instanceof Number) {
                sb.append(String.valueOf(obj2));
            } else {
                if (obj2 instanceof String) {
                    String str = (String) obj2;
                    if (str.length() < 12) {
                        sb.append(DatabaseUtils.sqlEscapeString(str));
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

    public final int k() {
        az(3, "annotation_type");
        return this.d;
    }

    public final ConversationIdType l() {
        az(1, "conversation_id");
        return this.b;
    }

    public final MessageIdType m() {
        az(2, "message_id");
        return this.c;
    }

    public final fbuk n() {
        az(4, "annotation_details");
        return this.e;
    }

    public final String o() {
        az(0, "_id");
        return this.a;
    }

    public final String toString() {
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "MessageAnnotationsTable -- REDACTED") : a();
    }
}
