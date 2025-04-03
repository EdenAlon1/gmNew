package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmgq implements coph {
    final /* synthetic */ ffbr a;
    final /* synthetic */ ffbr b;

    public cmgq(ffbr ffbrVar, ffbr ffbrVar2) {
        this.a = ffbrVar;
        this.b = ffbrVar2;
    }

    @Override // defpackage.coph
    public final Optional a() {
        cmin cminVar = (cmin) cmiu.a.createBuilder();
        cminVar.getClass();
        cmip cmipVar = ((ckby) this.a.b()).d() ? cmip.TOGGLE_STATE_ENABLED : cmip.TOGGLE_STATE_USER_DISABLED;
        cmipVar.getClass();
        cminVar.copyOnWrite();
        cmiu cmiuVar = (cmiu) cminVar.instance;
        cmiuVar.e = cmipVar.e;
        cmiuVar.b |= 2;
        eyfy build = cminVar.build();
        build.getClass();
        return Optional.of((cmiu) build);
    }

    @Override // defpackage.copg
    public final void c() {
        ((akzt) this.b.b()).c("Bugle.Rcs.Settings.Data.Migration.Counts");
    }

    @Override // defpackage.coph
    public final void b() {
    }
}
