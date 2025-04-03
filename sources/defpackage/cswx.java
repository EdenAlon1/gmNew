package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.Locale;
import javax.net.ssl.SSLHandshakeException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cswx implements emcu {
    public static final cskc a = cskc.g("Bugle", "TenorService");
    public static final enru b = enru.c("com/google/android/apps/messaging/shared/util/gif/search/tenor/TenorService");
    public static final ensn c = new ensn("status", Integer.class, false, false);
    public static final String[] d = {"gif", "mediumgif", "tinygif", "nanogif"};
    public final csjk e;
    private final cswh f;
    private final errl g;
    private final Context h;
    private final errl i;

    public cswx(Context context, cswh cswhVar, errl errlVar, errl errlVar2, csjk csjkVar) {
        this.g = errlVar;
        this.f = cswhVar;
        this.h = context;
        this.i = errlVar2;
        this.e = csjkVar;
    }

    public static fbea b(csxo csxoVar) {
        fbdz fbdzVar = (fbdz) fbea.a.createBuilder();
        if (csxoVar.c() != null) {
            String c2 = csxoVar.c();
            c2.getClass();
            fbdzVar.copyOnWrite();
            ((fbea) fbdzVar.instance).c = c2;
        }
        fbeh fbehVar = (fbeh) fbei.a.createBuilder();
        if (csxoVar.f() != null) {
            Integer f = csxoVar.f();
            f.getClass();
            int intValue = f.intValue();
            fbehVar.copyOnWrite();
            ((fbei) fbehVar.instance).b = intValue;
        }
        if (csxoVar.e() != null) {
            Integer e = csxoVar.e();
            e.getClass();
            int intValue2 = e.intValue();
            fbehVar.copyOnWrite();
            ((fbei) fbehVar.instance).c = intValue2;
        }
        fbdzVar.copyOnWrite();
        fbea fbeaVar = (fbea) fbdzVar.instance;
        fbei fbeiVar = (fbei) fbehVar.build();
        fbeiVar.getClass();
        fbeaVar.d = fbeiVar;
        fbeaVar.b |= 1;
        return (fbea) fbdzVar.build();
    }

    private static String d(Locale locale) {
        return locale.getLanguage() + "_" + locale.getCountry();
    }

    @Override // defpackage.emcu
    public final ListenableFuture a(fbec fbecVar) {
        SettableFuture create = SettableFuture.create();
        erqt.r(this.f.b(cswh.a, fbecVar.c, 50, d(ctid.c(this.h)), (String) cswg.b.e()), new csww(this, create), this.g);
        return create;
    }

    public final void c(csxp csxpVar) {
        String str = cswh.a;
        String d2 = d(ctid.c(this.h));
        csxa csxaVar = (csxa) csxpVar;
        axnw.h(elfl.g(this.f.a(str, csxaVar.a, csxaVar.b, d2)).h(new emwl() { // from class: cswi
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cskc cskcVar = cswx.a;
                return null;
            }
        }, this.i).e(fjcb.class, new emwl() { // from class: cswk
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                fjcb fjcbVar = (fjcb) obj;
                enrr enrrVar = (enrr) ((enrr) cswx.b.j()).g(fjcbVar);
                enrrVar.Y(cswx.c, Integer.valueOf(fjcbVar.a));
                ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/util/gif/search/tenor/TenorService", "registerShare", 149, "TenorService.java")).q("HTTP Exception while registering share.");
                return null;
            }
        }, this.i).e(UnknownHostException.class, new emwl() { // from class: cswl
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ((enrr) ((enrr) ((enrr) cswx.b.j()).g((UnknownHostException) obj)).h("com/google/android/apps/messaging/shared/util/gif/search/tenor/TenorService", "registerShare", 156, "TenorService.java")).q("No connectivity while registering share.");
                return null;
            }
        }, this.i).e(SSLHandshakeException.class, new emwl() { // from class: cswm
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ((enrr) ((enrr) ((enrr) cswx.b.j()).g((SSLHandshakeException) obj)).h("com/google/android/apps/messaging/shared/util/gif/search/tenor/TenorService", "registerShare", 163, "TenorService.java")).q("SSLHandshake Exception while registering share.");
                return null;
            }
        }, this.i).e(ConnectException.class, new emwl() { // from class: cswn
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ((enrr) ((enrr) ((enrr) cswx.b.j()).g((ConnectException) obj)).h("com/google/android/apps/messaging/shared/util/gif/search/tenor/TenorService", "registerShare", 171, "TenorService.java")).q("Connect Exception while registering share.");
                return null;
            }
        }, this.i).e(SocketTimeoutException.class, new emwl() { // from class: cswo
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ((enrr) ((enrr) ((enrr) cswx.b.j()).g((SocketTimeoutException) obj)).h("com/google/android/apps/messaging/shared/util/gif/search/tenor/TenorService", "registerShare", 178, "TenorService.java")).q("Socket Timeout Exception while registering share.");
                return null;
            }
        }, this.i));
    }
}
