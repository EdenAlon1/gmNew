package defpackage;

import android.view.View;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dtjg extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dtjq b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dtjg(dtjq dtjqVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dtjqVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dtjg) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            dqli e = this.b.e();
            dqlf dqlfVar = dqlf.g;
            this.a = 1;
            obj = e.e(dqlfVar, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        if (((Boolean) obj).booleanValue()) {
            this.b.bb();
        } else {
            ((enrr) dtjq.a.h().h("com/google/android/libraries/compose/voice/ui/screen/VoiceScreen$requestAudioPermission$1", "invokeSuspend", 103, "VoiceScreen.kt")).q("Record audio permission not granted yet.");
            final dtjq dtjqVar = this.b;
            dtjq.bg(dtjqVar, R.string.record_audio_permission_description, R.string.open_settings, new View.OnClickListener() { // from class: dtje
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    dtjq dtjqVar2 = dtjq.this;
                    ffqy.d(dtjqVar2.bF(), null, null, new dtjf(dtjqVar2, null), 3);
                }
            });
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dtjg(this.b, ffguVar);
    }
}
