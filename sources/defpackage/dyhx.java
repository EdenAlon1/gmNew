package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyhx {
    private static final String a = "dyhx";

    private dyhx() {
    }

    public static engw a(JSONArray jSONArray) {
        int i = engw.d;
        engr engrVar = new engr();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            try {
                engrVar.h(jSONArray.getString(i2));
            } catch (JSONException unused) {
                dyhr.c(a, "JSON string somehow failed to be converted to String.");
                return enou.a;
            }
        }
        return engrVar.g();
    }

    public static engw b(Collection collection, emwl emwlVar) {
        int i = engw.d;
        engr engrVar = new engr();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            emxc emxcVar = (emxc) emwlVar.apply(it.next());
            if (emxcVar.g()) {
                engrVar.h(emxcVar.c());
            }
        }
        return engrVar.g();
    }

    public static engw c(Collection collection, emwl emwlVar) {
        int i = engw.d;
        engr engrVar = new engr();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            engrVar.h(emwlVar.apply(it.next()));
        }
        return engrVar.g();
    }

    public static ArrayList d(Collection collection, emwl emwlVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(emwlVar.apply(it.next()));
        }
        return arrayList;
    }
}
