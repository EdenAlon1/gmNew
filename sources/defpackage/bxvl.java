package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequest;
import defpackage.dtro;
import j$.util.Objects;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bxvl extends dtro implements dtrq {
    public long a;
    public String b;
    public String c;
    public byte[] d;
    public long e = 0;

    protected bxvl() {
    }

    @Override // defpackage.dtro
    public final String a() {
        Locale locale = Locale.US;
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        byte[] bArr = this.d;
        return String.format(locale, "SettingsTable [_id: %s,\n  key: %s,\n  sub_key: %s,\n  data: %s,\n  last_modified_timestamp: %s\n]\n", valueOf, valueOf2, valueOf3, "BLOB".concat(String.valueOf(bArr != null ? String.valueOf(bArr.length) : "NULL")), String.valueOf(this.e));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        dtub.u(contentValues, "key", this.b);
        dtub.u(contentValues, "sub_key", this.c);
        contentValues.put(GroupManagementRequest.DATA_TAG, this.d);
        contentValues.put("last_modified_timestamp", Long.valueOf(this.e));
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        bxwh bxwhVar = (bxwh) ((bxwb) dtsuVar);
        aB();
        this.cL = bxwhVar.cU();
        if (bxwhVar.di(0)) {
            this.a = bxwhVar.c();
            fY(0);
        }
        if (bxwhVar.di(1)) {
            this.b = bxwhVar.f();
            fY(1);
        }
        if (bxwhVar.di(2)) {
            this.c = bxwhVar.g();
            fY(2);
        }
        if (bxwhVar.di(3)) {
            this.d = bxwhVar.h();
            fY(3);
        }
        if (bxwhVar.di(4)) {
            this.e = bxwhVar.e();
            fY(4);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bxvl)) {
            return false;
        }
        bxvl bxvlVar = (bxvl) obj;
        return super.aD(bxvlVar.cL) && this.a == bxvlVar.a && Objects.equals(this.b, bxvlVar.b) && Objects.equals(this.c, bxvlVar.c) && Arrays.equals(this.d, bxvlVar.d) && this.e == bxvlVar.e;
    }

    @Override // defpackage.dtrq
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "settings", dtub.m(new String[]{"key", "sub_key", GroupManagementRequest.DATA_TAG, "last_modified_timestamp"}));
    }

    @Override // defpackage.dtrq
    public final String g() {
        return "_id";
    }

    @Override // defpackage.dtrq
    public final String h() {
        return "settings";
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        return Objects.hash((dtsqVar == null || dtsqVar.b()) ? null : this.cL, Long.valueOf(this.a), this.b, this.c, Integer.valueOf(Arrays.hashCode(this.d)), Long.valueOf(this.e), null);
    }

    @Override // defpackage.dtrq
    public final void i(StringBuilder sb, List list) {
        Object[] objArr = {this.b, this.c, this.d, Long.valueOf(this.e)};
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

    public final String k() {
        az(2, "sub_key");
        return this.c;
    }

    public final byte[] l() {
        az(3, GroupManagementRequest.DATA_TAG);
        return this.d;
    }

    public final String toString() {
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "SettingsTable -- REDACTED") : a();
    }
}
