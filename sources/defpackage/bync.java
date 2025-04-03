package defpackage;

import android.content.ContentValues;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import defpackage.dtro;
import j$.util.Objects;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bync extends dtro {
    public MessageIdType a = bdhb.a;
    public long[] b;
    public long[] c;
    public long[] d;
    public String[] e;
    public String[] f;
    public String[] g;
    public String[] h;
    public String[] i;
    public int[] j;
    public int[] k;
    public int[] l;
    public long[] m;

    protected bync() {
    }

    @Override // defpackage.dtro
    public final String a() {
        return String.format(Locale.US, "UserRefConcatView [user_references.user_references_message_id: %s,\n  user_references.user_references_user_ref_id: %s,\n  user_references.user_references_user_ref_datetime: %s,\n  user_references.user_references_rowid: %s,\n  null.user_ref_display_name: %s,\n  null.user_ref_profile_photo_uri: %s,\n  null.user_ref_full_name: %s,\n  null.user_ref_lookup_key: %s,\n  participants.participants_normalized_destination: %s,\n  participants.participants_color_palette_index: %s,\n  participants.participants_color_type: %s,\n  participants.participants_extended_color: %s,\n  participants.participants_rowid: %s\n]\n", String.valueOf(this.a), aJ(this.b), aJ(this.c), aJ(this.d), "REDACTED", "REDACTED", "REDACTED", "REDACTED", aL(this.i), aI(this.j), aI(this.k), aI(this.l), aJ(this.m));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        Integer.valueOf(byrv.b().a()).getClass();
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        byru byruVar = (byru) dtsuVar;
        aB();
        this.cL = byruVar.cU();
        if (byruVar.di(0)) {
            this.a = new MessageIdType(byruVar.getLong(byruVar.cM(0, byrv.a)));
            fY(0);
        }
        if (byruVar.di(1)) {
            this.b = dtub.B(null, byru.ds(byruVar.getString(byruVar.cM(1, byrv.a))));
            fY(1);
        }
        if (byruVar.di(2)) {
            this.c = dtub.B(null, byru.ds(byruVar.getString(byruVar.cM(2, byrv.a))));
            fY(2);
        }
        if (byruVar.di(3)) {
            this.d = dtub.B(null, byru.ds(byruVar.getString(byruVar.cM(3, byrv.a))));
            fY(3);
        }
        if (byruVar.di(4)) {
            this.e = (String[]) dtub.C(null, byru.dt(byruVar.getString(byruVar.cM(4, byrv.a))), new String[0]);
            fY(4);
        }
        if (byruVar.di(5)) {
            this.f = (String[]) dtub.C(null, byru.dt(byruVar.getString(byruVar.cM(5, byrv.a))), new String[0]);
            fY(5);
        }
        if (byruVar.di(6)) {
            this.g = (String[]) dtub.C(null, byru.dt(byruVar.getString(byruVar.cM(6, byrv.a))), new String[0]);
            fY(6);
        }
        if (byruVar.di(7)) {
            this.h = (String[]) dtub.C(null, byru.dt(byruVar.getString(byruVar.cM(7, byrv.a))), new String[0]);
            fY(7);
        }
        if (byruVar.di(8)) {
            String[] dt = byru.dt(byruVar.getString(byruVar.cM(8, byrv.a)));
            for (int i = 0; i < dt.length; i++) {
                dt[i] = cuxd.a(dt[i]);
            }
            this.i = (String[]) dtub.C(null, dt, new String[0]);
            fY(8);
        }
        if (byruVar.di(9)) {
            this.j = dtub.z(null, byru.dr(byruVar.getString(byruVar.cM(9, byrv.a))));
            fY(9);
        }
        if (byruVar.di(10)) {
            this.k = dtub.z(null, byru.dr(byruVar.getString(byruVar.cM(10, byrv.a))));
            fY(10);
        }
        if (byruVar.di(11)) {
            this.l = dtub.z(null, byru.dr(byruVar.getString(byruVar.cM(11, byrv.a))));
            fY(11);
        }
        if (byruVar.di(12)) {
            this.m = dtub.B(null, byru.ds(byruVar.getString(byruVar.cM(12, byrv.a))));
            fY(12);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bync)) {
            return false;
        }
        bync byncVar = (bync) obj;
        return super.aD(byncVar.cL) && Objects.equals(this.a, byncVar.a) && Arrays.equals(this.b, byncVar.b) && Arrays.equals(this.c, byncVar.c) && Arrays.equals(this.d, byncVar.d) && Arrays.equals(this.e, byncVar.e) && Arrays.equals(this.f, byncVar.f) && Arrays.equals(this.g, byncVar.g) && Arrays.equals(this.h, byncVar.h) && Arrays.equals(this.i, byncVar.i) && Arrays.equals(this.j, byncVar.j) && Arrays.equals(this.k, byncVar.k) && Arrays.equals(this.l, byncVar.l) && Arrays.equals(this.m, byncVar.m);
    }

    public final long[] f() {
        az(1, "user_ref_id");
        return this.b;
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        return Objects.hash((dtsqVar == null || dtsqVar.b()) ? null : this.cL, this.a, Integer.valueOf(Arrays.hashCode(this.b)), Integer.valueOf(Arrays.hashCode(this.c)), Integer.valueOf(Arrays.hashCode(this.d)), Integer.valueOf(Arrays.hashCode(this.e)), Integer.valueOf(Arrays.hashCode(this.f)), Integer.valueOf(Arrays.hashCode(this.g)), Integer.valueOf(Arrays.hashCode(this.h)), Integer.valueOf(Arrays.hashCode(this.i)), Integer.valueOf(Arrays.hashCode(this.j)), Integer.valueOf(Arrays.hashCode(this.k)), Integer.valueOf(Arrays.hashCode(this.l)), Integer.valueOf(Arrays.hashCode(this.m)), null);
    }

    public final String toString() {
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "UserRefConcatView -- REDACTED") : a();
    }
}
