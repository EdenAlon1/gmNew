package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dtgl extends ffhv implements ffji {
    int a;
    final /* synthetic */ dtgp b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dtgl(dtgp dtgpVar, ffgu ffguVar) {
        super(1, ffguVar);
        this.b = dtgpVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            if (!(this.b.k.c() instanceof dtfy)) {
                ((enrr) dtgp.a.j().h("com/google/android/libraries/compose/voice/recorder/VoiceRecordingManager$stopRecording$2", "invokeSuspend", 135, "VoiceRecordingManager.kt")).t("Cannot stop recording while in state '%s'", this.b.k.c());
                return ffcu.a;
            }
            dtgp dtgpVar = this.b;
            this.a = 1;
            obj = dtgpVar.h(false, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        Uri uri = (Uri) obj;
        if (uri == null) {
            this.b.k.f(dtfx.a);
            ((enrr) dtgp.a.j().h("com/google/android/libraries/compose/voice/recorder/VoiceRecordingManager$stopRecording$2", "invokeSuspend", 143, "VoiceRecordingManager.kt")).q("No output file produced");
        } else {
            dtgp dtgpVar2 = this.b;
            dtgpVar2.k.f(new dtfz(dtgpVar2.a(uri)));
        }
        return ffcu.a;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new dtgl(this.b, (ffgu) obj).b(ffcu.a);
    }
}
