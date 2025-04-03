package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jlp {
    public static final jlm a = new jlm("");

    public static final List a(jlm jlmVar, int i, int i2, ffji ffjiVar) {
        List list;
        if (i == i2 || (list = jlmVar.a) == null) {
            return null;
        }
        int i3 = 0;
        if (i == 0) {
            if (i2 >= jlmVar.b.length()) {
                if (ffjiVar == null) {
                    return list;
                }
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                while (i3 < size) {
                    Object obj = list.get(i3);
                    if (((Boolean) ffjiVar.invoke(((jlk) obj).a)).booleanValue()) {
                        arrayList.add(obj);
                    }
                    i3++;
                }
                return arrayList;
            }
            i = 0;
        }
        ArrayList arrayList2 = new ArrayList(list.size());
        int size2 = list.size();
        while (i3 < size2) {
            jlk jlkVar = (jlk) list.get(i3);
            if (ffjiVar == null || ((Boolean) ffjiVar.invoke(jlkVar.a)).booleanValue()) {
                int i4 = jlkVar.b;
                if (b(i, i2, i4, jlkVar.c)) {
                    arrayList2.add(new jlk((jlg) jlkVar.a, ffmk.i(i4, i, i2) - i, ffmk.i(jlkVar.c, i, i2) - i, jlkVar.d));
                }
            }
            i3++;
        }
        return arrayList2;
    }

    public static final boolean b(int i, int i2, int i3, int i4) {
        return ((i < i4) & (i3 < i2)) | (((i == i2) | (i3 == i4)) & (i == i3));
    }
}
