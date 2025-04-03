package defpackage;

import android.graphics.Bitmap;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emfj {
    public static final void a(final emge emgeVar, hfd hfdVar, final int i) {
        int i2;
        hvi c;
        int i3 = i & 6;
        hfd b = hfdVar.b(525199176);
        if (i3 == 0) {
            i2 = (true != b.F(emgeVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
        } else {
            Bitmap bitmap = (Bitmap) emgeVar.m.a();
            final fflb fflbVar = new fflb();
            b.v(-620380196);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (R == hfc.a) {
                hic hicVar = new hic(new kaf(0L), hla.a);
                hfmVar.ad(hicVar);
                R = hicVar;
            }
            hfmVar.Z();
            fflbVar.a = (hho) R;
            if (bitmap != null) {
                iax iaxVar = new iax(bitmap);
                c = ebs.c(hvi.e, 1.0f);
                dgx.b(iaxVar, null, iqd.a(c, new ffji() { // from class: emfh
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        emhc emhcVar;
                        fflb fflbVar2 = fflb.this;
                        kaf kafVar = (kaf) obj;
                        long j = ((kaf) ((hho) fflbVar2.a).a()).a;
                        if (kafVar == null || !kaf.e(kafVar.a, j)) {
                            emge emgeVar2 = emgeVar;
                            ((hho) fflbVar2.a).b(kafVar);
                            long j2 = kafVar.a;
                            emhc emhcVar2 = new emhc((int) (j2 >> 32), (int) (j2 & 4294967295L));
                            ((enrr) emgeVar2.e.h().h("com/google/chat/smartmessaging/penpal/ui/EmotifyViewModel", "onImageLoaded", 199, "EmotifyViewModel.kt")).q("ViewModel onImageLoaded");
                            if (emgeVar2.f.c() == emfz.a && emhcVar2.b > 0 && emhcVar2.a > 0) {
                                ((enrr) emgeVar2.e.h().h("com/google/chat/smartmessaging/penpal/ui/EmotifyViewModel", "onImageLoaded", 204, "EmotifyViewModel.kt")).q("ViewModel starting segmentation");
                                Object a = emgeVar2.m.a();
                                if (a == null) {
                                    throw new IllegalArgumentException("onImageLoaded call is expecting non-null _selectedImageState.value.");
                                }
                                Bitmap bitmap2 = (Bitmap) a;
                                float height = bitmap2.getHeight();
                                float width = bitmap2.getWidth();
                                float f = emhcVar2.b;
                                float f2 = emhcVar2.a;
                                if (height / width > f / f2) {
                                    emhcVar = new emhc((int) (bitmap2.getWidth() * (f / bitmap2.getHeight())), emhcVar2.b);
                                } else {
                                    emhcVar = new emhc(emhcVar2.a, (int) (bitmap2.getHeight() * (f2 / bitmap2.getWidth())));
                                }
                                emgeVar2.n = emhcVar;
                                ((enrr) emgeVar2.e.h().h("com/google/chat/smartmessaging/penpal/ui/EmotifyViewModel", "segmentImage", 256, "EmotifyViewModel.kt")).q("ViewModel trying to enqueue task on the background thread for segmenter");
                                Object b2 = emgeVar2.b.b();
                                b2.getClass();
                                ffqy.d((ffsk) b2, null, null, new emgd(emgeVar2, bitmap2, null), 3);
                            }
                        }
                        return ffcu.a;
                    }
                }), null, null, b, 48, 248);
            }
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: emfi
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    emfj.a(emge.this, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
