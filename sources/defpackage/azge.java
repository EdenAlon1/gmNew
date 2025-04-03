package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import defpackage.dtro;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class azge extends dtro implements dtrq {
    public azcr a = null;
    public azcr b = null;

    protected azge() {
    }

    @Override // defpackage.dtro
    public final String a() {
        return String.format(Locale.US, "GroupMembersTable [group_token: %s,\n  destination_token: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        azcr azcrVar = this.a;
        if (azcrVar == null || azcrVar.equals(null)) {
            contentValues.putNull("group_token");
        } else {
            contentValues.put("group_token", azcs.b(this.a));
        }
        azcr azcrVar2 = this.b;
        if (azcrVar2 == null || azcrVar2.equals(null)) {
            contentValues.putNull("destination_token");
        } else {
            contentValues.put("destination_token", azcs.b(this.b));
        }
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        azgt azgtVar = (azgt) ((azgq) dtsuVar);
        aB();
        this.cL = azgtVar.cU();
        if (azgtVar.di(0)) {
            this.a = azgtVar.e();
            fY(0);
        }
        if (azgtVar.di(1)) {
            this.b = azgtVar.c();
            fY(1);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof azge)) {
            return false;
        }
        azge azgeVar = (azge) obj;
        return super.aD(azgeVar.cL) && Objects.equals(this.a, azgeVar.a) && Objects.equals(this.b, azgeVar.b);
    }

    @Override // defpackage.dtrq
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "group_members", dtub.m(new String[]{"group_token", "destination_token"}));
    }

    @Override // defpackage.dtrq
    public final String g() {
        return null;
    }

    @Override // defpackage.dtrq
    public final String h() {
        return "group_members";
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        return Objects.hash((dtsqVar == null || dtsqVar.b()) ? null : this.cL, this.a, this.b, null);
    }

    @Override // defpackage.dtrq
    public final void i(StringBuilder sb, List list) {
        Object[] objArr = {new azgc(this).get(), new azgd(this).get()};
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

    public final String toString() {
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "GroupMembersTable -- REDACTED") : a();
    }
}
