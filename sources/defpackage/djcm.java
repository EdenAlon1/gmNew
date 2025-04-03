package defpackage;

import com.google.android.rcs.client.messaging.MessagingOperationResult;
import com.google.android.rcs.client.messaging.MessagingResult;
import com.google.android.rcs.client.messaging.data.Conversation;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djcm extends dkji {
    private final SettableFuture a = SettableFuture.create();
    private final Conversation b;
    private final dkkj c;
    private final dkjt d;
    private final djfw e;

    public djcm(djfw djfwVar, Conversation conversation, dkjt dkjtVar, dkkj dkkjVar) {
        this.b = conversation;
        this.d = dkjtVar;
        this.c = dkkjVar;
        this.e = djfwVar;
    }

    @Override // defpackage.dkji, defpackage.dkjz
    public final void a(dkjt dkjtVar, int i) {
        this.c.aU(this);
        MessagingResult a = this.e.apply(this.c.S);
        eibu e = MessagingOperationResult.e();
        e.e(a);
        e.b(this.b);
        String str = this.d.k;
        str.getClass();
        e.d(str);
        this.a.set(e.a());
        this.c.l();
    }

    @Override // defpackage.dkji, defpackage.dkjz
    public final void b(dkjt dkjtVar) {
        this.c.aU(this);
        eibu e = MessagingOperationResult.e();
        e.e(MessagingResult.d);
        e.b(this.b);
        String str = this.d.k;
        str.getClass();
        e.d(str);
        e.c(false);
        this.a.set(e.a());
        this.c.l();
    }

    final ListenableFuture d(dkjt dkjtVar) {
        this.c.aF(this);
        dkkj dkkjVar = this.c;
        dkkjVar.N = dkjtVar;
        dkkjVar.j();
        return this.a;
    }
}
