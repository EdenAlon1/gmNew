package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import com.google.chat.smartmessaging.penpal.ui.Segment;

/* compiled from: PG */
/* loaded from: classes5.dex */
final /* synthetic */ class emfb extends ffkh implements ffix {
    public emfb(Object obj) {
        super(0, obj, emge.class, "onSelectEmote", "onSelectEmote()V", 0);
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        emge emgeVar = (emge) this.g;
        ((enrr) emgeVar.e.h().h("com/google/chat/smartmessaging/penpal/ui/EmotifyViewModel", "onSelectEmote", 287, "EmotifyViewModel.kt")).q("ViewModel  onClipSticker called");
        emgeVar.f.f(emfz.c);
        if (!emgeVar.q) {
            Bitmap bitmap = ((Segment) emgeVar.p.get(emgeVar.o)).e;
            bitmap.getClass();
            Bitmap createBitmap = Bitmap.createBitmap(512, 512, Bitmap.Config.ARGB_8888);
            createBitmap.getClass();
            Canvas canvas = new Canvas(createBitmap);
            canvas.drawARGB(0, 0, 0, 0);
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            float max = Math.max(width, height);
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
            float f = 512.0f / max;
            canvas.drawBitmap(Bitmap.createScaledBitmap(bitmap, (int) (width * f), (int) (height * f), true), (512 - r5) / 2.0f, (512 - r6) / 2.0f, paint);
            emgeVar.q = true;
            Object b = emgeVar.b.b();
            b.getClass();
            ffqy.d((ffsk) b, null, null, new emgb(emgeVar, createBitmap, null), 3);
        }
        return ffcu.a;
    }
}
