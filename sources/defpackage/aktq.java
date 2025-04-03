package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aktq {
    public final akvr a;

    public aktq(akvr akvrVar) {
        this.a = akvrVar;
    }

    public static akvt a() {
        akvs akvsVar = (akvs) akvt.a.createBuilder();
        akvsVar.copyOnWrite();
        akvt akvtVar = (akvt) akvsVar.instance;
        akvtVar.b |= 2;
        akvtVar.d = "com.google.android.apps.messaging.scheduledsend.scheduling.ScheduledSendTask";
        akvsVar.copyOnWrite();
        akvt akvtVar2 = (akvt) akvsVar.instance;
        akvtVar2.b |= 1;
        akvtVar2.c = "com.google.android.apps.messaging.scheduledsend.scheduling.ScheduledSendTask";
        return (akvt) akvsVar.build();
    }
}
