package defpackage;

import android.text.Spanned;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqyh extends ffhv implements ffjm {
    final /* synthetic */ dqyk a;
    final /* synthetic */ lew b;
    final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqyh(dqyk dqykVar, lew lewVar, Object obj, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = dqykVar;
        this.b = lewVar;
        this.c = obj;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dqyh) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        dqyk dqykVar = this.a;
        CharSequence a = dqykVar.a(this.c);
        CharSequence d = this.b.d(a, 0, a.length(), a.length(), 1);
        d.getClass();
        dqykVar.f = d;
        dqyk dqykVar2 = this.a;
        CharSequence charSequence = dqykVar2.f;
        Spanned spanned = charSequence instanceof Spanned ? (Spanned) charSequence : null;
        dqykVar2.g = spanned != null ? (lfb[]) spanned.getSpans(0, spanned.length(), lfb.class) : null;
        this.a.postInvalidate();
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dqyh(this.a, this.b, this.c, ffguVar);
    }
}
