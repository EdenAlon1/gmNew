package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ProfilesTable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwop extends duak {
    public bwop() {
        super("profiles_table");
    }

    @Override // defpackage.duak
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bwoo b() {
        ah();
        return new bwoo(this.c, this.a, this.b, this.d.g(), this.e.g());
    }

    public final void c(String str) {
        int intValue = ProfilesTable.c().intValue();
        int intValue2 = ProfilesTable.c().intValue();
        if (intValue2 < 60170) {
            dtub.w("person_id", intValue2);
        }
        if (intValue >= 60170) {
            dtub.u(this.a, "person_id", str);
        }
    }

    public final void d(String str) {
        int intValue = ProfilesTable.c().intValue();
        int intValue2 = ProfilesTable.c().intValue();
        if (intValue2 < 60170) {
            dtub.w("profile_access_token", intValue2);
        }
        if (intValue >= 60170) {
            dtub.u(this.a, "profile_access_token", str);
        }
    }

    public final void e(String str) {
        int intValue = ProfilesTable.c().intValue();
        int intValue2 = ProfilesTable.c().intValue();
        if (intValue2 < 60170) {
            dtub.w("sender_last_updated_time", intValue2);
        }
        if (intValue >= 60170) {
            dtub.u(this.a, "sender_last_updated_time", str);
        }
    }

    public final void f(String str) {
        int intValue = ProfilesTable.c().intValue();
        int intValue2 = ProfilesTable.c().intValue();
        if (intValue2 < 60200) {
            dtub.w("sender_last_updated_time_from_rcs", intValue2);
        }
        if (intValue >= 60200) {
            dtub.u(this.a, "sender_last_updated_time_from_rcs", str);
        }
    }
}
