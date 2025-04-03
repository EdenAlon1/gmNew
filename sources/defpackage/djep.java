package defpackage;

import com.google.android.rcs.client.messaging.MessagingOperationResult;
import com.google.android.rcs.client.messaging.MessagingResult;
import com.google.android.rcs.client.messaging.data.Conversation;
import com.google.android.rcs.client.messaging.data.Message;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djep implements dkjz {
    private final SettableFuture a = SettableFuture.create();
    private final dkkq b;
    private final Message c;
    private final Conversation d;
    private final dkjt e;

    public djep(dkkq dkkqVar, Conversation conversation, Message message, dkjt dkjtVar) {
        this.b = dkkqVar;
        this.c = message;
        this.d = conversation;
        this.e = dkjtVar;
    }

    @Override // defpackage.dkjz
    public final void a(dkjt dkjtVar, int i) {
        if (this.e.equals(dkjtVar)) {
            this.b.w(this);
            eibw d = MessagingResult.d();
            int i2 = 15;
            if (i != 9 && i != 1 && i != 4 && i != 11) {
                i2 = 16;
            }
            d.c(i2);
            MessagingResult e = d.e();
            SettableFuture settableFuture = this.a;
            eibu e2 = MessagingOperationResult.e();
            e2.e(e);
            e2.b(this.d);
            e2.d(this.c.h());
            settableFuture.set(e2.a());
        }
    }

    @Override // defpackage.dkjz
    public final void b(dkjt dkjtVar) {
        if (this.e.equals(dkjtVar)) {
            this.b.w(this);
            SettableFuture settableFuture = this.a;
            eibu e = MessagingOperationResult.e();
            e.e(MessagingResult.d);
            e.b(this.d);
            e.d(this.c.h());
            settableFuture.set(e.a());
        }
    }

    @Override // defpackage.dkjz
    public final void c(dkjt dkjtVar) {
        throw null;
    }

    public final ListenableFuture d() {
        this.b.t(this);
        try {
            dkkq dkkqVar = this.b;
            dkjt dkjtVar = this.e;
            try {
                if (dkjtVar.a == dkjs.DISPOSITION_NOTIFICATION) {
                    dkty.w(2, 3, "Pager message queued with messageid=%s", dkjtVar.k);
                }
                dkkqVar.r.put(dkjtVar);
            } catch (InterruptedException e) {
                throw new eejg("Unable to queue message for sending", e);
            }
        } catch (eejg e2) {
            this.a.setException(e2);
        }
        return this.a;
    }
}
