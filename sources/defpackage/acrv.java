package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class acrv implements acql {
    final /* synthetic */ acrw a;

    public acrv(acrw acrwVar) {
        this.a = acrwVar;
    }

    @Override // defpackage.acql
    public final acrp a() {
        return acrp.CONNECTED;
    }

    @Override // defpackage.acql
    public final acrp b() {
        return acrp.UNPAUSING;
    }

    @Override // defpackage.acql
    public final elfl c() {
        return this.a.f.c().i(new eroh() { // from class: acru
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                boolean booleanValue = ((Boolean) obj).booleanValue();
                acrv acrvVar = acrv.this;
                if (!booleanValue) {
                    ((ensz) ((ensz) acrw.a.h()).h("com/google/android/apps/messaging/dittosatellite/impl/JsBridgeDittoControllerV2$UnpauseOperation", "run", 696, "JsBridgeDittoControllerV2.java")).q("Skipping pause operation for auth page.");
                    ((acuq) acrvVar.a.b.b()).f(acrvVar.a.i);
                    return elfo.e(null);
                }
                ((acuq) acrvVar.a.b.b()).f(acrvVar.a.i);
                if (!((acuq) acrvVar.a.b.b()).h(acrvVar.a.i)) {
                    throw new IllegalStateException("Could not unpause nonexistent channel.");
                }
                actj a = acrvVar.a.a();
                a.e = false;
                acrw acrwVar = acrvVar.a;
                esni esniVar = (esni) esnk.a.createBuilder();
                eyex eyexVar = eyex.a;
                esniVar.copyOnWrite();
                esnk esnkVar = (esnk) esniVar.instance;
                eyexVar.getClass();
                esnkVar.c = eyexVar;
                esnkVar.b = 205;
                return a.a(acrwVar.i, (esnk) esniVar.build()).h(new emwl() { // from class: acrt
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        return null;
                    }
                }, acrvVar.a.c);
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
        esnkVar.b = 204;
        a.d(this.a.i, (esnk) esniVar.build());
    }
}
