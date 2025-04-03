package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class prm extends ovj {
    public static final prm c = new prm();

    private prm() {
        super(1, 2);
    }

    @Override // defpackage.ovj
    public final void a(oxi oxiVar) {
        oxiVar.g("\n    CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id`\n    INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`)\n    REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )\n    ");
        oxiVar.g("\n    INSERT INTO SystemIdInfo(work_spec_id, system_id)\n    SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo\n    ");
        oxiVar.g("DROP TABLE IF EXISTS alarmInfo");
        oxiVar.g("\n                INSERT OR IGNORE INTO worktag(tag, work_spec_id)\n                SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec\n                ");
    }
}
