package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddtv implements ddtl {
    public final ctyz a;
    public final ffbr b;
    public final akvg c;
    public final adtc d;
    public final Context e;

    public ddtv(ctyz ctyzVar, ffbr ffbrVar, akvg akvgVar, adtc adtcVar, Context context) {
        this.a = ctyzVar;
        this.b = ffbrVar;
        this.c = akvgVar;
        this.d = adtcVar;
        this.e = context;
    }

    @Override // defpackage.ddtl
    public final int a() {
        if (TextUtils.isEmpty((CharSequence) cful.z.e())) {
            return !TextUtils.isEmpty((CharSequence) cful.A.e()) ? 2 : 0;
        }
        return 1;
    }

    @Override // defpackage.ddtl
    public final AlertDialog.Builder b(Context context, final Runnable runnable) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.zero_state_search_rich_cards_opt_in_dialog, (ViewGroup) null, false);
        TextView textView = (TextView) inflate.findViewById(R.id.zero_state_search_rich_cards_opt_in_dialog_text);
        textView.setText(h());
        egyl.b(textView);
        egyl.c(textView);
        final int a = a() + 2;
        return new AlertDialog.Builder(context, R.style.RichCardConsentDialog).setView(inflate).setNegativeButton(R.string.zero_state_search_rich_cards_opt_in_banner_cancel_button_text, new DialogInterface.OnClickListener() { // from class: ddtm
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                ddtv ddtvVar = ddtv.this;
                ((ddpm) ddtvVar.b.b()).c(a);
                ddtvVar.i();
            }
        }).setPositiveButton(R.string.zero_state_search_rich_cards_opt_in_banner_opt_in_button_text, new DialogInterface.OnClickListener() { // from class: ddtn
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                ddtv ddtvVar = ddtv.this;
                ((ddpm) ddtvVar.b.b()).d(a);
                ddtvVar.j();
                runnable.run();
            }
        });
    }

    @Override // defpackage.ddtl
    public final ddtj c(ViewGroup viewGroup) {
        return new ddtr(this, viewGroup);
    }

    @Override // defpackage.ddtl
    public final ddtj d(ViewGroup viewGroup) {
        return new ddtu(this, viewGroup);
    }

    @Override // defpackage.ddtl
    public final boolean e() {
        ctyz ctyzVar = this.a;
        return (ctyzVar.a.q(ctyzVar.b.getString(R.string.rich_cards_opt_in_banner_dismissed), false) || this.a.g()) ? false : true;
    }

    @Override // defpackage.ddtl
    public final boolean f() {
        ctyz ctyzVar = this.a;
        return (ctyzVar.a.q(ctyzVar.b.getString(R.string.rich_cards_opt_in_dialog_dismissed_pref_key), false) || this.a.g()) ? false : true;
    }

    @Override // defpackage.ddtl
    public final boolean g() {
        ctyz ctyzVar = this.a;
        return (ctyzVar.a.q(ctyzVar.b.getString(R.string.reminder_rich_cards_opt_in_banner_dismissed), false) || this.a.g()) ? false : true;
    }

    public final CharSequence h() {
        String a = crmi.a(this.e);
        return ddyi.e(this.e, this.e.getString(R.string.zero_state_search_rich_cards_opt_in_banner_text, a), a, new View.OnClickListener() { // from class: ddto
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ddtv ddtvVar = ddtv.this;
                ((ddpm) ddtvVar.b.b()).a("Search.ConsentDialog.LearnMore.Link.Clicked", ddtvVar.a());
                if (!TextUtils.isEmpty((CharSequence) cful.z.e())) {
                    ddtvVar.c.y(ddtvVar.e, (String) cful.z.e());
                } else {
                    if (TextUtils.isEmpty((CharSequence) cful.A.e())) {
                        return;
                    }
                    ddtvVar.d.e(ddtvVar.e, (String) cful.A.e());
                }
            }
        });
    }

    public final void i() {
        ctyz ctyzVar = this.a;
        ctyzVar.a.g(ctyzVar.b.getString(R.string.rich_cards_opt_in_dialog_dismissed_pref_key), true);
        ctyz ctyzVar2 = this.a;
        ctyzVar2.a.g(ctyzVar2.b.getString(R.string.rich_cards_opt_in_banner_dismissed), true);
    }

    public final void j() {
        i();
        ctyz ctyzVar = this.a;
        ctyzVar.a.g(ctyzVar.b.getString(R.string.rich_cards_settings_enable_all_pref_key), true);
        ctyzVar.c();
    }
}
