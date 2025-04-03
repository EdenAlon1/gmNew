package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pro extends ovj {
    public static final pro c = new pro();

    private pro() {
        super(4, 5);
    }

    @Override // defpackage.ovj
    public final void a(oxi oxiVar) {
        oxiVar.g("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
        oxiVar.g("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
    }
}
