package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aknl {
    public final ffbr a;
    public final ffbr b;
    public final ffbr c;
    private final errl d;

    public aknl(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, errl errlVar) {
        this.a = ffbrVar;
        this.b = ffbrVar2;
        this.c = ffbrVar3;
        this.d = errlVar;
    }

    public final void a(final int i) {
        axnw.h(elfo.f(new Runnable() { // from class: aknk
            @Override // java.lang.Runnable
            public final void run() {
                aknl aknlVar = aknl.this;
                akno aknoVar = (akno) aknlVar.c.b();
                int i2 = i;
                aknn a = aknoVar.a(i2);
                addo addoVar = addo.a;
                try {
                    addoVar = (addo) a.b.l();
                } catch (eygu e) {
                    ensk j = aknn.a.j();
                    j.Y(ente.a, "Bugle");
                    ((enrr) ((enrr) ((enrr) j).g(e)).h("com/google/android/apps/messaging/samsung/mde/xmsconfigscallback/XmsConfigsDataService", "getSavedXmsConfigsResponse", '9', "XmsConfigsDataService.java")).q("Exception when getting last sent xMS configs response");
                }
                if (((adgf) aknlVar.b.b()).a(i2).equals(addoVar)) {
                    return;
                }
                akne akneVar = (akne) aknlVar.a.b();
                Intent intent = new Intent("com.google.android.apps.messaging.samsung.mde.xmsconfigscallback.XMS_CONFIGS_CHANGED");
                intent.putExtra("EXTRA_SUB_ID", i2);
                akneVar.a(intent);
            }
        }, this.d));
    }
}
