package defpackage;

import android.net.Uri;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efxe implements erqj {
    final /* synthetic */ efxf a;

    public efxe(efxf efxfVar) {
        this.a = efxfVar;
    }

    @Override // defpackage.erqj
    public final /* synthetic */ void b(Object obj) {
        egkj egkjVar = new egkj();
        egkjVar.c((Uri) obj);
        egkjVar.a = 4;
        exfv exfvVar = (exfv) efxf.b.toBuilder();
        long a = this.a.g.a(TimeUnit.MICROSECONDS);
        exfvVar.copyOnWrite();
        exfw exfwVar = (exfw) exfvVar.instance;
        exfwVar.b |= 1;
        exfwVar.e = a;
        egkjVar.b((exfw) exfvVar.build());
        this.a.i.j(egkjVar.a());
        this.a.j.set(false);
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        ((enrr) ((enrr) ((enrr) efxf.a.e()).g(th)).h("com/google/android/libraries/user/profile/photopicker/art/edit/viewmodel/ArtEditViewModel$1", "onFailure", (char) 132, "ArtEditViewModel.java")).q("Something went wrong with saving the bitmap");
        egkj egkjVar = new egkj();
        egkjVar.a = 5;
        exfv exfvVar = (exfv) efxf.b.toBuilder();
        emyg emygVar = this.a.g;
        emygVar.g();
        long a = emygVar.a(TimeUnit.MICROSECONDS);
        exfvVar.copyOnWrite();
        exfw exfwVar = (exfw) exfvVar.instance;
        exfwVar.b |= 1;
        exfwVar.e = a;
        exft exftVar = (exft) exfu.a.createBuilder();
        exftVar.copyOnWrite();
        exfu exfuVar = (exfu) exftVar.instance;
        exfuVar.c = 13;
        exfuVar.b |= 1;
        exgh exghVar = (exgh) exgi.a.createBuilder();
        exghVar.copyOnWrite();
        exgi exgiVar = (exgi) exghVar.instance;
        exgiVar.c = 8;
        exgiVar.b |= 1;
        exftVar.copyOnWrite();
        exfu exfuVar2 = (exfu) exftVar.instance;
        exgi exgiVar2 = (exgi) exghVar.build();
        exgiVar2.getClass();
        exfuVar2.e = exgiVar2;
        exfuVar2.b |= 4;
        exfvVar.copyOnWrite();
        exfw exfwVar2 = (exfw) exfvVar.instance;
        exfu exfuVar3 = (exfu) exftVar.build();
        exfuVar3.getClass();
        exfwVar2.f = exfuVar3;
        exfwVar2.b |= 2;
        egkjVar.b((exfw) exfvVar.build());
        this.a.i.j(egkjVar.a());
        this.a.j.set(false);
    }
}
