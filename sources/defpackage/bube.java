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
public class bube extends dtro implements dtrq {
    public MessageIdType a = bdhb.a;
    public cjia b;

    protected bube() {
    }

    @Override // defpackage.dtro
    public final String a() {
        return String.format(Locale.US, "MessagePhotosSharingTable [message_id: %s,\n  sharing_state: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        MessageIdType messageIdType = this.a;
        if (messageIdType == null || messageIdType.equals(bdhb.a)) {
            contentValues.putNull("message_id");
        } else {
            contentValues.put("message_id", Long.valueOf(bdhb.a(this.a)));
        }
        cjia cjiaVar = this.b;
        if (cjiaVar == null) {
            contentValues.putNull("sharing_state");
        } else {
            contentValues.put("sharing_state", cjiaVar.toByteArray());
        }
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        bubs bubsVar = (bubs) ((bubp) dtsuVar);
        aB();
        this.cL = bubsVar.cU();
        if (bubsVar.di(0)) {
            this.a = bubsVar.c();
            fY(0);
        }
        if (bubsVar.di(1)) {
            this.b = bubsVar.e();
            fY(1);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bube)) {
            return false;
        }
        bube bubeVar = (bube) obj;
        return super.aD(bubeVar.cL) && Objects.equals(this.a, bubeVar.a) && Objects.equals(this.b, bubeVar.b);
    }

    @Override // defpackage.dtrq
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "message_photos_sharing", dtub.m(new String[]{"message_id", "sharing_state"}));
    }

    @Override // defpackage.dtrq
    public final String g() {
        return null;
    }

    @Override // defpackage.dtrq
    public final String h() {
        return "message_photos_sharing";
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        return Objects.hash((dtsqVar == null || dtsqVar.b()) ? null : this.cL, this.a, this.b, null);
    }

    @Override // defpackage.dtrq
    public final void i(StringBuilder sb, List list) {
        Object obj = new bubd(this).get();
        cjia cjiaVar = this.b;
        Object[] objArr = {obj, cjiaVar == null ? null : cjiaVar.toByteArray()};
        sb.append('(');
        for (int i = 0; i < 2; i++) {
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

    public final String toString() {
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "MessagePhotosSharingTable -- REDACTED") : a();
    }
}
