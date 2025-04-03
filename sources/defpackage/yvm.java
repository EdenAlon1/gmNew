package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yvm extends ffhv implements ffjm {
    final /* synthetic */ yvz a;
    final /* synthetic */ Context b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yvm(ffgu ffguVar, yvz yvzVar, Context context) {
        super(2, ffguVar);
        this.a = yvzVar;
        this.b = context;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((yvm) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        this.a.b(this.b, R.string.audio_recorder_call_in_progress);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        yvm yvmVar = new yvm(ffguVar, this.a, this.b);
        yvmVar.c = obj;
        return yvmVar;
    }
}
