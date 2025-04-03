package defpackage;

import android.widget.Toast;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqsf extends ffhv implements ffjm {
    final /* synthetic */ dqsg a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqsf(dqsg dqsgVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = dqsgVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dqsf) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        Toast makeText = Toast.makeText(this.a.a, R.string.emoji_search_unavailable_try_later, 1);
        makeText.setGravity(17, 0, 0);
        makeText.show();
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dqsf(this.a, ffguVar);
    }
}
