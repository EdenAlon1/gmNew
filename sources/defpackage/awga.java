package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.concurrent.Callable;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awga implements awgm {
    public static final entd a = entd.c("BugleFileTransfer");
    public final ffbr b;
    public final cisl c;
    private final errl d;
    private final errl e;
    private final Optional f;
    private final cqoh g;

    public awga(errl errlVar, errl errlVar2, ffbr ffbrVar, Optional optional, cisl cislVar, cqoh cqohVar) {
        this.d = errlVar;
        this.e = errlVar2;
        this.b = ffbrVar;
        this.f = optional;
        this.c = cislVar;
        this.g = cqohVar;
    }

    @Override // defpackage.awgm
    public final elfl a(final MessageCoreData messageCoreData) {
        ensz enszVar = (ensz) a.h();
        enszVar.Y(csux.p, messageCoreData.z());
        enszVar.Y(csux.b, messageCoreData.B());
        enszVar.Y(csux.f, messageCoreData.E());
        ((ensz) enszVar.h("com/google/android/apps/messaging/shared/chatapi/filetransfer/retry/NoRetryStrategy", "execute", 60, "NoRetryStrategy.java")).q("Failing file transfer with no retry.");
        messageCoreData.bb(messageCoreData.cK() ? messageCoreData.o() : this.g.f().toEpochMilli());
        this.f.ifPresent(new Consumer() { // from class: awfv
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                entd entdVar = awga.a;
                MessageCoreData messageCoreData2 = MessageCoreData.this;
                ((akni) obj).a(messageCoreData2.u(), messageCoreData2.k());
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        return elfo.g(new Callable() { // from class: awfw
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Boolean.valueOf(((bdmq) awga.this.b.b()).T(messageCoreData));
            }
        }, this.d).i(new eroh() { // from class: awfx
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                return awga.this.c.a();
            }
        }, this.e).i(new eroh() { // from class: awfy
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                return ((cevg) obj).b();
            }
        }, this.e).h(new emwl() { // from class: awfz
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                entd entdVar = awga.a;
                if (((Boolean) obj).booleanValue()) {
                    return null;
                }
                MessageCoreData messageCoreData2 = MessageCoreData.this;
                ensz enszVar2 = (ensz) awga.a.j();
                enszVar2.Y(csux.p, messageCoreData2.z());
                enszVar2.Y(csux.b, messageCoreData2.B());
                enszVar2.Y(csux.f, messageCoreData2.E());
                ((ensz) enszVar2.h("com/google/android/apps/messaging/shared/chatapi/filetransfer/retry/NoRetryStrategy", "execute", 88, "NoRetryStrategy.java")).q("Couldn't refresh the failure notification for file transfer.");
                return null;
            }
        }, this.e);
    }
}
