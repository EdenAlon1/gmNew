package defpackage;

import androidx.work.impl.WorkDatabase_Impl;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class psz extends otg {
    public final /* synthetic */ WorkDatabase_Impl a;

    public psz(WorkDatabase_Impl workDatabase_Impl) {
        this.a = workDatabase_Impl;
    }

    @Override // defpackage.otg
    public final oth a(oxi oxiVar) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("work_spec_id", new owi("work_spec_id", "TEXT", true, 1, null, 1));
        hashMap.put("prerequisite_id", new owi("prerequisite_id", "TEXT", true, 2, null, 1));
        HashSet hashSet = new HashSet(2);
        hashSet.add(new owj("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        hashSet.add(new owj("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList("id")));
        HashSet hashSet2 = new HashSet(2);
        hashSet2.add(new owk("index_Dependency_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
        hashSet2.add(new owk("index_Dependency_prerequisite_id", false, Arrays.asList("prerequisite_id"), Arrays.asList("ASC")));
        owl owlVar = new owl("Dependency", hashMap, hashSet, hashSet2);
        owl a = owl.a(oxiVar, "Dependency");
        if (!owo.f(owlVar, a)) {
            return new oth(false, a.j(a, owlVar, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n", "\n Found:\n"));
        }
        HashMap hashMap2 = new HashMap(32);
        hashMap2.put("id", new owi("id", "TEXT", true, 1, null, 1));
        hashMap2.put("state", new owi("state", "INTEGER", true, 0, null, 1));
        hashMap2.put("worker_class_name", new owi("worker_class_name", "TEXT", true, 0, null, 1));
        hashMap2.put("input_merger_class_name", new owi("input_merger_class_name", "TEXT", true, 0, null, 1));
        hashMap2.put("input", new owi("input", "BLOB", true, 0, null, 1));
        hashMap2.put("output", new owi("output", "BLOB", true, 0, null, 1));
        hashMap2.put("initial_delay", new owi("initial_delay", "INTEGER", true, 0, null, 1));
        hashMap2.put("interval_duration", new owi("interval_duration", "INTEGER", true, 0, null, 1));
        hashMap2.put("flex_duration", new owi("flex_duration", "INTEGER", true, 0, null, 1));
        hashMap2.put("run_attempt_count", new owi("run_attempt_count", "INTEGER", true, 0, null, 1));
        hashMap2.put("backoff_policy", new owi("backoff_policy", "INTEGER", true, 0, null, 1));
        hashMap2.put("backoff_delay_duration", new owi("backoff_delay_duration", "INTEGER", true, 0, null, 1));
        hashMap2.put("last_enqueue_time", new owi("last_enqueue_time", "INTEGER", true, 0, "-1", 1));
        hashMap2.put("minimum_retention_duration", new owi("minimum_retention_duration", "INTEGER", true, 0, null, 1));
        hashMap2.put("schedule_requested_at", new owi("schedule_requested_at", "INTEGER", true, 0, null, 1));
        hashMap2.put("run_in_foreground", new owi("run_in_foreground", "INTEGER", true, 0, null, 1));
        hashMap2.put("out_of_quota_policy", new owi("out_of_quota_policy", "INTEGER", true, 0, null, 1));
        hashMap2.put("period_count", new owi("period_count", "INTEGER", true, 0, "0", 1));
        hashMap2.put("generation", new owi("generation", "INTEGER", true, 0, "0", 1));
        hashMap2.put("next_schedule_time_override", new owi("next_schedule_time_override", "INTEGER", true, 0, "9223372036854775807", 1));
        hashMap2.put("next_schedule_time_override_generation", new owi("next_schedule_time_override_generation", "INTEGER", true, 0, "0", 1));
        hashMap2.put("stop_reason", new owi("stop_reason", "INTEGER", true, 0, "-256", 1));
        hashMap2.put("trace_tag", new owi("trace_tag", "TEXT", false, 0, null, 1));
        hashMap2.put("required_network_type", new owi("required_network_type", "INTEGER", true, 0, null, 1));
        hashMap2.put("required_network_request", new owi("required_network_request", "BLOB", true, 0, "x''", 1));
        hashMap2.put("requires_charging", new owi("requires_charging", "INTEGER", true, 0, null, 1));
        hashMap2.put("requires_device_idle", new owi("requires_device_idle", "INTEGER", true, 0, null, 1));
        hashMap2.put("requires_battery_not_low", new owi("requires_battery_not_low", "INTEGER", true, 0, null, 1));
        hashMap2.put("requires_storage_not_low", new owi("requires_storage_not_low", "INTEGER", true, 0, null, 1));
        hashMap2.put("trigger_content_update_delay", new owi("trigger_content_update_delay", "INTEGER", true, 0, null, 1));
        hashMap2.put("trigger_max_content_delay", new owi("trigger_max_content_delay", "INTEGER", true, 0, null, 1));
        hashMap2.put("content_uri_triggers", new owi("content_uri_triggers", "BLOB", true, 0, null, 1));
        HashSet hashSet3 = new HashSet(0);
        HashSet hashSet4 = new HashSet(2);
        hashSet4.add(new owk("index_WorkSpec_schedule_requested_at", false, Arrays.asList("schedule_requested_at"), Arrays.asList("ASC")));
        hashSet4.add(new owk("index_WorkSpec_last_enqueue_time", false, Arrays.asList("last_enqueue_time"), Arrays.asList("ASC")));
        owl owlVar2 = new owl("WorkSpec", hashMap2, hashSet3, hashSet4);
        owl a2 = owl.a(oxiVar, "WorkSpec");
        if (!owo.f(owlVar2, a2)) {
            return new oth(false, a.j(a2, owlVar2, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n", "\n Found:\n"));
        }
        HashMap hashMap3 = new HashMap(2);
        hashMap3.put("tag", new owi("tag", "TEXT", true, 1, null, 1));
        hashMap3.put("work_spec_id", new owi("work_spec_id", "TEXT", true, 2, null, 1));
        HashSet hashSet5 = new HashSet(1);
        hashSet5.add(new owj("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        HashSet hashSet6 = new HashSet(1);
        hashSet6.add(new owk("index_WorkTag_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
        owl owlVar3 = new owl("WorkTag", hashMap3, hashSet5, hashSet6);
        owl a3 = owl.a(oxiVar, "WorkTag");
        if (!owo.f(owlVar3, a3)) {
            return new oth(false, a.j(a3, owlVar3, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n", "\n Found:\n"));
        }
        HashMap hashMap4 = new HashMap(3);
        hashMap4.put("work_spec_id", new owi("work_spec_id", "TEXT", true, 1, null, 1));
        hashMap4.put("generation", new owi("generation", "INTEGER", true, 2, "0", 1));
        hashMap4.put("system_id", new owi("system_id", "INTEGER", true, 0, null, 1));
        HashSet hashSet7 = new HashSet(1);
        hashSet7.add(new owj("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        owl owlVar4 = new owl("SystemIdInfo", hashMap4, hashSet7, new HashSet(0));
        owl a4 = owl.a(oxiVar, "SystemIdInfo");
        if (!owo.f(owlVar4, a4)) {
            return new oth(false, a.j(a4, owlVar4, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n", "\n Found:\n"));
        }
        HashMap hashMap5 = new HashMap(2);
        hashMap5.put("name", new owi("name", "TEXT", true, 1, null, 1));
        hashMap5.put("work_spec_id", new owi("work_spec_id", "TEXT", true, 2, null, 1));
        HashSet hashSet8 = new HashSet(1);
        hashSet8.add(new owj("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        HashSet hashSet9 = new HashSet(1);
        hashSet9.add(new owk("index_WorkName_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
        owl owlVar5 = new owl("WorkName", hashMap5, hashSet8, hashSet9);
        owl a5 = owl.a(oxiVar, "WorkName");
        if (!owo.f(owlVar5, a5)) {
            return new oth(false, a.j(a5, owlVar5, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n", "\n Found:\n"));
        }
        HashMap hashMap6 = new HashMap(2);
        hashMap6.put("work_spec_id", new owi("work_spec_id", "TEXT", true, 1, null, 1));
        hashMap6.put("progress", new owi("progress", "BLOB", true, 0, null, 1));
        HashSet hashSet10 = new HashSet(1);
        hashSet10.add(new owj("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        owl owlVar6 = new owl("WorkProgress", hashMap6, hashSet10, new HashSet(0));
        owl a6 = owl.a(oxiVar, "WorkProgress");
        if (!owo.f(owlVar6, a6)) {
            return new oth(false, a.j(a6, owlVar6, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n", "\n Found:\n"));
        }
        HashMap hashMap7 = new HashMap(2);
        hashMap7.put("key", new owi("key", "TEXT", true, 1, null, 1));
        hashMap7.put("long_value", new owi("long_value", "INTEGER", false, 0, null, 1));
        owl owlVar7 = new owl("Preference", hashMap7, new HashSet(0), new HashSet(0));
        owl a7 = owl.a(oxiVar, "Preference");
        return !owo.f(owlVar7, a7) ? new oth(false, a.j(a7, owlVar7, "Preference(androidx.work.impl.model.Preference).\n Expected:\n", "\n Found:\n")) : new oth(true, null);
    }

    @Override // defpackage.otg
    public final void b(oxi oxiVar) {
        oxiVar.g("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        oxiVar.g("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
        oxiVar.g("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
        oxiVar.g("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL DEFAULT -1, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807, `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0, `stop_reason` INTEGER NOT NULL DEFAULT -256, `trace_tag` TEXT, `required_network_type` INTEGER NOT NULL, `required_network_request` BLOB NOT NULL DEFAULT x'', `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
        oxiVar.g("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
        oxiVar.g("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
        oxiVar.g("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        oxiVar.g("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
        oxiVar.g("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        oxiVar.g("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        oxiVar.g("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
        oxiVar.g("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        oxiVar.g("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        oxiVar.g("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        oxiVar.g("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '86254750241babac4b8d52996a675549')");
    }
}
