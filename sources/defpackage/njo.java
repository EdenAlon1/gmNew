package defpackage;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Spanned;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class njo {
    public static final byte[] a(List list, long j) {
        emwl emwlVar = new emwl() { // from class: njn
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                lsz lszVar = (lsz) obj;
                Bundle bundle = new Bundle();
                CharSequence charSequence = lszVar.t;
                if (charSequence != null) {
                    bundle.putCharSequence(lsz.a, charSequence);
                    CharSequence charSequence2 = lszVar.t;
                    if (charSequence2 instanceof Spanned) {
                        Spanned spanned = (Spanned) charSequence2;
                        String str = ltb.a;
                        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                        for (lte lteVar : (lte[]) spanned.getSpans(0, spanned.length(), lte.class)) {
                            Bundle bundle2 = new Bundle();
                            bundle2.putString(lte.a, lteVar.c);
                            bundle2.putInt(lte.b, lteVar.d);
                            arrayList.add(ltb.a(spanned, lteVar, 1, bundle2));
                        }
                        for (ltg ltgVar : (ltg[]) spanned.getSpans(0, spanned.length(), ltg.class)) {
                            Bundle bundle3 = new Bundle();
                            bundle3.putInt(ltg.a, ltgVar.d);
                            bundle3.putInt(ltg.b, ltgVar.e);
                            bundle3.putInt(ltg.c, ltgVar.f);
                            arrayList.add(ltb.a(spanned, ltgVar, 2, bundle3));
                        }
                        for (ltc ltcVar : (ltc[]) spanned.getSpans(0, spanned.length(), ltc.class)) {
                            arrayList.add(ltb.a(spanned, ltcVar, 3, null));
                        }
                        for (lth lthVar : (lth[]) spanned.getSpans(0, spanned.length(), lth.class)) {
                            Bundle bundle4 = new Bundle();
                            bundle4.putString(lth.a, lthVar.b);
                            arrayList.add(ltb.a(spanned, lthVar, 4, bundle4));
                        }
                        if (!arrayList.isEmpty()) {
                            bundle.putParcelableArrayList(lsz.b, arrayList);
                        }
                    }
                }
                bundle.putSerializable(lsz.c, lszVar.u);
                bundle.putSerializable(lsz.d, lszVar.v);
                bundle.putFloat(lsz.g, lszVar.x);
                bundle.putInt(lsz.h, lszVar.y);
                bundle.putInt(lsz.i, lszVar.z);
                bundle.putFloat(lsz.j, lszVar.A);
                bundle.putInt(lsz.k, lszVar.B);
                bundle.putInt(lsz.l, lszVar.G);
                bundle.putFloat(lsz.m, lszVar.H);
                bundle.putFloat(lsz.n, lszVar.C);
                bundle.putFloat(lsz.o, lszVar.D);
                bundle.putBoolean(lsz.q, lszVar.E);
                bundle.putInt(lsz.p, lszVar.F);
                bundle.putInt(lsz.r, lszVar.I);
                bundle.putFloat(lsz.s, lszVar.J);
                if (lszVar.w != null) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    lti.c(lszVar.w.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream));
                    bundle.putByteArray(lsz.f, byteArrayOutputStream.toByteArray());
                }
                return bundle;
            }
        };
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(emwlVar.apply(it.next()));
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", arrayList);
        bundle.putLong("d", j);
        Parcel obtain = Parcel.obtain();
        obtain.writeBundle(bundle);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }
}
