package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czfo extends czgu {
    public cpbw ag;
    public cqoh ah;
    public adtc ai;
    public ffbr aj;

    @Override // defpackage.dn
    public final Dialog hf(Bundle bundle) {
        Bundle bundle2 = this.m;
        csix.l(bundle2);
        final int i = bundle2 != null ? bundle2.getInt("subId", -9999) : -9999;
        csix.f(i == -9999);
        eg G = G();
        View inflate = LayoutInflater.from(G).inflate(R.layout.confirm_sms_7bit_encoding_dialog_view, (ViewGroup) null, false);
        TextView textView = (TextView) inflate.findViewById(R.id.confirm_text);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) Y(R.string.confirm_sms_7bit_encoding_dialog_text));
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) crmi.a(z()));
        spannableStringBuilder.setSpan(new czfm(this), length, spannableStringBuilder.length(), 33);
        textView.setText(spannableStringBuilder);
        egyl.b(textView);
        egyl.c(textView);
        final CheckBox checkBox = (CheckBox) inflate.findViewById(R.id.remember_check);
        ehft ehftVar = new ehft(G);
        ehftVar.x(R.string.confirm_sms_7bit_encoding_dialog_title);
        ehftVar.z(inflate);
        ehftVar.o(android.R.string.cancel, new DialogInterface.OnClickListener() { // from class: czfk
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                czfo.this.hw();
            }
        });
        ehftVar.t(R.string.confirm_sms_7bit_encoding_dialog_positive, new elbb((elbx) this.aj.b(), "ConfirmSms7bitEncodingDialog#onCreateDialog", new DialogInterface.OnClickListener() { // from class: czfl
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                czfn czfnVar;
                czfo czfoVar = czfo.this;
                if (checkBox.isChecked()) {
                    int i3 = i;
                    cpbw cpbwVar = czfoVar.ag;
                    cpbwVar.f.a(i3).h(cpbwVar.c.getResources().getString(R.string.sms_7bit_confirmed_pref_key), true);
                }
                czfoVar.hw();
                long epochMilli = czfoVar.ah.f().toEpochMilli();
                long a = czfoVar.ah.a();
                Object[] objArr = {czfoVar.E(), czfoVar.G()};
                for (int i4 = 0; i4 < 2; i4++) {
                    Object obj = objArr[i4];
                    if (obj instanceof czfn) {
                        czfnVar = (czfn) obj;
                    } else {
                        if (obj instanceof ekhu) {
                            ekhu ekhuVar = (ekhu) obj;
                            if (ekhuVar.H() instanceof czfn) {
                                czfnVar = (czfn) ekhuVar.H();
                            }
                        }
                    }
                    czfnVar.ax(epochMilli, a);
                    return;
                }
                throw new RuntimeException("Host activity or fragment does not implement ConfirmSms7bitEncodingDialogHost");
            }
        }));
        return ehftVar.create();
    }
}
