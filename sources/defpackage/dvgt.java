package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvgt implements emva {
    @Override // defpackage.emva
    public final /* synthetic */ boolean b(Object obj, Object obj2) {
        if (obj != null) {
            ewai ewaiVar = (ewai) obj;
            if (ewaiVar.b == 1) {
                dvdt dvdtVar = ((dvgj) obj2).a;
                if (dvdtVar.b == 1) {
                    evwj evwjVar = (evwj) dvdtVar.c;
                    evwj evwjVar2 = (evwj) ewaiVar.c;
                    evwj a = dvgy.a(evwjVar);
                    evwj a2 = dvgy.a(evwjVar2);
                    if (a.c == a2.c && a.d == a2.d && a.e.equals(a2.e)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
