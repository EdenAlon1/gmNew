package defpackage;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ru {
    public TextClassifier a;
    private final TextView b;

    public ru(TextView textView) {
        this.b = textView;
    }

    public final TextClassifier a() {
        TextClassifier textClassifier;
        TextClassifier textClassifier2;
        TextClassifier textClassifier3 = this.a;
        if (textClassifier3 != null) {
            return textClassifier3;
        }
        TextClassificationManager m415m = iy$$ExternalSyntheticApiModelOutline1.m415m(this.b.getContext().getSystemService(ni$$ExternalSyntheticApiModelOutline0.m494m()));
        if (m415m != null) {
            textClassifier2 = m415m.getTextClassifier();
            return textClassifier2;
        }
        textClassifier = TextClassifier.NO_OP;
        return textClassifier;
    }
}
