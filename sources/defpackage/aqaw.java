package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.function.Function$CC;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aqaw implements aqge {
    public final MessageId a;
    public final int b;
    private final ffsk c;
    private final bufr d;
    private final apue e;

    public aqaw(ffsk ffskVar, final dtuu dtuuVar, apuc apucVar, MessageId messageId, int i) {
        Object apply;
        ffskVar.getClass();
        dtuuVar.getClass();
        apucVar.getClass();
        this.c = ffskVar;
        this.a = messageId;
        this.b = i;
        String[] strArr = bufy.a;
        bufs bufsVar = new bufs(bufy.a);
        bufsVar.z("RepliesChangeObserver");
        apply = new Function() { // from class: aqao
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bufe bufeVar = (bufe) obj;
                return new buff[]{bufeVar.a, bufeVar.b};
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }.apply(bufy.c);
        bufsVar.c((buff[]) apply);
        bufsVar.e(new Function() { // from class: aqap
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bufx bufxVar = (bufx) obj;
                bufxVar.b(aqaw.d(aqaw.this.a));
                return bufxVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bufr b = bufsVar.b();
        this.d = b;
        this.e = apucVar.a("RepliesChangeObserver", b, new apud() { // from class: aqaq
            @Override // defpackage.apud
            public final Object a(final Consumer consumer) {
                return new aqbj(dtuu.this, new ffji() { // from class: aqan
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        List list = (List) obj;
                        list.getClass();
                        Consumer.this.o(engq.a(list));
                        return ffcu.a;
                    }
                });
            }
        });
    }

    public static final MessageIdType d(MessageId messageId) {
        MessageIdType c;
        apah apahVar = messageId instanceof apah ? (apah) messageId : null;
        if (apahVar == null || (c = apahVar.c()) == null) {
            throw new IllegalStateException("Unsupported message id type.");
        }
        return c;
    }

    @Override // defpackage.aqge
    public final ctbx a(aqgd aqgdVar) {
        return this.e.b(new aqav(aqgdVar));
    }

    @Override // defpackage.aqge
    public final elfl b() {
        elfl c;
        c = axol.c(this.c, ffhe.a, ffsm.a, new aqau(this, null));
        return c;
    }

    @Override // defpackage.aqge
    public final /* bridge */ /* synthetic */ Object c() {
        throw new UnsupportedOperationException();
    }
}
