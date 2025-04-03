package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efxf extends lml {
    public static final enru a = enru.c("com/google/android/libraries/user/profile/photopicker/art/edit/viewmodel/ArtEditViewModel");
    public static final exfw b;
    public final efzz c;
    public final errl d;
    public final egad e;
    public final efxc f;
    public final emyg g;
    public final egex h;
    public final llg i;
    public final AtomicBoolean j;
    public final efwk k;

    static {
        exfv exfvVar = (exfv) exfw.a.createBuilder();
        exgj exgjVar = (exgj) exgk.a.createBuilder();
        fapt faptVar = fapt.OBAKE_LOCAL_IO_SAVE_EDITED_PHOTO;
        exgjVar.copyOnWrite();
        exgk exgkVar = (exgk) exgjVar.instance;
        exgkVar.c = faptVar.R;
        exgkVar.b |= 1;
        exfvVar.copyOnWrite();
        exfw exfwVar = (exfw) exfvVar.instance;
        exgk exgkVar2 = (exgk) exgjVar.build();
        exgkVar2.getClass();
        exfwVar.d = exgkVar2;
        exfwVar.c = 2;
        b = (exfw) exfvVar.build();
    }

    public efxf(efzz efzzVar, errl errlVar, egad egadVar, emyg emygVar, egex egexVar, efwk efwkVar) {
        egkj egkjVar = new egkj();
        egkjVar.a = 1;
        this.i = new llg(egkjVar.a());
        this.j = new AtomicBoolean(false);
        this.c = efzzVar;
        this.d = errlVar;
        this.e = egadVar;
        this.f = new efxc();
        this.g = emygVar;
        this.h = egexVar;
        this.k = efwkVar;
    }

    public final lld a() {
        return this.h.g;
    }

    @Override // defpackage.lml
    protected final void fD() {
        egex egexVar = this.h;
        if (egexVar.f != null) {
            egexVar.f.cancel(true);
        }
    }
}
