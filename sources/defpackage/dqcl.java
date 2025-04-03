package defpackage;

import android.widget.photopicker.EmbeddedPhotoPickerSession;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqcl extends ffhv implements ffjm {
    final /* synthetic */ hho a;
    final /* synthetic */ hho b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqcl(hho hhoVar, hho hhoVar2, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = hhoVar;
        this.b = hhoVar2;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dqcl) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        EmbeddedPhotoPickerSession c = dqco.c(this.a);
        if (c != null) {
            c.notifyResized((int) (dqco.a(this.b) >> 32), (int) (dqco.a(this.b) & 4294967295L));
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dqcl(this.a, this.b, ffguVar);
    }
}
