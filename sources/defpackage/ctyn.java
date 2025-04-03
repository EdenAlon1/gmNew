package defpackage;

import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctyn {
    public final ffbr a;
    public final fazb b;
    public final errl c;
    public final ffbr d;

    public ctyn(ffbr ffbrVar, fazb fazbVar, errl errlVar, ffbr ffbrVar2) {
        this.a = ffbrVar;
        this.b = fazbVar;
        this.c = errlVar;
        this.d = ffbrVar2;
    }

    public static String b(fbrx fbrxVar) {
        fbvn fbvnVar = fbrxVar.c;
        if (fbvnVar == null) {
            fbvnVar = fbvn.a;
        }
        emww emwwVar = new emww(",");
        return new emwt(emwwVar, emwwVar).f(new String[]{emxe.a(fbvnVar.b), emxe.a(fbvnVar.c), emxe.a(fbvnVar.d), emxe.a(fbvnVar.e), emxe.a(fbvnVar.f), emxe.a(fbvnVar.g), emxe.a(fbvnVar.h)});
    }

    public static boolean c(fbvn fbvnVar) {
        return (fbvnVar.b.isEmpty() || TextUtils.isEmpty(fbvnVar.f)) ? false : true;
    }

    public final elfl a(String str) {
        ctyg ctygVar = (ctyg) this.d.b();
        return elfl.g(duin.a(((edsg) ctygVar.d.b()).c(edsj.r(str, ctygVar.b).f()))).i(new eroh() { // from class: ctyb
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                return elfo.e(engw.n(((edsl) obj).a()));
            }
        }, ctygVar.c).e(Throwable.class, new emwl() { // from class: ctyc
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ((enrr) ((enrr) ((enrr) ctyg.a.j()).g((Throwable) obj)).h("com/google/android/apps/messaging/shared/util/places/PlacesMessagingClient", "search", 72, "PlacesMessagingClient.java")).q("Failed to get places from search by text request.");
                int i = engw.d;
                return enou.a;
            }
        }, ctygVar.c).i(new eroh() { // from class: ctyh
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                engw engwVar = (engw) obj;
                return engwVar.isEmpty() ? elfo.e(Optional.empty()) : elfo.e(Optional.of((edqc) engwVar.get(0)));
            }
        }, this.c);
    }
}
