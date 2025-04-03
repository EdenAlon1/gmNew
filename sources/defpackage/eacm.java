package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eacm extends mr {
    private static final String a = "eacm";

    @Override // defpackage.mr
    public final /* synthetic */ boolean b(Object obj, Object obj2) {
        return ((eacj) obj).equals((eacj) obj2);
    }

    @Override // defpackage.mr
    public final /* bridge */ /* synthetic */ boolean c(Object obj, Object obj2) {
        eacj eacjVar = (eacj) obj;
        eacj eacjVar2 = (eacj) obj2;
        if (eacjVar.e() != eacjVar2.e()) {
            return false;
        }
        int ordinal = eacjVar.e().ordinal();
        if (ordinal == 0) {
            return ((dzqs) eacjVar.b().c().c()).r().equals(((dzqs) eacjVar2.b().c().c()).r());
        }
        if (ordinal == 1) {
            return eacjVar.a().d().equals(eacjVar2.a().d());
        }
        if (ordinal == 2) {
            return ((dzqs) eacjVar.c().c().c()).r().equals(((dzqs) eacjVar2.c().c().c()).r());
        }
        if (ordinal == 3) {
            return ((dzqs) eacjVar.d().c().c()).r().equals(((dzqs) eacjVar2.d().c().c()).r());
        }
        if (ordinal == 4) {
            return false;
        }
        dyhr.c(a, "Unrecognized messageList cell type");
        return true;
    }
}
