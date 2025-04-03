package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dujv implements Parcelable {
    public static final Parcelable.Creator<dujv> CREATOR = new duju();
    public final Bundle a;
    public final List b;
    private List c = new ArrayList();

    public dujv() {
        Bundle bundle = new Bundle();
        this.a = bundle;
        bundle.putString("m.v", "3");
        this.b = new ArrayList();
    }

    public static boolean b(int i, long j) {
        return i == 0 && j < 1500;
    }

    private final void g(String str, boolean z) {
        if (z) {
            this.a.putString(str, "1");
        } else {
            this.a.remove(str);
        }
    }

    private final void h(String str, long j) {
        if (j < 0) {
            this.a.remove(str);
        } else {
            this.a.putLong(str, j);
        }
    }

    public final Uri a(boolean z) {
        Uri.Builder builder = new Uri.Builder();
        h("m.lt", System.currentTimeMillis() / 1000);
        for (String str : this.a.keySet()) {
            if (z || !this.c.contains(str)) {
                Object obj = this.a.get(str);
                if (obj instanceof List) {
                    Iterator it = ((List) obj).iterator();
                    while (it.hasNext()) {
                        builder.appendQueryParameter(str, String.valueOf(it.next()));
                    }
                } else if (obj != null) {
                    builder.appendQueryParameter(str, obj.toString());
                }
            }
        }
        if ("o".equals(this.a.getString("t"))) {
            builder.appendQueryParameter("m.sh", "close");
        }
        builder.appendQueryParameter("d", "1");
        return builder.build();
    }

    public final void c(String str) {
        f("t", str);
    }

    public final void d(int i, evpt evptVar, euka eukaVar) {
        long j = (evptVar.b & 2) != 0 ? evptVar.e : -1L;
        this.a.remove(a.h(i, "m.sc-"));
        this.a.remove(a.h(i, "m.d-"));
        if (b(i, j)) {
            Log.d("HatsLibAnswerBeacon", a.y(j, "First question delay ", " is considered spammy."));
            h(a.h(i, "m.sc-"), j);
        } else {
            h(a.h(i, "m.d-"), j);
        }
        eygi eygiVar = eukaVar.h;
        if (eygiVar.isEmpty()) {
            f(a.h(i, "r.o-"), null);
        } else {
            f(a.h(i, "r.o-"), TextUtils.join(".", eygiVar));
        }
        g(a.h(i, "r.t-"), evptVar.f);
        eygr eygrVar = evptVar.d;
        int b = euki.b(eukaVar.d);
        if (b != 0 && b == 5) {
            this.c.add(a.h(i, "r.r-"));
        }
        this.a.putStringArrayList(a.h(i, "r.r-"), new ArrayList<>(eygrVar));
        if ((evptVar.b & 16) != 0) {
            String str = evptVar.g;
            if (Log.isLoggable("HatsLibAnswerBeacon", 3)) {
                Log.d("HatsLibAnswerBeacon", "Setting piped answer in beacon. Question Index: " + i + ", PipedAnswer candidate: " + str);
            }
            f(a.h(i, "m.pa-"), str);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void e(int i) {
        g(a.h(i, "r.s-"), true);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dujv)) {
            return false;
        }
        Bundle bundle = this.a;
        Bundle bundle2 = ((dujv) obj).a;
        if (bundle.size() != bundle2.size()) {
            return false;
        }
        Set<String> keySet = bundle.keySet();
        if (!keySet.containsAll(bundle2.keySet())) {
            return false;
        }
        for (String str : keySet) {
            Object obj2 = bundle.get(str);
            Object obj3 = bundle2.get(str);
            if (obj2 == null) {
                if (obj3 != null) {
                    return false;
                }
            } else if (!obj2.equals(obj3)) {
                return false;
            }
        }
        return true;
    }

    public final void f(String str, String str2) {
        if (str2 == null) {
            this.a.remove(str);
        } else {
            this.a.putString(str, str2);
        }
    }

    public final int hashCode() {
        return this.a.keySet().hashCode();
    }

    public final String toString() {
        return "AnswerBeacon{" + a(true).toString().replace("&", "\n") + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.a);
        parcel.writeInt(this.b.size());
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            parcel.writeByteArray(((evpt) it.next()).toByteArray());
        }
    }

    public dujv(Parcel parcel) {
        Bundle readBundle = parcel.readBundle(getClass().getClassLoader());
        this.a = readBundle;
        if (readBundle != null) {
            int readInt = parcel.readInt();
            this.b = new ArrayList(readInt);
            for (int i = 0; i < readInt; i++) {
                this.b.add((evpt) dukd.a(evpt.a, parcel.createByteArray()));
            }
            return;
        }
        throw new NullPointerException("Parcel did not contain required Bundle while unparceling an AnswerBeacon.");
    }
}
