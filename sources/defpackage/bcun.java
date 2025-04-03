package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bcun {
    public static final cskc a = cskc.g("Bugle", "ConversationSettingsItemData");
    public String b;
    public String c;
    public Uri d;
    public boolean e;
    public boolean f;
    public boolean g;
    public bcul h;
    public boolean i;
    public ParticipantsTable.BindData j;
    public byyt k;
    public Optional l;
    public Optional m;
    private ParticipantsTable.BindData n;
    private final cthz o;
    private final cpbs p;
    private final crqw q;
    private final Context r;
    private final bzqa s;

    public bcun(cthz cthzVar, cpbs cpbsVar, crqw crqwVar, bzqa bzqaVar, Context context) {
        this.o = cthzVar;
        this.p = cpbsVar;
        this.q = crqwVar;
        this.r = context;
        this.s = bzqaVar;
    }

    public final ParticipantsTable.BindData a() {
        ParticipantsTable.BindData bindData = this.j;
        return bindData != null ? bindData : this.n;
    }

    public final void b(bcum bcumVar, bcul bculVar) {
        this.c = null;
        this.d = null;
        this.e = true;
        this.g = true;
        this.i = true;
        this.h = bculVar;
        this.j = bcumVar.a().a();
        this.n = bcumVar.d();
        this.k = bcumVar.e();
        boolean j = bcumVar.j();
        bseh b = bcumVar.b();
        boolean ap = b.ap();
        boolean aq = b.aq();
        switch (bculVar.ordinal()) {
            case 0:
                this.b = this.r.getString(R.string.notifications_enabled_conversation_pref_title);
                this.f = ap;
                break;
            case 1:
                this.b = this.r.getString(R.string.notification_sound_pref_title);
                Uri a2 = this.o.a(b.Y());
                this.c = this.r.getString(R.string.silent_ringtone);
                Optional i = bcumVar.i();
                if (i.isPresent()) {
                    this.c = (String) i.get();
                }
                this.e = false;
                this.d = a2;
                this.g = ap;
                break;
            case 2:
                this.b = this.r.getString(R.string.notification_vibrate_pref_title);
                this.f = aq;
                this.g = ap;
                break;
            case 3:
                this.b = this.r.getString(R.string.notifications_enabled_conversation_pref_title);
                this.e = false;
                break;
            case 4:
                this.b = this.r.getString(R.string.app_settings_conversation_pref_title);
                this.e = false;
                break;
            case 5:
                this.b = this.r.getString(R.string.xms_send_mode_pref_title_v2);
                this.f = b.r() == 1;
                break;
            case 6:
                this.e = false;
                this.i = this.s.p() && j;
                this.b = this.r.getString(R.string.security_key_top_level_title);
                break;
            case 7:
                csix.l(this.j);
                this.b = this.r.getString(true != this.j.Y() ? R.string.block_contact_title : R.string.unblock_contact_title);
                this.e = false;
                ParticipantsTable.BindData bindData = this.j;
                this.i = (bindData == null || this.p.d(bindData.U()) || !this.q.c()) ? false : true;
                break;
            case 8:
                this.b = this.r.getString(R.string.info_and_options_view_privacy_policy);
                this.e = false;
                break;
            case 9:
                this.b = this.r.getString(R.string.info_and_options_view_terms_of_service);
                this.e = false;
                break;
            case 10:
                this.b = crmi.a(this.r);
                this.e = false;
                break;
            case 11:
                ParticipantsTable.BindData a3 = a();
                byyt byytVar = this.k;
                if (a3 != null) {
                    this.b = this.r.getString(byytVar == byyt.SPAM_FOLDER ? R.string.unreport_contact_title : R.string.report_contact_title);
                    this.e = false;
                    this.i = !this.p.d(a3.U());
                    break;
                } else {
                    this.i = false;
                    break;
                }
            case 12:
                this.b = this.r.getString(R.string.sim_switcher_overline);
                if (bcumVar.f().isPresent()) {
                    this.c = ((aqux) bcumVar.f().get()).o();
                }
                this.e = false;
                this.l = bcumVar.g();
                this.m = bcumVar.f();
                break;
        }
    }
}
