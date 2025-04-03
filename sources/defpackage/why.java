package defpackage;

import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.List;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class why extends ffhv implements ffjn {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    final /* synthetic */ wii c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public why(wii wiiVar, ffgu ffguVar) {
        super(3, ffguVar);
        this.c = wiiVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        why whyVar = new why(this.c, (ffgu) obj3);
        whyVar.a = (aixr) obj;
        whyVar.b = (Boolean) obj2;
        return whyVar.b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        Object obj2 = this.a;
        Object obj3 = this.b;
        final boolean z = false;
        if (!((Boolean) ctjd.aP.e()).booleanValue() || obj2 == null || obj3 == null) {
            return false;
        }
        Boolean bool = (Boolean) obj3;
        if (bool.booleanValue() && ((aixr) obj2).a) {
            z = true;
        }
        wii wiiVar = this.c;
        final boolean booleanValue = bool.booleanValue();
        int i = aixt.a;
        if (!ffkj.e(obj2, aixq.a)) {
            final List list = ((aixr) obj2).b;
            Optional optional = (Optional) wiiVar.j.b();
            final ffji ffjiVar = new ffji() { // from class: whu
                @Override // defpackage.ffji
                public final Object invoke(Object obj4) {
                    wmf wmfVar = (wmf) obj4;
                    wmfVar.getClass();
                    List list2 = list;
                    wmfVar.f(z, list2.contains(aixs.a), list2.contains(aixs.b), list2.contains(aixs.c), list2.contains(aixs.d), !booleanValue, list2.contains(aixs.g));
                    return ffcu.a;
                }
            };
            optional.ifPresent(new Consumer() { // from class: whv
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj4) {
                    ffji.this.invoke(obj4);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
        return Boolean.valueOf(z);
    }
}
