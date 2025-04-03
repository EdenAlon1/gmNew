package defpackage;

import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsie {
    public static final dsid a(ffbz ffbzVar) {
        return (dsid) ffbzVar.a();
    }

    public static final void b(TextView textView, Integer num) {
        if (num != null) {
            textView.setInputType(num.intValue() | textView.getInputType());
        }
    }
}
