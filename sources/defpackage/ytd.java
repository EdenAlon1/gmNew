package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ytd extends ffhv implements ffjm {
    int a;
    final /* synthetic */ yti b;
    final /* synthetic */ View c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ytd(yti ytiVar, View view, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ytiVar;
        this.c = view;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ytd) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            yti ytiVar = this.b;
            adw adwVar = new adw();
            View view = this.c;
            aiir aiirVar = new aiir("FilePicker", adwVar, "*/*", view != null ? ysj.a(view) : null);
            this.a = 1;
            obj = ytiVar.h(aiirVar, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ytd(this.b, this.c, ffguVar);
    }
}
