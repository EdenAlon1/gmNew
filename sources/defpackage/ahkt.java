package defpackage;

import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.label.data.classification.SuperSortLabel;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahkt {
    private static final engf a = engf.c(SuperSortLabel.TRANSACTION, Integer.valueOf(R.string.conversation_label_transactions), SuperSortLabel.PROMOTION, Integer.valueOf(R.string.conversation_label_promotions), SuperSortLabel.UPDATE, Integer.valueOf(R.string.conversation_label_updates), SuperSortLabel.OTP, Integer.valueOf(R.string.conversation_label_otp));

    public static int a(SuperSortLabel superSortLabel) {
        engf engfVar = a;
        emxf.l(engfVar.containsKey(superSortLabel));
        Integer num = (Integer) engfVar.get(superSortLabel);
        num.getClass();
        return num.intValue();
    }
}
