package defpackage;

import j$.util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etsz {
    public final Class a;
    public etta d;
    public Map b = new HashMap();
    public final List c = new ArrayList();
    public etrt e = etrt.a;

    public etsz(Class cls) {
        this.a = cls;
    }

    public final void a(Object obj, etfs etfsVar, etzs etzsVar, boolean z) {
        byte[] c;
        if (this.b == null) {
            throw new IllegalStateException("addEntry cannot be called after build");
        }
        int b = etzn.b(etzsVar.d);
        if (b == 0 || b != 3) {
            throw new GeneralSecurityException("only ENABLED key is allowed");
        }
        euag b2 = euag.b(etzsVar.f);
        if (b2 == null) {
            b2 = euag.UNRECOGNIZED;
        }
        int ordinal = b2.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal == 3) {
                    c = etfo.a;
                } else if (ordinal != 4) {
                    throw new GeneralSecurityException("unknown output prefix type");
                }
            }
            c = etsi.a(etzsVar.e).c();
        } else {
            c = etsi.b(etzsVar.e).c();
        }
        eujt b3 = eujt.b(c);
        int b4 = etzn.b(etzsVar.d);
        etta ettaVar = new etta(obj, b3, b4 == 0 ? 1 : b4, etzsVar.e, etfsVar);
        Map map = this.b;
        List list = this.c;
        ArrayList arrayList = new ArrayList();
        arrayList.add(ettaVar);
        List list2 = (List) map.put(ettaVar.b, DesugarCollections.unmodifiableList(arrayList));
        if (list2 != null) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(list2);
            arrayList2.add(ettaVar);
            map.put(ettaVar.b, DesugarCollections.unmodifiableList(arrayList2));
        }
        list.add(ettaVar);
        if (z) {
            if (this.d != null) {
                throw new IllegalStateException("you cannot set two primary primitives");
            }
            this.d = ettaVar;
        }
    }
}
