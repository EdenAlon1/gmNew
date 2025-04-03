package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afjy {
    public final afjz a;
    public final afjz b;

    public afjy() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 2;
        m.l(true);
        m.g(true);
        m.d(true);
        dtqsVar.a = "conversations._id";
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: afcv
            @Override // java.util.function.Supplier
            public final Object get() {
                return afkd.b();
            }
        };
        dtqsVar.c = new dtsc() { // from class: afjt
        };
        this.a = new afjz(m.a());
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 1;
        m2.d(true);
        dtqsVar2.a = "conversations.sms_thread_id";
        m2.i(-1);
        dtqsVar2.d = new Supplier() { // from class: afdd
            @Override // java.util.function.Supplier
            public final Object get() {
                return afkd.b();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: afdp
        };
        m2.a();
        dtsb m3 = dtsd.m();
        dtqs dtqsVar3 = (dtqs) m3;
        dtqsVar3.e = 4;
        dtqsVar3.a = "conversations.name";
        m3.i(-1);
        dtqsVar3.d = new Supplier() { // from class: afeb
            @Override // java.util.function.Supplier
            public final Object get() {
                return afkd.b();
            }
        };
        dtqsVar3.c = new dtsc() { // from class: afeo
        };
        m3.a();
        dtsb m4 = dtsd.m();
        dtqs dtqsVar4 = (dtqs) m4;
        dtqsVar4.e = 2;
        dtqsVar4.a = "conversations.name_is_automatic";
        m4.i(10012);
        dtqsVar4.d = new Supplier() { // from class: affa
            @Override // java.util.function.Supplier
            public final Object get() {
                return afkd.b();
            }
        };
        dtqsVar4.c = new dtsc() { // from class: affm
        };
        m4.a();
        dtsb m5 = dtsd.m();
        dtqs dtqsVar5 = (dtqs) m5;
        dtqsVar5.e = 4;
        dtqsVar5.a = "conversations.subtitle";
        m5.i(59760);
        dtqsVar5.d = new Supplier() { // from class: affy
            @Override // java.util.function.Supplier
            public final Object get() {
                return afkd.b();
            }
        };
        dtqsVar5.c = new dtsc() { // from class: afgk
        };
        m5.a();
        dtsb m6 = dtsd.m();
        dtqs dtqsVar6 = (dtqs) m6;
        dtqsVar6.e = 1;
        dtqsVar6.a = "conversations.latest_message_id";
        m6.i(-1);
        dtqsVar6.d = new Supplier() { // from class: afdr
            @Override // java.util.function.Supplier
            public final Object get() {
                return afkd.b();
            }
        };
        dtqsVar6.c = new dtsc() { // from class: afgq
        };
        m6.a();
        dtsb m7 = dtsd.m();
        dtqs dtqsVar7 = (dtqs) m7;
        dtqsVar7.e = 4;
        dtqsVar7.a = "conversations.snippet_text";
        m7.i(-1);
        dtqsVar7.d = new Supplier() { // from class: afhc
            @Override // java.util.function.Supplier
            public final Object get() {
                return afkd.b();
            }
        };
        dtqsVar7.c = new dtsc() { // from class: afho
        };
        m7.a();
        dtsb m8 = dtsd.m();
        dtqs dtqsVar8 = (dtqs) m8;
        dtqsVar8.e = 4;
        dtqsVar8.a = "conversations.subject_text";
        m8.i(-1);
        dtqsVar8.d = new Supplier() { // from class: afia
            @Override // java.util.function.Supplier
            public final Object get() {
                return afkd.b();
            }
        };
        dtqsVar8.c = new dtsc() { // from class: afim
        };
        m8.a();
        dtsb m9 = dtsd.m();
        dtqs dtqsVar9 = (dtqs) m9;
        dtqsVar9.e = 4;
        dtqsVar9.a = "conversations.preview_uri";
        m9.i(-1);
        dtqsVar9.d = new Supplier() { // from class: afiy
            @Override // java.util.function.Supplier
            public final Object get() {
                return afkd.b();
            }
        };
        dtqsVar9.c = new dtsc() { // from class: afjk
        };
        m9.a();
        dtsb m10 = dtsd.m();
        dtqs dtqsVar10 = (dtqs) m10;
        dtqsVar10.e = 4;
        dtqsVar10.a = "conversations.preview_content_type";
        m10.i(-1);
        dtqsVar10.d = new Supplier() { // from class: afjr
            @Override // java.util.function.Supplier
            public final Object get() {
                return afkd.b();
            }
        };
        dtqsVar10.c = new dtsc() { // from class: afjs
        };
        m10.a();
        dtsb m11 = dtsd.m();
        dtqs dtqsVar11 = (dtqs) m11;
        dtqsVar11.e = 1;
        dtqsVar11.a = "conversations.show_draft";
        m11.i(-1);
        dtqsVar11.d = new Supplier() { // from class: afju
            @Override // java.util.function.Supplier
            public final Object get() {
                return afkd.b();
            }
        };
        dtqsVar11.c = new dtsc() { // from class: afjv
        };
        m11.a();
        dtsb m12 = dtsd.m();
        dtqs dtqsVar12 = (dtqs) m12;
        dtqsVar12.e = 4;
        dtqsVar12.a = "conversations.draft_snippet_text";
        m12.i(-1);
        dtqsVar12.d = new Supplier() { // from class: afjw
            @Override // java.util.function.Supplier
            public final Object get() {
                return afkd.b();
            }
        };
        dtqsVar12.c = new dtsc() { // from class: afcw
        };
        m12.a();
        dtsb m13 = dtsd.m();
        dtqs dtqsVar13 = (dtqs) m13;
        dtqsVar13.e = 4;
        dtqsVar13.a = "conversations.draft_subject_text";
        m13.i(-1);
        dtqsVar13.d = new Supplier() { // from class: afcx
            @Override // java.util.function.Supplier
            public final Object get() {
                return afkd.b();
            }
        };
        dtqsVar13.c = new dtsc() { // from class: afcy
        };
        m13.a();
        dtsb m14 = dtsd.m();
        dtqs dtqsVar14 = (dtqs) m14;
        dtqsVar14.e = 4;
        dtqsVar14.a = "conversations.draft_preview_uri";
        m14.i(-1);
        dtqsVar14.d = new Supplier() { // from class: afcz
            @Override // java.util.function.Supplier
            public final Object get() {
                return afkd.b();
            }
        };
        dtqsVar14.c = new dtsc() { // from class: afda
        };
        m14.a();
        dtsb m15 = dtsd.m();
        dtqs dtqsVar15 = (dtqs) m15;
        dtqsVar15.e = 4;
        dtqsVar15.a = "conversations.draft_preview_content_type";
        m15.i(-1);
        dtqsVar15.d = new Supplier() { // from class: afdb
            @Override // java.util.function.Supplier
            public final Object get() {
                return afkd.b();
            }
        };
        dtqsVar15.c = new dtsc() { // from class: afdc
        };
        m15.a();
        dtsb m16 = dtsd.m();
        dtqs dtqsVar16 = (dtqs) m16;
        dtqsVar16.e = 1;
        dtqsVar16.a = "conversations.etouffee_default";
        m16.i(29060);
        dtqsVar16.d = new Supplier() { // from class: afde
            @Override // java.util.function.Supplier
            public final Object get() {
                return afkd.b();
            }
        };
        dtqsVar16.c = new dtsc() { // from class: afdf
        };
        m16.a();
        dtsb m17 = dtsd.m();
        dtqs dtqsVar17 = (dtqs) m17;
        dtqsVar17.e = 1;
        m17.d(true);
        dtqsVar17.a = "conversations.archive_status";
        m17.i(-1);
        dtqsVar17.d = new Supplier() { // from class: afdh
            @Override // java.util.function.Supplier
            public final Object get() {
                return afkd.b();
            }
        };
        dtqsVar17.c = new dtsc() { // from class: afdi
        };
        m17.a();
        dtsb m18 = dtsd.m();
        dtqs dtqsVar18 = (dtqs) m18;
        dtqsVar18.e = 1;
        m18.d(true);
        dtqsVar18.a = "conversations.sort_timestamp";
        m18.i(-1);
        dtqsVar18.d = new Supplier() { // from class: afdj
            @Override // java.util.function.Supplier
            public final Object get() {
                return afkd.b();
            }
        };
        dtqsVar18.c = new dtsc() { // from class: afdk
        };
        m18.a();
        dtsb m19 = dtsd.m();
        dtqs dtqsVar19 = (dtqs) m19;
        dtqsVar19.e = 1;
        dtqsVar19.a = "conversations.last_read_timestamp";
        m19.i(-1);
        dtqsVar19.d = new Supplier() { // from class: afdl
            @Override // java.util.function.Supplier
            public final Object get() {
                return afkd.b();
            }
        };
        dtqsVar19.c = new dtsc() { // from class: afdm
        };
        m19.a();
        dtsb m20 = dtsd.m();
        dtqs dtqsVar20 = (dtqs) m20;
        dtqsVar20.e = 4;
        dtqsVar20.a = "conversations.icon";
        m20.i(-1);
        dtqsVar20.d = new Supplier() { // from class: afdn
            @Override // java.util.function.Supplier
            public final Object get() {
                return afkd.b();
            }
        };
        dtqsVar20.c = new dtsc() { // from class: afdo
        };
        m20.a();
        dtsb m21 = dtsd.m();
        dtqs dtqsVar21 = (dtqs) m21;
        dtqsVar21.e = 1;
        dtqsVar21.a = "conversations.participant_contact_id";
        m21.i(-1);
        dtqsVar21.d = new Supplier() { // from class: afdq
            @Override // java.util.function.Supplier
            public final Object get() {
                return afkd.b();
            }
        };
        dtqsVar21.c = new dtsc() { // from class: afds
        };
        m21.a();
        dtsb m22 = dtsd.m();
        dtqs dtqsVar22 = (dtqs) m22;
        dtqsVar22.e = 1;
        dtqsVar22.a = "conversations.normalized_participant_contact_id";
        m22.i(58090);
        dtqsVar22.d = new Supplier() { // from class: afdt
            @Override // java.util.function.Supplier
            public final Object get() {
                return afkd.b();
            }
        };
        dtqsVar22.c = new dtsc() { // from class: afdu
        };
        m22.a();
        dtsb m23 = dtsd.m();
        dtqs dtqsVar23 = (dtqs) m23;
        dtqsVar23.e = 4;
        dtqsVar23.a = "conversations.participant_lookup_key";
        m23.i(-1);
        dtqsVar23.d = new Supplier() { // from class: afdv
            @Override // java.util.function.Supplier
            public final Object get() {
                return afkd.b();
            }
        };
        dtqsVar23.c = new dtsc() { // from class: afdw
        };
        m23.a();
        dtsb m24 = dtsd.m();
        dtqs dtqsVar24 = (dtqs) m24;
        dtqsVar24.e = 4;
        dtqsVar24.a = "conversations.normalized_participant_lookup_key";
        m24.i(58090);
        dtqsVar24.d = new Supplier() { // from class: afdx
            @Override // java.util.function.Supplier
            public final Object get() {
                return afkd.b();
            }
        };
        dtqsVar24.c = new dtsc() { // from class: afdy
        };
        m24.a();
        dtsb m25 = dtsd.m();
        dtqs dtqsVar25 = (dtqs) m25;
        dtqsVar25.e = 4;
        m25.d(true);
        dtqsVar25.a = "conversations.participant_normalized_destination";
        m25.i(-1);
        dtqsVar25.d = new Supplier() { // from class: afdz
            @Override // java.util.function.Supplier
            public final Object get() {
                return afkd.b();
            }
        };
        dtqsVar25.c = new dtsc() { // from class: afea
        };
        m25.a();
        dtsb m26 = dtsd.m();
        dtqs dtqsVar26 = (dtqs) m26;
        dtqsVar26.e = 4;
        m26.l(true);
        m26.d(true);
        dtqsVar26.a = "conversations.participant_comparable_destination";
        m26.f(true);
        m26.i(58090);
        dtqsVar26.d = new Supplier() { // from class: afed
            @Override // java.util.function.Supplier
            public final Object get() {
                return afkd.b();
            }
        };
        dtqsVar26.c = new dtsc() { // from class: afee
        };
        m26.a();
        dtsb m27 = dtsd.m();
        dtqs dtqsVar27 = (dtqs) m27;
        dtqsVar27.e = 4;
        dtqsVar27.a = "conversations.current_self_id";
        m27.i(-1);
        dtqsVar27.d = new Supplier() { // from class: afef
            @Override // java.util.function.Supplier
            public final Object get() {
                return afkd.b();
            }
        };
        dtqsVar27.c = new dtsc() { // from class: afeg
        };
        m27.a();
        dtsb m28 = dtsd.m();
        dtqs dtqsVar28 = (dtqs) m28;
        dtqsVar28.e = 4;
        m28.d(true);
        m28.e(true);
        dtqsVar28.b = new Supplier() { // from class: afeh
            @Override // java.util.function.Supplier
            public final Object get() {
                return azoi.c.a;
            }
        };
        dtqsVar28.a = "conversations.current_my_identity_foreign_key";
        m28.i(60160);
        dtqsVar28.d = new Supplier() { // from class: afei
            @Override // java.util.function.Supplier
            public final Object get() {
                return afkd.b();
            }
        };
        dtqsVar28.c = new dtsc() { // from class: afej
        };
        m28.a();
        dtsb m29 = dtsd.m();
        dtqs dtqsVar29 = (dtqs) m29;
        dtqsVar29.e = 4;
        m29.d(true);
        m29.e(true);
        dtqsVar29.b = new Supplier() { // from class: afek
            @Override // java.util.function.Supplier
            public final Object get() {
                return azdt.b.a;
            }
        };
        dtqsVar29.a = "conversations.destination_token";
        m29.i(60360);
        dtqsVar29.d = new Supplier() { // from class: afel
            @Override // java.util.function.Supplier
            public final Object get() {
                return afkd.b();
            }
        };
        dtqsVar29.c = new dtsc() { // from class: afem
        };
        m29.a();
        dtsb m30 = dtsd.m();
        dtqs dtqsVar30 = (dtqs) m30;
        dtqsVar30.e = 1;
        dtqsVar30.a = "conversations.participant_count";
        m30.i(-1);
        dtqsVar30.d = new Supplier() { // from class: afep
            @Override // java.util.function.Supplier
            public final Object get() {
                return afkd.b();
            }
        };
        dtqsVar30.c = new dtsc() { // from class: afeq
        };
        m30.a();
        dtsb m31 = dtsd.m();
        dtqs dtqsVar31 = (dtqs) m31;
        dtqsVar31.e = 1;
        dtqsVar31.a = "conversations.notification_enabled";
        m31.i(-1);
        dtqsVar31.d = new Supplier() { // from class: afer
            @Override // java.util.function.Supplier
            public final Object get() {
                return afkd.b();
            }
        };
        dtqsVar31.c = new dtsc() { // from class: afes
        };
        m31.a();
        dtsb m32 = dtsd.m();
        dtqs dtqsVar32 = (dtqs) m32;
        dtqsVar32.e = 4;
        dtqsVar32.a = "conversations.notification_sound_uri";
        m32.i(-1);
        dtqsVar32.d = new Supplier() { // from class: afet
            @Override // java.util.function.Supplier
            public final Object get() {
                return afkd.b();
            }
        };
        dtqsVar32.c = new dtsc() { // from class: afeu
        };
        m32.a();
        dtsb m33 = dtsd.m();
        dtqs dtqsVar33 = (dtqs) m33;
        dtqsVar33.e = 1;
        dtqsVar33.a = "conversations.notification_vibration";
        m33.i(-1);
        dtqsVar33.d = new Supplier() { // from class: afev
            @Override // java.util.function.Supplier
            public final Object get() {
                return afkd.b();
            }
        };
        dtqsVar33.c = new dtsc() { // from class: afew
        };
        m33.a();
        dtsb m34 = dtsd.m();
        dtqs dtqsVar34 = (dtqs) m34;
        dtqsVar34.e = 1;
        dtqsVar34.a = "conversations.include_email_addr";
        m34.i(-1);
        dtqsVar34.d = new Supplier() { // from class: afex
            @Override // java.util.function.Supplier
            public final Object get() {
                return afkd.b();
            }
        };
        dtqsVar34.c = new dtsc() { // from class: afez
        };
        m34.a();
        dtsb m35 = dtsd.m();
        dtqs dtqsVar35 = (dtqs) m35;
        dtqsVar35.e = 4;
        dtqsVar35.a = "conversations.sms_service_center";
        m35.i(-1);
        dtqsVar35.d = new Supplier() { // from class: affb
            @Override // java.util.function.Supplier
            public final Object get() {
                return afkd.b();
            }
        };
        dtqsVar35.c = new dtsc() { // from class: affc
        };
        m35.a();
        dtsb m36 = dtsd.m();
        dtqs dtqsVar36 = (dtqs) m36;
        dtqsVar36.e = 4;
        dtqsVar36.a = "conversations.participant_id_list";
        m36.i(8500);
        dtqsVar36.d = new Supplier() { // from class: affd
            @Override // java.util.function.Supplier
            public final Object get() {
                return afkd.b();
            }
        };
        dtqsVar36.c = new dtsc() { // from class: affe
        };
        m36.a();
        dtsb m37 = dtsd.m();
        dtqs dtqsVar37 = (dtqs) m37;
        dtqsVar37.e = 4;
        m37.l(true);
        m37.d(true);
        dtqsVar37.a = "conversations.normalized_participant_id_list";
        m37.f(true);
        m37.i(58090);
        dtqsVar37.d = new Supplier() { // from class: afff
            @Override // java.util.function.Supplier
            public final Object get() {
                return afkd.b();
            }
        };
        dtqsVar37.c = new dtsc() { // from class: affg
        };
        m37.a();
        dtsb m38 = dtsd.m();
        dtqs dtqsVar38 = (dtqs) m38;
        dtqsVar38.e = 1;
        dtqsVar38.a = "conversations.source_type";
        m38.i(8500);
        dtqsVar38.d = new Supplier() { // from class: affh
            @Override // java.util.function.Supplier
            public final Object get() {
                return afkd.b();
            }
        };
        dtqsVar38.c = new dtsc() { // from class: affi
        };
        m38.a();
        dtsb m39 = dtsd.m();
        dtqs dtqsVar39 = (dtqs) m39;
        dtqsVar39.e = 1;
        m39.d(true);
        dtqsVar39.a = "conversations.rcs_session_id";
        m39.i(10000);
        dtqsVar39.d = new Supplier() { // from class: affk
            @Override // java.util.function.Supplier
            public final Object get() {
                return afkd.b();
            }
        };
        dtqsVar39.c = new dtsc() { // from class: affl
        };
        m39.a();
        dtsb m40 = dtsd.m();
        dtqs dtqsVar40 = (dtqs) m40;
        dtqsVar40.e = 1;
        dtqsVar40.a = "conversations.join_state";
        m40.i(10006);
        dtqsVar40.d = new Supplier() { // from class: affn
            @Override // java.util.function.Supplier
            public final Object get() {
                return afkd.b();
            }
        };
        dtqsVar40.c = new dtsc() { // from class: affo
        };
        m40.a();
        dtsb m41 = dtsd.m();
        dtqs dtqsVar41 = (dtqs) m41;
        dtqsVar41.e = 1;
        dtqsVar41.a = "conversations.conv_type";
        m41.i(10007);
        dtqsVar41.d = new Supplier() { // from class: affp
            @Override // java.util.function.Supplier
            public final Object get() {
                return afkd.b();
            }
        };
        dtqsVar41.c = new dtsc() { // from class: affq
        };
        m41.a();
        dtsb m42 = dtsd.m();
        dtqs dtqsVar42 = (dtqs) m42;
        dtqsVar42.e = 1;
        dtqsVar42.a = "conversations.send_mode";
        m42.i(10016);
        dtqsVar42.d = new Supplier() { // from class: affr
            @Override // java.util.function.Supplier
            public final Object get() {
                return afkd.b();
            }
        };
        dtqsVar42.c = new dtsc() { // from class: affs
        };
        m42.a();
        dtsb m43 = dtsd.m();
        dtqs dtqsVar43 = (dtqs) m43;
        dtqsVar43.e = 1;
        dtqsVar43.a = "conversations.IS_ENTERPRISE";
        m43.i(10018);
        dtqsVar43.d = new Supplier() { // from class: afft
            @Override // java.util.function.Supplier
            public final Object get() {
                return afkd.b();
            }
        };
        dtqsVar43.c = new dtsc() { // from class: affv
        };
        m43.a();
        dtsb m44 = dtsd.m();
        dtqs dtqsVar44 = (dtqs) m44;
        dtqsVar44.e = 1;
        dtqsVar44.a = "conversations.has_ea2p_bot_recipient";
        m44.i(12001);
        dtqsVar44.d = new Supplier() { // from class: affw
            @Override // java.util.function.Supplier
            public final Object get() {
                return afkd.b();
            }
        };
        dtqsVar44.c = new dtsc() { // from class: affx
        };
        m44.a();
        dtsb m45 = dtsd.m();
        dtqs dtqsVar45 = (dtqs) m45;
        dtqsVar45.e = 1;
        dtqsVar45.a = "conversations.last_interactive_event_timestamp";
        m45.i(15000);
        dtqsVar45.d = new Supplier() { // from class: affz
            @Override // java.util.function.Supplier
            public final Object get() {
                return afkd.b();
            }
        };
        dtqsVar45.c = new dtsc() { // from class: afga
        };
        m45.a();
        dtsb m46 = dtsd.m();
        dtqs dtqsVar46 = (dtqs) m46;
        dtqsVar46.e = 4;
        dtqsVar46.a = "conversations.participant_display_destination";
        m46.i(15010);
        dtqsVar46.d = new Supplier() { // from class: afgb
            @Override // java.util.function.Supplier
            public final Object get() {
                return afkd.b();
            }
        };
        dtqsVar46.c = new dtsc() { // from class: afgc
        };
        m46.a();
        dtsb m47 = dtsd.m();
        dtqs dtqsVar47 = (dtqs) m47;
        dtqsVar47.e = 4;
        dtqsVar47.a = "conversations.normalized_participant_display_destination";
        m47.i(58090);
        dtqsVar47.d = new Supplier() { // from class: afgd
            @Override // java.util.function.Supplier
            public final Object get() {
                return afkd.b();
            }
        };
        dtqsVar47.c = new dtsc() { // from class: afge
        };
        m47.a();
        dtsb m48 = dtsd.m();
        dtqs dtqsVar48 = (dtqs) m48;
        dtqsVar48.e = 1;
        dtqsVar48.a = "conversations.spam_warning_dismiss_status";
        m48.i(23000);
        dtqsVar48.d = new Supplier() { // from class: afgg
            @Override // java.util.function.Supplier
            public final Object get() {
                return afkd.b();
            }
        };
        dtqsVar48.c = new dtsc() { // from class: afgh
        };
        m48.a();
        dtsb m49 = dtsd.m();
        dtqs dtqsVar49 = (dtqs) m49;
        dtqsVar49.e = 1;
        dtqsVar49.a = "conversations.open_count";
        m49.i(26020);
        dtqsVar49.d = new Supplier() { // from class: afgi
            @Override // java.util.function.Supplier
            public final Object get() {
                return afkd.b();
            }
        };
        dtqsVar49.c = new dtsc() { // from class: afgj
        };
        m49.a();
        dtsb m50 = dtsd.m();
        dtqs dtqsVar50 = (dtqs) m50;
        dtqsVar50.e = 1;
        dtqsVar50.a = "conversations.last_logged_scooby_metadata_timestamp";
        m50.i(28010);
        dtqsVar50.d = new Supplier() { // from class: afgn
            @Override // java.util.function.Supplier
            public final Object get() {
                return afkd.b();
            }
        };
        dtqsVar50.c = new dtsc() { // from class: afgy
        };
        m50.a();
        dtsb m51 = dtsd.m();
        dtqs dtqsVar51 = (dtqs) m51;
        dtqsVar51.e = 1;
        m51.d(true);
        dtqsVar51.a = "conversations.delete_timestamp";
        m51.i(29020);
        dtqsVar51.d = new Supplier() { // from class: afhj
            @Override // java.util.function.Supplier
            public final Object get() {
                return afkd.b();
            }
        };
        dtqsVar51.c = new dtsc() { // from class: afhu
        };
        m51.a();
        dtsb m52 = dtsd.m();
        dtqs dtqsVar52 = (dtqs) m52;
        dtqsVar52.e = 4;
        m52.l(true);
        m52.d(true);
        dtqsVar52.a = "conversations.cms_id";
        m52.f(true);
        m52.i(32000);
        dtqsVar52.d = new Supplier() { // from class: afif
            @Override // java.util.function.Supplier
            public final Object get() {
                return afkd.b();
            }
        };
        dtqsVar52.c = new dtsc() { // from class: afiq
        };
        m52.a();
        dtsb m53 = dtsd.m();
        dtqs dtqsVar53 = (dtqs) m53;
        dtqsVar53.e = 4;
        m53.d(true);
        dtqsVar53.a = "conversations.rcs_group_id";
        m53.i(40050);
        dtqsVar53.d = new Supplier() { // from class: afjb
            @Override // java.util.function.Supplier
            public final Object get() {
                return afkd.b();
            }
        };
        dtqsVar53.c = new dtsc() { // from class: afjm
        };
        m53.a();
        dtsb m54 = dtsd.m();
        dtqs dtqsVar54 = (dtqs) m54;
        dtqsVar54.e = 4;
        dtqsVar54.a = "conversations.rcs_conference_uri";
        m54.i(40050);
        dtqsVar54.d = new Supplier() { // from class: afjx
            @Override // java.util.function.Supplier
            public final Object get() {
                return afkd.b();
            }
        };
        dtqsVar54.c = new dtsc() { // from class: afdg
        };
        m54.a();
        dtsb m55 = dtsd.m();
        dtqs dtqsVar55 = (dtqs) m55;
        dtqsVar55.e = 5;
        dtqsVar55.a = "conversations.tachygram_group_routing_info_token";
        m55.i(58120);
        dtqsVar55.d = new Supplier() { // from class: afec
            @Override // java.util.function.Supplier
            public final Object get() {
                return afkd.b();
            }
        };
        dtqsVar55.c = new dtsc() { // from class: afen
        };
        m55.a();
        dtsb m56 = dtsd.m();
        dtqs dtqsVar56 = (dtqs) m56;
        dtqsVar56.e = 1;
        dtqsVar56.a = "conversations.cms_most_recent_read_message_timestamp_ms";
        m56.i(53030);
        dtqsVar56.d = new Supplier() { // from class: afey
            @Override // java.util.function.Supplier
            public final Object get() {
                return afkd.b();
            }
        };
        dtqsVar56.c = new dtsc() { // from class: affj
        };
        m56.a();
        dtsb m57 = dtsd.m();
        dtqs dtqsVar57 = (dtqs) m57;
        dtqsVar57.e = 2;
        dtqsVar57.a = "conversations.rcs_subject_change_timestamp_ms";
        m57.i(46050);
        dtqsVar57.d = new Supplier() { // from class: affu
            @Override // java.util.function.Supplier
            public final Object get() {
                return afkd.b();
            }
        };
        dtqsVar57.c = new dtsc() { // from class: afgf
        };
        m57.a();
        dtsb m58 = dtsd.m();
        dtqs dtqsVar58 = (dtqs) m58;
        dtqsVar58.e = 1;
        dtqsVar58.a = "conversations.rcs_session_allows_revocation";
        m58.i(48040);
        dtqsVar58.d = new Supplier() { // from class: afgl
            @Override // java.util.function.Supplier
            public final Object get() {
                return afkd.b();
            }
        };
        dtqsVar58.c = new dtsc() { // from class: afgm
        };
        m58.a();
        dtsb m59 = dtsd.m();
        dtqs dtqsVar59 = (dtqs) m59;
        dtqsVar59.e = 2;
        dtqsVar59.a = "conversations.rcs_group_capabilities";
        m59.i(49020);
        dtqsVar59.d = new Supplier() { // from class: afgo
            @Override // java.util.function.Supplier
            public final Object get() {
                return afkd.b();
            }
        };
        dtqsVar59.c = new dtsc() { // from class: afgp
        };
        m59.a();
        dtsb m60 = dtsd.m();
        dtqs dtqsVar60 = (dtqs) m60;
        dtqsVar60.e = 1;
        dtqsVar60.a = "conversations.awaiting_reverse_sync";
        m60.i(49060);
        dtqsVar60.d = new Supplier() { // from class: afgr
            @Override // java.util.function.Supplier
            public final Object get() {
                return afkd.b();
            }
        };
        dtqsVar60.c = new dtsc() { // from class: afgs
        };
        m60.a();
        dtsb m61 = dtsd.m();
        dtqs dtqsVar61 = (dtqs) m61;
        dtqsVar61.e = 2;
        m61.d(true);
        m61.e(true);
        dtqsVar61.b = new Supplier() { // from class: afgt
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsom.c.a;
            }
        };
        dtqsVar61.a = "conversations.duplicate_of";
        m61.i(58090);
        dtqsVar61.d = new Supplier() { // from class: afgu
            @Override // java.util.function.Supplier
            public final Object get() {
                return afkd.b();
            }
        };
        dtqsVar61.c = new dtsc() { // from class: afgv
        };
        m61.a();
        dtsb m62 = dtsd.m();
        dtqs dtqsVar62 = (dtqs) m62;
        dtqsVar62.e = 2;
        m62.d(true);
        m62.e(true);
        dtqsVar62.b = new Supplier() { // from class: afgw
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsom.c.a;
            }
        };
        dtqsVar62.a = "conversations.new_duplicate_of";
        m62.i(59130);
        dtqsVar62.d = new Supplier() { // from class: afgx
            @Override // java.util.function.Supplier
            public final Object get() {
                return afkd.b();
            }
        };
        dtqsVar62.c = new dtsc() { // from class: afgz
        };
        m62.a();
        dtsb m63 = dtsd.m();
        dtqs dtqsVar63 = (dtqs) m63;
        dtqsVar63.e = 1;
        dtqsVar63.a = "conversations.error_state";
        m63.i(58140);
        dtqsVar63.d = new Supplier() { // from class: afha
            @Override // java.util.function.Supplier
            public final Object get() {
                return afkd.b();
            }
        };
        dtqsVar63.c = new dtsc() { // from class: afhb
        };
        m63.a();
        dtsb m64 = dtsd.m();
        dtqs dtqsVar64 = (dtqs) m64;
        dtqsVar64.e = 1;
        dtqsVar64.a = "conversations.cms_life_cycle";
        m64.i(58210);
        dtqsVar64.d = new Supplier() { // from class: afhd
            @Override // java.util.function.Supplier
            public final Object get() {
                return afkd.b();
            }
        };
        dtqsVar64.c = new dtsc() { // from class: afhe
        };
        m64.a();
        dtsb m65 = dtsd.m();
        dtqs dtqsVar65 = (dtqs) m65;
        dtqsVar65.e = 4;
        dtqsVar65.a = "conversations.rcs_group_self_msisdn";
        m65.i(58540);
        dtqsVar65.d = new Supplier() { // from class: afhf
            @Override // java.util.function.Supplier
            public final Object get() {
                return afkd.b();
            }
        };
        dtqsVar65.c = new dtsc() { // from class: afhg
        };
        m65.a();
        dtsb m66 = dtsd.m();
        dtqs dtqsVar66 = (dtqs) m66;
        dtqsVar66.e = 2;
        dtqsVar66.a = "conversations.recipient_offline_timestamp_ms";
        m66.i(58750);
        dtqsVar66.d = new Supplier() { // from class: afhh
            @Override // java.util.function.Supplier
            public final Object get() {
                return afkd.b();
            }
        };
        dtqsVar66.c = new dtsc() { // from class: afhi
        };
        m66.a();
        dtsb m67 = dtsd.m();
        dtqs dtqsVar67 = (dtqs) m67;
        dtqsVar67.e = 2;
        dtqsVar67.a = "conversations.rcs_group_last_sync_timestamp";
        m67.i(58910);
        dtqsVar67.d = new Supplier() { // from class: afhk
            @Override // java.util.function.Supplier
            public final Object get() {
                return afkd.b();
            }
        };
        dtqsVar67.c = new dtsc() { // from class: afhl
        };
        m67.a();
        dtsb m68 = dtsd.m();
        dtqs dtqsVar68 = (dtqs) m68;
        dtqsVar68.e = 1;
        dtqsVar68.a = "conversations.has_been_e2ee";
        m68.i(59210);
        dtqsVar68.d = new Supplier() { // from class: afhm
            @Override // java.util.function.Supplier
            public final Object get() {
                return afkd.b();
            }
        };
        dtqsVar68.c = new dtsc() { // from class: afhn
        };
        m68.a();
        dtsb m69 = dtsd.m();
        dtqs dtqsVar69 = (dtqs) m69;
        dtqsVar69.e = 1;
        dtqsVar69.a = "conversations.marked_as_unread";
        m69.i(59220);
        dtqsVar69.d = new Supplier() { // from class: afhp
            @Override // java.util.function.Supplier
            public final Object get() {
                return afkd.b();
            }
        };
        dtqsVar69.c = new dtsc() { // from class: afhq
        };
        m69.a();
        dtsb m70 = dtsd.m();
        dtqs dtqsVar70 = (dtqs) m70;
        dtqsVar70.e = 5;
        dtqsVar70.a = "conversations.custom_theme";
        m70.i(59820);
        dtqsVar70.d = new Supplier() { // from class: afhr
            @Override // java.util.function.Supplier
            public final Object get() {
                return afkd.b();
            }
        };
        dtqsVar70.c = new dtsc() { // from class: afhs
        };
        m70.a();
        dtsb m71 = dtsd.m();
        dtqs dtqsVar71 = (dtqs) m71;
        dtqsVar71.e = 2;
        dtqsVar71.a = "conversations.mms_group_upgrade_status";
        m71.i(60050);
        dtqsVar71.d = new Supplier() { // from class: afht
            @Override // java.util.function.Supplier
            public final Object get() {
                return afkd.b();
            }
        };
        dtqsVar71.c = new dtsc() { // from class: afhv
        };
        m71.a();
        dtsb m72 = dtsd.m();
        dtqs dtqsVar72 = (dtqs) m72;
        dtqsVar72.e = 2;
        dtqsVar72.a = "conversations.mms_group_upgrade_retries";
        m72.i(60050);
        dtqsVar72.d = new Supplier() { // from class: afhw
            @Override // java.util.function.Supplier
            public final Object get() {
                return afkd.b();
            }
        };
        dtqsVar72.c = new dtsc() { // from class: afhx
        };
        m72.a();
        dtsb m73 = dtsd.m();
        dtqs dtqsVar73 = (dtqs) m73;
        dtqsVar73.e = 2;
        dtqsVar73.a = "conversations.encryption_protocol";
        m73.i(60180);
        dtqsVar73.d = new Supplier() { // from class: afhy
            @Override // java.util.function.Supplier
            public final Object get() {
                return afkd.b();
            }
        };
        dtqsVar73.c = new dtsc() { // from class: afhz
        };
        m73.a();
        dtsb m74 = dtsd.m();
        dtqs dtqsVar74 = (dtqs) m74;
        dtqsVar74.e = 4;
        dtqsVar74.a = "conversations.encryption_id";
        m74.i(60210);
        dtqsVar74.d = new Supplier() { // from class: afib
            @Override // java.util.function.Supplier
            public final Object get() {
                return afkd.b();
            }
        };
        dtqsVar74.c = new dtsc() { // from class: afic
        };
        m74.a();
        dtsb m75 = dtsd.m();
        dtqs dtqsVar75 = (dtqs) m75;
        dtqsVar75.e = 4;
        m75.l(true);
        m75.d(true);
        dtqsVar75.a = "conversations.cms_correlation_id";
        m75.f(true);
        m75.i(60250);
        dtqsVar75.d = new Supplier() { // from class: afid
            @Override // java.util.function.Supplier
            public final Object get() {
                return afkd.b();
            }
        };
        dtqsVar75.c = new dtsc() { // from class: afie
        };
        m75.a();
        dtsb m76 = dtsd.m();
        dtqs dtqsVar76 = (dtqs) m76;
        dtqsVar76.e = 4;
        dtqsVar76.a = "conversations.rcs_group_icon_url";
        m76.i(60590);
        dtqsVar76.d = new Supplier() { // from class: afig
            @Override // java.util.function.Supplier
            public final Object get() {
                return afkd.b();
            }
        };
        dtqsVar76.c = new dtsc() { // from class: afih
        };
        m76.a();
        dtsb m77 = dtsd.m();
        dtqs dtqsVar77 = (dtqs) m77;
        dtqsVar77.e = 2;
        dtqsVar77.a = "conversations.unread_count";
        m77.i(60740);
        dtqsVar77.d = new Supplier() { // from class: afii
            @Override // java.util.function.Supplier
            public final Object get() {
                return afkd.b();
            }
        };
        dtqsVar77.c = new dtsc() { // from class: afij
        };
        m77.a();
        dtsb m78 = dtsd.m();
        dtqs dtqsVar78 = (dtqs) m78;
        dtqsVar78.e = 2;
        m78.l(true);
        m78.g(true);
        m78.d(true);
        dtqsVar78.a = "conversation_labels._id";
        m78.i(-1);
        dtqsVar78.d = new Supplier() { // from class: afik
            @Override // java.util.function.Supplier
            public final Object get() {
                return afkd.b();
            }
        };
        dtqsVar78.c = new dtsc() { // from class: afil
        };
        this.b = new afjz(m78.a());
        dtsb m79 = dtsd.m();
        dtqs dtqsVar79 = (dtqs) m79;
        dtqsVar79.e = 2;
        m79.d(true);
        m79.e(true);
        dtqsVar79.b = new Supplier() { // from class: afin
            @Override // java.util.function.Supplier
            public final Object get() {
                return byfi.b.a;
            }
        };
        dtqsVar79.a = "conversation_labels.label";
        m79.f(true);
        m79.i(53020);
        dtqsVar79.d = new Supplier() { // from class: afio
            @Override // java.util.function.Supplier
            public final Object get() {
                return afkd.b();
            }
        };
        dtqsVar79.c = new dtsc() { // from class: afip
        };
        m79.a();
        dtsb m80 = dtsd.m();
        dtqs dtqsVar80 = (dtqs) m80;
        dtqsVar80.e = 2;
        m80.d(true);
        m80.e(true);
        dtqsVar80.b = new Supplier() { // from class: afir
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsom.c.a;
            }
        };
        dtqsVar80.a = "conversation_labels.conversation_id";
        m80.f(true);
        m80.i(-1);
        dtqsVar80.d = new Supplier() { // from class: afis
            @Override // java.util.function.Supplier
            public final Object get() {
                return afkd.b();
            }
        };
        dtqsVar80.c = new dtsc() { // from class: afit
        };
        m80.a();
        dtsb m81 = dtsd.m();
        dtqs dtqsVar81 = (dtqs) m81;
        dtqsVar81.e = 2;
        m81.d(true);
        m81.e(true);
        dtqsVar81.b = new Supplier() { // from class: afiu
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        };
        dtqsVar81.a = "conversation_labels.message_id";
        m81.i(-1);
        dtqsVar81.d = new Supplier() { // from class: afiv
            @Override // java.util.function.Supplier
            public final Object get() {
                return afkd.b();
            }
        };
        dtqsVar81.c = new dtsc() { // from class: afiw
        };
        m81.a();
        dtsb m82 = dtsd.m();
        dtqs dtqsVar82 = (dtqs) m82;
        dtqsVar82.e = 4;
        dtqsVar82.a = "conversation_labels.snippet_text";
        m82.i(53010);
        dtqsVar82.d = new Supplier() { // from class: afix
            @Override // java.util.function.Supplier
            public final Object get() {
                return afkd.b();
            }
        };
        dtqsVar82.c = new dtsc() { // from class: afiz
        };
        m82.a();
        dtsb m83 = dtsd.m();
        dtqs dtqsVar83 = (dtqs) m83;
        dtqsVar83.e = 4;
        dtqsVar83.a = "conversation_labels.preview_uri";
        m83.i(55040);
        dtqsVar83.d = new Supplier() { // from class: afja
            @Override // java.util.function.Supplier
            public final Object get() {
                return afkd.b();
            }
        };
        dtqsVar83.c = new dtsc() { // from class: afjc
        };
        m83.a();
        dtsb m84 = dtsd.m();
        dtqs dtqsVar84 = (dtqs) m84;
        dtqsVar84.e = 4;
        dtqsVar84.a = "conversation_labels.preview_content_type";
        m84.i(55040);
        dtqsVar84.d = new Supplier() { // from class: afjd
            @Override // java.util.function.Supplier
            public final Object get() {
                return afkd.b();
            }
        };
        dtqsVar84.c = new dtsc() { // from class: afje
        };
        m84.a();
        dtsb m85 = dtsd.m();
        dtqs dtqsVar85 = (dtqs) m85;
        dtqsVar85.e = 2;
        dtqsVar85.a = "conversation_labels.message_status";
        m85.i(57050);
        dtqsVar85.d = new Supplier() { // from class: afjf
            @Override // java.util.function.Supplier
            public final Object get() {
                return afkd.b();
            }
        };
        dtqsVar85.c = new dtsc() { // from class: afjg
        };
        m85.a();
        dtsb m86 = dtsd.m();
        dtqs dtqsVar86 = (dtqs) m86;
        dtqsVar86.e = 2;
        dtqsVar86.a = "conversation_labels.read";
        m86.i(57050);
        dtqsVar86.d = new Supplier() { // from class: afjh
            @Override // java.util.function.Supplier
            public final Object get() {
                return afkd.b();
            }
        };
        dtqsVar86.c = new dtsc() { // from class: afji
        };
        m86.a();
        dtsb m87 = dtsd.m();
        dtqs dtqsVar87 = (dtqs) m87;
        dtqsVar87.e = 2;
        dtqsVar87.a = "conversation_labels.received_timestamp";
        m87.i(57050);
        dtqsVar87.d = new Supplier() { // from class: afjj
            @Override // java.util.function.Supplier
            public final Object get() {
                return afkd.b();
            }
        };
        dtqsVar87.c = new dtsc() { // from class: afjl
        };
        m87.a();
        dtsb m88 = dtsd.m();
        dtqs dtqsVar88 = (dtqs) m88;
        dtqsVar88.e = 2;
        dtqsVar88.a = "conversation_labels.message_protocol";
        m88.i(57050);
        dtqsVar88.d = new Supplier() { // from class: afjn
            @Override // java.util.function.Supplier
            public final Object get() {
                return afkd.b();
            }
        };
        dtqsVar88.c = new dtsc() { // from class: afjo
        };
        m88.a();
        dtsb m89 = dtsd.m();
        dtqs dtqsVar89 = (dtqs) m89;
        dtqsVar89.e = 2;
        dtqsVar89.a = "conversation_labels.raw_telephony_status";
        m89.i(57050);
        dtqsVar89.d = new Supplier() { // from class: afjp
            @Override // java.util.function.Supplier
            public final Object get() {
                return afkd.b();
            }
        };
        dtqsVar89.c = new dtsc() { // from class: afjq
        };
        m89.a();
    }
}
