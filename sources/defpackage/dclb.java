package defpackage;

import com.google.android.apps.messaging.conversation.draft.model.GalleryContent;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dclb {
    public static eppr a(apmq apmqVar, dcle dcleVar) {
        eppq eppqVar = (eppq) eppr.a.createBuilder();
        if (apmqVar instanceof uef) {
            dclc.c(eppqVar, ((uef) apmqVar).a());
        } else if (apmqVar instanceof ufg) {
            ufg ufgVar = (ufg) apmqVar;
            dclc.j(eppqVar, b(ufgVar), eerv.c(ufgVar.a()));
        } else if (apmqVar instanceof ufa) {
            ufa ufaVar = (ufa) apmqVar;
            dclc.d(eppqVar, b(ufaVar), ((Long) ufaVar.j().orElse(-1L)).longValue(), ufaVar.h());
        } else if (apmqVar instanceof GalleryContent) {
            GalleryContent galleryContent = (GalleryContent) apmqVar;
            dclc.h(eppqVar, b(galleryContent), ((Long) galleryContent.j().orElse(-1L)).longValue(), galleryContent.i());
        } else if (apmqVar instanceof ufm) {
            ufm ufmVar = (ufm) apmqVar;
            dclc.f(eppqVar, b(ufmVar), ufmVar.a());
        } else if (apmqVar instanceof ufo) {
            dclc.i(eppqVar);
        } else if (apmqVar instanceof ufr) {
            dclc.l(eppqVar, 1);
        } else {
            if (!(apmqVar instanceof ufi)) {
                throw new IllegalArgumentException("Invalid attachment content: ".concat(String.valueOf(String.valueOf(apmqVar))));
            }
            ufi ufiVar = (ufi) apmqVar;
            dclc.e(eppqVar, ufiVar.a(), ufiVar.b());
        }
        dcleVar.a(eppqVar);
        return (eppr) eppqVar.build();
    }

    private static epqs b(apqd apqdVar) {
        epqs epqsVar = (epqs) eprl.a.createBuilder();
        int width = apqdVar.f().getWidth();
        epqsVar.copyOnWrite();
        eprl eprlVar = (eprl) epqsVar.instance;
        eprlVar.b |= 1;
        eprlVar.e = width;
        int height = apqdVar.f().getHeight();
        epqsVar.copyOnWrite();
        eprl eprlVar2 = (eprl) epqsVar.instance;
        eprlVar2.b |= 2;
        eprlVar2.f = height;
        String b = apqdVar.b();
        epqsVar.copyOnWrite();
        eprl eprlVar3 = (eprl) epqsVar.instance;
        b.getClass();
        eprlVar3.b |= 8;
        eprlVar3.g = b;
        dclc.b(apqdVar.e(), epqsVar);
        return epqsVar;
    }
}
