package defpackage;

import com.google.android.apps.messaging.home.minidetailspage.MiniConversationDetailsPageViewModel;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aemq implements ffjm {
    final /* synthetic */ aemw a;

    public aemq(aemw aemwVar) {
        this.a = aemwVar;
    }

    public static final cyxb b(hkx hkxVar) {
        return (cyxb) hkxVar.a();
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        final long j;
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            if (((int[]) hkf.a(this.a.f, hfdVar).a()) != null) {
                j = (r8[0] << 32) | (r8[1] & 4294967295L);
            } else {
                j = 0;
            }
            final MiniConversationDetailsPageViewModel miniConversationDetailsPageViewModel = (MiniConversationDetailsPageViewModel) this.a.g.a();
            Optional optional = miniConversationDetailsPageViewModel.a;
            final ffji ffjiVar = new ffji() { // from class: aemy
                @Override // defpackage.ffji
                public final Object invoke(Object obj3) {
                    fgdj a = ((cywp) obj3).a(new cyvt(2));
                    cyvq cyvqVar = (cyvq) fflm.b(MiniConversationDetailsPageViewModel.this.b);
                    if (cyvqVar != null) {
                        cyvqVar.a(null, j, 2);
                    }
                    return a;
                }
            };
            Object orElse = optional.map(new Function() { // from class: aemz
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj3) {
                    return ffji.this.invoke(obj3);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).orElse(fgdm.a(null));
            orElse.getClass();
            hkx a = hkf.a((fgdj) orElse, hfdVar);
            aemw aemwVar = this.a;
            hik hikVar = dnae.a;
            Object b = aemwVar.d.b();
            b.getClass();
            hfz.a(hikVar.c(b), hpx.d(-320556338, new aemp(a, this.a), hfdVar), hfdVar, 56);
        }
        return ffcu.a;
    }
}
