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
public final class aewt extends alhh {
    public final ffbr a;
    public final ffbr b;
    public final errl c;

    public aewt(ffbr ffbrVar, ffbr ffbrVar2, aexz aexzVar, ffbr ffbrVar3, Executor executor, errl errlVar) {
        super(ffbrVar, aexzVar, executor);
        this.a = ffbrVar2;
        this.b = ffbrVar3;
        this.c = errlVar;
    }

    @Override // defpackage.alhh
    public final BiConsumer a() {
        return new BiConsumer() { // from class: aewq
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                eqhb eqhbVar = (eqhb) obj;
                eqhq eqhqVar = (eqhq) obj2;
                eqhbVar.copyOnWrite();
                eqhc eqhcVar = (eqhc) eqhbVar.instance;
                eqhc eqhcVar2 = eqhc.a;
                eqhqVar.getClass();
                eqhcVar.c = eqhqVar;
                eqhcVar.b = 4;
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        };
    }

    public final elfl b(final MessageIdType messageIdType) {
        return elfo.g(new Callable() { // from class: aewp
            @Override // java.util.concurrent.Callable
            public final Object call() {
                aewt aewtVar = aewt.this;
                MessageCoreData v = ((bdmq) aewtVar.b.b()).v(messageIdType);
                if (v == null) {
                    return 0L;
                }
                return Long.valueOf(((akvz) aewtVar.a.b()).d(v));
            }
        }, this.c);
    }

    public final eqhd c(long j, ConversationIdType conversationIdType) {
        eqhd eqhdVar = (eqhd) eqhq.a.createBuilder();
        eqhdVar.copyOnWrite();
        eqhq eqhqVar = (eqhq) eqhdVar.instance;
        eqhqVar.b |= 1;
        eqhqVar.e = j;
        long b = ((akvz) this.a.b()).b(conversationIdType);
        eqhdVar.copyOnWrite();
        eqhq eqhqVar2 = (eqhq) eqhdVar.instance;
        eqhqVar2.b |= 2;
        eqhqVar2.f = b;
        return eqhdVar;
    }
}
