package defpackage;

import android.webkit.WebView;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dowu extends ffhv implements ffjm {
    int a;
    final /* synthetic */ doxe b;
    final /* synthetic */ hho c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dowu(doxe doxeVar, hho hhoVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = doxeVar;
        this.c = hhoVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dowu) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            doxe doxeVar = this.b;
            WebView a = dowz.a(this.c);
            if (a == null) {
                return ffcu.a;
            }
            this.a = 1;
            if (doxeVar.a(a, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        throw new ffbx();
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dowu(this.b, this.c, ffguVar);
    }
}
