package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.function.BiConsumer$CC;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.function.BiConsumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aexa extends alhh {
    public final ffbr a;
    public final ffbr b;
    public final errl c;

    public aexa(ffbr ffbrVar, ffbr ffbrVar2, aexz aexzVar, ffbr ffbrVar3, Executor executor, errl errlVar) {
        super(ffbrVar, aexzVar, executor);
        this.a = ffbrVar2;
        this.b = ffbrVar3;
        this.c = errlVar;
    }

    @Override // defpackage.alhh
    public final BiConsumer a() {
        return new BiConsumer() { // from class: aewu
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                eqhb eqhbVar = (eqhb) obj;
                eqic eqicVar = (eqic) obj2;
                eqhbVar.copyOnWrite();
                eqhc eqhcVar = (eqhc) eqhbVar.instance;
                eqhc eqhcVar2 = eqhc.a;
                eqicVar.getClass();
                eqhcVar.c = eqicVar;
                eqhcVar.b = 9;
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        };
    }

    public final elfl b(final MessageIdType messageIdType) {
        return elfo.g(new Callable() { // from class: aewx
            @Override // java.util.concurrent.Callable
            public final Object call() {
                aexa aexaVar = aexa.this;
                MessageCoreData v = ((bdmq) aexaVar.b.b()).v(messageIdType);
                if (v == null) {
                    return 0L;
                }
                return Long.valueOf(((akvz) aexaVar.a.b()).d(v));
            }
        }, this.c);
    }

    public final eqhr c(ConversationIdType conversationIdType, long j) {
        eqhr eqhrVar = (eqhr) eqic.a.createBuilder();
        eqhrVar.copyOnWrite();
        eqic eqicVar = (eqic) eqhrVar.instance;
        eqicVar.b |= 1;
        eqicVar.e = j;
        long b = ((akvz) this.a.b()).b(conversationIdType);
        eqhrVar.copyOnWrite();
        eqic eqicVar2 = (eqic) eqhrVar.instance;
        eqicVar2.b |= 2;
        eqicVar2.f = b;
        return eqhrVar;
    }
}
