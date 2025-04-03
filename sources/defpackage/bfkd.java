package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bfkd {
    public final bfke a;
    public final bfke b;
    public final bfke c;

    public bfkd() {
        dtsb m = dtsd.m();
        m.m(2);
        m.l(true);
        m.g(true);
        m.d(true);
        m.b("conversations._id");
        m.i(-1);
        m.c(new Supplier() { // from class: beji
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m.j(new dtsc() { // from class: bejv
        });
        this.a = new bfke(m.a());
        dtsb m2 = dtsd.m();
        m2.m(1);
        m2.d(true);
        m2.b("conversations.sms_thread_id");
        m2.i(-1);
        m2.c(new Supplier() { // from class: beoo
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m2.j(new dtsc() { // from class: beth
        });
        m2.a();
        dtsb m3 = dtsd.m();
        m3.m(4);
        m3.b("conversations.name");
        m3.i(-1);
        m3.c(new Supplier() { // from class: beya
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m3.j(new dtsc() { // from class: bfct
        });
        m3.a();
        dtsb m4 = dtsd.m();
        m4.m(2);
        m4.b("conversations.name_is_automatic");
        m4.i(10012);
        m4.c(new Supplier() { // from class: bfhj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m4.j(new dtsc() { // from class: bfhv
        });
        m4.a();
        dtsb m5 = dtsd.m();
        m5.m(4);
        m5.b("conversations.snippet_text");
        m5.i(-1);
        m5.c(new Supplier() { // from class: bfih
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m5.j(new dtsc() { // from class: bfit
        });
        m5.a();
        dtsb m6 = dtsd.m();
        m6.m(4);
        m6.b("conversations.subject_text");
        m6.i(-1);
        m6.c(new Supplier() { // from class: beke
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m6.j(new dtsc() { // from class: beow
        });
        m6.a();
        dtsb m7 = dtsd.m();
        m7.m(4);
        m7.b("conversations.preview_uri");
        m7.i(-1);
        m7.c(new Supplier() { // from class: beto
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m7.j(new dtsc() { // from class: beyg
        });
        m7.a();
        dtsb m8 = dtsd.m();
        m8.m(4);
        m8.b("conversations.preview_content_type");
        m8.i(-1);
        m8.c(new Supplier() { // from class: bfcy
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m8.j(new dtsc() { // from class: bfhq
        });
        m8.a();
        dtsb m9 = dtsd.m();
        m9.m(1);
        m9.b("conversations.show_draft");
        m9.i(-1);
        m9.c(new Supplier() { // from class: bfjd
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m9.j(new dtsc() { // from class: bfjp
        });
        m9.a();
        dtsb m10 = dtsd.m();
        m10.m(4);
        m10.b("conversations.draft_snippet_text");
        m10.i(-1);
        m10.c(new Supplier() { // from class: bfkb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m10.j(new dtsc() { // from class: beju
        });
        m10.a();
        dtsb m11 = dtsd.m();
        m11.m(4);
        m11.b("conversations.draft_subject_text");
        m11.i(-1);
        m11.c(new Supplier() { // from class: bekh
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m11.j(new dtsc() { // from class: bekt
        });
        m11.a();
        dtsb m12 = dtsd.m();
        m12.m(4);
        m12.b("conversations.draft_preview_uri");
        m12.i(-1);
        m12.c(new Supplier() { // from class: belf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m12.j(new dtsc() { // from class: belr
        });
        m12.a();
        dtsb m13 = dtsd.m();
        m13.m(4);
        m13.b("conversations.draft_preview_content_type");
        m13.i(-1);
        m13.c(new Supplier() { // from class: bemd
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m13.j(new dtsc() { // from class: bemp
        });
        m13.a();
        dtsb m14 = dtsd.m();
        m14.m(1);
        m14.b("conversations.etouffee_default");
        m14.i(29060);
        m14.c(new Supplier() { // from class: benb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m14.j(new dtsc() { // from class: benn
        });
        m14.a();
        dtsb m15 = dtsd.m();
        m15.m(1);
        m15.d(true);
        m15.b("conversations.archive_status");
        m15.i(-1);
        m15.c(new Supplier() { // from class: beob
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m15.j(new dtsc() { // from class: beon
        });
        m15.a();
        dtsb m16 = dtsd.m();
        m16.m(1);
        m16.d(true);
        m16.b("conversations.sort_timestamp");
        m16.i(-1);
        m16.c(new Supplier() { // from class: bepa
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m16.j(new dtsc() { // from class: bepm
        });
        this.b = new bfke(m16.a());
        dtsb m17 = dtsd.m();
        m17.m(4);
        m17.b("conversations.icon");
        m17.i(-1);
        m17.c(new Supplier() { // from class: bepy
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m17.j(new dtsc() { // from class: beqk
        });
        m17.a();
        dtsb m18 = dtsd.m();
        m18.m(1);
        m18.b("conversations.participant_contact_id");
        m18.i(-1);
        m18.c(new Supplier() { // from class: beqw
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m18.j(new dtsc() { // from class: beri
        });
        m18.a();
        dtsb m19 = dtsd.m();
        m19.m(4);
        m19.b("conversations.participant_lookup_key");
        m19.i(-1);
        m19.c(new Supplier() { // from class: beru
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m19.j(new dtsc() { // from class: besi
        });
        m19.a();
        dtsb m20 = dtsd.m();
        m20.m(4);
        m20.d(true);
        m20.b("conversations.participant_normalized_destination");
        m20.i(-1);
        m20.c(new Supplier() { // from class: besu
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m20.j(new dtsc() { // from class: betg
        });
        m20.a();
        dtsb m21 = dtsd.m();
        m21.m(4);
        m21.b("conversations.current_self_id");
        m21.i(-1);
        m21.c(new Supplier() { // from class: bett
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m21.j(new dtsc() { // from class: beuf
        });
        m21.a();
        dtsb m22 = dtsd.m();
        m22.m(4);
        m22.d(true);
        m22.e(true);
        m22.h(new Supplier() { // from class: beur
            @Override // java.util.function.Supplier
            public final Object get() {
                return azoi.c.a;
            }
        });
        m22.b("conversations.current_my_identity_foreign_key");
        m22.i(60160);
        m22.c(new Supplier() { // from class: bevd
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m22.j(new dtsc() { // from class: bevp
        });
        m22.a();
        dtsb m23 = dtsd.m();
        m23.m(1);
        m23.b("conversations.participant_count");
        m23.i(-1);
        m23.c(new Supplier() { // from class: bewb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m23.j(new dtsc() { // from class: bewp
        });
        m23.a();
        dtsb m24 = dtsd.m();
        m24.m(1);
        m24.b("conversations.notification_enabled");
        m24.i(-1);
        m24.c(new Supplier() { // from class: bexb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m24.j(new dtsc() { // from class: bexn
        });
        m24.a();
        dtsb m25 = dtsd.m();
        m25.m(4);
        m25.b("conversations.notification_sound_uri");
        m25.i(-1);
        m25.c(new Supplier() { // from class: bexz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m25.j(new dtsc() { // from class: beym
        });
        m25.a();
        dtsb m26 = dtsd.m();
        m26.m(1);
        m26.b("conversations.notification_vibration");
        m26.i(-1);
        m26.c(new Supplier() { // from class: beyy
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m26.j(new dtsc() { // from class: bezk
        });
        m26.a();
        dtsb m27 = dtsd.m();
        m27.m(1);
        m27.b("conversations.include_email_addr");
        m27.i(-1);
        m27.c(new Supplier() { // from class: bezw
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m27.j(new dtsc() { // from class: bfai
        });
        m27.a();
        dtsb m28 = dtsd.m();
        m28.m(1);
        m28.b("conversations.source_type");
        m28.i(8500);
        m28.c(new Supplier() { // from class: bfaw
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m28.j(new dtsc() { // from class: bfbi
        });
        m28.a();
        dtsb m29 = dtsd.m();
        m29.m(1);
        m29.d(true);
        m29.b("conversations.rcs_session_id");
        m29.i(10000);
        m29.c(new Supplier() { // from class: bfbu
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m29.j(new dtsc() { // from class: bfcg
        });
        m29.a();
        dtsb m30 = dtsd.m();
        m30.m(1);
        m30.b("conversations.join_state");
        m30.i(10006);
        m30.c(new Supplier() { // from class: bfcs
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m30.j(new dtsc() { // from class: bfdf
        });
        m30.a();
        dtsb m31 = dtsd.m();
        m31.m(1);
        m31.b("conversations.conv_type");
        m31.i(10007);
        m31.c(new Supplier() { // from class: bfdr
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m31.j(new dtsc() { // from class: bfed
        });
        m31.a();
        dtsb m32 = dtsd.m();
        m32.m(1);
        m32.b("conversations.send_mode");
        m32.i(10016);
        m32.c(new Supplier() { // from class: bfep
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m32.j(new dtsc() { // from class: bffd
        });
        m32.a();
        dtsb m33 = dtsd.m();
        m33.m(1);
        m33.b("conversations.IS_ENTERPRISE");
        m33.i(10018);
        m33.c(new Supplier() { // from class: bffp
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m33.j(new dtsc() { // from class: bfgb
        });
        m33.a();
        dtsb m34 = dtsd.m();
        m34.m(1);
        m34.b("conversations.has_ea2p_bot_recipient");
        m34.i(12001);
        m34.c(new Supplier() { // from class: bfgn
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m34.j(new dtsc() { // from class: bfgz
        });
        m34.a();
        dtsb m35 = dtsd.m();
        m35.m(4);
        m35.b("conversations.participant_display_destination");
        m35.i(15010);
        m35.c(new Supplier() { // from class: bfhi
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m35.j(new dtsc() { // from class: bfhk
        });
        m35.a();
        dtsb m36 = dtsd.m();
        m36.m(1);
        m36.d(true);
        m36.b("conversations.delete_timestamp");
        m36.i(29020);
        m36.c(new Supplier() { // from class: bfhl
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m36.j(new dtsc() { // from class: bfhm
        });
        m36.a();
        dtsb m37 = dtsd.m();
        m37.m(4);
        m37.l(true);
        m37.d(true);
        m37.b("conversations.cms_id");
        m37.f(true);
        m37.i(32000);
        m37.c(new Supplier() { // from class: bfhn
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m37.j(new dtsc() { // from class: bfho
        });
        m37.a();
        dtsb m38 = dtsd.m();
        m38.m(4);
        m38.d(true);
        m38.b("conversations.rcs_group_id");
        m38.i(40050);
        m38.c(new Supplier() { // from class: bfhp
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m38.j(new dtsc() { // from class: bfhr
        });
        m38.a();
        dtsb m39 = dtsd.m();
        m39.m(4);
        m39.b("conversations.rcs_conference_uri");
        m39.i(40050);
        m39.c(new Supplier() { // from class: bfhs
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m39.j(new dtsc() { // from class: bfht
        });
        m39.a();
        dtsb m40 = dtsd.m();
        m40.m(1);
        m40.b("conversations.rcs_session_allows_revocation");
        m40.i(48040);
        m40.c(new Supplier() { // from class: bfhu
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m40.j(new dtsc() { // from class: bfhw
        });
        m40.a();
        dtsb m41 = dtsd.m();
        m41.m(1);
        m41.b("conversations.awaiting_reverse_sync");
        m41.i(49060);
        m41.c(new Supplier() { // from class: bfhx
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m41.j(new dtsc() { // from class: bfhy
        });
        m41.a();
        dtsb m42 = dtsd.m();
        m42.m(1);
        m42.b("conversations.error_state");
        m42.i(58140);
        m42.c(new Supplier() { // from class: bfhz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m42.j(new dtsc() { // from class: bfia
        });
        m42.a();
        dtsb m43 = dtsd.m();
        m43.m(2);
        m43.b("conversations.rcs_group_last_sync_timestamp");
        m43.i(58910);
        m43.c(new Supplier() { // from class: bfic
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m43.j(new dtsc() { // from class: bfid
        });
        m43.a();
        dtsb m44 = dtsd.m();
        m44.m(1);
        m44.b("conversations.has_been_e2ee");
        m44.i(59210);
        m44.c(new Supplier() { // from class: bfie
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m44.j(new dtsc() { // from class: bfif
        });
        m44.a();
        dtsb m45 = dtsd.m();
        m45.m(1);
        m45.b("conversations.marked_as_unread");
        m45.i(59220);
        m45.c(new Supplier() { // from class: bfig
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m45.j(new dtsc() { // from class: bfii
        });
        m45.a();
        dtsb m46 = dtsd.m();
        m46.m(2);
        m46.b("conversations.encryption_protocol");
        m46.i(60180);
        m46.c(new Supplier() { // from class: bfij
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m46.j(new dtsc() { // from class: bfik
        });
        m46.a();
        dtsb m47 = dtsd.m();
        m47.m(2);
        m47.b("conversations.unread_count");
        m47.i(60740);
        m47.c(new Supplier() { // from class: bfil
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m47.j(new dtsc() { // from class: bfin
        });
        m47.a();
        dtsb m48 = dtsd.m();
        m48.m(4);
        m48.b("conversations.subtitle");
        m48.i(59760);
        m48.c(new Supplier() { // from class: bfio
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m48.j(new dtsc() { // from class: bfip
        });
        m48.a();
        dtsb m49 = dtsd.m();
        m49.m(1);
        m49.b("conversations.latest_message_id");
        m49.i(-1);
        m49.c(new Supplier() { // from class: bfiq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m49.j(new dtsc() { // from class: bfir
        });
        m49.a();
        dtsb m50 = dtsd.m();
        m50.m(1);
        m50.b("conversations.last_read_timestamp");
        m50.i(-1);
        m50.c(new Supplier() { // from class: bfis
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m50.j(new dtsc() { // from class: benp
        });
        m50.a();
        dtsb m51 = dtsd.m();
        m51.m(1);
        m51.b("conversations.normalized_participant_contact_id");
        m51.i(58090);
        m51.c(new Supplier() { // from class: berw
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m51.j(new dtsc() { // from class: bewd
        });
        m51.a();
        dtsb m52 = dtsd.m();
        m52.m(4);
        m52.b("conversations.normalized_participant_lookup_key");
        m52.i(58090);
        m52.c(new Supplier() { // from class: bfak
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m52.j(new dtsc() { // from class: bfer
        });
        m52.a();
        dtsb m53 = dtsd.m();
        m53.m(4);
        m53.l(true);
        m53.d(true);
        m53.b("conversations.participant_comparable_destination");
        m53.f(true);
        m53.i(58090);
        m53.c(new Supplier() { // from class: bfiv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m53.j(new dtsc() { // from class: bfjg
        });
        m53.a();
        dtsb m54 = dtsd.m();
        m54.m(4);
        m54.b("conversations.current_my_identity");
        m54.i(59810);
        m54.c(new Supplier() { // from class: bfjr
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m54.j(new dtsc() { // from class: bfkc
        });
        m54.a();
        dtsb m55 = dtsd.m();
        m55.m(4);
        m55.d(true);
        m55.e(true);
        m55.h(new Supplier() { // from class: bejt
            @Override // java.util.function.Supplier
            public final Object get() {
                return azdt.b.a;
            }
        });
        m55.b("conversations.destination_token");
        m55.i(60360);
        m55.c(new Supplier() { // from class: bekp
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m55.j(new dtsc() { // from class: bela
        });
        m55.a();
        dtsb m56 = dtsd.m();
        m56.m(4);
        m56.b("conversations.sms_service_center");
        m56.i(-1);
        m56.c(new Supplier() { // from class: bell
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m56.j(new dtsc() { // from class: belw
        });
        m56.a();
        dtsb m57 = dtsd.m();
        m57.m(4);
        m57.b("conversations.participant_id_list");
        m57.i(8500);
        m57.c(new Supplier() { // from class: bemh
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m57.j(new dtsc() { // from class: bems
        });
        m57.a();
        dtsb m58 = dtsd.m();
        m58.m(4);
        m58.l(true);
        m58.d(true);
        m58.b("conversations.normalized_participant_id_list");
        m58.f(true);
        m58.i(58090);
        m58.c(new Supplier() { // from class: bend
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m58.j(new dtsc() { // from class: beno
        });
        m58.a();
        dtsb m59 = dtsd.m();
        m59.m(1);
        m59.b("conversations.last_interactive_event_timestamp");
        m59.i(15000);
        m59.c(new Supplier() { // from class: beoa
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m59.j(new dtsc() { // from class: beol
        });
        m59.a();
        dtsb m60 = dtsd.m();
        m60.m(4);
        m60.b("conversations.normalized_participant_display_destination");
        m60.i(58090);
        m60.c(new Supplier() { // from class: beph
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m60.j(new dtsc() { // from class: beps
        });
        m60.a();
        dtsb m61 = dtsd.m();
        m61.m(1);
        m61.b("conversations.spam_warning_dismiss_status");
        m61.i(23000);
        m61.c(new Supplier() { // from class: beqd
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m61.j(new dtsc() { // from class: beqo
        });
        m61.a();
        dtsb m62 = dtsd.m();
        m62.m(1);
        m62.b("conversations.open_count");
        m62.i(26020);
        m62.c(new Supplier() { // from class: beqz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m62.j(new dtsc() { // from class: berk
        });
        m62.a();
        dtsb m63 = dtsd.m();
        m63.m(1);
        m63.b("conversations.last_logged_scooby_metadata_timestamp");
        m63.i(28010);
        m63.c(new Supplier() { // from class: berv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m63.j(new dtsc() { // from class: besh
        });
        m63.a();
        dtsb m64 = dtsd.m();
        m64.m(5);
        m64.b("conversations.tachygram_group_routing_info_token");
        m64.i(58120);
        m64.c(new Supplier() { // from class: bess
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m64.j(new dtsc() { // from class: betd
        });
        m64.a();
        dtsb m65 = dtsd.m();
        m65.m(1);
        m65.b("conversations.cms_most_recent_read_message_timestamp_ms");
        m65.i(53030);
        m65.c(new Supplier() { // from class: betz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m65.j(new dtsc() { // from class: beuk
        });
        m65.a();
        dtsb m66 = dtsd.m();
        m66.m(2);
        m66.b("conversations.rcs_subject_change_timestamp_ms");
        m66.i(46050);
        m66.c(new Supplier() { // from class: beuv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m66.j(new dtsc() { // from class: bevg
        });
        m66.a();
        dtsb m67 = dtsd.m();
        m67.m(2);
        m67.b("conversations.rcs_group_capabilities");
        m67.i(49020);
        m67.c(new Supplier() { // from class: bevr
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m67.j(new dtsc() { // from class: bewc
        });
        m67.a();
        dtsb m68 = dtsd.m();
        m68.m(2);
        m68.d(true);
        m68.e(true);
        m68.h(new Supplier() { // from class: bewo
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsom.c.a;
            }
        });
        m68.b("conversations.duplicate_of");
        m68.i(58090);
        m68.c(new Supplier() { // from class: bewz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m68.j(new dtsc() { // from class: bexk
        });
        m68.a();
        dtsb m69 = dtsd.m();
        m69.m(2);
        m69.d(true);
        m69.e(true);
        m69.h(new Supplier() { // from class: bexv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsom.c.a;
            }
        });
        m69.b("conversations.new_duplicate_of");
        m69.i(59130);
        m69.c(new Supplier() { // from class: beyr
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m69.j(new dtsc() { // from class: bezc
        });
        m69.a();
        dtsb m70 = dtsd.m();
        m70.m(1);
        m70.b("conversations.cms_life_cycle");
        m70.i(58210);
        m70.c(new Supplier() { // from class: bezn
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m70.j(new dtsc() { // from class: bezy
        });
        m70.a();
        dtsb m71 = dtsd.m();
        m71.m(4);
        m71.b("conversations.rcs_group_self_msisdn");
        m71.i(58540);
        m71.c(new Supplier() { // from class: bfaj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m71.j(new dtsc() { // from class: bfav
        });
        m71.a();
        dtsb m72 = dtsd.m();
        m72.m(2);
        m72.b("conversations.recipient_offline_timestamp_ms");
        m72.i(58750);
        m72.c(new Supplier() { // from class: bfbg
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m72.j(new dtsc() { // from class: bfbr
        });
        m72.a();
        dtsb m73 = dtsd.m();
        m73.m(5);
        m73.b("conversations.custom_theme");
        m73.i(59820);
        m73.c(new Supplier() { // from class: bfcc
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m73.j(new dtsc() { // from class: bfcn
        });
        m73.a();
        dtsb m74 = dtsd.m();
        m74.m(2);
        m74.b("conversations.mms_group_upgrade_status");
        m74.i(60050);
        m74.c(new Supplier() { // from class: bfdj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m74.j(new dtsc() { // from class: bfdu
        });
        m74.a();
        dtsb m75 = dtsd.m();
        m75.m(2);
        m75.b("conversations.mms_group_upgrade_retries");
        m75.i(60050);
        m75.c(new Supplier() { // from class: bfef
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m75.j(new dtsc() { // from class: bfeq
        });
        m75.a();
        dtsb m76 = dtsd.m();
        m76.m(4);
        m76.b("conversations.encryption_id");
        m76.i(60210);
        m76.c(new Supplier() { // from class: bffc
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m76.j(new dtsc() { // from class: bffn
        });
        m76.a();
        dtsb m77 = dtsd.m();
        m77.m(4);
        m77.l(true);
        m77.d(true);
        m77.b("conversations.cms_correlation_id");
        m77.f(true);
        m77.i(60250);
        m77.c(new Supplier() { // from class: bffy
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m77.j(new dtsc() { // from class: bfgj
        });
        m77.a();
        dtsb m78 = dtsd.m();
        m78.m(4);
        m78.b("conversations.rcs_group_icon_url");
        m78.i(60590);
        m78.c(new Supplier() { // from class: bfgu
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m78.j(new dtsc() { // from class: bfhf
        });
        m78.a();
        dtsb m79 = dtsd.m();
        m79.m(2);
        m79.l(true);
        m79.g(true);
        m79.d(true);
        m79.b("messages._id");
        m79.i(-1);
        m79.c(new Supplier() { // from class: bfib
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m79.j(new dtsc() { // from class: bfim
        });
        m79.a();
        dtsb m80 = dtsd.m();
        m80.m(1);
        m80.d(true);
        m80.b("messages.sent_timestamp");
        m80.i(-1);
        m80.c(new Supplier() { // from class: bfiu
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m80.j(new dtsc() { // from class: bfiw
        });
        m80.a();
        dtsb m81 = dtsd.m();
        m81.m(1);
        m81.d(true);
        m81.b("messages.received_timestamp");
        m81.i(-1);
        m81.c(new Supplier() { // from class: bfix
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m81.j(new dtsc() { // from class: bfiy
        });
        this.c = new bfke(m81.a());
        dtsb m82 = dtsd.m();
        m82.m(1);
        m82.b("messages.message_protocol");
        m82.i(-1);
        m82.c(new Supplier() { // from class: bfiz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m82.j(new dtsc() { // from class: bfja
        });
        m82.a();
        dtsb m83 = dtsd.m();
        m83.m(1);
        m83.d(true);
        m83.b("messages.message_status");
        m83.i(-1);
        m83.c(new Supplier() { // from class: bfjb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m83.j(new dtsc() { // from class: bfjc
        });
        m83.a();
        dtsb m84 = dtsd.m();
        m84.m(1);
        m84.d(true);
        m84.b("messages.read");
        m84.i(-1);
        m84.c(new Supplier() { // from class: bfje
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m84.j(new dtsc() { // from class: bfjf
        });
        m84.a();
        dtsb m85 = dtsd.m();
        m85.m(1);
        m85.b("messages.sms_priority");
        m85.i(-1);
        m85.c(new Supplier() { // from class: bfjh
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m85.j(new dtsc() { // from class: bfji
        });
        m85.a();
        dtsb m86 = dtsd.m();
        m86.m(1);
        m86.b("messages.raw_status");
        m86.i(-1);
        m86.c(new Supplier() { // from class: bfjj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m86.j(new dtsc() { // from class: bfjk
        });
        m86.a();
        dtsb m87 = dtsd.m();
        m87.m(1);
        m87.b("messages.sms_error_code");
        m87.i(9000);
        m87.c(new Supplier() { // from class: bfjl
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m87.j(new dtsc() { // from class: bfjm
        });
        m87.a();
        dtsb m88 = dtsd.m();
        m88.m(4);
        m88.b("messages.sms_error_desc_map_name");
        m88.i(9000);
        m88.c(new Supplier() { // from class: bfjn
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m88.j(new dtsc() { // from class: bfjo
        });
        m88.a();
        dtsb m89 = dtsd.m();
        m89.m(1);
        m89.d(true);
        m89.e(true);
        m89.h(new Supplier() { // from class: bfjq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsom.c.a;
            }
        });
        m89.b("messages.conversation_id");
        m89.i(-1);
        m89.c(new Supplier() { // from class: bfjs
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m89.j(new dtsc() { // from class: bfjt
        });
        m89.a();
        dtsb m90 = dtsd.m();
        m90.m(1);
        m90.d(true);
        m90.e(true);
        m90.h(new Supplier() { // from class: bfju
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.c.a;
            }
        });
        m90.b("messages.sender_id");
        m90.i(-1);
        m90.c(new Supplier() { // from class: bfjv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m90.j(new dtsc() { // from class: bfjw
        });
        m90.a();
        dtsb m91 = dtsd.m();
        m91.m(4);
        m91.b("messages.sender_send_destination");
        m91.i(54040);
        m91.c(new Supplier() { // from class: bfjx
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m91.j(new dtsc() { // from class: bfjy
        });
        m91.a();
        dtsb m92 = dtsd.m();
        m92.m(4);
        m92.b("messages.msisdn_receiving_rcs_message");
        m92.i(59340);
        m92.c(new Supplier() { // from class: bfjz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m92.j(new dtsc() { // from class: bfka
        });
        m92.a();
        dtsb m93 = dtsd.m();
        m93.m(4);
        m93.b("messages.receiving_network_country");
        m93.i(54040);
        m93.c(new Supplier() { // from class: bejj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m93.j(new dtsc() { // from class: bejk
        });
        m93.a();
        dtsb m94 = dtsd.m();
        m94.m(1);
        m94.b("messages.queue_insert_timestamp");
        m94.i(17030);
        m94.c(new Supplier() { // from class: bejl
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m94.j(new dtsc() { // from class: bejm
        });
        m94.a();
        dtsb m95 = dtsd.m();
        m95.m(1);
        m95.b("messages.message_report_status");
        m95.i(13020);
        m95.c(new Supplier() { // from class: bejn
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m95.j(new dtsc() { // from class: bejo
        });
        m95.a();
        dtsb m96 = dtsd.m();
        m96.m(1);
        m96.d(true);
        m96.b("messages.seen");
        m96.f(true);
        m96.i(-1);
        m96.c(new Supplier() { // from class: bejp
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m96.j(new dtsc() { // from class: bejq
        });
        m96.a();
        dtsb m97 = dtsd.m();
        m97.m(4);
        m97.d(true);
        m97.b("messages.sms_message_uri");
        m97.i(-1);
        m97.c(new Supplier() { // from class: bejr
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m97.j(new dtsc() { // from class: bejs
        });
        m97.a();
        dtsb m98 = dtsd.m();
        m98.m(1);
        m98.b("messages.sms_message_size");
        m98.i(-1);
        m98.c(new Supplier() { // from class: bejw
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m98.j(new dtsc() { // from class: bejx
        });
        m98.a();
        dtsb m99 = dtsd.m();
        m99.m(4);
        m99.b("messages.mms_subject");
        m99.i(-1);
        m99.c(new Supplier() { // from class: bejy
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m99.j(new dtsc() { // from class: bejz
        });
        m99.a();
        dtsb m100 = dtsd.m();
        m100.m(4);
        m100.b("messages.mms_transaction_id");
        m100.i(-1);
        m100.c(new Supplier() { // from class: beka
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m100.j(new dtsc() { // from class: bekb
        });
        m100.a();
        dtsb m101 = dtsd.m();
        m101.m(4);
        m101.b("messages.mms_content_location");
        m101.i(-1);
        m101.c(new Supplier() { // from class: bekc
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m101.j(new dtsc() { // from class: bekd
        });
        m101.a();
        dtsb m102 = dtsd.m();
        m102.m(1);
        m102.b("messages.mms_expiry");
        m102.i(-1);
        m102.c(new Supplier() { // from class: bekf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m102.j(new dtsc() { // from class: bekg
        });
        m102.a();
        dtsb m103 = dtsd.m();
        m103.m(1);
        m103.d(true);
        m103.b("messages.rcs_expiry");
        m103.i(59890);
        m103.c(new Supplier() { // from class: beki
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m103.j(new dtsc() { // from class: bekj
        });
        m103.a();
        dtsb m104 = dtsd.m();
        m104.m(4);
        m104.b("messages.mms_retrieve_text");
        m104.i(9030);
        m104.c(new Supplier() { // from class: bekk
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m104.j(new dtsc() { // from class: bekl
        });
        m104.a();
        dtsb m105 = dtsd.m();
        m105.m(1);
        m105.d(true);
        m105.e(true);
        m105.h(new Supplier() { // from class: bekm
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.c.a;
            }
        });
        m105.b("messages.self_id");
        m105.i(-1);
        m105.c(new Supplier() { // from class: bekn
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m105.j(new dtsc() { // from class: beko
        });
        m105.a();
        dtsb m106 = dtsd.m();
        m106.m(4);
        m106.d(true);
        m106.b("messages.my_identity");
        m106.i(59810);
        m106.c(new Supplier() { // from class: bekq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m106.j(new dtsc() { // from class: bekr
        });
        m106.a();
        dtsb m107 = dtsd.m();
        m107.m(4);
        m107.d(true);
        m107.e(true);
        m107.h(new Supplier() { // from class: beks
            @Override // java.util.function.Supplier
            public final Object get() {
                return azoi.c.a;
            }
        });
        m107.b("messages.my_identity_foreign_key");
        m107.i(60160);
        m107.c(new Supplier() { // from class: beku
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m107.j(new dtsc() { // from class: bekv
        });
        m107.a();
        dtsb m108 = dtsd.m();
        m108.m(1);
        m108.b("messages.retry_start_timestamp");
        m108.i(-1);
        m108.c(new Supplier() { // from class: bekw
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m108.j(new dtsc() { // from class: bekx
        });
        m108.a();
        dtsb m109 = dtsd.m();
        m109.m(4);
        m109.d(true);
        m109.b("messages.cloud_sync_id");
        m109.i(8500);
        m109.c(new Supplier() { // from class: beky
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m109.j(new dtsc() { // from class: bekz
        });
        m109.a();
        dtsb m110 = dtsd.m();
        m110.m(7);
        m110.d(true);
        m110.b("messages.rcs_message_id");
        m110.f(true);
        m110.i(10000);
        m110.c(new Supplier() { // from class: belb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m110.j(new dtsc() { // from class: belc
        });
        m110.a();
        dtsb m111 = dtsd.m();
        m111.m(4);
        m111.d(true);
        m111.b("messages.rcs_message_id_with_text_type");
        m111.f(true);
        m111.i(41040);
        m111.c(new Supplier() { // from class: beld
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m111.j(new dtsc() { // from class: bele
        });
        m111.a();
        dtsb m112 = dtsd.m();
        m112.m(1);
        m112.b("messages.etouffee_status");
        m112.i(29060);
        m112.c(new Supplier() { // from class: belg
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m112.j(new dtsc() { // from class: belh
        });
        m112.a();
        dtsb m113 = dtsd.m();
        m113.m(1);
        m113.b("messages.verification_status");
        m113.i(29090);
        m113.c(new Supplier() { // from class: beli
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m113.j(new dtsc() { // from class: belj
        });
        m113.a();
        dtsb m114 = dtsd.m();
        m114.m(1);
        m114.b("messages.rcs_ui_status");
        m114.i(39000);
        m114.c(new Supplier() { // from class: belk
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m114.j(new dtsc() { // from class: belm
        });
        m114.a();
        dtsb m115 = dtsd.m();
        m115.m(1);
        m115.d(true);
        m115.b("messages.is_hidden");
        m115.i(30010);
        m115.c(new Supplier() { // from class: beln
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m115.j(new dtsc() { // from class: belo
        });
        m115.a();
        dtsb m116 = dtsd.m();
        m116.m(7);
        m116.b("messages.rcs_remote_instance");
        m116.i(10002);
        m116.c(new Supplier() { // from class: belp
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m116.j(new dtsc() { // from class: belq
        });
        m116.a();
        dtsb m117 = dtsd.m();
        m117.m(1);
        m117.b("messages.rcs_file_transfer_session_id");
        m117.i(10004);
        m117.c(new Supplier() { // from class: bels
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m117.j(new dtsc() { // from class: belt
        });
        m117.a();
        dtsb m118 = dtsd.m();
        m118.m(4);
        m118.b("messages.correlation_id");
        m118.i(9010);
        m118.c(new Supplier() { // from class: belu
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m118.j(new dtsc() { // from class: belv
        });
        m118.a();
        dtsb m119 = dtsd.m();
        m119.m(4);
        m119.l(true);
        m119.d(true);
        m119.b("messages.cms_id");
        m119.f(true);
        m119.i(31010);
        m119.c(new Supplier() { // from class: belx
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m119.j(new dtsc() { // from class: bely
        });
        m119.a();
        dtsb m120 = dtsd.m();
        m120.m(2);
        m120.b("messages.cms_last_mod_seq");
        m120.i(37040);
        m120.c(new Supplier() { // from class: belz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m120.j(new dtsc() { // from class: bema
        });
        m120.a();
        dtsb m121 = dtsd.m();
        m121.m(4);
        m121.d(true);
        m121.b("messages.web_id");
        m121.i(19020);
        m121.c(new Supplier() { // from class: bemb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m121.j(new dtsc() { // from class: bemc
        });
        m121.a();
        dtsb m122 = dtsd.m();
        m122.m(1);
        m122.b("messages.usage_stats_logging_id");
        m122.i(29100);
        m122.c(new Supplier() { // from class: beme
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m122.j(new dtsc() { // from class: bemf
        });
        m122.a();
        dtsb m123 = dtsd.m();
        m123.m(1);
        m123.b("messages.send_counter");
        m123.i(35030);
        m123.c(new Supplier() { // from class: bemg
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m123.j(new dtsc() { // from class: bemi
        });
        m123.a();
        dtsb m124 = dtsd.m();
        m124.m(4);
        m124.d(true);
        m124.b("messages.original_rcs_message_id");
        m124.i(35030);
        m124.c(new Supplier() { // from class: bemj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m124.j(new dtsc() { // from class: bemk
        });
        m124.a();
        dtsb m125 = dtsd.m();
        m125.m(4);
        m125.b("messages.custom_delivery_receipt_mime_type");
        m125.i(37020);
        m125.c(new Supplier() { // from class: beml
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m125.j(new dtsc() { // from class: bemm
        });
        m125.a();
        dtsb m126 = dtsd.m();
        m126.m(5);
        m126.b("messages.custom_delivery_receipt_content");
        m126.i(37020);
        m126.c(new Supplier() { // from class: bemn
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m126.j(new dtsc() { // from class: bemo
        });
        m126.a();
        dtsb m127 = dtsd.m();
        m127.m(1);
        m127.b("messages.report_attempt_acounter");
        m127.i(37030);
        m127.c(new Supplier() { // from class: bemq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m127.j(new dtsc() { // from class: bemr
        });
        m127.a();
        dtsb m128 = dtsd.m();
        m128.m(5);
        m128.b("messages.custom_headers");
        m128.i(45020);
        m128.c(new Supplier() { // from class: bemt
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m128.j(new dtsc() { // from class: bemu
        });
        m128.a();
        dtsb m129 = dtsd.m();
        m129.m(4);
        m129.l(true);
        m129.d(true);
        m129.b("messages.cms_correlation_id");
        m129.f(true);
        m129.i(46010);
        m129.c(new Supplier() { // from class: bemv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m129.j(new dtsc() { // from class: bemw
        });
        m129.a();
        dtsb m130 = dtsd.m();
        m130.m(1);
        m130.d(true);
        m130.e(true);
        m130.h(new Supplier() { // from class: bemx
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.c.a;
            }
        });
        m130.b("messages.group_private_participant");
        m130.i(48030);
        m130.c(new Supplier() { // from class: bemy
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m130.j(new dtsc() { // from class: bemz
        });
        m130.a();
        dtsb m131 = dtsd.m();
        m131.m(1);
        m131.d(true);
        m131.e(true);
        m131.h(new Supplier() { // from class: bena
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        });
        m131.b("messages.original_message_id");
        m131.i(48030);
        m131.c(new Supplier() { // from class: benc
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m131.j(new dtsc() { // from class: bene
        });
        m131.a();
        dtsb m132 = dtsd.m();
        m132.m(1);
        m132.b("messages.awaiting_reverse_sync");
        m132.i(49060);
        m132.c(new Supplier() { // from class: benf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m132.j(new dtsc() { // from class: beng
        });
        m132.a();
        dtsb m133 = dtsd.m();
        m133.m(4);
        m133.b("messages.old_sms_message_uri");
        m133.i(49060);
        m133.c(new Supplier() { // from class: benh
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m133.j(new dtsc() { // from class: beni
        });
        m133.a();
        dtsb m134 = dtsd.m();
        m134.m(4);
        m134.l(true);
        m134.d(true);
        m134.b("messages.draft_id");
        m134.f(true);
        m134.i(56000);
        m134.c(new Supplier() { // from class: benj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m134.j(new dtsc() { // from class: benk
        });
        m134.a();
        dtsb m135 = dtsd.m();
        m135.m(1);
        m135.b("messages.result_code");
        m135.i(58040);
        m135.c(new Supplier() { // from class: benl
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m135.j(new dtsc() { // from class: benm
        });
        m135.a();
        dtsb m136 = dtsd.m();
        m136.m(1);
        m136.b("messages.cms_life_cycle");
        m136.i(58210);
        m136.c(new Supplier() { // from class: benq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m136.j(new dtsc() { // from class: benr
        });
        m136.a();
        dtsb m137 = dtsd.m();
        m137.m(1);
        m137.b("messages.mute_priority");
        m137.i(60750);
        m137.c(new Supplier() { // from class: bens
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m137.j(new dtsc() { // from class: bent
        });
        m137.a();
        dtsb m138 = dtsd.m();
        m138.m(1);
        m138.b("messages.fallback_reason");
        m138.i(58710);
        m138.c(new Supplier() { // from class: benu
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m138.j(new dtsc() { // from class: benv
        });
        m138.a();
        dtsb m139 = dtsd.m();
        m139.m(1);
        m139.b("messages.auto_retry_counter");
        m139.i(58230);
        m139.c(new Supplier() { // from class: benw
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m139.j(new dtsc() { // from class: benx
        });
        m139.a();
        dtsb m140 = dtsd.m();
        m140.m(2);
        m140.b("messages.can_revoke_before_delivered_with_rcs");
        m140.i(58280);
        m140.c(new Supplier() { // from class: beny
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m140.j(new dtsc() { // from class: benz
        });
        m140.a();
        dtsb m141 = dtsd.m();
        m141.m(5);
        m141.b("messages.trace_id");
        m141.i(58680);
        m141.c(new Supplier() { // from class: beoc
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m141.j(new dtsc() { // from class: beod
        });
        m141.a();
        dtsb m142 = dtsd.m();
        m142.m(1);
        m142.b("messages.outgoing_delivery_report_status");
        m142.i(58720);
        m142.c(new Supplier() { // from class: beoe
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m142.j(new dtsc() { // from class: beof
        });
        m142.a();
        dtsb m143 = dtsd.m();
        m143.m(1);
        m143.b("messages.outgoing_read_report_status");
        m143.i(58720);
        m143.c(new Supplier() { // from class: beog
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m143.j(new dtsc() { // from class: beoh
        });
        m143.a();
        dtsb m144 = dtsd.m();
        m144.m(1);
        m144.b("messages.xms_transport");
        m144.i(59310);
        m144.c(new Supplier() { // from class: beoi
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m144.j(new dtsc() { // from class: beoj
        });
        m144.a();
        dtsb m145 = dtsd.m();
        m145.m(1);
        m145.b("messages.message_original_protocol");
        m145.i(59430);
        m145.c(new Supplier() { // from class: beok
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m145.j(new dtsc() { // from class: beom
        });
        m145.a();
        dtsb m146 = dtsd.m();
        m146.m(4);
        m146.l(true);
        m146.d(true);
        m146.b("messages.satellite_datagram_id");
        m146.f(true);
        m146.i(59490);
        m146.c(new Supplier() { // from class: beop
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m146.j(new dtsc() { // from class: beoq
        });
        m146.a();
        dtsb m147 = dtsd.m();
        m147.m(1);
        m147.b("messages.encryption_protocol");
        m147.i(60190);
        m147.c(new Supplier() { // from class: beor
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m147.j(new dtsc() { // from class: beos
        });
        m147.a();
        dtsb m148 = dtsd.m();
        m148.m(4);
        m148.l(true);
        m148.d(true);
        m148.b("messages.message_persistence_id");
        m148.f(true);
        m148.i(60370);
        m148.c(new Supplier() { // from class: beot
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m148.j(new dtsc() { // from class: beou
        });
        m148.a();
        dtsb m149 = dtsd.m();
        m149.m(1);
        m149.d(true);
        m149.b("participants.sub_id");
        m149.f(true);
        m149.i(-1);
        m149.c(new Supplier() { // from class: beov
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m149.j(new dtsc() { // from class: beox
        });
        m149.a();
        dtsb m150 = dtsd.m();
        m150.m(4);
        m150.b("participants.display_destination");
        m150.i(-1);
        m150.c(new Supplier() { // from class: beoy
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m150.j(new dtsc() { // from class: beoz
        });
        m150.a();
        dtsb m151 = dtsd.m();
        m151.m(4);
        m151.b("participants.full_name");
        m151.i(-1);
        m151.c(new Supplier() { // from class: bepb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m151.j(new dtsc() { // from class: bepc
        });
        m151.a();
        dtsb m152 = dtsd.m();
        m152.m(4);
        m152.b("participants.first_name");
        m152.i(-1);
        m152.c(new Supplier() { // from class: bepd
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m152.j(new dtsc() { // from class: bepe
        });
        m152.a();
        dtsb m153 = dtsd.m();
        m153.m(1);
        m153.b("participants.directory_id");
        m153.i(35010);
        m153.c(new Supplier() { // from class: bepf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m153.j(new dtsc() { // from class: bepg
        });
        m153.a();
        dtsb m154 = dtsd.m();
        m154.m(2);
        m154.l(true);
        m154.g(true);
        m154.d(true);
        m154.b("participants._id");
        m154.i(-1);
        m154.c(new Supplier() { // from class: bepi
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m154.j(new dtsc() { // from class: bepj
        });
        m154.a();
        dtsb m155 = dtsd.m();
        m155.m(4);
        m155.d(true);
        m155.b("participants.my_identity_token");
        m155.i(59930);
        m155.c(new Supplier() { // from class: bepk
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m155.j(new dtsc() { // from class: bepl
        });
        m155.a();
        dtsb m156 = dtsd.m();
        m156.m(4);
        m156.d(true);
        m156.e(true);
        m156.h(new Supplier() { // from class: bepn
            @Override // java.util.function.Supplier
            public final Object get() {
                return azoi.c.a;
            }
        });
        m156.b("participants.my_identity_token_foreign_key");
        m156.i(60160);
        m156.c(new Supplier() { // from class: bepo
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m156.j(new dtsc() { // from class: bepp
        });
        m156.a();
        dtsb m157 = dtsd.m();
        m157.m(1);
        m157.b("participants.sim_slot_id");
        m157.i(2000);
        m157.c(new Supplier() { // from class: bepq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m157.j(new dtsc() { // from class: bepr
        });
        m157.a();
        dtsb m158 = dtsd.m();
        m158.m(4);
        m158.d(true);
        m158.b("participants.normalized_destination");
        m158.f(true);
        m158.i(-1);
        m158.c(new Supplier() { // from class: bept
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m158.j(new dtsc() { // from class: bepu
        });
        m158.a();
        dtsb m159 = dtsd.m();
        m159.m(4);
        m159.b("participants.send_destination");
        m159.i(-1);
        m159.c(new Supplier() { // from class: bepv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m159.j(new dtsc() { // from class: bepw
        });
        m159.a();
        dtsb m160 = dtsd.m();
        m160.m(4);
        m160.l(true);
        m160.d(true);
        m160.b("participants.comparable_destination");
        m160.f(true);
        m160.i(54040);
        m160.c(new Supplier() { // from class: bepx
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m160.j(new dtsc() { // from class: bepz
        });
        m160.a();
        dtsb m161 = dtsd.m();
        m161.m(4);
        m161.b("participants.country_code");
        m161.i(54040);
        m161.c(new Supplier() { // from class: beqa
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m161.j(new dtsc() { // from class: beqb
        });
        m161.a();
        dtsb m162 = dtsd.m();
        m162.m(2);
        m162.l(true);
        m162.d(true);
        m162.b("participants.recipient_id");
        m162.f(true);
        m162.i(58090);
        m162.c(new Supplier() { // from class: beqc
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m162.j(new dtsc() { // from class: beqe
        });
        m162.a();
        dtsb m163 = dtsd.m();
        m163.m(4);
        m163.b("participants.recipient_canonical_address");
        m163.i(58090);
        m163.c(new Supplier() { // from class: beqf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m163.j(new dtsc() { // from class: beqg
        });
        m163.a();
        dtsb m164 = dtsd.m();
        m164.m(4);
        m164.b("participants.profile_photo_uri");
        m164.i(-1);
        m164.c(new Supplier() { // from class: beqh
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m164.j(new dtsc() { // from class: beqi
        });
        m164.a();
        dtsb m165 = dtsd.m();
        m165.m(4);
        m165.b("participants.contact_photo_uri");
        m165.i(59850);
        m165.c(new Supplier() { // from class: beqj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m165.j(new dtsc() { // from class: beql
        });
        m165.a();
        dtsb m166 = dtsd.m();
        m166.m(1);
        m166.b("participants.contact_id");
        m166.i(-1);
        m166.c(new Supplier() { // from class: beqm
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m166.j(new dtsc() { // from class: beqn
        });
        m166.a();
        dtsb m167 = dtsd.m();
        m167.m(4);
        m167.b("participants.lookup_key");
        m167.i(-1);
        m167.c(new Supplier() { // from class: beqp
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m167.j(new dtsc() { // from class: beqq
        });
        m167.a();
        dtsb m168 = dtsd.m();
        m168.m(1);
        m168.b("participants.color_palette_index");
        m168.i(-1);
        m168.c(new Supplier() { // from class: beqr
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m168.j(new dtsc() { // from class: beqs
        });
        m168.a();
        dtsb m169 = dtsd.m();
        m169.m(1);
        m169.b("participants.color_type");
        m169.i(1000);
        m169.c(new Supplier() { // from class: beqt
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m169.j(new dtsc() { // from class: bequ
        });
        m169.a();
        dtsb m170 = dtsd.m();
        m170.m(1);
        m170.b("participants.extended_color");
        m170.i(10027);
        m170.c(new Supplier() { // from class: beqv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m170.j(new dtsc() { // from class: beqx
        });
        m170.a();
        dtsb m171 = dtsd.m();
        m171.m(1);
        m171.b("participants.blocked");
        m171.i(-1);
        m171.c(new Supplier() { // from class: beqy
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m171.j(new dtsc() { // from class: bera
        });
        m171.a();
        dtsb m172 = dtsd.m();
        m172.m(4);
        m172.b("participants.subscription_name");
        m172.i(2000);
        m172.c(new Supplier() { // from class: berb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m172.j(new dtsc() { // from class: berc
        });
        m172.a();
        dtsb m173 = dtsd.m();
        m173.m(1);
        m173.b("participants.subscription_color");
        m173.i(2000);
        m173.c(new Supplier() { // from class: berd
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m173.j(new dtsc() { // from class: bere
        });
        m173.a();
        dtsb m174 = dtsd.m();
        m174.m(4);
        m174.b("participants.contact_destination");
        m174.i(4000);
        m174.c(new Supplier() { // from class: berf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m174.j(new dtsc() { // from class: berg
        });
        m174.a();
        dtsb m175 = dtsd.m();
        m175.m(1);
        m175.b("participants.participant_type");
        m175.i(12001);
        m175.c(new Supplier() { // from class: berh
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m175.j(new dtsc() { // from class: berj
        });
        m175.a();
        dtsb m176 = dtsd.m();
        m176.m(1);
        m176.b("participants.video_reachability");
        m176.i(13050);
        m176.c(new Supplier() { // from class: berl
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m176.j(new dtsc() { // from class: berm
        });
        m176.a();
        dtsb m177 = dtsd.m();
        m177.m(4);
        m177.b("participants.alias");
        m177.i(20060);
        m177.c(new Supplier() { // from class: bern
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m177.j(new dtsc() { // from class: bero
        });
        m177.a();
        dtsb m178 = dtsd.m();
        m178.m(1);
        m178.b("participants.is_spam");
        m178.i(24060);
        m178.c(new Supplier() { // from class: berp
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m178.j(new dtsc() { // from class: berq
        });
        m178.a();
        dtsb m179 = dtsd.m();
        m179.m(1);
        m179.b("participants.is_rcs_available");
        m179.i(29030);
        m179.c(new Supplier() { // from class: berr
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m179.j(new dtsc() { // from class: bers
        });
        m179.a();
        dtsb m180 = dtsd.m();
        m180.m(1);
        m180.b("participants.is_spam_source");
        m180.i(30000);
        m180.c(new Supplier() { // from class: bert
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m180.j(new dtsc() { // from class: berx
        });
        m180.a();
        dtsb m181 = dtsd.m();
        m181.m(4);
        m181.l(true);
        m181.d(true);
        m181.b("participants.cms_id");
        m181.f(true);
        m181.i(31020);
        m181.c(new Supplier() { // from class: bery
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m181.j(new dtsc() { // from class: berz
        });
        m181.a();
        dtsb m182 = dtsd.m();
        m182.m(1);
        m182.b("participants.latest_verification_status");
        m182.i(31030);
        m182.c(new Supplier() { // from class: besa
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m182.j(new dtsc() { // from class: besb
        });
        m182.a();
        dtsb m183 = dtsd.m();
        m183.m(4);
        m183.b("participants.profile_photo_blob_id");
        m183.i(33000);
        m183.c(new Supplier() { // from class: besc
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m183.j(new dtsc() { // from class: besd
        });
        m183.a();
        dtsb m184 = dtsd.m();
        m184.m(5);
        m184.b("participants.profile_photo_encryption_key");
        m184.i(33060);
        m184.c(new Supplier() { // from class: bese
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m184.j(new dtsc() { // from class: besf
        });
        m184.a();
        dtsb m185 = dtsd.m();
        m185.m(1);
        m185.b("participants.is_check_constraint_enabled_via_phenotype");
        m185.i(55010);
        m185.c(new Supplier() { // from class: besg
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m185.j(new dtsc() { // from class: besj
        });
        m185.a();
        dtsb m186 = dtsd.m();
        m186.m(1);
        m186.b("participants.is_valid_phone_number_data");
        m186.i(55010);
        m186.c(new Supplier() { // from class: besk
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m186.j(new dtsc() { // from class: besl
        });
        m186.a();
        dtsb m187 = dtsd.m();
        m187.m(2);
        m187.d(true);
        m187.e(true);
        m187.h(new Supplier() { // from class: besm
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.c.a;
            }
        });
        m187.b("participants.duplicate_of");
        m187.i(58090);
        m187.c(new Supplier() { // from class: besn
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m187.j(new dtsc() { // from class: beso
        });
        m187.a();
        dtsb m188 = dtsd.m();
        m188.m(1);
        m188.b("participants.cms_life_cycle");
        m188.i(58210);
        m188.c(new Supplier() { // from class: besp
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m188.j(new dtsc() { // from class: besq
        });
        m188.a();
        dtsb m189 = dtsd.m();
        m189.m(1);
        m189.b("participants.norm_ui_status");
        m189.i(58620);
        m189.c(new Supplier() { // from class: besr
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m189.j(new dtsc() { // from class: best
        });
        m189.a();
        dtsb m190 = dtsd.m();
        m190.m(4);
        m190.b("participants.last_modified_by_key");
        m190.i(59440);
        m190.c(new Supplier() { // from class: besv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m190.j(new dtsc() { // from class: besw
        });
        m190.a();
        dtsb m191 = dtsd.m();
        m191.m(1);
        m191.b("participants.name_source");
        m191.i(59550);
        m191.c(new Supplier() { // from class: besx
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m191.j(new dtsc() { // from class: besy
        });
        m191.a();
        dtsb m192 = dtsd.m();
        m192.m(1);
        m192.b("participants.photo_source");
        m192.i(59550);
        m192.c(new Supplier() { // from class: besz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m192.j(new dtsc() { // from class: beta
        });
        m192.a();
        dtsb m193 = dtsd.m();
        m193.m(1);
        m193.b("participants.profile_photo_user_preference");
        m193.i(60060);
        m193.c(new Supplier() { // from class: betb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m193.j(new dtsc() { // from class: betc
        });
        m193.a();
        dtsb m194 = dtsd.m();
        m194.m(5);
        m194.b("participants.contact_metadata");
        m194.i(60070);
        m194.c(new Supplier() { // from class: bete
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m194.j(new dtsc() { // from class: betf
        });
        m194.a();
        dtsb m195 = dtsd.m();
        m195.m(1);
        m195.d(true);
        m195.b("participants.is_enterprise_contact");
        m195.i(60640);
        m195.c(new Supplier() { // from class: beti
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m195.j(new dtsc() { // from class: betj
        });
        m195.a();
        dtsb m196 = dtsd.m();
        m196.m(1);
        m196.l(true);
        m196.g(true);
        m196.d(true);
        m196.e(true);
        m196.h(new Supplier() { // from class: betk
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.c.a;
            }
        });
        m196.b("conversation_to_participants.participant_id");
        m196.f(true);
        m196.i(-1);
        m196.c(new Supplier() { // from class: betl
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m196.j(new dtsc() { // from class: betm
        });
        m196.a();
        dtsb m197 = dtsd.m();
        m197.m(1);
        m197.l(true);
        m197.g(true);
        m197.d(true);
        m197.e(true);
        m197.h(new Supplier() { // from class: betn
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsom.c.a;
            }
        });
        m197.b("conversation_to_participants.conversation_id");
        m197.f(true);
        m197.i(-1);
        m197.c(new Supplier() { // from class: betp
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m197.j(new dtsc() { // from class: betq
        });
        m197.a();
        dtsb m198 = dtsd.m();
        m198.m(1);
        m198.b("conversation_to_participants.rcs_group_join_status");
        m198.i(-1);
        m198.c(new Supplier() { // from class: betr
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m198.j(new dtsc() { // from class: bets
        });
        m198.a();
        dtsb m199 = dtsd.m();
        m199.m(4);
        m199.b("conversation_to_participants.last_modified_by_key");
        m199.i(-1);
        m199.c(new Supplier() { // from class: betu
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m199.j(new dtsc() { // from class: betv
        });
        m199.a();
        dtsb m200 = dtsd.m();
        m200.m(4);
        m200.b("one_on_one_participant.full_name");
        m200.i(-1);
        m200.c(new Supplier() { // from class: betw
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m200.j(new dtsc() { // from class: betx
        });
        m200.a();
        dtsb m201 = dtsd.m();
        m201.m(4);
        m201.b("one_on_one_participant.first_name");
        m201.i(-1);
        m201.c(new Supplier() { // from class: bety
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m201.j(new dtsc() { // from class: beua
        });
        m201.a();
        dtsb m202 = dtsd.m();
        m202.m(2);
        m202.l(true);
        m202.g(true);
        m202.d(true);
        m202.b("one_on_one_participant._id");
        m202.i(-1);
        m202.c(new Supplier() { // from class: beub
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m202.j(new dtsc() { // from class: beuc
        });
        m202.a();
        dtsb m203 = dtsd.m();
        m203.m(4);
        m203.d(true);
        m203.b("one_on_one_participant.my_identity_token");
        m203.i(59930);
        m203.c(new Supplier() { // from class: beud
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m203.j(new dtsc() { // from class: beue
        });
        m203.a();
        dtsb m204 = dtsd.m();
        m204.m(4);
        m204.d(true);
        m204.e(true);
        m204.h(new Supplier() { // from class: beug
            @Override // java.util.function.Supplier
            public final Object get() {
                return azoi.c.a;
            }
        });
        m204.b("one_on_one_participant.my_identity_token_foreign_key");
        m204.i(60160);
        m204.c(new Supplier() { // from class: beuh
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m204.j(new dtsc() { // from class: beui
        });
        m204.a();
        dtsb m205 = dtsd.m();
        m205.m(1);
        m205.d(true);
        m205.b("one_on_one_participant.sub_id");
        m205.f(true);
        m205.i(-1);
        m205.c(new Supplier() { // from class: beuj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m205.j(new dtsc() { // from class: beul
        });
        m205.a();
        dtsb m206 = dtsd.m();
        m206.m(1);
        m206.b("one_on_one_participant.sim_slot_id");
        m206.i(2000);
        m206.c(new Supplier() { // from class: beum
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m206.j(new dtsc() { // from class: beun
        });
        m206.a();
        dtsb m207 = dtsd.m();
        m207.m(4);
        m207.d(true);
        m207.b("one_on_one_participant.normalized_destination");
        m207.f(true);
        m207.i(-1);
        m207.c(new Supplier() { // from class: beuo
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m207.j(new dtsc() { // from class: beup
        });
        m207.a();
        dtsb m208 = dtsd.m();
        m208.m(4);
        m208.b("one_on_one_participant.send_destination");
        m208.i(-1);
        m208.c(new Supplier() { // from class: beuq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m208.j(new dtsc() { // from class: beus
        });
        m208.a();
        dtsb m209 = dtsd.m();
        m209.m(4);
        m209.b("one_on_one_participant.display_destination");
        m209.i(-1);
        m209.c(new Supplier() { // from class: beut
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m209.j(new dtsc() { // from class: beuu
        });
        m209.a();
        dtsb m210 = dtsd.m();
        m210.m(4);
        m210.l(true);
        m210.d(true);
        m210.b("one_on_one_participant.comparable_destination");
        m210.f(true);
        m210.i(54040);
        m210.c(new Supplier() { // from class: beuw
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m210.j(new dtsc() { // from class: beux
        });
        m210.a();
        dtsb m211 = dtsd.m();
        m211.m(4);
        m211.b("one_on_one_participant.country_code");
        m211.i(54040);
        m211.c(new Supplier() { // from class: beuy
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m211.j(new dtsc() { // from class: beuz
        });
        m211.a();
        dtsb m212 = dtsd.m();
        m212.m(2);
        m212.l(true);
        m212.d(true);
        m212.b("one_on_one_participant.recipient_id");
        m212.f(true);
        m212.i(58090);
        m212.c(new Supplier() { // from class: beva
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m212.j(new dtsc() { // from class: bevb
        });
        m212.a();
        dtsb m213 = dtsd.m();
        m213.m(4);
        m213.b("one_on_one_participant.recipient_canonical_address");
        m213.i(58090);
        m213.c(new Supplier() { // from class: bevc
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m213.j(new dtsc() { // from class: beve
        });
        m213.a();
        dtsb m214 = dtsd.m();
        m214.m(4);
        m214.b("one_on_one_participant.profile_photo_uri");
        m214.i(-1);
        m214.c(new Supplier() { // from class: bevf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m214.j(new dtsc() { // from class: bevh
        });
        m214.a();
        dtsb m215 = dtsd.m();
        m215.m(4);
        m215.b("one_on_one_participant.contact_photo_uri");
        m215.i(59850);
        m215.c(new Supplier() { // from class: bevi
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m215.j(new dtsc() { // from class: bevj
        });
        m215.a();
        dtsb m216 = dtsd.m();
        m216.m(1);
        m216.b("one_on_one_participant.contact_id");
        m216.i(-1);
        m216.c(new Supplier() { // from class: bevk
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m216.j(new dtsc() { // from class: bevl
        });
        m216.a();
        dtsb m217 = dtsd.m();
        m217.m(4);
        m217.b("one_on_one_participant.lookup_key");
        m217.i(-1);
        m217.c(new Supplier() { // from class: bevm
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m217.j(new dtsc() { // from class: bevn
        });
        m217.a();
        dtsb m218 = dtsd.m();
        m218.m(1);
        m218.b("one_on_one_participant.color_palette_index");
        m218.i(-1);
        m218.c(new Supplier() { // from class: bevo
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m218.j(new dtsc() { // from class: bevq
        });
        m218.a();
        dtsb m219 = dtsd.m();
        m219.m(1);
        m219.b("one_on_one_participant.color_type");
        m219.i(1000);
        m219.c(new Supplier() { // from class: bevs
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m219.j(new dtsc() { // from class: bevt
        });
        m219.a();
        dtsb m220 = dtsd.m();
        m220.m(1);
        m220.b("one_on_one_participant.extended_color");
        m220.i(10027);
        m220.c(new Supplier() { // from class: bevu
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m220.j(new dtsc() { // from class: bevv
        });
        m220.a();
        dtsb m221 = dtsd.m();
        m221.m(1);
        m221.b("one_on_one_participant.blocked");
        m221.i(-1);
        m221.c(new Supplier() { // from class: bevw
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m221.j(new dtsc() { // from class: bevx
        });
        m221.a();
        dtsb m222 = dtsd.m();
        m222.m(4);
        m222.b("one_on_one_participant.subscription_name");
        m222.i(2000);
        m222.c(new Supplier() { // from class: bevy
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m222.j(new dtsc() { // from class: bevz
        });
        m222.a();
        dtsb m223 = dtsd.m();
        m223.m(1);
        m223.b("one_on_one_participant.subscription_color");
        m223.i(2000);
        m223.c(new Supplier() { // from class: bewa
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m223.j(new dtsc() { // from class: bewe
        });
        m223.a();
        dtsb m224 = dtsd.m();
        m224.m(4);
        m224.b("one_on_one_participant.contact_destination");
        m224.i(4000);
        m224.c(new Supplier() { // from class: bewf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m224.j(new dtsc() { // from class: bewg
        });
        m224.a();
        dtsb m225 = dtsd.m();
        m225.m(1);
        m225.b("one_on_one_participant.participant_type");
        m225.i(12001);
        m225.c(new Supplier() { // from class: bewh
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m225.j(new dtsc() { // from class: bewi
        });
        m225.a();
        dtsb m226 = dtsd.m();
        m226.m(1);
        m226.b("one_on_one_participant.video_reachability");
        m226.i(13050);
        m226.c(new Supplier() { // from class: bewj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m226.j(new dtsc() { // from class: bewk
        });
        m226.a();
        dtsb m227 = dtsd.m();
        m227.m(4);
        m227.b("one_on_one_participant.alias");
        m227.i(20060);
        m227.c(new Supplier() { // from class: bewl
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m227.j(new dtsc() { // from class: bewm
        });
        m227.a();
        dtsb m228 = dtsd.m();
        m228.m(1);
        m228.b("one_on_one_participant.is_spam");
        m228.i(24060);
        m228.c(new Supplier() { // from class: bewn
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m228.j(new dtsc() { // from class: bewq
        });
        m228.a();
        dtsb m229 = dtsd.m();
        m229.m(1);
        m229.b("one_on_one_participant.is_rcs_available");
        m229.i(29030);
        m229.c(new Supplier() { // from class: bewr
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m229.j(new dtsc() { // from class: bews
        });
        m229.a();
        dtsb m230 = dtsd.m();
        m230.m(1);
        m230.b("one_on_one_participant.is_spam_source");
        m230.i(30000);
        m230.c(new Supplier() { // from class: bewt
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m230.j(new dtsc() { // from class: bewu
        });
        m230.a();
        dtsb m231 = dtsd.m();
        m231.m(4);
        m231.l(true);
        m231.d(true);
        m231.b("one_on_one_participant.cms_id");
        m231.f(true);
        m231.i(31020);
        m231.c(new Supplier() { // from class: bewv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m231.j(new dtsc() { // from class: beww
        });
        m231.a();
        dtsb m232 = dtsd.m();
        m232.m(1);
        m232.b("one_on_one_participant.latest_verification_status");
        m232.i(31030);
        m232.c(new Supplier() { // from class: bewx
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m232.j(new dtsc() { // from class: bewy
        });
        m232.a();
        dtsb m233 = dtsd.m();
        m233.m(4);
        m233.b("one_on_one_participant.profile_photo_blob_id");
        m233.i(33000);
        m233.c(new Supplier() { // from class: bexa
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m233.j(new dtsc() { // from class: bexc
        });
        m233.a();
        dtsb m234 = dtsd.m();
        m234.m(5);
        m234.b("one_on_one_participant.profile_photo_encryption_key");
        m234.i(33060);
        m234.c(new Supplier() { // from class: bexd
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m234.j(new dtsc() { // from class: bexe
        });
        m234.a();
        dtsb m235 = dtsd.m();
        m235.m(1);
        m235.b("one_on_one_participant.directory_id");
        m235.i(35010);
        m235.c(new Supplier() { // from class: bexf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m235.j(new dtsc() { // from class: bexg
        });
        m235.a();
        dtsb m236 = dtsd.m();
        m236.m(1);
        m236.b("one_on_one_participant.is_check_constraint_enabled_via_phenotype");
        m236.i(55010);
        m236.c(new Supplier() { // from class: bexh
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m236.j(new dtsc() { // from class: bexi
        });
        m236.a();
        dtsb m237 = dtsd.m();
        m237.m(1);
        m237.b("one_on_one_participant.is_valid_phone_number_data");
        m237.i(55010);
        m237.c(new Supplier() { // from class: bexj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m237.j(new dtsc() { // from class: bexl
        });
        m237.a();
        dtsb m238 = dtsd.m();
        m238.m(2);
        m238.d(true);
        m238.e(true);
        m238.h(new Supplier() { // from class: bexm
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.c.a;
            }
        });
        m238.b("one_on_one_participant.duplicate_of");
        m238.i(58090);
        m238.c(new Supplier() { // from class: bexo
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m238.j(new dtsc() { // from class: bexp
        });
        m238.a();
        dtsb m239 = dtsd.m();
        m239.m(1);
        m239.b("one_on_one_participant.cms_life_cycle");
        m239.i(58210);
        m239.c(new Supplier() { // from class: bexq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m239.j(new dtsc() { // from class: bexr
        });
        m239.a();
        dtsb m240 = dtsd.m();
        m240.m(1);
        m240.b("one_on_one_participant.norm_ui_status");
        m240.i(58620);
        m240.c(new Supplier() { // from class: bexs
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m240.j(new dtsc() { // from class: bext
        });
        m240.a();
        dtsb m241 = dtsd.m();
        m241.m(4);
        m241.b("one_on_one_participant.last_modified_by_key");
        m241.i(59440);
        m241.c(new Supplier() { // from class: bexu
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m241.j(new dtsc() { // from class: bexw
        });
        m241.a();
        dtsb m242 = dtsd.m();
        m242.m(1);
        m242.b("one_on_one_participant.name_source");
        m242.i(59550);
        m242.c(new Supplier() { // from class: bexx
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m242.j(new dtsc() { // from class: bexy
        });
        m242.a();
        dtsb m243 = dtsd.m();
        m243.m(1);
        m243.b("one_on_one_participant.photo_source");
        m243.i(59550);
        m243.c(new Supplier() { // from class: beyb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m243.j(new dtsc() { // from class: beyc
        });
        m243.a();
        dtsb m244 = dtsd.m();
        m244.m(1);
        m244.b("one_on_one_participant.profile_photo_user_preference");
        m244.i(60060);
        m244.c(new Supplier() { // from class: beyd
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m244.j(new dtsc() { // from class: beye
        });
        m244.a();
        dtsb m245 = dtsd.m();
        m245.m(5);
        m245.b("one_on_one_participant.contact_metadata");
        m245.i(60070);
        m245.c(new Supplier() { // from class: beyf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m245.j(new dtsc() { // from class: beyh
        });
        m245.a();
        dtsb m246 = dtsd.m();
        m246.m(1);
        m246.d(true);
        m246.b("one_on_one_participant.is_enterprise_contact");
        m246.i(60640);
        m246.c(new Supplier() { // from class: beyi
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m246.j(new dtsc() { // from class: beyj
        });
        m246.a();
        dtsb m247 = dtsd.m();
        m247.m(4);
        m247.b("profiles_table.display_name");
        m247.i(-1);
        m247.c(new Supplier() { // from class: beyk
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m247.j(new dtsc() { // from class: beyl
        });
        m247.a();
        dtsb m248 = dtsd.m();
        m248.m(2);
        m248.l(true);
        m248.g(true);
        m248.d(true);
        m248.b("profiles_table._id");
        m248.i(-1);
        m248.c(new Supplier() { // from class: beyn
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m248.j(new dtsc() { // from class: beyo
        });
        m248.a();
        dtsb m249 = dtsd.m();
        m249.m(2);
        m249.d(true);
        m249.e(true);
        m249.h(new Supplier() { // from class: beyp
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.c.a;
            }
        });
        m249.b("profiles_table.participant_id");
        m249.i(-1);
        m249.c(new Supplier() { // from class: beyq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m249.j(new dtsc() { // from class: beys
        });
        m249.a();
        dtsb m250 = dtsd.m();
        m250.m(4);
        m250.b("profiles_table.person_id");
        m250.i(60170);
        m250.c(new Supplier() { // from class: beyt
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m250.j(new dtsc() { // from class: beyu
        });
        m250.a();
        dtsb m251 = dtsd.m();
        m251.m(4);
        m251.b("profiles_table.profile_access_token");
        m251.i(60170);
        m251.c(new Supplier() { // from class: beyv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m251.j(new dtsc() { // from class: beyw
        });
        m251.a();
        dtsb m252 = dtsd.m();
        m252.m(2);
        m252.b("profiles_table.sending_self_profile_interaction_state");
        m252.i(60200);
        m252.c(new Supplier() { // from class: beyx
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m252.j(new dtsc() { // from class: beyz
        });
        m252.a();
        dtsb m253 = dtsd.m();
        m253.m(5);
        m253.b("profiles_table.self_profile_sharing_metadata");
        m253.i(60340);
        m253.c(new Supplier() { // from class: beza
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m253.j(new dtsc() { // from class: bezb
        });
        m253.a();
        dtsb m254 = dtsd.m();
        m254.m(4);
        m254.b("profiles_table.first_name");
        m254.i(-1);
        m254.c(new Supplier() { // from class: bezd
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m254.j(new dtsc() { // from class: beze
        });
        m254.a();
        dtsb m255 = dtsd.m();
        m255.m(4);
        m255.b("profiles_table.last_name");
        m255.i(-1);
        m255.c(new Supplier() { // from class: bezf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m255.j(new dtsc() { // from class: bezg
        });
        m255.a();
        dtsb m256 = dtsd.m();
        m256.m(4);
        m256.b("profiles_table.photo_uri");
        m256.i(-1);
        m256.c(new Supplier() { // from class: bezh
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m256.j(new dtsc() { // from class: bezi
        });
        m256.a();
        dtsb m257 = dtsd.m();
        m257.m(4);
        m257.b("profiles_table.sender_last_updated_time");
        m257.i(60170);
        m257.c(new Supplier() { // from class: bezj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m257.j(new dtsc() { // from class: bezl
        });
        m257.a();
        dtsb m258 = dtsd.m();
        m258.m(4);
        m258.b("profiles_table.sender_last_updated_time_from_rcs");
        m258.i(60200);
        m258.c(new Supplier() { // from class: bezm
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m258.j(new dtsc() { // from class: bezo
        });
        m258.a();
        dtsb m259 = dtsd.m();
        m259.m(4);
        m259.d(true);
        m259.b("profiles_table.contact_lookup_key");
        m259.i(-1);
        m259.c(new Supplier() { // from class: bezp
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m259.j(new dtsc() { // from class: bezq
        });
        m259.a();
        dtsb m260 = dtsd.m();
        m260.m(4);
        m260.d(true);
        m260.b("profiles_table.phone_number");
        m260.i(-1);
        m260.c(new Supplier() { // from class: bezr
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m260.j(new dtsc() { // from class: bezs
        });
        m260.a();
        dtsb m261 = dtsd.m();
        m261.m(1);
        m261.b("profiles_table.is_self_profile_shareable");
        m261.i(60400);
        m261.c(new Supplier() { // from class: bezt
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m261.j(new dtsc() { // from class: bezu
        });
        m261.a();
        dtsb m262 = dtsd.m();
        m262.m(2);
        m262.b("profiles_table.has_shared_access_token_with_user");
        m262.i(60170);
        m262.c(new Supplier() { // from class: bezv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m262.j(new dtsc() { // from class: bezx
        });
        m262.a();
        dtsb m263 = dtsd.m();
        m263.m(1);
        m263.b("profiles_table.name_timestamp");
        m263.i(-1);
        m263.c(new Supplier() { // from class: bezz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m263.j(new dtsc() { // from class: bfaa
        });
        m263.a();
        dtsb m264 = dtsd.m();
        m264.m(1);
        m264.b("profiles_table.photo_timestamp");
        m264.i(-1);
        m264.c(new Supplier() { // from class: bfab
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m264.j(new dtsc() { // from class: bfac
        });
        m264.a();
        dtsb m265 = dtsd.m();
        m265.m(1);
        m265.b("profiles_table.belongs_to_self_gaia");
        m265.i(59940);
        m265.c(new Supplier() { // from class: bfad
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m265.j(new dtsc() { // from class: bfae
        });
        m265.a();
        dtsb m266 = dtsd.m();
        m266.m(1);
        m266.b("profiles_table.gaia_update_timestamp");
        m266.i(59940);
        m266.c(new Supplier() { // from class: bfaf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m266.j(new dtsc() { // from class: bfag
        });
        m266.a();
        dtsb m267 = dtsd.m();
        m267.m(4);
        m267.b("parts.text");
        m267.i(-1);
        m267.c(new Supplier() { // from class: bfah
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m267.j(new dtsc() { // from class: bfal
        });
        m267.a();
        dtsb m268 = dtsd.m();
        m268.m(4);
        m268.b("parts.uri");
        m268.i(-1);
        m268.c(new Supplier() { // from class: bfam
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m268.j(new dtsc() { // from class: bfan
        });
        m268.a();
        dtsb m269 = dtsd.m();
        m269.m(4);
        m269.d(true);
        m269.b("parts.content_type");
        m269.i(-1);
        m269.c(new Supplier() { // from class: bfao
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m269.j(new dtsc() { // from class: bfap
        });
        m269.a();
        dtsb m270 = dtsd.m();
        m270.m(2);
        m270.l(true);
        m270.g(true);
        m270.d(true);
        m270.b("parts._id");
        m270.i(-1);
        m270.c(new Supplier() { // from class: bfaq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m270.j(new dtsc() { // from class: bfar
        });
        m270.a();
        dtsb m271 = dtsd.m();
        m271.m(1);
        m271.d(true);
        m271.e(true);
        m271.h(new Supplier() { // from class: bfas
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        });
        m271.b("parts.message_id");
        m271.i(-1);
        m271.c(new Supplier() { // from class: bfat
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m271.j(new dtsc() { // from class: bfau
        });
        m271.a();
        dtsb m272 = dtsd.m();
        m272.m(4);
        m272.b("parts.original_uri");
        m272.i(10021);
        m272.c(new Supplier() { // from class: bfax
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m272.j(new dtsc() { // from class: bfay
        });
        m272.a();
        dtsb m273 = dtsd.m();
        m273.m(4);
        m273.b("parts.storage_uri");
        m273.i(29060);
        m273.c(new Supplier() { // from class: bfaz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m273.j(new dtsc() { // from class: bfba
        });
        m273.a();
        dtsb m274 = dtsd.m();
        m274.m(1);
        m274.b("parts.width");
        m274.i(-1);
        m274.c(new Supplier() { // from class: bfbb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m274.j(new dtsc() { // from class: bfbc
        });
        m274.a();
        dtsb m275 = dtsd.m();
        m275.m(1);
        m275.b("parts.height");
        m275.i(-1);
        m275.c(new Supplier() { // from class: bfbd
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m275.j(new dtsc() { // from class: bfbe
        });
        m275.a();
        dtsb m276 = dtsd.m();
        m276.m(1);
        m276.b("parts.timestamp");
        m276.i(3010);
        m276.c(new Supplier() { // from class: bfbf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m276.j(new dtsc() { // from class: bfbh
        });
        m276.a();
        dtsb m277 = dtsd.m();
        m277.m(4);
        m277.d(true);
        m277.b("parts.output_uri");
        m277.i(4020);
        m277.c(new Supplier() { // from class: bfbj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m277.j(new dtsc() { // from class: bfbk
        });
        m277.a();
        dtsb m278 = dtsd.m();
        m278.m(1);
        m278.b("parts.target_size");
        m278.i(4020);
        m278.c(new Supplier() { // from class: bfbl
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m278.j(new dtsc() { // from class: bfbm
        });
        m278.a();
        dtsb m279 = dtsd.m();
        m279.m(1);
        m279.b("parts.processing_status");
        m279.i(4020);
        m279.c(new Supplier() { // from class: bfbn
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m279.j(new dtsc() { // from class: bfbo
        });
        m279.a();
        dtsb m280 = dtsd.m();
        m280.m(1);
        m280.b("parts.cms_attachment_processing_status");
        m280.i(44010);
        m280.c(new Supplier() { // from class: bfbp
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m280.j(new dtsc() { // from class: bfbq
        });
        m280.a();
        dtsb m281 = dtsd.m();
        m281.m(1);
        m281.d(true);
        m281.e(true);
        m281.h(new Supplier() { // from class: bfbs
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsom.c.a;
            }
        });
        m281.b("parts.conversation_id");
        m281.i(-1);
        m281.c(new Supplier() { // from class: bfbt
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m281.j(new dtsc() { // from class: bfbv
        });
        m281.a();
        dtsb m282 = dtsd.m();
        m282.m(1);
        m282.b("parts.sticker_set_id");
        m282.i(5020);
        m282.c(new Supplier() { // from class: bfbw
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m282.j(new dtsc() { // from class: bfbx
        });
        m282.a();
        dtsb m283 = dtsd.m();
        m283.m(1);
        m283.b("parts.sticker_id");
        m283.i(5020);
        m283.c(new Supplier() { // from class: bfby
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m283.j(new dtsc() { // from class: bfbz
        });
        m283.a();
        dtsb m284 = dtsd.m();
        m284.m(1);
        m284.b("parts.media_modified_timestamp");
        m284.i(7000);
        m284.c(new Supplier() { // from class: bfca
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m284.j(new dtsc() { // from class: bfcb
        });
        m284.a();
        dtsb m285 = dtsd.m();
        m285.m(3);
        m285.b("parts.longitude");
        m285.i(10005);
        m285.c(new Supplier() { // from class: bfcd
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m285.j(new dtsc() { // from class: bfce
        });
        m285.a();
        dtsb m286 = dtsd.m();
        m286.m(3);
        m286.b("parts.latitude");
        m286.i(10005);
        m286.c(new Supplier() { // from class: bfcf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m286.j(new dtsc() { // from class: bfch
        });
        m286.a();
        dtsb m287 = dtsd.m();
        m287.m(4);
        m287.b("parts.preview_content_uri");
        m287.i(10017);
        m287.c(new Supplier() { // from class: bfci
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m287.j(new dtsc() { // from class: bfcj
        });
        m287.a();
        dtsb m288 = dtsd.m();
        m288.m(4);
        m288.d(true);
        m288.b("parts.preview_content_type");
        m288.i(10017);
        m288.c(new Supplier() { // from class: bfck
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m288.j(new dtsc() { // from class: bfcl
        });
        m288.a();
        dtsb m289 = dtsd.m();
        m289.m(4);
        m289.b("parts.fallback_uri");
        m289.i(13000);
        m289.c(new Supplier() { // from class: bfcm
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m289.j(new dtsc() { // from class: bfco
        });
        m289.a();
        dtsb m290 = dtsd.m();
        m290.m(1);
        m290.b("parts.source");
        m290.i(14010);
        m290.c(new Supplier() { // from class: bfcp
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m290.j(new dtsc() { // from class: bfcq
        });
        m290.a();
        dtsb m291 = dtsd.m();
        m291.m(1);
        m291.b("parts.bundle_index");
        m291.i(17010);
        m291.c(new Supplier() { // from class: bfcr
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m291.j(new dtsc() { // from class: bfcu
        });
        m291.a();
        dtsb m292 = dtsd.m();
        m292.m(4);
        m292.b("parts.blob_id");
        m292.i(17020);
        m292.c(new Supplier() { // from class: bfcv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m292.j(new dtsc() { // from class: bfcw
        });
        m292.a();
        dtsb m293 = dtsd.m();
        m293.m(4);
        m293.b("parts.blob_gaia_email");
        m293.i(59570);
        m293.c(new Supplier() { // from class: bfcx
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m293.j(new dtsc() { // from class: bfcz
        });
        m293.a();
        dtsb m294 = dtsd.m();
        m294.m(4);
        m294.b("parts.cms_full_size_blob_id");
        m294.i(40040);
        m294.c(new Supplier() { // from class: bfda
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m294.j(new dtsc() { // from class: bfdb
        });
        m294.a();
        dtsb m295 = dtsd.m();
        m295.m(5);
        m295.b("parts.cms_media_encryption_key");
        m295.i(42010);
        m295.c(new Supplier() { // from class: bfdc
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m295.j(new dtsc() { // from class: bfdd
        });
        m295.a();
        dtsb m296 = dtsd.m();
        m296.m(5);
        m296.b("parts.cms_compressed_media_encryption_key");
        m296.i(42070);
        m296.c(new Supplier() { // from class: bfde
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m296.j(new dtsc() { // from class: bfdg
        });
        m296.a();
        dtsb m297 = dtsd.m();
        m297.m(1);
        m297.b("parts.blob_upload_permanent_failure");
        m297.i(18000);
        m297.c(new Supplier() { // from class: bfdh
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m297.j(new dtsc() { // from class: bfdi
        });
        m297.a();
        dtsb m298 = dtsd.m();
        m298.m(1);
        m298.b("parts.blob_upload_timestamp");
        m298.i(19030);
        m298.c(new Supplier() { // from class: bfdk
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m298.j(new dtsc() { // from class: bfdl
        });
        m298.a();
        dtsb m299 = dtsd.m();
        m299.m(4);
        m299.b("parts.expressive_sticker_name");
        m299.i(22060);
        m299.c(new Supplier() { // from class: bfdm
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m299.j(new dtsc() { // from class: bfdn
        });
        m299.a();
        dtsb m300 = dtsd.m();
        m300.m(4);
        m300.b("parts.file_name");
        m300.i(26000);
        m300.c(new Supplier() { // from class: bfdo
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m300.j(new dtsc() { // from class: bfdp
        });
        m300.a();
        dtsb m301 = dtsd.m();
        m301.m(1);
        m301.b("parts.duration");
        m301.i(26040);
        m301.c(new Supplier() { // from class: bfdq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m301.j(new dtsc() { // from class: bfds
        });
        m301.a();
        dtsb m302 = dtsd.m();
        m302.m(4);
        m302.b("parts.compressed_blob_id");
        m302.i(27000);
        m302.c(new Supplier() { // from class: bfdt
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m302.j(new dtsc() { // from class: bfdv
        });
        m302.a();
        dtsb m303 = dtsd.m();
        m303.m(4);
        m303.b("parts.cms_compressed_blob_id");
        m303.i(40040);
        m303.c(new Supplier() { // from class: bfdw
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m303.j(new dtsc() { // from class: bfdx
        });
        m303.a();
        dtsb m304 = dtsd.m();
        m304.m(1);
        m304.b("parts.compressed_blob_upload_permanent_failure");
        m304.i(27000);
        m304.c(new Supplier() { // from class: bfdy
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m304.j(new dtsc() { // from class: bfdz
        });
        m304.a();
        dtsb m305 = dtsd.m();
        m305.m(1);
        m305.b("parts.compressed_blob_upload_timestamp");
        m305.i(27000);
        m305.c(new Supplier() { // from class: bfea
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m305.j(new dtsc() { // from class: bfeb
        });
        m305.a();
        dtsb m306 = dtsd.m();
        m306.m(5);
        m306.b("parts.media_encryption_key");
        m306.i(30040);
        m306.c(new Supplier() { // from class: bfec
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m306.j(new dtsc() { // from class: bfee
        });
        m306.a();
        dtsb m307 = dtsd.m();
        m307.m(5);
        m307.b("parts.compressed_media_encryption_key");
        m307.i(30040);
        m307.c(new Supplier() { // from class: bfeg
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m307.j(new dtsc() { // from class: bfeh
        });
        m307.a();
        dtsb m308 = dtsd.m();
        m308.m(5);
        m308.b("parts.attachment_upload_response");
        m308.i(49010);
        m308.c(new Supplier() { // from class: bfei
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m308.j(new dtsc() { // from class: bfej
        });
        m308.a();
        dtsb m309 = dtsd.m();
        m309.m(1);
        m309.b("parts.missing_entry_in_telephony");
        m309.i(52030);
        m309.c(new Supplier() { // from class: bfek
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m309.j(new dtsc() { // from class: bfel
        });
        m309.a();
        dtsb m310 = dtsd.m();
        m310.m(1);
        m310.b("parts.awaiting_reverse_sync");
        m310.i(53040);
        m310.c(new Supplier() { // from class: bfem
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m310.j(new dtsc() { // from class: bfen
        });
        m310.a();
        dtsb m311 = dtsd.m();
        m311.m(1);
        m311.b("parts.file_size_bytes");
        m311.i(52050);
        m311.c(new Supplier() { // from class: bfeo
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m311.j(new dtsc() { // from class: bfes
        });
        m311.a();
        dtsb m312 = dtsd.m();
        m312.m(4);
        m312.d(true);
        m312.b("parts.local_cache_path");
        m312.i(52050);
        m312.c(new Supplier() { // from class: bfet
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m312.j(new dtsc() { // from class: bfeu
        });
        m312.a();
        dtsb m313 = dtsd.m();
        m313.m(1);
        m313.b("parts.media_send_type");
        m313.i(58150);
        m313.c(new Supplier() { // from class: bfev
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m313.j(new dtsc() { // from class: bfew
        });
        m313.a();
        dtsb m314 = dtsd.m();
        m314.m(5);
        m314.b("parts.voice_metadata");
        m314.i(59470);
        m314.c(new Supplier() { // from class: bfex
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m314.j(new dtsc() { // from class: bfey
        });
        m314.a();
        dtsb m315 = dtsd.m();
        m315.m(1);
        m315.b("parts.validation_status");
        m315.i(58770);
        m315.c(new Supplier() { // from class: bfez
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m315.j(new dtsc() { // from class: bffa
        });
        m315.a();
        dtsb m316 = dtsd.m();
        m316.m(4);
        m316.b("parts.processing_id");
        m316.i(60080);
        m316.c(new Supplier() { // from class: bffb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m316.j(new dtsc() { // from class: bffe
        });
        m316.a();
        dtsb m317 = dtsd.m();
        m317.m(1);
        m317.b("parts.rich_card_media_download_failure_reason");
        m317.i(60230);
        m317.c(new Supplier() { // from class: bfff
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m317.j(new dtsc() { // from class: bffg
        });
        m317.a();
        dtsb m318 = dtsd.m();
        m318.m(1);
        m318.b("parts.image_display_state");
        m318.i(60240);
        m318.c(new Supplier() { // from class: bffh
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m318.j(new dtsc() { // from class: bffi
        });
        m318.a();
        dtsb m319 = dtsd.m();
        m319.m(1);
        m319.b("parts.preserve_size");
        m319.i(60680);
        m319.c(new Supplier() { // from class: bffj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m319.j(new dtsc() { // from class: bffk
        });
        m319.a();
        dtsb m320 = dtsd.m();
        m320.m(2);
        m320.b("vmt.vmt_status");
        m320.i(-1);
        m320.c(new Supplier() { // from class: bffl
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m320.j(new dtsc() { // from class: bffm
        });
        m320.a();
        dtsb m321 = dtsd.m();
        m321.m(4);
        m321.b("vmt.text");
        m321.i(-1);
        m321.c(new Supplier() { // from class: bffo
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m321.j(new dtsc() { // from class: bffq
        });
        m321.a();
        dtsb m322 = dtsd.m();
        m322.m(2);
        m322.l(true);
        m322.d(true);
        m322.e(true);
        m322.h(new Supplier() { // from class: bffr
            @Override // java.util.function.Supplier
            public final Object get() {
                return PartsTable.d.a;
            }
        });
        m322.b("vmt.part_id");
        m322.f(true);
        m322.i(-1);
        m322.c(new Supplier() { // from class: bffs
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m322.j(new dtsc() { // from class: bfft
        });
        m322.a();
        dtsb m323 = dtsd.m();
        m323.m(4);
        m323.b("vmt.locale");
        m323.i(-1);
        m323.c(new Supplier() { // from class: bffu
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m323.j(new dtsc() { // from class: bffv
        });
        m323.a();
        dtsb m324 = dtsd.m();
        m324.m(2);
        m324.d(true);
        m324.b("reminders.trigger_time");
        m324.i(-1);
        m324.c(new Supplier() { // from class: bffw
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m324.j(new dtsc() { // from class: bffx
        });
        m324.a();
        dtsb m325 = dtsd.m();
        m325.m(2);
        m325.l(true);
        m325.g(true);
        m325.d(true);
        m325.b("reminders._id");
        m325.i(-1);
        m325.c(new Supplier() { // from class: bffz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m325.j(new dtsc() { // from class: bfga
        });
        m325.a();
        dtsb m326 = dtsd.m();
        m326.m(2);
        m326.l(true);
        m326.d(true);
        m326.e(true);
        m326.h(new Supplier() { // from class: bfgc
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        });
        m326.b("reminders.message_id");
        m326.i(-1);
        m326.c(new Supplier() { // from class: bfgd
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m326.j(new dtsc() { // from class: bfge
        });
        m326.a();
        dtsb m327 = dtsd.m();
        m327.m(2);
        m327.d(true);
        m327.e(true);
        m327.h(new Supplier() { // from class: bfgf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsom.c.a;
            }
        });
        m327.b("reminders.conversation_id");
        m327.i(35070);
        m327.c(new Supplier() { // from class: bfgg
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m327.j(new dtsc() { // from class: bfgh
        });
        m327.a();
        dtsb m328 = dtsd.m();
        m328.m(2);
        m328.b("reminders.status");
        m328.i(-1);
        m328.c(new Supplier() { // from class: bfgi
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m328.j(new dtsc() { // from class: bfgk
        });
        m328.a();
        dtsb m329 = dtsd.m();
        m329.m(1);
        m329.d(true);
        m329.b("messages_annotations.annotation_type");
        m329.i(-1);
        m329.c(new Supplier() { // from class: bfgl
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m329.j(new dtsc() { // from class: bfgm
        });
        m329.a();
        dtsb m330 = dtsd.m();
        m330.m(5);
        m330.b("messages_annotations.annotation_details");
        m330.i(-1);
        m330.c(new Supplier() { // from class: bfgo
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m330.j(new dtsc() { // from class: bfgp
        });
        m330.a();
        dtsb m331 = dtsd.m();
        m331.m(2);
        m331.l(true);
        m331.g(true);
        m331.d(true);
        m331.b("messages_annotations._id");
        m331.i(-1);
        m331.c(new Supplier() { // from class: bfgq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m331.j(new dtsc() { // from class: bfgr
        });
        m331.a();
        dtsb m332 = dtsd.m();
        m332.m(4);
        m332.d(true);
        m332.b("messages_annotations.conversation_id");
        m332.i(-1);
        m332.c(new Supplier() { // from class: bfgs
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m332.j(new dtsc() { // from class: bfgt
        });
        m332.a();
        dtsb m333 = dtsd.m();
        m333.m(2);
        m333.d(true);
        m333.e(true);
        m333.h(new Supplier() { // from class: bfgv
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        });
        m333.b("messages_annotations.message_id");
        m333.i(20040);
        m333.c(new Supplier() { // from class: bfgw
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m333.j(new dtsc() { // from class: bfgx
        });
        m333.a();
        dtsb m334 = dtsd.m();
        m334.m(2);
        m334.l(true);
        m334.g(true);
        m334.d(true);
        m334.b("message_star._id");
        m334.i(-1);
        m334.c(new Supplier() { // from class: bfgy
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m334.j(new dtsc() { // from class: bfha
        });
        m334.a();
        dtsb m335 = dtsd.m();
        m335.m(2);
        m335.l(true);
        m335.d(true);
        m335.e(true);
        m335.h(new Supplier() { // from class: bfhb
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        });
        m335.b("message_star.message_id");
        m335.f(true);
        m335.i(-1);
        m335.c(new Supplier() { // from class: bfhc
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m335.j(new dtsc() { // from class: bfhd
        });
        m335.a();
        dtsb m336 = dtsd.m();
        m336.m(2);
        m336.l(true);
        m336.g(true);
        m336.d(true);
        m336.e(true);
        m336.h(new Supplier() { // from class: bfhe
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsom.c.a;
            }
        });
        m336.b("parent_disallowed_conversations.conversation_id");
        m336.i(-1);
        m336.c(new Supplier() { // from class: bfhg
            @Override // java.util.function.Supplier
            public final Object get() {
                return bfkq.c();
            }
        });
        m336.j(new dtsc() { // from class: bfhh
        });
        m336.a();
    }
}
