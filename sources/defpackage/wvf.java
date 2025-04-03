package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wvf extends ffhv implements ffjn {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    final /* synthetic */ wvh c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wvf(wvh wvhVar, ffgu ffguVar) {
        super(3, ffguVar);
        this.c = wvhVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        wvf wvfVar = new wvf(this.c, (ffgu) obj3);
        wvfVar.a = (alxj) obj;
        wvfVar.b = (engw) obj2;
        return wvfVar.b(ffcu.a);
    }

    /* JADX WARN: Type inference failed for: r15v1, types: [alxj, java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        final ?? r15 = this.a;
        Object obj2 = this.b;
        if (!r15.n()) {
            return null;
        }
        String string = this.c.a.getString(R.string.group_name);
        string.getClass();
        final wvh wvhVar = this.c;
        final engw engwVar = (engw) obj2;
        return new dlsr(string, dmzz.aR, false, false, false, false, null, false, null, new ffix() { // from class: wve
            @Override // defpackage.ffix
            public final Object invoke() {
                wvh wvhVar2 = wvh.this;
                axol.k(wvhVar2.d, null, new wvg(wvhVar2, r15, engwVar, null), 3);
                return ffcu.a;
            }
        }, 1020);
    }
}
