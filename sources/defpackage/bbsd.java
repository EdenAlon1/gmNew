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
public class bbsd extends dtro implements dtrq {
    public long a;
    public MessageIdType b;
    public cmrf c;
    public MessageIdType d;
    public cmrv e;
    public cmrl f;

    protected bbsd() {
        MessageIdType messageIdType = bdhb.a;
        this.b = messageIdType;
        this.d = messageIdType;
        this.e = cmrv.b(0);
    }

    @Override // defpackage.dtro
    public final String a() {
        return String.format(Locale.US, "BackupMessageReactionsTable [_id: %s,\n  message_id: %s,\n  reactions_data: %s,\n  reacted_message_id: %s,\n  reaction: %s,\n  applied_reaction: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        MessageIdType messageIdType = this.b;
        if (messageIdType == null || messageIdType.equals(bdhb.a)) {
            contentValues.putNull("message_id");
        } else {
            contentValues.put("message_id", Long.valueOf(bdhb.a(this.b)));
        }
        cmrf cmrfVar = this.c;
        if (cmrfVar == null) {
            contentValues.putNull("reactions_data");
        } else {
            contentValues.put("reactions_data", cmrfVar.toByteArray());
        }
        MessageIdType messageIdType2 = this.d;
        if (messageIdType2 == null || messageIdType2.equals(bdhb.a)) {
            contentValues.putNull("reacted_message_id");
        } else {
            contentValues.put("reacted_message_id", Long.valueOf(bdhb.a(this.d)));
        }
        cmrv cmrvVar = this.e;
        if (cmrvVar == null) {
            contentValues.putNull("reaction");
        } else {
            contentValues.put("reaction", Integer.valueOf(cmrvVar.a()));
        }
        cmrl cmrlVar = this.f;
        if (cmrlVar == null) {
            contentValues.putNull("applied_reaction");
        } else {
            contentValues.put("applied_reaction", cmrlVar.toByteArray());
        }
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        bbte bbteVar = (bbte) ((bbsx) dtsuVar);
        aB();
        this.cL = bbteVar.cU();
        if (bbteVar.di(0)) {
            this.a = bbteVar.c();
            fY(0);
        }
        if (bbteVar.di(1)) {
            this.b = bbteVar.e();
            fY(1);
        }
        if (bbteVar.di(2)) {
            this.c = bbteVar.g();
            fY(2);
        }
        if (bbteVar.di(3)) {
            this.d = bbteVar.f();
            fY(3);
        }
        if (bbteVar.di(4)) {
            this.e = bbteVar.i();
            fY(4);
        }
        if (bbteVar.di(5)) {
            this.f = bbteVar.h();
            fY(5);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bbsd)) {
            return false;
        }
        bbsd bbsdVar = (bbsd) obj;
        return super.aD(bbsdVar.cL) && this.a == bbsdVar.a && Objects.equals(this.b, bbsdVar.b) && Objects.equals(this.c, bbsdVar.c) && Objects.equals(this.d, bbsdVar.d) && this.e == bbsdVar.e && Objects.equals(this.f, bbsdVar.f);
    }

    @Override // defpackage.dtrq
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "message_reactions_backup", dtub.m(new String[]{"message_id", "reactions_data", "reacted_message_id", "reaction", "applied_reaction"}));
    }

    @Override // defpackage.dtrq
    public final String g() {
        return "_id";
    }

    @Override // defpackage.dtrq
    public final String h() {
        return "message_reactions_backup";
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        return Objects.hash((dtsqVar == null || dtsqVar.b()) ? null : this.cL, Long.valueOf(this.a), this.b, this.c, this.d, this.e, this.f, null);
    }

    @Override // defpackage.dtrq
    public final void i(StringBuilder sb, List list) {
        Object obj = new bbsb(this).get();
        cmrf cmrfVar = this.c;
        byte[] byteArray = cmrfVar == null ? null : cmrfVar.toByteArray();
        Object obj2 = new bbsc(this).get();
        cmrv cmrvVar = this.e;
        Object valueOf = cmrvVar == null ? 0 : String.valueOf(cmrvVar.a());
        cmrl cmrlVar = this.f;
        Object[] objArr = {obj, byteArray, obj2, valueOf, cmrlVar != null ? cmrlVar.toByteArray() : null};
        sb.append('(');
        for (int i = 0; i < 5; i++) {
            Object obj3 = objArr[i];
            if (obj3 instanceof Number) {
                sb.append(String.valueOf(obj3));
            } else {
                if (obj3 instanceof String) {
                    String str = (String) obj3;
                    if (str.length() < 12) {
                        sb.append(DatabaseUtils.sqlEscapeString(str));
                    }
                }
                list.add(obj3);
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
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "BackupMessageReactionsTable -- REDACTED") : a();
    }
}
