package defpackage;

import android.content.Context;
import android.database.ContentObserver;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class upp {
    public static final cskc a = cskc.g("Bugle", "BaseMessageListManager");
    protected final Context b;
    protected final ConversationIdType c;
    public final ContentObserver d;
    protected final mz f;
    public final azei g;
    protected final BlockingQueue e = new LinkedBlockingQueue();
    protected final Map h = new cmh();
    protected final Map i = new cmh();
    protected final AtomicBoolean j = new AtomicBoolean(false);
    public final upo k = new upo(this);
    private final AtomicBoolean l = new AtomicBoolean(false);

    public upp(elbx elbxVar, Context context, ConversationIdType conversationIdType, mz mzVar, azei azeiVar) {
        upn upnVar = new upn(this, elbxVar);
        this.d = upnVar;
        this.b = context;
        this.c = conversationIdType;
        this.f = mzVar;
        this.g = azeiVar;
        context.getContentResolver().registerContentObserver(bcqc.b(context, conversationIdType), true, upnVar);
    }

    protected final void a(int i, bcse bcseVar) {
        mz mzVar = this.f;
        bcse bcseVar2 = i == mzVar.g + (-1) ? null : (bcse) mzVar.e(i + 1);
        bcse bcseVar3 = i != 0 ? (bcse) this.f.e(i - 1) : null;
        bcseVar.bf(bcseVar2);
        bcseVar.be(bcseVar3);
        if (bcseVar2 != null && (bcseVar2.be(bcseVar) || i == 0)) {
            this.f.k(i + 1, bcseVar2);
        }
        if (bcseVar3 == null || !bcseVar3.bf(bcseVar)) {
            return;
        }
        this.f.k(i - 1, bcseVar3);
    }

    public final void b(int i) {
        bcse bcseVar = i <= 0 ? null : (bcse) this.f.e(i - 1);
        mz mzVar = this.f;
        bcse bcseVar2 = i <= mzVar.g + (-1) ? (bcse) mzVar.e(i) : null;
        if (bcseVar != null && bcseVar.bf(bcseVar2)) {
            this.f.k(i - 1, bcseVar);
        }
        if (bcseVar2 == null || !bcseVar2.be(bcseVar)) {
            return;
        }
        this.f.k(i, bcseVar2);
    }

    protected final void c() {
        if (this.j.get() || this.l.getAndSet(true)) {
            return;
        }
        this.g.e(this.k);
    }

    protected abstract void d();

    protected final void e(bcse bcseVar) {
        c();
        if (!bcseVar.u().c() && bcseVar.u().a != -1) {
            this.h.put(bcseVar.u(), bcseVar);
        }
        if (bcseVar.w().k()) {
            this.i.put(bcseVar.w(), bcseVar);
        }
    }

    protected abstract void f(MessageIdType messageIdType, bdhg bdhgVar);

    protected abstract void g(MessageCoreData messageCoreData);
}
