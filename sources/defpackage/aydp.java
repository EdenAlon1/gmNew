package defpackage;

import j$.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aydp extends ffhv implements ffjm {
    int a;
    final /* synthetic */ aydq b;
    final /* synthetic */ ceuw c;
    final /* synthetic */ ayds d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aydp(aydq aydqVar, ceuw ceuwVar, ayds aydsVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = aydqVar;
        this.c = ceuwVar;
        this.d = aydsVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aydp) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Set ar;
        ecda ecdaVar;
        ffhh ffhhVar = ffhh.a;
        int i = 10;
        try {
            try {
                if (this.a != 0) {
                    ffci.b(obj);
                } else {
                    ffci.b(obj);
                    Iterator it = ((Set) this.b.c.b()).iterator();
                    while (it.hasNext()) {
                        ((cbft) it.next()).c();
                    }
                    if (((cetk) this.c.a()).c == 0) {
                        aydq aydqVar = this.b;
                        int b = ayec.b(this.d.e);
                        if (b == 0) {
                            b = 1;
                        }
                        Object b2 = aydqVar.f.b();
                        b2.getClass();
                        int i2 = b - 2;
                        axuo.c((akzt) b2, (i2 == 1 || i2 == 2) ? 2 : i2 != 4 ? 5 : 11);
                    }
                    aydu ayduVar = (aydu) this.b.b.b();
                    eygr eygrVar = this.d.d;
                    eygrVar.getClass();
                    if (ffdx.at(eygrVar)) {
                        eygr eygrVar2 = this.d.d;
                        eygrVar2.getClass();
                        ArrayList arrayList = new ArrayList(ffdx.n(eygrVar2, 10));
                        Iterator<E> it2 = eygrVar2.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(new Long(((aydh) it2.next()).b));
                        }
                        ar = ffdx.ar(arrayList);
                    } else {
                        eygl eyglVar = this.d.c;
                        eyglVar.getClass();
                        ar = ffdx.ar(eyglVar);
                    }
                    this.a = 1;
                    if (ayduVar.b(ar, this) == ffhhVar) {
                        return ffhhVar;
                    }
                }
                aydq aydqVar2 = this.b;
                eygr<aydh> eygrVar3 = this.d.d;
                eygrVar3.getClass();
                ArrayList arrayList2 = new ArrayList(ffdx.n(eygrVar3, 10));
                for (aydh aydhVar : eygrVar3) {
                    aydhVar.getClass();
                    long j = aydhVar.b;
                    Instant ofEpochMilli = Instant.ofEpochMilli(aydhVar.c);
                    ofEpochMilli.getClass();
                    arrayList2.add(new axvr(j, ofEpochMilli));
                }
                int b3 = ayec.b(this.d.e);
                if (b3 == 0) {
                    b3 = 1;
                }
                if (!arrayList2.isEmpty()) {
                    int i3 = b3 - 2;
                    if (i3 == 1) {
                        ecdaVar = axup.r;
                    } else if (i3 != 2) {
                        ensk h = aydq.a.h();
                        h.Y(ente.a, "BugleRecipientSync");
                        ((enrr) h.h("com/google/android/apps/messaging/shared/contacts/sync/incremental/recipient/ContactRecipientDeletedSyncHandler", "getRecipientsSyncLatencyTimerNameOrNull", 171, "ContactRecipientDeletedSyncHandler.kt")).t("Trigger source of %s will not have its sync duration logged.", b3 != 2 ? b3 != 3 ? b3 != 4 ? b3 != 5 ? b3 != 6 ? "UNRECOGNIZED" : "DELETED_SYNC_TRIGGER_IMPORT" : "DELETED_SYNC_TRIGGER_FORCED" : "DELETED_SYNC_TRIGGER_WORKER" : "DELETED_SYNC_TRIGGER_OBSERVER" : "DELETED_SYNC_TRIGGER_UNSPECIFIED");
                        ecdaVar = null;
                    } else {
                        ecdaVar = axup.t;
                    }
                    ecda ecdaVar2 = ecdaVar;
                    if (ecdaVar2 != null) {
                        long epochMilli = ((cqoh) aydqVar2.e.b()).f().toEpochMilli();
                        long epochMilli2 = axvs.b(arrayList2).toEpochMilli();
                        if (epochMilli2 <= epochMilli) {
                            ((ecre) aydqVar2.d.b()).b(ecdaVar2, epochMilli2, epochMilli, ecrh.SUCCESS);
                        } else {
                            ensk j2 = aydq.a.j();
                            j2.Y(ente.a, "BugleRecipientSync");
                            ((enrr) j2.h("com/google/android/apps/messaging/shared/contacts/sync/incremental/recipient/ContactRecipientDeletedSyncHandler", "logTotalSyncLatency", 157, "ContactRecipientDeletedSyncHandler.kt")).t("Invalid duration for %s", ecdaVar2.a);
                        }
                    }
                }
                ceyt i4 = ceyt.i();
                Iterator it3 = ((Set) this.b.c.b()).iterator();
                while (it3.hasNext()) {
                    ((cbft) it3.next()).d();
                }
                return i4;
            } catch (Exception e) {
                ensk j3 = aydq.a.j();
                j3.Y(ente.a, "BugleRecipientSync");
                ((enrr) ((enrr) j3).g(e).h("com/google/android/apps/messaging/shared/contacts/sync/incremental/recipient/ContactRecipientDeletedSyncHandler$processPendingWorkItemAsync$1", "invokeSuspend", 93, "ContactRecipientDeletedSyncHandler.kt")).q("Caught exception while syncing deleted contacts to recipients. Marking WorkQueueResult as failedRetry.");
                aydq aydqVar3 = this.b;
                int b4 = ayec.b(this.d.e);
                if (b4 == 0) {
                    b4 = 1;
                }
                Object b5 = aydqVar3.f.b();
                b5.getClass();
                akzt akztVar = (akzt) b5;
                int i5 = b4 - 2;
                if (i5 == 1 || i5 == 2) {
                    i = 7;
                } else if (i5 == 4) {
                    i = 12;
                }
                axuo.c(akztVar, i);
                ceyt m = ceyt.m();
                Iterator it4 = ((Set) this.b.c.b()).iterator();
                while (it4.hasNext()) {
                    ((cbft) it4.next()).d();
                }
                return m;
            }
        } catch (Throwable th) {
            Iterator it5 = ((Set) this.b.c.b()).iterator();
            while (it5.hasNext()) {
                ((cbft) it5.next()).d();
            }
            throw th;
        }
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aydp(this.b, this.c, this.d, ffguVar);
    }
}
