package defpackage;

import android.util.Base64;
import android.util.Log;
import com.google.android.gms.wearable.Asset;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhzr {
    public final dhzq a;

    private dhzr(dhzm dhzmVar) {
        dhzq a;
        dhzmVar.a();
        dhzm dhzmVar2 = (dhzm) dhzmVar.d();
        byte[] c = dhzmVar2.c();
        if (c == null && !dhzmVar2.b().isEmpty()) {
            throw new IllegalArgumentException("Cannot create DataMapItem from a DataItem  that wasn't made with DataMapItem.");
        }
        if (c == null) {
            a = new dhzq();
        } else {
            try {
                ArrayList arrayList = new ArrayList();
                int size = dhzmVar2.b().size();
                for (int i = 0; i < size; i++) {
                    dhzn dhznVar = (dhzn) dhzmVar2.b().get(Integer.toString(i));
                    if (dhznVar == null) {
                        throw new IllegalStateException("Cannot find DataItemAsset referenced in data at " + i + " for " + dhzmVar2.toString());
                    }
                    String b = dhznVar.b();
                    dfwv.n(b);
                    arrayList.add(new Asset(null, b, null, null));
                }
                eyfc eyfcVar = eyfc.a;
                eyib eyibVar = eyib.a;
                a = digi.a(new digh((digs) eyfy.parseFrom(digs.a, c, eyfc.a), arrayList));
            } catch (eygu | NullPointerException e) {
                Log.w("DataItem", "Unable to parse datamap from dataItem. uri=" + String.valueOf(dhzmVar2.a()) + ", data=" + Base64.encodeToString(c, 0));
                throw new IllegalStateException("Unable to parse datamap from dataItem.  uri=".concat(String.valueOf(String.valueOf(dhzmVar2.a()))), e);
            }
        }
        this.a = a;
    }

    public static dhzr a(dhzm dhzmVar) {
        dfvf.a(dhzmVar, "dataItem must not be null");
        return new dhzr(dhzmVar);
    }
}
