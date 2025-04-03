package defpackage;

import android.content.res.TypedArray;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class czdv implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ czdz a;

    public czdv(czdz czdzVar) {
        this.a = czdzVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.a.p(this);
        ensk h = czdz.ah.h();
        h.Y(ente.a, "emojiGallery");
        ((enrr) ((enrr) h).h("com/google/android/apps/messaging/ui/conversation/emoji/EmojiGalleryFragment", "onFinishLayout", 318, "EmojiGalleryFragment.java")).q("onFinishLayout()");
        czdz czdzVar = this.a;
        czeh czehVar = czdzVar.aj;
        int i = ddzd.b(czdzVar.z()).x;
        SparseArray sparseArray = new SparseArray();
        int i2 = 0;
        while (true) {
            int length = czeh.d.length;
            if (i2 >= 9) {
                break;
            }
            int i3 = i2 + 1;
            TypedArray obtainTypedArray = czehVar.f.getResources().obtainTypedArray(czeh.d[i2].intValue());
            ArrayList arrayList = new ArrayList();
            for (int i4 = 0; i4 < obtainTypedArray.length(); i4++) {
                String string = obtainTypedArray.getString(i4);
                if (string != null) {
                    if (czehVar.j.h(czehVar.h.a(string))) {
                        arrayList.add(new czeb(string, i3, false));
                    }
                }
            }
            obtainTypedArray.recycle();
            sparseArray.put(i3, arrayList);
            i2 = i3;
        }
        czehVar.r = sparseArray;
        czehVar.H(i);
        czehVar.o = new ArrayList();
        czehVar.q = new SparseIntArray();
        czehVar.I(czehVar.o, czehVar.q);
        for (int i5 = 0; i5 < czehVar.r.size(); i5++) {
            int keyAt = czehVar.r.keyAt(i5);
            czehVar.o.add(new czeb(czehVar.f.getResources().getString(czeh.e[keyAt].intValue()), keyAt, true));
            czehVar.q.put(keyAt, czehVar.o.size() - 1);
            czehVar.o.addAll((Collection) czehVar.r.get(keyAt));
        }
        czehVar.l.a(czehVar);
        czdzVar.am = czdzVar.aj.F();
        czdzVar.al = new czdw(czdzVar, czdzVar.G(), czdzVar.aj.u);
        czdzVar.ai.ap(czdzVar.al);
        czdzVar.al.g = new czdx(czdzVar);
        czfz czfzVar = czdzVar.ao;
        if (czfzVar != null) {
            czdzVar.aj.w = czfzVar;
        } else {
            czdzVar.aj.K();
        }
        czdzVar.aj.v = czdzVar;
        czdzVar.ai.z(czdzVar.an);
        czdzVar.am = czdzVar.aj.F();
        czdzVar.r(czdzVar.aj.F());
    }
}
