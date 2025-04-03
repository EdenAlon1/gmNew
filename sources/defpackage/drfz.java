package defpackage;

import android.widget.Toast;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drfz extends ffhv implements ffjm {
    final /* synthetic */ drgb a;
    final /* synthetic */ Integer b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public drfz(drgb drgbVar, Integer num, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = drgbVar;
        this.b = num;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((drfz) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        Toast makeText = Toast.makeText(this.a.z(), this.b.intValue(), 1);
        makeText.setGravity(17, 0, 0);
        makeText.show();
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new drfz(this.a, this.b, ffguVar);
    }
}
