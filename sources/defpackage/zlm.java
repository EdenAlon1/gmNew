package defpackage;

import android.content.Context;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class zlm extends ffkh implements ffji {
    public zlm(Object obj) {
        super(1, obj, zmw.class, "onMessageListInteractive", "onMessageListInteractive(Landroid/content/Context;)V", 0);
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Context context = (Context) obj;
        context.getClass();
        zmw zmwVar = (zmw) this.g;
        ((enrr) zmw.a.h().h("com/google/android/apps/messaging/conversation2/messagelist/PagedMessageListUiAdapterImpl", "onMessageListInteractive", 575, "PagedMessageListUiAdapterImpl.kt")).q("message list interactive");
        zmwVar.f.e(context);
        zmwVar.k.k();
        zmwVar.q.a(zmwVar.J);
        Iterator it = zmwVar.w.a.iterator();
        while (it.hasNext()) {
            ((zks) it.next()).a();
        }
        zmwVar.j.a.f(true);
        if (zmwVar.F.a()) {
            zmwVar.V.a(abjk.a);
        }
        return ffcu.a;
    }
}
