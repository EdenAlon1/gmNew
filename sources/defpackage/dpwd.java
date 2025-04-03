package defpackage;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpwd extends ffhv implements ffji {
    int a;
    final /* synthetic */ dpwf b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpwd(dpwf dpwfVar, ffgu ffguVar) {
        super(1, ffguVar);
        this.b = dpwfVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object obj2;
        Collection collection;
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            dtll dtllVar = this.b.j;
            if (dtllVar == null) {
                ((enrr) dpwf.a.h().h("com/google/android/libraries/compose/cameragallery/ui/camera/inapp/effects/CameraEffectsManager$loadFilteredEffects$1", "invokeSuspend", 71, "CameraEffectsManager.kt")).q("No XenoManager provided, returning empty effects list.");
                return ffel.a;
            }
            this.a = 1;
            obj = dtllVar.d(this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        dpwf dpwfVar = this.b;
        Iterator it = ((Iterable) obj).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (ffkj.e(((detk) obj2).a, dpwfVar.e.a)) {
                break;
            }
        }
        detk detkVar = (detk) obj2;
        if (detkVar != null) {
            ArrayList<detn> arrayList = new ArrayList();
            for (Object obj3 : detkVar.b) {
                ((detn) obj3).a.getClass();
                arrayList.add(obj3);
            }
            dpwf dpwfVar2 = this.b;
            collection = new ArrayList(ffdx.n(arrayList, 10));
            for (detn detnVar : arrayList) {
                detnVar.getClass();
                dtll dtllVar2 = dpwfVar2.j;
                if (dtllVar2 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                String str = detnVar.a;
                str.getClass();
                String str2 = detnVar.a;
                String f = dtllVar2.f(str);
                str2.getClass();
                dtll dtllVar3 = dpwfVar2.j;
                Integer b = dtllVar2.b(str2);
                str2.getClass();
                Bitmap bitmap = detnVar.b;
                dszq a = dtllVar3.a(str2);
                dpwl dpwkVar = b != null ? new dpwk(b.intValue(), a) : bitmap != null ? new dpwj(bitmap, a) : null;
                String str3 = detnVar.a;
                str3.getClass();
                collection.add(new dpvw(str3, f, dpwkVar));
            }
        } else {
            collection = ffel.a;
        }
        if (collection.isEmpty()) {
            return ffel.a;
        }
        dpwf dpwfVar3 = this.b;
        fffs fffsVar = new fffs((byte[]) null);
        fffsVar.add(dpwfVar3.i);
        fffsVar.addAll(collection);
        return ffdx.a(fffsVar);
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new dpwd(this.b, (ffgu) obj).b(ffcu.a);
    }
}
