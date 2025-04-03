package defpackage;

import com.google.android.rcs.client.messaging.data.Conversation;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djde extends fbbs {
    private final fbbm b;

    public djde(fbbf fbbfVar, fbbf fbbfVar2, fbbm fbbmVar) {
        super(fbbfVar2, new fbcd(djde.class), fbbfVar);
        this.b = fbbz.c(fbbmVar);
    }

    @Override // defpackage.fbbs
    public final /* bridge */ /* synthetic */ ListenableFuture b(Object obj) {
        Conversation c;
        djeb djebVar = (djeb) obj;
        diyy diyyVar = djdd.a;
        if (djebVar.b().isPresent()) {
            c = djhf.d((dkkj) djebVar.b().get());
        } else {
            if (!djebVar.a().isPresent()) {
                throw new IllegalArgumentException("No message or session presented");
            }
            c = djhf.c((dkjt) djebVar.a().get());
        }
        return erqt.i(c);
    }

    @Override // defpackage.fbbs
    protected final ListenableFuture c() {
        return this.b.d();
    }
}
