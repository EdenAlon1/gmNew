package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfbc extends duak {
    public cfbc() {
        super("work_queue");
    }

    @Override // defpackage.duak
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final cfbb b() {
        ah();
        return new cfbb(this.c, this.a, this.b, this.d.g(), this.e.g());
    }

    public final void c(long j) {
        String[] strArr = cfbf.a;
        cfbe cfbeVar = new cfbe();
        cfbeVar.c(j);
        aj(new cfbd(cfbeVar), "work_queue-buildAndUpdateForId");
    }

    public final void d() {
        int intValue = cfbf.c().intValue();
        int intValue2 = cfbf.c().intValue();
        if (intValue2 < 45030) {
            dtub.w("scheduled_in_workmanager", intValue2);
        }
        if (intValue >= 45030) {
            this.a.put("scheduled_in_workmanager", (Boolean) true);
        }
    }
}
