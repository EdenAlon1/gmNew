package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.Optional;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class apqw implements aqge {
    public final cqtw a;
    public final ctbl b;
    public final ExecutorService c;
    public final MessageIdType d;
    public ctbx e = null;

    public apqw(cqtw cqtwVar, ctbk ctbkVar, ExecutorService executorService, MessageIdType messageIdType) {
        this.a = cqtwVar;
        this.c = executorService;
        this.d = messageIdType;
        this.b = ctbkVar.a(new apqv(this));
    }

    @Override // defpackage.aqge
    public final ctbx a(final aqgd aqgdVar) {
        return this.b.a(new ctbf() { // from class: apqt
            @Override // defpackage.ctbf
            public final elfl a(Object obj) {
                return aqgd.this.a();
            }
        }, "DownloadingSupplier::Register", "DownloadingSupplier::Callback", "DownloadingSupplier::Unregister");
    }

    @Override // defpackage.aqge
    public final elfl b() {
        final cqtw cqtwVar = this.a;
        final MessageIdType messageIdType = this.d;
        return elfo.g(new Callable() { // from class: cqto
            @Override // java.util.concurrent.Callable
            public final Object call() {
                cqtw cqtwVar2 = cqtw.this;
                Map map = cqtwVar2.b;
                MessageIdType messageIdType2 = messageIdType;
                return map.containsKey(messageIdType2) ? Optional.of((cqpu) cqtwVar2.b.get(messageIdType2)) : Optional.empty();
            }
        }, cqtwVar.c).h(new emwl() { // from class: apqq
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                Optional optional = (Optional) obj;
                if (optional.isEmpty()) {
                    return Optional.empty();
                }
                apqm d = apqn.d();
                d.b(((cqpu) optional.get()).a());
                d.d(((cqpu) optional.get()).b());
                d.c(((cqpu) optional.get()).c());
                return Optional.of(d.a());
            }
        }, this.c);
    }

    @Override // defpackage.aqge
    public final /* bridge */ /* synthetic */ Object c() {
        throw new UnsupportedOperationException();
    }
}
