package defpackage;

import android.app.Application;
import j$.util.Optional;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emge extends lml {
    public final Application a;
    public final ffbr b;
    public final ffbr c;
    public final ffbr d;
    public final enru e;
    public final fgcm f;
    public final fgdj g;
    public final fgdj h;
    public final fgcm i;
    public final fgdj j;
    public boolean k;
    public float l;
    public final hho m;
    public emhc n;
    public int o;
    public final ArrayList p;
    public boolean q;
    public final fgcm r;
    public final fgcm s;
    public final fgdj t;
    public final fgdj u;
    public ffix v;
    public final dqgr w;
    public final adak x;
    private final fgcm y;

    public emge(Application application, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, dqgr dqgrVar, ffbr ffbrVar4, ffbr ffbrVar5) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        dqgrVar.getClass();
        this.a = application;
        this.b = ffbrVar2;
        this.c = ffbrVar3;
        this.w = dqgrVar;
        this.d = ffbrVar4;
        this.e = enru.c("com/google/chat/smartmessaging/penpal/ui/EmotifyViewModel");
        fgcm a = fgdm.a(emfz.a);
        this.f = a;
        this.g = new fgco(a);
        fgcm a2 = fgdm.a(null);
        this.y = a2;
        this.h = new fgco(a2);
        fgcm a3 = fgdm.a(null);
        this.i = a3;
        this.j = new fgco(a3);
        this.m = new hic(null, hla.a);
        this.n = new emhc(null);
        this.p = new ArrayList();
        fgcm a4 = fgdm.a(null);
        this.r = a4;
        fgcm a5 = fgdm.a(null);
        this.s = a5;
        this.t = new fgco(a4);
        this.u = new fgco(a5);
        Object b = ffbrVar5.b();
        b.getClass();
        this.x = (adak) fflm.b((Optional) b);
        this.v = new ffix() { // from class: emga
            @Override // defpackage.ffix
            public final Object invoke() {
                return ffcu.a;
            }
        };
    }

    public final void a(emgv emgvVar) {
        emgvVar.getClass();
        this.y.f(emgvVar);
    }

    @Override // defpackage.lml
    protected final void fD() {
        ((enrr) this.e.h().h("com/google/chat/smartmessaging/penpal/ui/EmotifyViewModel", "onCleared", 327, "EmotifyViewModel.kt")).q("ViewModel onClear called");
        this.m.b(null);
    }
}
