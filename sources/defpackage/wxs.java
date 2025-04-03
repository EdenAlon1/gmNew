package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wxs extends ffhv implements ffjn {
    /* synthetic */ boolean a;
    /* synthetic */ Object b;

    public wxs(ffgu ffguVar) {
        super(3, ffguVar);
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        wxs wxsVar = new wxs((ffgu) obj3);
        wxsVar.a = booleanValue;
        wxsVar.b = (aaxe) obj2;
        return wxsVar.b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        boolean z = this.a;
        Object obj2 = this.b;
        boolean z2 = false;
        if (z) {
            aaxe aaxeVar = (aaxe) obj2;
            if (!aaxeVar.a.isEmpty()) {
                List list = aaxeVar.a;
                if (!list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (((alxr) it.next()).d().d() == 1) {
                            z2 = true;
                            break;
                        }
                    }
                }
            }
        }
        return Boolean.valueOf(z2);
    }
}
