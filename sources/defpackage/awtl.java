package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awtl implements avkj {
    private final enhk a;
    private final ffbr b;

    public awtl(Map map, ffbr ffbrVar) {
        this.a = enhk.j(map);
        this.b = ffbrVar;
    }

    private final avkj h() {
        eqna d = ((crgh) this.b.b()).d();
        ffbr ffbrVar = (ffbr) this.a.get(d);
        if (ffbrVar != null) {
            return (avkj) ffbrVar.b();
        }
        throw new IllegalStateException("Do not have an OutgoingChatApi implementation registered for ChatTransportType: ".concat(String.valueOf(d.name())));
    }

    @Override // defpackage.avkj
    public final elfl a(awtv awtvVar) {
        return h().a(awtvVar);
    }

    @Override // defpackage.avkj
    public final elfl b(awuw awuwVar) {
        return h().b(awuwVar);
    }

    @Override // defpackage.avkj
    public final elfl c(awyl awylVar) {
        return h().c(awylVar);
    }

    @Override // defpackage.avkj
    public final elfl d(awyr awyrVar) {
        return h().d(awyrVar);
    }

    @Override // defpackage.avkj
    public final elfl e(awyz awyzVar) {
        return h().e(awyzVar);
    }

    @Override // defpackage.avkj
    public final elfl f(axaj axajVar) {
        return h().f(axajVar);
    }

    @Override // defpackage.avkj
    public final elfl g(axaq axaqVar) {
        return h().g(axaqVar);
    }
}
