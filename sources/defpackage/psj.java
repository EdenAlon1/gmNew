package defpackage;

import android.content.Context;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;

/* compiled from: PG */
/* loaded from: classes.dex */
final class psj extends ffhv implements ffjm {
    /* synthetic */ boolean a;
    final /* synthetic */ Context b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public psj(Context context, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = context;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((psj) c(bool, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        qae.a(this.b, RescheduleReceiver.class, this.a);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        psj psjVar = new psj(this.b, ffguVar);
        psjVar.a = ((Boolean) obj).booleanValue();
        return psjVar;
    }
}
