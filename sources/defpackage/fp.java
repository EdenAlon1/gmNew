package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fp implements fm {
    final /* synthetic */ fr a;
    private final String b;

    public fp(fr frVar, String str) {
        this.a = frVar;
        this.b = str;
    }

    @Override // defpackage.fm
    public final boolean h(ArrayList arrayList, ArrayList arrayList2) {
        fr frVar = this.a;
        ck ckVar = (ck) frVar.j.remove(this.b);
        boolean z = false;
        if (ckVar == null) {
            return false;
        }
        HashMap hashMap = new HashMap();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            cg cgVar = (cg) arrayList.get(i);
            if (cgVar.d) {
                ArrayList arrayList3 = cgVar.e;
                int size2 = arrayList3.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ea eaVar = ((gf) arrayList3.get(i2)).b;
                    if (eaVar != null) {
                        hashMap.put(eaVar.l, eaVar);
                    }
                }
            }
        }
        HashMap hashMap2 = new HashMap(ckVar.a.size());
        for (String str : ckVar.a) {
            ea eaVar2 = (ea) hashMap.get(str);
            if (eaVar2 != null) {
                hashMap2.put(eaVar2.l, eaVar2);
            } else {
                Bundle a = frVar.b.a(str, null);
                if (a != null) {
                    ClassLoader classLoader = frVar.o.c.getClassLoader();
                    ea a2 = ((ga) a.getParcelable("state")).a(frVar.l());
                    a2.h = a;
                    if (a2.h.getBundle("savedInstanceState") == null) {
                        a2.h.putBundle("savedInstanceState", new Bundle());
                    }
                    Bundle bundle = a.getBundle("arguments");
                    if (bundle != null) {
                        bundle.setClassLoader(classLoader);
                    }
                    a2.at(bundle);
                    hashMap2.put(a2.l, a2);
                }
            }
        }
        ArrayList arrayList4 = new ArrayList();
        for (ci ciVar : ckVar.b) {
            cg cgVar2 = new cg(frVar);
            ciVar.a(cgVar2);
            for (int i3 = 0; i3 < ciVar.b.size(); i3++) {
                String str2 = (String) ciVar.b.get(i3);
                if (str2 != null) {
                    ea eaVar3 = (ea) hashMap2.get(str2);
                    if (eaVar3 == null) {
                        throw new IllegalStateException("Restoring FragmentTransaction " + ciVar.f + " failed due to missing saved state for Fragment (" + str2 + ")");
                    }
                    ((gf) cgVar2.e.get(i3)).b = eaVar3;
                }
            }
            arrayList4.add(cgVar2);
        }
        Iterator it = arrayList4.iterator();
        while (it.hasNext()) {
            ((cg) it.next()).h(arrayList, arrayList2);
            z = true;
        }
        return z;
    }
}
