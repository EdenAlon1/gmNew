package defpackage;

import android.text.SpannableStringBuilder;
import android.text.style.UnderlineSpan;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.label.data.classification.SuperSortLabel;
import com.google.android.apps.messaging.label.ui.recategorize.ChangeCategoryView;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahko {
    public static final cfva a = cfvl.i(cfvl.b, "super_sort_change_category_log_impressions", true);
    public static final engf b = engf.c(SuperSortLabel.TRANSACTION, Integer.valueOf(R.id.transactions_chip), SuperSortLabel.PROMOTION, Integer.valueOf(R.id.offers_chip), SuperSortLabel.UPDATE, Integer.valueOf(R.id.updates_chip), SuperSortLabel.OTP, Integer.valueOf(R.id.otp_chip));
    private static final enhk m = enhk.o(SuperSortLabel.TRANSACTION, Integer.valueOf(R.string.conversation_label_transaction), SuperSortLabel.PROMOTION, Integer.valueOf(R.string.conversation_label_promotion), SuperSortLabel.UPDATE, Integer.valueOf(R.string.conversation_label_update), SuperSortLabel.OTP, Integer.valueOf(R.string.conversation_label_otp_singular));
    public final eg c;
    public final ChangeCategoryView d;
    public final ffbr e;
    public final ffbr f;
    public final aewt g;
    public final fazb h;
    public final elbx i;
    public boolean j = false;
    public cynb k;
    public bcse l;
    private final ffbr n;

    public ahko(eg egVar, ChangeCategoryView changeCategoryView, ffbr ffbrVar, ffbr ffbrVar2, aewt aewtVar, fazb fazbVar, ffbr ffbrVar3, elbx elbxVar) {
        this.c = egVar;
        this.d = changeCategoryView;
        this.e = ffbrVar;
        this.f = ffbrVar2;
        this.g = aewtVar;
        this.h = fazbVar;
        this.n = ffbrVar3;
        this.i = elbxVar;
    }

    public final SuperSortLabel a() {
        bcse bcseVar = this.l;
        bcseVar.getClass();
        return bcseVar.t;
    }

    public final ConversationIdType b() {
        bcse bcseVar = this.l;
        bcseVar.getClass();
        return bcseVar.t();
    }

    public final MessageIdType c() {
        bcse bcseVar = this.l;
        bcseVar.getClass();
        return bcseVar.u();
    }

    public final void d() {
        final TextView textView = (TextView) this.d.findViewById(R.id.change_category_label);
        enhk enhkVar = m;
        bcse bcseVar = this.l;
        bcseVar.getClass();
        Integer num = (Integer) enhkVar.get(bcseVar.t);
        num.getClass();
        textView.setText(num.intValue());
        ((Optional) this.n.b()).ifPresent(new Consumer() { // from class: ahki
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                cfva cfvaVar = ahko.a;
                ((cyne) obj).a(textView, R.dimen.message_metadata_text_size);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    public final void e() {
        final TextView textView = (TextView) this.d.findViewById(R.id.change_category_text);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(textView.getContext().getText(R.string.change_category));
        spannableStringBuilder.setSpan(new UnderlineSpan(), 0, spannableStringBuilder.length(), 17);
        textView.setText(spannableStringBuilder);
        ((Optional) this.n.b()).ifPresent(new Consumer() { // from class: ahkf
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                cfva cfvaVar = ahko.a;
                ((cyne) obj).a(textView, R.dimen.message_metadata_text_size);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    public final void f(ImageView imageView) {
        int i;
        int i2;
        SuperSortLabel superSortLabel = SuperSortLabel.UNKNOWN;
        int ordinal = a().ordinal();
        if (ordinal == 2) {
            i = R.string.transaction_content_description;
            i2 = R.drawable.quantum_gm_ic_credit_card_black_24;
        } else if (ordinal == 3) {
            i = R.string.promotion_content_description;
            i2 = R.drawable.quantum_gm_ic_local_offer_black_24;
        } else if (ordinal == 4) {
            i = R.string.update_content_description;
            i2 = R.drawable.quantum_gm_ic_flag_black_24;
        } else {
            if (ordinal != 5) {
                throw new IllegalArgumentException("No known drawable for label ".concat(String.valueOf(String.valueOf(a()))));
            }
            i = R.string.message_metadata_otp_icon_content_description;
            i2 = R.drawable.quantum_gm_ic_vpn_key_black_24;
        }
        imageView.setImageResource(i2);
        imageView.setContentDescription(imageView.getContext().getString(i));
    }
}
