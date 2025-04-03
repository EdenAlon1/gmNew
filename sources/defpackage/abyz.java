package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class abyz implements ellh {
    final /* synthetic */ abyy a;

    public abyz(abyy abyyVar) {
        this.a = abyyVar;
    }

    @Override // defpackage.ellh
    public final /* bridge */ /* synthetic */ elli a(ellf ellfVar) {
        final abyy abyyVar = this.a;
        final abzo abzoVar = (abzo) ellfVar;
        View inflate = LayoutInflater.from((Context) abyyVar.c.b()).inflate(R.layout.dialog_text_edit, (ViewGroup) null, false);
        ((TextView) inflate.findViewById(R.id.message_editor)).setText(abzoVar.c().c(abzoVar.a()));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(((abyq) abyyVar.b.b()).B().getText(R.string.donation_edit_dialog_body_text));
        spannableStringBuilder.setSpan(new AbsoluteSizeSpan(((abyq) abyyVar.b.b()).B().getDimensionPixelSize(R.dimen.body_text_size)), 0, spannableStringBuilder.length(), 17);
        ehft ehftVar = new ehft((Context) abyyVar.c.b());
        ehftVar.n(spannableStringBuilder);
        ehftVar.z(inflate);
        ehftVar.t(R.string.donation_edit_dialog_positive_button_label, new elbb((elbx) abyyVar.l.b(), "DataDonationFragmentPeer#getEditTextPositiveButton", new DialogInterface.OnClickListener() { // from class: abyt
            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                boolean z;
                TextView textView = (TextView) ((iv) dialogInterface).findViewById(R.id.message_editor);
                textView.getClass();
                CharSequence text = textView.getText();
                emxf.l(text instanceof Spanned);
                abzm abzmVar = abyy.this.p;
                abzmVar.getClass();
                Spanned spanned = (Spanned) text;
                abzo abzoVar2 = abzoVar;
                int b = abzoVar2.b();
                int a = abzoVar2.a();
                if (TextUtils.isEmpty(spanned)) {
                    z = false;
                } else {
                    abzw abzwVar = (abzw) ((abzx) abzmVar.a.get(b)).c.get(a);
                    z = true;
                    emxf.a(!TextUtils.isEmpty(spanned));
                    Optional b2 = acah.b(abzwVar.b, spanned);
                    if (!b2.isEmpty()) {
                        abzwVar.d = ((acae) b2.get()).b;
                        abzwVar.c = ((acae) b2.get()).a;
                    }
                }
                abzmVar.H(z, b, a);
            }
        }));
        ehftVar.o(android.R.string.cancel, null);
        final iv create = ehftVar.create();
        create.setOnShowListener(new DialogInterface.OnShowListener() { // from class: abys
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                TextView textView = (TextView) create.findViewById(android.R.id.message);
                textView.getClass();
                textView.setPadding(textView.getPaddingLeft(), ((abyq) abyy.this.b.b()).B().getDimensionPixelOffset(R.dimen.dialog_message_top_padding), textView.getPaddingRight(), textView.getPaddingBottom());
            }
        });
        create.show();
        return elli.a;
    }
}
