package defpackage;

import android.content.Context;
import android.widget.Toast;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class yrf extends ffhv implements ffjm {
    final /* synthetic */ Context a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yrf(Context context, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = context;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((yrf) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        Context context = this.a;
        Toast.makeText(context, context.getString(R.string.selfie_gif_camera_permission_denied_text), 0).show();
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new yrf(this.a, ffguVar);
    }
}
