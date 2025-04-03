package defpackage;

import android.app.Activity;
import android.graphics.PointF;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drco extends vk implements Iterable, fflg {
    public final drmd a;
    public final ffji d;
    public final ffji e;
    public List f = ffel.a;
    private final draz g;
    private final drrj h;

    public drco(draz drazVar, drrj drrjVar, drmd drmdVar, ffji ffjiVar, ffji ffjiVar2) {
        this.g = drazVar;
        this.h = drrjVar;
        this.a = drmdVar;
        this.d = ffjiVar;
        this.e = ffjiVar2;
    }

    @Override // defpackage.vk
    public final int a() {
        return this.f.size();
    }

    @Override // defpackage.vk
    public final /* bridge */ /* synthetic */ wr e(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.custom_sticker_list_item, viewGroup, false);
        draz drazVar = this.g;
        Activity activity = (Activity) drazVar.a.b();
        activity.getClass();
        ffsk ffskVar = (ffsk) drazVar.b.b();
        ffskVar.getClass();
        drro drroVar = (drro) drazVar.c.b();
        dqkk dqkkVar = (dqkk) drazVar.d.b();
        dqkkVar.getClass();
        inflate.getClass();
        return new dray(activity, ffskVar, drroVar, dqkkVar, inflate, this.h);
    }

    @Override // defpackage.vk
    public final /* bridge */ /* synthetic */ void g(wr wrVar, int i) {
        dray drayVar = (dray) wrVar;
        drayVar.getClass();
        drri.H(drayVar, new drcn(this, (drap) this.f.get(i), null), new ffji() { // from class: drcl
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                dqzc dqzcVar = (dqzc) obj;
                dqzcVar.getClass();
                drco.this.d.invoke(dqzcVar);
                return ffcu.a;
            }
        }, new drre() { // from class: drcm
            @Override // defpackage.drre
            public final boolean a(Object obj, PointF pointF) {
                ((Boolean) drco.this.e.invoke((dqzc) obj)).booleanValue();
                return true;
            }
        });
    }

    @Override // java.lang.Iterable
    public final Iterator<drap> iterator() {
        return this.f.iterator();
    }
}
