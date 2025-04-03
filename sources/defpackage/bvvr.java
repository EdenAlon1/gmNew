package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bvvr extends duak {
    public bvvr() {
        super("participants");
    }

    public final void A(int i) {
        int intValue = ParticipantsTable.i().intValue();
        int intValue2 = ParticipantsTable.i().intValue();
        if (intValue2 < 30000) {
            dtub.w("is_spam_source", intValue2);
        }
        if (intValue >= 30000) {
            this.a.put("is_spam_source", Integer.valueOf(i));
        }
    }

    public final void B(byzi byziVar) {
        int intValue = ParticipantsTable.i().intValue();
        int intValue2 = ParticipantsTable.i().intValue();
        if (intValue2 < 31030) {
            dtub.w("latest_verification_status", intValue2);
        }
        if (intValue >= 31030) {
            if (byziVar == null) {
                this.a.putNull("latest_verification_status");
            } else {
                this.a.put("latest_verification_status", Integer.valueOf(byziVar.ordinal()));
            }
        }
    }

    public final void C(String str) {
        dtub.u(this.a, "lookup_key", str);
    }

    public final void D() {
        this.a.putNull("lookup_key");
    }

    public final void E(azsu azsuVar) {
        int intValue = ParticipantsTable.i().intValue();
        if (ParticipantsTable.i().intValue() >= 60160 && intValue >= 60160) {
            if (azsuVar == null || azsuVar.equals(null)) {
                this.a.putNull("my_identity_token_foreign_key");
            } else {
                this.a.put("my_identity_token_foreign_key", azsv.b(azsuVar));
            }
        }
    }

    public final void F(cjwi cjwiVar) {
        int intValue = ParticipantsTable.i().intValue();
        int intValue2 = ParticipantsTable.i().intValue();
        if (intValue2 < 59550) {
            dtub.w("name_source", intValue2);
        }
        if (intValue >= 59550) {
            if (cjwiVar == null) {
                this.a.putNull("name_source");
            } else {
                this.a.put("name_source", Integer.valueOf(cjwiVar.a()));
            }
        }
    }

    public final void G(aorb aorbVar) {
        int intValue = ParticipantsTable.i().intValue();
        int intValue2 = ParticipantsTable.i().intValue();
        if (intValue2 < 58620) {
            dtub.w("norm_ui_status", intValue2);
        }
        if (intValue >= 58620) {
            if (aorbVar == null) {
                this.a.putNull("norm_ui_status");
            } else {
                this.a.put("norm_ui_status", Integer.valueOf(aorbVar.a()));
            }
        }
    }

    public final void H(String str) {
        dtub.u(this.a, "normalized_destination", cuxd.a(str));
    }

    public final void I(int i) {
        int intValue = ParticipantsTable.i().intValue();
        int intValue2 = ParticipantsTable.i().intValue();
        if (intValue2 < 12001) {
            dtub.w("participant_type", intValue2);
        }
        if (intValue >= 12001) {
            this.a.put("participant_type", Integer.valueOf(i));
        }
    }

    public final void J(cjwi cjwiVar) {
        int intValue = ParticipantsTable.i().intValue();
        int intValue2 = ParticipantsTable.i().intValue();
        if (intValue2 < 59550) {
            dtub.w("photo_source", intValue2);
        }
        if (intValue >= 59550) {
            if (cjwiVar == null) {
                this.a.putNull("photo_source");
            } else {
                this.a.put("photo_source", Integer.valueOf(cjwiVar.a()));
            }
        }
    }

    public final void K(String str) {
        int intValue = ParticipantsTable.i().intValue();
        int intValue2 = ParticipantsTable.i().intValue();
        if (intValue2 < 33000) {
            dtub.w("profile_photo_blob_id", intValue2);
        }
        if (intValue >= 33000) {
            dtub.u(this.a, "profile_photo_blob_id", str);
        }
    }

    public final void L(byte[] bArr) {
        int intValue = ParticipantsTable.i().intValue();
        int intValue2 = ParticipantsTable.i().intValue();
        if (intValue2 < 33060) {
            dtub.w("profile_photo_encryption_key", intValue2);
        }
        if (intValue >= 33060) {
            this.a.put("profile_photo_encryption_key", bArr);
        }
    }

    public final void M(Uri uri) {
        if (uri == null) {
            this.a.putNull("profile_photo_uri");
        } else {
            this.a.put("profile_photo_uri", uri.toString());
        }
    }

    public final void N() {
        this.a.putNull("profile_photo_uri");
    }

    public final void O(String str) {
        dtub.u(this.a, "send_destination", cuxd.a(str));
    }

    public final void P(int i) {
        int intValue = ParticipantsTable.i().intValue();
        int intValue2 = ParticipantsTable.i().intValue();
        if (intValue2 < 2000) {
            dtub.w("sim_slot_id", intValue2);
        }
        if (intValue >= 2000) {
            this.a.put("sim_slot_id", Integer.valueOf(i));
        }
    }

    public final void Q(int i) {
        this.a.put("sub_id", Integer.valueOf(i));
    }

    public final void R(int i) {
        int intValue = ParticipantsTable.i().intValue();
        int intValue2 = ParticipantsTable.i().intValue();
        if (intValue2 < 2000) {
            dtub.w("subscription_color", intValue2);
        }
        if (intValue >= 2000) {
            this.a.put("subscription_color", Integer.valueOf(i));
        }
    }

    public final void S(String str) {
        int intValue = ParticipantsTable.i().intValue();
        int intValue2 = ParticipantsTable.i().intValue();
        if (intValue2 < 2000) {
            dtub.w("subscription_name", intValue2);
        }
        if (intValue >= 2000) {
            dtub.u(this.a, "subscription_name", str);
        }
    }

    public final void T(int i) {
        int intValue = ParticipantsTable.i().intValue();
        int intValue2 = ParticipantsTable.i().intValue();
        if (intValue2 < 13050) {
            dtub.w("video_reachability", intValue2);
        }
        if (intValue >= 13050) {
            this.a.put("video_reachability", Integer.valueOf(i));
        }
    }

    public final void U(bvvw bvvwVar) {
        af(new bvvs(bvvwVar));
    }

    public final void V(Function function) {
        Object apply;
        String[] strArr = ParticipantsTable.a;
        apply = function.apply(new bvvw());
        af(new bvvs((bvvw) apply));
    }

    public final int a(int i) {
        String[] strArr = ParticipantsTable.a;
        bvvw bvvwVar = new bvvw();
        bvvwVar.w(i);
        return ae(new bvvs(bvvwVar), "participants-buildAndUpdateForSubId");
    }

    public final azsu c() {
        return azsv.a(this.a.getAsString("my_identity_token"));
    }

    @Override // defpackage.duak
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final bvvq b() {
        ah();
        try {
            if (c() != null) {
                E(c());
            }
            return new bvvq(this.c, this.a, this.b, this.d.g(), this.e.g());
        } catch (Throwable th) {
            throw new dtqp(th);
        }
    }

    public final boolean e(String str) {
        String[] strArr = ParticipantsTable.a;
        bvvw bvvwVar = new bvvw();
        bvvwVar.k(str);
        return aj(new bvvs(bvvwVar), "participants-buildAndUpdateForId");
    }

    public final void f(boolean z) {
        this.a.put("blocked", Boolean.valueOf(z));
    }

    public final void g(String str) {
        int intValue = ParticipantsTable.i().intValue();
        int intValue2 = ParticipantsTable.i().intValue();
        if (intValue2 < 31020) {
            dtub.w("cms_id", intValue2);
        }
        if (intValue >= 31020) {
            dtub.u(this.a, "cms_id", str);
        }
    }

    public final void h() {
        this.a.putNull("cms_id");
    }

    public final void i(csgg csggVar) {
        int intValue = ParticipantsTable.i().intValue();
        int intValue2 = ParticipantsTable.i().intValue();
        if (intValue2 < 58210) {
            dtub.w("cms_life_cycle", intValue2);
        }
        if (intValue >= 58210) {
            if (csggVar == null) {
                this.a.putNull("cms_life_cycle");
            } else {
                this.a.put("cms_life_cycle", Integer.valueOf(csggVar.ordinal()));
            }
        }
    }

    public final void j(int i) {
        this.a.put("color_palette_index", Integer.valueOf(i));
    }

    public final void k(int i) {
        int intValue = ParticipantsTable.i().intValue();
        int intValue2 = ParticipantsTable.i().intValue();
        if (intValue2 < 1000) {
            dtub.w("color_type", intValue2);
        }
        if (intValue >= 1000) {
            this.a.put("color_type", Integer.valueOf(i));
        }
    }

    public final void l(String str) {
        int intValue = ParticipantsTable.i().intValue();
        int intValue2 = ParticipantsTable.i().intValue();
        if (intValue2 < 4000) {
            dtub.w("contact_destination", intValue2);
        }
        if (intValue >= 4000) {
            dtub.u(this.a, "contact_destination", str);
        }
    }

    public final void m() {
        this.a.putNull("contact_destination");
    }

    public final void n(long j) {
        this.a.put("contact_id", Long.valueOf(j));
    }

    public final void o() {
        this.a.putNull("contact_metadata");
    }

    public final void p() {
        this.a.putNull("contact_photo_uri");
    }

    public final void q(long j) {
        int intValue = ParticipantsTable.i().intValue();
        int intValue2 = ParticipantsTable.i().intValue();
        if (intValue2 < 35010) {
            dtub.w("directory_id", intValue2);
        }
        if (intValue >= 35010) {
            this.a.put("directory_id", Long.valueOf(j));
        }
    }

    public final void r(String str) {
        dtub.u(this.a, "display_destination", cuxd.a(str));
    }

    public final void s(int i) {
        int intValue = ParticipantsTable.i().intValue();
        int intValue2 = ParticipantsTable.i().intValue();
        if (intValue2 < 10027) {
            dtub.w("extended_color", intValue2);
        }
        if (intValue >= 10027) {
            this.a.put("extended_color", Integer.valueOf(i));
        }
    }

    public final void t(String str) {
        dtub.u(this.a, "first_name", cuxs.a(str));
    }

    public final void u() {
        this.a.putNull("first_name");
    }

    public final void v(String str) {
        dtub.u(this.a, "full_name", cuxs.a(str));
    }

    public final void w() {
        this.a.putNull("full_name");
    }

    public final void x(boolean z) {
        int intValue = ParticipantsTable.i().intValue();
        int intValue2 = ParticipantsTable.i().intValue();
        if (intValue2 < 55010) {
            dtub.w("is_check_constraint_enabled_via_phenotype", intValue2);
        }
        if (intValue >= 55010) {
            this.a.put("is_check_constraint_enabled_via_phenotype", Boolean.valueOf(z));
        }
    }

    public final void y() {
        this.a.putNull("is_enterprise_contact");
    }

    public final void z(boolean z) {
        int intValue = ParticipantsTable.i().intValue();
        int intValue2 = ParticipantsTable.i().intValue();
        if (intValue2 < 24060) {
            dtub.w("is_spam", intValue2);
        }
        if (intValue >= 24060) {
            this.a.put("is_spam", Boolean.valueOf(z));
        }
    }
}
