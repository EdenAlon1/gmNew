package defpackage;

import android.graphics.PointF;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import defpackage.dren;
import java.net.UnknownHostException;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drgf<I, T extends dren> extends vk<drfc<T>> implements Iterable<I>, fflg {
    private static final enru h = enru.c("com/google/android/libraries/compose/gifsticker/ui/screen/adapter/GifStickerMediaAdapter");
    public final drmd a;
    public final ffjm d;
    public final ffjn e;
    public List f = ffel.a;
    public String g;
    private final drfd i;
    private final drrj j;

    public drgf(drfd drfdVar, drrj drrjVar, drmd drmdVar, ffjm ffjmVar, ffjn ffjnVar) {
        this.i = drfdVar;
        this.j = drrjVar;
        this.a = drmdVar;
        this.d = ffjmVar;
        this.e = ffjnVar;
    }

    @Override // defpackage.vk
    public final int a() {
        return this.f.size();
    }

    @Override // defpackage.vk
    public final /* bridge */ /* synthetic */ wr e(ViewGroup viewGroup, int i) {
        return this.i.a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.gifsticker_media_item_layout, viewGroup, false), this.j);
    }

    @Override // java.lang.Iterable
    public final Iterator<I> iterator() {
        return this.f.iterator();
    }

    @Override // defpackage.vk
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final void g(final drfc drfcVar, int i) {
        drfcVar.getClass();
        try {
            drri.H(drfcVar, new drge(this, this.f.get(i), null), new ffji() { // from class: drgc
                @Override // defpackage.ffji
                public final Object invoke(Object obj) {
                    dren drenVar = (dren) obj;
                    drenVar.getClass();
                    drgf drgfVar = drgf.this;
                    drgfVar.d.a(drenVar, drgfVar.g);
                    return ffcu.a;
                }
            }, new drre() { // from class: drgd
                @Override // defpackage.drre
                public final boolean a(Object obj, PointF pointF) {
                    return ((Boolean) drgf.this.e.a((dren) obj, drfcVar.a, pointF)).booleanValue();
                }
            });
        } catch (RuntimeException e) {
            ((enrr) ((enrr) h.i()).g(e).h("com/google/android/libraries/compose/gifsticker/ui/screen/adapter/GifStickerMediaAdapter", "onBindViewHolder", 53, "GifStickerMediaAdapter.kt")).q("Unable to resolve GIF/sticker from record.");
            drfcVar.E();
        } catch (UnknownHostException e2) {
            ((enrr) ((enrr) h.i()).g(e2).h("com/google/android/libraries/compose/gifsticker/ui/screen/adapter/GifStickerMediaAdapter", "onBindViewHolder", 50, "GifStickerMediaAdapter.kt")).q("Unable to resolve GIF/sticker from record.");
            drfcVar.E();
        }
    }
}
