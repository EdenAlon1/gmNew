package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aybk extends ffhv implements ffjm {
    final /* synthetic */ List a;
    final /* synthetic */ aybp b;
    final /* synthetic */ ayds c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aybk(ffgu ffguVar, List list, aybp aybpVar, ayds aydsVar) {
        super(2, ffguVar);
        this.a = list;
        this.b = aybpVar;
        this.c = aydsVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aybk) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        for (Object obj2 : this.a) {
            obj2.getClass();
            aybp aybpVar = this.b;
            entd entdVar = aybp.a;
            aybpVar.f.a((aydn) obj2);
        }
        if (this.c.c.size() > 0 || this.c.d.size() > 0) {
            aybp aybpVar2 = this.b;
            entd entdVar2 = aybp.a;
            aybpVar2.g.a(this.c);
            ((ensz) aybp.a.h()).q("Enqueued empty contacts for ContactRecipientDeletedSync");
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        aybk aybkVar = new aybk(ffguVar, this.a, this.b, this.c);
        aybkVar.d = obj;
        return aybkVar;
    }
}
