package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egko extends lml {
    public static final enru a = enru.c("com/google/android/libraries/user/profile/photopicker/edit/viewmodel/EditViewModel");
    public static final exfw b;
    public final efzz c;
    public final errl d;
    public final egad e;
    public final egkl f;
    public final emyg g;
    public final llg h;
    public final AtomicBoolean i;

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

    public egko(efzz efzzVar, errl errlVar, egad egadVar, emyg emygVar) {
        egkj egkjVar = new egkj();
        egkjVar.a = 1;
        this.h = new llg(egkjVar.a());
        this.i = new AtomicBoolean(false);
        this.c = efzzVar;
        this.d = errlVar;
        this.e = egadVar;
        this.f = new egkl();
        this.g = emygVar;
    }
}
