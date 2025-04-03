package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.apps.messaging.R;
import j$.util.Optional;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqfs extends oji {
    private final drpr d;
    private final ffix e;
    private final ffji f;
    private final dqdb g;
    private final dqku h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqfs(drpr drprVar, mr mrVar, ffix ffixVar, ffji ffjiVar, dqdb dqdbVar) {
        super(mrVar, fghh.a, fftc.a);
        ffsd ffsdVar = fftc.a;
        this.d = drprVar;
        this.e = ffixVar;
        this.f = ffjiVar;
        this.g = dqdbVar;
        this.h = new dqku(new dqfr(dqdbVar.b()), new ffji() { // from class: dqfq
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                boolean booleanValue = ((Boolean) obj).booleanValue();
                ffbz ffbzVar = drje.a;
                drje a = drjd.a();
                if (true == booleanValue) {
                    a = null;
                }
                return new drrj(a, (ImageView.ScaleType) null, 6);
            }
        });
    }

    @Override // defpackage.vk
    public final int dE(int i) {
        return i == 0 ? 4 : 5;
    }

    @Override // defpackage.vk
    public final /* synthetic */ wr e(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.local_media_item, viewGroup, false);
        drrj drrjVar = (drrj) this.h.a();
        drpr drprVar = this.d;
        Activity activity = (Activity) drprVar.a.b();
        activity.getClass();
        drro drroVar = (drro) drprVar.b.b();
        Optional optional = (Optional) ((fbbb) drprVar.c).a;
        dqkk dqkkVar = (dqkk) drprVar.d.b();
        dqkkVar.getClass();
        ffsk ffskVar = (ffsk) drprVar.e.b();
        ffskVar.getClass();
        inflate.getClass();
        drrjVar.getClass();
        return new drpq(activity, drroVar, optional, dqkkVar, ffskVar, inflate, drrjVar);
    }

    /* JADX WARN: Type inference failed for: r10v8, types: [fgdj, java.lang.Object] */
    @Override // defpackage.vk
    public final /* bridge */ /* synthetic */ void g(wr wrVar, int i) {
        Object c;
        Object c2;
        Object d;
        Object c3;
        String string;
        drpq drpqVar = (drpq) wrVar;
        drpqVar.getClass();
        oco ocoVar = this.a;
        try {
            fgcm fgcmVar = ocoVar.d;
            do {
                c2 = fgcmVar.c();
                ((Boolean) c2).booleanValue();
            } while (!fgcmVar.g(c2, true));
            ocoVar.e = i;
            oko okoVar = (oko) ocoVar.f.get();
            if (okoVar == null) {
                d = ocoVar.g.d(i);
            } else {
                if (i < 0 || i >= okoVar.f()) {
                    throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + okoVar.f());
                }
                int e = i - okoVar.e();
                if (e >= 0 && e < okoVar.a()) {
                    d = okoVar.i(e);
                }
                d = null;
            }
            fgcm fgcmVar2 = ocoVar.d;
            do {
                c3 = fgcmVar2.c();
                ((Boolean) c3).booleanValue();
            } while (!fgcmVar2.g(c3, false));
            if (d == null) {
                throw new IllegalStateException(a.h(i, "No item for bind position "));
            }
            drnm drnmVar = (drnm) d;
            List list = (List) this.e.invoke().c();
            list.getClass();
            Iterator it = list.iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i2 = -1;
                    break;
                } else if (doxw.a((doxx) it.next(), drnmVar)) {
                    break;
                } else {
                    i2++;
                }
            }
            Integer valueOf = Integer.valueOf(i2);
            Integer num = valueOf.intValue() >= 0 ? valueOf : null;
            Resources resources = drpqVar.a.getContext().getResources();
            String string2 = resources.getString(drnmVar.l().b().a());
            string2.getClass();
            if (num == null) {
                string = resources.getString(R.string.gallery_item_content_description_unselected_state, string2, dqkr.a(drnmVar.c()));
                string.getClass();
            } else {
                string = resources.getString(R.string.gallery_item_content_description_selected_state, string2, Integer.valueOf(num.intValue() + 1));
                string.getClass();
            }
            String str = string;
            drrj drrjVar = (drrj) this.h.a();
            drrjVar.getClass();
            drpqVar.x = drrjVar;
            drri.G(drpqVar, drnmVar, this.f, null, num, str, 100);
            Size a = this.g.a(dE(i));
            int width = a != null ? a.getWidth() : -1;
            int height = a != null ? a.getHeight() : -2;
            View view = drpqVar.a;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.width = width;
            layoutParams.height = height;
            view.setLayoutParams(layoutParams);
        } catch (Throwable th) {
            fgcm fgcmVar3 = ocoVar.d;
            do {
                c = fgcmVar3.c();
                ((Boolean) c).booleanValue();
            } while (!fgcmVar3.g(c, false));
            throw th;
        }
    }

    @Override // defpackage.vk
    public final /* bridge */ /* synthetic */ void k(wr wrVar) {
        drpq drpqVar = (drpq) wrVar;
        drpqVar.getClass();
        drpqVar.a.setContentDescription(null);
        drpqVar.u.a = false;
        if (drpqVar.x.c) {
            drpqVar.a.setOnTouchListener(null);
        }
        if (((drri) drpqVar).t.isDestroyed()) {
            return;
        }
        Context context = drpqVar.y;
        qpt.c(context).k(drpqVar.v);
    }
}
