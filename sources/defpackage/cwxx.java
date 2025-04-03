package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cwxx extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cwxy b;
    final /* synthetic */ View c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cwxx(cwxy cwxyVar, View view, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cwxyVar;
        this.c = view;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cwxx) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            cwxy cwxyVar = this.b;
            View view = this.c;
            this.a = 1;
            if (cwxyVar.a(view, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cwxx(this.b, this.c, ffguVar);
    }
}
