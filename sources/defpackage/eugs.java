package defpackage;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eugs implements ettc {
    public static final eugs a = new eugs();
    public static final etsv b = new etst(etrr.class, etgl.class, new etsu() { // from class: eugr
        @Override // defpackage.etsu
        public final Object a(etfs etfsVar) {
            ettd ettdVar = ((etrr) etfsVar).a;
            etzk etzkVar = (etzk) etzm.a.createBuilder();
            String str = ettdVar.a;
            etzkVar.copyOnWrite();
            etzm etzmVar = (etzm) etzkVar.instance;
            str.getClass();
            etzmVar.b = str;
            eyee eyeeVar = ettdVar.c;
            etzkVar.copyOnWrite();
            etzm etzmVar2 = (etzm) etzkVar.instance;
            eyeeVar.getClass();
            etzmVar2.c = eyeeVar;
            int i = ettdVar.f;
            etzkVar.copyOnWrite();
            ((etzm) etzkVar.instance).d = etzl.a(i);
            return new euhd((etgl) etgj.b((etzm) etzkVar.build(), etgl.class));
        }
    });

    @Override // defpackage.ettc
    public final Class a() {
        return etgl.class;
    }

    @Override // defpackage.ettc
    public final Class b() {
        return etgl.class;
    }

    @Override // defpackage.ettc
    public final /* bridge */ /* synthetic */ Object c(ettb ettbVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = ettbVar.a().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((List) it.next()).iterator();
            while (it2.hasNext()) {
                arrayList.add((etgl) ((etta) it2.next()).a);
            }
        }
        etta ettaVar = ettbVar.a;
        if (ettaVar != null) {
            return new eugo(arrayList, (etgl) ettaVar.a);
        }
        throw new GeneralSecurityException("No primary set");
    }
}
