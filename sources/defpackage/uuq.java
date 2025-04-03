package defpackage;

import android.view.View;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.function.Consumer$CC;
import java.util.concurrent.CancellationException;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
class uuq implements ejlr<MessageIdType, Boolean> {
    final /* synthetic */ uuy a;

    public uuq(uuy uuyVar) {
        this.a = uuyVar;
    }

    @Override // defpackage.ejlr
    public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
        int g = this.a.aB.g((MessageIdType) obj);
        if (((Boolean) obj2).booleanValue()) {
            this.a.v(g);
        } else {
            uuy uuyVar = this.a;
            uuyVar.aA.ar(uuyVar.az, g);
        }
        if (this.a.e.z() != null) {
            this.a.ay.n();
        }
        if (((Boolean) ddjr.h.e()).booleanValue()) {
            final int intValue = ((Integer) ddjr.i.e()).intValue();
            final int intValue2 = ((Integer) ddjr.j.e()).intValue();
            this.a.f().ifPresent(new Consumer() { // from class: uup
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj3) {
                    ((View) obj3).animate().alpha(0.0f).setStartDelay(intValue).setDuration(intValue2).start();
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
    }

    @Override // defpackage.ejlr
    public final /* bridge */ /* synthetic */ void m(Object obj, Throwable th) {
        MessageIdType messageIdType = (MessageIdType) obj;
        if (!(th instanceof CancellationException)) {
            throw new IllegalArgumentException("Failure to load messages around messageId ".concat(String.valueOf(String.valueOf(messageIdType))), th);
        }
    }

    @Override // defpackage.ejlr
    public final /* synthetic */ void b(Object obj) {
    }
}
