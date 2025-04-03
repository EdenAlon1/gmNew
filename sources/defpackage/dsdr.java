package defpackage;

import android.graphics.PointF;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
final /* synthetic */ class dsdr extends ffkh implements ffjn {
    public dsdr(Object obj) {
        super(3, obj, dsed.class, "onMediaLongClicked", "onMediaLongClicked(Lcom/google/android/libraries/compose/gifsticker/data/GifStickerMedia;Landroid/view/View;Landroid/graphics/PointF;)Z", 0);
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        View view = (View) obj2;
        view.getClass();
        return Boolean.valueOf(((dsed) this.g).bh((dsci) obj, view, (PointF) obj3));
    }
}
