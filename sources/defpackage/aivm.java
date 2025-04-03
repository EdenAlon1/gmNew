package defpackage;

import android.text.SpannableStringBuilder;
import android.text.style.UnderlineSpan;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.otp.deletion.save.SaveOtpView;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aivm {
    public final eg a;
    public final SaveOtpView b;
    public final ffbr c;
    public final fazb d;
    public final elbx e;
    public final aexa f;
    public cynb g;
    public bcse h;
    private final ffbr i;

    public aivm(ffbr ffbrVar, SaveOtpView saveOtpView, ffbr ffbrVar2, fazb fazbVar, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5) {
        this.a = (eg) ffbrVar.b();
        this.b = saveOtpView;
        this.c = ffbrVar2;
        this.d = fazbVar;
        this.i = ffbrVar3;
        this.e = (elbx) ffbrVar4.b();
        this.f = (aexa) ffbrVar5.b();
    }

    public final ConversationIdType a() {
        bcse bcseVar = this.h;
        bcseVar.getClass();
        return bcseVar.t();
    }

    public final String b() {
        bcse bcseVar = this.h;
        bcseVar.getClass();
        return bcseVar.u().b();
    }

    public final void c() {
        final TextView textView = (TextView) this.b.findViewById(R.id.save_otp_icon_label);
        ((Optional) this.i.b()).ifPresent(new Consumer() { // from class: aivi
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((cyne) obj).a(textView, R.dimen.message_metadata_text_size);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        final TextView textView2 = (TextView) this.b.findViewById(R.id.save_otp_text);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(textView2.getContext().getText(R.string.save_otp_label));
        spannableStringBuilder.setSpan(new UnderlineSpan(), 0, spannableStringBuilder.length(), 17);
        textView2.setText(spannableStringBuilder);
        ((Optional) this.i.b()).ifPresent(new Consumer() { // from class: aivj
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((cyne) obj).a(textView2, R.dimen.message_metadata_text_size);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }
}
