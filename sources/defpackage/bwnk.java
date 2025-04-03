package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ProfilesTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwnk {
    public final bwnl a;
    public final bwnl b;
    public final bwnl c;
    public final bwnl d;
    public final bwnl e;
    public final bwnl f;
    public final bwnl g;
    public final bwnl h;
    public final bwnl i;
    public final bwnl j;
    public final bwnl k;
    public final bwnl l;
    public final bwnl m;
    public final bwnl n;
    public final bwnl o;
    public final bwnl p;
    public final bwnl q;
    public final bwnl r;
    public final bwnl s;
    public final bwnl t;
    final bwnl[] u;

    public bwnk() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 2;
        m.l(true);
        m.g(true);
        m.d(true);
        dtqsVar.a = "profiles_table._id";
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: bwlv
            @Override // java.util.function.Supplier
            public final Object get() {
                return ProfilesTable.b();
            }
        };
        dtqsVar.c = new dtsc() { // from class: bwlx
        };
        bwnl bwnlVar = new bwnl(m.a());
        this.a = bwnlVar;
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 2;
        m2.d(true);
        m2.e(true);
        dtqsVar2.b = new Supplier() { // from class: bwmj
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.c.a;
            }
        };
        dtqsVar2.a = "profiles_table.participant_id";
        m2.i(-1);
        dtqsVar2.d = new Supplier() { // from class: bwmv
            @Override // java.util.function.Supplier
            public final Object get() {
                return ProfilesTable.b();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: bwmx
        };
        bwnl bwnlVar2 = new bwnl(m2.a());
        this.b = bwnlVar2;
        dtsb m3 = dtsd.m();
        dtqs dtqsVar3 = (dtqs) m3;
        dtqsVar3.e = 4;
        dtqsVar3.a = "profiles_table.person_id";
        m3.i(60170);
        dtqsVar3.d = new Supplier() { // from class: bwmy
            @Override // java.util.function.Supplier
            public final Object get() {
                return ProfilesTable.b();
            }
        };
        dtqsVar3.c = new dtsc() { // from class: bwmz
        };
        bwnl bwnlVar3 = new bwnl(m3.a());
        this.c = bwnlVar3;
        dtsb m4 = dtsd.m();
        dtqs dtqsVar4 = (dtqs) m4;
        dtqsVar4.e = 4;
        dtqsVar4.a = "profiles_table.profile_access_token";
        m4.i(60170);
        dtqsVar4.d = new Supplier() { // from class: bwna
            @Override // java.util.function.Supplier
            public final Object get() {
                return ProfilesTable.b();
            }
        };
        dtqsVar4.c = new dtsc() { // from class: bwnb
        };
        bwnl bwnlVar4 = new bwnl(m4.a());
        this.d = bwnlVar4;
        dtsb m5 = dtsd.m();
        dtqs dtqsVar5 = (dtqs) m5;
        dtqsVar5.e = 2;
        dtqsVar5.a = "profiles_table.sending_self_profile_interaction_state";
        m5.i(60200);
        dtqsVar5.d = new Supplier() { // from class: bwnd
            @Override // java.util.function.Supplier
            public final Object get() {
                return ProfilesTable.b();
            }
        };
        dtqsVar5.c = new dtsc() { // from class: bwmg
        };
        bwnl bwnlVar5 = new bwnl(m5.a());
        this.e = bwnlVar5;
        dtsb m6 = dtsd.m();
        dtqs dtqsVar6 = (dtqs) m6;
        dtqsVar6.e = 5;
        dtqsVar6.a = "profiles_table.self_profile_sharing_metadata";
        m6.i(60340);
        dtqsVar6.d = new Supplier() { // from class: bwmr
            @Override // java.util.function.Supplier
            public final Object get() {
                return ProfilesTable.b();
            }
        };
        dtqsVar6.c = new dtsc() { // from class: bwnc
        };
        bwnl bwnlVar6 = new bwnl(m6.a());
        this.f = bwnlVar6;
        dtsb m7 = dtsd.m();
        dtqs dtqsVar7 = (dtqs) m7;
        dtqsVar7.e = 4;
        dtqsVar7.a = "profiles_table.first_name";
        m7.i(-1);
        dtqsVar7.d = new Supplier() { // from class: bwne
            @Override // java.util.function.Supplier
            public final Object get() {
                return ProfilesTable.b();
            }
        };
        dtqsVar7.c = new dtsc() { // from class: bwnf
        };
        bwnl bwnlVar7 = new bwnl(m7.a());
        this.g = bwnlVar7;
        dtsb m8 = dtsd.m();
        dtqs dtqsVar8 = (dtqs) m8;
        dtqsVar8.e = 4;
        dtqsVar8.a = "profiles_table.last_name";
        m8.i(-1);
        dtqsVar8.d = new Supplier() { // from class: bwng
            @Override // java.util.function.Supplier
            public final Object get() {
                return ProfilesTable.b();
            }
        };
        dtqsVar8.c = new dtsc() { // from class: bwnh
        };
        bwnl bwnlVar8 = new bwnl(m8.a());
        this.h = bwnlVar8;
        dtsb m9 = dtsd.m();
        dtqs dtqsVar9 = (dtqs) m9;
        dtqsVar9.e = 4;
        dtqsVar9.a = "profiles_table.display_name";
        m9.i(-1);
        dtqsVar9.d = new Supplier() { // from class: bwni
            @Override // java.util.function.Supplier
            public final Object get() {
                return ProfilesTable.b();
            }
        };
        dtqsVar9.c = new dtsc() { // from class: bwnj
        };
        bwnl bwnlVar9 = new bwnl(m9.a());
        this.i = bwnlVar9;
        dtsb m10 = dtsd.m();
        dtqs dtqsVar10 = (dtqs) m10;
        dtqsVar10.e = 4;
        dtqsVar10.a = "profiles_table.photo_uri";
        m10.i(-1);
        dtqsVar10.d = new Supplier() { // from class: bwlw
            @Override // java.util.function.Supplier
            public final Object get() {
                return ProfilesTable.b();
            }
        };
        dtqsVar10.c = new dtsc() { // from class: bwly
        };
        bwnl bwnlVar10 = new bwnl(m10.a());
        this.j = bwnlVar10;
        dtsb m11 = dtsd.m();
        dtqs dtqsVar11 = (dtqs) m11;
        dtqsVar11.e = 4;
        dtqsVar11.a = "profiles_table.sender_last_updated_time";
        m11.i(60170);
        dtqsVar11.d = new Supplier() { // from class: bwlz
            @Override // java.util.function.Supplier
            public final Object get() {
                return ProfilesTable.b();
            }
        };
        dtqsVar11.c = new dtsc() { // from class: bwma
        };
        bwnl bwnlVar11 = new bwnl(m11.a());
        this.k = bwnlVar11;
        dtsb m12 = dtsd.m();
        dtqs dtqsVar12 = (dtqs) m12;
        dtqsVar12.e = 4;
        dtqsVar12.a = "profiles_table.sender_last_updated_time_from_rcs";
        m12.i(60200);
        dtqsVar12.d = new Supplier() { // from class: bwmb
            @Override // java.util.function.Supplier
            public final Object get() {
                return ProfilesTable.b();
            }
        };
        dtqsVar12.c = new dtsc() { // from class: bwmc
        };
        bwnl bwnlVar12 = new bwnl(m12.a());
        this.l = bwnlVar12;
        dtsb m13 = dtsd.m();
        dtqs dtqsVar13 = (dtqs) m13;
        dtqsVar13.e = 4;
        m13.d(true);
        dtqsVar13.a = "profiles_table.contact_lookup_key";
        m13.i(-1);
        dtqsVar13.d = new Supplier() { // from class: bwmd
            @Override // java.util.function.Supplier
            public final Object get() {
                return ProfilesTable.b();
            }
        };
        dtqsVar13.c = new dtsc() { // from class: bwme
        };
        bwnl bwnlVar13 = new bwnl(m13.a());
        this.m = bwnlVar13;
        dtsb m14 = dtsd.m();
        dtqs dtqsVar14 = (dtqs) m14;
        dtqsVar14.e = 4;
        m14.k(true);
        m14.d(true);
        dtqsVar14.a = "profiles_table.phone_number";
        m14.i(-1);
        dtqsVar14.d = new Supplier() { // from class: bwmf
            @Override // java.util.function.Supplier
            public final Object get() {
                return ProfilesTable.b();
            }
        };
        dtqsVar14.c = new dtsc() { // from class: bwmh
        };
        bwnl bwnlVar14 = new bwnl(m14.a());
        this.n = bwnlVar14;
        dtsb m15 = dtsd.m();
        dtqs dtqsVar15 = (dtqs) m15;
        dtqsVar15.e = 1;
        dtqsVar15.a = "profiles_table.is_self_profile_shareable";
        m15.i(60400);
        dtqsVar15.d = new Supplier() { // from class: bwmi
            @Override // java.util.function.Supplier
            public final Object get() {
                return ProfilesTable.b();
            }
        };
        dtqsVar15.c = new dtsc() { // from class: bwmk
        };
        bwnl bwnlVar15 = new bwnl(m15.a());
        this.o = bwnlVar15;
        dtsb m16 = dtsd.m();
        dtqs dtqsVar16 = (dtqs) m16;
        dtqsVar16.e = 2;
        dtqsVar16.a = "profiles_table.has_shared_access_token_with_user";
        m16.i(60170);
        dtqsVar16.d = new Supplier() { // from class: bwml
            @Override // java.util.function.Supplier
            public final Object get() {
                return ProfilesTable.b();
            }
        };
        dtqsVar16.c = new dtsc() { // from class: bwmm
        };
        bwnl bwnlVar16 = new bwnl(m16.a());
        this.p = bwnlVar16;
        dtsb m17 = dtsd.m();
        dtqs dtqsVar17 = (dtqs) m17;
        dtqsVar17.e = 1;
        dtqsVar17.a = "profiles_table.name_timestamp";
        m17.i(-1);
        dtqsVar17.d = new Supplier() { // from class: bwmn
            @Override // java.util.function.Supplier
            public final Object get() {
                return ProfilesTable.b();
            }
        };
        dtqsVar17.c = new dtsc() { // from class: bwmo
        };
        bwnl bwnlVar17 = new bwnl(m17.a());
        this.q = bwnlVar17;
        dtsb m18 = dtsd.m();
        dtqs dtqsVar18 = (dtqs) m18;
        dtqsVar18.e = 1;
        dtqsVar18.a = "profiles_table.photo_timestamp";
        m18.i(-1);
        dtqsVar18.d = new Supplier() { // from class: bwmp
            @Override // java.util.function.Supplier
            public final Object get() {
                return ProfilesTable.b();
            }
        };
        dtqsVar18.c = new dtsc() { // from class: bwmq
        };
        bwnl bwnlVar18 = new bwnl(m18.a());
        this.r = bwnlVar18;
        dtsb m19 = dtsd.m();
        dtqs dtqsVar19 = (dtqs) m19;
        dtqsVar19.e = 1;
        dtqsVar19.a = "profiles_table.belongs_to_self_gaia";
        m19.i(59940);
        dtqsVar19.d = new Supplier() { // from class: bwms
            @Override // java.util.function.Supplier
            public final Object get() {
                return ProfilesTable.b();
            }
        };
        dtqsVar19.c = new dtsc() { // from class: bwmt
        };
        bwnl bwnlVar19 = new bwnl(m19.a());
        this.s = bwnlVar19;
        dtsb m20 = dtsd.m();
        dtqs dtqsVar20 = (dtqs) m20;
        dtqsVar20.e = 1;
        dtqsVar20.a = "profiles_table.gaia_update_timestamp";
        m20.i(59940);
        dtqsVar20.d = new Supplier() { // from class: bwmu
            @Override // java.util.function.Supplier
            public final Object get() {
                return ProfilesTable.b();
            }
        };
        dtqsVar20.c = new dtsc() { // from class: bwmw
        };
        bwnl bwnlVar20 = new bwnl(m20.a());
        this.t = bwnlVar20;
        this.u = new bwnl[]{bwnlVar, bwnlVar2, bwnlVar3, bwnlVar4, bwnlVar5, bwnlVar6, bwnlVar7, bwnlVar8, bwnlVar9, bwnlVar10, bwnlVar11, bwnlVar12, bwnlVar13, bwnlVar14, bwnlVar15, bwnlVar16, bwnlVar17, bwnlVar18, bwnlVar19, bwnlVar20};
    }
}
