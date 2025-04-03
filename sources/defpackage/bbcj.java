package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction;
import com.google.android.apps.messaging.shared.datamodel.action.execution.ActionExecutorImpl;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bbcj {
    public final int a;
    public String b;
    public final bbci c;
    public final List d = new ArrayList();
    public bbch e;
    public final cniz f;
    public final boolean g;

    public bbcj(String str, int i, bbci bbciVar, cniz cnizVar, boolean z) {
        this.a = i;
        this.c = bbciVar;
        this.f = cnizVar;
        this.g = z;
        this.b = str;
    }

    public static int a(Action action) {
        return action instanceof ThrottledAction ? ((ThrottledAction) action).f() : action.s.hashCode();
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [bbch, bbdd] */
    public final ListenableFuture b(Action action) {
        this.d.add(action);
        action.z(this);
        csix.l(this.e);
        ?? r5 = this.e;
        if (r5 == 0) {
            return erqt.h(new RuntimeException("JobData has no ActionListener"));
        }
        ActionExecutorImpl actionExecutorImpl = (ActionExecutorImpl) r5;
        actionExecutorImpl.i();
        actionExecutorImpl.q.incrementAndGet();
        bbcd.e(action, 1, 2);
        SettableFuture create = SettableFuture.create();
        String c = action.c();
        if (!TextUtils.isEmpty(c)) {
            actionExecutorImpl.d.c(c, action.s);
        }
        bbeg bbegVar = new bbeg(this, action, create, r5, ((atkz) actionExecutorImpl.h.b()).a() ? actionExecutorImpl.g : actionExecutorImpl.f, actionExecutorImpl.l, actionExecutorImpl.m, actionExecutorImpl.n);
        bbegVar.c(actionExecutorImpl.d.a("Bugle.DataModel.ActionBreakdown.ExecutionQueue.Latency", action.w, action.s));
        synchronized (actionExecutorImpl.o) {
            ((ActionExecutorImpl) r5).i.add(bbegVar);
            ((ActionExecutorImpl) r5).j.a(((ActionExecutorImpl) r5).r);
        }
        actionExecutorImpl.d("ACTION_EXECUTE_QUEUED_", action);
        return create;
    }

    public final boolean c() {
        return this.f != null;
    }
}
