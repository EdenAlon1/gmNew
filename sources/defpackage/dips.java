package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.ims.events.EventHubProxy;
import com.google.android.ims.rcsservice.events.Event;
import com.google.android.ims.util.common.RcsIntents;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dips {
    private static final dktn c = new dktn(dips.class.getName());
    public final EventHubProxy a;
    public final EventHubProxy b;
    private final Context d;
    private final dikt e;

    public dips(Context context, dikt diktVar, errl errlVar) {
        this.d = context;
        this.e = diktVar;
        this.a = new EventHubProxy("ENGINE", errlVar);
        this.b = new EventHubProxy("UI", errlVar);
    }

    private final void e(Event event, dkuj dkujVar) {
        Intent intent = new Intent(RcsIntents.ACTION_NEW_EVENT);
        intent.putExtra(RcsIntents.EXTRA_EVENT, event);
        dkuk.a(this.d, intent, dkujVar);
        f(event, 3);
    }

    private final void f(Event event, int i) {
        int i2;
        int i3 = event.g;
        if (i3 == 2 || (i2 = event.h) == 50050) {
            return;
        }
        int b = eyqt.b(i3);
        dktn dktnVar = c;
        if (b == 0) {
            throw null;
        }
        dkty.l(dktnVar, "Event sent, category: %s, method: %s, code: %s", eyqt.a(b), eyqx.a(i), Integer.valueOf(i2));
        dkty.w(1, 3, "Event sent, category: %s, method: %s, code: %s", eyqt.a(b), eyqx.a(i), Integer.valueOf(event.h));
        eyqr eyqrVar = (eyqr) eyqy.a.createBuilder();
        eyqrVar.copyOnWrite();
        eyqy eyqyVar = (eyqy) eyqrVar.instance;
        eyqyVar.g = i - 1;
        eyqyVar.b |= 4;
        int b2 = eyqt.b(event.g);
        eyqrVar.copyOnWrite();
        eyqy eyqyVar2 = (eyqy) eyqrVar.instance;
        if (b2 == 0) {
            throw null;
        }
        eyqyVar2.e = b2 - 1;
        eyqyVar2.b |= 1;
        int i4 = event.h;
        eyqrVar.copyOnWrite();
        eyqy eyqyVar3 = (eyqy) eyqrVar.instance;
        eyqyVar3.b = 2 | eyqyVar3.b;
        eyqyVar3.f = i4;
        int a = dipx.a(event.i);
        eyqrVar.copyOnWrite();
        eyqy eyqyVar4 = (eyqy) eyqrVar.instance;
        eyqyVar4.h = a - 1;
        eyqyVar4.b |= 8;
        event.e(eyqrVar);
        dikt diktVar = this.e;
        Context context = this.d;
        eyqy eyqyVar5 = (eyqy) eyqrVar.build();
        ezfn ezfnVar = (ezfn) ezfo.a.createBuilder();
        ezfnVar.copyOnWrite();
        ezfo ezfoVar = (ezfo) ezfnVar.instance;
        eyqyVar5.getClass();
        ezfoVar.d = eyqyVar5;
        ezfoVar.c = 12;
        diktVar.i(context, ezfnVar, ezee.EVENT_HUB_EVENT);
    }

    public final void a(Event event, dkuj dkujVar) {
        if (((Boolean) EventHubProxy.DD_NOT_MERGE_EVENTS.a()).booleanValue()) {
            c(event, dkujVar);
            return;
        }
        this.a.postMergableEvent(event);
        if (this.b.hasSubscribersForEventCategory(event.g)) {
            this.b.postMergableEvent(event);
            f(event, 2);
        } else {
            dkty.d(c, "Did not post mergable event to UI (it may not be running), falling back to Intent", new Object[0]);
            e(event, dkujVar);
        }
    }

    public final void b(Event event, dkuj dkujVar) {
        this.a.postOverridingEvent(event);
        if (this.b.hasSubscribersForEventCategory(event.g)) {
            this.b.postOverridingEvent(event);
            f(event, 2);
        } else {
            dkty.d(c, "Did not post overriding event to UI (it may not be running), falling back to Intent", new Object[0]);
            e(event, dkujVar);
        }
    }

    public final void c(Event event, dkuj dkujVar) {
        this.a.postUniqueEvent(event);
        this.a.flushQueues();
        if (!this.b.hasSubscribersForEventCategory(event.g)) {
            dkty.d(c, "Did not post unique event to UI (it may not be running), falling back to Intent", new Object[0]);
            e(event, dkujVar);
        } else {
            this.b.postUniqueEvent(event);
            this.b.flushQueues();
            f(event, 2);
        }
    }

    public final void d(int i) {
        this.a.unsubscribe(5, i);
    }
}
