package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yef extends ffhv implements ffjm {
    int a;
    final /* synthetic */ xhs b;
    final /* synthetic */ bswn c;
    final /* synthetic */ yeh d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yef(ffgu ffguVar, xhs xhsVar, bswn bswnVar, yeh yehVar) {
        super(2, ffguVar);
        this.b = xhsVar;
        this.c = bswnVar;
        this.d = yehVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((yef) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        xhs xhsVar;
        xhs xhsVar2;
        List list;
        ffhh ffhhVar = ffhh.a;
        if (this.a == 0) {
            ffci.b(obj);
            xhsVar = this.b;
            bswn bswnVar = this.c;
            bswnVar.az(2, "attachments");
            ydv ydvVar = bswnVar.c;
            if (ydvVar != null) {
                yeh yehVar = this.d;
                this.e = xhsVar;
                this.a = 1;
                Object a = ffra.a(ekxi.a(yehVar.a), new yee(null, ydvVar, yehVar), this);
                if (a == ffhhVar) {
                    return ffhhVar;
                }
                xhsVar2 = xhsVar;
                obj = a;
            }
            xhsVar2 = xhsVar;
            list = ffel.a;
            xhsVar2.a(list);
            return ffcu.a;
        }
        xhsVar2 = (xhs) this.e;
        ffci.b(obj);
        list = (List) obj;
        if (list == null) {
            xhsVar = xhsVar2;
            xhsVar2 = xhsVar;
            list = ffel.a;
        }
        xhsVar2.a(list);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        yef yefVar = new yef(ffguVar, this.b, this.c, this.d);
        yefVar.e = obj;
        return yefVar;
    }
}
