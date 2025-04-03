package defpackage;

import android.view.View;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dtjo implements ffxy {
    final /* synthetic */ dtjq a;

    public dtjo(dtjq dtjqVar) {
        this.a = dtjqVar;
    }

    @Override // defpackage.ffxy
    public final /* bridge */ /* synthetic */ Object fQ(Object obj, ffgu ffguVar) {
        Integer num = (Integer) obj;
        if (num != null) {
            final dtjq dtjqVar = this.a;
            dtjq.bg(dtjqVar, num.intValue(), R.string.try_voice_recording_again, new View.OnClickListener() { // from class: dtjn
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    dtjq.this.be();
                }
            });
        } else {
            this.a.aU();
        }
        return ffcu.a;
    }
}
