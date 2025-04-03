package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class abcn extends ffhv implements ffjo {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;
    final /* synthetic */ alxr d;
    final /* synthetic */ boolean e;
    final /* synthetic */ abco f;
    final /* synthetic */ boolean g;
    final /* synthetic */ boolean h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abcn(alxr alxrVar, boolean z, abco abcoVar, boolean z2, boolean z3, ffgu ffguVar) {
        super(4, ffguVar);
        this.d = alxrVar;
        this.e = z;
        this.f = abcoVar;
        this.g = z2;
        this.h = z3;
    }

    @Override // defpackage.ffjo
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        abcn abcnVar = new abcn(this.d, this.e, this.f, this.g, this.h, (ffgu) obj4);
        abcnVar.a = (alxj) obj;
        abcnVar.b = (xit) obj2;
        abcnVar.c = (aqux) obj3;
        return abcnVar.b(ffcu.a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, xit] */
    /* JADX WARN: Type inference failed for: r14v1, types: [alxj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [aqux, java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ?? r14 = this.a;
        ?? r0 = this.b;
        ?? r1 = this.c;
        boolean z = true;
        boolean z2 = this.d.a() == alxq.b || (this.e && abco.f(this.d));
        boolean z3 = this.g && abco.f(this.d);
        boolean z4 = this.d.a() == alxq.b && r14.b() == alxi.GROUP;
        if (this.d.B() != 3) {
            ensk e = abco.a.e();
            e.Y(ente.a, "BugleReplies");
            ((enrr) e.h("com/google/android/apps/messaging/conversation2/replies/ReplyReactConditionsValidatorImpl$createCanReplyReactFlow$4", "invokeSuspend", 164, "ReplyReactConditionsValidatorImpl.kt")).q("Can't reply/react reason: message is not interactable");
        } else {
            alxi b = r14.b();
            b.getClass();
            if (!abco.d(b)) {
                ensk e2 = abco.a.e();
                e2.Y(ente.a, "BugleReplies");
                ((enrr) e2.h("com/google/android/apps/messaging/conversation2/replies/ReplyReactConditionsValidatorImpl$createCanReplyReactFlow$4", "invokeSuspend", 169, "ReplyReactConditionsValidatorImpl.kt")).t("Can't reply/react reason: conversation kind (%s) does not allow replies", r14.b().toString());
            } else if (r0 == 0) {
                ensk e3 = abco.a.e();
                e3.Y(ente.a, "BugleReplies");
                ((enrr) e3.h("com/google/android/apps/messaging/conversation2/replies/ReplyReactConditionsValidatorImpl$createCanReplyReactFlow$4", "invokeSuspend", 175, "ReplyReactConditionsValidatorImpl.kt")).q("Can't reply/react reason: compose is disabled");
            } else if ((this.f.b.a() || this.h) && !r0.c()) {
                ensk e4 = abco.a.e();
                e4.Y(ente.a, "BugleReplies");
                ((enrr) e4.h("com/google/android/apps/messaging/conversation2/replies/ReplyReactConditionsValidatorImpl$createCanReplyReactFlow$4", "invokeSuspend", 181, "ReplyReactConditionsValidatorImpl.kt")).q("Can't reply/react reason: valid self identity required but not found");
            } else {
                if (!this.f.b.a() || z4 || abco.e(this.d, r1)) {
                    if ((!r0.u() || !z2) && !z3) {
                        ensk e5 = abco.a.e();
                        e5.Y(ente.a, "BugleReplies");
                        ((enrr) e5.h("com/google/android/apps/messaging/conversation2/replies/ReplyReactConditionsValidatorImpl$createCanReplyReactFlow$4", "invokeSuspend", 196, "ReplyReactConditionsValidatorImpl.kt")).q("Can't reply/react reason: replies not supported");
                    }
                    return Boolean.valueOf(z);
                }
                ensk e6 = abco.a.e();
                e6.Y(ente.a, "BugleReplies");
                ((enrr) e6.h("com/google/android/apps/messaging/conversation2/replies/ReplyReactConditionsValidatorImpl$createCanReplyReactFlow$4", "invokeSuspend", 188, "ReplyReactConditionsValidatorImpl.kt")).q("Can't reply/react reason: message has different self identity");
            }
        }
        z = false;
        return Boolean.valueOf(z);
    }
}
