package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.firebase.appindexing.internal.Thing;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class euoa {
    private final Bundle a;
    private final String b;
    private eupg c;
    private String d;

    protected euoa(String str) {
        dfwv.l(str);
        this.a = new Bundle();
        this.b = str;
    }

    private static Object[] i(Object[] objArr) {
        if (objArr.length < 100) {
            return objArr;
        }
        eupa.b("Input Array of elements is too big, cutting off.");
        return Arrays.copyOf(objArr, 100);
    }

    public final eunt a() {
        Bundle bundle = new Bundle(this.a);
        eupg eupgVar = this.c;
        if (eupgVar == null) {
            eupgVar = new euns().a();
        }
        return new Thing(bundle, eupgVar, this.d, this.b);
    }

    public final void b(String... strArr) {
        d("keywords", strArr);
    }

    public final void c(String str, euoa... euoaVarArr) {
        Thing[] thingArr = new Thing[1];
        euoa euoaVar = euoaVarArr[0];
        if (euoaVar == null) {
            eupa.b("Builder at 0 is null and is ignored by put method.");
        } else {
            thingArr[0] = (Thing) euoaVar.a();
        }
        Bundle bundle = this.a;
        int i = 0;
        for (char c = 0; c <= 0; c = 1) {
            thingArr[i] = thingArr[0];
            if (thingArr[0] == null) {
                eupa.b("Thing at 0 is null and is ignored by put method.");
            } else {
                i++;
            }
        }
        if (i > 0) {
            bundle.putParcelableArray(str, (Parcelable[]) i((Thing[]) Arrays.copyOfRange(thingArr, 0, i)));
        }
    }

    public final void d(String str, String... strArr) {
        dfwv.n(strArr);
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        if (strArr2.length <= 0) {
            eupa.b("String array is empty and is ignored by put method.");
            return;
        }
        int i = 0;
        for (int i2 = 0; i2 < Math.min(strArr2.length, 100); i2++) {
            String str2 = strArr2[i2];
            strArr2[i] = str2;
            if (strArr2[i2] == null) {
                eupa.b(a.f(i2, "String at ", " is null and is ignored by put method."));
            } else {
                int i3 = 20000;
                if (str2.length() > 20000) {
                    eupa.b(a.f(i2, "String at ", " is too long, truncating string."));
                    String str3 = strArr2[i];
                    if (str3.length() > 20000) {
                        if (Character.isHighSurrogate(str3.charAt(19999)) && Character.isLowSurrogate(str3.charAt(20000))) {
                            i3 = 19999;
                        }
                        str3 = str3.substring(0, i3);
                    }
                    strArr2[i] = str3;
                }
                i++;
            }
        }
        if (i > 0) {
            this.a.putStringArray(str, (String[]) i((String[]) Arrays.copyOfRange(strArr2, 0, i)));
        }
    }

    public final void e(euns eunsVar) {
        dfwv.j(this.c == null, "setMetadata may only be called once");
        this.c = eunsVar.a();
    }

    public final void f(String str) {
        dfwv.n(str);
        this.d = str;
    }

    public final void g(String str) {
        dfwv.n(str);
        d("id", str);
    }

    public final void h(String str) {
        dfwv.n(str);
        d("name", str);
    }
}
