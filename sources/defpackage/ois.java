package defpackage;

import java.lang.ref.WeakReference;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ois extends ffhv implements ffjm {
    final /* synthetic */ oiv a;
    final /* synthetic */ ofz b;
    final /* synthetic */ ofx c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ois(oiv oivVar, ofz ofzVar, ofx ofxVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = oivVar;
        this.b = ofzVar;
        this.c = ofxVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ois) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ffdx.v(this.a.f, oir.a);
        Iterator it = this.a.f.iterator();
        while (it.hasNext()) {
            ffjm ffjmVar = (ffjm) ((WeakReference) it.next()).get();
            if (ffjmVar != null) {
                ffjmVar.a(this.b, this.c);
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ois(this.a, this.b, this.c, ffguVar);
    }
}
