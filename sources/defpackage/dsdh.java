package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dsdh extends ffhv implements ffji {
    int a;
    final /* synthetic */ dsed b;
    final /* synthetic */ drey c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsdh(dsed dsedVar, drey dreyVar, ffgu ffguVar) {
        super(1, ffguVar);
        this.b = dsedVar;
        this.c = dreyVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object a;
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        dsed dsedVar = this.b;
        drey dreyVar = this.c;
        this.a = 1;
        drek drekVar = dreyVar.c;
        if (drekVar instanceof drej) {
            a = dsedVar.bk().c(dreyVar.b, this);
            if (a != ffhh.a) {
                a = (dsci) a;
            }
        } else {
            if (!(drekVar instanceof dsch)) {
                Objects.toString(drekVar);
                throw new IllegalArgumentException("Unrecognized GIF/sticker media source ".concat(drekVar.toString()));
            }
            a = dsedVar.bl().a(dreyVar.b, this);
            if (a != ffhh.a) {
                a = (dsci) a;
            }
        }
        return a == ffhhVar ? ffhhVar : a;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new dsdh(this.b, this.c, (ffgu) obj).b(ffcu.a);
    }
}
