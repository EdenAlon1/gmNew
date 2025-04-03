package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class baly extends ffhv implements ffjm {
    int a;
    final /* synthetic */ bamw b;
    final /* synthetic */ bakx c;
    final /* synthetic */ balz d;
    final /* synthetic */ epvo e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public baly(ffgu ffguVar, bamw bamwVar, bakx bakxVar, balz balzVar, epvo epvoVar) {
        super(2, ffguVar);
        this.b = bamwVar;
        this.c = bakxVar;
        this.d = balzVar;
        this.e = epvoVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((baly) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        bamw bamwVar = this.b;
        cskc cskcVar = bamw.a;
        ayzn ayznVar = (ayzn) bamwVar.x.b();
        bakx bakxVar = this.c;
        ConversationIdType m = bakxVar.m();
        bdfy f = bakxVar.f();
        f.getClass();
        balz balzVar = this.d;
        elfl a = ayznVar.a(m, f.b(), balzVar.a, balzVar.b, this.e);
        a.getClass();
        this.a = 1;
        Object c = fgfz.c(a, this);
        return c == ffhhVar ? ffhhVar : c;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        baly balyVar = new baly(ffguVar, this.b, this.c, this.d, this.e);
        balyVar.f = obj;
        return balyVar;
    }
}
