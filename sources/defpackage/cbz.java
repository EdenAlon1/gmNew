package defpackage;

import androidx.camera.view.PreviewView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class cbz {
    public final /* synthetic */ PreviewView a;

    public /* synthetic */ cbz(PreviewView previewView) {
        this.a = previewView;
    }

    public final void a(cdk cdkVar) {
        cbl cblVar;
        float f;
        if (!(cdkVar instanceof cdj) || (cblVar = this.a.g) == null) {
            return;
        }
        float f2 = ((cdj) cdkVar).a;
        if (!cblVar.r()) {
            avw.f("CameraController", "Use cases not attached to camera.");
            return;
        }
        if (!cblVar.r) {
            avw.a("CameraController", "Pinch to zoom disabled.");
            return;
        }
        avw.a("CameraController", "Pinch to zoom with scale: " + f2);
        axz axzVar = (axz) cblVar.f().a();
        if (axzVar == null) {
            return;
        }
        float c = axzVar.c();
        if (f2 > 1.0f) {
            float f3 = f2 - 1.0f;
            f = f3 + f3 + 1.0f;
        } else {
            float f4 = 1.0f - f2;
            f = 1.0f - (f4 + f4);
        }
        cblVar.g(Math.min(Math.max(c * f, axzVar.b()), axzVar.a()));
    }
}
