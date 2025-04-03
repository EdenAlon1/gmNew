package defpackage;

import android.util.Base64;
import androidx.car.app.model.Alert;
import com.google.android.rcs.client.messaging.data.ContentType;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.concurrent.Callable;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class crft {
    private static final enru g = enru.c("com/google/android/apps/messaging/shared/transfer/uploads/UploaderCommon");
    public final errl a;
    public final errl b;
    public final crbk c;
    public final faws d;
    public final faws e;
    public final ffbr f;
    private final errl h;
    private final ffbr i;
    private final crfc j;

    public crft(errl errlVar, errl errlVar2, errl errlVar3, crbk crbkVar, faws fawsVar, ffbr ffbrVar, crfc crfcVar, ffbr ffbrVar2, ffbr ffbrVar3) {
        this.a = errlVar;
        this.b = errlVar2;
        this.h = errlVar3;
        this.c = crbkVar;
        this.d = fawsVar;
        this.e = (faws) ffbrVar.b();
        this.f = ffbrVar2;
        this.j = crfcVar;
        this.i = ffbrVar3;
    }

    public static String d(fcka fckaVar) {
        return Base64.encodeToString(fckaVar.toByteArray(), 2);
    }

    public static final long f(favp favpVar) {
        if (favpVar.e() <= 0) {
            return 104857600L;
        }
        return favpVar.e();
    }

    static final fawp g(long j) {
        if (j <= 0) {
            fawo fawoVar = new fawo();
            fawoVar.a = cqqm.c().b;
            return new fawp(fawoVar);
        }
        fawo fawoVar2 = new fawo();
        fawoVar2.a = cqqm.c().b;
        fawoVar2.b = j;
        return new fawp(fawoVar2);
    }

    static final awvb h(fcki fckiVar, Optional optional, Optional optional2) {
        int i;
        ContentType contentType = (ContentType) optional2.orElse(ContentType.e("application/vnd.gsma.rcs-ft-http+xml"));
        awva awvaVar = (awva) awvb.a.createBuilder();
        String str = (String) optional.orElse("");
        awvaVar.copyOnWrite();
        awvb awvbVar = (awvb) awvaVar.instance;
        str.getClass();
        awvbVar.c = str;
        long j = fckiVar.d;
        if (j > 2147483647L) {
            ensk j2 = g.j();
            j2.Y(ente.a, "BugleFileTransfer");
            ((enrr) ((enrr) j2).h("com/google/android/apps/messaging/shared/transfer/uploads/UploaderCommon", "convertSizeBytes", 253, "UploaderCommon.java")).s("Uploaded file of size %d, which is larger than can be stored in FileInformation.size_bytes, int32 max (~2.15 gb).", j);
            i = Alert.DURATION_SHOW_INDEFINITELY;
        } else {
            i = (int) j;
        }
        awvaVar.copyOnWrite();
        ((awvb) awvaVar.instance).d = i;
        awup awupVar = (awup) new avty().m().fP(contentType);
        awvaVar.copyOnWrite();
        awvb awvbVar2 = (awvb) awvaVar.instance;
        awupVar.getClass();
        awvbVar2.e = awupVar;
        awvbVar2.b |= 1;
        String str2 = fckiVar.b;
        awvaVar.copyOnWrite();
        awvb awvbVar3 = (awvb) awvaVar.instance;
        str2.getClass();
        awvbVar3.f = str2;
        eyja eyjaVar = fckiVar.c;
        if (eyjaVar == null) {
            eyjaVar = eyja.a;
        }
        awvaVar.copyOnWrite();
        awvb awvbVar4 = (awvb) awvaVar.instance;
        eyjaVar.getClass();
        awvbVar4.g = eyjaVar;
        awvbVar4.b |= 2;
        return (awvb) awvaVar.build();
    }

    final elfj a(final crbv crbvVar, final crfs crfsVar) {
        return elfj.d(new erov() { // from class: crfp
            @Override // defpackage.erov
            public final Object a(erpc erpcVar) {
                crfs crfsVar2 = crfsVar;
                crft crftVar = crft.this;
                favp a = crfsVar2.a(crftVar.c, crbvVar);
                erpcVar.a(a, crftVar.a);
                return a;
            }
        }, this.b);
    }

    final elfl b(final fcka fckaVar, final favp favpVar, final Optional optional, final Optional optional2, final eyee eyeeVar, final String str, final long j) {
        return elfo.g(new Callable() { // from class: crfm
            @Override // java.util.concurrent.Callable
            public final Object call() {
                crft crftVar = crft.this;
                boolean a = ((atxg) crftVar.f.b()).a();
                Optional optional3 = optional;
                favp favpVar2 = favpVar;
                long j2 = j;
                String str2 = str;
                Optional optional4 = optional2;
                eyee eyeeVar2 = eyeeVar;
                fcka fckaVar2 = fckaVar;
                return (a || (favpVar2 != null && crft.f(favpVar2) > 0 && crft.f(favpVar2) <= j2)) ? crftVar.e.b(str2, crftVar.c(optional3, optional4, crft.f(favpVar2), eyeeVar2), favpVar2, crft.d(fckaVar2), crft.g(j2)) : crftVar.d.b(str2, crftVar.c(optional3, optional4, crft.f(favpVar2), eyeeVar2), favpVar2, crft.d(fckaVar2), crft.g(j2));
            }
        }, this.h);
    }

    public final favs c(Optional optional, Optional optional2, long j, eyee eyeeVar) {
        favs favsVar = new favs();
        favsVar.e("X-Goog-Upload-Header-Content-Length", Long.toString(j));
        favsVar.e("X-Goog-Upload-Header-Content-Type", (String) optional.map(new Function() { // from class: crfn
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((ContentType) obj).toString();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse("application/vnd.gsma.rcs-ft-http+xml"));
        favsVar.e("X-Goog-Upload-File-Name", (String) optional2.orElse(""));
        favsVar.d("Authorization", "Bearer ".concat(String.valueOf(Base64.encodeToString(eyeeVar.I(), 2))));
        favsVar.d("Upload-Type", "TG");
        if (!((String) this.i.b()).isEmpty()) {
            favsVar.d("Cookie", (String) this.i.b());
        }
        return favsVar;
    }

    public final void e(awbs awbsVar, fawj fawjVar, favp favpVar, cqqb cqqbVar) {
        long f = f(favpVar);
        cqqbVar.getClass();
        awbsVar.getClass();
        crfc crfcVar = this.j;
        errl errlVar = (errl) crfcVar.b.b();
        errlVar.getClass();
        fawjVar.e(new crfb(cqqbVar, crfcVar.a, awbsVar, f, errlVar), cqqm.b(), (int) eyki.b(eyki.d(((Long) cqqm.a.e()).longValue())));
    }
}
