package defpackage;

import android.os.Trace;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class duui {
    static engw a(duqh duqhVar, engw engwVar, int i, duur duurVar, boolean z, boolean z2) {
        return b(duqhVar, engwVar, i, duurVar, z, z2, -1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static engw b(duqh duqhVar, engw engwVar, int i, duur duurVar, boolean z, boolean z2, int i2) {
        int i3;
        int i4 = engw.d;
        engr engrVar = new engr();
        duuw.a();
        int size = engwVar.size();
        int i5 = 0;
        for (int i6 = 0; i6 < size; i6++) {
            duvw duvwVar = (duvw) engwVar.get(i6);
            if (i2 != -1 && i5 >= i2) {
                break;
            }
            if (duvwVar.b() != 1) {
                duvwVar.b();
                if (duvwVar.b() == 4) {
                    i3 = i5 + 1;
                    engrVar.h(new dutx(i, i5, duvwVar.c()));
                } else if (duvwVar.b() == 3) {
                    i3 = i5 + 1;
                    duvwVar.d();
                    engrVar.h(new durh(i, i5));
                } else if (duvwVar.b() == 5) {
                    engrVar.h(new duuj(i, i5));
                    i5++;
                } else {
                    duvwVar.b();
                }
                i5 = i3;
            } else if (duuw.c(duvwVar.a(), duurVar)) {
                int i7 = i5 + 1;
                engw d = duuw.d(duqhVar.c(duvwVar.a()), duurVar);
                if (!z2 || ((enou) d).c <= 1) {
                    d = enou.a;
                }
                engrVar.h(new dutv(i, i5, duvwVar.a(), d, z));
                i5 = i7;
            }
        }
        return engrVar.g();
    }

    static ListenableFuture c(final duqh duqhVar, dura duraVar, final duur duurVar, final int i, final boolean z, final Optional optional) {
        ozg.a("ItemViewDataUtils.getRecentItemViewData");
        try {
            final ListenableFuture b = duraVar.b();
            return erqt.b(b, ((dupm) duqhVar).k).a(new Callable() { // from class: duuh
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    int i2 = engw.d;
                    engw engwVar = (engw) dupt.a(ListenableFuture.this, enou.a);
                    optional.isPresent();
                    return duui.b(duqhVar, engwVar, 0, duurVar, false, z, i);
                }
            }, erpp.a);
        } finally {
            Trace.endSection();
        }
    }
}
