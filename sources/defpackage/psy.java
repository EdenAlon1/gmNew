package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class psy extends ovj {
    public psy() {
        super(22, 23);
    }

    @Override // defpackage.ovj
    public final void a(oxi oxiVar) {
        oxiVar.g("ALTER TABLE `WorkSpec` ADD COLUMN `trace_tag` TEXT DEFAULT NULL");
    }
}
