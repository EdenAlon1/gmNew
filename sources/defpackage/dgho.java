package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Picture;
import android.os.Build;
import android.util.Log;
import android.view.View;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.feedback.FeedbackOptions;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dgho extends dfra {
    public dgho(Context context) {
        super(context, dghl.c, dfqp.q, dfqz.a);
        dihh.b(context.getApplicationContext());
    }

    public static Bitmap a(Activity activity) {
        try {
            return b(activity.getWindow().getDecorView().getRootView());
        } catch (Exception e) {
            Log.w("gF_FeedbackClient", "Get screenshot failed!", e);
            return null;
        }
    }

    public static Bitmap b(View view) {
        Bitmap createBitmap;
        try {
            if (Build.VERSION.SDK_INT < 28) {
                Bitmap createBitmap2 = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.RGB_565);
                view.draw(new Canvas(createBitmap2));
                return createBitmap2;
            }
            Picture picture = new Picture();
            Canvas beginRecording = picture.beginRecording(view.getWidth(), view.getHeight());
            beginRecording.drawRect(0.0f, 0.0f, view.getWidth(), view.getHeight(), new Paint());
            view.draw(beginRecording);
            picture.endRecording();
            createBitmap = Bitmap.createBitmap(picture, view.getWidth(), view.getHeight(), Bitmap.Config.RGB_565);
            return createBitmap;
        } catch (Error | Exception e) {
            Log.w("gF_FeedbackClient", "Get screenshot failed!", e);
            return null;
        }
    }

    public static boolean d(FeedbackOptions feedbackOptions) {
        String str = feedbackOptions.e;
        if (str != null) {
            return str.startsWith("com.google.android.apps.maps") || str.startsWith("com.google.android.apps.gmm");
        }
        return false;
    }

    public final dhre c(final FeedbackOptions feedbackOptions) {
        if (d(feedbackOptions)) {
            final long nanoTime = System.nanoTime();
            dfun dfunVar = new dfun();
            dfunVar.a = new dfuf() { // from class: dghn
                @Override // defpackage.dfuf
                public final void a(Object obj, Object obj2) {
                    dghy dghyVar = (dghy) obj;
                    FeedbackOptions feedbackOptions2 = FeedbackOptions.this;
                    dghd dghdVar = feedbackOptions2.t;
                    long j = nanoTime;
                    if (dghdVar != null) {
                        dgib.e(dghyVar.c, dghdVar, j);
                    }
                    dghyVar.N(feedbackOptions2, j);
                }
            };
            dfunVar.c = 6005;
            return l(dfunVar.a());
        }
        dfre dfreVar = this.k;
        Context context = ((dfte) dfreVar).a.c;
        Status status = dghl.a;
        dghh dghhVar = new dghh(dfreVar, feedbackOptions, context, System.nanoTime());
        dfreVar.b(dghhVar);
        return dfwu.b(dghhVar);
    }
}
