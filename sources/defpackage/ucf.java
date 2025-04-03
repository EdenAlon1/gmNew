package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import j$.util.Collection;
import j$.util.function.Consumer$CC;
import java.util.List;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ucf implements ellh {
    final /* synthetic */ ucd a;

    public ucf(ucd ucdVar) {
        this.a = ucdVar;
    }

    @Override // defpackage.ellh
    public final /* bridge */ /* synthetic */ elli a(ellf ellfVar) {
        engw a = ((cxmb) ellfVar).a();
        final ucd ucdVar = this.a;
        List B = ucdVar.I.B(a);
        Collection.EL.stream(B).forEach(new Consumer() { // from class: ubm
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                final MessagePartCoreData messagePartCoreData = (MessagePartCoreData) obj;
                boolean booleanValue = ((Boolean) cjja.a.e()).booleanValue();
                ucd ucdVar2 = ucd.this;
                if (booleanValue && ((Boolean) uky.g.e()).booleanValue()) {
                    ucdVar2.L.T(new Consumer() { // from class: ubf
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void o(Object obj2) {
                            entd entdVar = ucd.a;
                            ((ugg) obj2).k(MessagePartCoreData.this);
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    }, null);
                }
                ucdVar2.c.b(dcln.a(messagePartCoreData), ucdVar2.I.r(messagePartCoreData));
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        ucdVar.I.al(B);
        return elli.a;
    }
}
