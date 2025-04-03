package defpackage;

import android.app.Activity;
import j$.util.DesugarArrays;
import j$.util.DesugarCollections;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sfp {
    public final byzp a;
    public final uav b;
    public final elni c;
    private final dlou d;

    public sfp(byzp byzpVar, Activity activity, uav uavVar) {
        int i = dlou.b;
        engr engrVar = new engr();
        elod elodVar = elox.a;
        elor elorVar = new elor();
        elorVar.a = "send";
        elwq elwqVar = new elwq(elow.class);
        elwqVar.b(elow.SEND);
        elwqVar.b = true;
        elorVar.c(elwqVar.a());
        elorVar.b(dloy.a(new Consumer() { // from class: sfm
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                sfp.this.b.j(true, true, true);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }));
        engrVar.h(elorVar.a());
        eluv eluvVar = elvz.a;
        elvt elvtVar = new elvt();
        elvtVar.a = "reply";
        elvtVar.d = true;
        ((elvf) elvtVar.e).b = Optional.of(elwv.a);
        final ArrayList arrayList = new ArrayList();
        DesugarArrays.stream(new elvv[]{elvv.REPLY}).forEach(new Consumer() { // from class: elwk
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                arrayList.add((Enum) obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        ((elvf) elvtVar.e).d = Optional.of(new elwd(DesugarCollections.unmodifiableList(arrayList), elvv.class));
        elvtVar.c = dloy.a(new Consumer() { // from class: sfn
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                elvs elvsVar = (elvs) obj;
                boolean isPresent = elvsVar.a().isPresent();
                sfp sfpVar = sfp.this;
                if (!isPresent) {
                    ((ucd) sfpVar.b).I.G();
                    sfpVar.b.f(true);
                } else {
                    sfpVar.b.o(sfpVar.a.m((String) elvsVar.a().get()), false, false);
                    sfpVar.b.f(true);
                }
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        engrVar.h(elvtVar.a());
        elor elorVar2 = new elor();
        elorVar2.a = "back";
        elwq elwqVar2 = new elwq(elow.class);
        elwqVar2.b(elow.GO_BACK);
        elwqVar2.b = true;
        elorVar2.c(elwqVar2.a());
        elorVar2.b(dloy.a(new Consumer() { // from class: sfo
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                eg G = ((ucd) sfp.this.b).l.G();
                G.getClass();
                G.onBackPressed();
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }));
        engrVar.h(elorVar2.a());
        dlou a = dlot.a(engrVar);
        this.d = a;
        this.a = byzpVar;
        this.b = uavVar;
        this.c = new elni(activity, a);
    }
}
