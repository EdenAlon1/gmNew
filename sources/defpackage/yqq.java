package defpackage;

import android.content.Context;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yqq {
    public static final enru a = enru.c("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/cameragallery/CameraGalleryInputUiAdapter");
    public final Context b;
    public final ffsk c;
    public final ffxx d;
    public final ffbr e;
    public final ffbr f;
    public final ffbr g;
    public final ffbr h;
    public final ffbr i;
    public final ffbz j;
    public final ffbz k;
    public final ffxx l;
    public final ffbz m;
    public final ydb n;
    private final ffxx o;
    private final fgcq p;

    public yqq(Context context, ffsk ffskVar, ffxx ffxxVar, @asgu ffbr ffbrVar, final ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ydb ydbVar, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, ffxx ffxxVar2, ffbr ffbrVar8, fgcq fgcqVar) {
        context.getClass();
        ffskVar.getClass();
        ffxxVar.getClass();
        ffbrVar.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        ydbVar.getClass();
        ffbrVar5.getClass();
        ffbrVar6.getClass();
        ffbrVar7.getClass();
        ffbrVar8.getClass();
        this.b = context;
        this.c = ffskVar;
        this.d = ffxxVar;
        this.e = ffbrVar;
        this.f = ffbrVar3;
        this.g = ffbrVar4;
        this.n = ydbVar;
        this.h = ffbrVar5;
        this.i = ffbrVar6;
        this.o = ffxxVar2;
        this.p = fgcqVar;
        this.j = ffca.a(new ffix() { // from class: yqd
            @Override // defpackage.ffix
            public final Object invoke() {
                Optional optional;
                final yqq yqqVar = this;
                Object b = yqqVar.e.b();
                b.getClass();
                final yqv yqvVar = null;
                ffbr ffbrVar9 = true != ((Boolean) b).booleanValue() ? null : ffbr.this;
                if (ffbrVar9 != null && (optional = (Optional) ffbrVar9.b()) != null) {
                    yqvVar = (yqv) fflm.b(optional);
                }
                ensk h = yqq.a.h();
                h.Y(ente.a, "BugleComposeRow2");
                ((enrr) h.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/cameragallery/CameraGalleryInputUiAdapter", "onLongPress_delegate$lambda$2", 81, "CameraGalleryInputUiAdapter.kt")).t("CameraGalleryInputUiAdapter SelfieGifUiAdapter is null %s", Boolean.valueOf(yqvVar == null));
                return new ffix() { // from class: yqh
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        yqv yqvVar2 = yqv.this;
                        if (yqvVar2 != null) {
                            ((adsd) yqqVar.f.b()).a(34);
                            yqvVar2.a(1);
                            ensk e = yqq.a.e();
                            e.Y(ente.a, "BugleComposeRow2");
                            ((enrr) e.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/cameragallery/CameraGalleryInputUiAdapter", "onInputLongPress", 168, "CameraGalleryInputUiAdapter.kt")).q("Camera gallery button long press invoked.");
                        }
                        return ffcu.a;
                    }
                };
            }
        });
        this.k = ffca.a(new ffix() { // from class: yqe
            @Override // defpackage.ffix
            public final Object invoke() {
                yqq yqqVar = yqq.this;
                if (!((atbo) yqqVar.h.b()).a() || !((atbq) yqqVar.i.b()).a()) {
                    return fgdm.a(true);
                }
                ydb ydbVar2 = yqqVar.n;
                return axqw.c(ydbVar2.a, yqqVar.c, new ffji() { // from class: yqg
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        xhu xhuVar = (xhu) obj;
                        xhuVar.getClass();
                        return Boolean.valueOf(xnr.a(xhuVar));
                    }
                });
            }
        });
        this.l = ((atti) ffbrVar8.b()).a() ? ffyy.a(new fgch(fgcqVar, ffxxVar2, new yqi(null))) : ffyy.a(new fgch(((cnpd) ffbrVar7.b()).h(), ffxxVar2, new yqj(null)));
        this.m = ffca.a(new ffix() { // from class: yqf
            @Override // defpackage.ffix
            public final Object invoke() {
                yqq yqqVar = yqq.this;
                fgdj fgdjVar = (fgdj) yqqVar.k.a();
                yqm yqmVar = new yqm(null, yqqVar);
                int i = fgau.a;
                fgen fgenVar = new fgen(yqmVar, fgdjVar);
                int i2 = fgcz.a;
                return fgbn.b(fgenVar, yqqVar.c, fgcy.a(0L, 3), null);
            }
        });
    }
}
