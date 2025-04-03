package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class uro extends aaj {
    public uro(ura uraVar) {
        super(uraVar);
    }

    @Override // defpackage.my, java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        return ((bcse) obj2).a((bcse) obj);
    }

    @Override // defpackage.my
    public final /* synthetic */ boolean e(Object obj, Object obj2) {
        bcse bcseVar = (bcse) obj;
        bcse bcseVar2 = (bcse) obj2;
        if (bcseVar == bcseVar2) {
            return true;
        }
        if (bcseVar2 == null || bcseVar.getClass() != bcseVar2.getClass()) {
            return false;
        }
        bgmp bgmpVar = bcseVar.b;
        if (bgmpVar == null) {
            return bcseVar.a.equals(bcseVar2.a);
        }
        bgmp bgmpVar2 = bcseVar2.b;
        if (bgmpVar2 == null) {
            return false;
        }
        return bgmpVar.equals(bgmpVar2);
    }

    @Override // defpackage.my
    public final /* synthetic */ boolean f(Object obj, Object obj2) {
        return ((bcse) obj).equals((bcse) obj2);
    }
}
