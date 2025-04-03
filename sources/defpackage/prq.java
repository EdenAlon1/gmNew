package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class prq extends ovj {
    public static final prq c = new prq();

    private prq() {
        super(7, 8);
    }

    @Override // defpackage.ovj
    public final void a(oxi oxiVar) {
        oxiVar.g("\n    CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec`(`period_start_time`)\n    ");
    }
}
