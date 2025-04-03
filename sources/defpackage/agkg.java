package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agkg {
    public final agkh a;
    public final agkh b;
    public final agkh c;
    public final agkh d;
    public final agkh e;
    public final agkh f;

    public agkg() {
        dtsb m = dtsd.m();
        m.m(2);
        m.l(true);
        m.g(true);
        m.d(true);
        m.b("conversations._id");
        m.i(-1);
        m.c(new Supplier() { // from class: afkg
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m.j(new dtsc() { // from class: afkt
        });
        this.a = new agkh(m.a());
        dtsb m2 = dtsd.m();
        m2.m(4);
        m2.b("conversations.name");
        m2.i(-1);
        m2.c(new Supplier() { // from class: afpm
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m2.j(new dtsc() { // from class: afuf
        });
        m2.a();
        dtsb m3 = dtsd.m();
        m3.m(4);
        m3.b("conversations.snippet_text");
        m3.i(-1);
        m3.c(new Supplier() { // from class: afyy
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m3.j(new dtsc() { // from class: agdr
        });
        m3.a();
        dtsb m4 = dtsd.m();
        m4.m(4);
        m4.b("conversations.subject_text");
        m4.i(-1);
        m4.c(new Supplier() { // from class: aghk
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m4.j(new dtsc() { // from class: aghw
        });
        m4.a();
        dtsb m5 = dtsd.m();
        m5.m(4);
        m5.b("conversations.preview_uri");
        m5.i(-1);
        m5.c(new Supplier() { // from class: agii
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m5.j(new dtsc() { // from class: agiu
        });
        m5.a();
        dtsb m6 = dtsd.m();
        m6.m(4);
        m6.b("conversations.preview_content_type");
        m6.i(-1);
        m6.c(new Supplier() { // from class: aflc
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m6.j(new dtsc() { // from class: afpu
        });
        m6.a();
        dtsb m7 = dtsd.m();
        m7.m(1);
        m7.b("conversations.show_draft");
        m7.i(-1);
        m7.c(new Supplier() { // from class: afum
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m7.j(new dtsc() { // from class: afze
        });
        m7.a();
        dtsb m8 = dtsd.m();
        m8.m(4);
        m8.b("conversations.draft_snippet_text");
        m8.i(-1);
        m8.c(new Supplier() { // from class: agdw
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m8.j(new dtsc() { // from class: agio
        });
        m8.a();
        dtsb m9 = dtsd.m();
        m9.m(4);
        m9.b("conversations.draft_subject_text");
        m9.i(-1);
        m9.c(new Supplier() { // from class: agjg
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m9.j(new dtsc() { // from class: agjs
        });
        m9.a();
        dtsb m10 = dtsd.m();
        m10.m(4);
        m10.b("conversations.draft_preview_uri");
        m10.i(-1);
        m10.c(new Supplier() { // from class: agke
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m10.j(new dtsc() { // from class: afks
        });
        m10.a();
        dtsb m11 = dtsd.m();
        m11.m(4);
        m11.b("conversations.draft_preview_content_type");
        m11.i(-1);
        m11.c(new Supplier() { // from class: aflf
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m11.j(new dtsc() { // from class: aflr
        });
        m11.a();
        dtsb m12 = dtsd.m();
        m12.m(1);
        m12.d(true);
        m12.b("conversations.archive_status");
        m12.i(-1);
        m12.c(new Supplier() { // from class: afmd
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m12.j(new dtsc() { // from class: afmp
        });
        m12.a();
        dtsb m13 = dtsd.m();
        m13.m(1);
        m13.d(true);
        m13.b("conversations.sort_timestamp");
        m13.i(-1);
        m13.c(new Supplier() { // from class: afnb
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m13.j(new dtsc() { // from class: afnn
        });
        this.b = new agkh(m13.a());
        dtsb m14 = dtsd.m();
        m14.m(4);
        m14.b("conversations.icon");
        m14.i(-1);
        m14.c(new Supplier() { // from class: afnz
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m14.j(new dtsc() { // from class: afol
        });
        m14.a();
        dtsb m15 = dtsd.m();
        m15.m(4);
        m15.b("conversations.participant_lookup_key");
        m15.i(-1);
        m15.c(new Supplier() { // from class: afoz
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m15.j(new dtsc() { // from class: afpl
        });
        m15.a();
        dtsb m16 = dtsd.m();
        m16.m(4);
        m16.d(true);
        m16.b("conversations.participant_normalized_destination");
        m16.i(-1);
        m16.c(new Supplier() { // from class: afpy
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m16.j(new dtsc() { // from class: afqk
        });
        m16.a();
        dtsb m17 = dtsd.m();
        m17.m(1);
        m17.b("conversations.participant_count");
        m17.i(-1);
        m17.c(new Supplier() { // from class: afqw
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m17.j(new dtsc() { // from class: afri
        });
        m17.a();
        dtsb m18 = dtsd.m();
        m18.m(1);
        m18.b("conversations.notification_enabled");
        m18.i(-1);
        m18.c(new Supplier() { // from class: afru
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m18.j(new dtsc() { // from class: afsg
        });
        m18.a();
        dtsb m19 = dtsd.m();
        m19.m(1);
        m19.b("conversations.include_email_addr");
        m19.i(-1);
        m19.c(new Supplier() { // from class: afss
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m19.j(new dtsc() { // from class: aftg
        });
        m19.a();
        dtsb m20 = dtsd.m();
        m20.m(1);
        m20.b("conversations.source_type");
        m20.i(8500);
        m20.c(new Supplier() { // from class: afts
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m20.j(new dtsc() { // from class: afue
        });
        m20.a();
        dtsb m21 = dtsd.m();
        m21.m(1);
        m21.d(true);
        m21.b("conversations.rcs_session_id");
        m21.i(10000);
        m21.c(new Supplier() { // from class: afur
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m21.j(new dtsc() { // from class: afvd
        });
        m21.a();
        dtsb m22 = dtsd.m();
        m22.m(1);
        m22.b("conversations.join_state");
        m22.i(10006);
        m22.c(new Supplier() { // from class: afvp
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m22.j(new dtsc() { // from class: afwb
        });
        m22.a();
        dtsb m23 = dtsd.m();
        m23.m(1);
        m23.b("conversations.conv_type");
        m23.i(10007);
        m23.c(new Supplier() { // from class: afwn
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m23.j(new dtsc() { // from class: afwz
        });
        m23.a();
        dtsb m24 = dtsd.m();
        m24.m(1);
        m24.b("conversations.IS_ENTERPRISE");
        m24.i(10018);
        m24.c(new Supplier() { // from class: afxn
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m24.j(new dtsc() { // from class: afxz
        });
        m24.a();
        dtsb m25 = dtsd.m();
        m25.m(1);
        m25.b("conversations.has_ea2p_bot_recipient");
        m25.i(12001);
        m25.c(new Supplier() { // from class: afyl
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m25.j(new dtsc() { // from class: afyx
        });
        m25.a();
        dtsb m26 = dtsd.m();
        m26.m(4);
        m26.b("conversations.participant_display_destination");
        m26.i(15010);
        m26.c(new Supplier() { // from class: afzk
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m26.j(new dtsc() { // from class: afzw
        });
        m26.a();
        dtsb m27 = dtsd.m();
        m27.m(1);
        m27.b("conversations.rcs_session_allows_revocation");
        m27.i(48040);
        m27.c(new Supplier() { // from class: agai
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m27.j(new dtsc() { // from class: agau
        });
        m27.a();
        dtsb m28 = dtsd.m();
        m28.m(1);
        m28.b("conversations.marked_as_unread");
        m28.i(59220);
        m28.c(new Supplier() { // from class: agbg
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m28.j(new dtsc() { // from class: agbu
        });
        m28.a();
        dtsb m29 = dtsd.m();
        m29.m(2);
        m29.b("conversations.mms_group_upgrade_status");
        m29.i(60050);
        m29.c(new Supplier() { // from class: agcg
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m29.j(new dtsc() { // from class: agcs
        });
        m29.a();
        dtsb m30 = dtsd.m();
        m30.m(2);
        m30.b("conversations.unread_count");
        m30.i(60740);
        m30.c(new Supplier() { // from class: agde
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m30.j(new dtsc() { // from class: agdq
        });
        m30.a();
        dtsb m31 = dtsd.m();
        m31.m(1);
        m31.d(true);
        m31.b("conversations.sms_thread_id");
        m31.i(-1);
        m31.c(new Supplier() { // from class: aged
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m31.j(new dtsc() { // from class: agep
        });
        m31.a();
        dtsb m32 = dtsd.m();
        m32.m(2);
        m32.b("conversations.name_is_automatic");
        m32.i(10012);
        m32.c(new Supplier() { // from class: agfb
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m32.j(new dtsc() { // from class: agfn
        });
        m32.a();
        dtsb m33 = dtsd.m();
        m33.m(4);
        m33.b("conversations.subtitle");
        m33.i(59760);
        m33.c(new Supplier() { // from class: aggb
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m33.j(new dtsc() { // from class: aggn
        });
        m33.a();
        dtsb m34 = dtsd.m();
        m34.m(1);
        m34.b("conversations.latest_message_id");
        m34.i(-1);
        m34.c(new Supplier() { // from class: aggz
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m34.j(new dtsc() { // from class: aghg
        });
        this.c = new agkh(m34.a());
        dtsb m35 = dtsd.m();
        m35.m(1);
        m35.b("conversations.etouffee_default");
        m35.i(29060);
        m35.c(new Supplier() { // from class: aghi
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m35.j(new dtsc() { // from class: aghj
        });
        m35.a();
        dtsb m36 = dtsd.m();
        m36.m(1);
        m36.b("conversations.last_read_timestamp");
        m36.i(-1);
        m36.c(new Supplier() { // from class: aghl
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m36.j(new dtsc() { // from class: aghm
        });
        m36.a();
        dtsb m37 = dtsd.m();
        m37.m(1);
        m37.b("conversations.participant_contact_id");
        m37.i(-1);
        m37.c(new Supplier() { // from class: aghn
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m37.j(new dtsc() { // from class: agho
        });
        m37.a();
        dtsb m38 = dtsd.m();
        m38.m(1);
        m38.b("conversations.normalized_participant_contact_id");
        m38.i(58090);
        m38.c(new Supplier() { // from class: aghp
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m38.j(new dtsc() { // from class: aghq
        });
        m38.a();
        dtsb m39 = dtsd.m();
        m39.m(4);
        m39.b("conversations.normalized_participant_lookup_key");
        m39.i(58090);
        m39.c(new Supplier() { // from class: aghr
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m39.j(new dtsc() { // from class: aght
        });
        m39.a();
        dtsb m40 = dtsd.m();
        m40.m(4);
        m40.l(true);
        m40.d(true);
        m40.b("conversations.participant_comparable_destination");
        m40.f(true);
        m40.i(58090);
        m40.c(new Supplier() { // from class: aghu
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m40.j(new dtsc() { // from class: aghv
        });
        m40.a();
        dtsb m41 = dtsd.m();
        m41.m(4);
        m41.b("conversations.current_self_id");
        m41.i(-1);
        m41.c(new Supplier() { // from class: aghx
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m41.j(new dtsc() { // from class: aghy
        });
        m41.a();
        dtsb m42 = dtsd.m();
        m42.m(4);
        m42.b("conversations.current_my_identity");
        m42.i(59810);
        m42.c(new Supplier() { // from class: aghz
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m42.j(new dtsc() { // from class: agia
        });
        m42.a();
        dtsb m43 = dtsd.m();
        m43.m(4);
        m43.d(true);
        m43.e(true);
        m43.h(new Supplier() { // from class: agib
            @Override // java.util.function.Supplier
            public final Object get() {
                return azoi.c.a;
            }
        });
        m43.b("conversations.current_my_identity_foreign_key");
        m43.i(60160);
        m43.c(new Supplier() { // from class: agic
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m43.j(new dtsc() { // from class: agie
        });
        m43.a();
        dtsb m44 = dtsd.m();
        m44.m(4);
        m44.d(true);
        m44.e(true);
        m44.h(new Supplier() { // from class: agif
            @Override // java.util.function.Supplier
            public final Object get() {
                return azdt.b.a;
            }
        });
        m44.b("conversations.destination_token");
        m44.i(60360);
        m44.c(new Supplier() { // from class: agig
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m44.j(new dtsc() { // from class: agih
        });
        m44.a();
        dtsb m45 = dtsd.m();
        m45.m(4);
        m45.b("conversations.notification_sound_uri");
        m45.i(-1);
        m45.c(new Supplier() { // from class: agij
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m45.j(new dtsc() { // from class: agik
        });
        m45.a();
        dtsb m46 = dtsd.m();
        m46.m(1);
        m46.b("conversations.notification_vibration");
        m46.i(-1);
        m46.c(new Supplier() { // from class: agil
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m46.j(new dtsc() { // from class: agim
        });
        m46.a();
        dtsb m47 = dtsd.m();
        m47.m(4);
        m47.b("conversations.sms_service_center");
        m47.i(-1);
        m47.c(new Supplier() { // from class: agin
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m47.j(new dtsc() { // from class: agip
        });
        m47.a();
        dtsb m48 = dtsd.m();
        m48.m(4);
        m48.b("conversations.participant_id_list");
        m48.i(8500);
        m48.c(new Supplier() { // from class: agiq
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m48.j(new dtsc() { // from class: agir
        });
        m48.a();
        dtsb m49 = dtsd.m();
        m49.m(4);
        m49.l(true);
        m49.d(true);
        m49.b("conversations.normalized_participant_id_list");
        m49.f(true);
        m49.i(58090);
        m49.c(new Supplier() { // from class: agis
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m49.j(new dtsc() { // from class: agit
        });
        m49.a();
        dtsb m50 = dtsd.m();
        m50.m(1);
        m50.b("conversations.send_mode");
        m50.i(10016);
        m50.c(new Supplier() { // from class: afon
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m50.j(new dtsc() { // from class: afsu
        });
        m50.a();
        dtsb m51 = dtsd.m();
        m51.m(1);
        m51.b("conversations.last_interactive_event_timestamp");
        m51.i(15000);
        m51.c(new Supplier() { // from class: afxb
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m51.j(new dtsc() { // from class: agbi
        });
        m51.a();
        dtsb m52 = dtsd.m();
        m52.m(4);
        m52.b("conversations.normalized_participant_display_destination");
        m52.i(58090);
        m52.c(new Supplier() { // from class: agfp
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m52.j(new dtsc() { // from class: agiy
        });
        m52.a();
        dtsb m53 = dtsd.m();
        m53.m(1);
        m53.b("conversations.spam_warning_dismiss_status");
        m53.i(23000);
        m53.c(new Supplier() { // from class: agjj
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m53.j(new dtsc() { // from class: agju
        });
        m53.a();
        dtsb m54 = dtsd.m();
        m54.m(1);
        m54.b("conversations.open_count");
        m54.i(26020);
        m54.c(new Supplier() { // from class: agkf
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m54.j(new dtsc() { // from class: afkr
        });
        m54.a();
        dtsb m55 = dtsd.m();
        m55.m(1);
        m55.b("conversations.last_logged_scooby_metadata_timestamp");
        m55.i(28010);
        m55.c(new Supplier() { // from class: afln
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m55.j(new dtsc() { // from class: afly
        });
        m55.a();
        dtsb m56 = dtsd.m();
        m56.m(1);
        m56.d(true);
        m56.b("conversations.delete_timestamp");
        m56.i(29020);
        m56.c(new Supplier() { // from class: afmj
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m56.j(new dtsc() { // from class: afmu
        });
        m56.a();
        dtsb m57 = dtsd.m();
        m57.m(4);
        m57.l(true);
        m57.d(true);
        m57.b("conversations.cms_id");
        m57.f(true);
        m57.i(32000);
        m57.c(new Supplier() { // from class: afnf
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m57.j(new dtsc() { // from class: afnq
        });
        m57.a();
        dtsb m58 = dtsd.m();
        m58.m(4);
        m58.d(true);
        m58.b("conversations.rcs_group_id");
        m58.i(40050);
        m58.c(new Supplier() { // from class: afob
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m58.j(new dtsc() { // from class: afom
        });
        m58.a();
        dtsb m59 = dtsd.m();
        m59.m(4);
        m59.b("conversations.rcs_conference_uri");
        m59.i(40050);
        m59.c(new Supplier() { // from class: afoy
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m59.j(new dtsc() { // from class: afpj
        });
        m59.a();
        dtsb m60 = dtsd.m();
        m60.m(5);
        m60.b("conversations.tachygram_group_routing_info_token");
        m60.i(58120);
        m60.c(new Supplier() { // from class: afqf
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m60.j(new dtsc() { // from class: afqq
        });
        m60.a();
        dtsb m61 = dtsd.m();
        m61.m(1);
        m61.b("conversations.cms_most_recent_read_message_timestamp_ms");
        m61.i(53030);
        m61.c(new Supplier() { // from class: afrb
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m61.j(new dtsc() { // from class: afrm
        });
        m61.a();
        dtsb m62 = dtsd.m();
        m62.m(2);
        m62.b("conversations.rcs_subject_change_timestamp_ms");
        m62.i(46050);
        m62.c(new Supplier() { // from class: afrx
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m62.j(new dtsc() { // from class: afsi
        });
        m62.a();
        dtsb m63 = dtsd.m();
        m63.m(2);
        m63.b("conversations.rcs_group_capabilities");
        m63.i(49020);
        m63.c(new Supplier() { // from class: afst
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m63.j(new dtsc() { // from class: aftf
        });
        m63.a();
        dtsb m64 = dtsd.m();
        m64.m(1);
        m64.b("conversations.awaiting_reverse_sync");
        m64.i(49060);
        m64.c(new Supplier() { // from class: aftq
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m64.j(new dtsc() { // from class: afub
        });
        m64.a();
        dtsb m65 = dtsd.m();
        m65.m(2);
        m65.d(true);
        m65.e(true);
        m65.h(new Supplier() { // from class: afux
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsom.c.a;
            }
        });
        m65.b("conversations.duplicate_of");
        m65.i(58090);
        m65.c(new Supplier() { // from class: afvi
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m65.j(new dtsc() { // from class: afvt
        });
        m65.a();
        dtsb m66 = dtsd.m();
        m66.m(2);
        m66.d(true);
        m66.e(true);
        m66.h(new Supplier() { // from class: afwe
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsom.c.a;
            }
        });
        m66.b("conversations.new_duplicate_of");
        m66.i(59130);
        m66.c(new Supplier() { // from class: afwp
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m66.j(new dtsc() { // from class: afxa
        });
        m66.a();
        dtsb m67 = dtsd.m();
        m67.m(1);
        m67.b("conversations.error_state");
        m67.i(58140);
        m67.c(new Supplier() { // from class: afxm
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m67.j(new dtsc() { // from class: afxx
        });
        m67.a();
        dtsb m68 = dtsd.m();
        m68.m(1);
        m68.b("conversations.cms_life_cycle");
        m68.i(58210);
        m68.c(new Supplier() { // from class: afyi
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m68.j(new dtsc() { // from class: afyt
        });
        m68.a();
        dtsb m69 = dtsd.m();
        m69.m(4);
        m69.b("conversations.rcs_group_self_msisdn");
        m69.i(58540);
        m69.c(new Supplier() { // from class: afzp
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m69.j(new dtsc() { // from class: agaa
        });
        m69.a();
        dtsb m70 = dtsd.m();
        m70.m(2);
        m70.b("conversations.recipient_offline_timestamp_ms");
        m70.i(58750);
        m70.c(new Supplier() { // from class: agal
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m70.j(new dtsc() { // from class: agaw
        });
        m70.a();
        dtsb m71 = dtsd.m();
        m71.m(2);
        m71.b("conversations.rcs_group_last_sync_timestamp");
        m71.i(58910);
        m71.c(new Supplier() { // from class: agbh
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m71.j(new dtsc() { // from class: agbt
        });
        m71.a();
        dtsb m72 = dtsd.m();
        m72.m(1);
        m72.b("conversations.has_been_e2ee");
        m72.i(59210);
        m72.c(new Supplier() { // from class: agce
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m72.j(new dtsc() { // from class: agcp
        });
        m72.a();
        dtsb m73 = dtsd.m();
        m73.m(5);
        m73.b("conversations.custom_theme");
        m73.i(59820);
        m73.c(new Supplier() { // from class: agda
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m73.j(new dtsc() { // from class: agdl
        });
        m73.a();
        dtsb m74 = dtsd.m();
        m74.m(2);
        m74.b("conversations.mms_group_upgrade_retries");
        m74.i(60050);
        m74.c(new Supplier() { // from class: ageh
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m74.j(new dtsc() { // from class: ages
        });
        m74.a();
        dtsb m75 = dtsd.m();
        m75.m(2);
        m75.b("conversations.encryption_protocol");
        m75.i(60180);
        m75.c(new Supplier() { // from class: agfd
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m75.j(new dtsc() { // from class: agfo
        });
        m75.a();
        dtsb m76 = dtsd.m();
        m76.m(4);
        m76.b("conversations.encryption_id");
        m76.i(60210);
        m76.c(new Supplier() { // from class: agga
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m76.j(new dtsc() { // from class: aggl
        });
        m76.a();
        dtsb m77 = dtsd.m();
        m77.m(4);
        m77.l(true);
        m77.d(true);
        m77.b("conversations.cms_correlation_id");
        m77.f(true);
        m77.i(60250);
        m77.c(new Supplier() { // from class: aggw
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m77.j(new dtsc() { // from class: aghh
        });
        m77.a();
        dtsb m78 = dtsd.m();
        m78.m(4);
        m78.b("conversations.rcs_group_icon_url");
        m78.i(60590);
        m78.c(new Supplier() { // from class: aghs
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m78.j(new dtsc() { // from class: agid
        });
        m78.a();
        dtsb m79 = dtsd.m();
        m79.m(2);
        m79.l(true);
        m79.g(true);
        m79.d(true);
        m79.b("messages._id");
        m79.i(-1);
        m79.c(new Supplier() { // from class: agiv
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m79.j(new dtsc() { // from class: agiw
        });
        this.d = new agkh(m79.a());
        dtsb m80 = dtsd.m();
        m80.m(1);
        m80.d(true);
        m80.b("messages.sent_timestamp");
        m80.i(-1);
        m80.c(new Supplier() { // from class: agix
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m80.j(new dtsc() { // from class: agiz
        });
        m80.a();
        dtsb m81 = dtsd.m();
        m81.m(1);
        m81.d(true);
        m81.b("messages.received_timestamp");
        m81.i(-1);
        m81.c(new Supplier() { // from class: agja
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m81.j(new dtsc() { // from class: agjb
        });
        this.e = new agkh(m81.a());
        dtsb m82 = dtsd.m();
        m82.m(1);
        m82.b("messages.message_protocol");
        m82.i(-1);
        m82.c(new Supplier() { // from class: agjc
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m82.j(new dtsc() { // from class: agjd
        });
        m82.a();
        dtsb m83 = dtsd.m();
        m83.m(1);
        m83.d(true);
        m83.b("messages.message_status");
        m83.i(-1);
        m83.c(new Supplier() { // from class: agje
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m83.j(new dtsc() { // from class: agjf
        });
        m83.a();
        dtsb m84 = dtsd.m();
        m84.m(1);
        m84.d(true);
        m84.b("messages.read");
        m84.i(-1);
        m84.c(new Supplier() { // from class: agjh
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m84.j(new dtsc() { // from class: agji
        });
        m84.a();
        dtsb m85 = dtsd.m();
        m85.m(1);
        m85.b("messages.sms_priority");
        m85.i(-1);
        m85.c(new Supplier() { // from class: agjk
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m85.j(new dtsc() { // from class: agjl
        });
        m85.a();
        dtsb m86 = dtsd.m();
        m86.m(1);
        m86.b("messages.raw_status");
        m86.i(-1);
        m86.c(new Supplier() { // from class: agjm
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m86.j(new dtsc() { // from class: agjn
        });
        m86.a();
        dtsb m87 = dtsd.m();
        m87.m(1);
        m87.b("messages.sms_error_code");
        m87.i(9000);
        m87.c(new Supplier() { // from class: agjo
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m87.j(new dtsc() { // from class: agjp
        });
        m87.a();
        dtsb m88 = dtsd.m();
        m88.m(4);
        m88.b("messages.sms_error_desc_map_name");
        m88.i(9000);
        m88.c(new Supplier() { // from class: agjq
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m88.j(new dtsc() { // from class: agjr
        });
        m88.a();
        dtsb m89 = dtsd.m();
        m89.m(1);
        m89.d(true);
        m89.e(true);
        m89.h(new Supplier() { // from class: agjt
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsom.c.a;
            }
        });
        m89.b("messages.conversation_id");
        m89.i(-1);
        m89.c(new Supplier() { // from class: agjv
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m89.j(new dtsc() { // from class: agjw
        });
        m89.a();
        dtsb m90 = dtsd.m();
        m90.m(1);
        m90.d(true);
        m90.e(true);
        m90.h(new Supplier() { // from class: agjx
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.c.a;
            }
        });
        m90.b("messages.sender_id");
        m90.i(-1);
        m90.c(new Supplier() { // from class: agjy
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m90.j(new dtsc() { // from class: agjz
        });
        m90.a();
        dtsb m91 = dtsd.m();
        m91.m(4);
        m91.b("messages.sender_send_destination");
        m91.i(54040);
        m91.c(new Supplier() { // from class: agka
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m91.j(new dtsc() { // from class: agkb
        });
        m91.a();
        dtsb m92 = dtsd.m();
        m92.m(4);
        m92.b("messages.msisdn_receiving_rcs_message");
        m92.i(59340);
        m92.c(new Supplier() { // from class: agkc
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m92.j(new dtsc() { // from class: agkd
        });
        m92.a();
        dtsb m93 = dtsd.m();
        m93.m(4);
        m93.b("messages.receiving_network_country");
        m93.i(54040);
        m93.c(new Supplier() { // from class: afkh
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m93.j(new dtsc() { // from class: afki
        });
        m93.a();
        dtsb m94 = dtsd.m();
        m94.m(1);
        m94.b("messages.queue_insert_timestamp");
        m94.i(17030);
        m94.c(new Supplier() { // from class: afkj
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m94.j(new dtsc() { // from class: afkk
        });
        m94.a();
        dtsb m95 = dtsd.m();
        m95.m(1);
        m95.b("messages.message_report_status");
        m95.i(13020);
        m95.c(new Supplier() { // from class: afkl
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m95.j(new dtsc() { // from class: afkm
        });
        m95.a();
        dtsb m96 = dtsd.m();
        m96.m(1);
        m96.d(true);
        m96.b("messages.seen");
        m96.f(true);
        m96.i(-1);
        m96.c(new Supplier() { // from class: afkn
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m96.j(new dtsc() { // from class: afko
        });
        m96.a();
        dtsb m97 = dtsd.m();
        m97.m(4);
        m97.d(true);
        m97.b("messages.sms_message_uri");
        m97.i(-1);
        m97.c(new Supplier() { // from class: afkp
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m97.j(new dtsc() { // from class: afkq
        });
        m97.a();
        dtsb m98 = dtsd.m();
        m98.m(1);
        m98.b("messages.sms_message_size");
        m98.i(-1);
        m98.c(new Supplier() { // from class: afku
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m98.j(new dtsc() { // from class: afkv
        });
        m98.a();
        dtsb m99 = dtsd.m();
        m99.m(4);
        m99.b("messages.mms_subject");
        m99.i(-1);
        m99.c(new Supplier() { // from class: afkw
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m99.j(new dtsc() { // from class: afkx
        });
        m99.a();
        dtsb m100 = dtsd.m();
        m100.m(4);
        m100.b("messages.mms_transaction_id");
        m100.i(-1);
        m100.c(new Supplier() { // from class: afky
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m100.j(new dtsc() { // from class: afkz
        });
        m100.a();
        dtsb m101 = dtsd.m();
        m101.m(4);
        m101.b("messages.mms_content_location");
        m101.i(-1);
        m101.c(new Supplier() { // from class: afla
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m101.j(new dtsc() { // from class: aflb
        });
        m101.a();
        dtsb m102 = dtsd.m();
        m102.m(1);
        m102.b("messages.mms_expiry");
        m102.i(-1);
        m102.c(new Supplier() { // from class: afld
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m102.j(new dtsc() { // from class: afle
        });
        m102.a();
        dtsb m103 = dtsd.m();
        m103.m(1);
        m103.d(true);
        m103.b("messages.rcs_expiry");
        m103.i(59890);
        m103.c(new Supplier() { // from class: aflg
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m103.j(new dtsc() { // from class: aflh
        });
        m103.a();
        dtsb m104 = dtsd.m();
        m104.m(4);
        m104.b("messages.mms_retrieve_text");
        m104.i(9030);
        m104.c(new Supplier() { // from class: afli
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m104.j(new dtsc() { // from class: aflj
        });
        m104.a();
        dtsb m105 = dtsd.m();
        m105.m(1);
        m105.d(true);
        m105.e(true);
        m105.h(new Supplier() { // from class: aflk
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.c.a;
            }
        });
        m105.b("messages.self_id");
        m105.i(-1);
        m105.c(new Supplier() { // from class: afll
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m105.j(new dtsc() { // from class: aflm
        });
        m105.a();
        dtsb m106 = dtsd.m();
        m106.m(4);
        m106.d(true);
        m106.b("messages.my_identity");
        m106.i(59810);
        m106.c(new Supplier() { // from class: aflo
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m106.j(new dtsc() { // from class: aflp
        });
        m106.a();
        dtsb m107 = dtsd.m();
        m107.m(4);
        m107.d(true);
        m107.e(true);
        m107.h(new Supplier() { // from class: aflq
            @Override // java.util.function.Supplier
            public final Object get() {
                return azoi.c.a;
            }
        });
        m107.b("messages.my_identity_foreign_key");
        m107.i(60160);
        m107.c(new Supplier() { // from class: afls
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m107.j(new dtsc() { // from class: aflt
        });
        m107.a();
        dtsb m108 = dtsd.m();
        m108.m(1);
        m108.b("messages.retry_start_timestamp");
        m108.i(-1);
        m108.c(new Supplier() { // from class: aflu
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m108.j(new dtsc() { // from class: aflv
        });
        m108.a();
        dtsb m109 = dtsd.m();
        m109.m(4);
        m109.d(true);
        m109.b("messages.cloud_sync_id");
        m109.i(8500);
        m109.c(new Supplier() { // from class: aflw
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m109.j(new dtsc() { // from class: aflx
        });
        m109.a();
        dtsb m110 = dtsd.m();
        m110.m(7);
        m110.d(true);
        m110.b("messages.rcs_message_id");
        m110.f(true);
        m110.i(10000);
        m110.c(new Supplier() { // from class: aflz
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m110.j(new dtsc() { // from class: afma
        });
        m110.a();
        dtsb m111 = dtsd.m();
        m111.m(4);
        m111.d(true);
        m111.b("messages.rcs_message_id_with_text_type");
        m111.f(true);
        m111.i(41040);
        m111.c(new Supplier() { // from class: afmb
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m111.j(new dtsc() { // from class: afmc
        });
        m111.a();
        dtsb m112 = dtsd.m();
        m112.m(1);
        m112.b("messages.etouffee_status");
        m112.i(29060);
        m112.c(new Supplier() { // from class: afme
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m112.j(new dtsc() { // from class: afmf
        });
        m112.a();
        dtsb m113 = dtsd.m();
        m113.m(1);
        m113.b("messages.verification_status");
        m113.i(29090);
        m113.c(new Supplier() { // from class: afmg
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m113.j(new dtsc() { // from class: afmh
        });
        m113.a();
        dtsb m114 = dtsd.m();
        m114.m(1);
        m114.b("messages.rcs_ui_status");
        m114.i(39000);
        m114.c(new Supplier() { // from class: afmi
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m114.j(new dtsc() { // from class: afmk
        });
        m114.a();
        dtsb m115 = dtsd.m();
        m115.m(1);
        m115.d(true);
        m115.b("messages.is_hidden");
        m115.i(30010);
        m115.c(new Supplier() { // from class: afml
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m115.j(new dtsc() { // from class: afmm
        });
        m115.a();
        dtsb m116 = dtsd.m();
        m116.m(7);
        m116.b("messages.rcs_remote_instance");
        m116.i(10002);
        m116.c(new Supplier() { // from class: afmn
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m116.j(new dtsc() { // from class: afmo
        });
        m116.a();
        dtsb m117 = dtsd.m();
        m117.m(1);
        m117.b("messages.rcs_file_transfer_session_id");
        m117.i(10004);
        m117.c(new Supplier() { // from class: afmq
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m117.j(new dtsc() { // from class: afmr
        });
        m117.a();
        dtsb m118 = dtsd.m();
        m118.m(4);
        m118.b("messages.correlation_id");
        m118.i(9010);
        m118.c(new Supplier() { // from class: afms
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m118.j(new dtsc() { // from class: afmt
        });
        m118.a();
        dtsb m119 = dtsd.m();
        m119.m(4);
        m119.l(true);
        m119.d(true);
        m119.b("messages.cms_id");
        m119.f(true);
        m119.i(31010);
        m119.c(new Supplier() { // from class: afmv
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m119.j(new dtsc() { // from class: afmw
        });
        m119.a();
        dtsb m120 = dtsd.m();
        m120.m(2);
        m120.b("messages.cms_last_mod_seq");
        m120.i(37040);
        m120.c(new Supplier() { // from class: afmx
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m120.j(new dtsc() { // from class: afmy
        });
        m120.a();
        dtsb m121 = dtsd.m();
        m121.m(4);
        m121.d(true);
        m121.b("messages.web_id");
        m121.i(19020);
        m121.c(new Supplier() { // from class: afmz
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m121.j(new dtsc() { // from class: afna
        });
        m121.a();
        dtsb m122 = dtsd.m();
        m122.m(1);
        m122.b("messages.usage_stats_logging_id");
        m122.i(29100);
        m122.c(new Supplier() { // from class: afnc
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m122.j(new dtsc() { // from class: afnd
        });
        m122.a();
        dtsb m123 = dtsd.m();
        m123.m(1);
        m123.b("messages.send_counter");
        m123.i(35030);
        m123.c(new Supplier() { // from class: afne
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m123.j(new dtsc() { // from class: afng
        });
        m123.a();
        dtsb m124 = dtsd.m();
        m124.m(4);
        m124.d(true);
        m124.b("messages.original_rcs_message_id");
        m124.i(35030);
        m124.c(new Supplier() { // from class: afnh
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m124.j(new dtsc() { // from class: afni
        });
        m124.a();
        dtsb m125 = dtsd.m();
        m125.m(4);
        m125.b("messages.custom_delivery_receipt_mime_type");
        m125.i(37020);
        m125.c(new Supplier() { // from class: afnj
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m125.j(new dtsc() { // from class: afnk
        });
        m125.a();
        dtsb m126 = dtsd.m();
        m126.m(5);
        m126.b("messages.custom_delivery_receipt_content");
        m126.i(37020);
        m126.c(new Supplier() { // from class: afnl
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m126.j(new dtsc() { // from class: afnm
        });
        m126.a();
        dtsb m127 = dtsd.m();
        m127.m(1);
        m127.b("messages.report_attempt_acounter");
        m127.i(37030);
        m127.c(new Supplier() { // from class: afno
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m127.j(new dtsc() { // from class: afnp
        });
        m127.a();
        dtsb m128 = dtsd.m();
        m128.m(5);
        m128.b("messages.custom_headers");
        m128.i(45020);
        m128.c(new Supplier() { // from class: afnr
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m128.j(new dtsc() { // from class: afns
        });
        m128.a();
        dtsb m129 = dtsd.m();
        m129.m(4);
        m129.l(true);
        m129.d(true);
        m129.b("messages.cms_correlation_id");
        m129.f(true);
        m129.i(46010);
        m129.c(new Supplier() { // from class: afnt
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m129.j(new dtsc() { // from class: afnu
        });
        m129.a();
        dtsb m130 = dtsd.m();
        m130.m(1);
        m130.d(true);
        m130.e(true);
        m130.h(new Supplier() { // from class: afnv
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.c.a;
            }
        });
        m130.b("messages.group_private_participant");
        m130.i(48030);
        m130.c(new Supplier() { // from class: afnw
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m130.j(new dtsc() { // from class: afnx
        });
        m130.a();
        dtsb m131 = dtsd.m();
        m131.m(1);
        m131.d(true);
        m131.e(true);
        m131.h(new Supplier() { // from class: afny
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        });
        m131.b("messages.original_message_id");
        m131.i(48030);
        m131.c(new Supplier() { // from class: afoa
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m131.j(new dtsc() { // from class: afoc
        });
        m131.a();
        dtsb m132 = dtsd.m();
        m132.m(1);
        m132.b("messages.awaiting_reverse_sync");
        m132.i(49060);
        m132.c(new Supplier() { // from class: afod
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m132.j(new dtsc() { // from class: afoe
        });
        m132.a();
        dtsb m133 = dtsd.m();
        m133.m(4);
        m133.b("messages.old_sms_message_uri");
        m133.i(49060);
        m133.c(new Supplier() { // from class: afof
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m133.j(new dtsc() { // from class: afog
        });
        m133.a();
        dtsb m134 = dtsd.m();
        m134.m(4);
        m134.l(true);
        m134.d(true);
        m134.b("messages.draft_id");
        m134.f(true);
        m134.i(56000);
        m134.c(new Supplier() { // from class: afoh
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m134.j(new dtsc() { // from class: afoi
        });
        m134.a();
        dtsb m135 = dtsd.m();
        m135.m(1);
        m135.b("messages.result_code");
        m135.i(58040);
        m135.c(new Supplier() { // from class: afoj
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m135.j(new dtsc() { // from class: afok
        });
        m135.a();
        dtsb m136 = dtsd.m();
        m136.m(1);
        m136.b("messages.cms_life_cycle");
        m136.i(58210);
        m136.c(new Supplier() { // from class: afoo
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m136.j(new dtsc() { // from class: afop
        });
        m136.a();
        dtsb m137 = dtsd.m();
        m137.m(1);
        m137.b("messages.mute_priority");
        m137.i(60750);
        m137.c(new Supplier() { // from class: afoq
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m137.j(new dtsc() { // from class: afor
        });
        m137.a();
        dtsb m138 = dtsd.m();
        m138.m(1);
        m138.b("messages.fallback_reason");
        m138.i(58710);
        m138.c(new Supplier() { // from class: afos
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m138.j(new dtsc() { // from class: afot
        });
        m138.a();
        dtsb m139 = dtsd.m();
        m139.m(1);
        m139.b("messages.auto_retry_counter");
        m139.i(58230);
        m139.c(new Supplier() { // from class: afou
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m139.j(new dtsc() { // from class: afov
        });
        m139.a();
        dtsb m140 = dtsd.m();
        m140.m(2);
        m140.b("messages.can_revoke_before_delivered_with_rcs");
        m140.i(58280);
        m140.c(new Supplier() { // from class: afow
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m140.j(new dtsc() { // from class: afox
        });
        m140.a();
        dtsb m141 = dtsd.m();
        m141.m(5);
        m141.b("messages.trace_id");
        m141.i(58680);
        m141.c(new Supplier() { // from class: afpa
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m141.j(new dtsc() { // from class: afpb
        });
        m141.a();
        dtsb m142 = dtsd.m();
        m142.m(1);
        m142.b("messages.outgoing_delivery_report_status");
        m142.i(58720);
        m142.c(new Supplier() { // from class: afpc
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m142.j(new dtsc() { // from class: afpd
        });
        m142.a();
        dtsb m143 = dtsd.m();
        m143.m(1);
        m143.b("messages.outgoing_read_report_status");
        m143.i(58720);
        m143.c(new Supplier() { // from class: afpe
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m143.j(new dtsc() { // from class: afpf
        });
        m143.a();
        dtsb m144 = dtsd.m();
        m144.m(1);
        m144.b("messages.xms_transport");
        m144.i(59310);
        m144.c(new Supplier() { // from class: afpg
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m144.j(new dtsc() { // from class: afph
        });
        m144.a();
        dtsb m145 = dtsd.m();
        m145.m(1);
        m145.b("messages.message_original_protocol");
        m145.i(59430);
        m145.c(new Supplier() { // from class: afpi
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m145.j(new dtsc() { // from class: afpk
        });
        m145.a();
        dtsb m146 = dtsd.m();
        m146.m(4);
        m146.l(true);
        m146.d(true);
        m146.b("messages.satellite_datagram_id");
        m146.f(true);
        m146.i(59490);
        m146.c(new Supplier() { // from class: afpn
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m146.j(new dtsc() { // from class: afpo
        });
        m146.a();
        dtsb m147 = dtsd.m();
        m147.m(1);
        m147.b("messages.encryption_protocol");
        m147.i(60190);
        m147.c(new Supplier() { // from class: afpp
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m147.j(new dtsc() { // from class: afpq
        });
        m147.a();
        dtsb m148 = dtsd.m();
        m148.m(4);
        m148.l(true);
        m148.d(true);
        m148.b("messages.message_persistence_id");
        m148.f(true);
        m148.i(60370);
        m148.c(new Supplier() { // from class: afpr
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m148.j(new dtsc() { // from class: afps
        });
        m148.a();
        dtsb m149 = dtsd.m();
        m149.m(1);
        m149.d(true);
        m149.b("participants.sub_id");
        m149.f(true);
        m149.i(-1);
        m149.c(new Supplier() { // from class: afpt
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m149.j(new dtsc() { // from class: afpv
        });
        m149.a();
        dtsb m150 = dtsd.m();
        m150.m(4);
        m150.b("participants.display_destination");
        m150.i(-1);
        m150.c(new Supplier() { // from class: afpw
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m150.j(new dtsc() { // from class: afpx
        });
        m150.a();
        dtsb m151 = dtsd.m();
        m151.m(4);
        m151.b("participants.full_name");
        m151.i(-1);
        m151.c(new Supplier() { // from class: afpz
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m151.j(new dtsc() { // from class: afqa
        });
        m151.a();
        dtsb m152 = dtsd.m();
        m152.m(4);
        m152.b("participants.first_name");
        m152.i(-1);
        m152.c(new Supplier() { // from class: afqb
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m152.j(new dtsc() { // from class: afqc
        });
        m152.a();
        dtsb m153 = dtsd.m();
        m153.m(2);
        m153.l(true);
        m153.g(true);
        m153.d(true);
        m153.b("participants._id");
        m153.i(-1);
        m153.c(new Supplier() { // from class: afqd
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m153.j(new dtsc() { // from class: afqe
        });
        m153.a();
        dtsb m154 = dtsd.m();
        m154.m(4);
        m154.d(true);
        m154.b("participants.my_identity_token");
        m154.i(59930);
        m154.c(new Supplier() { // from class: afqg
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m154.j(new dtsc() { // from class: afqh
        });
        m154.a();
        dtsb m155 = dtsd.m();
        m155.m(4);
        m155.d(true);
        m155.e(true);
        m155.h(new Supplier() { // from class: afqi
            @Override // java.util.function.Supplier
            public final Object get() {
                return azoi.c.a;
            }
        });
        m155.b("participants.my_identity_token_foreign_key");
        m155.i(60160);
        m155.c(new Supplier() { // from class: afqj
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m155.j(new dtsc() { // from class: afql
        });
        m155.a();
        dtsb m156 = dtsd.m();
        m156.m(1);
        m156.b("participants.sim_slot_id");
        m156.i(2000);
        m156.c(new Supplier() { // from class: afqm
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m156.j(new dtsc() { // from class: afqn
        });
        m156.a();
        dtsb m157 = dtsd.m();
        m157.m(4);
        m157.d(true);
        m157.b("participants.normalized_destination");
        m157.f(true);
        m157.i(-1);
        m157.c(new Supplier() { // from class: afqo
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m157.j(new dtsc() { // from class: afqp
        });
        m157.a();
        dtsb m158 = dtsd.m();
        m158.m(4);
        m158.b("participants.send_destination");
        m158.i(-1);
        m158.c(new Supplier() { // from class: afqr
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m158.j(new dtsc() { // from class: afqs
        });
        m158.a();
        dtsb m159 = dtsd.m();
        m159.m(4);
        m159.l(true);
        m159.d(true);
        m159.b("participants.comparable_destination");
        m159.f(true);
        m159.i(54040);
        m159.c(new Supplier() { // from class: afqt
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m159.j(new dtsc() { // from class: afqu
        });
        m159.a();
        dtsb m160 = dtsd.m();
        m160.m(4);
        m160.b("participants.country_code");
        m160.i(54040);
        m160.c(new Supplier() { // from class: afqv
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m160.j(new dtsc() { // from class: afqx
        });
        m160.a();
        dtsb m161 = dtsd.m();
        m161.m(2);
        m161.l(true);
        m161.d(true);
        m161.b("participants.recipient_id");
        m161.f(true);
        m161.i(58090);
        m161.c(new Supplier() { // from class: afqy
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m161.j(new dtsc() { // from class: afqz
        });
        m161.a();
        dtsb m162 = dtsd.m();
        m162.m(4);
        m162.b("participants.recipient_canonical_address");
        m162.i(58090);
        m162.c(new Supplier() { // from class: afra
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m162.j(new dtsc() { // from class: afrc
        });
        m162.a();
        dtsb m163 = dtsd.m();
        m163.m(4);
        m163.b("participants.profile_photo_uri");
        m163.i(-1);
        m163.c(new Supplier() { // from class: afrd
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m163.j(new dtsc() { // from class: afre
        });
        m163.a();
        dtsb m164 = dtsd.m();
        m164.m(4);
        m164.b("participants.contact_photo_uri");
        m164.i(59850);
        m164.c(new Supplier() { // from class: afrf
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m164.j(new dtsc() { // from class: afrg
        });
        m164.a();
        dtsb m165 = dtsd.m();
        m165.m(1);
        m165.b("participants.contact_id");
        m165.i(-1);
        m165.c(new Supplier() { // from class: afrh
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m165.j(new dtsc() { // from class: afrj
        });
        m165.a();
        dtsb m166 = dtsd.m();
        m166.m(4);
        m166.b("participants.lookup_key");
        m166.i(-1);
        m166.c(new Supplier() { // from class: afrk
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m166.j(new dtsc() { // from class: afrl
        });
        m166.a();
        dtsb m167 = dtsd.m();
        m167.m(1);
        m167.b("participants.color_palette_index");
        m167.i(-1);
        m167.c(new Supplier() { // from class: afrn
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m167.j(new dtsc() { // from class: afro
        });
        m167.a();
        dtsb m168 = dtsd.m();
        m168.m(1);
        m168.b("participants.color_type");
        m168.i(1000);
        m168.c(new Supplier() { // from class: afrp
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m168.j(new dtsc() { // from class: afrq
        });
        m168.a();
        dtsb m169 = dtsd.m();
        m169.m(1);
        m169.b("participants.extended_color");
        m169.i(10027);
        m169.c(new Supplier() { // from class: afrr
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m169.j(new dtsc() { // from class: afrs
        });
        m169.a();
        dtsb m170 = dtsd.m();
        m170.m(1);
        m170.b("participants.blocked");
        m170.i(-1);
        m170.c(new Supplier() { // from class: afrt
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m170.j(new dtsc() { // from class: afrv
        });
        m170.a();
        dtsb m171 = dtsd.m();
        m171.m(4);
        m171.b("participants.subscription_name");
        m171.i(2000);
        m171.c(new Supplier() { // from class: afrw
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m171.j(new dtsc() { // from class: afry
        });
        m171.a();
        dtsb m172 = dtsd.m();
        m172.m(1);
        m172.b("participants.subscription_color");
        m172.i(2000);
        m172.c(new Supplier() { // from class: afrz
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m172.j(new dtsc() { // from class: afsa
        });
        m172.a();
        dtsb m173 = dtsd.m();
        m173.m(4);
        m173.b("participants.contact_destination");
        m173.i(4000);
        m173.c(new Supplier() { // from class: afsb
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m173.j(new dtsc() { // from class: afsc
        });
        m173.a();
        dtsb m174 = dtsd.m();
        m174.m(1);
        m174.b("participants.participant_type");
        m174.i(12001);
        m174.c(new Supplier() { // from class: afsd
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m174.j(new dtsc() { // from class: afse
        });
        m174.a();
        dtsb m175 = dtsd.m();
        m175.m(1);
        m175.b("participants.video_reachability");
        m175.i(13050);
        m175.c(new Supplier() { // from class: afsf
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m175.j(new dtsc() { // from class: afsh
        });
        m175.a();
        dtsb m176 = dtsd.m();
        m176.m(4);
        m176.b("participants.alias");
        m176.i(20060);
        m176.c(new Supplier() { // from class: afsj
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m176.j(new dtsc() { // from class: afsk
        });
        m176.a();
        dtsb m177 = dtsd.m();
        m177.m(1);
        m177.b("participants.is_spam");
        m177.i(24060);
        m177.c(new Supplier() { // from class: afsl
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m177.j(new dtsc() { // from class: afsm
        });
        m177.a();
        dtsb m178 = dtsd.m();
        m178.m(1);
        m178.b("participants.is_rcs_available");
        m178.i(29030);
        m178.c(new Supplier() { // from class: afsn
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m178.j(new dtsc() { // from class: afso
        });
        m178.a();
        dtsb m179 = dtsd.m();
        m179.m(1);
        m179.b("participants.is_spam_source");
        m179.i(30000);
        m179.c(new Supplier() { // from class: afsp
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m179.j(new dtsc() { // from class: afsq
        });
        m179.a();
        dtsb m180 = dtsd.m();
        m180.m(4);
        m180.l(true);
        m180.d(true);
        m180.b("participants.cms_id");
        m180.f(true);
        m180.i(31020);
        m180.c(new Supplier() { // from class: afsr
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m180.j(new dtsc() { // from class: afsv
        });
        m180.a();
        dtsb m181 = dtsd.m();
        m181.m(1);
        m181.b("participants.latest_verification_status");
        m181.i(31030);
        m181.c(new Supplier() { // from class: afsw
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m181.j(new dtsc() { // from class: afsx
        });
        m181.a();
        dtsb m182 = dtsd.m();
        m182.m(4);
        m182.b("participants.profile_photo_blob_id");
        m182.i(33000);
        m182.c(new Supplier() { // from class: afsy
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m182.j(new dtsc() { // from class: afsz
        });
        m182.a();
        dtsb m183 = dtsd.m();
        m183.m(5);
        m183.b("participants.profile_photo_encryption_key");
        m183.i(33060);
        m183.c(new Supplier() { // from class: afta
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m183.j(new dtsc() { // from class: aftb
        });
        m183.a();
        dtsb m184 = dtsd.m();
        m184.m(1);
        m184.b("participants.directory_id");
        m184.i(35010);
        m184.c(new Supplier() { // from class: aftc
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m184.j(new dtsc() { // from class: aftd
        });
        m184.a();
        dtsb m185 = dtsd.m();
        m185.m(1);
        m185.b("participants.is_check_constraint_enabled_via_phenotype");
        m185.i(55010);
        m185.c(new Supplier() { // from class: afte
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m185.j(new dtsc() { // from class: afth
        });
        m185.a();
        dtsb m186 = dtsd.m();
        m186.m(1);
        m186.b("participants.is_valid_phone_number_data");
        m186.i(55010);
        m186.c(new Supplier() { // from class: afti
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m186.j(new dtsc() { // from class: aftj
        });
        m186.a();
        dtsb m187 = dtsd.m();
        m187.m(2);
        m187.d(true);
        m187.e(true);
        m187.h(new Supplier() { // from class: aftk
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.c.a;
            }
        });
        m187.b("participants.duplicate_of");
        m187.i(58090);
        m187.c(new Supplier() { // from class: aftl
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m187.j(new dtsc() { // from class: aftm
        });
        m187.a();
        dtsb m188 = dtsd.m();
        m188.m(1);
        m188.b("participants.cms_life_cycle");
        m188.i(58210);
        m188.c(new Supplier() { // from class: aftn
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m188.j(new dtsc() { // from class: afto
        });
        m188.a();
        dtsb m189 = dtsd.m();
        m189.m(1);
        m189.b("participants.norm_ui_status");
        m189.i(58620);
        m189.c(new Supplier() { // from class: aftp
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m189.j(new dtsc() { // from class: aftr
        });
        m189.a();
        dtsb m190 = dtsd.m();
        m190.m(4);
        m190.b("participants.last_modified_by_key");
        m190.i(59440);
        m190.c(new Supplier() { // from class: aftt
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m190.j(new dtsc() { // from class: aftu
        });
        m190.a();
        dtsb m191 = dtsd.m();
        m191.m(1);
        m191.b("participants.name_source");
        m191.i(59550);
        m191.c(new Supplier() { // from class: aftv
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m191.j(new dtsc() { // from class: aftw
        });
        m191.a();
        dtsb m192 = dtsd.m();
        m192.m(1);
        m192.b("participants.photo_source");
        m192.i(59550);
        m192.c(new Supplier() { // from class: aftx
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m192.j(new dtsc() { // from class: afty
        });
        m192.a();
        dtsb m193 = dtsd.m();
        m193.m(1);
        m193.b("participants.profile_photo_user_preference");
        m193.i(60060);
        m193.c(new Supplier() { // from class: aftz
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m193.j(new dtsc() { // from class: afua
        });
        m193.a();
        dtsb m194 = dtsd.m();
        m194.m(5);
        m194.b("participants.contact_metadata");
        m194.i(60070);
        m194.c(new Supplier() { // from class: afuc
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m194.j(new dtsc() { // from class: afud
        });
        m194.a();
        dtsb m195 = dtsd.m();
        m195.m(1);
        m195.d(true);
        m195.b("participants.is_enterprise_contact");
        m195.i(60640);
        m195.c(new Supplier() { // from class: afug
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m195.j(new dtsc() { // from class: afuh
        });
        m195.a();
        dtsb m196 = dtsd.m();
        m196.m(1);
        m196.l(true);
        m196.g(true);
        m196.d(true);
        m196.e(true);
        m196.h(new Supplier() { // from class: afui
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.c.a;
            }
        });
        m196.b("conversation_to_participants.participant_id");
        m196.f(true);
        m196.i(-1);
        m196.c(new Supplier() { // from class: afuj
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m196.j(new dtsc() { // from class: afuk
        });
        m196.a();
        dtsb m197 = dtsd.m();
        m197.m(1);
        m197.l(true);
        m197.g(true);
        m197.d(true);
        m197.e(true);
        m197.h(new Supplier() { // from class: aful
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsom.c.a;
            }
        });
        m197.b("conversation_to_participants.conversation_id");
        m197.f(true);
        m197.i(-1);
        m197.c(new Supplier() { // from class: afun
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m197.j(new dtsc() { // from class: afuo
        });
        m197.a();
        dtsb m198 = dtsd.m();
        m198.m(1);
        m198.b("conversation_to_participants.rcs_group_join_status");
        m198.i(-1);
        m198.c(new Supplier() { // from class: afup
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m198.j(new dtsc() { // from class: afuq
        });
        m198.a();
        dtsb m199 = dtsd.m();
        m199.m(4);
        m199.b("conversation_to_participants.last_modified_by_key");
        m199.i(-1);
        m199.c(new Supplier() { // from class: afus
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m199.j(new dtsc() { // from class: afut
        });
        m199.a();
        dtsb m200 = dtsd.m();
        m200.m(4);
        m200.b("one_on_one_participant.full_name");
        m200.i(-1);
        m200.c(new Supplier() { // from class: afuu
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m200.j(new dtsc() { // from class: afuv
        });
        m200.a();
        dtsb m201 = dtsd.m();
        m201.m(4);
        m201.b("one_on_one_participant.first_name");
        m201.i(-1);
        m201.c(new Supplier() { // from class: afuw
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m201.j(new dtsc() { // from class: afuy
        });
        m201.a();
        dtsb m202 = dtsd.m();
        m202.m(2);
        m202.l(true);
        m202.g(true);
        m202.d(true);
        m202.b("one_on_one_participant._id");
        m202.i(-1);
        m202.c(new Supplier() { // from class: afuz
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m202.j(new dtsc() { // from class: afva
        });
        m202.a();
        dtsb m203 = dtsd.m();
        m203.m(4);
        m203.d(true);
        m203.b("one_on_one_participant.my_identity_token");
        m203.i(59930);
        m203.c(new Supplier() { // from class: afvb
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m203.j(new dtsc() { // from class: afvc
        });
        m203.a();
        dtsb m204 = dtsd.m();
        m204.m(4);
        m204.d(true);
        m204.e(true);
        m204.h(new Supplier() { // from class: afve
            @Override // java.util.function.Supplier
            public final Object get() {
                return azoi.c.a;
            }
        });
        m204.b("one_on_one_participant.my_identity_token_foreign_key");
        m204.i(60160);
        m204.c(new Supplier() { // from class: afvf
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m204.j(new dtsc() { // from class: afvg
        });
        m204.a();
        dtsb m205 = dtsd.m();
        m205.m(1);
        m205.d(true);
        m205.b("one_on_one_participant.sub_id");
        m205.f(true);
        m205.i(-1);
        m205.c(new Supplier() { // from class: afvh
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m205.j(new dtsc() { // from class: afvj
        });
        m205.a();
        dtsb m206 = dtsd.m();
        m206.m(1);
        m206.b("one_on_one_participant.sim_slot_id");
        m206.i(2000);
        m206.c(new Supplier() { // from class: afvk
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m206.j(new dtsc() { // from class: afvl
        });
        m206.a();
        dtsb m207 = dtsd.m();
        m207.m(4);
        m207.d(true);
        m207.b("one_on_one_participant.normalized_destination");
        m207.f(true);
        m207.i(-1);
        m207.c(new Supplier() { // from class: afvm
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m207.j(new dtsc() { // from class: afvn
        });
        m207.a();
        dtsb m208 = dtsd.m();
        m208.m(4);
        m208.b("one_on_one_participant.send_destination");
        m208.i(-1);
        m208.c(new Supplier() { // from class: afvo
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m208.j(new dtsc() { // from class: afvq
        });
        m208.a();
        dtsb m209 = dtsd.m();
        m209.m(4);
        m209.b("one_on_one_participant.display_destination");
        m209.i(-1);
        m209.c(new Supplier() { // from class: afvr
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m209.j(new dtsc() { // from class: afvs
        });
        m209.a();
        dtsb m210 = dtsd.m();
        m210.m(4);
        m210.l(true);
        m210.d(true);
        m210.b("one_on_one_participant.comparable_destination");
        m210.f(true);
        m210.i(54040);
        m210.c(new Supplier() { // from class: afvu
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m210.j(new dtsc() { // from class: afvv
        });
        m210.a();
        dtsb m211 = dtsd.m();
        m211.m(4);
        m211.b("one_on_one_participant.country_code");
        m211.i(54040);
        m211.c(new Supplier() { // from class: afvw
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m211.j(new dtsc() { // from class: afvx
        });
        m211.a();
        dtsb m212 = dtsd.m();
        m212.m(2);
        m212.l(true);
        m212.d(true);
        m212.b("one_on_one_participant.recipient_id");
        m212.f(true);
        m212.i(58090);
        m212.c(new Supplier() { // from class: afvy
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m212.j(new dtsc() { // from class: afvz
        });
        m212.a();
        dtsb m213 = dtsd.m();
        m213.m(4);
        m213.b("one_on_one_participant.recipient_canonical_address");
        m213.i(58090);
        m213.c(new Supplier() { // from class: afwa
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m213.j(new dtsc() { // from class: afwc
        });
        m213.a();
        dtsb m214 = dtsd.m();
        m214.m(4);
        m214.b("one_on_one_participant.profile_photo_uri");
        m214.i(-1);
        m214.c(new Supplier() { // from class: afwd
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m214.j(new dtsc() { // from class: afwf
        });
        m214.a();
        dtsb m215 = dtsd.m();
        m215.m(4);
        m215.b("one_on_one_participant.contact_photo_uri");
        m215.i(59850);
        m215.c(new Supplier() { // from class: afwg
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m215.j(new dtsc() { // from class: afwh
        });
        m215.a();
        dtsb m216 = dtsd.m();
        m216.m(1);
        m216.b("one_on_one_participant.contact_id");
        m216.i(-1);
        m216.c(new Supplier() { // from class: afwi
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m216.j(new dtsc() { // from class: afwj
        });
        m216.a();
        dtsb m217 = dtsd.m();
        m217.m(4);
        m217.b("one_on_one_participant.lookup_key");
        m217.i(-1);
        m217.c(new Supplier() { // from class: afwk
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m217.j(new dtsc() { // from class: afwl
        });
        m217.a();
        dtsb m218 = dtsd.m();
        m218.m(1);
        m218.b("one_on_one_participant.color_palette_index");
        m218.i(-1);
        m218.c(new Supplier() { // from class: afwm
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m218.j(new dtsc() { // from class: afwo
        });
        m218.a();
        dtsb m219 = dtsd.m();
        m219.m(1);
        m219.b("one_on_one_participant.color_type");
        m219.i(1000);
        m219.c(new Supplier() { // from class: afwq
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m219.j(new dtsc() { // from class: afwr
        });
        m219.a();
        dtsb m220 = dtsd.m();
        m220.m(1);
        m220.b("one_on_one_participant.extended_color");
        m220.i(10027);
        m220.c(new Supplier() { // from class: afws
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m220.j(new dtsc() { // from class: afwt
        });
        m220.a();
        dtsb m221 = dtsd.m();
        m221.m(1);
        m221.b("one_on_one_participant.blocked");
        m221.i(-1);
        m221.c(new Supplier() { // from class: afwu
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m221.j(new dtsc() { // from class: afwv
        });
        m221.a();
        dtsb m222 = dtsd.m();
        m222.m(4);
        m222.b("one_on_one_participant.subscription_name");
        m222.i(2000);
        m222.c(new Supplier() { // from class: afww
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m222.j(new dtsc() { // from class: afwx
        });
        m222.a();
        dtsb m223 = dtsd.m();
        m223.m(1);
        m223.b("one_on_one_participant.subscription_color");
        m223.i(2000);
        m223.c(new Supplier() { // from class: afwy
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m223.j(new dtsc() { // from class: afxc
        });
        m223.a();
        dtsb m224 = dtsd.m();
        m224.m(4);
        m224.b("one_on_one_participant.contact_destination");
        m224.i(4000);
        m224.c(new Supplier() { // from class: afxd
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m224.j(new dtsc() { // from class: afxe
        });
        m224.a();
        dtsb m225 = dtsd.m();
        m225.m(1);
        m225.b("one_on_one_participant.participant_type");
        m225.i(12001);
        m225.c(new Supplier() { // from class: afxf
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m225.j(new dtsc() { // from class: afxg
        });
        m225.a();
        dtsb m226 = dtsd.m();
        m226.m(1);
        m226.b("one_on_one_participant.video_reachability");
        m226.i(13050);
        m226.c(new Supplier() { // from class: afxh
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m226.j(new dtsc() { // from class: afxi
        });
        m226.a();
        dtsb m227 = dtsd.m();
        m227.m(4);
        m227.b("one_on_one_participant.alias");
        m227.i(20060);
        m227.c(new Supplier() { // from class: afxj
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m227.j(new dtsc() { // from class: afxk
        });
        m227.a();
        dtsb m228 = dtsd.m();
        m228.m(1);
        m228.b("one_on_one_participant.is_spam");
        m228.i(24060);
        m228.c(new Supplier() { // from class: afxl
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m228.j(new dtsc() { // from class: afxo
        });
        m228.a();
        dtsb m229 = dtsd.m();
        m229.m(1);
        m229.b("one_on_one_participant.is_rcs_available");
        m229.i(29030);
        m229.c(new Supplier() { // from class: afxp
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m229.j(new dtsc() { // from class: afxq
        });
        m229.a();
        dtsb m230 = dtsd.m();
        m230.m(1);
        m230.b("one_on_one_participant.is_spam_source");
        m230.i(30000);
        m230.c(new Supplier() { // from class: afxr
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m230.j(new dtsc() { // from class: afxs
        });
        m230.a();
        dtsb m231 = dtsd.m();
        m231.m(4);
        m231.l(true);
        m231.d(true);
        m231.b("one_on_one_participant.cms_id");
        m231.f(true);
        m231.i(31020);
        m231.c(new Supplier() { // from class: afxt
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m231.j(new dtsc() { // from class: afxu
        });
        m231.a();
        dtsb m232 = dtsd.m();
        m232.m(1);
        m232.b("one_on_one_participant.latest_verification_status");
        m232.i(31030);
        m232.c(new Supplier() { // from class: afxv
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m232.j(new dtsc() { // from class: afxw
        });
        m232.a();
        dtsb m233 = dtsd.m();
        m233.m(4);
        m233.b("one_on_one_participant.profile_photo_blob_id");
        m233.i(33000);
        m233.c(new Supplier() { // from class: afxy
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m233.j(new dtsc() { // from class: afya
        });
        m233.a();
        dtsb m234 = dtsd.m();
        m234.m(5);
        m234.b("one_on_one_participant.profile_photo_encryption_key");
        m234.i(33060);
        m234.c(new Supplier() { // from class: afyb
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m234.j(new dtsc() { // from class: afyc
        });
        m234.a();
        dtsb m235 = dtsd.m();
        m235.m(1);
        m235.b("one_on_one_participant.directory_id");
        m235.i(35010);
        m235.c(new Supplier() { // from class: afyd
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m235.j(new dtsc() { // from class: afye
        });
        m235.a();
        dtsb m236 = dtsd.m();
        m236.m(1);
        m236.b("one_on_one_participant.is_check_constraint_enabled_via_phenotype");
        m236.i(55010);
        m236.c(new Supplier() { // from class: afyf
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m236.j(new dtsc() { // from class: afyg
        });
        m236.a();
        dtsb m237 = dtsd.m();
        m237.m(1);
        m237.b("one_on_one_participant.is_valid_phone_number_data");
        m237.i(55010);
        m237.c(new Supplier() { // from class: afyh
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m237.j(new dtsc() { // from class: afyj
        });
        m237.a();
        dtsb m238 = dtsd.m();
        m238.m(2);
        m238.d(true);
        m238.e(true);
        m238.h(new Supplier() { // from class: afyk
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.c.a;
            }
        });
        m238.b("one_on_one_participant.duplicate_of");
        m238.i(58090);
        m238.c(new Supplier() { // from class: afym
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m238.j(new dtsc() { // from class: afyn
        });
        m238.a();
        dtsb m239 = dtsd.m();
        m239.m(1);
        m239.b("one_on_one_participant.cms_life_cycle");
        m239.i(58210);
        m239.c(new Supplier() { // from class: afyo
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m239.j(new dtsc() { // from class: afyp
        });
        m239.a();
        dtsb m240 = dtsd.m();
        m240.m(1);
        m240.b("one_on_one_participant.norm_ui_status");
        m240.i(58620);
        m240.c(new Supplier() { // from class: afyq
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m240.j(new dtsc() { // from class: afyr
        });
        m240.a();
        dtsb m241 = dtsd.m();
        m241.m(4);
        m241.b("one_on_one_participant.last_modified_by_key");
        m241.i(59440);
        m241.c(new Supplier() { // from class: afys
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m241.j(new dtsc() { // from class: afyu
        });
        m241.a();
        dtsb m242 = dtsd.m();
        m242.m(1);
        m242.b("one_on_one_participant.name_source");
        m242.i(59550);
        m242.c(new Supplier() { // from class: afyv
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m242.j(new dtsc() { // from class: afyw
        });
        m242.a();
        dtsb m243 = dtsd.m();
        m243.m(1);
        m243.b("one_on_one_participant.photo_source");
        m243.i(59550);
        m243.c(new Supplier() { // from class: afyz
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m243.j(new dtsc() { // from class: afza
        });
        m243.a();
        dtsb m244 = dtsd.m();
        m244.m(1);
        m244.b("one_on_one_participant.profile_photo_user_preference");
        m244.i(60060);
        m244.c(new Supplier() { // from class: afzb
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m244.j(new dtsc() { // from class: afzc
        });
        m244.a();
        dtsb m245 = dtsd.m();
        m245.m(5);
        m245.b("one_on_one_participant.contact_metadata");
        m245.i(60070);
        m245.c(new Supplier() { // from class: afzd
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m245.j(new dtsc() { // from class: afzf
        });
        m245.a();
        dtsb m246 = dtsd.m();
        m246.m(1);
        m246.d(true);
        m246.b("one_on_one_participant.is_enterprise_contact");
        m246.i(60640);
        m246.c(new Supplier() { // from class: afzg
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m246.j(new dtsc() { // from class: afzh
        });
        m246.a();
        dtsb m247 = dtsd.m();
        m247.m(4);
        m247.b("profiles_table.display_name");
        m247.i(-1);
        m247.c(new Supplier() { // from class: afzi
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m247.j(new dtsc() { // from class: afzj
        });
        m247.a();
        dtsb m248 = dtsd.m();
        m248.m(2);
        m248.l(true);
        m248.g(true);
        m248.d(true);
        m248.b("profiles_table._id");
        m248.i(-1);
        m248.c(new Supplier() { // from class: afzl
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m248.j(new dtsc() { // from class: afzm
        });
        m248.a();
        dtsb m249 = dtsd.m();
        m249.m(2);
        m249.d(true);
        m249.e(true);
        m249.h(new Supplier() { // from class: afzn
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.c.a;
            }
        });
        m249.b("profiles_table.participant_id");
        m249.i(-1);
        m249.c(new Supplier() { // from class: afzo
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m249.j(new dtsc() { // from class: afzq
        });
        m249.a();
        dtsb m250 = dtsd.m();
        m250.m(4);
        m250.b("profiles_table.person_id");
        m250.i(60170);
        m250.c(new Supplier() { // from class: afzr
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m250.j(new dtsc() { // from class: afzs
        });
        m250.a();
        dtsb m251 = dtsd.m();
        m251.m(4);
        m251.b("profiles_table.profile_access_token");
        m251.i(60170);
        m251.c(new Supplier() { // from class: afzt
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m251.j(new dtsc() { // from class: afzu
        });
        m251.a();
        dtsb m252 = dtsd.m();
        m252.m(2);
        m252.b("profiles_table.sending_self_profile_interaction_state");
        m252.i(60200);
        m252.c(new Supplier() { // from class: afzv
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m252.j(new dtsc() { // from class: afzx
        });
        m252.a();
        dtsb m253 = dtsd.m();
        m253.m(5);
        m253.b("profiles_table.self_profile_sharing_metadata");
        m253.i(60340);
        m253.c(new Supplier() { // from class: afzy
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m253.j(new dtsc() { // from class: afzz
        });
        m253.a();
        dtsb m254 = dtsd.m();
        m254.m(4);
        m254.b("profiles_table.first_name");
        m254.i(-1);
        m254.c(new Supplier() { // from class: agab
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m254.j(new dtsc() { // from class: agac
        });
        m254.a();
        dtsb m255 = dtsd.m();
        m255.m(4);
        m255.b("profiles_table.last_name");
        m255.i(-1);
        m255.c(new Supplier() { // from class: agad
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m255.j(new dtsc() { // from class: agae
        });
        m255.a();
        dtsb m256 = dtsd.m();
        m256.m(4);
        m256.b("profiles_table.photo_uri");
        m256.i(-1);
        m256.c(new Supplier() { // from class: agaf
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m256.j(new dtsc() { // from class: agag
        });
        m256.a();
        dtsb m257 = dtsd.m();
        m257.m(4);
        m257.b("profiles_table.sender_last_updated_time");
        m257.i(60170);
        m257.c(new Supplier() { // from class: agah
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m257.j(new dtsc() { // from class: agaj
        });
        m257.a();
        dtsb m258 = dtsd.m();
        m258.m(4);
        m258.b("profiles_table.sender_last_updated_time_from_rcs");
        m258.i(60200);
        m258.c(new Supplier() { // from class: agak
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m258.j(new dtsc() { // from class: agam
        });
        m258.a();
        dtsb m259 = dtsd.m();
        m259.m(4);
        m259.d(true);
        m259.b("profiles_table.contact_lookup_key");
        m259.i(-1);
        m259.c(new Supplier() { // from class: agan
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m259.j(new dtsc() { // from class: agao
        });
        m259.a();
        dtsb m260 = dtsd.m();
        m260.m(4);
        m260.d(true);
        m260.b("profiles_table.phone_number");
        m260.i(-1);
        m260.c(new Supplier() { // from class: agap
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m260.j(new dtsc() { // from class: agaq
        });
        m260.a();
        dtsb m261 = dtsd.m();
        m261.m(1);
        m261.b("profiles_table.is_self_profile_shareable");
        m261.i(60400);
        m261.c(new Supplier() { // from class: agar
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m261.j(new dtsc() { // from class: agas
        });
        m261.a();
        dtsb m262 = dtsd.m();
        m262.m(2);
        m262.b("profiles_table.has_shared_access_token_with_user");
        m262.i(60170);
        m262.c(new Supplier() { // from class: agat
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m262.j(new dtsc() { // from class: agav
        });
        m262.a();
        dtsb m263 = dtsd.m();
        m263.m(1);
        m263.b("profiles_table.name_timestamp");
        m263.i(-1);
        m263.c(new Supplier() { // from class: agax
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m263.j(new dtsc() { // from class: agay
        });
        m263.a();
        dtsb m264 = dtsd.m();
        m264.m(1);
        m264.b("profiles_table.photo_timestamp");
        m264.i(-1);
        m264.c(new Supplier() { // from class: agaz
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m264.j(new dtsc() { // from class: agba
        });
        m264.a();
        dtsb m265 = dtsd.m();
        m265.m(1);
        m265.b("profiles_table.belongs_to_self_gaia");
        m265.i(59940);
        m265.c(new Supplier() { // from class: agbb
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m265.j(new dtsc() { // from class: agbc
        });
        m265.a();
        dtsb m266 = dtsd.m();
        m266.m(1);
        m266.b("profiles_table.gaia_update_timestamp");
        m266.i(59940);
        m266.c(new Supplier() { // from class: agbd
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m266.j(new dtsc() { // from class: agbe
        });
        m266.a();
        dtsb m267 = dtsd.m();
        m267.m(4);
        m267.d(true);
        m267.b("parts.content_type");
        m267.i(-1);
        m267.c(new Supplier() { // from class: agbf
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m267.j(new dtsc() { // from class: agbj
        });
        m267.a();
        dtsb m268 = dtsd.m();
        m268.m(2);
        m268.l(true);
        m268.g(true);
        m268.d(true);
        m268.b("parts._id");
        m268.i(-1);
        m268.c(new Supplier() { // from class: agbk
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m268.j(new dtsc() { // from class: agbl
        });
        m268.a();
        dtsb m269 = dtsd.m();
        m269.m(1);
        m269.d(true);
        m269.e(true);
        m269.h(new Supplier() { // from class: agbm
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        });
        m269.b("parts.message_id");
        m269.i(-1);
        m269.c(new Supplier() { // from class: agbn
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m269.j(new dtsc() { // from class: agbo
        });
        m269.a();
        dtsb m270 = dtsd.m();
        m270.m(4);
        m270.b("parts.text");
        m270.i(-1);
        m270.c(new Supplier() { // from class: agbp
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m270.j(new dtsc() { // from class: agbq
        });
        m270.a();
        dtsb m271 = dtsd.m();
        m271.m(4);
        m271.b("parts.uri");
        m271.i(-1);
        m271.c(new Supplier() { // from class: agbr
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m271.j(new dtsc() { // from class: agbs
        });
        m271.a();
        dtsb m272 = dtsd.m();
        m272.m(4);
        m272.b("parts.original_uri");
        m272.i(10021);
        m272.c(new Supplier() { // from class: agbv
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m272.j(new dtsc() { // from class: agbw
        });
        m272.a();
        dtsb m273 = dtsd.m();
        m273.m(4);
        m273.b("parts.storage_uri");
        m273.i(29060);
        m273.c(new Supplier() { // from class: agbx
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m273.j(new dtsc() { // from class: agby
        });
        m273.a();
        dtsb m274 = dtsd.m();
        m274.m(1);
        m274.b("parts.width");
        m274.i(-1);
        m274.c(new Supplier() { // from class: agbz
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m274.j(new dtsc() { // from class: agca
        });
        m274.a();
        dtsb m275 = dtsd.m();
        m275.m(1);
        m275.b("parts.height");
        m275.i(-1);
        m275.c(new Supplier() { // from class: agcb
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m275.j(new dtsc() { // from class: agcc
        });
        m275.a();
        dtsb m276 = dtsd.m();
        m276.m(1);
        m276.b("parts.timestamp");
        m276.i(3010);
        m276.c(new Supplier() { // from class: agcd
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m276.j(new dtsc() { // from class: agcf
        });
        m276.a();
        dtsb m277 = dtsd.m();
        m277.m(4);
        m277.d(true);
        m277.b("parts.output_uri");
        m277.i(4020);
        m277.c(new Supplier() { // from class: agch
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m277.j(new dtsc() { // from class: agci
        });
        m277.a();
        dtsb m278 = dtsd.m();
        m278.m(1);
        m278.b("parts.target_size");
        m278.i(4020);
        m278.c(new Supplier() { // from class: agcj
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m278.j(new dtsc() { // from class: agck
        });
        m278.a();
        dtsb m279 = dtsd.m();
        m279.m(1);
        m279.b("parts.processing_status");
        m279.i(4020);
        m279.c(new Supplier() { // from class: agcl
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m279.j(new dtsc() { // from class: agcm
        });
        m279.a();
        dtsb m280 = dtsd.m();
        m280.m(1);
        m280.b("parts.cms_attachment_processing_status");
        m280.i(44010);
        m280.c(new Supplier() { // from class: agcn
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m280.j(new dtsc() { // from class: agco
        });
        m280.a();
        dtsb m281 = dtsd.m();
        m281.m(1);
        m281.d(true);
        m281.e(true);
        m281.h(new Supplier() { // from class: agcq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsom.c.a;
            }
        });
        m281.b("parts.conversation_id");
        m281.i(-1);
        m281.c(new Supplier() { // from class: agcr
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m281.j(new dtsc() { // from class: agct
        });
        m281.a();
        dtsb m282 = dtsd.m();
        m282.m(1);
        m282.b("parts.sticker_set_id");
        m282.i(5020);
        m282.c(new Supplier() { // from class: agcu
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m282.j(new dtsc() { // from class: agcv
        });
        m282.a();
        dtsb m283 = dtsd.m();
        m283.m(1);
        m283.b("parts.sticker_id");
        m283.i(5020);
        m283.c(new Supplier() { // from class: agcw
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m283.j(new dtsc() { // from class: agcx
        });
        m283.a();
        dtsb m284 = dtsd.m();
        m284.m(1);
        m284.b("parts.media_modified_timestamp");
        m284.i(7000);
        m284.c(new Supplier() { // from class: agcy
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m284.j(new dtsc() { // from class: agcz
        });
        m284.a();
        dtsb m285 = dtsd.m();
        m285.m(3);
        m285.b("parts.longitude");
        m285.i(10005);
        m285.c(new Supplier() { // from class: agdb
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m285.j(new dtsc() { // from class: agdc
        });
        m285.a();
        dtsb m286 = dtsd.m();
        m286.m(3);
        m286.b("parts.latitude");
        m286.i(10005);
        m286.c(new Supplier() { // from class: agdd
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m286.j(new dtsc() { // from class: agdf
        });
        m286.a();
        dtsb m287 = dtsd.m();
        m287.m(4);
        m287.b("parts.preview_content_uri");
        m287.i(10017);
        m287.c(new Supplier() { // from class: agdg
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m287.j(new dtsc() { // from class: agdh
        });
        m287.a();
        dtsb m288 = dtsd.m();
        m288.m(4);
        m288.d(true);
        m288.b("parts.preview_content_type");
        m288.i(10017);
        m288.c(new Supplier() { // from class: agdi
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m288.j(new dtsc() { // from class: agdj
        });
        m288.a();
        dtsb m289 = dtsd.m();
        m289.m(4);
        m289.b("parts.fallback_uri");
        m289.i(13000);
        m289.c(new Supplier() { // from class: agdk
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m289.j(new dtsc() { // from class: agdm
        });
        m289.a();
        dtsb m290 = dtsd.m();
        m290.m(1);
        m290.b("parts.source");
        m290.i(14010);
        m290.c(new Supplier() { // from class: agdn
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m290.j(new dtsc() { // from class: agdo
        });
        m290.a();
        dtsb m291 = dtsd.m();
        m291.m(1);
        m291.b("parts.bundle_index");
        m291.i(17010);
        m291.c(new Supplier() { // from class: agdp
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m291.j(new dtsc() { // from class: agds
        });
        m291.a();
        dtsb m292 = dtsd.m();
        m292.m(4);
        m292.b("parts.blob_id");
        m292.i(17020);
        m292.c(new Supplier() { // from class: agdt
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m292.j(new dtsc() { // from class: agdu
        });
        m292.a();
        dtsb m293 = dtsd.m();
        m293.m(4);
        m293.b("parts.blob_gaia_email");
        m293.i(59570);
        m293.c(new Supplier() { // from class: agdv
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m293.j(new dtsc() { // from class: agdx
        });
        m293.a();
        dtsb m294 = dtsd.m();
        m294.m(4);
        m294.b("parts.cms_full_size_blob_id");
        m294.i(40040);
        m294.c(new Supplier() { // from class: agdy
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m294.j(new dtsc() { // from class: agdz
        });
        m294.a();
        dtsb m295 = dtsd.m();
        m295.m(5);
        m295.b("parts.cms_media_encryption_key");
        m295.i(42010);
        m295.c(new Supplier() { // from class: agea
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m295.j(new dtsc() { // from class: ageb
        });
        m295.a();
        dtsb m296 = dtsd.m();
        m296.m(5);
        m296.b("parts.cms_compressed_media_encryption_key");
        m296.i(42070);
        m296.c(new Supplier() { // from class: agec
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m296.j(new dtsc() { // from class: agee
        });
        m296.a();
        dtsb m297 = dtsd.m();
        m297.m(1);
        m297.b("parts.blob_upload_permanent_failure");
        m297.i(18000);
        m297.c(new Supplier() { // from class: agef
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m297.j(new dtsc() { // from class: ageg
        });
        m297.a();
        dtsb m298 = dtsd.m();
        m298.m(1);
        m298.b("parts.blob_upload_timestamp");
        m298.i(19030);
        m298.c(new Supplier() { // from class: agei
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m298.j(new dtsc() { // from class: agej
        });
        m298.a();
        dtsb m299 = dtsd.m();
        m299.m(4);
        m299.b("parts.expressive_sticker_name");
        m299.i(22060);
        m299.c(new Supplier() { // from class: agek
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m299.j(new dtsc() { // from class: agel
        });
        m299.a();
        dtsb m300 = dtsd.m();
        m300.m(4);
        m300.b("parts.file_name");
        m300.i(26000);
        m300.c(new Supplier() { // from class: agem
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m300.j(new dtsc() { // from class: agen
        });
        m300.a();
        dtsb m301 = dtsd.m();
        m301.m(1);
        m301.b("parts.duration");
        m301.i(26040);
        m301.c(new Supplier() { // from class: ageo
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m301.j(new dtsc() { // from class: ageq
        });
        m301.a();
        dtsb m302 = dtsd.m();
        m302.m(4);
        m302.b("parts.compressed_blob_id");
        m302.i(27000);
        m302.c(new Supplier() { // from class: ager
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m302.j(new dtsc() { // from class: aget
        });
        m302.a();
        dtsb m303 = dtsd.m();
        m303.m(4);
        m303.b("parts.cms_compressed_blob_id");
        m303.i(40040);
        m303.c(new Supplier() { // from class: ageu
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m303.j(new dtsc() { // from class: agev
        });
        m303.a();
        dtsb m304 = dtsd.m();
        m304.m(1);
        m304.b("parts.compressed_blob_upload_permanent_failure");
        m304.i(27000);
        m304.c(new Supplier() { // from class: agew
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m304.j(new dtsc() { // from class: agex
        });
        m304.a();
        dtsb m305 = dtsd.m();
        m305.m(1);
        m305.b("parts.compressed_blob_upload_timestamp");
        m305.i(27000);
        m305.c(new Supplier() { // from class: agey
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m305.j(new dtsc() { // from class: agez
        });
        m305.a();
        dtsb m306 = dtsd.m();
        m306.m(5);
        m306.b("parts.media_encryption_key");
        m306.i(30040);
        m306.c(new Supplier() { // from class: agfa
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m306.j(new dtsc() { // from class: agfc
        });
        m306.a();
        dtsb m307 = dtsd.m();
        m307.m(5);
        m307.b("parts.compressed_media_encryption_key");
        m307.i(30040);
        m307.c(new Supplier() { // from class: agfe
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m307.j(new dtsc() { // from class: agff
        });
        m307.a();
        dtsb m308 = dtsd.m();
        m308.m(5);
        m308.b("parts.attachment_upload_response");
        m308.i(49010);
        m308.c(new Supplier() { // from class: agfg
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m308.j(new dtsc() { // from class: agfh
        });
        m308.a();
        dtsb m309 = dtsd.m();
        m309.m(1);
        m309.b("parts.missing_entry_in_telephony");
        m309.i(52030);
        m309.c(new Supplier() { // from class: agfi
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m309.j(new dtsc() { // from class: agfj
        });
        m309.a();
        dtsb m310 = dtsd.m();
        m310.m(1);
        m310.b("parts.awaiting_reverse_sync");
        m310.i(53040);
        m310.c(new Supplier() { // from class: agfk
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m310.j(new dtsc() { // from class: agfl
        });
        m310.a();
        dtsb m311 = dtsd.m();
        m311.m(1);
        m311.b("parts.file_size_bytes");
        m311.i(52050);
        m311.c(new Supplier() { // from class: agfm
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m311.j(new dtsc() { // from class: agfq
        });
        m311.a();
        dtsb m312 = dtsd.m();
        m312.m(4);
        m312.d(true);
        m312.b("parts.local_cache_path");
        m312.i(52050);
        m312.c(new Supplier() { // from class: agfr
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m312.j(new dtsc() { // from class: agfs
        });
        m312.a();
        dtsb m313 = dtsd.m();
        m313.m(1);
        m313.b("parts.media_send_type");
        m313.i(58150);
        m313.c(new Supplier() { // from class: agft
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m313.j(new dtsc() { // from class: agfu
        });
        m313.a();
        dtsb m314 = dtsd.m();
        m314.m(5);
        m314.b("parts.voice_metadata");
        m314.i(59470);
        m314.c(new Supplier() { // from class: agfv
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m314.j(new dtsc() { // from class: agfw
        });
        m314.a();
        dtsb m315 = dtsd.m();
        m315.m(1);
        m315.b("parts.validation_status");
        m315.i(58770);
        m315.c(new Supplier() { // from class: agfx
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m315.j(new dtsc() { // from class: agfy
        });
        m315.a();
        dtsb m316 = dtsd.m();
        m316.m(4);
        m316.b("parts.processing_id");
        m316.i(60080);
        m316.c(new Supplier() { // from class: agfz
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m316.j(new dtsc() { // from class: aggc
        });
        m316.a();
        dtsb m317 = dtsd.m();
        m317.m(1);
        m317.b("parts.rich_card_media_download_failure_reason");
        m317.i(60230);
        m317.c(new Supplier() { // from class: aggd
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m317.j(new dtsc() { // from class: agge
        });
        m317.a();
        dtsb m318 = dtsd.m();
        m318.m(1);
        m318.b("parts.image_display_state");
        m318.i(60240);
        m318.c(new Supplier() { // from class: aggf
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m318.j(new dtsc() { // from class: aggg
        });
        m318.a();
        dtsb m319 = dtsd.m();
        m319.m(1);
        m319.b("parts.preserve_size");
        m319.i(60680);
        m319.c(new Supplier() { // from class: aggh
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m319.j(new dtsc() { // from class: aggi
        });
        m319.a();
        dtsb m320 = dtsd.m();
        m320.m(2);
        m320.d(true);
        m320.b("reminders.trigger_time");
        m320.i(-1);
        m320.c(new Supplier() { // from class: aggj
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m320.j(new dtsc() { // from class: aggk
        });
        m320.a();
        dtsb m321 = dtsd.m();
        m321.m(2);
        m321.l(true);
        m321.g(true);
        m321.d(true);
        m321.b("reminders._id");
        m321.i(-1);
        m321.c(new Supplier() { // from class: aggm
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m321.j(new dtsc() { // from class: aggo
        });
        m321.a();
        dtsb m322 = dtsd.m();
        m322.m(2);
        m322.l(true);
        m322.d(true);
        m322.e(true);
        m322.h(new Supplier() { // from class: aggp
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        });
        m322.b("reminders.message_id");
        m322.i(-1);
        m322.c(new Supplier() { // from class: aggq
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m322.j(new dtsc() { // from class: aggr
        });
        m322.a();
        dtsb m323 = dtsd.m();
        m323.m(2);
        m323.d(true);
        m323.e(true);
        m323.h(new Supplier() { // from class: aggs
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsom.c.a;
            }
        });
        m323.b("reminders.conversation_id");
        m323.i(35070);
        m323.c(new Supplier() { // from class: aggt
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m323.j(new dtsc() { // from class: aggu
        });
        m323.a();
        dtsb m324 = dtsd.m();
        m324.m(2);
        m324.b("reminders.status");
        m324.i(-1);
        m324.c(new Supplier() { // from class: aggv
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m324.j(new dtsc() { // from class: aggx
        });
        m324.a();
        dtsb m325 = dtsd.m();
        m325.m(2);
        m325.b("conversation_pin.pin_status");
        m325.i(-1);
        m325.c(new Supplier() { // from class: aggy
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m325.j(new dtsc() { // from class: agha
        });
        this.f = new agkh(m325.a());
        dtsb m326 = dtsd.m();
        m326.m(2);
        m326.l(true);
        m326.g(true);
        m326.d(true);
        m326.b("conversation_pin._id");
        m326.i(-1);
        m326.c(new Supplier() { // from class: aghb
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m326.j(new dtsc() { // from class: aghc
        });
        m326.a();
        dtsb m327 = dtsd.m();
        m327.m(2);
        m327.l(true);
        m327.d(true);
        m327.e(true);
        m327.h(new Supplier() { // from class: aghd
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsom.c.a;
            }
        });
        m327.b("conversation_pin.conversation_id");
        m327.f(true);
        m327.i(-1);
        m327.c(new Supplier() { // from class: aghe
            @Override // java.util.function.Supplier
            public final Object get() {
                return agkp.b();
            }
        });
        m327.j(new dtsc() { // from class: aghf
        });
        m327.a();
    }
}
