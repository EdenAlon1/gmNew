package defpackage;

import android.content.Context;
import android.telephony.ims.ImsRegistrationAttributes;
import j$.util.Collection;
import j$.util.function.Consumer$CC;
import java.util.Set;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djlj {
    private final Context a;
    private final dikt b;

    public djlj(Context context, dikt diktVar) {
        this.a = context;
        this.b = diktVar;
    }

    public static final int c(int i) {
        if (i != 1) {
            return i != 2 ? 1 : 3;
        }
        return 2;
    }

    public final void a(eyvt eyvtVar) {
        eyvu eyvuVar = (eyvu) eyvv.a.createBuilder();
        eyvuVar.copyOnWrite();
        eyvv eyvvVar = (eyvv) eyvuVar.instance;
        eyvvVar.f = 6;
        eyvvVar.b |= 2;
        eyvuVar.copyOnWrite();
        eyvv eyvvVar2 = (eyvv) eyvuVar.instance;
        eyvvVar2.g = 2;
        eyvvVar2.b |= 4;
        eyvuVar.copyOnWrite();
        eyvv eyvvVar3 = (eyvv) eyvuVar.instance;
        eyvtVar.getClass();
        eyvvVar3.d = eyvtVar;
        eyvvVar3.c = 8;
        this.b.h(this.a, (eyvv) eyvuVar.build());
    }

    final void b(ImsRegistrationAttributes imsRegistrationAttributes, boolean z) {
        Set featureTags;
        int transportType;
        final eyuo eyuoVar = (eyuo) eyur.a.createBuilder();
        featureTags = imsRegistrationAttributes.getFeatureTags();
        Collection.EL.stream(featureTags).forEach(new Consumer() { // from class: djli
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                eyud a = djll.a((String) obj);
                eyuo eyuoVar2 = eyuo.this;
                eyuoVar2.copyOnWrite();
                eyur eyurVar = (eyur) eyuoVar2.instance;
                eyur eyurVar2 = eyur.a;
                a.getClass();
                eygi eygiVar = eyurVar.c;
                if (!eygiVar.c()) {
                    eyurVar.c = eyfy.mutableCopy(eygiVar);
                }
                eyurVar.c.h(a.z);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        transportType = imsRegistrationAttributes.getTransportType();
        int c = c(transportType);
        eyuoVar.copyOnWrite();
        eyur eyurVar = (eyur) eyuoVar.instance;
        eyurVar.d = c - 1;
        eyurVar.b |= 1;
        int registrationTechnology = imsRegistrationAttributes.getRegistrationTechnology();
        int i = registrationTechnology != 0 ? registrationTechnology != 1 ? 1 : 3 : 2;
        int i2 = true == z ? 2 : 3;
        eyuoVar.copyOnWrite();
        eyur eyurVar2 = (eyur) eyuoVar.instance;
        eyurVar2.e = i - 1;
        eyurVar2.b |= 2;
        eyvr eyvrVar = (eyvr) eyvt.a.createBuilder();
        eyvrVar.copyOnWrite();
        eyvt eyvtVar = (eyvt) eyvrVar.instance;
        eyvtVar.c = i2 - 1;
        eyvtVar.b |= 1;
        eyvrVar.copyOnWrite();
        eyvt eyvtVar2 = (eyvt) eyvrVar.instance;
        eyur eyurVar3 = (eyur) eyuoVar.build();
        eyurVar3.getClass();
        eyvtVar2.d = eyurVar3;
        eyvtVar2.b |= 2;
        a((eyvt) eyvrVar.build());
    }
}
