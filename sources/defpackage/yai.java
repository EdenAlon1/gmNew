package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yai extends ffhv implements ffjm {
    int a;
    final /* synthetic */ xhl b;
    final /* synthetic */ yak c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yai(ffgu ffguVar, xhl xhlVar, yak yakVar) {
        super(2, ffguVar);
        this.b = xhlVar;
        this.c = yakVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((yai) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        yai yaiVar;
        ffhh ffhhVar = ffhh.a;
        if (this.a != 0) {
            ffci.b(obj);
            yaiVar = this;
        } else {
            ffci.b(obj);
            ensk e = yak.a.e();
            e.Y(ente.a, "BugleComposeRow2");
            ((enrr) e.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/attachment/processor/HugoAttachmentResolver$process$$inlined$withLegacyPropagatingContext$1", "invokeSuspend", 30, "HugoAttachmentResolver.kt")).t("Resolving %s", this.b);
            yak yakVar = this.c;
            xhl xhlVar = this.b;
            yaj yajVar = new yaj(xhlVar);
            this.a = 1;
            yaiVar = this;
            obj = yakVar.c.c(xhlVar.c, xhlVar.e, true, yajVar, yaiVar);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        doxs doxsVar = (doxs) obj;
        if (doxsVar == null) {
            xhl xhlVar2 = yaiVar.b;
            Objects.toString(xhlVar2);
            throw new IllegalStateException("Hugo is unable to resolve ".concat(String.valueOf(xhlVar2)));
        }
        if (doxsVar instanceof doyc) {
            return doxsVar;
        }
        Objects.toString(doxsVar);
        throw new IllegalStateException("Expected a resolved LocalAttachment but got ".concat(doxsVar.toString()));
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        yai yaiVar = new yai(ffguVar, this.b, this.c);
        yaiVar.d = obj;
        return yaiVar;
    }
}
