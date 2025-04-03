package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.queries.ParticipantIdsQuery;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class boiy {
    public final boiz a;

    public boiy() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 2;
        m.l(true);
        m.g(true);
        m.d(true);
        dtqsVar.a = "participants._id";
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: bofg
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantIdsQuery.a();
            }
        };
        dtqsVar.c = new dtsc() { // from class: bofi
        };
        this.a = new boiz(m.a());
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 4;
        m2.d(true);
        dtqsVar2.a = "participants.my_identity_token";
        m2.i(59930);
        dtqsVar2.d = new Supplier() { // from class: bofu
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantIdsQuery.a();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: bogg
        };
        m2.a();
        dtsb m3 = dtsd.m();
        dtqs dtqsVar3 = (dtqs) m3;
        dtqsVar3.e = 4;
        m3.d(true);
        m3.e(true);
        dtqsVar3.b = new Supplier() { // from class: bogs
            @Override // java.util.function.Supplier
            public final Object get() {
                return azoi.c.a;
            }
        };
        dtqsVar3.a = "participants.my_identity_token_foreign_key";
        m3.i(60160);
        dtqsVar3.d = new Supplier() { // from class: bohe
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantIdsQuery.a();
            }
        };
        dtqsVar3.c = new dtsc() { // from class: bohq
        };
        m3.a();
        dtsb m4 = dtsd.m();
        dtqs dtqsVar4 = (dtqs) m4;
        dtqsVar4.e = 1;
        m4.d(true);
        dtqsVar4.a = "participants.sub_id";
        m4.f(true);
        m4.i(-1);
        dtqsVar4.d = new Supplier() { // from class: boic
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantIdsQuery.a();
            }
        };
        dtqsVar4.c = new dtsc() { // from class: boio
        };
        m4.a();
        dtsb m5 = dtsd.m();
        dtqs dtqsVar5 = (dtqs) m5;
        dtqsVar5.e = 1;
        dtqsVar5.a = "participants.sim_slot_id";
        m5.i(2000);
        dtqsVar5.d = new Supplier() { // from class: boiw
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantIdsQuery.a();
            }
        };
        dtqsVar5.c = new dtsc() { // from class: bofr
        };
        m5.a();
        dtsb m6 = dtsd.m();
        dtqs dtqsVar6 = (dtqs) m6;
        dtqsVar6.e = 4;
        m6.d(true);
        dtqsVar6.a = "participants.normalized_destination";
        m6.f(true);
        m6.i(-1);
        dtqsVar6.d = new Supplier() { // from class: bogc
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantIdsQuery.a();
            }
        };
        dtqsVar6.c = new dtsc() { // from class: bogn
        };
        m6.a();
        dtsb m7 = dtsd.m();
        dtqs dtqsVar7 = (dtqs) m7;
        dtqsVar7.e = 4;
        dtqsVar7.a = "participants.send_destination";
        m7.i(-1);
        dtqsVar7.d = new Supplier() { // from class: bogy
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantIdsQuery.a();
            }
        };
        dtqsVar7.c = new dtsc() { // from class: bohj
        };
        m7.a();
        dtsb m8 = dtsd.m();
        dtqs dtqsVar8 = (dtqs) m8;
        dtqsVar8.e = 4;
        dtqsVar8.a = "participants.display_destination";
        m8.i(-1);
        dtqsVar8.d = new Supplier() { // from class: bohu
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantIdsQuery.a();
            }
        };
        dtqsVar8.c = new dtsc() { // from class: boif
        };
        m8.a();
        dtsb m9 = dtsd.m();
        dtqs dtqsVar9 = (dtqs) m9;
        dtqsVar9.e = 4;
        m9.l(true);
        m9.d(true);
        dtqsVar9.a = "participants.comparable_destination";
        m9.f(true);
        m9.i(54040);
        dtqsVar9.d = new Supplier() { // from class: boiq
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantIdsQuery.a();
            }
        };
        dtqsVar9.c = new dtsc() { // from class: boix
        };
        m9.a();
        dtsb m10 = dtsd.m();
        dtqs dtqsVar10 = (dtqs) m10;
        dtqsVar10.e = 4;
        dtqsVar10.a = "participants.country_code";
        m10.i(54040);
        dtqsVar10.d = new Supplier() { // from class: bofh
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantIdsQuery.a();
            }
        };
        dtqsVar10.c = new dtsc() { // from class: bofj
        };
        m10.a();
        dtsb m11 = dtsd.m();
        dtqs dtqsVar11 = (dtqs) m11;
        dtqsVar11.e = 2;
        m11.l(true);
        m11.d(true);
        dtqsVar11.a = "participants.recipient_id";
        m11.f(true);
        m11.i(58090);
        dtqsVar11.d = new Supplier() { // from class: bofk
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantIdsQuery.a();
            }
        };
        dtqsVar11.c = new dtsc() { // from class: bofl
        };
        m11.a();
        dtsb m12 = dtsd.m();
        dtqs dtqsVar12 = (dtqs) m12;
        dtqsVar12.e = 4;
        dtqsVar12.a = "participants.recipient_canonical_address";
        m12.i(58090);
        dtqsVar12.d = new Supplier() { // from class: bofm
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantIdsQuery.a();
            }
        };
        dtqsVar12.c = new dtsc() { // from class: bofn
        };
        m12.a();
        dtsb m13 = dtsd.m();
        dtqs dtqsVar13 = (dtqs) m13;
        dtqsVar13.e = 4;
        dtqsVar13.a = "participants.full_name";
        m13.i(-1);
        dtqsVar13.d = new Supplier() { // from class: bofo
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantIdsQuery.a();
            }
        };
        dtqsVar13.c = new dtsc() { // from class: bofp
        };
        m13.a();
        dtsb m14 = dtsd.m();
        dtqs dtqsVar14 = (dtqs) m14;
        dtqsVar14.e = 4;
        dtqsVar14.a = "participants.first_name";
        m14.i(-1);
        dtqsVar14.d = new Supplier() { // from class: bofq
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantIdsQuery.a();
            }
        };
        dtqsVar14.c = new dtsc() { // from class: bofs
        };
        m14.a();
        dtsb m15 = dtsd.m();
        dtqs dtqsVar15 = (dtqs) m15;
        dtqsVar15.e = 4;
        dtqsVar15.a = "participants.profile_photo_uri";
        m15.i(-1);
        dtqsVar15.d = new Supplier() { // from class: boft
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantIdsQuery.a();
            }
        };
        dtqsVar15.c = new dtsc() { // from class: bofv
        };
        m15.a();
        dtsb m16 = dtsd.m();
        dtqs dtqsVar16 = (dtqs) m16;
        dtqsVar16.e = 4;
        dtqsVar16.a = "participants.contact_photo_uri";
        m16.i(59850);
        dtqsVar16.d = new Supplier() { // from class: bofw
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantIdsQuery.a();
            }
        };
        dtqsVar16.c = new dtsc() { // from class: bofx
        };
        m16.a();
        dtsb m17 = dtsd.m();
        dtqs dtqsVar17 = (dtqs) m17;
        dtqsVar17.e = 1;
        dtqsVar17.a = "participants.contact_id";
        m17.i(-1);
        dtqsVar17.d = new Supplier() { // from class: bofy
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantIdsQuery.a();
            }
        };
        dtqsVar17.c = new dtsc() { // from class: bofz
        };
        m17.a();
        dtsb m18 = dtsd.m();
        dtqs dtqsVar18 = (dtqs) m18;
        dtqsVar18.e = 4;
        dtqsVar18.a = "participants.lookup_key";
        m18.i(-1);
        dtqsVar18.d = new Supplier() { // from class: boga
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantIdsQuery.a();
            }
        };
        dtqsVar18.c = new dtsc() { // from class: bogb
        };
        m18.a();
        dtsb m19 = dtsd.m();
        dtqs dtqsVar19 = (dtqs) m19;
        dtqsVar19.e = 1;
        dtqsVar19.a = "participants.color_palette_index";
        m19.i(-1);
        dtqsVar19.d = new Supplier() { // from class: bogd
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantIdsQuery.a();
            }
        };
        dtqsVar19.c = new dtsc() { // from class: boge
        };
        m19.a();
        dtsb m20 = dtsd.m();
        dtqs dtqsVar20 = (dtqs) m20;
        dtqsVar20.e = 1;
        dtqsVar20.a = "participants.color_type";
        m20.i(1000);
        dtqsVar20.d = new Supplier() { // from class: bogf
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantIdsQuery.a();
            }
        };
        dtqsVar20.c = new dtsc() { // from class: bogh
        };
        m20.a();
        dtsb m21 = dtsd.m();
        dtqs dtqsVar21 = (dtqs) m21;
        dtqsVar21.e = 1;
        dtqsVar21.a = "participants.extended_color";
        m21.i(10027);
        dtqsVar21.d = new Supplier() { // from class: bogi
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantIdsQuery.a();
            }
        };
        dtqsVar21.c = new dtsc() { // from class: bogj
        };
        m21.a();
        dtsb m22 = dtsd.m();
        dtqs dtqsVar22 = (dtqs) m22;
        dtqsVar22.e = 1;
        dtqsVar22.a = "participants.blocked";
        m22.i(-1);
        dtqsVar22.d = new Supplier() { // from class: bogk
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantIdsQuery.a();
            }
        };
        dtqsVar22.c = new dtsc() { // from class: bogl
        };
        m22.a();
        dtsb m23 = dtsd.m();
        dtqs dtqsVar23 = (dtqs) m23;
        dtqsVar23.e = 4;
        dtqsVar23.a = "participants.subscription_name";
        m23.i(2000);
        dtqsVar23.d = new Supplier() { // from class: bogm
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantIdsQuery.a();
            }
        };
        dtqsVar23.c = new dtsc() { // from class: bogo
        };
        m23.a();
        dtsb m24 = dtsd.m();
        dtqs dtqsVar24 = (dtqs) m24;
        dtqsVar24.e = 1;
        dtqsVar24.a = "participants.subscription_color";
        m24.i(2000);
        dtqsVar24.d = new Supplier() { // from class: bogp
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantIdsQuery.a();
            }
        };
        dtqsVar24.c = new dtsc() { // from class: bogq
        };
        m24.a();
        dtsb m25 = dtsd.m();
        dtqs dtqsVar25 = (dtqs) m25;
        dtqsVar25.e = 4;
        dtqsVar25.a = "participants.contact_destination";
        m25.i(4000);
        dtqsVar25.d = new Supplier() { // from class: bogr
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantIdsQuery.a();
            }
        };
        dtqsVar25.c = new dtsc() { // from class: bogt
        };
        m25.a();
        dtsb m26 = dtsd.m();
        dtqs dtqsVar26 = (dtqs) m26;
        dtqsVar26.e = 1;
        dtqsVar26.a = "participants.participant_type";
        m26.i(12001);
        dtqsVar26.d = new Supplier() { // from class: bogu
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantIdsQuery.a();
            }
        };
        dtqsVar26.c = new dtsc() { // from class: bogv
        };
        m26.a();
        dtsb m27 = dtsd.m();
        dtqs dtqsVar27 = (dtqs) m27;
        dtqsVar27.e = 1;
        dtqsVar27.a = "participants.video_reachability";
        m27.i(13050);
        dtqsVar27.d = new Supplier() { // from class: bogw
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantIdsQuery.a();
            }
        };
        dtqsVar27.c = new dtsc() { // from class: bogx
        };
        m27.a();
        dtsb m28 = dtsd.m();
        dtqs dtqsVar28 = (dtqs) m28;
        dtqsVar28.e = 4;
        dtqsVar28.a = "participants.alias";
        m28.i(20060);
        dtqsVar28.d = new Supplier() { // from class: bogz
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantIdsQuery.a();
            }
        };
        dtqsVar28.c = new dtsc() { // from class: boha
        };
        m28.a();
        dtsb m29 = dtsd.m();
        dtqs dtqsVar29 = (dtqs) m29;
        dtqsVar29.e = 1;
        dtqsVar29.a = "participants.is_spam";
        m29.i(24060);
        dtqsVar29.d = new Supplier() { // from class: bohb
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantIdsQuery.a();
            }
        };
        dtqsVar29.c = new dtsc() { // from class: bohc
        };
        m29.a();
        dtsb m30 = dtsd.m();
        dtqs dtqsVar30 = (dtqs) m30;
        dtqsVar30.e = 1;
        dtqsVar30.a = "participants.is_rcs_available";
        m30.i(29030);
        dtqsVar30.d = new Supplier() { // from class: bohd
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantIdsQuery.a();
            }
        };
        dtqsVar30.c = new dtsc() { // from class: bohf
        };
        m30.a();
        dtsb m31 = dtsd.m();
        dtqs dtqsVar31 = (dtqs) m31;
        dtqsVar31.e = 1;
        dtqsVar31.a = "participants.is_spam_source";
        m31.i(30000);
        dtqsVar31.d = new Supplier() { // from class: bohg
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantIdsQuery.a();
            }
        };
        dtqsVar31.c = new dtsc() { // from class: bohh
        };
        m31.a();
        dtsb m32 = dtsd.m();
        dtqs dtqsVar32 = (dtqs) m32;
        dtqsVar32.e = 4;
        m32.l(true);
        m32.d(true);
        dtqsVar32.a = "participants.cms_id";
        m32.f(true);
        m32.i(31020);
        dtqsVar32.d = new Supplier() { // from class: bohi
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantIdsQuery.a();
            }
        };
        dtqsVar32.c = new dtsc() { // from class: bohk
        };
        m32.a();
        dtsb m33 = dtsd.m();
        dtqs dtqsVar33 = (dtqs) m33;
        dtqsVar33.e = 1;
        dtqsVar33.a = "participants.latest_verification_status";
        m33.i(31030);
        dtqsVar33.d = new Supplier() { // from class: bohl
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantIdsQuery.a();
            }
        };
        dtqsVar33.c = new dtsc() { // from class: bohm
        };
        m33.a();
        dtsb m34 = dtsd.m();
        dtqs dtqsVar34 = (dtqs) m34;
        dtqsVar34.e = 4;
        dtqsVar34.a = "participants.profile_photo_blob_id";
        m34.i(33000);
        dtqsVar34.d = new Supplier() { // from class: bohn
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantIdsQuery.a();
            }
        };
        dtqsVar34.c = new dtsc() { // from class: boho
        };
        m34.a();
        dtsb m35 = dtsd.m();
        dtqs dtqsVar35 = (dtqs) m35;
        dtqsVar35.e = 5;
        dtqsVar35.a = "participants.profile_photo_encryption_key";
        m35.i(33060);
        dtqsVar35.d = new Supplier() { // from class: bohp
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantIdsQuery.a();
            }
        };
        dtqsVar35.c = new dtsc() { // from class: bohr
        };
        m35.a();
        dtsb m36 = dtsd.m();
        dtqs dtqsVar36 = (dtqs) m36;
        dtqsVar36.e = 1;
        dtqsVar36.a = "participants.directory_id";
        m36.i(35010);
        dtqsVar36.d = new Supplier() { // from class: bohs
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantIdsQuery.a();
            }
        };
        dtqsVar36.c = new dtsc() { // from class: boht
        };
        m36.a();
        dtsb m37 = dtsd.m();
        dtqs dtqsVar37 = (dtqs) m37;
        dtqsVar37.e = 1;
        dtqsVar37.a = "participants.is_check_constraint_enabled_via_phenotype";
        m37.i(55010);
        dtqsVar37.d = new Supplier() { // from class: bohv
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantIdsQuery.a();
            }
        };
        dtqsVar37.c = new dtsc() { // from class: bohw
        };
        m37.a();
        dtsb m38 = dtsd.m();
        dtqs dtqsVar38 = (dtqs) m38;
        dtqsVar38.e = 1;
        dtqsVar38.a = "participants.is_valid_phone_number_data";
        m38.i(55010);
        dtqsVar38.d = new Supplier() { // from class: bohx
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantIdsQuery.a();
            }
        };
        dtqsVar38.c = new dtsc() { // from class: bohy
        };
        m38.a();
        dtsb m39 = dtsd.m();
        dtqs dtqsVar39 = (dtqs) m39;
        dtqsVar39.e = 2;
        m39.d(true);
        m39.e(true);
        dtqsVar39.b = new Supplier() { // from class: bohz
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.c.a;
            }
        };
        dtqsVar39.a = "participants.duplicate_of";
        m39.i(58090);
        dtqsVar39.d = new Supplier() { // from class: boia
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantIdsQuery.a();
            }
        };
        dtqsVar39.c = new dtsc() { // from class: boib
        };
        m39.a();
        dtsb m40 = dtsd.m();
        dtqs dtqsVar40 = (dtqs) m40;
        dtqsVar40.e = 1;
        dtqsVar40.a = "participants.cms_life_cycle";
        m40.i(58210);
        dtqsVar40.d = new Supplier() { // from class: boid
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantIdsQuery.a();
            }
        };
        dtqsVar40.c = new dtsc() { // from class: boie
        };
        m40.a();
        dtsb m41 = dtsd.m();
        dtqs dtqsVar41 = (dtqs) m41;
        dtqsVar41.e = 1;
        dtqsVar41.a = "participants.norm_ui_status";
        m41.i(58620);
        dtqsVar41.d = new Supplier() { // from class: boig
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantIdsQuery.a();
            }
        };
        dtqsVar41.c = new dtsc() { // from class: boih
        };
        m41.a();
        dtsb m42 = dtsd.m();
        dtqs dtqsVar42 = (dtqs) m42;
        dtqsVar42.e = 4;
        dtqsVar42.a = "participants.last_modified_by_key";
        m42.i(59440);
        dtqsVar42.d = new Supplier() { // from class: boii
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantIdsQuery.a();
            }
        };
        dtqsVar42.c = new dtsc() { // from class: boij
        };
        m42.a();
        dtsb m43 = dtsd.m();
        dtqs dtqsVar43 = (dtqs) m43;
        dtqsVar43.e = 1;
        dtqsVar43.a = "participants.name_source";
        m43.i(59550);
        dtqsVar43.d = new Supplier() { // from class: boik
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantIdsQuery.a();
            }
        };
        dtqsVar43.c = new dtsc() { // from class: boil
        };
        m43.a();
        dtsb m44 = dtsd.m();
        dtqs dtqsVar44 = (dtqs) m44;
        dtqsVar44.e = 1;
        dtqsVar44.a = "participants.photo_source";
        m44.i(59550);
        dtqsVar44.d = new Supplier() { // from class: boim
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantIdsQuery.a();
            }
        };
        dtqsVar44.c = new dtsc() { // from class: boin
        };
        m44.a();
        dtsb m45 = dtsd.m();
        dtqs dtqsVar45 = (dtqs) m45;
        dtqsVar45.e = 1;
        dtqsVar45.a = "participants.profile_photo_user_preference";
        m45.i(60060);
        dtqsVar45.d = new Supplier() { // from class: boip
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantIdsQuery.a();
            }
        };
        dtqsVar45.c = new dtsc() { // from class: boir
        };
        m45.a();
        dtsb m46 = dtsd.m();
        dtqs dtqsVar46 = (dtqs) m46;
        dtqsVar46.e = 5;
        dtqsVar46.a = "participants.contact_metadata";
        m46.i(60070);
        dtqsVar46.d = new Supplier() { // from class: bois
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantIdsQuery.a();
            }
        };
        dtqsVar46.c = new dtsc() { // from class: boit
        };
        m46.a();
        dtsb m47 = dtsd.m();
        dtqs dtqsVar47 = (dtqs) m47;
        dtqsVar47.e = 1;
        m47.d(true);
        dtqsVar47.a = "participants.is_enterprise_contact";
        m47.i(60640);
        dtqsVar47.d = new Supplier() { // from class: boiu
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantIdsQuery.a();
            }
        };
        dtqsVar47.c = new dtsc() { // from class: boiv
        };
        m47.a();
    }
}
