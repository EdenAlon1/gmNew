package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cqek {
    public static final cfup a = cfvl.i(cfvl.b, "enable_forward_sync_manager_prefs_migration_to_settings_store", false);
    public static final cskc b = cskc.g("BugleDataModel", "ForwardSyncManagerSettingsService");
    public static final Instant c = Instant.ofEpochMilli(-1);
    public static final Instant d = Instant.ofEpochMilli(-1);
    public final ctyx e;
    public final ffbr f;
    public final comc g;
    public final errl h;

    public cqek(ctyx ctyxVar, ffbr ffbrVar, ffbr ffbrVar2, errl errlVar) {
        this.e = ctyxVar;
        this.f = ffbrVar;
        comy comyVar = (comy) ffbrVar2.b();
        comu c2 = comv.c();
        c2.d(comb.FORWARD_SYNC_MANAGER);
        c2.f(cqdv.a);
        c2.e(new cqej(this));
        this.g = comyVar.a(c2.a());
        this.h = errlVar;
    }

    public final elfl a() {
        return !((Boolean) a.e()).booleanValue() ? elfo.e(Instant.ofEpochMilli(this.e.e("last_full_sync_time_millis", -1L))) : this.g.h().h(new emwl() { // from class: cqeg
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cqdv cqdvVar = (cqdv) obj;
                cfup cfupVar = cqek.a;
                if ((cqdvVar.b & 2) == 0) {
                    return cqek.c;
                }
                eyja eyjaVar = cqdvVar.d;
                if (eyjaVar == null) {
                    eyjaVar = eyja.a;
                }
                return eykj.d(eyjaVar);
            }
        }, this.h);
    }

    public final elfl b(final boolean z) {
        this.e.g("bugle_full_sync_in_progress", z);
        return this.g.j(new emwl() { // from class: cqdx
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cfup cfupVar = cqek.a;
                cqdu cqduVar = (cqdu) ((cqdv) obj).toBuilder();
                cqduVar.copyOnWrite();
                cqdv cqdvVar = (cqdv) cqduVar.instance;
                cqdvVar.b |= 1;
                cqdvVar.c = z;
                return (cqdv) cqduVar.build();
            }
        }).h(new emwl() { // from class: cqdy
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cfup cfupVar = cqek.a;
                return null;
            }
        }, this.h);
    }

    public final boolean c() {
        return this.e.q("bugle_full_sync_in_progress", false);
    }
}
