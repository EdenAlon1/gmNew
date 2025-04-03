package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class acrs implements acql {
    final /* synthetic */ acrw a;

    public acrs(acrw acrwVar) {
        this.a = acrwVar;
    }

    @Override // defpackage.acql
    public final acrp a() {
        return acrp.PAUSED;
    }

    @Override // defpackage.acql
    public final acrp b() {
        return acrp.PAUSING;
    }

    @Override // defpackage.acql
    public final elfl c() {
        return this.a.f.c().i(new eroh() { // from class: acrq
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                boolean booleanValue = ((Boolean) obj).booleanValue();
                final acrs acrsVar = acrs.this;
                if (!booleanValue) {
                    ((ensz) ((ensz) acrw.a.h()).h("com/google/android/apps/messaging/dittosatellite/impl/JsBridgeDittoControllerV2$PauseOperation", "run", 634, "JsBridgeDittoControllerV2.java")).q("Skipping pause operation for auth page.");
                    ((acuq) acrsVar.a.b.b()).d(acrsVar.a.i);
                    return elfo.e(null);
                }
                if (!((acuq) acrsVar.a.b.b()).h(acrsVar.a.i)) {
                    throw new IllegalStateException("Could not pause nonexistent channel.");
                }
                actj a = acrsVar.a.a();
                a.e = true;
                acrw acrwVar = acrsVar.a;
                esni esniVar = (esni) esnk.a.createBuilder();
                eyex eyexVar = eyex.a;
                esniVar.copyOnWrite();
                esnk esnkVar = (esnk) esniVar.instance;
                eyexVar.getClass();
                esnkVar.c = eyexVar;
                esnkVar.b = 204;
                return a.a(acrwVar.i, (esnk) esniVar.build()).h(new emwl() { // from class: acrr
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        acrs acrsVar2 = acrs.this;
                        ((acuq) acrsVar2.a.b.b()).d(acrsVar2.a.i);
                        return null;
                    }
                }, acrsVar.a.c);
            }
        }, this.a.c);
    }

    @Override // defpackage.acql
    public final void d() {
        actj a = this.a.a();
        a.e = true;
        esni esniVar = (esni) esnk.a.createBuilder();
        eyex eyexVar = eyex.a;
        esniVar.copyOnWrite();
        esnk esnkVar = (esnk) esniVar.instance;
        eyexVar.getClass();
        esnkVar.c = eyexVar;
        esnkVar.b = 205;
        a.d(this.a.i, (esnk) esniVar.build());
    }
}
