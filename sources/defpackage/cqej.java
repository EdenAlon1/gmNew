package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cqej implements coph {
    final /* synthetic */ cqek a;

    public cqej(cqek cqekVar) {
        this.a = cqekVar;
    }

    @Override // defpackage.coph
    public final Optional a() {
        cqdu cqduVar = (cqdu) cqdv.a.createBuilder();
        cqek cqekVar = this.a;
        if (cqekVar.e.p("bugle_full_sync_in_progress")) {
            boolean q = cqekVar.e.q("bugle_full_sync_in_progress", false);
            cqduVar.copyOnWrite();
            cqdv cqdvVar = (cqdv) cqduVar.instance;
            cqdvVar.b |= 1;
            cqdvVar.c = q;
        }
        if (cqekVar.e.p("last_full_sync_time_millis")) {
            eyja d = eykm.d(cqekVar.e.e("last_full_sync_time_millis", -1L));
            cqduVar.copyOnWrite();
            cqdv cqdvVar2 = (cqdv) cqduVar.instance;
            d.getClass();
            cqdvVar2.d = d;
            cqdvVar2.b |= 2;
        }
        if (cqekVar.e.p("last_sync_time_millis")) {
            eyja d2 = eykm.d(cqekVar.e.e("last_sync_time_millis", -1L));
            cqduVar.copyOnWrite();
            cqdv cqdvVar3 = (cqdv) cqduVar.instance;
            d2.getClass();
            cqdvVar3.e = d2;
            cqdvVar3.b |= 4;
        }
        return Optional.of((cqdv) cqduVar.build());
    }

    @Override // defpackage.copg
    public final void c() {
        ((akzt) this.a.f.b()).c("Bugle.ForwardSync.SettingsStore.Migration.Count");
    }

    @Override // defpackage.coph
    public final void b() {
    }
}
