package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzyl extends mr {
    final /* synthetic */ mr a;

    public dzyl(mr mrVar) {
        this.a = mrVar;
    }

    @Override // defpackage.mr
    public final boolean b(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        return this.a.b(obj, obj2);
    }

    @Override // defpackage.mr
    public final boolean c(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        return this.a.c(obj, obj2);
    }
}
