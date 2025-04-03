package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewxr implements Parcelable {
    public static final Parcelable.Creator<ewxr> CREATOR = new ewxo();
    public static final enhk a;
    private final String b;
    private final Uri c;
    private final engi d;
    private final String e;

    static {
        enhd enhdVar = new enhd();
        for (ewxp ewxpVar : ewxp.values()) {
            enhdVar.k(Integer.valueOf(ewxpVar.o), ewxpVar);
        }
        a = enhdVar.c();
    }

    public ewxr(String str, Uri uri, engi engiVar, String str2) {
        this.b = str;
        this.c = uri;
        this.d = engiVar;
        this.e = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Bundle bundle = new Bundle();
        bundle.putString("textclassifier.extras.KgDeeplink.PACKAGE_ID", this.b);
        bundle.putParcelable("textclassifier.extras.KgDeeplink.URI", this.c);
        ArrayList<Integer> arrayList = new ArrayList<>();
        enqv it = ((engw) this.d).iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((ewxp) it.next()).o));
        }
        bundle.putIntegerArrayList("textclassifier.extras.KgDeeplink.ACTIONS", arrayList);
        bundle.putString("textclassifier.extras.KgDeeplink.DISPLAY_LABEL", this.e);
        bundle.writeToParcel(parcel, i);
    }

    public ewxr(Parcel parcel) {
        Bundle bundle = new Bundle();
        bundle.readFromParcel(parcel);
        this.b = bundle.getString("textclassifier.extras.KgDeeplink.PACKAGE_ID");
        this.c = (Uri) bundle.getParcelable("textclassifier.extras.KgDeeplink.URI");
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("textclassifier.extras.KgDeeplink.ACTIONS");
        int i = engw.d;
        engr engrVar = new engr();
        int size = integerArrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Integer num = integerArrayList.get(i2);
            enhk enhkVar = a;
            if (!enhkVar.containsKey(num)) {
                Objects.toString(num);
                throw new IllegalArgumentException("Unknown action value: ".concat(String.valueOf(num)));
            }
            engrVar.h((ewxp) enhkVar.get(num));
        }
        this.d = engrVar.g();
        this.e = bundle.getString("textclassifier.extras.KgDeeplink.DISPLAY_LABEL");
    }
}
