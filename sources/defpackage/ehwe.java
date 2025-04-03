package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.play.core.inappreview.protocol.IInAppReviewService;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehwe {
    public static final ehvt a = new ehvt("ReviewService");
    public ehwr b;
    public final String c;

    public ehwe(Context context) {
        this.c = context.getPackageName();
        if (ehwv.a(context)) {
            this.b = new ehwr(context, a, "com.google.android.finsky.inappreviewservice.InAppReviewService", new Intent("com.google.android.finsky.BIND_IN_APP_REVIEW_SERVICE").setPackage("com.android.vending"), new ehwn() { // from class: ehwa
                @Override // defpackage.ehwn
                public final Object a(IBinder iBinder) {
                    return IInAppReviewService.Stub.asInterface(iBinder);
                }
            });
        }
    }
}
