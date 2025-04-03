package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final /* synthetic */ class ejsg extends ffkh implements ffjn {
    public static final ejsg a = new ejsg();

    public ejsg() {
        super(3, ejsh.class, "reduceLocal", "reduceLocal(Lcom/google/apps/tiktok/coroutines/flow/LocalSnapshot;Lcom/google/apps/tiktok/coroutines/flow/LocalReadState;Z)Lcom/google/apps/tiktok/coroutines/flow/LocalSnapshot;", 1);
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        ejsy ejsyVar = (ejsy) obj;
        ejsr ejsrVar = (ejsr) obj2;
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        ejsyVar.getClass();
        ejsrVar.getClass();
        if (ejsrVar instanceof ejsq) {
            if (ejsyVar instanceof ejst) {
                return new ejsv(null);
            }
            if (ejsyVar instanceof ejss) {
                return new ejsv(((ejss) ejsyVar).a);
            }
            if (ejsyVar instanceof ejsv) {
                return new ejsv(((ejsv) ejsyVar).a);
            }
            if (ejsyVar instanceof ejsu) {
                return new ejsw(((ejsu) ejsyVar).a, null);
            }
            if (ejsyVar instanceof ejsx) {
                ejsx ejsxVar = (ejsx) ejsyVar;
                return new ejsw(ejsxVar.a, ejsxVar.b);
            }
            if (!(ejsyVar instanceof ejsw)) {
                throw new ffcd();
            }
            ejsw ejswVar = (ejsw) ejsyVar;
            return new ejsw(ejswVar.a, ejswVar.b);
        }
        if (!(ejsrVar instanceof ejsp)) {
            throw new ffcd();
        }
        ejqs ejqsVar = ((ejsp) ejsrVar).a;
        if (ejqsVar instanceof ejqr) {
            return booleanValue ? new ejsw(((ejqr) ejqsVar).a, null) : new ejsu(((ejqr) ejqsVar).a);
        }
        if (!(ejqsVar instanceof ejqq)) {
            throw new ffcd();
        }
        if (ejsyVar instanceof ejst) {
            throw new ejta("Advanced from Idle to a failure with no intermediate state.");
        }
        if (ejsyVar instanceof ejss) {
            throw new ejta("Advanced from Failed to another failure with no intermediate state.");
        }
        if (ejsyVar instanceof ejsv) {
            return booleanValue ? new ejsv(((ejsv) ejsyVar).a) : new ejss(new ejsz(((ejqq) ejqsVar).a));
        }
        if (ejsyVar instanceof ejsu) {
            throw new ejta("Advanced from Read to a failure with no intermediate state.");
        }
        if (ejsyVar instanceof ejsx) {
            throw new ejta("Advanced from StaleRead to a failure with no intermediate state.");
        }
        if (!(ejsyVar instanceof ejsw)) {
            throw new ffcd();
        }
        if (!booleanValue) {
            return new ejsx(((ejsw) ejsyVar).a, new ejsz(((ejqq) ejqsVar).a));
        }
        ejsw ejswVar2 = (ejsw) ejsyVar;
        return new ejsw(ejswVar2.a, ejswVar2.b);
    }
}
