package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class deih implements cbcl {
    private static final entd b = entd.c("BugleJobs");
    private final ffbr c;
    private final ffbr d;
    private final ffbr e;

    public deih(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3) {
        this.c = ffbrVar;
        this.e = ffbrVar3;
        this.d = ffbrVar2;
    }

    @Override // defpackage.cbcl
    public final void a(cbcn cbcnVar) {
        ekzz f = eleg.f("SyncDataToWearableAppHandlerScheduler#queue");
        try {
            int i = cbcnVar.b;
            if (i == 2 || i == 1) {
                ekzz f2 = eleg.f("SyncDataToWearableAppHandlerScheduler#checkSkipSync");
                try {
                    if (((cvhr) this.e.b()).b()) {
                        f2.close();
                        entd entdVar = b;
                        ensz enszVar = (ensz) entdVar.g();
                        enszVar.Y(csux.O, "SyncDataToWearableAppHandlerScheduler");
                        ((ensz) enszVar.h("com/google/android/apps/messaging/wearable/workhandler/SyncDataToWearableAppHandlerScheduler", "queue", 69, "SyncDataToWearableAppHandlerScheduler.java")).q("Queue broadcast wear data work item.");
                        ekzz f3 = eleg.f("SyncDataToWearableAppHandlerScheduler#queueWearSync");
                        try {
                            deii deiiVar = (deii) this.c.b();
                            cetp cetpVar = new cetp();
                            cetpVar.b = "sync_data_to_wearable_app_dedupe";
                            deiiVar.b(cetpVar.a());
                            f3.close();
                            if (cbcnVar.b == 2) {
                                f3 = eleg.f("SyncDataToWearableAppHandlerScheduler#queueConversationSync");
                                try {
                                    ensk o = entdVar.o();
                                    o.Y(csux.O, "SyncDataToWearableAppHandlerScheduler");
                                    ((ensz) o.h("com/google/android/apps/messaging/wearable/workhandler/SyncDataToWearableAppHandlerScheduler", "queue", 87, "SyncDataToWearableAppHandlerScheduler.java")).q("Queue sync conversation data to wearable work item.");
                                    for (String str : cbcnVar.c) {
                                        dehr dehrVar = (dehr) this.d.b();
                                        dehs dehsVar = (dehs) deht.a.createBuilder();
                                        dehsVar.copyOnWrite();
                                        deht dehtVar = (deht) dehsVar.instance;
                                        str.getClass();
                                        dehtVar.b = str;
                                        deht dehtVar2 = (deht) dehsVar.build();
                                        cetp cetpVar2 = new cetp();
                                        cetpVar2.b = str;
                                        ((cevh) dehrVar.a.b()).a(ceyr.h("sync_conversation_data_to_wearable", dehtVar2, cetpVar2.a()));
                                    }
                                    f3.close();
                                } finally {
                                }
                            }
                        } finally {
                        }
                    } else {
                        ensk o2 = b.o();
                        o2.Y(csux.O, "SyncDataToWearableAppHandlerScheduler");
                        ((ensz) o2.h("com/google/android/apps/messaging/wearable/workhandler/SyncDataToWearableAppHandlerScheduler", "queue", 61, "SyncDataToWearableAppHandlerScheduler.java")).q("Skipping scheduling sync to wear devices.");
                        f2.close();
                    }
                } finally {
                    try {
                        f2.close();
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                    }
                }
            }
            f.close();
        } catch (Throwable th2) {
            try {
                f.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }
}
