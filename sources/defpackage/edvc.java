package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class edvc {
    public static final efkj a;

    static {
        efkc efkcVar = new efkc();
        efkcVar.b(new efki() { // from class: edvb
            @Override // defpackage.efki
            public final void a(efks efksVar) {
                efkj efkjVar = edvc.a;
                efksVar.h("CREATE TABLE GlobalValues(key_id TEXT NOT NULL, value TEXT NOT NULL,PRIMARY KEY (key_id))");
                efksVar.h("CREATE TABLE SystemProfiles(system_profile_hash INTEGER UNIQUE NOT NULL, system_profile BLOB NOT NULL,PRIMARY KEY (system_profile_hash))");
                efksVar.h("CREATE TABLE Reports(customer_id INTEGER NOT NULL, project_id INTEGER NOT NULL, metric_id INTEGER NOT NULL, report_id INTEGER NOT NULL, last_sent_day_index INTEGER, PRIMARY KEY (customer_id,project_id,metric_id,report_id))");
                efksVar.h("CREATE TABLE AggregateStore(customer_id INTEGER NOT NULL, project_id INTEGER NOT NULL, metric_id INTEGER NOT NULL, report_id INTEGER NOT NULL, day_index INTEGER NOT NULL, system_profile_hash INTEGER NOT NULL, event_vector STRING NOT NULL, PRIMARY KEY (customer_id,project_id,metric_id,report_id,day_index,system_profile_hash,event_vector),CONSTRAINT report FOREIGN KEY (customer_id,project_id,metric_id,report_id) REFERENCES Reports(customer_id,project_id,metric_id,report_id) ON DELETE CASCADE CONSTRAINT system_profile FOREIGN KEY (system_profile_hash) REFERENCES SystemProfiles(system_profile_hash))");
                efksVar.h("CREATE TABLE ObservationStore(observation_store_id INTEGER NOT NULL, observation_batch BLOB NOT NULL,PRIMARY KEY (observation_store_id AUTOINCREMENT))");
            }
        });
        efkcVar.c("DELETE FROM ObservationStore");
        efkcVar.c("ALTER TABLE AggregateStore ADD COLUMN aggregate_value BLOB");
        a = efkcVar.a();
    }
}
