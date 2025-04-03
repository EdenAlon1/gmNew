package defpackage;

import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lfq {
    public final lfo a;
    private final TextView b;

    public lfq(TextView textView) {
        this.b = textView;
        this.a = new lfo(textView);
    }

    public final void a() {
        TransformationMethod transformationMethod = this.b.getTransformationMethod();
        if (transformationMethod == null || (transformationMethod instanceof PasswordTransformationMethod)) {
            return;
        }
        TextView textView = this.b;
        if (!(transformationMethod instanceof lfu)) {
            transformationMethod = new lfu(transformationMethod);
        }
        textView.setTransformationMethod(transformationMethod);
    }
}
