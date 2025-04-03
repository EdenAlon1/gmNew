package defpackage;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.view.PixelCopy;
import android.view.PixelCopy$OnPixelCopyFinishedListener;
import android.view.SurfaceView;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dsvp extends ffhv implements ffjm {
    final /* synthetic */ SurfaceView a;
    final /* synthetic */ dswa b;
    final /* synthetic */ hho c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsvp(SurfaceView surfaceView, dswa dswaVar, hho hhoVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = surfaceView;
        this.b = dswaVar;
        this.c = hhoVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dsvp) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        final hho hhoVar = this.c;
        final ffix ffixVar = new ffix() { // from class: dsvo
            @Override // defpackage.ffix
            public final Object invoke() {
                dsvs.f(hho.this, true);
                return ffcu.a;
            }
        };
        dswa dswaVar = this.b;
        SurfaceView surfaceView = this.a;
        int width = surfaceView.getWidth();
        int height = surfaceView.getHeight();
        if (dswaVar.b == null) {
            Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            createBitmap.getClass();
            dswaVar.b = createBitmap;
            dswaVar.a = true;
        } else {
            dswaVar.a().setWidth(width);
            dswaVar.a().setHeight(height);
        }
        PixelCopy.request(surfaceView, (Rect) null, dswaVar.a(), new PixelCopy$OnPixelCopyFinishedListener() { // from class: dsuz
            public final void onPixelCopyFinished(int i) {
                if (i == 0) {
                    ffix.this.invoke();
                }
            }
        }, surfaceView.getHandler());
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dsvp(this.a, this.b, this.c, ffguVar);
    }
}
