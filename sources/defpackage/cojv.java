package defpackage;

import android.hardware.display.DisplayManager;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cojv extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cojz b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cojv(cojz cojzVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cojzVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cojv) c((ffxe) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            final ffxe ffxeVar = (ffxe) this.c;
            cojz.b(ffxeVar.b(((cojl) this.b.a.b()).b(null)));
            cojl cojlVar = (cojl) this.b.a.b();
            final cojz cojzVar = this.b;
            final DisplayManager.DisplayListener a = cojlVar.a(new ffix() { // from class: cojt
                @Override // defpackage.ffix
                public final Object invoke() {
                    cojz cojzVar2 = cojz.this;
                    ekzm b = ((elbx) cojzVar2.c.b()).b("ScreenDetectionUiAdapter.displayListener");
                    try {
                        cojz.b(ffxeVar.b(((cojl) cojzVar2.a.b()).b(cojzVar2.e)));
                        ffig.a(b, null);
                        return ffcu.a;
                    } finally {
                    }
                }
            });
            final cojz cojzVar2 = this.b;
            ffix ffixVar = new ffix() { // from class: coju
                @Override // defpackage.ffix
                public final Object invoke() {
                    DisplayManager.DisplayListener displayListener = a;
                    if (displayListener != null) {
                        ((cojl) cojzVar2.a.b()).d(displayListener);
                    }
                    return ffcu.a;
                }
            };
            this.a = 1;
            if (ffxd.b(ffxeVar, ffixVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cojv cojvVar = new cojv(this.b, ffguVar);
        cojvVar.c = obj;
        return cojvVar;
    }
}
