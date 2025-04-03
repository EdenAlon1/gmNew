package defpackage;

import com.google.android.rcs.client.messaging.data.Conversation;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.io.IOException;
import java.util.List;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djdh extends fbbs {
    private final fbbm b;
    private final fbbm c;
    private final fbbm d;

    public djdh(fbbf fbbfVar, fbbf fbbfVar2, fbbm fbbmVar, fbbm fbbmVar2, fbbm fbbmVar3) {
        super(fbbfVar2, new fbcd(djdh.class), fbbfVar);
        this.b = fbbz.c(fbbmVar);
        this.c = fbbz.c(fbbmVar2);
        this.d = fbbz.c(fbbmVar3);
    }

    @Override // defpackage.fbbs
    public final /* bridge */ /* synthetic */ ListenableFuture b(Object obj) {
        List list = (List) obj;
        final Conversation conversation = (Conversation) list.get(0);
        Optional optional = (Optional) list.get(1);
        final djfv djfvVar = (djfv) list.get(2);
        diyy diyyVar = djdd.a;
        return erqt.i(optional.map(new Function() { // from class: djdc
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                dkjt dkjtVar = (dkjt) obj2;
                diyy diyyVar2 = djdd.a;
                try {
                    return djfv.this.d(conversation, dkjtVar);
                } catch (IOException e) {
                    throw new IllegalArgumentException("Error converting Instant message to Message", e);
                }
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }));
    }

    @Override // defpackage.fbbs
    protected final ListenableFuture c() {
        fbbm fbbmVar = this.d;
        return erqt.f(this.b.d(), this.c.d(), fbbmVar.d());
    }
}
