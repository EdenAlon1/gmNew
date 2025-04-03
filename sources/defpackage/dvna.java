package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvna {
    static final engw a;
    static final efki b;
    static final engw c;
    public final efiv d;

    static {
        efko efkoVar = new efko();
        efkoVar.b("CREATE TABLE ");
        efkoVar.b("clearcut_events_table");
        efkoVar.b(" (");
        efkoVar.b("account TEXT NOT NULL, ");
        efkoVar.b("timestamp_ms INTEGER NOT NULL, ");
        efkoVar.b("log_source INTEGER NOT NULL, ");
        efkoVar.b("event_code INTEGER NOT NULL, ");
        efkoVar.b("package_name TEXT NOT NULL)");
        efkf efkfVar = new efkf(efkoVar.a());
        efkf efkfVar2 = new efkf(dvns.f("promotions"));
        efkf efkfVar3 = new efkf(dvns.f("capped_promos"));
        efkf efkfVar4 = new efkf(dvns.f("presented_promos"));
        efkf efkfVar5 = new efkf(dvns.f("monitored_events_clearcut"));
        efkf efkfVar6 = new efkf(dvns.f("monitored_events_visual_element"));
        efko efkoVar2 = new efko();
        efkoVar2.b("CREATE TABLE ");
        efkoVar2.b("visual_element_events_table");
        efkoVar2.b(" (");
        efkoVar2.b("account TEXT NOT NULL, ");
        efkoVar2.b("timestamp_ms INTEGER NOT NULL, ");
        efkoVar2.b("node_id INTEGER NOT NULL, ");
        efkoVar2.b("node_id_path TEXT NOT NULL, ");
        efkoVar2.b("action INTEGER NOT NULL)");
        engw C = engw.C(efkfVar, efkfVar2, efkfVar3, efkfVar4, efkfVar5, efkfVar6, new efkf(efkoVar2.a()), new efkf(dvns.f("preview_promotions")), new efkf(dvns.f("eval_results")), new efkf(dvnw.d("success_event_store")), new efkf(dvnw.d("user_experiments_store")), new efkf(dvns.f("versioned_identifiers")), new efkf(dvns.f("chime_versioned_identifiers")));
        a = C;
        dvmz dvmzVar = new dvmz();
        b = dvmzVar;
        engr engrVar = new engr();
        engrVar.j(C);
        engrVar.h(dvmzVar);
        c = engrVar.g();
    }

    public dvna(efix efixVar) {
        engw engwVar = c;
        efkc efkcVar = new efkc();
        int i = ((enou) engwVar).c;
        for (int i2 = 0; i2 < i; i2++) {
            efkcVar.b((efki) engwVar.get(i2));
        }
        this.d = efixVar.b("growthkit.db", efkcVar.a());
    }
}
