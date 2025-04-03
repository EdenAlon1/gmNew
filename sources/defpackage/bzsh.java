package defpackage;

import android.content.ContentValues;
import defpackage.dtro;
import j$.util.Objects;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bzsh extends dtro {
    public byte[] a;
    public String b;
    public String c;
    private String d;

    protected bzsh() {
    }

    @Override // defpackage.dtro
    public final String a() {
        Locale locale = Locale.US;
        String valueOf = String.valueOf(this.d);
        byte[] bArr = this.a;
        return String.format(locale, "IdentityKeyQuery [remote_registrations_table.remote_registrations_table_tachyon_registration_id: %s,\n  remote_registrations_table.remote_registrations_table_identity_key: %s,\n  remote_user_id_to_registration_id.remote_user_id_to_registration_id_remote_user_id: %s,\n  contacts.contacts_lookup_key: %s\n]\n", valueOf, "BLOB".concat(String.valueOf(bArr != null ? String.valueOf(bArr.length) : "NULL")), String.valueOf(this.b), String.valueOf(this.c));
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        bzus bzusVar = (bzus) dtsuVar;
        aB();
        this.cL = bzusVar.cU();
        if (bzusVar.di(0)) {
            this.d = bzusVar.getString(bzusVar.cM(0, bzux.a));
            fY(0);
        }
        if (bzusVar.di(1)) {
            this.a = bzusVar.getBlob(bzusVar.cM(1, bzux.a));
            fY(1);
        }
        if (bzusVar.di(2)) {
            this.b = bzusVar.getString(bzusVar.cM(2, bzux.a));
            fY(2);
        }
        if (bzusVar.di(3)) {
            this.c = bzusVar.getString(bzusVar.cM(3, bzux.a));
            fY(3);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bzsh)) {
            return false;
        }
        bzsh bzshVar = (bzsh) obj;
        return super.aD(bzshVar.cL) && Objects.equals(this.d, bzshVar.d) && Arrays.equals(this.a, bzshVar.a) && Objects.equals(this.b, bzshVar.b) && Objects.equals(this.c, bzshVar.c);
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        return Objects.hash((dtsqVar == null || dtsqVar.b()) ? null : this.cL, this.d, Integer.valueOf(Arrays.hashCode(this.a)), this.b, this.c, null);
    }

    public final String toString() {
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "IdentityKeyQuery -- REDACTED") : a();
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
    }
}
