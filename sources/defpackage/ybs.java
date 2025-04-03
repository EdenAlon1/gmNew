package defpackage;

import j$.time.Instant;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ybs extends ffhv implements ffjm {
    int a;
    final /* synthetic */ Instant b;
    final /* synthetic */ ybt c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ybs(Instant instant, ybt ybtVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = instant;
        this.c = ybtVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ybs) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ensk h = ybt.a.h();
            h.Y(ente.a, "BugleComposeRow2");
            ((enrr) h.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/data/ComposeRowStateParser$setLastAcceptedDraftTimestamp$2", "invokeSuspend", 153, "ComposeRowStateParser.kt")).s("ComposeRowStateParser#setLastAcceptedDraftTimestamp: setting last accepted draft timestamp: %d", this.b.toEpochMilli());
            Object b = this.c.d.b();
            b.getClass();
            comc comcVar = (comc) fflm.b((Optional) b);
            if (comcVar == null) {
                return null;
            }
            final Instant instant = this.b;
            ffji ffjiVar = new ffji() { // from class: ybr
                @Override // defpackage.ffji
                public final Object invoke(Object obj2) {
                    ycp ycpVar = (ycp) ((ycq) obj2).toBuilder();
                    eyja b2 = eykn.b(Instant.this);
                    ycpVar.copyOnWrite();
                    ycq ycqVar = (ycq) ycpVar.instance;
                    ycqVar.c = b2;
                    ycqVar.b |= 1;
                    eyfy build = ycpVar.build();
                    build.getClass();
                    return (ycq) build;
                }
            };
            this.a = 1;
            obj = comcVar.d(ffjiVar, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        return (ycq) obj;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ybs(this.b, this.c, ffguVar);
    }
}
