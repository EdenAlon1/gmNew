package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class abcm extends ffhv implements ffjp {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;
    /* synthetic */ Object d;
    final /* synthetic */ alxr e;
    final /* synthetic */ boolean f;
    final /* synthetic */ abco g;
    final /* synthetic */ boolean h;
    final /* synthetic */ boolean i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abcm(alxr alxrVar, boolean z, abco abcoVar, boolean z2, boolean z3, ffgu ffguVar) {
        super(5, ffguVar);
        this.e = alxrVar;
        this.f = z;
        this.g = abcoVar;
        this.h = z2;
        this.i = z3;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, xit] */
    /* JADX WARN: Type inference failed for: r15v1, types: [alxj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Iterable, java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v0, types: [aqux, java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ?? r15 = this.a;
        ?? r0 = this.b;
        ?? r1 = this.c;
        ?? r2 = this.d;
        boolean z = true;
        boolean z2 = this.e.a() == alxq.b || (this.f && abco.f(this.e));
        boolean z3 = this.h && abco.f(this.e);
        boolean z4 = this.e.a() == alxq.b && r15.b() == alxi.GROUP;
        if (!(r1 instanceof Collection) || !r1.isEmpty()) {
            Iterator it = r1.iterator();
            while (it.hasNext()) {
                aoku g = ((ResolvedRecipient) it.next()).g();
                if (g.t() || g.D()) {
                    ensk e = abco.a.e();
                    e.Y(ente.a, "BugleReplies");
                    ((enrr) e.h("com/google/android/apps/messaging/conversation2/replies/ReplyReactConditionsValidatorImpl$createCanReplyReactFlow$2", "invokeSuspend", 105, "ReplyReactConditionsValidatorImpl.kt")).q("Can't reply/react reason: short code");
                    break;
                }
            }
        }
        if (this.e.B() != 3) {
            ensk e2 = abco.a.e();
            e2.Y(ente.a, "BugleReplies");
            ((enrr) e2.h("com/google/android/apps/messaging/conversation2/replies/ReplyReactConditionsValidatorImpl$createCanReplyReactFlow$2", "invokeSuspend", 108, "ReplyReactConditionsValidatorImpl.kt")).q("Can't reply/react reason: message is not interactable");
        } else {
            alxi b = r15.b();
            b.getClass();
            if (!abco.d(b)) {
                ensk e3 = abco.a.e();
                e3.Y(ente.a, "BugleReplies");
                ((enrr) e3.h("com/google/android/apps/messaging/conversation2/replies/ReplyReactConditionsValidatorImpl$createCanReplyReactFlow$2", "invokeSuspend", 113, "ReplyReactConditionsValidatorImpl.kt")).t("Can't reply/react reason: conversation kind (%s) does not allow replies", r15.b().toString());
            } else if (r0 == 0) {
                ensk e4 = abco.a.e();
                e4.Y(ente.a, "BugleReplies");
                ((enrr) e4.h("com/google/android/apps/messaging/conversation2/replies/ReplyReactConditionsValidatorImpl$createCanReplyReactFlow$2", "invokeSuspend", 119, "ReplyReactConditionsValidatorImpl.kt")).q("Can't reply/react reason: compose is disabled");
            } else if ((this.g.b.a() || this.i) && !r0.c()) {
                ensk e5 = abco.a.e();
                e5.Y(ente.a, "BugleReplies");
                ((enrr) e5.h("com/google/android/apps/messaging/conversation2/replies/ReplyReactConditionsValidatorImpl$createCanReplyReactFlow$2", "invokeSuspend", 127, "ReplyReactConditionsValidatorImpl.kt")).q("Can't reply/react reason: valid self identity required but not found");
            } else {
                if (!this.g.b.a() || z4 || abco.e(this.e, r2)) {
                    if ((!r0.u() || !z2) && !z3) {
                        ensk e6 = abco.a.e();
                        e6.Y(ente.a, "BugleReplies");
                        ((enrr) e6.h("com/google/android/apps/messaging/conversation2/replies/ReplyReactConditionsValidatorImpl$createCanReplyReactFlow$2", "invokeSuspend", 142, "ReplyReactConditionsValidatorImpl.kt")).q("Can't reply/react reason: replies not supported");
                    }
                    return Boolean.valueOf(z);
                }
                ensk e7 = abco.a.e();
                e7.Y(ente.a, "BugleReplies");
                ((enrr) e7.h("com/google/android/apps/messaging/conversation2/replies/ReplyReactConditionsValidatorImpl$createCanReplyReactFlow$2", "invokeSuspend", 134, "ReplyReactConditionsValidatorImpl.kt")).q("Can't reply/react reason: message has different self identity");
            }
        }
        z = false;
        return Boolean.valueOf(z);
    }

    @Override // defpackage.ffjp
    public final /* bridge */ /* synthetic */ Object f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        abcm abcmVar = new abcm(this.e, this.f, this.g, this.h, this.i, (ffgu) obj5);
        abcmVar.a = (alxj) obj;
        abcmVar.b = (xit) obj2;
        abcmVar.c = (engw) obj3;
        abcmVar.d = (aqux) obj4;
        return abcmVar.b(ffcu.a);
    }
}
