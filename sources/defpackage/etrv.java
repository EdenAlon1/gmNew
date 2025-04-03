package defpackage;

import j$.util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etrv {
    public static void a(ettb ettbVar) {
        etfu etfuVar;
        ArrayList arrayList = new ArrayList();
        etrt etrtVar = etrt.a;
        Iterator it = ettbVar.a().iterator();
        while (it.hasNext()) {
            for (etta ettaVar : (List) it.next()) {
                etfs etfsVar = ettaVar.d;
                int i = ettaVar.e - 2;
                if (i == 1) {
                    etfuVar = etfu.a;
                } else if (i == 2) {
                    etfuVar = etfu.b;
                } else {
                    if (i != 3) {
                        throw new IllegalStateException("Unknown key status");
                    }
                    etfuVar = etfu.c;
                }
                arrayList.add(new etru(etfuVar, ettaVar.c));
            }
        }
        etta ettaVar2 = ettbVar.a;
        Integer valueOf = ettaVar2 != null ? Integer.valueOf(ettaVar2.c) : null;
        if (valueOf != null) {
            try {
                int intValue = valueOf.intValue();
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    int i3 = ((etru) arrayList.get(i2)).a;
                    i2++;
                    if (i3 == intValue) {
                    }
                }
                throw new GeneralSecurityException("primary key ID is not present in entries");
            } catch (GeneralSecurityException e) {
                throw new IllegalStateException(e);
            }
        }
        DesugarCollections.unmodifiableList(arrayList);
    }
}
