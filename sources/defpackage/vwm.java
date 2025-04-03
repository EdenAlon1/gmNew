package defpackage;

import android.view.View;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vwm implements ellh {
    final /* synthetic */ vvn a;

    public vwm(vvn vvnVar) {
        this.a = vvnVar;
    }

    @Override // defpackage.ellh
    public final /* bridge */ /* synthetic */ elli a(ellf ellfVar) {
        MessageIdType a = ((cyhh) ellfVar).a();
        vvn vvnVar = this.a;
        uuy uuyVar = vvnVar.cx;
        if (((Boolean) ddjr.h.e()).booleanValue()) {
            final int intValue = ((Integer) ddjr.k.e()).intValue();
            uuyVar.f().ifPresent(new Consumer() { // from class: uth
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    cfup cfupVar = uuy.a;
                    ((View) obj).animate().alpha(1.0f).setDuration(intValue).start();
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
        uuyVar.aO = true;
        uuyVar.L.i(new ejlp(uuyVar.aB.h(a)), new ejlm(a), uuyVar.ai);
        vvnVar.aO.ifPresent(new Consumer() { // from class: vow
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                enru enruVar = vvn.a;
                ((cnla) obj).w(2, 9);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        return elli.a;
    }
}
