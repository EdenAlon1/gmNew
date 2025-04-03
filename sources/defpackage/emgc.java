package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import com.google.chat.smartmessaging.penpal.ui.Segment;
import com.google.chat.smartmessaging.penpal.ui.imagenative.ImageUtils;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.List;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class emgc extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ emge c;
    final /* synthetic */ Bitmap d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public emgc(emge emgeVar, Bitmap bitmap, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = emgeVar;
        this.d = bitmap;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((emgc) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object a;
        Object obj2;
        Object obj3;
        char c;
        Rect rect;
        ffhh ffhhVar = ffhh.a;
        char c2 = 1;
        if (this.b != 0) {
            obj2 = this.a;
            ffci.b(obj);
            a = obj;
        } else {
            ffci.b(obj);
            adak adakVar = this.c.x;
            if (adakVar != null) {
                adakVar.e = adakVar.a.f().toEpochMilli();
            }
            emge emgeVar = this.c;
            emgy emgyVar = (emgy) emgeVar.d.b();
            emge emgeVar2 = this.c;
            Bitmap bitmap = this.d;
            this.a = emgeVar;
            this.b = 1;
            a = emgyVar.a(emgeVar2.a, bitmap, this);
            if (a == ffhhVar) {
                return ffhhVar;
            }
            obj2 = emgeVar;
        }
        List list = (List) a;
        emge emgeVar3 = (emge) obj2;
        ((enrr) emgeVar3.e.h().h("com/google/chat/smartmessaging/penpal/ui/EmotifyViewModel", "onResults", 123, "EmotifyViewModel.kt")).t("onResult is called with result size: %d", list != null ? Integer.valueOf(list.size()) : null);
        emgeVar3.p.clear();
        if (list == null || list.isEmpty()) {
            obj3 = null;
            emgeVar3.a(emgv.a);
        } else {
            csli.a(emgeVar3.a, "exp");
            csli.b("magiceditjni");
            ImageUtils imageUtils = new ImageUtils();
            char c3 = 0;
            int i = ((emgx) list.get(0)).b;
            int i2 = ((emgx) list.get(0)).c;
            FloatBuffer floatBuffer = ((emgx) list.get(0)).a;
            floatBuffer.getClass();
            floatBuffer.rewind();
            ((enrr) emgeVar3.e.h().h("com/google/chat/smartmessaging/penpal/ui/EmotifyViewModel", "onResults", 142, "EmotifyViewModel.kt")).q("beginMaskConversionAndCreation");
            ArrayList arrayList = emgeVar3.p;
            Segment[] extractSegmentsJNI = imageUtils.extractSegmentsJNI(floatBuffer, i, i2, emgeVar3.l);
            extractSegmentsJNI.getClass();
            arrayList.addAll(ffdo.L(extractSegmentsJNI));
            Segment segment = (Segment) ffdx.M(emgeVar3.p);
            long j = i;
            long j2 = i2;
            if ((segment != null ? Integer.valueOf(segment.d) : null) != null) {
                if (r2.intValue() != j * j2) {
                    int size = emgeVar3.p.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj4 = emgeVar3.p.get(i3);
                        obj4.getClass();
                        Segment segment2 = (Segment) obj4;
                        int[] iArr = segment2.b;
                        if (iArr.length >= 3) {
                            c = c2;
                            rect = new Rect(iArr[c3], iArr[c2], iArr[2] + 1, iArr[3] + 1);
                        } else {
                            c = c2;
                            rect = null;
                        }
                        if (rect == null) {
                            throw new IllegalArgumentException("segment must have a valid visible coordinate Rect");
                        }
                        segment2.f = rect;
                        Object a2 = emgeVar3.m.a();
                        if (a2 == null) {
                            throw new IllegalArgumentException("_selectedImageState.value should remain non-null when segmentation result comes back.");
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(segment2.a, rect.width(), rect.height(), Bitmap.Config.ALPHA_8);
                        createBitmap.getClass();
                        ((enrr) emgt.a.h().h("com/google/chat/smartmessaging/penpal/ui/util/BitmapStickerUtils", "clipSticker", 55, "BitmapStickerUtils.kt")).q("clipSticker");
                        Bitmap createBitmap2 = Bitmap.createBitmap(rect.width(), rect.height(), Bitmap.Config.ARGB_8888);
                        createBitmap2.getClass();
                        Canvas canvas = new Canvas(createBitmap2);
                        Paint paint = new Paint();
                        canvas.drawBitmap(createBitmap, 0.0f, 0.0f, paint);
                        paint.setAlpha(PrivateKeyType.INVALID);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
                        int i4 = size;
                        canvas.drawBitmap((Bitmap) a2, rect, new Rect(0, 0, rect.width(), rect.height()), paint);
                        segment2.e = createBitmap2;
                        Color.parseColor("#DCB9AFE7");
                        emgs emgsVar = new emgs();
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList arrayList3 = new ArrayList();
                        if (createBitmap2.isRecycled()) {
                            throw new IllegalArgumentException("Bitmap is not valid");
                        }
                        arrayList3.add(omj.a);
                        arrayList2.add(omk.a);
                        arrayList2.add(omk.b);
                        arrayList2.add(omk.c);
                        arrayList2.add(omk.d);
                        arrayList2.add(omk.e);
                        arrayList2.add(omk.f);
                        arrayList3.add(emgsVar);
                        omg.a(createBitmap2, arrayList2, 16, arrayList3).a(omk.b);
                        i3++;
                        c2 = c;
                        size = i4;
                        c3 = 0;
                    }
                    obj3 = null;
                    ((enrr) emgeVar3.e.h().h("com/google/chat/smartmessaging/penpal/ui/EmotifyViewModel", "onResults", 180, "EmotifyViewModel.kt")).q("endMaskConversionAndCreation");
                    emgeVar3.i.f(new kaa((((Segment) emgeVar3.p.get(0)).c[c2] & 4294967295L) | (((Segment) emgeVar3.p.get(0)).c[0] << 32)));
                    emgeVar3.o = 0;
                    Rect rect2 = ((Segment) emgeVar3.p.get(0)).f;
                    ((emgy) emgeVar3.d.b()).b();
                    emgeVar3.f.f(emfz.b);
                    ((enrr) emgeVar3.e.h().h("com/google/chat/smartmessaging/penpal/ui/EmotifyViewModel", "onResults", 194, "EmotifyViewModel.kt")).q("ViewModel setting to HIGHLIGHT_SUGGESTIONS state");
                }
            }
            obj3 = null;
            emgeVar3.a(emgv.a);
        }
        adak adakVar2 = this.c.x;
        if (adakVar2 == null) {
            return obj3;
        }
        adakVar2.f = adakVar2.a.f().toEpochMilli();
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new emgc(this.c, this.d, ffguVar);
    }
}
