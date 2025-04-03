package defpackage;

import android.view.View;
import com.google.android.apps.messaging.otp.deletion.save.SaveOtpView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aivq implements fbba {
    public static SaveOtpView a(View view) {
        if (!(view instanceof SaveOtpView)) {
            throw new IllegalStateException(a.I(view, aivm.class, "Attempt to inject a View wrapper of type "));
        }
        SaveOtpView saveOtpView = (SaveOtpView) view;
        saveOtpView.getClass();
        return saveOtpView;
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
