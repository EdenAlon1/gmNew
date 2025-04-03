package defpackage;

import androidx.car.app.model.Alert;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ldc {
    public final ffsk a;
    public final ffjm b;
    public final ffwm c = ffwp.a(Alert.DURATION_SHOW_INDEFINITELY, 0, 6);
    public final lad d = new lad();

    public ldc(ffsk ffskVar, ffji ffjiVar, ffjm ffjmVar, ffjm ffjmVar2) {
        this.a = ffskVar;
        this.b = ffjmVar2;
        ffud ffudVar = (ffud) ffskVar.hT().get(ffud.c);
        if (ffudVar != null) {
            ffudVar.hZ(new lda(ffjiVar, this, ffjmVar));
        }
    }
}
