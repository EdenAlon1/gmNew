package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cqdt {
    private final ffbr a;
    private final ffbr b;

    public cqdt(ffbr ffbrVar, ffbr ffbrVar2) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        this.a = ffbrVar;
        this.b = ffbrVar2;
    }

    public final Optional a() {
        boolean z;
        Object e = ((cfup) coxg.a.get()).e();
        try {
            z = Boolean.valueOf(((cqdv) ((cqek) this.b.b()).g.l()).g);
        } catch (eygu unused) {
            z = false;
        }
        if (ffkj.e(e, z)) {
            return (!(((Boolean) ((cfup) coxg.a.get()).e()).booleanValue() && ((cqek) this.b.b()).c() && !((coxg) this.a.b()).u()) && (((Boolean) ((cfup) coxg.a.get()).e()).booleanValue() || !((cqek) this.b.b()).c())) ? Optional.empty() : Optional.of(eqqh.APP_STARTUP_RESUME_SYNC);
        }
        ((cqek) this.b.b()).g.m(new emwl() { // from class: cqee
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cfup cfupVar = cqek.a;
                cqdu cqduVar = (cqdu) ((cqdv) obj).toBuilder();
                boolean booleanValue = ((Boolean) ((cfup) coxg.a.get()).e()).booleanValue();
                cqduVar.copyOnWrite();
                cqdv cqdvVar = (cqdv) cqduVar.instance;
                cqdvVar.b |= 16;
                cqdvVar.g = booleanValue;
                return (cqdv) cqduVar.build();
            }
        });
        return Optional.of(eqqh.REDESIGN_FLAG_FLIP);
    }
}
