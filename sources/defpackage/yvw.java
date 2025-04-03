package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class yvw extends ffhv implements ffjm {
    int a;
    final /* synthetic */ yvz b;
    final /* synthetic */ Context c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yvw(yvz yvzVar, Context context, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = yvzVar;
        this.c = context;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((yvw) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            yvz yvzVar = this.b;
            aimz aimzVar = new aimz(ctuf.RECORD_AUDIO_PERMISSIONS);
            this.a = 1;
            obj = yvzVar.h.f(aimzVar, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        if (((Boolean) obj).booleanValue()) {
            this.b.b(this.c, R.string.voice_messages_hold_to_record_tooltip_text);
        } else {
            this.b.b(this.c, R.string.microphone_permission_denied_text);
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new yvw(this.b, this.c, ffguVar);
    }
}
