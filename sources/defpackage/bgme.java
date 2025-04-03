package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bgme {
    public final bgmf a;
    public final bgmf b;

    public bgme() {
        dtsb m = dtsd.m();
        m.m(2);
        m.l(true);
        m.g(true);
        m.d(true);
        m.b("conversations._id");
        m.i(-1);
        m.c(new Supplier() { // from class: bflf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m.j(new dtsc() { // from class: bfls
        });
        this.a = new bgmf(m.a());
        dtsb m2 = dtsd.m();
        m2.m(1);
        m2.d(true);
        m2.b("conversations.sms_thread_id");
        m2.i(-1);
        m2.c(new Supplier() { // from class: bfql
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m2.j(new dtsc() { // from class: bfve
        });
        m2.a();
        dtsb m3 = dtsd.m();
        m3.m(4);
        m3.b("conversations.name");
        m3.i(-1);
        m3.c(new Supplier() { // from class: bfzx
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m3.j(new dtsc() { // from class: bgeq
        });
        m3.a();
        dtsb m4 = dtsd.m();
        m4.m(2);
        m4.b("conversations.name_is_automatic");
        m4.i(10012);
        m4.c(new Supplier() { // from class: bgjj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m4.j(new dtsc() { // from class: bgjw
        });
        m4.a();
        dtsb m5 = dtsd.m();
        m5.m(4);
        m5.b("conversations.snippet_text");
        m5.i(-1);
        m5.c(new Supplier() { // from class: bgki
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m5.j(new dtsc() { // from class: bgkw
        });
        m5.a();
        dtsb m6 = dtsd.m();
        m6.m(4);
        m6.b("conversations.subject_text");
        m6.i(-1);
        m6.c(new Supplier() { // from class: bfmb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m6.j(new dtsc() { // from class: bfqt
        });
        m6.a();
        dtsb m7 = dtsd.m();
        m7.m(4);
        m7.b("conversations.preview_uri");
        m7.i(-1);
        m7.c(new Supplier() { // from class: bfvl
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m7.j(new dtsc() { // from class: bgad
        });
        m7.a();
        dtsb m8 = dtsd.m();
        m8.m(4);
        m8.b("conversations.preview_content_type");
        m8.i(-1);
        m8.c(new Supplier() { // from class: bgev
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m8.j(new dtsc() { // from class: bgjn
        });
        m8.a();
        dtsb m9 = dtsd.m();
        m9.m(1);
        m9.b("conversations.show_draft");
        m9.i(-1);
        m9.c(new Supplier() { // from class: bgle
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m9.j(new dtsc() { // from class: bglq
        });
        m9.a();
        dtsb m10 = dtsd.m();
        m10.m(4);
        m10.b("conversations.draft_snippet_text");
        m10.i(-1);
        m10.c(new Supplier() { // from class: bgmc
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m10.j(new dtsc() { // from class: bflr
        });
        m10.a();
        dtsb m11 = dtsd.m();
        m11.m(4);
        m11.b("conversations.draft_subject_text");
        m11.i(-1);
        m11.c(new Supplier() { // from class: bfme
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m11.j(new dtsc() { // from class: bfmq
        });
        m11.a();
        dtsb m12 = dtsd.m();
        m12.m(4);
        m12.b("conversations.draft_preview_uri");
        m12.i(-1);
        m12.c(new Supplier() { // from class: bfnc
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m12.j(new dtsc() { // from class: bfno
        });
        m12.a();
        dtsb m13 = dtsd.m();
        m13.m(4);
        m13.b("conversations.draft_preview_content_type");
        m13.i(-1);
        m13.c(new Supplier() { // from class: bfoa
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m13.j(new dtsc() { // from class: bfom
        });
        m13.a();
        dtsb m14 = dtsd.m();
        m14.m(1);
        m14.b("conversations.etouffee_default");
        m14.i(29060);
        m14.c(new Supplier() { // from class: bfoy
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m14.j(new dtsc() { // from class: bfpk
        });
        m14.a();
        dtsb m15 = dtsd.m();
        m15.m(1);
        m15.d(true);
        m15.b("conversations.archive_status");
        m15.i(-1);
        m15.c(new Supplier() { // from class: bfpy
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m15.j(new dtsc() { // from class: bfqk
        });
        m15.a();
        dtsb m16 = dtsd.m();
        m16.m(1);
        m16.d(true);
        m16.b("conversations.sort_timestamp");
        m16.i(-1);
        m16.c(new Supplier() { // from class: bfqx
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m16.j(new dtsc() { // from class: bfrj
        });
        this.b = new bgmf(m16.a());
        dtsb m17 = dtsd.m();
        m17.m(4);
        m17.b("conversations.icon");
        m17.i(-1);
        m17.c(new Supplier() { // from class: bfrv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m17.j(new dtsc() { // from class: bfsh
        });
        m17.a();
        dtsb m18 = dtsd.m();
        m18.m(1);
        m18.b("conversations.participant_contact_id");
        m18.i(-1);
        m18.c(new Supplier() { // from class: bfst
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m18.j(new dtsc() { // from class: bftf
        });
        m18.a();
        dtsb m19 = dtsd.m();
        m19.m(4);
        m19.b("conversations.participant_lookup_key");
        m19.i(-1);
        m19.c(new Supplier() { // from class: bftr
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m19.j(new dtsc() { // from class: bfuf
        });
        m19.a();
        dtsb m20 = dtsd.m();
        m20.m(4);
        m20.d(true);
        m20.b("conversations.participant_normalized_destination");
        m20.i(-1);
        m20.c(new Supplier() { // from class: bfur
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m20.j(new dtsc() { // from class: bfvd
        });
        m20.a();
        dtsb m21 = dtsd.m();
        m21.m(4);
        m21.b("conversations.current_self_id");
        m21.i(-1);
        m21.c(new Supplier() { // from class: bfvq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m21.j(new dtsc() { // from class: bfwc
        });
        m21.a();
        dtsb m22 = dtsd.m();
        m22.m(4);
        m22.d(true);
        m22.e(true);
        m22.h(new Supplier() { // from class: bfwo
            @Override // java.util.function.Supplier
            public final Object get() {
                return azoi.c.a;
            }
        });
        m22.b("conversations.current_my_identity_foreign_key");
        m22.i(60160);
        m22.c(new Supplier() { // from class: bfxa
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m22.j(new dtsc() { // from class: bfxm
        });
        m22.a();
        dtsb m23 = dtsd.m();
        m23.m(1);
        m23.b("conversations.participant_count");
        m23.i(-1);
        m23.c(new Supplier() { // from class: bfxy
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m23.j(new dtsc() { // from class: bfym
        });
        m23.a();
        dtsb m24 = dtsd.m();
        m24.m(1);
        m24.b("conversations.notification_enabled");
        m24.i(-1);
        m24.c(new Supplier() { // from class: bfyy
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m24.j(new dtsc() { // from class: bfzk
        });
        m24.a();
        dtsb m25 = dtsd.m();
        m25.m(4);
        m25.b("conversations.notification_sound_uri");
        m25.i(-1);
        m25.c(new Supplier() { // from class: bfzw
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m25.j(new dtsc() { // from class: bgaj
        });
        m25.a();
        dtsb m26 = dtsd.m();
        m26.m(1);
        m26.b("conversations.notification_vibration");
        m26.i(-1);
        m26.c(new Supplier() { // from class: bgav
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m26.j(new dtsc() { // from class: bgbh
        });
        m26.a();
        dtsb m27 = dtsd.m();
        m27.m(1);
        m27.b("conversations.include_email_addr");
        m27.i(-1);
        m27.c(new Supplier() { // from class: bgbt
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m27.j(new dtsc() { // from class: bgcf
        });
        m27.a();
        dtsb m28 = dtsd.m();
        m28.m(1);
        m28.b("conversations.source_type");
        m28.i(8500);
        m28.c(new Supplier() { // from class: bgct
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m28.j(new dtsc() { // from class: bgdf
        });
        m28.a();
        dtsb m29 = dtsd.m();
        m29.m(1);
        m29.d(true);
        m29.b("conversations.rcs_session_id");
        m29.i(10000);
        m29.c(new Supplier() { // from class: bgdr
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m29.j(new dtsc() { // from class: bged
        });
        m29.a();
        dtsb m30 = dtsd.m();
        m30.m(1);
        m30.b("conversations.join_state");
        m30.i(10006);
        m30.c(new Supplier() { // from class: bgep
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m30.j(new dtsc() { // from class: bgfc
        });
        m30.a();
        dtsb m31 = dtsd.m();
        m31.m(1);
        m31.b("conversations.conv_type");
        m31.i(10007);
        m31.c(new Supplier() { // from class: bgfo
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m31.j(new dtsc() { // from class: bgga
        });
        m31.a();
        dtsb m32 = dtsd.m();
        m32.m(1);
        m32.b("conversations.send_mode");
        m32.i(10016);
        m32.c(new Supplier() { // from class: bggm
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m32.j(new dtsc() { // from class: bgha
        });
        m32.a();
        dtsb m33 = dtsd.m();
        m33.m(1);
        m33.b("conversations.IS_ENTERPRISE");
        m33.i(10018);
        m33.c(new Supplier() { // from class: bghm
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m33.j(new dtsc() { // from class: bghy
        });
        m33.a();
        dtsb m34 = dtsd.m();
        m34.m(1);
        m34.b("conversations.has_ea2p_bot_recipient");
        m34.i(12001);
        m34.c(new Supplier() { // from class: bgik
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m34.j(new dtsc() { // from class: bgiw
        });
        m34.a();
        dtsb m35 = dtsd.m();
        m35.m(4);
        m35.b("conversations.participant_display_destination");
        m35.i(15010);
        m35.c(new Supplier() { // from class: bgji
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m35.j(new dtsc() { // from class: bgjl
        });
        m35.a();
        dtsb m36 = dtsd.m();
        m36.m(1);
        m36.d(true);
        m36.b("conversations.delete_timestamp");
        m36.i(29020);
        m36.c(new Supplier() { // from class: bgjm
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m36.j(new dtsc() { // from class: bgjo
        });
        m36.a();
        dtsb m37 = dtsd.m();
        m37.m(4);
        m37.l(true);
        m37.d(true);
        m37.b("conversations.cms_id");
        m37.f(true);
        m37.i(32000);
        m37.c(new Supplier() { // from class: bgjp
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m37.j(new dtsc() { // from class: bgjq
        });
        m37.a();
        dtsb m38 = dtsd.m();
        m38.m(4);
        m38.d(true);
        m38.b("conversations.rcs_group_id");
        m38.i(40050);
        m38.c(new Supplier() { // from class: bgjr
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m38.j(new dtsc() { // from class: bgjs
        });
        m38.a();
        dtsb m39 = dtsd.m();
        m39.m(4);
        m39.b("conversations.rcs_conference_uri");
        m39.i(40050);
        m39.c(new Supplier() { // from class: bgjt
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m39.j(new dtsc() { // from class: bgju
        });
        m39.a();
        dtsb m40 = dtsd.m();
        m40.m(1);
        m40.b("conversations.rcs_session_allows_revocation");
        m40.i(48040);
        m40.c(new Supplier() { // from class: bgjv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m40.j(new dtsc() { // from class: bgjx
        });
        m40.a();
        dtsb m41 = dtsd.m();
        m41.m(1);
        m41.b("conversations.awaiting_reverse_sync");
        m41.i(49060);
        m41.c(new Supplier() { // from class: bgjz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m41.j(new dtsc() { // from class: bgka
        });
        m41.a();
        dtsb m42 = dtsd.m();
        m42.m(1);
        m42.b("conversations.error_state");
        m42.i(58140);
        m42.c(new Supplier() { // from class: bgkb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m42.j(new dtsc() { // from class: bgkc
        });
        m42.a();
        dtsb m43 = dtsd.m();
        m43.m(2);
        m43.b("conversations.rcs_group_last_sync_timestamp");
        m43.i(58910);
        m43.c(new Supplier() { // from class: bgkd
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m43.j(new dtsc() { // from class: bgke
        });
        m43.a();
        dtsb m44 = dtsd.m();
        m44.m(1);
        m44.b("conversations.has_been_e2ee");
        m44.i(59210);
        m44.c(new Supplier() { // from class: bgkf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m44.j(new dtsc() { // from class: bgkg
        });
        m44.a();
        dtsb m45 = dtsd.m();
        m45.m(1);
        m45.b("conversations.marked_as_unread");
        m45.i(59220);
        m45.c(new Supplier() { // from class: bgkh
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m45.j(new dtsc() { // from class: bgkk
        });
        m45.a();
        dtsb m46 = dtsd.m();
        m46.m(2);
        m46.b("conversations.encryption_protocol");
        m46.i(60180);
        m46.c(new Supplier() { // from class: bgkl
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m46.j(new dtsc() { // from class: bgkm
        });
        m46.a();
        dtsb m47 = dtsd.m();
        m47.m(2);
        m47.b("conversations.unread_count");
        m47.i(60740);
        m47.c(new Supplier() { // from class: bgkn
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m47.j(new dtsc() { // from class: bgko
        });
        m47.a();
        dtsb m48 = dtsd.m();
        m48.m(4);
        m48.b("conversations.subtitle");
        m48.i(59760);
        m48.c(new Supplier() { // from class: bgkp
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m48.j(new dtsc() { // from class: bgkq
        });
        m48.a();
        dtsb m49 = dtsd.m();
        m49.m(1);
        m49.b("conversations.latest_message_id");
        m49.i(-1);
        m49.c(new Supplier() { // from class: bgkr
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m49.j(new dtsc() { // from class: bgks
        });
        m49.a();
        dtsb m50 = dtsd.m();
        m50.m(1);
        m50.b("conversations.last_read_timestamp");
        m50.i(-1);
        m50.c(new Supplier() { // from class: bgkt
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m50.j(new dtsc() { // from class: bfpm
        });
        m50.a();
        dtsb m51 = dtsd.m();
        m51.m(1);
        m51.b("conversations.normalized_participant_contact_id");
        m51.i(58090);
        m51.c(new Supplier() { // from class: bftt
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m51.j(new dtsc() { // from class: bfya
        });
        m51.a();
        dtsb m52 = dtsd.m();
        m52.m(4);
        m52.b("conversations.normalized_participant_lookup_key");
        m52.i(58090);
        m52.c(new Supplier() { // from class: bgch
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m52.j(new dtsc() { // from class: bggo
        });
        m52.a();
        dtsb m53 = dtsd.m();
        m53.m(4);
        m53.l(true);
        m53.d(true);
        m53.b("conversations.participant_comparable_destination");
        m53.f(true);
        m53.i(58090);
        m53.c(new Supplier() { // from class: bgkv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m53.j(new dtsc() { // from class: bglh
        });
        m53.a();
        dtsb m54 = dtsd.m();
        m54.m(4);
        m54.b("conversations.current_my_identity");
        m54.i(59810);
        m54.c(new Supplier() { // from class: bgls
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m54.j(new dtsc() { // from class: bgmd
        });
        m54.a();
        dtsb m55 = dtsd.m();
        m55.m(4);
        m55.d(true);
        m55.e(true);
        m55.h(new Supplier() { // from class: bflq
            @Override // java.util.function.Supplier
            public final Object get() {
                return azdt.b.a;
            }
        });
        m55.b("conversations.destination_token");
        m55.i(60360);
        m55.c(new Supplier() { // from class: bfmm
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m55.j(new dtsc() { // from class: bfmx
        });
        m55.a();
        dtsb m56 = dtsd.m();
        m56.m(4);
        m56.b("conversations.sms_service_center");
        m56.i(-1);
        m56.c(new Supplier() { // from class: bfni
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m56.j(new dtsc() { // from class: bfnt
        });
        m56.a();
        dtsb m57 = dtsd.m();
        m57.m(4);
        m57.b("conversations.participant_id_list");
        m57.i(8500);
        m57.c(new Supplier() { // from class: bfoe
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m57.j(new dtsc() { // from class: bfop
        });
        m57.a();
        dtsb m58 = dtsd.m();
        m58.m(4);
        m58.l(true);
        m58.d(true);
        m58.b("conversations.normalized_participant_id_list");
        m58.f(true);
        m58.i(58090);
        m58.c(new Supplier() { // from class: bfpa
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m58.j(new dtsc() { // from class: bfpl
        });
        m58.a();
        dtsb m59 = dtsd.m();
        m59.m(1);
        m59.b("conversations.last_interactive_event_timestamp");
        m59.i(15000);
        m59.c(new Supplier() { // from class: bfpx
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m59.j(new dtsc() { // from class: bfqi
        });
        m59.a();
        dtsb m60 = dtsd.m();
        m60.m(4);
        m60.b("conversations.normalized_participant_display_destination");
        m60.i(58090);
        m60.c(new Supplier() { // from class: bfre
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m60.j(new dtsc() { // from class: bfrp
        });
        m60.a();
        dtsb m61 = dtsd.m();
        m61.m(1);
        m61.b("conversations.spam_warning_dismiss_status");
        m61.i(23000);
        m61.c(new Supplier() { // from class: bfsa
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m61.j(new dtsc() { // from class: bfsl
        });
        m61.a();
        dtsb m62 = dtsd.m();
        m62.m(1);
        m62.b("conversations.open_count");
        m62.i(26020);
        m62.c(new Supplier() { // from class: bfsw
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m62.j(new dtsc() { // from class: bfth
        });
        m62.a();
        dtsb m63 = dtsd.m();
        m63.m(1);
        m63.b("conversations.last_logged_scooby_metadata_timestamp");
        m63.i(28010);
        m63.c(new Supplier() { // from class: bfts
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m63.j(new dtsc() { // from class: bfue
        });
        m63.a();
        dtsb m64 = dtsd.m();
        m64.m(5);
        m64.b("conversations.tachygram_group_routing_info_token");
        m64.i(58120);
        m64.c(new Supplier() { // from class: bfup
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m64.j(new dtsc() { // from class: bfva
        });
        m64.a();
        dtsb m65 = dtsd.m();
        m65.m(1);
        m65.b("conversations.cms_most_recent_read_message_timestamp_ms");
        m65.i(53030);
        m65.c(new Supplier() { // from class: bfvw
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m65.j(new dtsc() { // from class: bfwh
        });
        m65.a();
        dtsb m66 = dtsd.m();
        m66.m(2);
        m66.b("conversations.rcs_subject_change_timestamp_ms");
        m66.i(46050);
        m66.c(new Supplier() { // from class: bfws
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m66.j(new dtsc() { // from class: bfxd
        });
        m66.a();
        dtsb m67 = dtsd.m();
        m67.m(2);
        m67.b("conversations.rcs_group_capabilities");
        m67.i(49020);
        m67.c(new Supplier() { // from class: bfxo
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m67.j(new dtsc() { // from class: bfxz
        });
        m67.a();
        dtsb m68 = dtsd.m();
        m68.m(2);
        m68.d(true);
        m68.e(true);
        m68.h(new Supplier() { // from class: bfyl
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsom.c.a;
            }
        });
        m68.b("conversations.duplicate_of");
        m68.i(58090);
        m68.c(new Supplier() { // from class: bfyw
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m68.j(new dtsc() { // from class: bfzh
        });
        m68.a();
        dtsb m69 = dtsd.m();
        m69.m(2);
        m69.d(true);
        m69.e(true);
        m69.h(new Supplier() { // from class: bfzs
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsom.c.a;
            }
        });
        m69.b("conversations.new_duplicate_of");
        m69.i(59130);
        m69.c(new Supplier() { // from class: bgao
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m69.j(new dtsc() { // from class: bgaz
        });
        m69.a();
        dtsb m70 = dtsd.m();
        m70.m(1);
        m70.b("conversations.cms_life_cycle");
        m70.i(58210);
        m70.c(new Supplier() { // from class: bgbk
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m70.j(new dtsc() { // from class: bgbv
        });
        m70.a();
        dtsb m71 = dtsd.m();
        m71.m(4);
        m71.b("conversations.rcs_group_self_msisdn");
        m71.i(58540);
        m71.c(new Supplier() { // from class: bgcg
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m71.j(new dtsc() { // from class: bgcs
        });
        m71.a();
        dtsb m72 = dtsd.m();
        m72.m(2);
        m72.b("conversations.recipient_offline_timestamp_ms");
        m72.i(58750);
        m72.c(new Supplier() { // from class: bgdd
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m72.j(new dtsc() { // from class: bgdo
        });
        m72.a();
        dtsb m73 = dtsd.m();
        m73.m(5);
        m73.b("conversations.custom_theme");
        m73.i(59820);
        m73.c(new Supplier() { // from class: bgdz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m73.j(new dtsc() { // from class: bgek
        });
        m73.a();
        dtsb m74 = dtsd.m();
        m74.m(2);
        m74.b("conversations.mms_group_upgrade_status");
        m74.i(60050);
        m74.c(new Supplier() { // from class: bgfg
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m74.j(new dtsc() { // from class: bgfr
        });
        m74.a();
        dtsb m75 = dtsd.m();
        m75.m(2);
        m75.b("conversations.mms_group_upgrade_retries");
        m75.i(60050);
        m75.c(new Supplier() { // from class: bggc
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m75.j(new dtsc() { // from class: bggn
        });
        m75.a();
        dtsb m76 = dtsd.m();
        m76.m(4);
        m76.b("conversations.encryption_id");
        m76.i(60210);
        m76.c(new Supplier() { // from class: bggz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m76.j(new dtsc() { // from class: bghk
        });
        m76.a();
        dtsb m77 = dtsd.m();
        m77.m(4);
        m77.l(true);
        m77.d(true);
        m77.b("conversations.cms_correlation_id");
        m77.f(true);
        m77.i(60250);
        m77.c(new Supplier() { // from class: bghv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m77.j(new dtsc() { // from class: bgig
        });
        m77.a();
        dtsb m78 = dtsd.m();
        m78.m(4);
        m78.b("conversations.rcs_group_icon_url");
        m78.i(60590);
        m78.c(new Supplier() { // from class: bgir
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m78.j(new dtsc() { // from class: bgjc
        });
        m78.a();
        dtsb m79 = dtsd.m();
        m79.m(2);
        m79.l(true);
        m79.g(true);
        m79.d(true);
        m79.b("messages._id");
        m79.i(-1);
        m79.c(new Supplier() { // from class: bgjy
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m79.j(new dtsc() { // from class: bgkj
        });
        m79.a();
        dtsb m80 = dtsd.m();
        m80.m(1);
        m80.d(true);
        m80.b("messages.sent_timestamp");
        m80.i(-1);
        m80.c(new Supplier() { // from class: bgku
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m80.j(new dtsc() { // from class: bgkx
        });
        m80.a();
        dtsb m81 = dtsd.m();
        m81.m(1);
        m81.d(true);
        m81.b("messages.received_timestamp");
        m81.i(-1);
        m81.c(new Supplier() { // from class: bgky
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m81.j(new dtsc() { // from class: bgkz
        });
        m81.a();
        dtsb m82 = dtsd.m();
        m82.m(1);
        m82.b("messages.message_protocol");
        m82.i(-1);
        m82.c(new Supplier() { // from class: bgla
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m82.j(new dtsc() { // from class: bglb
        });
        m82.a();
        dtsb m83 = dtsd.m();
        m83.m(1);
        m83.d(true);
        m83.b("messages.message_status");
        m83.i(-1);
        m83.c(new Supplier() { // from class: bglc
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m83.j(new dtsc() { // from class: bgld
        });
        m83.a();
        dtsb m84 = dtsd.m();
        m84.m(1);
        m84.d(true);
        m84.b("messages.read");
        m84.i(-1);
        m84.c(new Supplier() { // from class: bglf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m84.j(new dtsc() { // from class: bglg
        });
        m84.a();
        dtsb m85 = dtsd.m();
        m85.m(1);
        m85.b("messages.sms_priority");
        m85.i(-1);
        m85.c(new Supplier() { // from class: bgli
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m85.j(new dtsc() { // from class: bglj
        });
        m85.a();
        dtsb m86 = dtsd.m();
        m86.m(1);
        m86.b("messages.raw_status");
        m86.i(-1);
        m86.c(new Supplier() { // from class: bglk
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m86.j(new dtsc() { // from class: bgll
        });
        m86.a();
        dtsb m87 = dtsd.m();
        m87.m(1);
        m87.b("messages.sms_error_code");
        m87.i(9000);
        m87.c(new Supplier() { // from class: bglm
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m87.j(new dtsc() { // from class: bgln
        });
        m87.a();
        dtsb m88 = dtsd.m();
        m88.m(4);
        m88.b("messages.sms_error_desc_map_name");
        m88.i(9000);
        m88.c(new Supplier() { // from class: bglo
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m88.j(new dtsc() { // from class: bglp
        });
        m88.a();
        dtsb m89 = dtsd.m();
        m89.m(1);
        m89.d(true);
        m89.e(true);
        m89.h(new Supplier() { // from class: bglr
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsom.c.a;
            }
        });
        m89.b("messages.conversation_id");
        m89.i(-1);
        m89.c(new Supplier() { // from class: bglt
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m89.j(new dtsc() { // from class: bglu
        });
        m89.a();
        dtsb m90 = dtsd.m();
        m90.m(1);
        m90.d(true);
        m90.e(true);
        m90.h(new Supplier() { // from class: bglv
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.c.a;
            }
        });
        m90.b("messages.sender_id");
        m90.i(-1);
        m90.c(new Supplier() { // from class: bglw
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m90.j(new dtsc() { // from class: bglx
        });
        m90.a();
        dtsb m91 = dtsd.m();
        m91.m(4);
        m91.b("messages.sender_send_destination");
        m91.i(54040);
        m91.c(new Supplier() { // from class: bgly
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m91.j(new dtsc() { // from class: bglz
        });
        m91.a();
        dtsb m92 = dtsd.m();
        m92.m(4);
        m92.b("messages.msisdn_receiving_rcs_message");
        m92.i(59340);
        m92.c(new Supplier() { // from class: bgma
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m92.j(new dtsc() { // from class: bgmb
        });
        m92.a();
        dtsb m93 = dtsd.m();
        m93.m(4);
        m93.b("messages.receiving_network_country");
        m93.i(54040);
        m93.c(new Supplier() { // from class: bflg
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m93.j(new dtsc() { // from class: bflh
        });
        m93.a();
        dtsb m94 = dtsd.m();
        m94.m(1);
        m94.b("messages.queue_insert_timestamp");
        m94.i(17030);
        m94.c(new Supplier() { // from class: bfli
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m94.j(new dtsc() { // from class: bflj
        });
        m94.a();
        dtsb m95 = dtsd.m();
        m95.m(1);
        m95.b("messages.message_report_status");
        m95.i(13020);
        m95.c(new Supplier() { // from class: bflk
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m95.j(new dtsc() { // from class: bfll
        });
        m95.a();
        dtsb m96 = dtsd.m();
        m96.m(1);
        m96.d(true);
        m96.b("messages.seen");
        m96.f(true);
        m96.i(-1);
        m96.c(new Supplier() { // from class: bflm
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m96.j(new dtsc() { // from class: bfln
        });
        m96.a();
        dtsb m97 = dtsd.m();
        m97.m(4);
        m97.d(true);
        m97.b("messages.sms_message_uri");
        m97.i(-1);
        m97.c(new Supplier() { // from class: bflo
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m97.j(new dtsc() { // from class: bflp
        });
        m97.a();
        dtsb m98 = dtsd.m();
        m98.m(1);
        m98.b("messages.sms_message_size");
        m98.i(-1);
        m98.c(new Supplier() { // from class: bflt
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m98.j(new dtsc() { // from class: bflu
        });
        m98.a();
        dtsb m99 = dtsd.m();
        m99.m(4);
        m99.b("messages.mms_subject");
        m99.i(-1);
        m99.c(new Supplier() { // from class: bflv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m99.j(new dtsc() { // from class: bflw
        });
        m99.a();
        dtsb m100 = dtsd.m();
        m100.m(4);
        m100.b("messages.mms_transaction_id");
        m100.i(-1);
        m100.c(new Supplier() { // from class: bflx
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m100.j(new dtsc() { // from class: bfly
        });
        m100.a();
        dtsb m101 = dtsd.m();
        m101.m(4);
        m101.b("messages.mms_content_location");
        m101.i(-1);
        m101.c(new Supplier() { // from class: bflz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m101.j(new dtsc() { // from class: bfma
        });
        m101.a();
        dtsb m102 = dtsd.m();
        m102.m(1);
        m102.b("messages.mms_expiry");
        m102.i(-1);
        m102.c(new Supplier() { // from class: bfmc
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m102.j(new dtsc() { // from class: bfmd
        });
        m102.a();
        dtsb m103 = dtsd.m();
        m103.m(1);
        m103.d(true);
        m103.b("messages.rcs_expiry");
        m103.i(59890);
        m103.c(new Supplier() { // from class: bfmf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m103.j(new dtsc() { // from class: bfmg
        });
        m103.a();
        dtsb m104 = dtsd.m();
        m104.m(4);
        m104.b("messages.mms_retrieve_text");
        m104.i(9030);
        m104.c(new Supplier() { // from class: bfmh
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m104.j(new dtsc() { // from class: bfmi
        });
        m104.a();
        dtsb m105 = dtsd.m();
        m105.m(1);
        m105.d(true);
        m105.e(true);
        m105.h(new Supplier() { // from class: bfmj
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.c.a;
            }
        });
        m105.b("messages.self_id");
        m105.i(-1);
        m105.c(new Supplier() { // from class: bfmk
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m105.j(new dtsc() { // from class: bfml
        });
        m105.a();
        dtsb m106 = dtsd.m();
        m106.m(4);
        m106.d(true);
        m106.b("messages.my_identity");
        m106.i(59810);
        m106.c(new Supplier() { // from class: bfmn
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m106.j(new dtsc() { // from class: bfmo
        });
        m106.a();
        dtsb m107 = dtsd.m();
        m107.m(4);
        m107.d(true);
        m107.e(true);
        m107.h(new Supplier() { // from class: bfmp
            @Override // java.util.function.Supplier
            public final Object get() {
                return azoi.c.a;
            }
        });
        m107.b("messages.my_identity_foreign_key");
        m107.i(60160);
        m107.c(new Supplier() { // from class: bfmr
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m107.j(new dtsc() { // from class: bfms
        });
        m107.a();
        dtsb m108 = dtsd.m();
        m108.m(1);
        m108.b("messages.retry_start_timestamp");
        m108.i(-1);
        m108.c(new Supplier() { // from class: bfmt
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m108.j(new dtsc() { // from class: bfmu
        });
        m108.a();
        dtsb m109 = dtsd.m();
        m109.m(4);
        m109.d(true);
        m109.b("messages.cloud_sync_id");
        m109.i(8500);
        m109.c(new Supplier() { // from class: bfmv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m109.j(new dtsc() { // from class: bfmw
        });
        m109.a();
        dtsb m110 = dtsd.m();
        m110.m(7);
        m110.d(true);
        m110.b("messages.rcs_message_id");
        m110.f(true);
        m110.i(10000);
        m110.c(new Supplier() { // from class: bfmy
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m110.j(new dtsc() { // from class: bfmz
        });
        m110.a();
        dtsb m111 = dtsd.m();
        m111.m(4);
        m111.d(true);
        m111.b("messages.rcs_message_id_with_text_type");
        m111.f(true);
        m111.i(41040);
        m111.c(new Supplier() { // from class: bfna
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m111.j(new dtsc() { // from class: bfnb
        });
        m111.a();
        dtsb m112 = dtsd.m();
        m112.m(1);
        m112.b("messages.etouffee_status");
        m112.i(29060);
        m112.c(new Supplier() { // from class: bfnd
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m112.j(new dtsc() { // from class: bfne
        });
        m112.a();
        dtsb m113 = dtsd.m();
        m113.m(1);
        m113.b("messages.verification_status");
        m113.i(29090);
        m113.c(new Supplier() { // from class: bfnf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m113.j(new dtsc() { // from class: bfng
        });
        m113.a();
        dtsb m114 = dtsd.m();
        m114.m(1);
        m114.b("messages.rcs_ui_status");
        m114.i(39000);
        m114.c(new Supplier() { // from class: bfnh
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m114.j(new dtsc() { // from class: bfnj
        });
        m114.a();
        dtsb m115 = dtsd.m();
        m115.m(1);
        m115.d(true);
        m115.b("messages.is_hidden");
        m115.i(30010);
        m115.c(new Supplier() { // from class: bfnk
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m115.j(new dtsc() { // from class: bfnl
        });
        m115.a();
        dtsb m116 = dtsd.m();
        m116.m(7);
        m116.b("messages.rcs_remote_instance");
        m116.i(10002);
        m116.c(new Supplier() { // from class: bfnm
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m116.j(new dtsc() { // from class: bfnn
        });
        m116.a();
        dtsb m117 = dtsd.m();
        m117.m(1);
        m117.b("messages.rcs_file_transfer_session_id");
        m117.i(10004);
        m117.c(new Supplier() { // from class: bfnp
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m117.j(new dtsc() { // from class: bfnq
        });
        m117.a();
        dtsb m118 = dtsd.m();
        m118.m(4);
        m118.b("messages.correlation_id");
        m118.i(9010);
        m118.c(new Supplier() { // from class: bfnr
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m118.j(new dtsc() { // from class: bfns
        });
        m118.a();
        dtsb m119 = dtsd.m();
        m119.m(4);
        m119.l(true);
        m119.d(true);
        m119.b("messages.cms_id");
        m119.f(true);
        m119.i(31010);
        m119.c(new Supplier() { // from class: bfnu
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m119.j(new dtsc() { // from class: bfnv
        });
        m119.a();
        dtsb m120 = dtsd.m();
        m120.m(2);
        m120.b("messages.cms_last_mod_seq");
        m120.i(37040);
        m120.c(new Supplier() { // from class: bfnw
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m120.j(new dtsc() { // from class: bfnx
        });
        m120.a();
        dtsb m121 = dtsd.m();
        m121.m(4);
        m121.d(true);
        m121.b("messages.web_id");
        m121.i(19020);
        m121.c(new Supplier() { // from class: bfny
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m121.j(new dtsc() { // from class: bfnz
        });
        m121.a();
        dtsb m122 = dtsd.m();
        m122.m(1);
        m122.b("messages.usage_stats_logging_id");
        m122.i(29100);
        m122.c(new Supplier() { // from class: bfob
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m122.j(new dtsc() { // from class: bfoc
        });
        m122.a();
        dtsb m123 = dtsd.m();
        m123.m(1);
        m123.b("messages.send_counter");
        m123.i(35030);
        m123.c(new Supplier() { // from class: bfod
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m123.j(new dtsc() { // from class: bfof
        });
        m123.a();
        dtsb m124 = dtsd.m();
        m124.m(4);
        m124.d(true);
        m124.b("messages.original_rcs_message_id");
        m124.i(35030);
        m124.c(new Supplier() { // from class: bfog
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m124.j(new dtsc() { // from class: bfoh
        });
        m124.a();
        dtsb m125 = dtsd.m();
        m125.m(4);
        m125.b("messages.custom_delivery_receipt_mime_type");
        m125.i(37020);
        m125.c(new Supplier() { // from class: bfoi
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m125.j(new dtsc() { // from class: bfoj
        });
        m125.a();
        dtsb m126 = dtsd.m();
        m126.m(5);
        m126.b("messages.custom_delivery_receipt_content");
        m126.i(37020);
        m126.c(new Supplier() { // from class: bfok
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m126.j(new dtsc() { // from class: bfol
        });
        m126.a();
        dtsb m127 = dtsd.m();
        m127.m(1);
        m127.b("messages.report_attempt_acounter");
        m127.i(37030);
        m127.c(new Supplier() { // from class: bfon
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m127.j(new dtsc() { // from class: bfoo
        });
        m127.a();
        dtsb m128 = dtsd.m();
        m128.m(5);
        m128.b("messages.custom_headers");
        m128.i(45020);
        m128.c(new Supplier() { // from class: bfoq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m128.j(new dtsc() { // from class: bfor
        });
        m128.a();
        dtsb m129 = dtsd.m();
        m129.m(4);
        m129.l(true);
        m129.d(true);
        m129.b("messages.cms_correlation_id");
        m129.f(true);
        m129.i(46010);
        m129.c(new Supplier() { // from class: bfos
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m129.j(new dtsc() { // from class: bfot
        });
        m129.a();
        dtsb m130 = dtsd.m();
        m130.m(1);
        m130.d(true);
        m130.e(true);
        m130.h(new Supplier() { // from class: bfou
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.c.a;
            }
        });
        m130.b("messages.group_private_participant");
        m130.i(48030);
        m130.c(new Supplier() { // from class: bfov
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m130.j(new dtsc() { // from class: bfow
        });
        m130.a();
        dtsb m131 = dtsd.m();
        m131.m(1);
        m131.d(true);
        m131.e(true);
        m131.h(new Supplier() { // from class: bfox
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        });
        m131.b("messages.original_message_id");
        m131.i(48030);
        m131.c(new Supplier() { // from class: bfoz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m131.j(new dtsc() { // from class: bfpb
        });
        m131.a();
        dtsb m132 = dtsd.m();
        m132.m(1);
        m132.b("messages.awaiting_reverse_sync");
        m132.i(49060);
        m132.c(new Supplier() { // from class: bfpc
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m132.j(new dtsc() { // from class: bfpd
        });
        m132.a();
        dtsb m133 = dtsd.m();
        m133.m(4);
        m133.b("messages.old_sms_message_uri");
        m133.i(49060);
        m133.c(new Supplier() { // from class: bfpe
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m133.j(new dtsc() { // from class: bfpf
        });
        m133.a();
        dtsb m134 = dtsd.m();
        m134.m(4);
        m134.l(true);
        m134.d(true);
        m134.b("messages.draft_id");
        m134.f(true);
        m134.i(56000);
        m134.c(new Supplier() { // from class: bfpg
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m134.j(new dtsc() { // from class: bfph
        });
        m134.a();
        dtsb m135 = dtsd.m();
        m135.m(1);
        m135.b("messages.result_code");
        m135.i(58040);
        m135.c(new Supplier() { // from class: bfpi
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m135.j(new dtsc() { // from class: bfpj
        });
        m135.a();
        dtsb m136 = dtsd.m();
        m136.m(1);
        m136.b("messages.cms_life_cycle");
        m136.i(58210);
        m136.c(new Supplier() { // from class: bfpn
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m136.j(new dtsc() { // from class: bfpo
        });
        m136.a();
        dtsb m137 = dtsd.m();
        m137.m(1);
        m137.b("messages.mute_priority");
        m137.i(60750);
        m137.c(new Supplier() { // from class: bfpp
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m137.j(new dtsc() { // from class: bfpq
        });
        m137.a();
        dtsb m138 = dtsd.m();
        m138.m(1);
        m138.b("messages.fallback_reason");
        m138.i(58710);
        m138.c(new Supplier() { // from class: bfpr
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m138.j(new dtsc() { // from class: bfps
        });
        m138.a();
        dtsb m139 = dtsd.m();
        m139.m(1);
        m139.b("messages.auto_retry_counter");
        m139.i(58230);
        m139.c(new Supplier() { // from class: bfpt
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m139.j(new dtsc() { // from class: bfpu
        });
        m139.a();
        dtsb m140 = dtsd.m();
        m140.m(2);
        m140.b("messages.can_revoke_before_delivered_with_rcs");
        m140.i(58280);
        m140.c(new Supplier() { // from class: bfpv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m140.j(new dtsc() { // from class: bfpw
        });
        m140.a();
        dtsb m141 = dtsd.m();
        m141.m(5);
        m141.b("messages.trace_id");
        m141.i(58680);
        m141.c(new Supplier() { // from class: bfpz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m141.j(new dtsc() { // from class: bfqa
        });
        m141.a();
        dtsb m142 = dtsd.m();
        m142.m(1);
        m142.b("messages.outgoing_delivery_report_status");
        m142.i(58720);
        m142.c(new Supplier() { // from class: bfqb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m142.j(new dtsc() { // from class: bfqc
        });
        m142.a();
        dtsb m143 = dtsd.m();
        m143.m(1);
        m143.b("messages.outgoing_read_report_status");
        m143.i(58720);
        m143.c(new Supplier() { // from class: bfqd
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m143.j(new dtsc() { // from class: bfqe
        });
        m143.a();
        dtsb m144 = dtsd.m();
        m144.m(1);
        m144.b("messages.xms_transport");
        m144.i(59310);
        m144.c(new Supplier() { // from class: bfqf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m144.j(new dtsc() { // from class: bfqg
        });
        m144.a();
        dtsb m145 = dtsd.m();
        m145.m(1);
        m145.b("messages.message_original_protocol");
        m145.i(59430);
        m145.c(new Supplier() { // from class: bfqh
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m145.j(new dtsc() { // from class: bfqj
        });
        m145.a();
        dtsb m146 = dtsd.m();
        m146.m(4);
        m146.l(true);
        m146.d(true);
        m146.b("messages.satellite_datagram_id");
        m146.f(true);
        m146.i(59490);
        m146.c(new Supplier() { // from class: bfqm
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m146.j(new dtsc() { // from class: bfqn
        });
        m146.a();
        dtsb m147 = dtsd.m();
        m147.m(1);
        m147.b("messages.encryption_protocol");
        m147.i(60190);
        m147.c(new Supplier() { // from class: bfqo
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m147.j(new dtsc() { // from class: bfqp
        });
        m147.a();
        dtsb m148 = dtsd.m();
        m148.m(4);
        m148.l(true);
        m148.d(true);
        m148.b("messages.message_persistence_id");
        m148.f(true);
        m148.i(60370);
        m148.c(new Supplier() { // from class: bfqq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m148.j(new dtsc() { // from class: bfqr
        });
        m148.a();
        dtsb m149 = dtsd.m();
        m149.m(1);
        m149.d(true);
        m149.b("participants.sub_id");
        m149.f(true);
        m149.i(-1);
        m149.c(new Supplier() { // from class: bfqs
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m149.j(new dtsc() { // from class: bfqu
        });
        m149.a();
        dtsb m150 = dtsd.m();
        m150.m(4);
        m150.b("participants.display_destination");
        m150.i(-1);
        m150.c(new Supplier() { // from class: bfqv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m150.j(new dtsc() { // from class: bfqw
        });
        m150.a();
        dtsb m151 = dtsd.m();
        m151.m(4);
        m151.b("participants.full_name");
        m151.i(-1);
        m151.c(new Supplier() { // from class: bfqy
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m151.j(new dtsc() { // from class: bfqz
        });
        m151.a();
        dtsb m152 = dtsd.m();
        m152.m(4);
        m152.b("participants.first_name");
        m152.i(-1);
        m152.c(new Supplier() { // from class: bfra
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m152.j(new dtsc() { // from class: bfrb
        });
        m152.a();
        dtsb m153 = dtsd.m();
        m153.m(1);
        m153.b("participants.directory_id");
        m153.i(35010);
        m153.c(new Supplier() { // from class: bfrc
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m153.j(new dtsc() { // from class: bfrd
        });
        m153.a();
        dtsb m154 = dtsd.m();
        m154.m(2);
        m154.l(true);
        m154.g(true);
        m154.d(true);
        m154.b("participants._id");
        m154.i(-1);
        m154.c(new Supplier() { // from class: bfrf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m154.j(new dtsc() { // from class: bfrg
        });
        m154.a();
        dtsb m155 = dtsd.m();
        m155.m(4);
        m155.d(true);
        m155.b("participants.my_identity_token");
        m155.i(59930);
        m155.c(new Supplier() { // from class: bfrh
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m155.j(new dtsc() { // from class: bfri
        });
        m155.a();
        dtsb m156 = dtsd.m();
        m156.m(4);
        m156.d(true);
        m156.e(true);
        m156.h(new Supplier() { // from class: bfrk
            @Override // java.util.function.Supplier
            public final Object get() {
                return azoi.c.a;
            }
        });
        m156.b("participants.my_identity_token_foreign_key");
        m156.i(60160);
        m156.c(new Supplier() { // from class: bfrl
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m156.j(new dtsc() { // from class: bfrm
        });
        m156.a();
        dtsb m157 = dtsd.m();
        m157.m(1);
        m157.b("participants.sim_slot_id");
        m157.i(2000);
        m157.c(new Supplier() { // from class: bfrn
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m157.j(new dtsc() { // from class: bfro
        });
        m157.a();
        dtsb m158 = dtsd.m();
        m158.m(4);
        m158.d(true);
        m158.b("participants.normalized_destination");
        m158.f(true);
        m158.i(-1);
        m158.c(new Supplier() { // from class: bfrq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m158.j(new dtsc() { // from class: bfrr
        });
        m158.a();
        dtsb m159 = dtsd.m();
        m159.m(4);
        m159.b("participants.send_destination");
        m159.i(-1);
        m159.c(new Supplier() { // from class: bfrs
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m159.j(new dtsc() { // from class: bfrt
        });
        m159.a();
        dtsb m160 = dtsd.m();
        m160.m(4);
        m160.l(true);
        m160.d(true);
        m160.b("participants.comparable_destination");
        m160.f(true);
        m160.i(54040);
        m160.c(new Supplier() { // from class: bfru
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m160.j(new dtsc() { // from class: bfrw
        });
        m160.a();
        dtsb m161 = dtsd.m();
        m161.m(4);
        m161.b("participants.country_code");
        m161.i(54040);
        m161.c(new Supplier() { // from class: bfrx
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m161.j(new dtsc() { // from class: bfry
        });
        m161.a();
        dtsb m162 = dtsd.m();
        m162.m(2);
        m162.l(true);
        m162.d(true);
        m162.b("participants.recipient_id");
        m162.f(true);
        m162.i(58090);
        m162.c(new Supplier() { // from class: bfrz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m162.j(new dtsc() { // from class: bfsb
        });
        m162.a();
        dtsb m163 = dtsd.m();
        m163.m(4);
        m163.b("participants.recipient_canonical_address");
        m163.i(58090);
        m163.c(new Supplier() { // from class: bfsc
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m163.j(new dtsc() { // from class: bfsd
        });
        m163.a();
        dtsb m164 = dtsd.m();
        m164.m(4);
        m164.b("participants.profile_photo_uri");
        m164.i(-1);
        m164.c(new Supplier() { // from class: bfse
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m164.j(new dtsc() { // from class: bfsf
        });
        m164.a();
        dtsb m165 = dtsd.m();
        m165.m(4);
        m165.b("participants.contact_photo_uri");
        m165.i(59850);
        m165.c(new Supplier() { // from class: bfsg
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m165.j(new dtsc() { // from class: bfsi
        });
        m165.a();
        dtsb m166 = dtsd.m();
        m166.m(1);
        m166.b("participants.contact_id");
        m166.i(-1);
        m166.c(new Supplier() { // from class: bfsj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m166.j(new dtsc() { // from class: bfsk
        });
        m166.a();
        dtsb m167 = dtsd.m();
        m167.m(4);
        m167.b("participants.lookup_key");
        m167.i(-1);
        m167.c(new Supplier() { // from class: bfsm
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m167.j(new dtsc() { // from class: bfsn
        });
        m167.a();
        dtsb m168 = dtsd.m();
        m168.m(1);
        m168.b("participants.color_palette_index");
        m168.i(-1);
        m168.c(new Supplier() { // from class: bfso
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m168.j(new dtsc() { // from class: bfsp
        });
        m168.a();
        dtsb m169 = dtsd.m();
        m169.m(1);
        m169.b("participants.color_type");
        m169.i(1000);
        m169.c(new Supplier() { // from class: bfsq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m169.j(new dtsc() { // from class: bfsr
        });
        m169.a();
        dtsb m170 = dtsd.m();
        m170.m(1);
        m170.b("participants.extended_color");
        m170.i(10027);
        m170.c(new Supplier() { // from class: bfss
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m170.j(new dtsc() { // from class: bfsu
        });
        m170.a();
        dtsb m171 = dtsd.m();
        m171.m(1);
        m171.b("participants.blocked");
        m171.i(-1);
        m171.c(new Supplier() { // from class: bfsv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m171.j(new dtsc() { // from class: bfsx
        });
        m171.a();
        dtsb m172 = dtsd.m();
        m172.m(4);
        m172.b("participants.subscription_name");
        m172.i(2000);
        m172.c(new Supplier() { // from class: bfsy
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m172.j(new dtsc() { // from class: bfsz
        });
        m172.a();
        dtsb m173 = dtsd.m();
        m173.m(1);
        m173.b("participants.subscription_color");
        m173.i(2000);
        m173.c(new Supplier() { // from class: bfta
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m173.j(new dtsc() { // from class: bftb
        });
        m173.a();
        dtsb m174 = dtsd.m();
        m174.m(4);
        m174.b("participants.contact_destination");
        m174.i(4000);
        m174.c(new Supplier() { // from class: bftc
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m174.j(new dtsc() { // from class: bftd
        });
        m174.a();
        dtsb m175 = dtsd.m();
        m175.m(1);
        m175.b("participants.participant_type");
        m175.i(12001);
        m175.c(new Supplier() { // from class: bfte
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m175.j(new dtsc() { // from class: bftg
        });
        m175.a();
        dtsb m176 = dtsd.m();
        m176.m(1);
        m176.b("participants.video_reachability");
        m176.i(13050);
        m176.c(new Supplier() { // from class: bfti
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m176.j(new dtsc() { // from class: bftj
        });
        m176.a();
        dtsb m177 = dtsd.m();
        m177.m(4);
        m177.b("participants.alias");
        m177.i(20060);
        m177.c(new Supplier() { // from class: bftk
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m177.j(new dtsc() { // from class: bftl
        });
        m177.a();
        dtsb m178 = dtsd.m();
        m178.m(1);
        m178.b("participants.is_spam");
        m178.i(24060);
        m178.c(new Supplier() { // from class: bftm
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m178.j(new dtsc() { // from class: bftn
        });
        m178.a();
        dtsb m179 = dtsd.m();
        m179.m(1);
        m179.b("participants.is_rcs_available");
        m179.i(29030);
        m179.c(new Supplier() { // from class: bfto
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m179.j(new dtsc() { // from class: bftp
        });
        m179.a();
        dtsb m180 = dtsd.m();
        m180.m(1);
        m180.b("participants.is_spam_source");
        m180.i(30000);
        m180.c(new Supplier() { // from class: bftq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m180.j(new dtsc() { // from class: bftu
        });
        m180.a();
        dtsb m181 = dtsd.m();
        m181.m(4);
        m181.l(true);
        m181.d(true);
        m181.b("participants.cms_id");
        m181.f(true);
        m181.i(31020);
        m181.c(new Supplier() { // from class: bftv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m181.j(new dtsc() { // from class: bftw
        });
        m181.a();
        dtsb m182 = dtsd.m();
        m182.m(1);
        m182.b("participants.latest_verification_status");
        m182.i(31030);
        m182.c(new Supplier() { // from class: bftx
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m182.j(new dtsc() { // from class: bfty
        });
        m182.a();
        dtsb m183 = dtsd.m();
        m183.m(4);
        m183.b("participants.profile_photo_blob_id");
        m183.i(33000);
        m183.c(new Supplier() { // from class: bftz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m183.j(new dtsc() { // from class: bfua
        });
        m183.a();
        dtsb m184 = dtsd.m();
        m184.m(5);
        m184.b("participants.profile_photo_encryption_key");
        m184.i(33060);
        m184.c(new Supplier() { // from class: bfub
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m184.j(new dtsc() { // from class: bfuc
        });
        m184.a();
        dtsb m185 = dtsd.m();
        m185.m(1);
        m185.b("participants.is_check_constraint_enabled_via_phenotype");
        m185.i(55010);
        m185.c(new Supplier() { // from class: bfud
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m185.j(new dtsc() { // from class: bfug
        });
        m185.a();
        dtsb m186 = dtsd.m();
        m186.m(1);
        m186.b("participants.is_valid_phone_number_data");
        m186.i(55010);
        m186.c(new Supplier() { // from class: bfuh
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m186.j(new dtsc() { // from class: bfui
        });
        m186.a();
        dtsb m187 = dtsd.m();
        m187.m(2);
        m187.d(true);
        m187.e(true);
        m187.h(new Supplier() { // from class: bfuj
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.c.a;
            }
        });
        m187.b("participants.duplicate_of");
        m187.i(58090);
        m187.c(new Supplier() { // from class: bfuk
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m187.j(new dtsc() { // from class: bful
        });
        m187.a();
        dtsb m188 = dtsd.m();
        m188.m(1);
        m188.b("participants.cms_life_cycle");
        m188.i(58210);
        m188.c(new Supplier() { // from class: bfum
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m188.j(new dtsc() { // from class: bfun
        });
        m188.a();
        dtsb m189 = dtsd.m();
        m189.m(1);
        m189.b("participants.norm_ui_status");
        m189.i(58620);
        m189.c(new Supplier() { // from class: bfuo
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m189.j(new dtsc() { // from class: bfuq
        });
        m189.a();
        dtsb m190 = dtsd.m();
        m190.m(4);
        m190.b("participants.last_modified_by_key");
        m190.i(59440);
        m190.c(new Supplier() { // from class: bfus
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m190.j(new dtsc() { // from class: bfut
        });
        m190.a();
        dtsb m191 = dtsd.m();
        m191.m(1);
        m191.b("participants.name_source");
        m191.i(59550);
        m191.c(new Supplier() { // from class: bfuu
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m191.j(new dtsc() { // from class: bfuv
        });
        m191.a();
        dtsb m192 = dtsd.m();
        m192.m(1);
        m192.b("participants.photo_source");
        m192.i(59550);
        m192.c(new Supplier() { // from class: bfuw
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m192.j(new dtsc() { // from class: bfux
        });
        m192.a();
        dtsb m193 = dtsd.m();
        m193.m(1);
        m193.b("participants.profile_photo_user_preference");
        m193.i(60060);
        m193.c(new Supplier() { // from class: bfuy
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m193.j(new dtsc() { // from class: bfuz
        });
        m193.a();
        dtsb m194 = dtsd.m();
        m194.m(5);
        m194.b("participants.contact_metadata");
        m194.i(60070);
        m194.c(new Supplier() { // from class: bfvb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m194.j(new dtsc() { // from class: bfvc
        });
        m194.a();
        dtsb m195 = dtsd.m();
        m195.m(1);
        m195.d(true);
        m195.b("participants.is_enterprise_contact");
        m195.i(60640);
        m195.c(new Supplier() { // from class: bfvf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m195.j(new dtsc() { // from class: bfvg
        });
        m195.a();
        dtsb m196 = dtsd.m();
        m196.m(1);
        m196.d(true);
        m196.e(true);
        m196.h(new Supplier() { // from class: bfvh
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.c.a;
            }
        });
        m196.b("conversation_participants.participant_id");
        m196.f(true);
        m196.i(-1);
        m196.c(new Supplier() { // from class: bfvi
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m196.j(new dtsc() { // from class: bfvj
        });
        m196.a();
        dtsb m197 = dtsd.m();
        m197.m(2);
        m197.l(true);
        m197.g(true);
        m197.d(true);
        m197.b("conversation_participants._id");
        m197.i(-1);
        m197.c(new Supplier() { // from class: bfvk
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m197.j(new dtsc() { // from class: bfvm
        });
        m197.a();
        dtsb m198 = dtsd.m();
        m198.m(1);
        m198.d(true);
        m198.e(true);
        m198.h(new Supplier() { // from class: bfvn
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsom.c.a;
            }
        });
        m198.b("conversation_participants.conversation_id");
        m198.f(true);
        m198.i(-1);
        m198.c(new Supplier() { // from class: bfvo
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m198.j(new dtsc() { // from class: bfvp
        });
        m198.a();
        dtsb m199 = dtsd.m();
        m199.m(1);
        m199.d(true);
        m199.b("conversation_participants.is_normalized");
        m199.f(true);
        m199.i(58090);
        m199.c(new Supplier() { // from class: bfvr
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m199.j(new dtsc() { // from class: bfvs
        });
        m199.a();
        dtsb m200 = dtsd.m();
        m200.m(1);
        m200.b("conversation_participants.rcs_group_join_status");
        m200.i(58570);
        m200.c(new Supplier() { // from class: bfvt
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m200.j(new dtsc() { // from class: bfvu
        });
        m200.a();
        dtsb m201 = dtsd.m();
        m201.m(4);
        m201.b("conversation_participants.last_modified_by_key");
        m201.i(59440);
        m201.c(new Supplier() { // from class: bfvv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m201.j(new dtsc() { // from class: bfvx
        });
        m201.a();
        dtsb m202 = dtsd.m();
        m202.m(4);
        m202.b("one_on_one_participant.full_name");
        m202.i(-1);
        m202.c(new Supplier() { // from class: bfvy
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m202.j(new dtsc() { // from class: bfvz
        });
        m202.a();
        dtsb m203 = dtsd.m();
        m203.m(4);
        m203.b("one_on_one_participant.first_name");
        m203.i(-1);
        m203.c(new Supplier() { // from class: bfwa
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m203.j(new dtsc() { // from class: bfwb
        });
        m203.a();
        dtsb m204 = dtsd.m();
        m204.m(2);
        m204.l(true);
        m204.g(true);
        m204.d(true);
        m204.b("one_on_one_participant._id");
        m204.i(-1);
        m204.c(new Supplier() { // from class: bfwd
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m204.j(new dtsc() { // from class: bfwe
        });
        m204.a();
        dtsb m205 = dtsd.m();
        m205.m(4);
        m205.d(true);
        m205.b("one_on_one_participant.my_identity_token");
        m205.i(59930);
        m205.c(new Supplier() { // from class: bfwf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m205.j(new dtsc() { // from class: bfwg
        });
        m205.a();
        dtsb m206 = dtsd.m();
        m206.m(4);
        m206.d(true);
        m206.e(true);
        m206.h(new Supplier() { // from class: bfwi
            @Override // java.util.function.Supplier
            public final Object get() {
                return azoi.c.a;
            }
        });
        m206.b("one_on_one_participant.my_identity_token_foreign_key");
        m206.i(60160);
        m206.c(new Supplier() { // from class: bfwj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m206.j(new dtsc() { // from class: bfwk
        });
        m206.a();
        dtsb m207 = dtsd.m();
        m207.m(1);
        m207.d(true);
        m207.b("one_on_one_participant.sub_id");
        m207.f(true);
        m207.i(-1);
        m207.c(new Supplier() { // from class: bfwl
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m207.j(new dtsc() { // from class: bfwm
        });
        m207.a();
        dtsb m208 = dtsd.m();
        m208.m(1);
        m208.b("one_on_one_participant.sim_slot_id");
        m208.i(2000);
        m208.c(new Supplier() { // from class: bfwn
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m208.j(new dtsc() { // from class: bfwp
        });
        m208.a();
        dtsb m209 = dtsd.m();
        m209.m(4);
        m209.d(true);
        m209.b("one_on_one_participant.normalized_destination");
        m209.f(true);
        m209.i(-1);
        m209.c(new Supplier() { // from class: bfwq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m209.j(new dtsc() { // from class: bfwr
        });
        m209.a();
        dtsb m210 = dtsd.m();
        m210.m(4);
        m210.b("one_on_one_participant.send_destination");
        m210.i(-1);
        m210.c(new Supplier() { // from class: bfwt
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m210.j(new dtsc() { // from class: bfwu
        });
        m210.a();
        dtsb m211 = dtsd.m();
        m211.m(4);
        m211.b("one_on_one_participant.display_destination");
        m211.i(-1);
        m211.c(new Supplier() { // from class: bfwv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m211.j(new dtsc() { // from class: bfww
        });
        m211.a();
        dtsb m212 = dtsd.m();
        m212.m(4);
        m212.l(true);
        m212.d(true);
        m212.b("one_on_one_participant.comparable_destination");
        m212.f(true);
        m212.i(54040);
        m212.c(new Supplier() { // from class: bfwx
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m212.j(new dtsc() { // from class: bfwy
        });
        m212.a();
        dtsb m213 = dtsd.m();
        m213.m(4);
        m213.b("one_on_one_participant.country_code");
        m213.i(54040);
        m213.c(new Supplier() { // from class: bfwz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m213.j(new dtsc() { // from class: bfxb
        });
        m213.a();
        dtsb m214 = dtsd.m();
        m214.m(2);
        m214.l(true);
        m214.d(true);
        m214.b("one_on_one_participant.recipient_id");
        m214.f(true);
        m214.i(58090);
        m214.c(new Supplier() { // from class: bfxc
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m214.j(new dtsc() { // from class: bfxe
        });
        m214.a();
        dtsb m215 = dtsd.m();
        m215.m(4);
        m215.b("one_on_one_participant.recipient_canonical_address");
        m215.i(58090);
        m215.c(new Supplier() { // from class: bfxf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m215.j(new dtsc() { // from class: bfxg
        });
        m215.a();
        dtsb m216 = dtsd.m();
        m216.m(4);
        m216.b("one_on_one_participant.profile_photo_uri");
        m216.i(-1);
        m216.c(new Supplier() { // from class: bfxh
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m216.j(new dtsc() { // from class: bfxi
        });
        m216.a();
        dtsb m217 = dtsd.m();
        m217.m(4);
        m217.b("one_on_one_participant.contact_photo_uri");
        m217.i(59850);
        m217.c(new Supplier() { // from class: bfxj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m217.j(new dtsc() { // from class: bfxk
        });
        m217.a();
        dtsb m218 = dtsd.m();
        m218.m(1);
        m218.b("one_on_one_participant.contact_id");
        m218.i(-1);
        m218.c(new Supplier() { // from class: bfxl
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m218.j(new dtsc() { // from class: bfxn
        });
        m218.a();
        dtsb m219 = dtsd.m();
        m219.m(4);
        m219.b("one_on_one_participant.lookup_key");
        m219.i(-1);
        m219.c(new Supplier() { // from class: bfxp
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m219.j(new dtsc() { // from class: bfxq
        });
        m219.a();
        dtsb m220 = dtsd.m();
        m220.m(1);
        m220.b("one_on_one_participant.color_palette_index");
        m220.i(-1);
        m220.c(new Supplier() { // from class: bfxr
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m220.j(new dtsc() { // from class: bfxs
        });
        m220.a();
        dtsb m221 = dtsd.m();
        m221.m(1);
        m221.b("one_on_one_participant.color_type");
        m221.i(1000);
        m221.c(new Supplier() { // from class: bfxt
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m221.j(new dtsc() { // from class: bfxu
        });
        m221.a();
        dtsb m222 = dtsd.m();
        m222.m(1);
        m222.b("one_on_one_participant.extended_color");
        m222.i(10027);
        m222.c(new Supplier() { // from class: bfxv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m222.j(new dtsc() { // from class: bfxw
        });
        m222.a();
        dtsb m223 = dtsd.m();
        m223.m(1);
        m223.b("one_on_one_participant.blocked");
        m223.i(-1);
        m223.c(new Supplier() { // from class: bfxx
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m223.j(new dtsc() { // from class: bfyb
        });
        m223.a();
        dtsb m224 = dtsd.m();
        m224.m(4);
        m224.b("one_on_one_participant.subscription_name");
        m224.i(2000);
        m224.c(new Supplier() { // from class: bfyc
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m224.j(new dtsc() { // from class: bfyd
        });
        m224.a();
        dtsb m225 = dtsd.m();
        m225.m(1);
        m225.b("one_on_one_participant.subscription_color");
        m225.i(2000);
        m225.c(new Supplier() { // from class: bfye
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m225.j(new dtsc() { // from class: bfyf
        });
        m225.a();
        dtsb m226 = dtsd.m();
        m226.m(4);
        m226.b("one_on_one_participant.contact_destination");
        m226.i(4000);
        m226.c(new Supplier() { // from class: bfyg
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m226.j(new dtsc() { // from class: bfyh
        });
        m226.a();
        dtsb m227 = dtsd.m();
        m227.m(1);
        m227.b("one_on_one_participant.participant_type");
        m227.i(12001);
        m227.c(new Supplier() { // from class: bfyi
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m227.j(new dtsc() { // from class: bfyj
        });
        m227.a();
        dtsb m228 = dtsd.m();
        m228.m(1);
        m228.b("one_on_one_participant.video_reachability");
        m228.i(13050);
        m228.c(new Supplier() { // from class: bfyk
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m228.j(new dtsc() { // from class: bfyn
        });
        m228.a();
        dtsb m229 = dtsd.m();
        m229.m(4);
        m229.b("one_on_one_participant.alias");
        m229.i(20060);
        m229.c(new Supplier() { // from class: bfyo
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m229.j(new dtsc() { // from class: bfyp
        });
        m229.a();
        dtsb m230 = dtsd.m();
        m230.m(1);
        m230.b("one_on_one_participant.is_spam");
        m230.i(24060);
        m230.c(new Supplier() { // from class: bfyq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m230.j(new dtsc() { // from class: bfyr
        });
        m230.a();
        dtsb m231 = dtsd.m();
        m231.m(1);
        m231.b("one_on_one_participant.is_rcs_available");
        m231.i(29030);
        m231.c(new Supplier() { // from class: bfys
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m231.j(new dtsc() { // from class: bfyt
        });
        m231.a();
        dtsb m232 = dtsd.m();
        m232.m(1);
        m232.b("one_on_one_participant.is_spam_source");
        m232.i(30000);
        m232.c(new Supplier() { // from class: bfyu
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m232.j(new dtsc() { // from class: bfyv
        });
        m232.a();
        dtsb m233 = dtsd.m();
        m233.m(4);
        m233.l(true);
        m233.d(true);
        m233.b("one_on_one_participant.cms_id");
        m233.f(true);
        m233.i(31020);
        m233.c(new Supplier() { // from class: bfyx
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m233.j(new dtsc() { // from class: bfyz
        });
        m233.a();
        dtsb m234 = dtsd.m();
        m234.m(1);
        m234.b("one_on_one_participant.latest_verification_status");
        m234.i(31030);
        m234.c(new Supplier() { // from class: bfza
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m234.j(new dtsc() { // from class: bfzb
        });
        m234.a();
        dtsb m235 = dtsd.m();
        m235.m(4);
        m235.b("one_on_one_participant.profile_photo_blob_id");
        m235.i(33000);
        m235.c(new Supplier() { // from class: bfzc
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m235.j(new dtsc() { // from class: bfzd
        });
        m235.a();
        dtsb m236 = dtsd.m();
        m236.m(5);
        m236.b("one_on_one_participant.profile_photo_encryption_key");
        m236.i(33060);
        m236.c(new Supplier() { // from class: bfze
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m236.j(new dtsc() { // from class: bfzf
        });
        m236.a();
        dtsb m237 = dtsd.m();
        m237.m(1);
        m237.b("one_on_one_participant.directory_id");
        m237.i(35010);
        m237.c(new Supplier() { // from class: bfzg
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m237.j(new dtsc() { // from class: bfzi
        });
        m237.a();
        dtsb m238 = dtsd.m();
        m238.m(1);
        m238.b("one_on_one_participant.is_check_constraint_enabled_via_phenotype");
        m238.i(55010);
        m238.c(new Supplier() { // from class: bfzj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m238.j(new dtsc() { // from class: bfzl
        });
        m238.a();
        dtsb m239 = dtsd.m();
        m239.m(1);
        m239.b("one_on_one_participant.is_valid_phone_number_data");
        m239.i(55010);
        m239.c(new Supplier() { // from class: bfzm
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m239.j(new dtsc() { // from class: bfzn
        });
        m239.a();
        dtsb m240 = dtsd.m();
        m240.m(2);
        m240.d(true);
        m240.e(true);
        m240.h(new Supplier() { // from class: bfzo
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.c.a;
            }
        });
        m240.b("one_on_one_participant.duplicate_of");
        m240.i(58090);
        m240.c(new Supplier() { // from class: bfzp
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m240.j(new dtsc() { // from class: bfzq
        });
        m240.a();
        dtsb m241 = dtsd.m();
        m241.m(1);
        m241.b("one_on_one_participant.cms_life_cycle");
        m241.i(58210);
        m241.c(new Supplier() { // from class: bfzr
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m241.j(new dtsc() { // from class: bfzt
        });
        m241.a();
        dtsb m242 = dtsd.m();
        m242.m(1);
        m242.b("one_on_one_participant.norm_ui_status");
        m242.i(58620);
        m242.c(new Supplier() { // from class: bfzu
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m242.j(new dtsc() { // from class: bfzv
        });
        m242.a();
        dtsb m243 = dtsd.m();
        m243.m(4);
        m243.b("one_on_one_participant.last_modified_by_key");
        m243.i(59440);
        m243.c(new Supplier() { // from class: bfzy
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m243.j(new dtsc() { // from class: bfzz
        });
        m243.a();
        dtsb m244 = dtsd.m();
        m244.m(1);
        m244.b("one_on_one_participant.name_source");
        m244.i(59550);
        m244.c(new Supplier() { // from class: bgaa
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m244.j(new dtsc() { // from class: bgab
        });
        m244.a();
        dtsb m245 = dtsd.m();
        m245.m(1);
        m245.b("one_on_one_participant.photo_source");
        m245.i(59550);
        m245.c(new Supplier() { // from class: bgac
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m245.j(new dtsc() { // from class: bgae
        });
        m245.a();
        dtsb m246 = dtsd.m();
        m246.m(1);
        m246.b("one_on_one_participant.profile_photo_user_preference");
        m246.i(60060);
        m246.c(new Supplier() { // from class: bgaf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m246.j(new dtsc() { // from class: bgag
        });
        m246.a();
        dtsb m247 = dtsd.m();
        m247.m(5);
        m247.b("one_on_one_participant.contact_metadata");
        m247.i(60070);
        m247.c(new Supplier() { // from class: bgah
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m247.j(new dtsc() { // from class: bgai
        });
        m247.a();
        dtsb m248 = dtsd.m();
        m248.m(1);
        m248.d(true);
        m248.b("one_on_one_participant.is_enterprise_contact");
        m248.i(60640);
        m248.c(new Supplier() { // from class: bgak
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m248.j(new dtsc() { // from class: bgal
        });
        m248.a();
        dtsb m249 = dtsd.m();
        m249.m(4);
        m249.b("profiles_table.display_name");
        m249.i(-1);
        m249.c(new Supplier() { // from class: bgam
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m249.j(new dtsc() { // from class: bgan
        });
        m249.a();
        dtsb m250 = dtsd.m();
        m250.m(2);
        m250.l(true);
        m250.g(true);
        m250.d(true);
        m250.b("profiles_table._id");
        m250.i(-1);
        m250.c(new Supplier() { // from class: bgap
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m250.j(new dtsc() { // from class: bgaq
        });
        m250.a();
        dtsb m251 = dtsd.m();
        m251.m(2);
        m251.d(true);
        m251.e(true);
        m251.h(new Supplier() { // from class: bgar
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.c.a;
            }
        });
        m251.b("profiles_table.participant_id");
        m251.i(-1);
        m251.c(new Supplier() { // from class: bgas
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m251.j(new dtsc() { // from class: bgat
        });
        m251.a();
        dtsb m252 = dtsd.m();
        m252.m(4);
        m252.b("profiles_table.person_id");
        m252.i(60170);
        m252.c(new Supplier() { // from class: bgau
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m252.j(new dtsc() { // from class: bgaw
        });
        m252.a();
        dtsb m253 = dtsd.m();
        m253.m(4);
        m253.b("profiles_table.profile_access_token");
        m253.i(60170);
        m253.c(new Supplier() { // from class: bgax
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m253.j(new dtsc() { // from class: bgay
        });
        m253.a();
        dtsb m254 = dtsd.m();
        m254.m(2);
        m254.b("profiles_table.sending_self_profile_interaction_state");
        m254.i(60200);
        m254.c(new Supplier() { // from class: bgba
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m254.j(new dtsc() { // from class: bgbb
        });
        m254.a();
        dtsb m255 = dtsd.m();
        m255.m(5);
        m255.b("profiles_table.self_profile_sharing_metadata");
        m255.i(60340);
        m255.c(new Supplier() { // from class: bgbc
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m255.j(new dtsc() { // from class: bgbd
        });
        m255.a();
        dtsb m256 = dtsd.m();
        m256.m(4);
        m256.b("profiles_table.first_name");
        m256.i(-1);
        m256.c(new Supplier() { // from class: bgbe
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m256.j(new dtsc() { // from class: bgbf
        });
        m256.a();
        dtsb m257 = dtsd.m();
        m257.m(4);
        m257.b("profiles_table.last_name");
        m257.i(-1);
        m257.c(new Supplier() { // from class: bgbg
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m257.j(new dtsc() { // from class: bgbi
        });
        m257.a();
        dtsb m258 = dtsd.m();
        m258.m(4);
        m258.b("profiles_table.photo_uri");
        m258.i(-1);
        m258.c(new Supplier() { // from class: bgbj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m258.j(new dtsc() { // from class: bgbl
        });
        m258.a();
        dtsb m259 = dtsd.m();
        m259.m(4);
        m259.b("profiles_table.sender_last_updated_time");
        m259.i(60170);
        m259.c(new Supplier() { // from class: bgbm
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m259.j(new dtsc() { // from class: bgbn
        });
        m259.a();
        dtsb m260 = dtsd.m();
        m260.m(4);
        m260.b("profiles_table.sender_last_updated_time_from_rcs");
        m260.i(60200);
        m260.c(new Supplier() { // from class: bgbo
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m260.j(new dtsc() { // from class: bgbp
        });
        m260.a();
        dtsb m261 = dtsd.m();
        m261.m(4);
        m261.d(true);
        m261.b("profiles_table.contact_lookup_key");
        m261.i(-1);
        m261.c(new Supplier() { // from class: bgbq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m261.j(new dtsc() { // from class: bgbr
        });
        m261.a();
        dtsb m262 = dtsd.m();
        m262.m(4);
        m262.d(true);
        m262.b("profiles_table.phone_number");
        m262.i(-1);
        m262.c(new Supplier() { // from class: bgbs
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m262.j(new dtsc() { // from class: bgbu
        });
        m262.a();
        dtsb m263 = dtsd.m();
        m263.m(1);
        m263.b("profiles_table.is_self_profile_shareable");
        m263.i(60400);
        m263.c(new Supplier() { // from class: bgbw
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m263.j(new dtsc() { // from class: bgbx
        });
        m263.a();
        dtsb m264 = dtsd.m();
        m264.m(2);
        m264.b("profiles_table.has_shared_access_token_with_user");
        m264.i(60170);
        m264.c(new Supplier() { // from class: bgby
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m264.j(new dtsc() { // from class: bgbz
        });
        m264.a();
        dtsb m265 = dtsd.m();
        m265.m(1);
        m265.b("profiles_table.name_timestamp");
        m265.i(-1);
        m265.c(new Supplier() { // from class: bgca
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m265.j(new dtsc() { // from class: bgcb
        });
        m265.a();
        dtsb m266 = dtsd.m();
        m266.m(1);
        m266.b("profiles_table.photo_timestamp");
        m266.i(-1);
        m266.c(new Supplier() { // from class: bgcc
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m266.j(new dtsc() { // from class: bgcd
        });
        m266.a();
        dtsb m267 = dtsd.m();
        m267.m(1);
        m267.b("profiles_table.belongs_to_self_gaia");
        m267.i(59940);
        m267.c(new Supplier() { // from class: bgce
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m267.j(new dtsc() { // from class: bgci
        });
        m267.a();
        dtsb m268 = dtsd.m();
        m268.m(1);
        m268.b("profiles_table.gaia_update_timestamp");
        m268.i(59940);
        m268.c(new Supplier() { // from class: bgcj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m268.j(new dtsc() { // from class: bgck
        });
        m268.a();
        dtsb m269 = dtsd.m();
        m269.m(4);
        m269.b("parts.text");
        m269.i(-1);
        m269.c(new Supplier() { // from class: bgcl
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m269.j(new dtsc() { // from class: bgcm
        });
        m269.a();
        dtsb m270 = dtsd.m();
        m270.m(4);
        m270.b("parts.uri");
        m270.i(-1);
        m270.c(new Supplier() { // from class: bgcn
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m270.j(new dtsc() { // from class: bgco
        });
        m270.a();
        dtsb m271 = dtsd.m();
        m271.m(4);
        m271.d(true);
        m271.b("parts.content_type");
        m271.i(-1);
        m271.c(new Supplier() { // from class: bgcp
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m271.j(new dtsc() { // from class: bgcq
        });
        m271.a();
        dtsb m272 = dtsd.m();
        m272.m(2);
        m272.l(true);
        m272.g(true);
        m272.d(true);
        m272.b("parts._id");
        m272.i(-1);
        m272.c(new Supplier() { // from class: bgcr
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m272.j(new dtsc() { // from class: bgcu
        });
        m272.a();
        dtsb m273 = dtsd.m();
        m273.m(1);
        m273.d(true);
        m273.e(true);
        m273.h(new Supplier() { // from class: bgcv
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        });
        m273.b("parts.message_id");
        m273.i(-1);
        m273.c(new Supplier() { // from class: bgcw
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m273.j(new dtsc() { // from class: bgcx
        });
        m273.a();
        dtsb m274 = dtsd.m();
        m274.m(4);
        m274.b("parts.original_uri");
        m274.i(10021);
        m274.c(new Supplier() { // from class: bgcy
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m274.j(new dtsc() { // from class: bgcz
        });
        m274.a();
        dtsb m275 = dtsd.m();
        m275.m(4);
        m275.b("parts.storage_uri");
        m275.i(29060);
        m275.c(new Supplier() { // from class: bgda
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m275.j(new dtsc() { // from class: bgdb
        });
        m275.a();
        dtsb m276 = dtsd.m();
        m276.m(1);
        m276.b("parts.width");
        m276.i(-1);
        m276.c(new Supplier() { // from class: bgdc
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m276.j(new dtsc() { // from class: bgde
        });
        m276.a();
        dtsb m277 = dtsd.m();
        m277.m(1);
        m277.b("parts.height");
        m277.i(-1);
        m277.c(new Supplier() { // from class: bgdg
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m277.j(new dtsc() { // from class: bgdh
        });
        m277.a();
        dtsb m278 = dtsd.m();
        m278.m(1);
        m278.b("parts.timestamp");
        m278.i(3010);
        m278.c(new Supplier() { // from class: bgdi
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m278.j(new dtsc() { // from class: bgdj
        });
        m278.a();
        dtsb m279 = dtsd.m();
        m279.m(4);
        m279.d(true);
        m279.b("parts.output_uri");
        m279.i(4020);
        m279.c(new Supplier() { // from class: bgdk
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m279.j(new dtsc() { // from class: bgdl
        });
        m279.a();
        dtsb m280 = dtsd.m();
        m280.m(1);
        m280.b("parts.target_size");
        m280.i(4020);
        m280.c(new Supplier() { // from class: bgdm
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m280.j(new dtsc() { // from class: bgdn
        });
        m280.a();
        dtsb m281 = dtsd.m();
        m281.m(1);
        m281.b("parts.processing_status");
        m281.i(4020);
        m281.c(new Supplier() { // from class: bgdp
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m281.j(new dtsc() { // from class: bgdq
        });
        m281.a();
        dtsb m282 = dtsd.m();
        m282.m(1);
        m282.b("parts.cms_attachment_processing_status");
        m282.i(44010);
        m282.c(new Supplier() { // from class: bgds
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m282.j(new dtsc() { // from class: bgdt
        });
        m282.a();
        dtsb m283 = dtsd.m();
        m283.m(1);
        m283.d(true);
        m283.e(true);
        m283.h(new Supplier() { // from class: bgdu
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsom.c.a;
            }
        });
        m283.b("parts.conversation_id");
        m283.i(-1);
        m283.c(new Supplier() { // from class: bgdv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m283.j(new dtsc() { // from class: bgdw
        });
        m283.a();
        dtsb m284 = dtsd.m();
        m284.m(1);
        m284.b("parts.sticker_set_id");
        m284.i(5020);
        m284.c(new Supplier() { // from class: bgdx
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m284.j(new dtsc() { // from class: bgdy
        });
        m284.a();
        dtsb m285 = dtsd.m();
        m285.m(1);
        m285.b("parts.sticker_id");
        m285.i(5020);
        m285.c(new Supplier() { // from class: bgea
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m285.j(new dtsc() { // from class: bgeb
        });
        m285.a();
        dtsb m286 = dtsd.m();
        m286.m(1);
        m286.b("parts.media_modified_timestamp");
        m286.i(7000);
        m286.c(new Supplier() { // from class: bgec
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m286.j(new dtsc() { // from class: bgee
        });
        m286.a();
        dtsb m287 = dtsd.m();
        m287.m(3);
        m287.b("parts.longitude");
        m287.i(10005);
        m287.c(new Supplier() { // from class: bgef
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m287.j(new dtsc() { // from class: bgeg
        });
        m287.a();
        dtsb m288 = dtsd.m();
        m288.m(3);
        m288.b("parts.latitude");
        m288.i(10005);
        m288.c(new Supplier() { // from class: bgeh
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m288.j(new dtsc() { // from class: bgei
        });
        m288.a();
        dtsb m289 = dtsd.m();
        m289.m(4);
        m289.b("parts.preview_content_uri");
        m289.i(10017);
        m289.c(new Supplier() { // from class: bgej
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m289.j(new dtsc() { // from class: bgel
        });
        m289.a();
        dtsb m290 = dtsd.m();
        m290.m(4);
        m290.d(true);
        m290.b("parts.preview_content_type");
        m290.i(10017);
        m290.c(new Supplier() { // from class: bgem
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m290.j(new dtsc() { // from class: bgen
        });
        m290.a();
        dtsb m291 = dtsd.m();
        m291.m(4);
        m291.b("parts.fallback_uri");
        m291.i(13000);
        m291.c(new Supplier() { // from class: bgeo
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m291.j(new dtsc() { // from class: bger
        });
        m291.a();
        dtsb m292 = dtsd.m();
        m292.m(1);
        m292.b("parts.source");
        m292.i(14010);
        m292.c(new Supplier() { // from class: bges
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m292.j(new dtsc() { // from class: bget
        });
        m292.a();
        dtsb m293 = dtsd.m();
        m293.m(1);
        m293.b("parts.bundle_index");
        m293.i(17010);
        m293.c(new Supplier() { // from class: bgeu
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m293.j(new dtsc() { // from class: bgew
        });
        m293.a();
        dtsb m294 = dtsd.m();
        m294.m(4);
        m294.b("parts.blob_id");
        m294.i(17020);
        m294.c(new Supplier() { // from class: bgex
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m294.j(new dtsc() { // from class: bgey
        });
        m294.a();
        dtsb m295 = dtsd.m();
        m295.m(4);
        m295.b("parts.blob_gaia_email");
        m295.i(59570);
        m295.c(new Supplier() { // from class: bgez
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m295.j(new dtsc() { // from class: bgfa
        });
        m295.a();
        dtsb m296 = dtsd.m();
        m296.m(4);
        m296.b("parts.cms_full_size_blob_id");
        m296.i(40040);
        m296.c(new Supplier() { // from class: bgfb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m296.j(new dtsc() { // from class: bgfd
        });
        m296.a();
        dtsb m297 = dtsd.m();
        m297.m(5);
        m297.b("parts.cms_media_encryption_key");
        m297.i(42010);
        m297.c(new Supplier() { // from class: bgfe
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m297.j(new dtsc() { // from class: bgff
        });
        m297.a();
        dtsb m298 = dtsd.m();
        m298.m(5);
        m298.b("parts.cms_compressed_media_encryption_key");
        m298.i(42070);
        m298.c(new Supplier() { // from class: bgfh
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m298.j(new dtsc() { // from class: bgfi
        });
        m298.a();
        dtsb m299 = dtsd.m();
        m299.m(1);
        m299.b("parts.blob_upload_permanent_failure");
        m299.i(18000);
        m299.c(new Supplier() { // from class: bgfj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m299.j(new dtsc() { // from class: bgfk
        });
        m299.a();
        dtsb m300 = dtsd.m();
        m300.m(1);
        m300.b("parts.blob_upload_timestamp");
        m300.i(19030);
        m300.c(new Supplier() { // from class: bgfl
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m300.j(new dtsc() { // from class: bgfm
        });
        m300.a();
        dtsb m301 = dtsd.m();
        m301.m(4);
        m301.b("parts.expressive_sticker_name");
        m301.i(22060);
        m301.c(new Supplier() { // from class: bgfn
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m301.j(new dtsc() { // from class: bgfp
        });
        m301.a();
        dtsb m302 = dtsd.m();
        m302.m(4);
        m302.b("parts.file_name");
        m302.i(26000);
        m302.c(new Supplier() { // from class: bgfq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m302.j(new dtsc() { // from class: bgfs
        });
        m302.a();
        dtsb m303 = dtsd.m();
        m303.m(1);
        m303.b("parts.duration");
        m303.i(26040);
        m303.c(new Supplier() { // from class: bgft
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m303.j(new dtsc() { // from class: bgfu
        });
        m303.a();
        dtsb m304 = dtsd.m();
        m304.m(4);
        m304.b("parts.compressed_blob_id");
        m304.i(27000);
        m304.c(new Supplier() { // from class: bgfv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m304.j(new dtsc() { // from class: bgfw
        });
        m304.a();
        dtsb m305 = dtsd.m();
        m305.m(4);
        m305.b("parts.cms_compressed_blob_id");
        m305.i(40040);
        m305.c(new Supplier() { // from class: bgfx
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m305.j(new dtsc() { // from class: bgfy
        });
        m305.a();
        dtsb m306 = dtsd.m();
        m306.m(1);
        m306.b("parts.compressed_blob_upload_permanent_failure");
        m306.i(27000);
        m306.c(new Supplier() { // from class: bgfz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m306.j(new dtsc() { // from class: bggb
        });
        m306.a();
        dtsb m307 = dtsd.m();
        m307.m(1);
        m307.b("parts.compressed_blob_upload_timestamp");
        m307.i(27000);
        m307.c(new Supplier() { // from class: bggd
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m307.j(new dtsc() { // from class: bgge
        });
        m307.a();
        dtsb m308 = dtsd.m();
        m308.m(5);
        m308.b("parts.media_encryption_key");
        m308.i(30040);
        m308.c(new Supplier() { // from class: bggf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m308.j(new dtsc() { // from class: bggg
        });
        m308.a();
        dtsb m309 = dtsd.m();
        m309.m(5);
        m309.b("parts.compressed_media_encryption_key");
        m309.i(30040);
        m309.c(new Supplier() { // from class: bggh
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m309.j(new dtsc() { // from class: bggi
        });
        m309.a();
        dtsb m310 = dtsd.m();
        m310.m(5);
        m310.b("parts.attachment_upload_response");
        m310.i(49010);
        m310.c(new Supplier() { // from class: bggj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m310.j(new dtsc() { // from class: bggk
        });
        m310.a();
        dtsb m311 = dtsd.m();
        m311.m(1);
        m311.b("parts.missing_entry_in_telephony");
        m311.i(52030);
        m311.c(new Supplier() { // from class: bggl
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m311.j(new dtsc() { // from class: bggp
        });
        m311.a();
        dtsb m312 = dtsd.m();
        m312.m(1);
        m312.b("parts.awaiting_reverse_sync");
        m312.i(53040);
        m312.c(new Supplier() { // from class: bggq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m312.j(new dtsc() { // from class: bggr
        });
        m312.a();
        dtsb m313 = dtsd.m();
        m313.m(1);
        m313.b("parts.file_size_bytes");
        m313.i(52050);
        m313.c(new Supplier() { // from class: bggs
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m313.j(new dtsc() { // from class: bggt
        });
        m313.a();
        dtsb m314 = dtsd.m();
        m314.m(4);
        m314.d(true);
        m314.b("parts.local_cache_path");
        m314.i(52050);
        m314.c(new Supplier() { // from class: bggu
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m314.j(new dtsc() { // from class: bggv
        });
        m314.a();
        dtsb m315 = dtsd.m();
        m315.m(1);
        m315.b("parts.media_send_type");
        m315.i(58150);
        m315.c(new Supplier() { // from class: bggw
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m315.j(new dtsc() { // from class: bggx
        });
        m315.a();
        dtsb m316 = dtsd.m();
        m316.m(5);
        m316.b("parts.voice_metadata");
        m316.i(59470);
        m316.c(new Supplier() { // from class: bggy
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m316.j(new dtsc() { // from class: bghb
        });
        m316.a();
        dtsb m317 = dtsd.m();
        m317.m(1);
        m317.b("parts.validation_status");
        m317.i(58770);
        m317.c(new Supplier() { // from class: bghc
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m317.j(new dtsc() { // from class: bghd
        });
        m317.a();
        dtsb m318 = dtsd.m();
        m318.m(4);
        m318.b("parts.processing_id");
        m318.i(60080);
        m318.c(new Supplier() { // from class: bghe
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m318.j(new dtsc() { // from class: bghf
        });
        m318.a();
        dtsb m319 = dtsd.m();
        m319.m(1);
        m319.b("parts.rich_card_media_download_failure_reason");
        m319.i(60230);
        m319.c(new Supplier() { // from class: bghg
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m319.j(new dtsc() { // from class: bghh
        });
        m319.a();
        dtsb m320 = dtsd.m();
        m320.m(1);
        m320.b("parts.image_display_state");
        m320.i(60240);
        m320.c(new Supplier() { // from class: bghi
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m320.j(new dtsc() { // from class: bghj
        });
        m320.a();
        dtsb m321 = dtsd.m();
        m321.m(1);
        m321.b("parts.preserve_size");
        m321.i(60680);
        m321.c(new Supplier() { // from class: bghl
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m321.j(new dtsc() { // from class: bghn
        });
        m321.a();
        dtsb m322 = dtsd.m();
        m322.m(2);
        m322.b("vmt.vmt_status");
        m322.i(-1);
        m322.c(new Supplier() { // from class: bgho
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m322.j(new dtsc() { // from class: bghp
        });
        m322.a();
        dtsb m323 = dtsd.m();
        m323.m(4);
        m323.b("vmt.text");
        m323.i(-1);
        m323.c(new Supplier() { // from class: bghq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m323.j(new dtsc() { // from class: bghr
        });
        m323.a();
        dtsb m324 = dtsd.m();
        m324.m(2);
        m324.l(true);
        m324.d(true);
        m324.e(true);
        m324.h(new Supplier() { // from class: bghs
            @Override // java.util.function.Supplier
            public final Object get() {
                return PartsTable.d.a;
            }
        });
        m324.b("vmt.part_id");
        m324.f(true);
        m324.i(-1);
        m324.c(new Supplier() { // from class: bght
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m324.j(new dtsc() { // from class: bghu
        });
        m324.a();
        dtsb m325 = dtsd.m();
        m325.m(4);
        m325.b("vmt.locale");
        m325.i(-1);
        m325.c(new Supplier() { // from class: bghw
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m325.j(new dtsc() { // from class: bghx
        });
        m325.a();
        dtsb m326 = dtsd.m();
        m326.m(2);
        m326.d(true);
        m326.b("reminders.trigger_time");
        m326.i(-1);
        m326.c(new Supplier() { // from class: bghz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m326.j(new dtsc() { // from class: bgia
        });
        m326.a();
        dtsb m327 = dtsd.m();
        m327.m(2);
        m327.l(true);
        m327.g(true);
        m327.d(true);
        m327.b("reminders._id");
        m327.i(-1);
        m327.c(new Supplier() { // from class: bgib
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m327.j(new dtsc() { // from class: bgic
        });
        m327.a();
        dtsb m328 = dtsd.m();
        m328.m(2);
        m328.l(true);
        m328.d(true);
        m328.e(true);
        m328.h(new Supplier() { // from class: bgid
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        });
        m328.b("reminders.message_id");
        m328.i(-1);
        m328.c(new Supplier() { // from class: bgie
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m328.j(new dtsc() { // from class: bgif
        });
        m328.a();
        dtsb m329 = dtsd.m();
        m329.m(2);
        m329.d(true);
        m329.e(true);
        m329.h(new Supplier() { // from class: bgih
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsom.c.a;
            }
        });
        m329.b("reminders.conversation_id");
        m329.i(35070);
        m329.c(new Supplier() { // from class: bgii
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m329.j(new dtsc() { // from class: bgij
        });
        m329.a();
        dtsb m330 = dtsd.m();
        m330.m(2);
        m330.b("reminders.status");
        m330.i(-1);
        m330.c(new Supplier() { // from class: bgil
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m330.j(new dtsc() { // from class: bgim
        });
        m330.a();
        dtsb m331 = dtsd.m();
        m331.m(1);
        m331.d(true);
        m331.b("messages_annotations.annotation_type");
        m331.i(-1);
        m331.c(new Supplier() { // from class: bgin
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m331.j(new dtsc() { // from class: bgio
        });
        m331.a();
        dtsb m332 = dtsd.m();
        m332.m(5);
        m332.b("messages_annotations.annotation_details");
        m332.i(-1);
        m332.c(new Supplier() { // from class: bgip
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m332.j(new dtsc() { // from class: bgiq
        });
        m332.a();
        dtsb m333 = dtsd.m();
        m333.m(2);
        m333.l(true);
        m333.g(true);
        m333.d(true);
        m333.b("messages_annotations._id");
        m333.i(-1);
        m333.c(new Supplier() { // from class: bgis
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m333.j(new dtsc() { // from class: bgit
        });
        m333.a();
        dtsb m334 = dtsd.m();
        m334.m(4);
        m334.d(true);
        m334.b("messages_annotations.conversation_id");
        m334.i(-1);
        m334.c(new Supplier() { // from class: bgiu
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m334.j(new dtsc() { // from class: bgiv
        });
        m334.a();
        dtsb m335 = dtsd.m();
        m335.m(2);
        m335.d(true);
        m335.e(true);
        m335.h(new Supplier() { // from class: bgix
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        });
        m335.b("messages_annotations.message_id");
        m335.i(20040);
        m335.c(new Supplier() { // from class: bgiy
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m335.j(new dtsc() { // from class: bgiz
        });
        m335.a();
        dtsb m336 = dtsd.m();
        m336.m(2);
        m336.l(true);
        m336.g(true);
        m336.d(true);
        m336.b("message_star._id");
        m336.i(-1);
        m336.c(new Supplier() { // from class: bgja
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m336.j(new dtsc() { // from class: bgjb
        });
        m336.a();
        dtsb m337 = dtsd.m();
        m337.m(2);
        m337.l(true);
        m337.d(true);
        m337.e(true);
        m337.h(new Supplier() { // from class: bgjd
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        });
        m337.b("message_star.message_id");
        m337.f(true);
        m337.i(-1);
        m337.c(new Supplier() { // from class: bgje
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m337.j(new dtsc() { // from class: bgjf
        });
        m337.a();
        dtsb m338 = dtsd.m();
        m338.m(2);
        m338.l(true);
        m338.g(true);
        m338.d(true);
        m338.e(true);
        m338.h(new Supplier() { // from class: bgjg
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsom.c.a;
            }
        });
        m338.b("parent_disallowed_conversations.conversation_id");
        m338.i(-1);
        m338.c(new Supplier() { // from class: bgjh
            @Override // java.util.function.Supplier
            public final Object get() {
                return bgmn.b();
            }
        });
        m338.j(new dtsc() { // from class: bgjk
        });
        m338.a();
    }
}
