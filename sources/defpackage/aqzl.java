package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aqzl extends ffhv implements ffjm {
    int a;
    final /* synthetic */ aqzo b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aqzl(aqzo aqzoVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = aqzoVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aqzl) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        boolean z = true;
        ffci.b(obj);
        if (i == 0) {
            cnvc cnvcVar = (cnvc) this.b.a.b();
            this.a = 1;
            obj = cnvcVar.c(this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        cnuh b = cnuh.b(((cnui) obj).c);
        if (b == null) {
            b = cnuh.UNRECOGNIZED;
        }
        b.getClass();
        if (b != cnuh.SESSION_STATUS_EMERGENCY && b != cnuh.SESSION_STATUS_DEMO) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aqzl(this.b, ffguVar);
    }
}
