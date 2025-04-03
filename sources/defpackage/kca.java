package defpackage;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kca extends ffkk implements ffix {
    final /* synthetic */ Context a;
    final /* synthetic */ ffji b;
    final /* synthetic */ hfr c;
    final /* synthetic */ hrc d;
    final /* synthetic */ int e;
    final /* synthetic */ View f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kca(Context context, ffji ffjiVar, hfr hfrVar, hrc hrcVar, int i, View view) {
        super(0);
        this.a = context;
        this.b = ffjiVar;
        this.c = hfrVar;
        this.d = hrcVar;
        this.e = i;
        this.f = view;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        KeyEvent.Callback callback = this.f;
        callback.getClass();
        ffji ffjiVar = this.b;
        Context context = this.a;
        View view = (View) ffjiVar.invoke(context);
        ijj ijjVar = new ijj();
        hrc hrcVar = this.d;
        return new kcp(context, this.c, view, ijjVar, hrcVar, this.e, (iwx) callback).v;
    }
}
