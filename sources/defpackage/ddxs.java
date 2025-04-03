package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddxs implements ddxv {
    public static final cskc a = cskc.g("Bugle", "DialogUtils");
    public final fazb b;
    public final dcxt c;
    public final akzt d;
    public final cpbs e;
    public final ffbr f;
    public final ddzb g;
    public final ffbr h;
    public final elbx i;

    public ddxs(ffbr ffbrVar, fazb fazbVar, dcxt dcxtVar, akzt akztVar, cpbs cpbsVar, ffbr ffbrVar2, ddzb ddzbVar, elbx elbxVar) {
        this.h = ffbrVar;
        this.b = fazbVar;
        this.c = dcxtVar;
        this.d = akztVar;
        this.e = cpbsVar;
        this.f = ffbrVar2;
        this.g = ddzbVar;
        this.i = elbxVar;
    }

    public static void b(final Activity activity, String str, String str2, boolean z) {
        ehft ehftVar = new ehft(activity);
        ehftVar.n(activity.getResources().getString(true != z ? R.string.message_status_download_failed_sim_has_no_data_popup : R.string.cant_send_mms_sim_has_no_data, str, str2));
        ehftVar.t(R.string.settings_activity_title, new DialogInterface.OnClickListener() { // from class: ddxj
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                activity.startActivityForResult(new Intent("android.settings.SETTINGS"), 0);
            }
        });
        ehftVar.create().show();
    }

    public static void c(Activity activity, DialogInterface.OnClickListener onClickListener) {
        ehft ehftVar = new ehft(activity);
        ehftVar.n(activity.getResources().getString(R.string.unsupported_file_save_alert));
        ehftVar.t(R.string.save_attachment, onClickListener);
        ehftVar.o(R.string.unsupported_file_save_cancel, new DialogInterface.OnClickListener() { // from class: ddxq
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
            }
        });
        ehftVar.create().show();
    }

    @Override // defpackage.ddxv
    public final void a(Activity activity, final Uri uri, final String str, final Uri uri2, final String str2) {
        c(activity, new DialogInterface.OnClickListener() { // from class: ddxc
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                ((akvg) ddxs.this.f.b()).P(uri, str, uri2, str2);
            }
        });
    }

    public final void d(final Context context, final bcse bcseVar) {
        String string;
        byzi A = bcseVar.A();
        String W = bcseVar.W();
        W.getClass();
        View inflate = LayoutInflater.from(context).inflate(R.layout.informational_alert_dialog_title_layout, (ViewGroup) null);
        inflate.findViewById(R.id.title_image).setVisibility(8);
        String a2 = crmi.a(context);
        TextView textView = (TextView) inflate.findViewById(R.id.title_text);
        byzi byziVar = byzi.VERIFICATION_NA;
        int ordinal = A.ordinal();
        int i = 0;
        textView.setText(ordinal != 2 ? ordinal != 3 ? 0 : R.string.vsms_dialog_title_verifying : !((Boolean) cuye.b.e()).booleanValue() ? R.string.vsms_dialog_title_unverified : R.string.vsms_new_dialog_title_unverified);
        if (((Boolean) cuye.b.e()).booleanValue()) {
            int ordinal2 = A.ordinal();
            if (ordinal2 == 2) {
                string = context.getString(R.string.vsms_dialog_message_spam, context.getString(R.string.vsms_new_dialog_message_unverified, W), a2);
            } else {
                if (ordinal2 != 3) {
                    throw new IllegalArgumentException("Not valid verification status: ".concat(String.valueOf(String.valueOf(A))));
                }
                string = context.getString(R.string.vsms_new_dialog_message_verifying, W, a2);
            }
        } else {
            int ordinal3 = A.ordinal();
            string = context.getString(R.string.vsms_dialog_message_spam, context.getString(ordinal3 != 2 ? ordinal3 != 3 ? 0 : R.string.vsms_dialog_message_verifying : R.string.vsms_dialog_message_unverified), a2);
        }
        SpannableStringBuilder e = ddyi.e(context, string, a2, new View.OnClickListener() { // from class: ddxk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ((adtc) ddxs.this.h.b()).e(context, (String) cful.ac.e());
            }
        });
        if (((Boolean) cuye.b.e()).booleanValue()) {
            while (true) {
                int indexOf = string.indexOf(W, i);
                if (indexOf == -1) {
                    break;
                }
                e.setSpan(new StyleSpan(1), indexOf, W.length() + indexOf, 17);
                i = indexOf + 1;
            }
        }
        TextView textView2 = (TextView) inflate.findViewById(R.id.content_text);
        textView2.setText(e);
        textView2.setContentDescription(e.toString());
        egyl.b(textView2);
        egyl.c(textView2);
        ehft ehftVar = new ehft(context);
        ScrollView scrollView = new ScrollView(context);
        scrollView.addView(inflate);
        ehftVar.z(scrollView);
        ehftVar.t(R.string.rbm_verification_dialog_close_button_text_m2, new DialogInterface.OnClickListener() { // from class: ddxl
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                bcse.this.r = true;
            }
        });
        if (A == byzi.VERIFICATION_UNVERIFIED || !((Boolean) cuye.b.e()).booleanValue()) {
            ehftVar.o(R.string.spam_banner_positive_button, new DialogInterface.OnClickListener() { // from class: ddxm
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    ddxs.this.g.k(R.string.report_spam_toast_title);
                }
            });
        }
        ehftVar.create().show();
    }
}
