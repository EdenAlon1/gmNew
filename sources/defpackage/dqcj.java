package defpackage;

import android.net.Uri;
import android.widget.photopicker.EmbeddedPhotoPickerSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqcj extends ffhv implements ffjm {
    final /* synthetic */ hho a;
    final /* synthetic */ hho b;
    final /* synthetic */ hkx c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqcj(hho hhoVar, hho hhoVar2, hkx hkxVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = hhoVar;
        this.b = hhoVar2;
        this.c = hkxVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dqcj) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        EmbeddedPhotoPickerSession c;
        ffci.b(obj);
        if (dqco.c(this.a) != null) {
            List list = (List) this.b.a();
            hkx hkxVar = this.c;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (!dqco.d(hkxVar).contains((drnm) obj2)) {
                    arrayList.add(obj2);
                }
            }
            this.b.b(dqco.d(this.c));
            if (!arrayList.isEmpty() && (c = dqco.c(this.a)) != null) {
                ArrayList arrayList2 = new ArrayList(ffdx.n(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(Uri.parse(((drnm) it.next()).f()));
                }
                c.requestRevokeUriPermission(arrayList2);
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dqcj(this.a, this.b, this.c, ffguVar);
    }
}
