package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aahr implements ffjm {
    final /* synthetic */ aahw a;
    final /* synthetic */ fgcm b;
    final /* synthetic */ MessageId c;
    final /* synthetic */ Long d;
    final /* synthetic */ apza e;
    final /* synthetic */ boolean f;
    final /* synthetic */ boolean g;
    final /* synthetic */ ajiy h;
    final /* synthetic */ boolean i;

    public aahr(aahw aahwVar, fgcm fgcmVar, MessageId messageId, Long l, apza apzaVar, boolean z, boolean z2, ajiy ajiyVar, boolean z3) {
        this.a = aahwVar;
        this.b = fgcmVar;
        this.c = messageId;
        this.d = l;
        this.e = apzaVar;
        this.f = z;
        this.g = z2;
        this.h = ajiyVar;
        this.i = z3;
    }

    @Override // defpackage.ffjm
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            hfdVar.v(158304175);
            boolean F = hfdVar.F(this.a) | hfdVar.F(this.b) | hfdVar.F(this.c) | hfdVar.D(this.d) | hfdVar.F(this.e) | hfdVar.E(this.f) | hfdVar.E(this.g);
            final aahw aahwVar = this.a;
            final fgcm fgcmVar = this.b;
            final MessageId messageId = this.c;
            final Long l = this.d;
            final apza apzaVar = this.e;
            final boolean z = this.f;
            final boolean z2 = this.g;
            Object f = hfdVar.f();
            if (F || f == hfc.a) {
                f = new abgm() { // from class: aahn
                    @Override // defpackage.abgm
                    public final void a(dqzc dqzcVar) {
                        dqzcVar.getClass();
                        aahw.this.m(fgcmVar, messageId, l, apzaVar, apzb.b(dqzcVar), z, true, z2);
                    }
                };
                hfdVar.y(f);
            }
            abgm abgmVar = (abgm) f;
            hfdVar.o();
            boolean z3 = this.i;
            apza apzaVar2 = this.e;
            abgv abgvVar = (abgv) abgx.a.createBuilder();
            abgvVar.getClass();
            abgy.d(true == z3 ? 5 : 3, abgvVar);
            Object obj3 = apzaVar2 != null ? apzaVar2.a : null;
            apxx apxxVar = obj3 instanceof apxx ? (apxx) obj3 : null;
            if (apxxVar != null) {
                abgy.c(apxxVar.a, abgvVar);
            }
            abgx a = abgy.a(abgvVar);
            hfdVar.v(158283304);
            boolean F2 = hfdVar.F(this.h);
            final ajiy ajiyVar = this.h;
            Object f2 = hfdVar.f();
            if (F2 || f2 == hfc.a) {
                f2 = new ffix() { // from class: aaho
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        ajiy.this.a();
                        return ffcu.a;
                    }
                };
                hfdVar.y(f2);
            }
            ffix ffixVar = (ffix) f2;
            hfdVar.o();
            hfdVar.v(158285040);
            boolean F3 = hfdVar.F(this.a) | hfdVar.D(this.d);
            final aahw aahwVar2 = this.a;
            final Long l2 = this.d;
            Object f3 = hfdVar.f();
            if (F3 || f3 == hfc.a) {
                f3 = new ffix() { // from class: aahp
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        aahw.this.i.a(l2);
                        return ffcu.a;
                    }
                };
                hfdVar.y(f3);
            }
            ffix ffixVar2 = (ffix) f3;
            hfdVar.o();
            hfdVar.v(158288559);
            boolean F4 = hfdVar.F(this.a) | hfdVar.F(this.b) | hfdVar.F(this.c) | hfdVar.D(this.d) | hfdVar.F(this.e) | hfdVar.E(this.f) | hfdVar.E(this.g);
            final aahw aahwVar3 = this.a;
            final fgcm fgcmVar2 = this.b;
            final MessageId messageId2 = this.c;
            final Long l3 = this.d;
            final apza apzaVar3 = this.e;
            final boolean z4 = this.f;
            final boolean z5 = this.g;
            Object f4 = hfdVar.f();
            if (F4 || f4 == hfc.a) {
                ffji ffjiVar = new ffji() { // from class: aahq
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj4) {
                        String str = (String) obj4;
                        str.getClass();
                        apxx a2 = apzb.a(str);
                        aahw.this.m(fgcmVar2, messageId2, l3, apzaVar3, a2, z4, true, z5);
                        return ffcu.a;
                    }
                };
                hfdVar.y(ffjiVar);
                f4 = ffjiVar;
            }
            hfdVar.o();
            abgr.a(new abgn(a, ffixVar, ffixVar2, (ffji) f4, abgmVar, null, 32), hfdVar, 0);
        }
        return ffcu.a;
    }
}
