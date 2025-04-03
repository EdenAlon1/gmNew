package defpackage;

import android.webkit.WebView;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class doxd extends ffhv implements ffjm {
    int a;
    final /* synthetic */ doxe b;
    final /* synthetic */ WebView c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public doxd(doxe doxeVar, WebView webView, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = doxeVar;
        this.c = webView;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((doxd) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            doxe doxeVar = this.b;
            doxc doxcVar = new doxc(this.c);
            this.a = 1;
            if (fgct.g((fgct) doxeVar.a, doxcVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        throw new ffbx();
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new doxd(this.b, this.c, ffguVar);
    }
}
