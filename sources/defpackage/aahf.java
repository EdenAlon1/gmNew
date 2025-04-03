package defpackage;

import android.content.Intent;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aahf implements ffjm {
    final /* synthetic */ ajiy a;
    final /* synthetic */ aahw b;
    final /* synthetic */ Long c;
    final /* synthetic */ MessageId d;
    final /* synthetic */ fgcm e;
    final /* synthetic */ boolean f;

    public aahf(ajiy ajiyVar, aahw aahwVar, Long l, MessageId messageId, fgcm fgcmVar, boolean z) {
        this.a = ajiyVar;
        this.b = aahwVar;
        this.c = l;
        this.d = messageId;
        this.e = fgcmVar;
        this.f = z;
    }

    @Override // defpackage.ffjm
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            aahw aahwVar = this.b;
            abgv abgvVar = (abgv) abgx.a.createBuilder();
            abgvVar.getClass();
            abgy.d(4, abgvVar);
            abgy.b(aahwVar.b.getString(R.string.select_image_for_photomoji), abgvVar);
            abgx a = abgy.a(abgvVar);
            hfdVar.v(-1522876611);
            boolean F = hfdVar.F(this.a);
            final ajiy ajiyVar = this.a;
            Object f = hfdVar.f();
            if (F || f == hfc.a) {
                f = new ffix() { // from class: aahc
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        ajiy.this.a();
                        return ffcu.a;
                    }
                };
                hfdVar.y(f);
            }
            ffix ffixVar = (ffix) f;
            hfdVar.o();
            hfdVar.v(-1522874875);
            boolean F2 = hfdVar.F(this.b) | hfdVar.D(this.c);
            final aahw aahwVar2 = this.b;
            final Long l = this.c;
            Object f2 = hfdVar.f();
            if (F2 || f2 == hfc.a) {
                f2 = new ffix() { // from class: aahd
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        aahw.this.i.a(l);
                        return ffcu.a;
                    }
                };
                hfdVar.y(f2);
            }
            ffix ffixVar2 = (ffix) f2;
            hfdVar.o();
            hfdVar.v(-1522871200);
            boolean F3 = hfdVar.F(this.b) | hfdVar.F(this.d) | hfdVar.F(this.e) | hfdVar.D(this.c) | hfdVar.E(this.f);
            final aahw aahwVar3 = this.b;
            final MessageId messageId = this.d;
            final fgcm fgcmVar = this.e;
            final Long l2 = this.c;
            final boolean z = this.f;
            Object f3 = hfdVar.f();
            if (F3 || f3 == hfc.a) {
                ffji ffjiVar = new ffji() { // from class: aahe
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj3) {
                        String str = (String) obj3;
                        str.getClass();
                        fgcm fgcmVar2 = fgcmVar;
                        fgcmVar2.getClass();
                        aahw aahwVar4 = aahw.this;
                        if (aahwVar4.s == null) {
                            throw new IllegalStateException("Create sticker button clicked when sticker store was not present");
                        }
                        Intent putExtra = new Intent("com.google.chat.smartmessaging.penpal.EMOTIFY").putExtra("image_uri", str);
                        putExtra.getClass();
                        if (((Number) ctjd.aN.e()).floatValue() > 0.0f) {
                            Object e = ctjd.aN.e();
                            e.getClass();
                            putExtra.putExtra("small_segment_ratio", ((Number) e).floatValue());
                        }
                        if (aahwVar4.q.a()) {
                            putExtra.putExtra("enable_edge_to_edge", true);
                        }
                        boolean z2 = z;
                        Long l3 = l2;
                        axol.k(aahwVar4.c, null, new aaht(aahwVar4, messageId, new aiir("emotify_result", new ael(), putExtra), z2, fgcmVar2, l3, null), 3);
                        return ffcu.a;
                    }
                };
                hfdVar.y(ffjiVar);
                f3 = ffjiVar;
            }
            hfdVar.o();
            abgr.a(new abgn(a, ffixVar, ffixVar2, null, null, (ffji) f3, 24), hfdVar, 0);
        }
        return ffcu.a;
    }
}
