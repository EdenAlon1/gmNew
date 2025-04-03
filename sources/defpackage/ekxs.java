package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes5.dex */
abstract class ekxs extends ekwf {
    private final elae a;

    public ekxs(String str, elat elatVar, elae elaeVar, elao elaoVar) {
        super(str, elatVar, elaoVar);
        emxf.a(elaeVar.e);
        this.a = elaeVar;
    }

    @Override // defpackage.elat
    public elaa i(elab elabVar) {
        return elae.j(elabVar, j());
    }

    @Override // defpackage.elat
    public final elae j() {
        return elae.e(this.a, l());
    }

    public ekxs(String str, UUID uuid, elae elaeVar, elao elaoVar) {
        super(str, uuid, elaoVar);
        emxf.a(elaeVar.e);
        this.a = elaeVar;
    }
}
