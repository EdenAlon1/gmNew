package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import j$.net.URLDecoder;
import j$.net.URLEncoder;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efco {
    public static final efco a = new efco(null);
    private final List b;

    static {
        new efcm(null, null);
    }

    public efco(List list) {
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        if (list != null) {
            arrayList.addAll(list);
        }
    }

    public static final String a(String str) {
        try {
            return URLEncoder.encode(str, efdb.a.displayName());
        } catch (UnsupportedEncodingException unused) {
            throw new IllegalStateException();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static efcm b(Uri uri) {
        efco efcoVar;
        efck efckVar;
        String str;
        String[] strArr;
        int i;
        int i2;
        char c;
        ArrayList arrayList;
        boolean z;
        efck efckVar2;
        String encodedFragment = uri.getEncodedFragment();
        if (TextUtils.isEmpty(encodedFragment)) {
            efcoVar = a;
        } else {
            ArrayList<efcj> arrayList2 = new ArrayList();
            String[] split = encodedFragment.split("&");
            int length = split.length;
            int i3 = 0;
            int i4 = 0;
            while (i4 < length) {
                char c2 = 2;
                String[] split2 = split[i4].split("=", 2);
                ArrayList arrayList3 = new ArrayList();
                String str2 = split2[i3];
                boolean z2 = !TextUtils.isEmpty(str2);
                Object[] objArr = new Object[1];
                objArr[i3] = encodedFragment;
                efdh.a(z2, "malformed key: %s", objArr);
                boolean z3 = (split2.length != 2 || TextUtils.isEmpty(split2[1])) ? i3 : 1;
                Object[] objArr2 = new Object[1];
                objArr2[i3] = encodedFragment;
                efdh.a(z3, "missing param value: %s", objArr2);
                String[] split3 = split2[1].split("\\+");
                int i5 = i3;
                while (i5 < split3.length) {
                    String str3 = split3[i5];
                    if (str3.isEmpty()) {
                        str = encodedFragment;
                        strArr = split;
                        i = length;
                        i2 = i3;
                        c = c2;
                    } else {
                        int indexOf = str3.indexOf("(");
                        if (indexOf != -1) {
                            String substring = str3.substring(indexOf);
                            int i6 = i3;
                            if (substring.charAt(i3) == '(' && substring.charAt(substring.length() - 1) == ')') {
                                str = encodedFragment;
                                z = 1;
                            } else {
                                str = encodedFragment;
                                z = i6;
                            }
                            Object[] objArr3 = new Object[1];
                            objArr3[i6] = str;
                            efdh.a(z, "malformed fragment subparams: %s", objArr3);
                            String substring2 = substring.substring(1, substring.length() - 1);
                            arrayList = new ArrayList();
                            String[] split4 = substring2.split(",");
                            int i7 = i6;
                            while (i7 < split4.length) {
                                String str4 = substring2;
                                String[] split5 = split4[i7].split("=", 2);
                                String str5 = split5[i6];
                                String[] strArr2 = split;
                                boolean z4 = !TextUtils.isEmpty(str5);
                                int i8 = length;
                                Object[] objArr4 = new Object[1];
                                objArr4[i6] = str4;
                                efdh.a(z4, "missing fragment subparam key: %s", objArr4);
                                if (split5.length != 2 || TextUtils.isEmpty(split5[1])) {
                                    arrayList.add(new efcn(c(str5), null));
                                } else {
                                    arrayList.add(new efcn(c(str5), c(split5[1])));
                                }
                                i7++;
                                substring2 = str4;
                                length = i8;
                                split = strArr2;
                            }
                            strArr = split;
                            i = length;
                            i2 = i6;
                            c = 2;
                            str3 = str3.substring(i2, indexOf);
                        } else {
                            str = encodedFragment;
                            strArr = split;
                            i = length;
                            i2 = i3;
                            c = 2;
                            boolean z5 = !str3.contains(")");
                            Object[] objArr5 = new Object[1];
                            objArr5[i2] = str;
                            efdh.a(z5, "malformed fragment subparams: %s", objArr5);
                            arrayList = null;
                        }
                        arrayList3.add(new efcl(c(str3), arrayList));
                    }
                    i5++;
                    i3 = i2;
                    c2 = c;
                    encodedFragment = str;
                    length = i;
                    split = strArr;
                }
                arrayList2.add(new efcj(c(str2), arrayList3));
                i4++;
                encodedFragment = encodedFragment;
                split = split;
            }
            int i9 = i3;
            ArrayList<efcj> arrayList4 = new ArrayList();
            for (efcj efcjVar : arrayList2) {
                int i10 = i9;
                while (true) {
                    if (i10 >= arrayList4.size()) {
                        arrayList4.add(efcjVar);
                        break;
                    }
                    if (((efcj) arrayList4.get(i10)).a.equals(efcjVar.a)) {
                        arrayList4.set(i10, efcjVar);
                        break;
                    }
                    i10++;
                }
            }
            ArrayList arrayList5 = new ArrayList();
            for (efcj efcjVar2 : arrayList4) {
                if (efcjVar2.b.isEmpty()) {
                    efckVar = null;
                } else {
                    ArrayList arrayList6 = new ArrayList();
                    for (efcl efclVar : efcjVar2.b) {
                        arrayList6.add(new efcm(efclVar.a, efclVar.b));
                    }
                    efckVar = new efck(efcjVar2.a, arrayList6);
                }
                if (efckVar != null) {
                    arrayList5.add(efckVar);
                }
            }
            efcoVar = new efco(arrayList5);
        }
        Iterator it = efcoVar.b.iterator();
        while (true) {
            if (!it.hasNext()) {
                efckVar2 = null;
                break;
            }
            efck efckVar3 = (efck) it.next();
            if (efckVar3.a.equals("transform")) {
                efckVar2 = efckVar3;
                break;
            }
        }
        if (efckVar2 == null) {
            return null;
        }
        for (efcm efcmVar : efckVar2.b) {
            if (efcmVar.a.equals("encrypt")) {
                return efcmVar;
            }
        }
        return null;
    }

    private static final String c(String str) {
        try {
            return URLDecoder.decode(str, efdb.a.displayName());
        } catch (UnsupportedEncodingException unused) {
            throw new IllegalStateException();
        }
    }

    public final String toString() {
        return TextUtils.join("&", this.b);
    }
}
