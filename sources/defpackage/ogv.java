package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ogv extends ffhv implements ffjm {
    /* synthetic */ Object a;

    public ogv(ffgu ffguVar) {
        super(2, ffguVar);
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ogv) c((ogo) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ogo ogoVar = (ogo) this.a;
        if (oka.a(2)) {
            Objects.toString(ogoVar);
            oka.b(2, "Sent ".concat(String.valueOf(ogoVar)));
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ogv ogvVar = new ogv(ffguVar);
        ogvVar.a = obj;
        return ogvVar;
    }
}
