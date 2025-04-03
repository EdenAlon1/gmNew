package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jgv extends ffhv implements ffjm {
    int a;
    final /* synthetic */ hjh b;
    final /* synthetic */ View c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jgv(hjh hjhVar, View view, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = hjhVar;
        this.c = view;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((jgv) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object obj2 = ffhh.a;
        try {
            if (this.a != 0) {
                ffci.b(obj);
            } else {
                ffci.b(obj);
                hjh hjhVar = this.b;
                this.a = 1;
                Object b = fgbj.b(hjhVar.q, new hiy(null), this);
                if (b != ffhh.a) {
                    b = ffcu.a;
                }
                if (b == obj2) {
                    return obj2;
                }
            }
            View view = this.c;
            if (jhe.a(view) == this.b) {
                jhe.b(this.c, null);
            }
            return ffcu.a;
        } catch (Throwable th) {
            View view2 = this.c;
            if (jhe.a(view2) == this.b) {
                jhe.b(this.c, null);
            }
            throw th;
        }
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new jgv(this.b, this.c, ffguVar);
    }
}
