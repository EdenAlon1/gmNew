package defpackage;

import android.content.Context;
import android.widget.photopicker.EmbeddedPhotoPickerProvider;
import android.widget.photopicker.EmbeddedPhotoPickerProviderFactory;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpzt {
    public static final enru a = enru.c("com/google/android/libraries/compose/cameragallery/ui/gallery/GalleryUiAdapter");
    public final dqgj b;
    public final dozh c;
    public final Executor d;
    public final ffsk e;
    public final boolean f;
    public final ffbz g;
    public final ffbz h;
    public final ffbz i;
    public final ffbz j;

    public dpzt(final Context context, final dpfu dpfuVar, dqgj dqgjVar, dozh dozhVar, Executor executor, ffsk ffskVar, boolean z) {
        context.getClass();
        dozhVar.getClass();
        executor.getClass();
        this.b = dqgjVar;
        this.c = dozhVar;
        this.d = executor;
        this.e = ffskVar;
        this.f = z;
        this.g = ffca.a(new ffix() { // from class: dpzf
            @Override // defpackage.ffix
            public final Object invoke() {
                return dpfu.this.a(null);
            }
        });
        this.h = ffca.a(new ffix() { // from class: dpzg
            @Override // defpackage.ffix
            public final Object invoke() {
                ojd ojdVar = new ojd(20, 0, false, 0, 0, 0, 62);
                final dpzt dpztVar = dpzt.this;
                return odg.a(new ojc(ojdVar, new ffix() { // from class: dpze
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        dpfz dpfzVar = (dpfz) dpzt.this.g.a();
                        dpfzVar.getClass();
                        return new dpge(dpfzVar);
                    }
                }).a, dpztVar.e);
            }
        });
        this.i = ffca.a(new ffix() { // from class: dpzh
            @Override // defpackage.ffix
            public final Object invoke() {
                EmbeddedPhotoPickerProvider create;
                create = EmbeddedPhotoPickerProviderFactory.create(context);
                return create;
            }
        });
        this.j = ffca.a(new ffix() { // from class: dpzi
            @Override // defpackage.ffix
            public final Object invoke() {
                return new dqgf(false, false, 15);
            }
        });
    }

    public final void a(List list, ffjm ffjmVar) {
        ffqy.d(this.e, null, null, new dpzs(list, this, ffjmVar, null), 3);
    }
}
