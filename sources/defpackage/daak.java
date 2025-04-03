package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class daak extends ffhv implements ffjm {
    int a;
    final /* synthetic */ daaj b;
    final /* synthetic */ List c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public daak(ffgu ffguVar, daaj daajVar, List list) {
        super(2, ffguVar);
        this.b = daajVar;
        this.c = list;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((daak) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        boolean z;
        ffhh ffhhVar = ffhh.a;
        try {
            if (this.a != 0) {
                ffci.b(obj);
            } else {
                ffci.b(obj);
                this.b.e.c("Bugle.UI.LeaveRcsGroup.Click");
                this.b.e.e("Bugle.UI.LeaveRcsGroup.LeftGroupCount", this.c.size());
                elfl p = ((alxl) this.b.c.b()).p(engq.a(this.c));
                p.getClass();
                this.a = 1;
                obj = fgfz.c(p, this);
                if (obj == ffhhVar) {
                    return ffhhVar;
                }
            }
            z = ((Boolean) obj).booleanValue();
        } catch (UnsupportedOperationException e) {
            ((ensz) ((ensz) daaj.a.i()).g(e)).q("Failed to leave one or more groups, exception thrown");
            z = false;
        }
        if (z) {
            daaj.a.n().q("Successfully left one or more groups");
            this.b.e.c("Bugle.UI.LeaveRcsGroup.Success");
        } else {
            daaj.a.n().q("Failed to leave one or more groups");
            this.b.e.c("Bugle.UI.LeaveRcsGroup.Failure");
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        daak daakVar = new daak(ffguVar, this.b, this.c);
        daakVar.d = obj;
        return daakVar;
    }
}
