package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class psx extends ovj {
    public psx() {
        super(20, 21);
    }

    @Override // defpackage.ovj
    public final void a(oxi oxiVar) {
        oxiVar.g("ALTER TABLE `WorkSpec` ADD COLUMN `required_network_request` BLOB NOT NULL DEFAULT x''");
    }
}
