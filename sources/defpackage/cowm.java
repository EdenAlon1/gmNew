package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.rcs.client.messaging.data.BasicTextMessage;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes8.dex */
public class cowm {
    private final errl a;
    public final eikl l;
    public final avtx m;

    protected cowm(eikl eiklVar, avtx avtxVar, errl errlVar) {
        this.l = eiklVar;
        this.m = avtxVar;
        this.a = errlVar;
    }

    public elfl d(MessageCoreData messageCoreData, avkl avklVar) {
        return e(cowi.a(messageCoreData), avklVar);
    }

    public elfl e(final cowj cowjVar, avkl avklVar) {
        return elfo.g(new Callable() { // from class: cowl
            @Override // java.util.concurrent.Callable
            public final Object call() {
                eidx eidxVar = new eidx();
                eidxVar.b(cowjVar.b);
                BasicTextMessage a = eidxVar.a();
                cowm cowmVar = cowm.this;
                try {
                    return (awul) cowmVar.m.fP(cowmVar.l.b(BasicTextMessage.class).b(a));
                } catch (eikm e) {
                    throw new cowg(e);
                }
            }
        }, this.a);
    }
}
