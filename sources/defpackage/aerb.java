package defpackage;

import android.widget.ImageView;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aerb extends ffhv implements ffjm {
    int a;
    final /* synthetic */ aerc b;
    final /* synthetic */ aeqk c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aerb(aerc aercVar, aeqk aeqkVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = aercVar;
        this.c = aeqkVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aerb) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            aerc aercVar = this.b;
            this.a = 1;
            obj = ((aerk) aercVar.b).b.a(this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        if (obj == null) {
            throw new IllegalStateException("Required value was null.");
        }
        aeqk aeqkVar = this.c;
        aerc aercVar2 = this.b;
        eixz eixzVar = (eixz) obj;
        aeqi aeqiVar = (aeqi) aeqkVar;
        ((aeql) aeqiVar.c()).c.setText(eixzVar.g);
        ((aeql) aeqiVar.c()).b.setText(eixzVar.d);
        ImageView imageView = ((aeql) aeqiVar.c()).d;
        int i2 = ejfs.b;
        ((aerk) aercVar2.b).c.f(new ejft(eixzVar)).v(imageView);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aerb(this.b, this.c, ffguVar);
    }
}
