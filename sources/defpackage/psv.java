package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class psv extends ovj {
    public psv() {
        super(18, 19);
    }

    @Override // defpackage.ovj
    public final void a(oxi oxiVar) {
        oxiVar.g("ALTER TABLE `WorkSpec` ADD COLUMN `stop_reason` INTEGER NOT NULL DEFAULT -256");
    }
}
