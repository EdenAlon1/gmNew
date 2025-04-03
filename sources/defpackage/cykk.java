package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cykk extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cykn b;
    final /* synthetic */ crsn c;
    final /* synthetic */ eoko d;
    final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cykk(cykn cyknVar, crsn crsnVar, eoko eokoVar, int i, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cyknVar;
        this.c = crsnVar;
        this.d = eokoVar;
        this.e = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cykk) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            cykn cyknVar = this.b;
            crsn crsnVar = this.c;
            int i2 = this.e;
            this.a = 1;
            Object c = ((crrt) cyknVar.f.e.b()).c(crsc.c(crsnVar, eoko.CONVERSATION_FROM_UNSPAM_ACTION, i2), this);
            if (c != ffhh.a) {
                c = ffcu.a;
            }
            if (c == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cykk(this.b, this.c, this.d, this.e, ffguVar);
    }
}
