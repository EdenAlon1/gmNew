package defpackage;

import android.content.ContentValues;
import defpackage.dtro;
import j$.util.Objects;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class azqe extends dtro {
    public String c;
    public azon e;
    public String f;
    public int[] g;
    public String[] h;
    private String i;
    private long[] j;
    public azsu a = null;
    public azsu b = null;
    public boolean d = false;

    protected azqe() {
    }

    @Override // defpackage.dtro
    public final String a() {
        return String.format(Locale.US, "MyIdentitySubscriptionQuery [my_identities.my_identities_token: %s,\n  my_identities.my_identities_canonical_token: %s,\n  my_identities.my_identities_provisioning_id: %s,\n  my_identities.my_identities_is_verified: %s,\n  my_identities.my_identities_address_type: %s,\n  my_identities.my_identities_phone_number: %s,\n  my_identities.my_identities_display_name: %s,\n  subscriptions.subscriptions_sub_id: %s,\n  subscriptions.subscriptions_sim_serial_number: %s,\n  subscriptions.subscriptions_rowid: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.i), String.valueOf(this.f), aI(this.g), aL(this.h), aJ(this.j));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        azrn.c().intValue();
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        azri azriVar = (azri) dtsuVar;
        aB();
        this.cL = azriVar.cU();
        if (azriVar.di(0)) {
            this.a = azsv.a(azriVar.getString(azriVar.cM(0, azrn.a)));
            fY(0);
        }
        if (azriVar.di(1)) {
            this.b = azsv.a(azriVar.getString(azriVar.cM(1, azrn.a)));
            fY(1);
        }
        if (azriVar.di(2)) {
            this.c = azriVar.getString(azriVar.cM(2, azrn.a));
            fY(2);
        }
        if (azriVar.di(3)) {
            this.d = azriVar.getInt(azriVar.cM(3, azrn.a)) == 1;
            fY(3);
        }
        if (azriVar.di(4)) {
            azon[] values = azon.values();
            int i = azriVar.getInt(azriVar.cM(4, azrn.a));
            if (i >= values.length) {
                throw new IllegalArgumentException();
            }
            this.e = values[i];
            fY(4);
        }
        if (azriVar.di(5)) {
            this.i = azriVar.getString(azriVar.cM(5, azrn.a));
            fY(5);
        }
        if (azriVar.di(6)) {
            this.f = azriVar.getString(azriVar.cM(6, azrn.a));
            fY(6);
        }
        if (azriVar.di(7)) {
            this.g = dtub.z(azri.ds(azriVar.getString(9)), azri.dr(azriVar.getString(azriVar.cM(7, azrn.a))));
            fY(7);
        }
        if (azriVar.di(8)) {
            this.h = (String[]) dtub.C(azri.ds(azriVar.getString(9)), azri.dt(azriVar.getString(azriVar.cM(8, azrn.a))), new String[0]);
            fY(8);
        }
        if (azriVar.di(9)) {
            this.j = dtub.B(azri.ds(azriVar.getString(9)), azri.ds(azriVar.getString(azriVar.cM(9, azrn.a))));
            fY(9);
        }
    }

    public final String d() {
        az(5, "phone_number");
        return this.i;
    }

    public final int[] e() {
        az(7, "sub_id");
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof azqe)) {
            return false;
        }
        azqe azqeVar = (azqe) obj;
        return super.aD(azqeVar.cL) && Objects.equals(this.a, azqeVar.a) && Objects.equals(this.b, azqeVar.b) && Objects.equals(this.c, azqeVar.c) && this.d == azqeVar.d && this.e == azqeVar.e && Objects.equals(this.i, azqeVar.i) && Objects.equals(this.f, azqeVar.f) && Arrays.equals(this.g, azqeVar.g) && Arrays.equals(this.h, azqeVar.h) && Arrays.equals(this.j, azqeVar.j);
    }

    public final String[] f() {
        az(8, "sim_serial_number");
        return this.h;
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        dtsq dtsqVar2 = (dtsqVar == null || dtsqVar.b()) ? null : this.cL;
        azsu azsuVar = this.a;
        azsu azsuVar2 = this.b;
        String str = this.c;
        Boolean valueOf = Boolean.valueOf(this.d);
        azon azonVar = this.e;
        return Objects.hash(dtsqVar2, azsuVar, azsuVar2, str, valueOf, Integer.valueOf(azonVar == null ? 0 : azonVar.ordinal()), this.i, this.f, Integer.valueOf(Arrays.hashCode(this.g)), Integer.valueOf(Arrays.hashCode(this.h)), Integer.valueOf(Arrays.hashCode(this.j)), null);
    }

    public final String toString() {
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "MyIdentitySubscriptionQuery -- REDACTED") : a();
    }
}
