package defpackage;

import android.graphics.PointF;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
final /* synthetic */ class drfx extends ffkh implements ffjn {
    public drfx(Object obj) {
        super(3, obj, drgb.class, "onMediaLongClicked", "onMediaLongClicked(Lcom/google/android/libraries/compose/gifsticker/data/GifStickerMedia;Landroid/view/View;Landroid/graphics/PointF;)Z", 0);
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        dren drenVar = (dren) obj;
        View view = (View) obj2;
        drenVar.getClass();
        view.getClass();
        return Boolean.valueOf(((drgb) this.g).bh(drenVar, view, (PointF) obj3));
    }
}
