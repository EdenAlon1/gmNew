package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final /* synthetic */ class dpsa implements ffxy, ffke {
    final /* synthetic */ dptb a;

    public dpsa(dptb dptbVar) {
        this.a = dptbVar;
    }

    @Override // defpackage.ffke
    public final ffbv b() {
        return new ffju(2, this.a, dptb.class, "onCaptureEvent", "onCaptureEvent(Lcom/google/android/libraries/compose/cameragallery/ui/camera/inapp/CameraManager$CaptureEvent;)V", 4);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof ffxy) && (obj instanceof ffke)) {
            return ffkj.e(b(), ((ffke) obj).b());
        }
        return false;
    }

    @Override // defpackage.ffxy
    public final /* bridge */ /* synthetic */ Object fQ(Object obj, ffgu ffguVar) {
        Object c;
        Object c2;
        Object c3;
        dpqk dpqkVar = (dpqk) obj;
        boolean z = dpqkVar instanceof dpqh;
        dptb dptbVar = this.a;
        if (z) {
            dptbVar.b.b();
            fgcm fgcmVar = dptbVar.h;
            do {
                c3 = fgcmVar.c();
            } while (!fgcmVar.g(c3, dptl.a((dptl) c3, 0, null, 0, null, true, null, null, null, 1048543)));
        } else if (dpqkVar instanceof dpqi) {
            dptbVar.b.c();
            fgcm fgcmVar2 = dptbVar.h;
            do {
                c2 = fgcmVar2.c();
            } while (!fgcmVar2.g(c2, dptl.a((dptl) c2, 0, null, 0, null, false, null, null, null, 1048543)));
        } else if (!(dpqkVar instanceof dpqf)) {
            if (dpqkVar instanceof dpqj) {
                dptbVar.e.invoke(((dpqj) dpqkVar).a);
            } else {
                if (!(dpqkVar instanceof dpqg)) {
                    throw new ffcd();
                }
                ((enrr) ((enrr) dptb.a.j()).g(((dpqg) dpqkVar).a).h("com/google/android/libraries/compose/cameragallery/ui/camera/inapp/CameraUiAdapter", "onCaptureEvent", 250, "CameraUiAdapter.kt")).q("Camera capture failed.");
                dptbVar.b.c();
                fgcm fgcmVar3 = dptbVar.h;
                do {
                    c = fgcmVar3.c();
                } while (!fgcmVar3.g(c, dptl.a((dptl) c, 0, null, 0, null, false, null, null, null, 1048543)));
            }
        }
        return ffcu.a;
    }

    public final int hashCode() {
        return b().hashCode();
    }
}
