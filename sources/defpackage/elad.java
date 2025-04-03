package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elad extends elae implements elac {
    public static final elae a = new elad(null, new cpn(0)).f();
    static final elae b;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        elac b2 = elae.b();
        b2.a(elae.c, true);
        b = ((elae) b2).f();
    }

    public elad(elae elaeVar, cpn cpnVar) {
        super(elaeVar, cpnVar);
    }

    @Override // defpackage.elac
    public final void a(elab elabVar, Object obj) {
        emxf.m(!this.e, "Can't mutate after handing to trace");
        obj.getClass();
        emxf.m(!h(elabVar), "Key already present");
        this.d.put(elabVar, obj);
    }
}
