package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import j$.time.Instant;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awgk implements awgm {
    public final ffbr a;
    public final Optional b;
    public final Optional c;
    private final errl d;
    private final errl e;
    private final cqoh f;

    public awgk(errl errlVar, errl errlVar2, ffbr ffbrVar, Optional optional, Optional optional2, cqoh cqohVar) {
        this.d = errlVar;
        this.e = errlVar2;
        this.a = ffbrVar;
        this.b = optional;
        this.c = optional2;
        this.f = cqohVar;
    }

    @Override // defpackage.awgm
    public final elfl a(final MessageCoreData messageCoreData) {
        messageCoreData.aX(Instant.ofEpochMilli(messageCoreData.cK() ? messageCoreData.o() : this.f.f().toEpochMilli()));
        return elfo.f(new Runnable() { // from class: awgi
            @Override // java.lang.Runnable
            public final void run() {
                awgk awgkVar = awgk.this;
                bdmq bdmqVar = (bdmq) awgkVar.a.b();
                final MessageCoreData messageCoreData2 = messageCoreData;
                bdmqVar.T(messageCoreData2);
                awgkVar.b.ifPresent(new Consumer() { // from class: awgg
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        MessageCoreData messageCoreData3 = MessageCoreData.this;
                        ((akni) obj).a(messageCoreData3.u(), messageCoreData3.k());
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
        }, this.e).h(new emwl() { // from class: awgj
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                awgk.this.c.ifPresent(new Consumer() { // from class: awgh
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj2) {
                        ((ckaj) ((ffbr) obj2).b()).j(eqws.FILE_TRANSFER_CREDENTIALS_EXPIRED);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                return null;
            }
        }, this.d);
    }
}
