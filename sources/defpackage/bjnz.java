package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bjnz {
    public static final String[] a = {"conversation_to_participants.conversation_id", "conversation_to_participants.participant_id", "conversation_to_participants.rcs_group_join_status", "participants._id", "participants.normalized_destination"};

    static {
        new enhd().c();
        enhd enhdVar = new enhd();
        enhdVar.k("conversation_id", "index_null_conversation_id");
        enhdVar.k("participant_id", "index_null_participant_id");
        enhdVar.c();
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 1;
        m.l(true);
        m.k(true);
        m.g(true);
        m.d(true);
        m.e(true);
        dtqsVar.b = new Supplier() { // from class: bjjq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsom.c.a;
            }
        };
        dtqsVar.a = "conversation_to_participants.conversation_id";
        m.f(true);
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: bjke
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjnz.a();
            }
        };
        dtqsVar.c = new dtsc() { // from class: bjkq
        };
        m.a();
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 1;
        m2.l(true);
        m2.k(true);
        m2.g(true);
        m2.d(true);
        m2.e(true);
        dtqsVar2.b = new Supplier() { // from class: bjlc
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.c.a;
            }
        };
        dtqsVar2.a = "conversation_to_participants.participant_id";
        m2.f(true);
        m2.i(-1);
        dtqsVar2.d = new Supplier() { // from class: bjlp
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjnz.a();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: bjmb
        };
        m2.a();
        dtsb m3 = dtsd.m();
        dtqs dtqsVar3 = (dtqs) m3;
        dtqsVar3.e = 1;
        m3.k(true);
        dtqsVar3.a = "conversation_to_participants.rcs_group_join_status";
        m3.i(-1);
        dtqsVar3.d = new Supplier() { // from class: bjmn
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjnz.a();
            }
        };
        dtqsVar3.c = new dtsc() { // from class: bjmz
        };
        m3.a();
        dtsb m4 = dtsd.m();
        dtqs dtqsVar4 = (dtqs) m4;
        dtqsVar4.e = 4;
        dtqsVar4.a = "conversation_to_participants.last_modified_by_key";
        m4.i(-1);
        dtqsVar4.d = new Supplier() { // from class: bjnl
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjnz.a();
            }
        };
        dtqsVar4.c = new dtsc() { // from class: bjjw
        };
        m4.a();
        dtsb m5 = dtsd.m();
        dtqs dtqsVar5 = (dtqs) m5;
        dtqsVar5.e = 2;
        m5.l(true);
        m5.g(true);
        m5.d(true);
        dtqsVar5.a = "participants._id";
        m5.i(-1);
        dtqsVar5.d = new Supplier() { // from class: bjmv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjnz.a();
            }
        };
        dtqsVar5.c = new dtsc() { // from class: bjng
        };
        m5.a();
        dtsb m6 = dtsd.m();
        dtqs dtqsVar6 = (dtqs) m6;
        dtqsVar6.e = 4;
        m6.d(true);
        dtqsVar6.a = "participants.normalized_destination";
        m6.f(true);
        m6.i(-1);
        dtqsVar6.d = new Supplier() { // from class: bjnr
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjnz.a();
            }
        };
        dtqsVar6.c = new dtsc() { // from class: bjjx
        };
        m6.a();
        dtsb m7 = dtsd.m();
        dtqs dtqsVar7 = (dtqs) m7;
        dtqsVar7.e = 4;
        m7.d(true);
        dtqsVar7.a = "participants.my_identity_token";
        m7.i(59930);
        dtqsVar7.d = new Supplier() { // from class: bjjy
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjnz.a();
            }
        };
        dtqsVar7.c = new dtsc() { // from class: bjjz
        };
        m7.a();
        dtsb m8 = dtsd.m();
        dtqs dtqsVar8 = (dtqs) m8;
        dtqsVar8.e = 4;
        m8.d(true);
        m8.e(true);
        dtqsVar8.b = new Supplier() { // from class: bjka
            @Override // java.util.function.Supplier
            public final Object get() {
                return azoi.c.a;
            }
        };
        dtqsVar8.a = "participants.my_identity_token_foreign_key";
        m8.i(60160);
        dtqsVar8.d = new Supplier() { // from class: bjkb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjnz.a();
            }
        };
        dtqsVar8.c = new dtsc() { // from class: bjkc
        };
        m8.a();
        dtsb m9 = dtsd.m();
        dtqs dtqsVar9 = (dtqs) m9;
        dtqsVar9.e = 1;
        m9.d(true);
        dtqsVar9.a = "participants.sub_id";
        m9.f(true);
        m9.i(-1);
        dtqsVar9.d = new Supplier() { // from class: bjkd
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjnz.a();
            }
        };
        dtqsVar9.c = new dtsc() { // from class: bjkf
        };
        m9.a();
        dtsb m10 = dtsd.m();
        dtqs dtqsVar10 = (dtqs) m10;
        dtqsVar10.e = 1;
        dtqsVar10.a = "participants.sim_slot_id";
        m10.i(2000);
        dtqsVar10.d = new Supplier() { // from class: bjkg
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjnz.a();
            }
        };
        dtqsVar10.c = new dtsc() { // from class: bjki
        };
        m10.a();
        dtsb m11 = dtsd.m();
        dtqs dtqsVar11 = (dtqs) m11;
        dtqsVar11.e = 4;
        dtqsVar11.a = "participants.send_destination";
        m11.i(-1);
        dtqsVar11.d = new Supplier() { // from class: bjkj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjnz.a();
            }
        };
        dtqsVar11.c = new dtsc() { // from class: bjkk
        };
        m11.a();
        dtsb m12 = dtsd.m();
        dtqs dtqsVar12 = (dtqs) m12;
        dtqsVar12.e = 4;
        dtqsVar12.a = "participants.display_destination";
        m12.i(-1);
        dtqsVar12.d = new Supplier() { // from class: bjkl
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjnz.a();
            }
        };
        dtqsVar12.c = new dtsc() { // from class: bjkm
        };
        m12.a();
        dtsb m13 = dtsd.m();
        dtqs dtqsVar13 = (dtqs) m13;
        dtqsVar13.e = 4;
        m13.l(true);
        m13.d(true);
        dtqsVar13.a = "participants.comparable_destination";
        m13.f(true);
        m13.i(54040);
        dtqsVar13.d = new Supplier() { // from class: bjkn
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjnz.a();
            }
        };
        dtqsVar13.c = new dtsc() { // from class: bjko
        };
        m13.a();
        dtsb m14 = dtsd.m();
        dtqs dtqsVar14 = (dtqs) m14;
        dtqsVar14.e = 4;
        dtqsVar14.a = "participants.country_code";
        m14.i(54040);
        dtqsVar14.d = new Supplier() { // from class: bjkp
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjnz.a();
            }
        };
        dtqsVar14.c = new dtsc() { // from class: bjkr
        };
        m14.a();
        dtsb m15 = dtsd.m();
        dtqs dtqsVar15 = (dtqs) m15;
        dtqsVar15.e = 2;
        m15.l(true);
        m15.d(true);
        dtqsVar15.a = "participants.recipient_id";
        m15.f(true);
        m15.i(58090);
        dtqsVar15.d = new Supplier() { // from class: bjkt
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjnz.a();
            }
        };
        dtqsVar15.c = new dtsc() { // from class: bjku
        };
        m15.a();
        dtsb m16 = dtsd.m();
        dtqs dtqsVar16 = (dtqs) m16;
        dtqsVar16.e = 4;
        dtqsVar16.a = "participants.recipient_canonical_address";
        m16.i(58090);
        dtqsVar16.d = new Supplier() { // from class: bjkv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjnz.a();
            }
        };
        dtqsVar16.c = new dtsc() { // from class: bjkw
        };
        m16.a();
        dtsb m17 = dtsd.m();
        dtqs dtqsVar17 = (dtqs) m17;
        dtqsVar17.e = 4;
        dtqsVar17.a = "participants.full_name";
        m17.i(-1);
        dtqsVar17.d = new Supplier() { // from class: bjkx
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjnz.a();
            }
        };
        dtqsVar17.c = new dtsc() { // from class: bjky
        };
        m17.a();
        dtsb m18 = dtsd.m();
        dtqs dtqsVar18 = (dtqs) m18;
        dtqsVar18.e = 4;
        dtqsVar18.a = "participants.first_name";
        m18.i(-1);
        dtqsVar18.d = new Supplier() { // from class: bjkz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjnz.a();
            }
        };
        dtqsVar18.c = new dtsc() { // from class: bjla
        };
        m18.a();
        dtsb m19 = dtsd.m();
        dtqs dtqsVar19 = (dtqs) m19;
        dtqsVar19.e = 4;
        dtqsVar19.a = "participants.profile_photo_uri";
        m19.i(-1);
        dtqsVar19.d = new Supplier() { // from class: bjlb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjnz.a();
            }
        };
        dtqsVar19.c = new dtsc() { // from class: bjle
        };
        m19.a();
        dtsb m20 = dtsd.m();
        dtqs dtqsVar20 = (dtqs) m20;
        dtqsVar20.e = 4;
        dtqsVar20.a = "participants.contact_photo_uri";
        m20.i(59850);
        dtqsVar20.d = new Supplier() { // from class: bjlf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjnz.a();
            }
        };
        dtqsVar20.c = new dtsc() { // from class: bjlg
        };
        m20.a();
        dtsb m21 = dtsd.m();
        dtqs dtqsVar21 = (dtqs) m21;
        dtqsVar21.e = 1;
        dtqsVar21.a = "participants.contact_id";
        m21.i(-1);
        dtqsVar21.d = new Supplier() { // from class: bjlh
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjnz.a();
            }
        };
        dtqsVar21.c = new dtsc() { // from class: bjli
        };
        m21.a();
        dtsb m22 = dtsd.m();
        dtqs dtqsVar22 = (dtqs) m22;
        dtqsVar22.e = 4;
        dtqsVar22.a = "participants.lookup_key";
        m22.i(-1);
        dtqsVar22.d = new Supplier() { // from class: bjlj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjnz.a();
            }
        };
        dtqsVar22.c = new dtsc() { // from class: bjlk
        };
        m22.a();
        dtsb m23 = dtsd.m();
        dtqs dtqsVar23 = (dtqs) m23;
        dtqsVar23.e = 1;
        dtqsVar23.a = "participants.color_palette_index";
        m23.i(-1);
        dtqsVar23.d = new Supplier() { // from class: bjll
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjnz.a();
            }
        };
        dtqsVar23.c = new dtsc() { // from class: bjlm
        };
        m23.a();
        dtsb m24 = dtsd.m();
        dtqs dtqsVar24 = (dtqs) m24;
        dtqsVar24.e = 1;
        dtqsVar24.a = "participants.color_type";
        m24.i(1000);
        dtqsVar24.d = new Supplier() { // from class: bjln
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjnz.a();
            }
        };
        dtqsVar24.c = new dtsc() { // from class: bjlq
        };
        m24.a();
        dtsb m25 = dtsd.m();
        dtqs dtqsVar25 = (dtqs) m25;
        dtqsVar25.e = 1;
        dtqsVar25.a = "participants.extended_color";
        m25.i(10027);
        dtqsVar25.d = new Supplier() { // from class: bjlr
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjnz.a();
            }
        };
        dtqsVar25.c = new dtsc() { // from class: bjls
        };
        m25.a();
        dtsb m26 = dtsd.m();
        dtqs dtqsVar26 = (dtqs) m26;
        dtqsVar26.e = 1;
        dtqsVar26.a = "participants.blocked";
        m26.i(-1);
        dtqsVar26.d = new Supplier() { // from class: bjlt
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjnz.a();
            }
        };
        dtqsVar26.c = new dtsc() { // from class: bjlu
        };
        m26.a();
        dtsb m27 = dtsd.m();
        dtqs dtqsVar27 = (dtqs) m27;
        dtqsVar27.e = 4;
        dtqsVar27.a = "participants.subscription_name";
        m27.i(2000);
        dtqsVar27.d = new Supplier() { // from class: bjlv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjnz.a();
            }
        };
        dtqsVar27.c = new dtsc() { // from class: bjlw
        };
        m27.a();
        dtsb m28 = dtsd.m();
        dtqs dtqsVar28 = (dtqs) m28;
        dtqsVar28.e = 1;
        dtqsVar28.a = "participants.subscription_color";
        m28.i(2000);
        dtqsVar28.d = new Supplier() { // from class: bjlx
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjnz.a();
            }
        };
        dtqsVar28.c = new dtsc() { // from class: bjly
        };
        m28.a();
        dtsb m29 = dtsd.m();
        dtqs dtqsVar29 = (dtqs) m29;
        dtqsVar29.e = 4;
        dtqsVar29.a = "participants.contact_destination";
        m29.i(4000);
        dtqsVar29.d = new Supplier() { // from class: bjma
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjnz.a();
            }
        };
        dtqsVar29.c = new dtsc() { // from class: bjmc
        };
        m29.a();
        dtsb m30 = dtsd.m();
        dtqs dtqsVar30 = (dtqs) m30;
        dtqsVar30.e = 1;
        dtqsVar30.a = "participants.participant_type";
        m30.i(12001);
        dtqsVar30.d = new Supplier() { // from class: bjmd
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjnz.a();
            }
        };
        dtqsVar30.c = new dtsc() { // from class: bjme
        };
        m30.a();
        dtsb m31 = dtsd.m();
        dtqs dtqsVar31 = (dtqs) m31;
        dtqsVar31.e = 1;
        dtqsVar31.a = "participants.video_reachability";
        m31.i(13050);
        dtqsVar31.d = new Supplier() { // from class: bjmf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjnz.a();
            }
        };
        dtqsVar31.c = new dtsc() { // from class: bjmg
        };
        m31.a();
        dtsb m32 = dtsd.m();
        dtqs dtqsVar32 = (dtqs) m32;
        dtqsVar32.e = 4;
        dtqsVar32.a = "participants.alias";
        m32.i(20060);
        dtqsVar32.d = new Supplier() { // from class: bjmh
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjnz.a();
            }
        };
        dtqsVar32.c = new dtsc() { // from class: bjmi
        };
        m32.a();
        dtsb m33 = dtsd.m();
        dtqs dtqsVar33 = (dtqs) m33;
        dtqsVar33.e = 1;
        dtqsVar33.a = "participants.is_spam";
        m33.i(24060);
        dtqsVar33.d = new Supplier() { // from class: bjmj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjnz.a();
            }
        };
        dtqsVar33.c = new dtsc() { // from class: bjml
        };
        m33.a();
        dtsb m34 = dtsd.m();
        dtqs dtqsVar34 = (dtqs) m34;
        dtqsVar34.e = 1;
        dtqsVar34.a = "participants.is_rcs_available";
        m34.i(29030);
        dtqsVar34.d = new Supplier() { // from class: bjmm
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjnz.a();
            }
        };
        dtqsVar34.c = new dtsc() { // from class: bjmo
        };
        m34.a();
        dtsb m35 = dtsd.m();
        dtqs dtqsVar35 = (dtqs) m35;
        dtqsVar35.e = 1;
        dtqsVar35.a = "participants.is_spam_source";
        m35.i(30000);
        dtqsVar35.d = new Supplier() { // from class: bjmp
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjnz.a();
            }
        };
        dtqsVar35.c = new dtsc() { // from class: bjmq
        };
        m35.a();
        dtsb m36 = dtsd.m();
        dtqs dtqsVar36 = (dtqs) m36;
        dtqsVar36.e = 4;
        m36.l(true);
        m36.d(true);
        dtqsVar36.a = "participants.cms_id";
        m36.f(true);
        m36.i(31020);
        dtqsVar36.d = new Supplier() { // from class: bjmr
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjnz.a();
            }
        };
        dtqsVar36.c = new dtsc() { // from class: bjms
        };
        m36.a();
        dtsb m37 = dtsd.m();
        dtqs dtqsVar37 = (dtqs) m37;
        dtqsVar37.e = 1;
        dtqsVar37.a = "participants.latest_verification_status";
        m37.i(31030);
        dtqsVar37.d = new Supplier() { // from class: bjmt
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjnz.a();
            }
        };
        dtqsVar37.c = new dtsc() { // from class: bjmu
        };
        m37.a();
        dtsb m38 = dtsd.m();
        dtqs dtqsVar38 = (dtqs) m38;
        dtqsVar38.e = 4;
        dtqsVar38.a = "participants.profile_photo_blob_id";
        m38.i(33000);
        dtqsVar38.d = new Supplier() { // from class: bjmw
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjnz.a();
            }
        };
        dtqsVar38.c = new dtsc() { // from class: bjmx
        };
        m38.a();
        dtsb m39 = dtsd.m();
        dtqs dtqsVar39 = (dtqs) m39;
        dtqsVar39.e = 5;
        dtqsVar39.a = "participants.profile_photo_encryption_key";
        m39.i(33060);
        dtqsVar39.d = new Supplier() { // from class: bjmy
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjnz.a();
            }
        };
        dtqsVar39.c = new dtsc() { // from class: bjna
        };
        m39.a();
        dtsb m40 = dtsd.m();
        dtqs dtqsVar40 = (dtqs) m40;
        dtqsVar40.e = 1;
        dtqsVar40.a = "participants.directory_id";
        m40.i(35010);
        dtqsVar40.d = new Supplier() { // from class: bjnb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjnz.a();
            }
        };
        dtqsVar40.c = new dtsc() { // from class: bjnc
        };
        m40.a();
        dtsb m41 = dtsd.m();
        dtqs dtqsVar41 = (dtqs) m41;
        dtqsVar41.e = 1;
        dtqsVar41.a = "participants.is_check_constraint_enabled_via_phenotype";
        m41.i(55010);
        dtqsVar41.d = new Supplier() { // from class: bjnd
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjnz.a();
            }
        };
        dtqsVar41.c = new dtsc() { // from class: bjne
        };
        m41.a();
        dtsb m42 = dtsd.m();
        dtqs dtqsVar42 = (dtqs) m42;
        dtqsVar42.e = 1;
        dtqsVar42.a = "participants.is_valid_phone_number_data";
        m42.i(55010);
        dtqsVar42.d = new Supplier() { // from class: bjnf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjnz.a();
            }
        };
        dtqsVar42.c = new dtsc() { // from class: bjnh
        };
        m42.a();
        dtsb m43 = dtsd.m();
        dtqs dtqsVar43 = (dtqs) m43;
        dtqsVar43.e = 2;
        m43.d(true);
        m43.e(true);
        dtqsVar43.b = new Supplier() { // from class: bjni
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.c.a;
            }
        };
        dtqsVar43.a = "participants.duplicate_of";
        m43.i(58090);
        dtqsVar43.d = new Supplier() { // from class: bjnj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjnz.a();
            }
        };
        dtqsVar43.c = new dtsc() { // from class: bjnk
        };
        m43.a();
        dtsb m44 = dtsd.m();
        dtqs dtqsVar44 = (dtqs) m44;
        dtqsVar44.e = 1;
        dtqsVar44.a = "participants.cms_life_cycle";
        m44.i(58210);
        dtqsVar44.d = new Supplier() { // from class: bjnm
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjnz.a();
            }
        };
        dtqsVar44.c = new dtsc() { // from class: bjnn
        };
        m44.a();
        dtsb m45 = dtsd.m();
        dtqs dtqsVar45 = (dtqs) m45;
        dtqsVar45.e = 1;
        dtqsVar45.a = "participants.norm_ui_status";
        m45.i(58620);
        dtqsVar45.d = new Supplier() { // from class: bjno
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjnz.a();
            }
        };
        dtqsVar45.c = new dtsc() { // from class: bjnp
        };
        m45.a();
        dtsb m46 = dtsd.m();
        dtqs dtqsVar46 = (dtqs) m46;
        dtqsVar46.e = 4;
        dtqsVar46.a = "participants.last_modified_by_key";
        m46.i(59440);
        dtqsVar46.d = new Supplier() { // from class: bjnq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjnz.a();
            }
        };
        dtqsVar46.c = new dtsc() { // from class: bjjr
        };
        m46.a();
        dtsb m47 = dtsd.m();
        dtqs dtqsVar47 = (dtqs) m47;
        dtqsVar47.e = 1;
        dtqsVar47.a = "participants.name_source";
        m47.i(59550);
        dtqsVar47.d = new Supplier() { // from class: bjjs
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjnz.a();
            }
        };
        dtqsVar47.c = new dtsc() { // from class: bjjt
        };
        m47.a();
        dtsb m48 = dtsd.m();
        dtqs dtqsVar48 = (dtqs) m48;
        dtqsVar48.e = 1;
        dtqsVar48.a = "participants.photo_source";
        m48.i(59550);
        dtqsVar48.d = new Supplier() { // from class: bjju
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjnz.a();
            }
        };
        dtqsVar48.c = new dtsc() { // from class: bjjv
        };
        m48.a();
        dtsb m49 = dtsd.m();
        dtqs dtqsVar49 = (dtqs) m49;
        dtqsVar49.e = 1;
        dtqsVar49.a = "participants.profile_photo_user_preference";
        m49.i(60060);
        dtqsVar49.d = new Supplier() { // from class: bjkh
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjnz.a();
            }
        };
        dtqsVar49.c = new dtsc() { // from class: bjks
        };
        m49.a();
        dtsb m50 = dtsd.m();
        dtqs dtqsVar50 = (dtqs) m50;
        dtqsVar50.e = 5;
        dtqsVar50.a = "participants.contact_metadata";
        m50.i(60070);
        dtqsVar50.d = new Supplier() { // from class: bjld
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjnz.a();
            }
        };
        dtqsVar50.c = new dtsc() { // from class: bjlo
        };
        m50.a();
        dtsb m51 = dtsd.m();
        dtqs dtqsVar51 = (dtqs) m51;
        dtqsVar51.e = 1;
        m51.d(true);
        dtqsVar51.a = "participants.is_enterprise_contact";
        m51.i(60640);
        dtqsVar51.d = new Supplier() { // from class: bjlz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bjnz.a();
            }
        };
        dtqsVar51.c = new dtsc() { // from class: bjmk
        };
        m51.a();
    }

    public static dtve a() {
        return dtub.e("$primary");
    }
}
