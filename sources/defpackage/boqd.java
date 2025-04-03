package defpackage;

import android.content.ContentValues;
import defpackage.dtro;
import j$.time.Instant;
import j$.util.Objects;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class boqd extends dtro {
    private String a;
    private String b;
    private String c;
    private byte[] h;
    private boolean d = false;
    private boolean e = false;
    private bdhd f = new bdhd(0);
    private Instant g = bdgw.b(0);
    private long i = 0;
    private Instant j = bdgw.b(0);
    private boolean k = false;

    protected boqd() {
    }

    @Override // defpackage.dtro
    public final String a() {
        Locale locale = Locale.US;
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.e);
        String valueOf6 = String.valueOf(this.f);
        String valueOf7 = String.valueOf(this.g);
        byte[] bArr = this.h;
        return String.format(locale, "RemoteInstancesView [remote_user_id_to_registration_id.remote_user_id_to_registration_id_remote_user_id: %s,\n  remote_user_id_to_registration_id.remote_user_id_to_registration_id_tachyon_registration_id: %s,\n  remote_registrations_table.remote_registrations_table_tachyon_registration_id: %s,\n  remote_registrations_table.remote_registrations_table_etouffee: %s,\n  remote_registrations_table.remote_registrations_table_better_etouffee: %s,\n  remote_registrations_table.remote_registrations_table_messages_feature_hash: %s,\n  remote_registrations_table.remote_registrations_table_last_modified_timestamp: %s,\n  remote_registrations_table.remote_registrations_table_identity_key: %s,\n  remote_registrations_table.remote_registrations_table_updated_at_hash: %s,\n  remote_registrations_table.remote_registrations_table_guaranteed_fresh_as_of_timestamp: %s,\n  remote_registrations_table.remote_registrations_table_is_updated_at_hash_valid: %s\n]\n", valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, "BLOB".concat(String.valueOf(bArr != null ? String.valueOf(bArr.length) : "NULL")), String.valueOf(this.i), String.valueOf(this.j), String.valueOf(this.k));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        borh.c().intValue();
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        borc borcVar = (borc) dtsuVar;
        aB();
        this.cL = borcVar.cU();
        if (borcVar.di(0)) {
            this.a = borcVar.getString(borcVar.cM(0, borh.a));
            fY(0);
        }
        if (borcVar.di(1)) {
            this.b = borcVar.getString(borcVar.cM(1, borh.a));
            fY(1);
        }
        if (borcVar.di(2)) {
            this.c = borcVar.getString(borcVar.cM(2, borh.a));
            fY(2);
        }
        if (borcVar.di(3)) {
            this.d = borcVar.getInt(borcVar.cM(3, borh.a)) == 1;
            fY(3);
        }
        if (borcVar.di(4)) {
            this.e = borcVar.getInt(borcVar.cM(4, borh.a)) == 1;
            fY(4);
        }
        if (borcVar.di(5)) {
            this.f = new bdhd(borcVar.getLong(borcVar.cM(5, borh.a)));
            fY(5);
        }
        if (borcVar.di(6)) {
            this.g = bdgw.b(borcVar.getLong(borcVar.cM(6, borh.a)));
            fY(6);
        }
        if (borcVar.di(7)) {
            this.h = borcVar.getBlob(borcVar.cM(7, borh.a));
            fY(7);
        }
        if (borcVar.di(8)) {
            this.i = borcVar.getLong(borcVar.cM(8, borh.a));
            fY(8);
        }
        if (borcVar.di(9)) {
            this.j = bdgw.b(borcVar.getLong(borcVar.cM(9, borh.a)));
            fY(9);
        }
        if (borcVar.di(10)) {
            this.k = borcVar.getInt(borcVar.cM(10, borh.a)) == 1;
            fY(10);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof boqd)) {
            return false;
        }
        boqd boqdVar = (boqd) obj;
        return super.aD(boqdVar.cL) && Objects.equals(this.a, boqdVar.a) && Objects.equals(this.b, boqdVar.b) && Objects.equals(this.c, boqdVar.c) && this.d == boqdVar.d && this.e == boqdVar.e && Objects.equals(this.f, boqdVar.f) && Objects.equals(this.g, boqdVar.g) && Arrays.equals(this.h, boqdVar.h) && this.i == boqdVar.i && Objects.equals(this.j, boqdVar.j) && this.k == boqdVar.k;
    }

    public final long f() {
        az(8, "updated_at_hash");
        return this.i;
    }

    public final String g() {
        az(0, "remote_user_id");
        return this.a;
    }

    public final String h() {
        az(2, "tachyon_registration_id");
        return this.c;
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        return Objects.hash((dtsqVar == null || dtsqVar.b()) ? null : this.cL, this.a, this.b, this.c, Boolean.valueOf(this.d), Boolean.valueOf(this.e), this.f, this.g, Integer.valueOf(Arrays.hashCode(this.h)), Long.valueOf(this.i), this.j, Boolean.valueOf(this.k), null);
    }

    public final String i() {
        az(1, "tachyon_registration_id");
        return this.b;
    }

    public final boolean j() {
        az(3, "etouffee");
        return this.d;
    }

    public final boolean k() {
        az(4, "better_etouffee");
        return this.e;
    }

    public final boolean l() {
        az(10, "is_updated_at_hash_valid");
        return this.k;
    }

    public final String toString() {
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "RemoteInstancesView -- REDACTED") : a();
    }
}
