package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egiu {
    public static final enru a = enru.c("com/google/android/libraries/user/profile/photopicker/common/model/profile/MdiPhotoRepository");
    public final errl c;
    public final dydc d;
    public final efzz e;
    public final egaa f;
    public final egdu h;
    public egit i;
    public egdx j;
    public final llg b = new llg();
    public final AtomicBoolean g = new AtomicBoolean(false);

    public egiu(errl errlVar, dydc dydcVar, efzz efzzVar, egdu egduVar, egaa egaaVar) {
        this.c = errlVar;
        this.d = dydcVar;
        this.e = efzzVar;
        this.h = egduVar;
        this.f = egaaVar;
        c(egdx.g());
    }

    public final void a(Throwable th) {
        egdp egdpVar = this.f.a() ? egdp.NON_RETRYABLE : egdp.OFFLINE;
        egit egitVar = this.i;
        egitVar.c.add(0, ((egdt) egitVar.b.remove(egitVar.a)).e(true != egitVar.d.f.a() ? 15 : 3, th));
        c(egdx.f(egdpVar, this.i.a()));
        this.g.set(false);
    }

    public final void b() {
        if (this.g.compareAndSet(false, true)) {
            e(fapt.OBAKE_MDI_READ);
            c(egdx.h());
            d();
        }
    }

    public final void c(egdx egdxVar) {
        ((enrr) ((enrr) a.e()).h("com/google/android/libraries/user/profile/photopicker/common/model/profile/MdiPhotoRepository", "post", 346, "MdiPhotoRepository.java")).t("post: %s", egdxVar);
        this.j = egdxVar;
        this.b.j(egdxVar);
    }

    public final void d() {
        final ListenableFuture d = this.d.d();
        final ListenableFuture e = this.d.e(new dycx(true), 3);
        this.i.c(fapt.OBAKE_MDI_GET_PERSON_ME);
        this.i.c(fapt.OBAKE_MDI_GET_PERSON_PHOTO_ME);
        erqt.r(d, new egip(this), erpp.a);
        erqt.r(e, new egiq(this), erpp.a);
        erqt.r(erqt.b(d, e).a(new Callable() { // from class: egil
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Bitmap decodeStream = BitmapFactory.decodeStream((InputStream) erqt.q(ListenableFuture.this));
                ListenableFuture listenableFuture = d;
                eisq a2 = dygu.a((ewrq) erqt.q(listenableFuture));
                if (((ewrw) ((ewrq) erqt.q(listenableFuture)).b.get(0)).c == null) {
                    eisi eisiVar = eisi.a;
                }
                return new egii(decodeStream, a2.d, a2.e);
            }
        }, this.c), new egio(this), this.c);
    }

    public final void e(fapt faptVar) {
        egit egitVar = new egit(this);
        this.i = egitVar;
        egitVar.a = faptVar;
        egitVar.c(egitVar.a);
    }
}
