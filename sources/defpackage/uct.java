package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.conversation.draft.model.GalleryContent;
import com.google.android.apps.messaging.shared.datamodel.data.MessagePartData;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.ims.rcsservice.locationsharing.LocationInformation;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uct implements uco {
    private final bcwz a;
    private final bcxm b;

    public uct(bcwz bcwzVar, bcxm bcxmVar) {
        this.a = bcwzVar;
        this.b = bcxmVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uco
    public final MessagePartCoreData a(apmq apmqVar, dcle dcleVar) {
        String scheme;
        final bcxb C = bcxc.C();
        bcqk bcqkVar = (bcqk) C;
        bcqkVar.c = apmqVar.b();
        bcqkVar.d = apmqVar.e();
        bcqkVar.e = apmqVar.e();
        C.o(apmqVar instanceof ufd ? apmqVar.i() : eohh.UNKNOWN);
        if (apmqVar instanceof uef) {
            uef uefVar = (uef) apmqVar;
            C.g(uefVar.a());
            bcqkVar.l = uefVar.h();
        } else if (apmqVar instanceof ufi) {
            ufi ufiVar = (ufi) apmqVar;
            bcqkVar.j = ufiVar.h();
            C.p(ufiVar.a());
        } else if (apmqVar instanceof apqd) {
            apqd apqdVar = (apqd) apmqVar;
            C.q(apqdVar.f().getWidth());
            C.i(apqdVar.f().getHeight());
            if (apqdVar instanceof appq) {
                appq appqVar = (appq) apqdVar;
                C.j(appqVar.a());
                C.l(!appqVar.l());
                appqVar.j().ifPresent(new Consumer() { // from class: ucs
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj) {
                        bcxb.this.g(((Long) obj).longValue());
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                if (appqVar instanceof GalleryContent) {
                    C.k(((GalleryContent) appqVar).h());
                }
            } else if (apqdVar instanceof ufo) {
                ufo ufoVar = (ufo) apqdVar;
                LocationInformation locationInformation = new LocationInformation();
                locationInformation.d = ufoVar.a();
                locationInformation.c = ufoVar.h();
                bcqkVar.h = locationInformation;
                bcqkVar.b = ufoVar.m();
            } else if (apqdVar instanceof ufg) {
                bcqkVar.i = ((ufg) apqdVar).a();
            } else if (apqdVar instanceof ufm) {
                Uri c = ((ufm) apqdVar).c();
                if (c == null || ((scheme = c.getScheme()) != null && scheme.startsWith("http"))) {
                    c = null;
                }
                bcqkVar.e = c;
            }
        }
        MessagePartData c2 = this.a.c(C.r());
        if (csuu.v(apmqVar.e()) || (apmqVar instanceof ufm) || (apmqVar instanceof ufi) || (apmqVar instanceof ufg) || ((apmqVar instanceof GalleryContent) && ((GalleryContent) apmqVar).h() != byza.GOOGLE_PHOTOS_LINK)) {
            c2 = this.b.a(c2);
        }
        if (c2.h == null) {
            c2.h = dclb.a(apmqVar, dcleVar);
        }
        return c2;
    }
}
