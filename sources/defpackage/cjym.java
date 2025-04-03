package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import j$.util.Optional;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cjym extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ apfz c;
    final /* synthetic */ cjyq d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cjym(apfz apfzVar, cjyq cjyqVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = apfzVar;
        this.d = cjyqVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cjym) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object a;
        Optional m;
        Object obj2;
        int i;
        ffhh ffhhVar = ffhh.a;
        int i2 = this.b;
        if (i2 == 0) {
            ffci.b(obj);
            engw s = this.c.s();
            ensk h = cjyq.b.h();
            h.Y(ente.a, "BugleProfiles");
            ((enrr) h.h("com/google/android/apps/messaging/shared/profile/transport/ProfileActionSenderImpl$shareProfileInfoToRecipientsIfEligible$1", "invokeSuspend", 74, "ProfileActionSenderImpl.kt")).q("Starting profile action sender: share");
            cjyq cjyqVar = this.d;
            apfz apfzVar = this.c;
            aqux g = apfzVar.g();
            ArrayList arrayList = new ArrayList();
            for (Object obj3 : s) {
                if (!ffkj.e(((ResolvedRecipient) obj3).g(), (g == null || (m = g.m()) == null) ? null : (aoku) fflm.b(m))) {
                    arrayList.add(obj3);
                }
            }
            cjso cjsoVar = cjyqVar.d;
            engw a2 = engq.a(arrayList);
            this.a = s;
            this.b = 1;
            a = cjsoVar.a(apfzVar, a2, null, this);
            obj2 = s;
            if (a == ffhhVar) {
                return ffhhVar;
            }
        } else {
            if (i2 != 1) {
                ffci.b(obj);
                i = 3;
                ((cjqi) this.d.f.b()).c(i);
                ensk h2 = cjyq.b.h();
                h2.Y(ente.a, "BugleProfiles");
                ((enrr) h2.h("com/google/android/apps/messaging/shared/profile/transport/ProfileActionSenderImpl$shareProfileInfoToRecipientsIfEligible$1", "invokeSuspend", 96, "ProfileActionSenderImpl.kt")).q("Finished profile action sender: share");
                return ffcu.a;
            }
            Object obj4 = this.a;
            ffci.b(obj);
            a = obj;
            obj2 = obj4;
        }
        cjwk cjwkVar = (cjwk) a;
        ((akzt) ((cjqi) this.d.f.b()).a.b()).e("Bugle.Profile.Share.Event.Count", cjwkVar.a.r);
        if (cjwkVar.a != cjwj.b) {
            ensk h3 = cjyq.b.h();
            h3.Y(ente.a, "BugleProfiles");
            ((enrr) h3.h("com/google/android/apps/messaging/shared/profile/transport/ProfileActionSenderImpl$shareProfileInfoToRecipientsIfEligible$1", "invokeSuspend", 85, "ProfileActionSenderImpl.kt")).t("Unable to share profile with recipients: %s", cjwkVar.a);
            return ffcu.a;
        }
        cjwl cjwlVar = cjwkVar.b;
        if (cjwlVar == null) {
            throw new IllegalStateException("Required value was null.");
        }
        if (!cjwlVar.h) {
            cjyq cjyqVar2 = this.d;
            this.a = null;
            i = 3;
            this.b = 3;
            if (cjyqVar2.f(cjwlVar, this) == ffhhVar) {
                return ffhhVar;
            }
            ((cjqi) this.d.f.b()).c(i);
            ensk h22 = cjyq.b.h();
            h22.Y(ente.a, "BugleProfiles");
            ((enrr) h22.h("com/google/android/apps/messaging/shared/profile/transport/ProfileActionSenderImpl$shareProfileInfoToRecipientsIfEligible$1", "invokeSuspend", 96, "ProfileActionSenderImpl.kt")).q("Finished profile action sender: share");
            return ffcu.a;
        }
        cjyq cjyqVar3 = this.d;
        obj2.getClass();
        azcr r = this.c.r();
        this.a = null;
        this.b = 2;
        if (cjyqVar3.g(cjwlVar, (engw) obj2, r, this) == ffhhVar) {
            return ffhhVar;
        }
        i = 3;
        ((cjqi) this.d.f.b()).c(i);
        ensk h222 = cjyq.b.h();
        h222.Y(ente.a, "BugleProfiles");
        ((enrr) h222.h("com/google/android/apps/messaging/shared/profile/transport/ProfileActionSenderImpl$shareProfileInfoToRecipientsIfEligible$1", "invokeSuspend", 96, "ProfileActionSenderImpl.kt")).q("Finished profile action sender: share");
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cjym(this.c, this.d, ffguVar);
    }
}
