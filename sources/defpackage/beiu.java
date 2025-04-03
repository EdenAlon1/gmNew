package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.queries.ConversationIdsQuery;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class beiu {
    public final beiv a;

    public beiu() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 2;
        m.l(true);
        m.g(true);
        m.d(true);
        dtqsVar.a = "conversations._id";
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: becq
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dtqsVar.c = new dtsc() { // from class: beho
        };
        this.a = new beiv(m.a());
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 1;
        m2.d(true);
        dtqsVar2.a = "conversations.sms_thread_id";
        m2.i(-1);
        dtqsVar2.d = new Supplier() { // from class: beia
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: beim
        };
        m2.a();
        dtsb m3 = dtsd.m();
        dtqs dtqsVar3 = (dtqs) m3;
        dtqsVar3.e = 4;
        dtqsVar3.a = "conversations.name";
        m3.i(-1);
        dtqsVar3.d = new Supplier() { // from class: becv
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dtqsVar3.c = new dtsc() { // from class: bedh
        };
        m3.a();
        dtsb m4 = dtsd.m();
        dtqs dtqsVar4 = (dtqs) m4;
        dtqsVar4.e = 2;
        dtqsVar4.a = "conversations.name_is_automatic";
        m4.i(10012);
        dtqsVar4.d = new Supplier() { // from class: bedt
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dtqsVar4.c = new dtsc() { // from class: beef
        };
        m4.a();
        dtsb m5 = dtsd.m();
        dtqs dtqsVar5 = (dtqs) m5;
        dtqsVar5.e = 4;
        dtqsVar5.a = "conversations.subtitle";
        m5.i(59760);
        dtqsVar5.d = new Supplier() { // from class: beer
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dtqsVar5.c = new dtsc() { // from class: befd
        };
        m5.a();
        dtsb m6 = dtsd.m();
        dtqs dtqsVar6 = (dtqs) m6;
        dtqsVar6.e = 1;
        dtqsVar6.a = "conversations.latest_message_id";
        m6.i(-1);
        dtqsVar6.d = new Supplier() { // from class: bedm
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dtqsVar6.c = new dtsc() { // from class: befm
        };
        m6.a();
        dtsb m7 = dtsd.m();
        dtqs dtqsVar7 = (dtqs) m7;
        dtqsVar7.e = 4;
        dtqsVar7.a = "conversations.snippet_text";
        m7.i(-1);
        dtqsVar7.d = new Supplier() { // from class: befy
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dtqsVar7.c = new dtsc() { // from class: begk
        };
        m7.a();
        dtsb m8 = dtsd.m();
        dtqs dtqsVar8 = (dtqs) m8;
        dtqsVar8.e = 4;
        dtqsVar8.a = "conversations.subject_text";
        m8.i(-1);
        dtqsVar8.d = new Supplier() { // from class: begw
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dtqsVar8.c = new dtsc() { // from class: behi
        };
        m8.a();
        dtsb m9 = dtsd.m();
        dtqs dtqsVar9 = (dtqs) m9;
        dtqsVar9.e = 4;
        dtqsVar9.a = "conversations.preview_uri";
        m9.i(-1);
        dtqsVar9.d = new Supplier() { // from class: behj
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dtqsVar9.c = new dtsc() { // from class: behk
        };
        m9.a();
        dtsb m10 = dtsd.m();
        dtqs dtqsVar10 = (dtqs) m10;
        dtqsVar10.e = 4;
        dtqsVar10.a = "conversations.preview_content_type";
        m10.i(-1);
        dtqsVar10.d = new Supplier() { // from class: behl
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dtqsVar10.c = new dtsc() { // from class: behn
        };
        m10.a();
        dtsb m11 = dtsd.m();
        dtqs dtqsVar11 = (dtqs) m11;
        dtqsVar11.e = 1;
        dtqsVar11.a = "conversations.show_draft";
        m11.i(-1);
        dtqsVar11.d = new Supplier() { // from class: behp
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dtqsVar11.c = new dtsc() { // from class: behq
        };
        m11.a();
        dtsb m12 = dtsd.m();
        dtqs dtqsVar12 = (dtqs) m12;
        dtqsVar12.e = 4;
        dtqsVar12.a = "conversations.draft_snippet_text";
        m12.i(-1);
        dtqsVar12.d = new Supplier() { // from class: behr
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dtqsVar12.c = new dtsc() { // from class: behs
        };
        m12.a();
        dtsb m13 = dtsd.m();
        dtqs dtqsVar13 = (dtqs) m13;
        dtqsVar13.e = 4;
        dtqsVar13.a = "conversations.draft_subject_text";
        m13.i(-1);
        dtqsVar13.d = new Supplier() { // from class: beht
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dtqsVar13.c = new dtsc() { // from class: behu
        };
        m13.a();
        dtsb m14 = dtsd.m();
        dtqs dtqsVar14 = (dtqs) m14;
        dtqsVar14.e = 4;
        dtqsVar14.a = "conversations.draft_preview_uri";
        m14.i(-1);
        dtqsVar14.d = new Supplier() { // from class: behv
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dtqsVar14.c = new dtsc() { // from class: behw
        };
        m14.a();
        dtsb m15 = dtsd.m();
        dtqs dtqsVar15 = (dtqs) m15;
        dtqsVar15.e = 4;
        dtqsVar15.a = "conversations.draft_preview_content_type";
        m15.i(-1);
        dtqsVar15.d = new Supplier() { // from class: behy
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dtqsVar15.c = new dtsc() { // from class: behz
        };
        m15.a();
        dtsb m16 = dtsd.m();
        dtqs dtqsVar16 = (dtqs) m16;
        dtqsVar16.e = 1;
        dtqsVar16.a = "conversations.etouffee_default";
        m16.i(29060);
        dtqsVar16.d = new Supplier() { // from class: beib
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dtqsVar16.c = new dtsc() { // from class: beic
        };
        m16.a();
        dtsb m17 = dtsd.m();
        dtqs dtqsVar17 = (dtqs) m17;
        dtqsVar17.e = 1;
        m17.d(true);
        dtqsVar17.a = "conversations.archive_status";
        m17.i(-1);
        dtqsVar17.d = new Supplier() { // from class: beid
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dtqsVar17.c = new dtsc() { // from class: beie
        };
        m17.a();
        dtsb m18 = dtsd.m();
        dtqs dtqsVar18 = (dtqs) m18;
        dtqsVar18.e = 1;
        m18.d(true);
        dtqsVar18.a = "conversations.sort_timestamp";
        m18.i(-1);
        dtqsVar18.d = new Supplier() { // from class: beif
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dtqsVar18.c = new dtsc() { // from class: beig
        };
        m18.a();
        dtsb m19 = dtsd.m();
        dtqs dtqsVar19 = (dtqs) m19;
        dtqsVar19.e = 1;
        dtqsVar19.a = "conversations.last_read_timestamp";
        m19.i(-1);
        dtqsVar19.d = new Supplier() { // from class: beih
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dtqsVar19.c = new dtsc() { // from class: beij
        };
        m19.a();
        dtsb m20 = dtsd.m();
        dtqs dtqsVar20 = (dtqs) m20;
        dtqsVar20.e = 4;
        dtqsVar20.a = "conversations.icon";
        m20.i(-1);
        dtqsVar20.d = new Supplier() { // from class: beik
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dtqsVar20.c = new dtsc() { // from class: beil
        };
        m20.a();
        dtsb m21 = dtsd.m();
        dtqs dtqsVar21 = (dtqs) m21;
        dtqsVar21.e = 1;
        dtqsVar21.a = "conversations.participant_contact_id";
        m21.i(-1);
        dtqsVar21.d = new Supplier() { // from class: bein
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dtqsVar21.c = new dtsc() { // from class: beio
        };
        m21.a();
        dtsb m22 = dtsd.m();
        dtqs dtqsVar22 = (dtqs) m22;
        dtqsVar22.e = 1;
        dtqsVar22.a = "conversations.normalized_participant_contact_id";
        m22.i(58090);
        dtqsVar22.d = new Supplier() { // from class: beip
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dtqsVar22.c = new dtsc() { // from class: beiq
        };
        m22.a();
        dtsb m23 = dtsd.m();
        dtqs dtqsVar23 = (dtqs) m23;
        dtqsVar23.e = 4;
        dtqsVar23.a = "conversations.participant_lookup_key";
        m23.i(-1);
        dtqsVar23.d = new Supplier() { // from class: beir
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dtqsVar23.c = new dtsc() { // from class: beis
        };
        m23.a();
        dtsb m24 = dtsd.m();
        dtqs dtqsVar24 = (dtqs) m24;
        dtqsVar24.e = 4;
        dtqsVar24.a = "conversations.normalized_participant_lookup_key";
        m24.i(58090);
        dtqsVar24.d = new Supplier() { // from class: becr
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dtqsVar24.c = new dtsc() { // from class: becs
        };
        m24.a();
        dtsb m25 = dtsd.m();
        dtqs dtqsVar25 = (dtqs) m25;
        dtqsVar25.e = 4;
        m25.d(true);
        dtqsVar25.a = "conversations.participant_normalized_destination";
        m25.i(-1);
        dtqsVar25.d = new Supplier() { // from class: bect
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dtqsVar25.c = new dtsc() { // from class: becu
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
        dtqsVar26.d = new Supplier() { // from class: becw
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dtqsVar26.c = new dtsc() { // from class: becx
        };
        m26.a();
        dtsb m27 = dtsd.m();
        dtqs dtqsVar27 = (dtqs) m27;
        dtqsVar27.e = 4;
        dtqsVar27.a = "conversations.current_self_id";
        m27.i(-1);
        dtqsVar27.d = new Supplier() { // from class: becy
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dtqsVar27.c = new dtsc() { // from class: becz
        };
        m27.a();
        dtsb m28 = dtsd.m();
        dtqs dtqsVar28 = (dtqs) m28;
        dtqsVar28.e = 4;
        dtqsVar28.a = "conversations.current_my_identity";
        m28.i(59810);
        dtqsVar28.d = new Supplier() { // from class: beda
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dtqsVar28.c = new dtsc() { // from class: bedc
        };
        m28.a();
        dtsb m29 = dtsd.m();
        dtqs dtqsVar29 = (dtqs) m29;
        dtqsVar29.e = 4;
        m29.d(true);
        m29.e(true);
        dtqsVar29.b = new Supplier() { // from class: bedd
            @Override // java.util.function.Supplier
            public final Object get() {
                return azoi.c.a;
            }
        };
        dtqsVar29.a = "conversations.current_my_identity_foreign_key";
        m29.i(60160);
        dtqsVar29.d = new Supplier() { // from class: bede
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dtqsVar29.c = new dtsc() { // from class: bedf
        };
        m29.a();
        dtsb m30 = dtsd.m();
        dtqs dtqsVar30 = (dtqs) m30;
        dtqsVar30.e = 4;
        m30.d(true);
        m30.e(true);
        dtqsVar30.b = new Supplier() { // from class: bedg
            @Override // java.util.function.Supplier
            public final Object get() {
                return azdt.b.a;
            }
        };
        dtqsVar30.a = "conversations.destination_token";
        m30.i(60360);
        dtqsVar30.d = new Supplier() { // from class: bedi
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dtqsVar30.c = new dtsc() { // from class: bedj
        };
        m30.a();
        dtsb m31 = dtsd.m();
        dtqs dtqsVar31 = (dtqs) m31;
        dtqsVar31.e = 1;
        dtqsVar31.a = "conversations.participant_count";
        m31.i(-1);
        dtqsVar31.d = new Supplier() { // from class: bedk
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dtqsVar31.c = new dtsc() { // from class: bedl
        };
        m31.a();
        dtsb m32 = dtsd.m();
        dtqs dtqsVar32 = (dtqs) m32;
        dtqsVar32.e = 1;
        dtqsVar32.a = "conversations.notification_enabled";
        m32.i(-1);
        dtqsVar32.d = new Supplier() { // from class: bedn
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dtqsVar32.c = new dtsc() { // from class: bedo
        };
        m32.a();
        dtsb m33 = dtsd.m();
        dtqs dtqsVar33 = (dtqs) m33;
        dtqsVar33.e = 4;
        dtqsVar33.a = "conversations.notification_sound_uri";
        m33.i(-1);
        dtqsVar33.d = new Supplier() { // from class: bedp
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dtqsVar33.c = new dtsc() { // from class: bedq
        };
        m33.a();
        dtsb m34 = dtsd.m();
        dtqs dtqsVar34 = (dtqs) m34;
        dtqsVar34.e = 1;
        dtqsVar34.a = "conversations.notification_vibration";
        m34.i(-1);
        dtqsVar34.d = new Supplier() { // from class: bedr
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dtqsVar34.c = new dtsc() { // from class: beds
        };
        m34.a();
        dtsb m35 = dtsd.m();
        dtqs dtqsVar35 = (dtqs) m35;
        dtqsVar35.e = 1;
        dtqsVar35.a = "conversations.include_email_addr";
        m35.i(-1);
        dtqsVar35.d = new Supplier() { // from class: bedu
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dtqsVar35.c = new dtsc() { // from class: bedv
        };
        m35.a();
        dtsb m36 = dtsd.m();
        dtqs dtqsVar36 = (dtqs) m36;
        dtqsVar36.e = 4;
        dtqsVar36.a = "conversations.sms_service_center";
        m36.i(-1);
        dtqsVar36.d = new Supplier() { // from class: bedw
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dtqsVar36.c = new dtsc() { // from class: bedy
        };
        m36.a();
        dtsb m37 = dtsd.m();
        dtqs dtqsVar37 = (dtqs) m37;
        dtqsVar37.e = 4;
        dtqsVar37.a = "conversations.participant_id_list";
        m37.i(8500);
        dtqsVar37.d = new Supplier() { // from class: bedz
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dtqsVar37.c = new dtsc() { // from class: beea
        };
        m37.a();
        dtsb m38 = dtsd.m();
        dtqs dtqsVar38 = (dtqs) m38;
        dtqsVar38.e = 4;
        m38.l(true);
        m38.d(true);
        dtqsVar38.a = "conversations.normalized_participant_id_list";
        m38.f(true);
        m38.i(58090);
        dtqsVar38.d = new Supplier() { // from class: beeb
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dtqsVar38.c = new dtsc() { // from class: beec
        };
        m38.a();
        dtsb m39 = dtsd.m();
        dtqs dtqsVar39 = (dtqs) m39;
        dtqsVar39.e = 1;
        dtqsVar39.a = "conversations.source_type";
        m39.i(8500);
        dtqsVar39.d = new Supplier() { // from class: beed
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dtqsVar39.c = new dtsc() { // from class: beee
        };
        m39.a();
        dtsb m40 = dtsd.m();
        dtqs dtqsVar40 = (dtqs) m40;
        dtqsVar40.e = 1;
        m40.d(true);
        dtqsVar40.a = "conversations.rcs_session_id";
        m40.i(10000);
        dtqsVar40.d = new Supplier() { // from class: beeg
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dtqsVar40.c = new dtsc() { // from class: beeh
        };
        m40.a();
        dtsb m41 = dtsd.m();
        dtqs dtqsVar41 = (dtqs) m41;
        dtqsVar41.e = 1;
        dtqsVar41.a = "conversations.join_state";
        m41.i(10006);
        dtqsVar41.d = new Supplier() { // from class: beej
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dtqsVar41.c = new dtsc() { // from class: beek
        };
        m41.a();
        dtsb m42 = dtsd.m();
        dtqs dtqsVar42 = (dtqs) m42;
        dtqsVar42.e = 1;
        dtqsVar42.a = "conversations.conv_type";
        m42.i(10007);
        dtqsVar42.d = new Supplier() { // from class: beel
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dtqsVar42.c = new dtsc() { // from class: beem
        };
        m42.a();
        dtsb m43 = dtsd.m();
        dtqs dtqsVar43 = (dtqs) m43;
        dtqsVar43.e = 1;
        dtqsVar43.a = "conversations.send_mode";
        m43.i(10016);
        dtqsVar43.d = new Supplier() { // from class: been
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dtqsVar43.c = new dtsc() { // from class: beeo
        };
        m43.a();
        dtsb m44 = dtsd.m();
        dtqs dtqsVar44 = (dtqs) m44;
        dtqsVar44.e = 1;
        dtqsVar44.a = "conversations.IS_ENTERPRISE";
        m44.i(10018);
        dtqsVar44.d = new Supplier() { // from class: beep
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dtqsVar44.c = new dtsc() { // from class: beeq
        };
        m44.a();
        dtsb m45 = dtsd.m();
        dtqs dtqsVar45 = (dtqs) m45;
        dtqsVar45.e = 1;
        dtqsVar45.a = "conversations.has_ea2p_bot_recipient";
        m45.i(12001);
        dtqsVar45.d = new Supplier() { // from class: bees
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dtqsVar45.c = new dtsc() { // from class: beeu
        };
        m45.a();
        dtsb m46 = dtsd.m();
        dtqs dtqsVar46 = (dtqs) m46;
        dtqsVar46.e = 1;
        dtqsVar46.a = "conversations.last_interactive_event_timestamp";
        m46.i(15000);
        dtqsVar46.d = new Supplier() { // from class: beev
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dtqsVar46.c = new dtsc() { // from class: beew
        };
        m46.a();
        dtsb m47 = dtsd.m();
        dtqs dtqsVar47 = (dtqs) m47;
        dtqsVar47.e = 4;
        dtqsVar47.a = "conversations.participant_display_destination";
        m47.i(15010);
        dtqsVar47.d = new Supplier() { // from class: beex
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dtqsVar47.c = new dtsc() { // from class: beey
        };
        m47.a();
        dtsb m48 = dtsd.m();
        dtqs dtqsVar48 = (dtqs) m48;
        dtqsVar48.e = 4;
        dtqsVar48.a = "conversations.normalized_participant_display_destination";
        m48.i(58090);
        dtqsVar48.d = new Supplier() { // from class: beez
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dtqsVar48.c = new dtsc() { // from class: befa
        };
        m48.a();
        dtsb m49 = dtsd.m();
        dtqs dtqsVar49 = (dtqs) m49;
        dtqsVar49.e = 1;
        dtqsVar49.a = "conversations.spam_warning_dismiss_status";
        m49.i(23000);
        dtqsVar49.d = new Supplier() { // from class: befb
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dtqsVar49.c = new dtsc() { // from class: befc
        };
        m49.a();
        dtsb m50 = dtsd.m();
        dtqs dtqsVar50 = (dtqs) m50;
        dtqsVar50.e = 1;
        dtqsVar50.a = "conversations.open_count";
        m50.i(26020);
        dtqsVar50.d = new Supplier() { // from class: befj
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dtqsVar50.c = new dtsc() { // from class: befu
        };
        m50.a();
        dtsb m51 = dtsd.m();
        dtqs dtqsVar51 = (dtqs) m51;
        dtqsVar51.e = 1;
        dtqsVar51.a = "conversations.last_logged_scooby_metadata_timestamp";
        m51.i(28010);
        dtqsVar51.d = new Supplier() { // from class: begf
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dtqsVar51.c = new dtsc() { // from class: begq
        };
        m51.a();
        dtsb m52 = dtsd.m();
        dtqs dtqsVar52 = (dtqs) m52;
        dtqsVar52.e = 1;
        m52.d(true);
        dtqsVar52.a = "conversations.delete_timestamp";
        m52.i(29020);
        dtqsVar52.d = new Supplier() { // from class: behb
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dtqsVar52.c = new dtsc() { // from class: behm
        };
        m52.a();
        dtsb m53 = dtsd.m();
        dtqs dtqsVar53 = (dtqs) m53;
        dtqsVar53.e = 4;
        m53.l(true);
        m53.d(true);
        dtqsVar53.a = "conversations.cms_id";
        m53.f(true);
        m53.i(32000);
        dtqsVar53.d = new Supplier() { // from class: behx
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dtqsVar53.c = new dtsc() { // from class: beii
        };
        m53.a();
        dtsb m54 = dtsd.m();
        dtqs dtqsVar54 = (dtqs) m54;
        dtqsVar54.e = 4;
        m54.d(true);
        dtqsVar54.a = "conversations.rcs_group_id";
        m54.i(40050);
        dtqsVar54.d = new Supplier() { // from class: beit
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dtqsVar54.c = new dtsc() { // from class: bedb
        };
        m54.a();
        dtsb m55 = dtsd.m();
        dtqs dtqsVar55 = (dtqs) m55;
        dtqsVar55.e = 4;
        dtqsVar55.a = "conversations.rcs_conference_uri";
        m55.i(40050);
        dtqsVar55.d = new Supplier() { // from class: bedx
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dtqsVar55.c = new dtsc() { // from class: beei
        };
        m55.a();
        dtsb m56 = dtsd.m();
        dtqs dtqsVar56 = (dtqs) m56;
        dtqsVar56.e = 5;
        dtqsVar56.a = "conversations.tachygram_group_routing_info_token";
        m56.i(58120);
        dtqsVar56.d = new Supplier() { // from class: beet
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dtqsVar56.c = new dtsc() { // from class: befe
        };
        m56.a();
        dtsb m57 = dtsd.m();
        dtqs dtqsVar57 = (dtqs) m57;
        dtqsVar57.e = 1;
        dtqsVar57.a = "conversations.cms_most_recent_read_message_timestamp_ms";
        m57.i(53030);
        dtqsVar57.d = new Supplier() { // from class: beff
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dtqsVar57.c = new dtsc() { // from class: befg
        };
        m57.a();
        dtsb m58 = dtsd.m();
        dtqs dtqsVar58 = (dtqs) m58;
        dtqsVar58.e = 2;
        dtqsVar58.a = "conversations.rcs_subject_change_timestamp_ms";
        m58.i(46050);
        dtqsVar58.d = new Supplier() { // from class: befh
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dtqsVar58.c = new dtsc() { // from class: befi
        };
        m58.a();
        dtsb m59 = dtsd.m();
        dtqs dtqsVar59 = (dtqs) m59;
        dtqsVar59.e = 1;
        dtqsVar59.a = "conversations.rcs_session_allows_revocation";
        m59.i(48040);
        dtqsVar59.d = new Supplier() { // from class: befk
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dtqsVar59.c = new dtsc() { // from class: befl
        };
        m59.a();
        dtsb m60 = dtsd.m();
        dtqs dtqsVar60 = (dtqs) m60;
        dtqsVar60.e = 2;
        dtqsVar60.a = "conversations.rcs_group_capabilities";
        m60.i(49020);
        dtqsVar60.d = new Supplier() { // from class: befn
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dtqsVar60.c = new dtsc() { // from class: befo
        };
        m60.a();
        dtsb m61 = dtsd.m();
        dtqs dtqsVar61 = (dtqs) m61;
        dtqsVar61.e = 1;
        dtqsVar61.a = "conversations.awaiting_reverse_sync";
        m61.i(49060);
        dtqsVar61.d = new Supplier() { // from class: befp
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dtqsVar61.c = new dtsc() { // from class: befq
        };
        m61.a();
        dtsb m62 = dtsd.m();
        dtqs dtqsVar62 = (dtqs) m62;
        dtqsVar62.e = 2;
        m62.d(true);
        m62.e(true);
        dtqsVar62.b = new Supplier() { // from class: befr
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsom.c.a;
            }
        };
        dtqsVar62.a = "conversations.duplicate_of";
        m62.i(58090);
        dtqsVar62.d = new Supplier() { // from class: befs
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dtqsVar62.c = new dtsc() { // from class: beft
        };
        m62.a();
        dtsb m63 = dtsd.m();
        dtqs dtqsVar63 = (dtqs) m63;
        dtqsVar63.e = 2;
        m63.d(true);
        m63.e(true);
        dtqsVar63.b = new Supplier() { // from class: befv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsom.c.a;
            }
        };
        dtqsVar63.a = "conversations.new_duplicate_of";
        m63.i(59130);
        dtqsVar63.d = new Supplier() { // from class: befw
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dtqsVar63.c = new dtsc() { // from class: befx
        };
        m63.a();
        dtsb m64 = dtsd.m();
        dtqs dtqsVar64 = (dtqs) m64;
        dtqsVar64.e = 1;
        dtqsVar64.a = "conversations.error_state";
        m64.i(58140);
        dtqsVar64.d = new Supplier() { // from class: befz
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dtqsVar64.c = new dtsc() { // from class: bega
        };
        m64.a();
        dtsb m65 = dtsd.m();
        dtqs dtqsVar65 = (dtqs) m65;
        dtqsVar65.e = 1;
        dtqsVar65.a = "conversations.cms_life_cycle";
        m65.i(58210);
        dtqsVar65.d = new Supplier() { // from class: begb
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dtqsVar65.c = new dtsc() { // from class: begc
        };
        m65.a();
        dtsb m66 = dtsd.m();
        dtqs dtqsVar66 = (dtqs) m66;
        dtqsVar66.e = 4;
        dtqsVar66.a = "conversations.rcs_group_self_msisdn";
        m66.i(58540);
        dtqsVar66.d = new Supplier() { // from class: begd
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dtqsVar66.c = new dtsc() { // from class: bege
        };
        m66.a();
        dtsb m67 = dtsd.m();
        dtqs dtqsVar67 = (dtqs) m67;
        dtqsVar67.e = 2;
        dtqsVar67.a = "conversations.recipient_offline_timestamp_ms";
        m67.i(58750);
        dtqsVar67.d = new Supplier() { // from class: begg
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dtqsVar67.c = new dtsc() { // from class: begh
        };
        m67.a();
        dtsb m68 = dtsd.m();
        dtqs dtqsVar68 = (dtqs) m68;
        dtqsVar68.e = 2;
        dtqsVar68.a = "conversations.rcs_group_last_sync_timestamp";
        m68.i(58910);
        dtqsVar68.d = new Supplier() { // from class: begi
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dtqsVar68.c = new dtsc() { // from class: begj
        };
        m68.a();
        dtsb m69 = dtsd.m();
        dtqs dtqsVar69 = (dtqs) m69;
        dtqsVar69.e = 1;
        dtqsVar69.a = "conversations.has_been_e2ee";
        m69.i(59210);
        dtqsVar69.d = new Supplier() { // from class: begl
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dtqsVar69.c = new dtsc() { // from class: begm
        };
        m69.a();
        dtsb m70 = dtsd.m();
        dtqs dtqsVar70 = (dtqs) m70;
        dtqsVar70.e = 1;
        dtqsVar70.a = "conversations.marked_as_unread";
        m70.i(59220);
        dtqsVar70.d = new Supplier() { // from class: begn
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dtqsVar70.c = new dtsc() { // from class: bego
        };
        m70.a();
        dtsb m71 = dtsd.m();
        dtqs dtqsVar71 = (dtqs) m71;
        dtqsVar71.e = 5;
        dtqsVar71.a = "conversations.custom_theme";
        m71.i(59820);
        dtqsVar71.d = new Supplier() { // from class: begp
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dtqsVar71.c = new dtsc() { // from class: begr
        };
        m71.a();
        dtsb m72 = dtsd.m();
        dtqs dtqsVar72 = (dtqs) m72;
        dtqsVar72.e = 2;
        dtqsVar72.a = "conversations.mms_group_upgrade_status";
        m72.i(60050);
        dtqsVar72.d = new Supplier() { // from class: begs
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dtqsVar72.c = new dtsc() { // from class: begt
        };
        m72.a();
        dtsb m73 = dtsd.m();
        dtqs dtqsVar73 = (dtqs) m73;
        dtqsVar73.e = 2;
        dtqsVar73.a = "conversations.mms_group_upgrade_retries";
        m73.i(60050);
        dtqsVar73.d = new Supplier() { // from class: begu
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dtqsVar73.c = new dtsc() { // from class: begv
        };
        m73.a();
        dtsb m74 = dtsd.m();
        dtqs dtqsVar74 = (dtqs) m74;
        dtqsVar74.e = 2;
        dtqsVar74.a = "conversations.encryption_protocol";
        m74.i(60180);
        dtqsVar74.d = new Supplier() { // from class: begx
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dtqsVar74.c = new dtsc() { // from class: begy
        };
        m74.a();
        dtsb m75 = dtsd.m();
        dtqs dtqsVar75 = (dtqs) m75;
        dtqsVar75.e = 4;
        dtqsVar75.a = "conversations.encryption_id";
        m75.i(60210);
        dtqsVar75.d = new Supplier() { // from class: begz
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dtqsVar75.c = new dtsc() { // from class: beha
        };
        m75.a();
        dtsb m76 = dtsd.m();
        dtqs dtqsVar76 = (dtqs) m76;
        dtqsVar76.e = 4;
        m76.l(true);
        m76.d(true);
        dtqsVar76.a = "conversations.cms_correlation_id";
        m76.f(true);
        m76.i(60250);
        dtqsVar76.d = new Supplier() { // from class: behc
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dtqsVar76.c = new dtsc() { // from class: behd
        };
        m76.a();
        dtsb m77 = dtsd.m();
        dtqs dtqsVar77 = (dtqs) m77;
        dtqsVar77.e = 4;
        dtqsVar77.a = "conversations.rcs_group_icon_url";
        m77.i(60590);
        dtqsVar77.d = new Supplier() { // from class: behe
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dtqsVar77.c = new dtsc() { // from class: behf
        };
        m77.a();
        dtsb m78 = dtsd.m();
        dtqs dtqsVar78 = (dtqs) m78;
        dtqsVar78.e = 2;
        dtqsVar78.a = "conversations.unread_count";
        m78.i(60740);
        dtqsVar78.d = new Supplier() { // from class: behg
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationIdsQuery.a();
            }
        };
        dtqsVar78.c = new dtsc() { // from class: behh
        };
        m78.a();
    }
}
