package defpackage;

import j$.util.Optional;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cgla implements dyix {
    private static final cskc b = cskc.g("Lighter", "BugleDataStoreEventsReceiver");
    public final amtn a;
    private final ffbr c;
    private final ffbr d;
    private final ffbr e;
    private final ffbr f;

    public cgla(amtn amtnVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4) {
        this.a = amtnVar;
        this.c = ffbrVar;
        this.d = ffbrVar2;
        this.e = ffbrVar3;
        this.f = ffbrVar4;
    }

    private final amtr e(dzpt dzptVar) {
        amtr amtrVar = (amtr) amts.a.createBuilder();
        String d = dzptVar.c().d();
        amtrVar.copyOnWrite();
        amts amtsVar = (amts) amtrVar.instance;
        amtsVar.b |= 1;
        amtsVar.c = d;
        String jSONObject = ((JSONObject) dzptVar.f().c()).toString();
        amtrVar.copyOnWrite();
        amts amtsVar2 = (amts) amtrVar.instance;
        jSONObject.getClass();
        amtsVar2.b |= 2;
        amtsVar2.d = jSONObject;
        if (((Boolean) this.f.b()).booleanValue()) {
            long epochMilli = ((cqoh) this.e.b()).f().toEpochMilli();
            amtrVar.copyOnWrite();
            amts amtsVar3 = (amts) amtrVar.instance;
            amtsVar3.b |= 1024;
            amtsVar3.m = epochMilli;
        }
        return amtrVar;
    }

    @Override // defpackage.dyiw
    public final void a(dzja dzjaVar, dzpt dzptVar) {
        cskc cskcVar = b;
        cskcVar.m("BugleDataStoreEventsReceiver#onConversationMessageUpdated called for business_id: ".concat(dzptVar.c().d()));
        Optional ofNullable = Optional.ofNullable((dzqs) dyjq.a(((dyol) ((dygx) this.c.b()).c()).l(dzjaVar).w(dzptVar)).f());
        if (!ofNullable.isPresent()) {
            cskcVar.r("No messages on conversation, setting empty values for Message fields.");
            amtn amtnVar = this.a;
            amtr e = e(dzptVar);
            e.copyOnWrite();
            amts amtsVar = (amts) e.instance;
            amts amtsVar2 = amts.a;
            amtsVar.b |= 8;
            amtsVar.f = "";
            e.copyOnWrite();
            amts amtsVar3 = (amts) e.instance;
            amtsVar3.b |= 64;
            amtsVar3.i = true;
            e.copyOnWrite();
            amts amtsVar4 = (amts) e.instance;
            amtsVar4.b |= 128;
            amtsVar4.j = false;
            amtnVar.a((amts) e.build());
            ((akzt) this.d.b()).e("Bugle.UnifiedInbox.EventsReceivers.Count", 5);
            ((akzt) this.d.b()).e("Bugle.UnifiedInbox.DataSync.Errors.Count", 1);
            return;
        }
        amtn amtnVar2 = this.a;
        amtr e2 = e(dzptVar);
        long millis = TimeUnit.MICROSECONDS.toMillis(((dzqs) ofNullable.get()).d());
        e2.copyOnWrite();
        amts amtsVar5 = (amts) e2.instance;
        amts amtsVar6 = amts.a;
        amtsVar5.b |= 32;
        amtsVar5.h = millis;
        String str = (String) ((dzqs) ofNullable.get()).m().e("");
        e2.copyOnWrite();
        amts amtsVar7 = (amts) e2.instance;
        amtsVar7.b |= 8;
        amtsVar7.f = str;
        boolean z = !((dzqs) ofNullable.get()).i().equals(dzqm.INCOMING_RECEIVED);
        e2.copyOnWrite();
        amts amtsVar8 = (amts) e2.instance;
        amtsVar8.b |= 64;
        amtsVar8.i = z;
        boolean contains = dzqm.n.contains(((dzqs) ofNullable.get()).i());
        e2.copyOnWrite();
        amts amtsVar9 = (amts) e2.instance;
        amtsVar9.b |= 128;
        amtsVar9.j = contains;
        amtnVar2.a((amts) e2.build());
        ((akzt) this.d.b()).e("Bugle.UnifiedInbox.EventsReceivers.Count", 5);
    }

    @Override // defpackage.dyiw
    public final void b(dzja dzjaVar, dzpt dzptVar) {
        dzpt dzptVar2;
        cskc cskcVar = b;
        cskcVar.m("BugleDataStoreEventsReceiver#onConversationUpdated called for business_id: ".concat(dzptVar.c().d()));
        dyol dyolVar = (dyol) ((dygx) this.c.b()).c();
        emxc v = dyolVar.l(dzjaVar).v(dzptVar);
        if (v.g()) {
            dyhj.a();
            final long currentTimeMillis = System.currentTimeMillis();
            dzptVar2 = dzptVar;
            dyolVar.k(dzjaVar, dzptVar2, v, new emxg() { // from class: dynh
                @Override // defpackage.emxg
                public final boolean a(Object obj) {
                    return currentTimeMillis > ((dzpk) obj).b();
                }
            }, new emxg() { // from class: dyni
                @Override // defpackage.emxg
                public final boolean a(Object obj) {
                    return currentTimeMillis > ((dzpk) obj).e();
                }
            });
            v = dyolVar.b(dzjaVar, v);
        } else {
            dzptVar2 = dzptVar;
        }
        Optional ofNullable = Optional.ofNullable((dzpk) v.f());
        if (ofNullable.isEmpty()) {
            cskcVar.m("Dropping onConversationUpdated. No matching conversation on Lighter DB");
            return;
        }
        amtr e = e(dzptVar2);
        String str = (String) ((dzpk) ofNullable.get()).l().e("");
        e.copyOnWrite();
        amts amtsVar = (amts) e.instance;
        amts amtsVar2 = amts.a;
        amtsVar.b |= 4;
        amtsVar.e = str;
        String str2 = (String) ((dzpk) ofNullable.get()).j().e("");
        e.copyOnWrite();
        amts amtsVar3 = (amts) e.instance;
        amtsVar3.b |= 16;
        amtsVar3.g = str2;
        long a = ((dzpk) ofNullable.get()).a();
        e.copyOnWrite();
        amts amtsVar4 = (amts) e.instance;
        amtsVar4.b |= 512;
        amtsVar4.l = a;
        if (!((dzpk) ofNullable.get()).l().g() || !((dzpk) ofNullable.get()).j().g()) {
            ((akzt) this.d.b()).e("Bugle.UnifiedInbox.DataSync.Errors.Count", 2);
        }
        this.a.a((amts) e.build());
        ((akzt) this.d.b()).e("Bugle.UnifiedInbox.EventsReceivers.Count", 2);
    }

    @Override // defpackage.dyiv
    public final void c() {
        ((akzt) this.d.b()).e("Bugle.UnifiedInbox.EventsReceivers.Count", 1);
    }

    @Override // defpackage.dyiw
    public final void d(dzpt dzptVar, boolean z) {
        b.m("BugleDataStoreEventsReceiver#onConversationBlockStatusUpdated called for business_id: ".concat(dzptVar.c().d()));
        amtr e = e(dzptVar);
        e.copyOnWrite();
        amts amtsVar = (amts) e.instance;
        amts amtsVar2 = amts.a;
        amtsVar.b |= 256;
        amtsVar.k = z;
        this.a.a((amts) e.build());
        ((akzt) this.d.b()).e("Bugle.UnifiedInbox.EventsReceivers.Count", 4);
    }
}
